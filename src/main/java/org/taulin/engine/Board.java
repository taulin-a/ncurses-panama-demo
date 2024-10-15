package org.taulin.engine;

import org.taulin.bindings.ncurses.NCurses;

import java.lang.foreign.MemorySegment;
import java.util.Objects;

public class Board implements Drawable {
    private final int height;
    private final int width;
    private final int beginY;
    private final int beginX;
    private final short foregroundColor;
    private final short backgroundColor;
    private MemorySegment windowRef;

    public Board(int height, int width, int beginY, int beginX, short foregroundColor, short backgroundColor) {
        this.height = height;
        this.width = width;
        this.beginY = beginY;
        this.beginX = beginX;
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
    }

    public void draw() {
        initWindow();
        addBorder();
        setColors();
        refresh();
    }

    private void initWindow() {
        if (Objects.nonNull(windowRef)) return;

        windowRef = NCurses.newwin(height, width, beginY, beginX);
    }

    private void addBorder() {
        NCurses.box(windowRef, 0, 0);
    }

    private void setColors() {
        NCurses.init_pair((short) 1, foregroundColor, backgroundColor);
        NCurses.wbkgdset(windowRef, NCurses.COLOR_PAIR(1));
    }

    @Override
    public void refresh() {
        if (Objects.isNull(windowRef)) {
            throw new IllegalStateException("Board must first be drawn to be refreshed");
        }

        NCurses.wrefresh(windowRef);
    }

    @Override
    public void close() throws Exception {
        if (Objects.isNull(windowRef)) {
            throw new IllegalStateException("Board wasn't initialized");
        }

        NCurses.wclear(windowRef);
    }

    public MemorySegment getWindowRef() {
        if (Objects.isNull(windowRef)) return null;

        return MemorySegment.ofAddress(windowRef.address());
    }
}
