package org.taulin.engine.objects.impl;

import org.taulin.bindings.ncurses.NCurses;
import org.taulin.engine.objects.Drawable;
import org.taulin.engine.objects.Movable;

public class Glyph implements Drawable, Movable {
    private final Board board;
    private int y;
    private int x;
    private final char charToDraw;

    public Glyph(Board board, int y, int x, char charToDraw) {
        this.board = board;
        this.y = y;
        this.x = x;
        this.charToDraw = charToDraw;
    }

    @Override
    public void draw() {
        NCurses.mvwaddch(board.getWindowRef(), y, x, charToDraw);
    }

    @Override
    public void refresh() {
        // DO NOTHING
    }

    @Override
    public void close() throws Exception {
        // DO NOTHING
    }

    @Override
    public boolean canMoveUp() {
        return y > 1;
    }

    @Override
    public void up() {
        if (!canMoveUp()) return;

        y--;
    }

    @Override
    public boolean canMoveDown() {
        return y < (board.getHeight() - 1);
    }

    @Override
    public void down() {
        if (!canMoveDown()) return;

        y++;
    }

    @Override
    public boolean canMoveLeft() {
        return x > 1;
    }

    @Override
    public void left() {
        if (!canMoveLeft()) return;

        x--;
    }

    @Override
    public boolean canMoveRight() {
        return x < (board.getWidth() - 1);
    }

    @Override
    public void right() {
        if (!canMoveRight()) return;

        x++;
    }
}