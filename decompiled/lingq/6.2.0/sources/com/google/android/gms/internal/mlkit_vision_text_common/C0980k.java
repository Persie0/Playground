package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractList;
import java.util.ListIterator;
import p000.m9a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C0980k extends m9a implements ListIterator {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f12048c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractList f12049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0980k(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator, 1);
        this.f12048c = i;
        this.f12049d = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.m9a
    /* JADX INFO: renamed from: b */
    public final Object mo5476b(Object obj) {
        int i = this.f12048c;
        AbstractList abstractList = this.f12049d;
        switch (i) {
            case 0:
                return ((zzbr) abstractList).f12093b.mo4203h(obj);
            default:
                return ((zzbt) abstractList).f12095b.mo4203h(obj);
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f50820b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f50820b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo5476b(((ListIterator) this.f50820b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f50820b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
