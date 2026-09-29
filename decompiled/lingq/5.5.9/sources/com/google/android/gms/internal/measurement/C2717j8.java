package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2717j8 implements ListIterator {

    /* JADX INFO: renamed from: a */
    public final ListIterator f14272a;

    public C2717j8(C2745l8 c2745l8, int i10) {
        this.f14272a = c2745l8.f14300a.listIterator(i10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14272a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14272a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f14272a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14272a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f14272a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14272a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
