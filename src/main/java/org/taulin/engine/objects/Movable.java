package org.taulin.engine.objects;

public interface Movable {
    boolean canMoveUp();

    void up();

    boolean canMoveDown();

    void down();

    boolean canMoveLeft();

    void left();

    boolean canMoveRight();

    void right();
}
