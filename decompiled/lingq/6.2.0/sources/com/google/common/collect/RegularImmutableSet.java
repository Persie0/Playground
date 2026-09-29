package com.google.common.collect;

import p000.bga;
import p000.omd;

/* JADX INFO: loaded from: classes.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: i */
    public static final Object[] f13432i;

    /* JADX INFO: renamed from: j */
    public static final RegularImmutableSet f13433j;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f13434d;

    /* JADX INFO: renamed from: e */
    public final transient int f13435e;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f13436f;

    /* JADX INFO: renamed from: g */
    public final transient int f13437g;

    /* JADX INFO: renamed from: h */
    public final transient int f13438h;

    static {
        Object[] objArr = new Object[0];
        f13432i = objArr;
        f13433j = new RegularImmutableSet(0, 0, 0, objArr, objArr);
    }

    public RegularImmutableSet(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f13434d = objArr;
        this.f13435e = i;
        this.f13436f = objArr2;
        this.f13437g = i2;
        this.f13438h = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f13436f;
            if (objArr.length != 0) {
                int iM18148f0 = omd.m18148f0(obj);
                while (true) {
                    int i = iM18148f0 & this.f13437g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM18148f0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: f */
    public final int mo6274f(Object[] objArr, int i) {
        Object[] objArr2 = this.f13434d;
        int i2 = this.f13438h;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: g */
    public final Object[] mo6275g() {
        return this.f13434d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: h */
    public final int mo6276h() {
        return this.f13438h;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13435e;
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

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: k */
    public final bga iterator() {
        return mo6273d().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet
    /* JADX INFO: renamed from: r */
    public final ImmutableList mo6313r() {
        return ImmutableList.m6283l(this.f13434d, this.f13438h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13438h;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
