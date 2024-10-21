package org.taulin.engine.objects.impl;

import org.taulin.engine.objects.Drawable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ProjectilePool implements AutoCloseable, Drawable {
    private static final long INTERVAL_BETWEEN_SHOTS = 500L;
    private static final long PROJECTILE_ANIMATION_INTERVAL = 200L;

    private final Board board;
    private final ExecutorService executorService;
    private final List<Projectile> projectiles;
    private Long timeLastShot;

    public ProjectilePool(Board board) {
        this.board = board;
        executorService = Executors.newCachedThreadPool();
        projectiles = Collections.synchronizedList(new ArrayList<>());
    }

    @Override
    public void draw() {
        projectiles.forEach(Projectile::draw);
    }

    public boolean shoot(int beginY, int beginX) {
        if (Objects.nonNull(timeLastShot) && getCurrentTimeDifferenceInMillis(timeLastShot) <= INTERVAL_BETWEEN_SHOTS) {
            return false;
        }

        timeLastShot = System.currentTimeMillis();
        final Projectile projectile = new Projectile(board, beginY, beginX);
        projectiles.add(projectile);

        executorService.submit(() -> {
            while (projectile.canMoveUp()) {
                projectile.up();
                animationInterval();
            }

            projectiles.remove(projectile);
        });

        return true;
    }

    private static long getCurrentTimeDifferenceInMillis(long lastTime) {
        return System.currentTimeMillis() - lastTime;
    }

    private static void animationInterval() {
        try {
            Thread.sleep(PROJECTILE_ANIMATION_INTERVAL);
        } catch (InterruptedException e) {
            System.err.println("Failed applying interval to projectile animation");
        }
    }

    @Override
    public void close() throws Exception {
        executorService.shutdownNow();
        if (executorService.awaitTermination(3, TimeUnit.SECONDS)) {
            System.out.println("Shutdown projectile pool gracefully");
        }
    }
}
