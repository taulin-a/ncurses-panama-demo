package org.taulin.engine.objects.impl;

import org.taulin.engine.objects.Drawable;
import org.taulin.engine.objects.Movable;

public class Projectile implements Drawable, Movable {
    private static final char PROJECTILE_CHAR = 'o';

    private final Glyph glyph;
    private final boolean running = false;

    public Projectile(Board board, int beginY, int beginX) {
        glyph = new Glyph(board, beginY, beginX, PROJECTILE_CHAR);
    }

    @Override
    public void draw() {
        glyph.draw();
    }

    @Override
    public boolean canMoveUp() {
        return glyph.canMoveUp();
    }

    @Override
    public void up() {
        glyph.up();
    }

    @Override
    public boolean canMoveDown() {
        return false;
    }

    @Override
    public void down() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean canMoveLeft() {
        return false;
    }

    @Override
    public void left() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean canMoveRight() {
        return false;
    }

    @Override
    public void right() {
        throw new UnsupportedOperationException();
    }
}
