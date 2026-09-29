package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import p000.rla;

/* JADX INFO: loaded from: classes2.dex */
final class zzcd extends zzbw {

    /* JADX INFO: renamed from: e */
    public static final zzbw f12210e = new zzcd(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f12211c;

    /* JADX INFO: renamed from: d */
    public final transient int f12212d;

    public zzcd(Object[] objArr, int i) {
        this.f12211c = objArr;
        this.f12212d = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw, com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: d */
    public final int mo5660d(Object[] objArr) {
        Object[] objArr2 = this.f12211c;
        int i = this.f12212d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: f */
    public final int mo5661f() {
        return this.f12212d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: g */
    public final int mo5662g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rla.m20707a(i, this.f12212d);
        Object obj = this.f12211c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: i */
    public final boolean mo5664i() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: j */
    public final Object[] mo5665j() {
        return this.f12211c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12212d;
    }
}
