package com.google.android.gms.internal.mlkit_vision_common;

import p000.ama;

/* JADX INFO: loaded from: classes2.dex */
final class zzy extends zzp {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f11980c;

    /* JADX INFO: renamed from: d */
    public final transient int f11981d;

    /* JADX INFO: renamed from: e */
    public final transient int f11982e = 1;

    public zzy(Object[] objArr, int i) {
        this.f11980c = objArr;
        this.f11981d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ama.m576a(i, this.f11982e);
        Object obj = this.f11980c[i + i + this.f11981d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11982e;
    }
}
