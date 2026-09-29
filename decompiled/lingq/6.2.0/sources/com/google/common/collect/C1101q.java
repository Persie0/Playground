package com.google.common.collect;

import java.util.AbstractList;
import java.util.ListIterator;
import p000.m9a;

/* JADX INFO: renamed from: com.google.common.collect.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C1101q extends m9a implements ListIterator {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f13482c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractList f13483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1101q(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator, 0);
        this.f13482c = i;
        this.f13483d = abstractList;
    }

    @Override // p000.m9a
    /* JADX INFO: renamed from: a */
    public final Object mo6345a(Object obj) {
        int i = this.f13482c;
        AbstractList abstractList = this.f13483d;
        switch (i) {
            case 0:
                return ((Lists$TransformingRandomAccessList) abstractList).f13410b.apply(obj);
            default:
                return ((Lists$TransformingSequentialList) abstractList).f13412b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
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
        return mo6345a(((ListIterator) this.f50820b).previous());
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
