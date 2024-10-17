package org.taulin.engine.objects.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ProjectilePool implements AutoCloseable {
    private static final long INTERVAL_BETWEEN_SHOTS = 200L;

    private final ExecutorService executorService;
    private Long timeLastShot;
    private final List<Projectile> projectiles;

    public ProjectilePool() {
        executorService = Executors.newCachedThreadPool();
        projectiles = Collections.synchronizedList(new ArrayList<>());
    }

    public boolean shoot(int beginY, int beginX) {
        if (Objects.nonNull(timeLastShot) && getCurrentTimeDifferenceInMillis(timeLastShot) <= INTERVAL_BETWEEN_SHOTS) {
            return false;
        }

        timeLastShot = System.currentTimeMillis();

        executorService.submit(() -> {
            // TODO: Implement logic for creating and moving projectile
        });

        return true;
    }

    private static long getCurrentTimeDifferenceInMillis(long lastTime) {
        return System.currentTimeMillis() - lastTime;
    }

    @Override
    public void close() throws Exception {
        executorService.shutdownNow();
        if (executorService.awaitTermination(3, TimeUnit.SECONDS)) {
            // TODO: Add log4j log here
        }
    }
}
