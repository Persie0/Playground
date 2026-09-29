package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
enum Iterators$EmptyModifiableIterator implements Iterator<Object> {
    INSTANCE;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        C8573r0.m16697S("no calls to next() since the last call to remove()", false);
    }
}
