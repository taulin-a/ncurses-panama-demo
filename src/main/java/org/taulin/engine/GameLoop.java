package org.taulin.engine;

import org.taulin.bindings.ncurses.NCurses;
import org.taulin.engine.objects.impl.Board;
import org.taulin.engine.objects.impl.SpaceShip;

public class GameLoop implements AutoCloseable {
    private static final int BOARD_DIMENSION = 20;
    private static final int BOARD_ROWS = BOARD_DIMENSION;
    private static final int BOARD_COLUMNS = (int) (BOARD_DIMENSION * 2.5);
    private static final int BEGIN_Y = 0;
    private static final int BEGIN_X = 40;
    private static final short FOREGROUND_COLOR = (short) NCurses.COLOR_WHITE();
    private static final short BACKGROUND_COLOR = (short) NCurses.COLOR_BLACK();

    private final Board board;
    private final SpaceShip spaceShip;
    private boolean gameOver = false;

    public GameLoop() {
        this.board = new Board(BOARD_ROWS, BOARD_COLUMNS, BEGIN_Y, BEGIN_X, FOREGROUND_COLOR,
                BACKGROUND_COLOR);
        this.spaceShip = new SpaceShip(board);
    }

    public void run() {
        initWindow();

        while (!gameOver) {
            board.clear();
            board.draw();
            spaceShip.draw();
            spaceShip.processInput();
            board.refresh();
        }

        closeWindow();
    }

    private static void initWindow() {
        // bootstrap ncurses and add color support
        NCurses.initscr();
        NCurses.refresh();
        NCurses.noecho();
        NCurses.curs_set(0);
        NCurses.start_color();
    }

    private static void closeWindow() {
        // Close ncurses
        NCurses.endwin();
    }

    @Override
    public void close() throws Exception {
        // TODO: Implement logic for closing resources
    }
}
