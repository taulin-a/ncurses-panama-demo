package org.taulin.engine;

public interface Drawable extends AutoCloseable {
    void draw();

    void refresh();
}
