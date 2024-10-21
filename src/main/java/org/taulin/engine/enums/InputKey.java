package org.taulin.engine.enums;

import lombok.Getter;
import org.taulin.bindings.ncurses.NCurses;

import java.util.Arrays;

public enum InputKey {
    KEY_UP(NCurses.KEY_UP()),
    KEY_DOWN(NCurses.KEY_DOWN()),
    KEY_LEFT(NCurses.KEY_LEFT()),
    KEY_RIGHT(NCurses.KEY_RIGHT()),
    SPACE_BAR(' ');

    @Getter
    private final int keyCode;

    InputKey(int keyCode) {
        this.keyCode = keyCode;
    }

    public static InputKey ofCode(int code) {
        return Arrays.stream(values())
                .filter(i -> i.getKeyCode() == code)
                .findFirst()
                .orElse(null);
    }
}
