package com.google.android.gms.internal.play_billing;

import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
final class zzaa extends zzu {

    /* JADX INFO: renamed from: e */
    public static final zzu f14569e = new zzaa(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f14570c;

    /* JADX INFO: renamed from: d */
    public final transient int f14571d;

    public zzaa(int i10, Object[] objArr) {
        this.f14570c = objArr;
        this.f14571d = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: C */
    public final Object[] mo8518C() {
        return this.f14570c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: a */
    public final int mo8519a(Object[] objArr) {
        Object[] objArr2 = this.f14570c;
        int i10 = this.f14571d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C8573r0.m16745o1(i10, this.f14571d);
        Object obj = this.f14570c[i10];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: l */
    public final int mo8520l() {
        return this.f14571d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: q */
    public final int mo8521q() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14571d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: y */
    public final boolean mo8522y() {
        return false;
    }
}
