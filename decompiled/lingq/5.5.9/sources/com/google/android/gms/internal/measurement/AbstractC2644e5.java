package com.google.android.gms.internal.measurement;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2644e5 extends AbstractC2728k5 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f14169b;

    /* JADX INFO: renamed from: c */
    public int f14170c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AbstractC2644e5(int i10, int i11) {
        super(0);
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException(C2912y4.m8437c("index", i11, i10));
        }
        this.f14169b = i10;
        this.f14170c = i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        m7769b(obj);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    /* JADX INFO: renamed from: b */
    public final void m7769b(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    /* JADX INFO: renamed from: c */
    public final void m7770c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f14170c < this.f14169b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14170c > 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2728k5, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f14170c;
        this.f14170c = i10 + 1;
        return ((C2686h5) this).f14230d.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14170c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f14170c - 1;
        this.f14170c = i10;
        return ((C2686h5) this).f14230d.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14170c - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        m7770c(obj);
        throw null;
    }
}
