package org.taulin.engine.enums;

import org.taulin.bindings.ncurses.NCurses;

import java.util.Arrays;

public enum InputKey {
    KEY_UP(NCurses.KEY_UP()),
    KEY_DOWN(NCurses.KEY_DOWN()),
    KEY_LEFT(NCurses.KEY_LEFT()),
    KEY_RIGHT(NCurses.KEY_RIGHT()),
    SPACE_BAR(' ');

    private final int keyCode;

    InputKey(int keyCode) {
        this.keyCode = keyCode;
    }

    public int geyKeyCode() {
        return keyCode;
    }

    public static InputKey ofCode(int code) {
        return Arrays.stream(values())
                .filter(i -> i.geyKeyCode() == code)
                .findFirst()
                .orElse(null);
    }
}
