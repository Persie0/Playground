package com.google.common.collect;

import java.util.Objects;
import p000.bna;

/* JADX INFO: loaded from: classes.dex */
class RegularImmutableList<E> extends ImmutableList<E> {

    /* JADX INFO: renamed from: e */
    public static final ImmutableList f13416e = new RegularImmutableList(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f13417c;

    /* JADX INFO: renamed from: d */
    public final transient int f13418d;

    public RegularImmutableList(Object[] objArr, int i) {
        this.f13417c = objArr;
        this.f13418d = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: f */
    public final int mo6274f(Object[] objArr, int i) {
        Object[] objArr2 = this.f13417c;
        int i2 = this.f13418d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: g */
    public final Object[] mo6275g() {
        return this.f13417c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bna.m3973s(i, this.f13418d);
        Object obj = this.f13417c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: h */
    public final int mo6276h() {
        return this.f13418d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: i */
    public final int mo6277i() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public final boolean mo6278j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13418d;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
