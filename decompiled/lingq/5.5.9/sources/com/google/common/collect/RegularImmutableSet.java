package com.google.common.collect;

import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: i */
    public static final Object[] f16133i;

    /* JADX INFO: renamed from: j */
    public static final RegularImmutableSet<Object> f16134j;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f16135d;

    /* JADX INFO: renamed from: e */
    public final transient int f16136e;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f16137f;

    /* JADX INFO: renamed from: g */
    public final transient int f16138g;

    /* JADX INFO: renamed from: h */
    public final transient int f16139h;

    static {
        Object[] objArr = new Object[0];
        f16133i = objArr;
        f16134j = new RegularImmutableSet<>(0, 0, 0, objArr, objArr);
    }

    public RegularImmutableSet(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f16135d = objArr;
        this.f16136e = i10;
        this.f16137f = objArr2;
        this.f16138g = i11;
        this.f16139h = i12;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: C */
    public final AbstractC3187f0<E> iterator() {
        return mo9049a().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet
    /* JADX INFO: renamed from: X */
    public final ImmutableList<E> mo9083X() {
        return ImmutableList.m9058D(this.f16139h, this.f16135d);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f16137f;
            if (objArr.length != 0) {
                int iM16722e1 = C8573r0.m16722e1(obj);
                while (true) {
                    int i10 = iM16722e1 & this.f16138g;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM16722e1 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f16136e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: l */
    public final int mo9050l(int i10, Object[] objArr) {
        Object[] objArr2 = this.f16135d;
        int i11 = this.f16139h;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: q */
    public final Object[] mo9051q() {
        return this.f16135d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: s */
    public final int mo9052s() {
        return this.f16139h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16139h;
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
