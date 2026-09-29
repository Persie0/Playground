package com.google.common.collect;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.common.collect.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C1094j extends C1086b implements ListIterator {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1095k f13465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1094j(C1095k c1095k, int i) {
        super(c1095k, ((List) c1095k.f13467b).listIterator(i));
        this.f13465e = c1095k;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C1095k c1095k = this.f13465e;
        boolean zIsEmpty = c1095k.isEmpty();
        m6335b().add(obj);
        c1095k.f13471f.f13382e++;
        if (zIsEmpty) {
            c1095k.m6336d();
        }
    }

    /* JADX INFO: renamed from: b */
    public final ListIterator m6335b() {
        m6326a();
        return (ListIterator) this.f13446b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m6335b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m6335b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m6335b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m6335b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m6335b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1094j(C1095k c1095k) {
        super(c1095k);
        this.f13465e = c1095k;
    }
}
