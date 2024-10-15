package org.taulin;

import org.taulin.bindings.ncurses.NCurses;
import org.taulin.engine.Board;
import org.taulin.engine.Glyph;

public class Main {
    private static final int BOARD_DIMENSION = 20;
    private static final int BOARD_ROWS = BOARD_DIMENSION;
    private static final int BOARD_COLUMNS = (int) (BOARD_DIMENSION * 2.5);
    private static final int BEGIN_Y = 0;
    private static final int BEGIN_X = 40;
    private static final short FOREGROUND_COLOR = (short) NCurses.COLOR_WHITE();
    private static final short BACKGROUND_COLOR = (short) NCurses.COLOR_BLACK();

    public static void main(String[] args) {
        // bootstrap ncurses and add color support
        NCurses.initscr();
        NCurses.start_color();
        NCurses.refresh();

        // Game logic
        Board gameBoard = new Board(BOARD_ROWS, BOARD_COLUMNS, BEGIN_Y, BEGIN_X, FOREGROUND_COLOR,
                BACKGROUND_COLOR);
        gameBoard.draw();

        Glyph glyph = new Glyph(gameBoard, 5, 5, '#');
        glyph.draw();

        gameBoard.refresh();

        // Wait for user input
        NCurses.getch();

        // Close ncurses
        NCurses.endwin();
    }
}