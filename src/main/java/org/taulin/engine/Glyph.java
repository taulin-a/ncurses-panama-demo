package org.taulin.engine;

import org.taulin.bindings.ncurses.NCurses;

public class Glyph implements Drawable {
    private final Board board;
    private final int y;
    private final int x;
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
}