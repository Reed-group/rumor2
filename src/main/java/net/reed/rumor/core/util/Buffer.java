package net.reed.rumor.core.util;

import java.lang.reflect.Array;

public abstract class Buffer {
    int size = 1;
    Class<?> typeg;

    public Object reconstruct(Class<?> type, Object base) {
        Object ar = Array.newInstance(type, size);
        for (int i = 0; i < Math.min(Array.getLength(base), size); i++) {
            Array.set(ar, i, Array.get(base, i));
        }
        return ar;
    }

    public Object grow(int increment, Object buffer) {
        size += increment;
        return this.reconstruct(typeg, buffer);
    }
}

