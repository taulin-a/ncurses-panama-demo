package org.taulin.engine.objects;

public interface Drawable extends AutoCloseable {
    void draw();

    void refresh();
}
