package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000.lkd;

/* JADX INFO: loaded from: classes2.dex */
final class zzbr extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public final List f12092a;

    /* JADX INFO: renamed from: b */
    public final lkd f12093b;

    public zzbr(List list, lkd lkdVar) {
        list.getClass();
        this.f12092a = list;
        this.f12093b = lkdVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f12093b.mo4203h(this.f12092a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f12092a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0980k(this, this.f12092a.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f12093b.mo4203h(this.f12092a.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f12092a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12092a.size();
    }
}
