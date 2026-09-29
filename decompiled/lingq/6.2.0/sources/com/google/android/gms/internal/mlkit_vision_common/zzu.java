package com.google.android.gms.internal.mlkit_vision_common;

import p000.ama;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends zzp {

    /* JADX INFO: renamed from: e */
    public static final zzp f11971e = new zzu(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f11972c;

    /* JADX INFO: renamed from: d */
    public final transient int f11973d;

    public zzu(Object[] objArr, int i) {
        this.f11972c = objArr;
        this.f11973d = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: d */
    public final int mo5456d(Object[] objArr) {
        Object[] objArr2 = this.f11972c;
        int i = this.f11973d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: f */
    public final int mo5457f() {
        return this.f11973d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: g */
    public final int mo5458g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ama.m576a(i, this.f11973d);
        Object obj = this.f11972c[i];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: h */
    public final Object[] mo5459h() {
        return this.f11972c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11973d;
    }
}
