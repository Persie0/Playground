package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p000.gj3;

/* JADX INFO: loaded from: classes2.dex */
class Lists$TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final List f13411a;

    /* JADX INFO: renamed from: b */
    public final gj3 f13412b;

    public Lists$TransformingSequentialList(List list, gj3 gj3Var) {
        list.getClass();
        this.f13411a = list;
        this.f13412b = gj3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f13411a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C1101q(this, this.f13411a.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f13411a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13411a.size();
    }
}
