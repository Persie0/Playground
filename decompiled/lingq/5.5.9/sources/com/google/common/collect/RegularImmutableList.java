package com.google.common.collect;

import java.util.Objects;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
class RegularImmutableList<E> extends ImmutableList<E> {

    /* JADX INFO: renamed from: e */
    public static final ImmutableList<Object> f16116e = new RegularImmutableList(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f16117c;

    /* JADX INFO: renamed from: d */
    public final transient int f16118d;

    public RegularImmutableList(int i10, Object[] objArr) {
        this.f16117c = objArr;
        this.f16118d = i10;
    }

    @Override // java.util.List
    public final E get(int i10) {
        C8573r0.m16683L(i10, this.f16118d);
        E e10 = (E) this.f16117c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: l */
    public final int mo9050l(int i10, Object[] objArr) {
        Object[] objArr2 = this.f16117c;
        int i11 = this.f16118d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: q */
    public final Object[] mo9051q() {
        return this.f16117c;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: s */
    public final int mo9052s() {
        return this.f16118d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16118d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: t */
    public final int mo9053t() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: y */
    public final boolean mo9054y() {
        return false;
    }
}
