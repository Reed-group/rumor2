package net.reed.rumor.core.util;

import net.reed.rumor.core.Init;

public class InitBuf extends Buffer {
    Init[] buf = new Init[this.size];

    public InitBuf(int s) {
        this.size = s;
        this.typeg = Init.class;
    }

    public void grow(int increment) {
        buf = (Init[]) grow(increment, buf);
    }

    public void add(Init f) {
        this.grow(1);
        buf[this.size-1] = f;
    }

    public void addAtIndex(Init f, int index) {
        buf[index] = f; // full trust
    }

    public Init[] array() {
        return buf;
    }
}
