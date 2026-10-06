package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nba extends naz implements ListIterator {

    /* JADX INFO: renamed from: a */
    private final int f41930a;

    /* JADX INFO: renamed from: b */
    private int f41931b;

    protected nba(int i, int i2) {
        lku.m15621P(i2, i);
        this.f41930a = i;
        this.f41931b = i2;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo17085a(int i);

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f41931b < this.f41930a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41931b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f41931b;
        this.f41931b = i + 1;
        return mo17085a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41931b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f41931b - 1;
        this.f41931b = i;
        return mo17085a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41931b - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
