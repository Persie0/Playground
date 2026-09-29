package com.google.common.collect;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.google.common.collect.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3176a<E> extends AbstractC3187f0<Object> implements ListIterator<Object> {

    /* JADX INFO: renamed from: a */
    public final int f16143a;

    /* JADX INFO: renamed from: b */
    public int f16144b;

    public AbstractC3176a(int i10, int i11) {
        C8573r0.m16687N(i11, i10);
        this.f16143a = i10;
        this.f16144b = i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    /* JADX INFO: renamed from: a */
    public final void m9121a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        m9121a(obj);
        throw null;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public final void m9122b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f16144b < this.f16143a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16144b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f16144b;
        this.f16144b = i10 + 1;
        return ((ImmutableList.C3147b) this).f16048c.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16144b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f16144b - 1;
        this.f16144b = i10;
        return ((ImmutableList.C3147b) this).f16048c.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16144b - 1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        m9122b(obj);
        throw null;
    }
}
