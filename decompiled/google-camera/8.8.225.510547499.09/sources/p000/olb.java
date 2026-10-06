package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class olb implements ListIterator {

    /* JADX INFO: renamed from: a */
    private final olc f46228a;

    /* JADX INFO: renamed from: b */
    private int f46229b;

    /* JADX INFO: renamed from: c */
    private int f46230c = -1;

    public olb(olc olcVar, int i) {
        this.f46228a = olcVar;
        this.f46229b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        olc olcVar = this.f46228a;
        int i = this.f46229b;
        this.f46229b = i + 1;
        olcVar.add(i, obj);
        this.f46230c = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f46229b < this.f46228a.f46233c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f46229b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f46229b;
        olc olcVar = this.f46228a;
        if (i >= olcVar.f46233c) {
            throw new NoSuchElementException();
        }
        this.f46229b = i + 1;
        this.f46230c = i;
        return olcVar.f46231a[olcVar.f46232b + i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f46229b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f46229b;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i2 = i - 1;
        this.f46229b = i2;
        this.f46230c = i2;
        olc olcVar = this.f46228a;
        return olcVar.f46231a[olcVar.f46232b + i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f46229b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f46230c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        this.f46228a.mo18595b(i);
        this.f46229b = this.f46230c;
        this.f46230c = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f46230c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.f46228a.set(i, obj);
    }
}
