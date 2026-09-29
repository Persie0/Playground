package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p000.bna;

/* JADX INFO: loaded from: classes2.dex */
enum Iterators$EmptyModifiableIterator implements Iterator<Object> {
    INSTANCE;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        bna.m3985y("no calls to next() since the last call to remove()", false);
    }
}
