package com.google.android.gms.internal.mlkit_common;

import java.util.Objects;
import p000.nda;

/* JADX INFO: loaded from: classes2.dex */
final class zzap extends zzaf {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f11944c;

    /* JADX INFO: renamed from: d */
    public final transient int f11945d;

    /* JADX INFO: renamed from: e */
    public final transient int f11946e;

    public zzap(Object[] objArr, int i, int i2) {
        this.f11944c = objArr;
        this.f11945d = i;
        this.f11946e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nda.m17385i(i, this.f11946e);
        Object obj = this.f11944c[i + i + this.f11945d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11946e;
    }
}
