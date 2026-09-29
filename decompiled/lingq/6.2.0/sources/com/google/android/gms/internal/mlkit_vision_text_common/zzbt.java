package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p000.lkd;

/* JADX INFO: loaded from: classes2.dex */
final class zzbt extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a */
    public final List f12094a;

    /* JADX INFO: renamed from: b */
    public final lkd f12095b;

    public zzbt(List list, lkd lkdVar) {
        list.getClass();
        this.f12094a = list;
        this.f12095b = lkdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f12094a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0980k(this, this.f12094a.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f12094a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12094a.size();
    }
}
