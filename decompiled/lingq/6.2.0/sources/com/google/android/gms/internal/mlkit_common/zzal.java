package com.google.android.gms.internal.mlkit_common;

import java.util.Objects;
import p000.nda;

/* JADX INFO: loaded from: classes.dex */
final class zzal extends zzaf {

    /* JADX INFO: renamed from: e */
    public static final zzaf f11935e = new zzal(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f11936c;

    /* JADX INFO: renamed from: d */
    public final transient int f11937d;

    public zzal(Object[] objArr, int i) {
        this.f11936c = objArr;
        this.f11937d = i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: d */
    public final int mo5448d(Object[] objArr) {
        Object[] objArr2 = this.f11936c;
        int i = this.f11937d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: f */
    public final int mo5449f() {
        return this.f11937d;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: g */
    public final int mo5450g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nda.m17385i(i, this.f11937d);
        Object obj = this.f11936c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: h */
    public final Object[] mo5451h() {
        return this.f11936c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11937d;
    }
}
