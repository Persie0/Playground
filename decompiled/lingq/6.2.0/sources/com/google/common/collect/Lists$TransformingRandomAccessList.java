package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000.gj3;

/* JADX INFO: loaded from: classes2.dex */
class Lists$TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public final List f13409a;

    /* JADX INFO: renamed from: b */
    public final gj3 f13410b;

    public Lists$TransformingRandomAccessList(List list, gj3 gj3Var) {
        list.getClass();
        this.f13409a = list;
        this.f13410b = gj3Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f13410b.apply(this.f13409a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f13409a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C1101q(this, this.f13409a.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f13410b.apply(this.f13409a.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f13409a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13409a.size();
    }
}
