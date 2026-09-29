package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzje extends zzja {

    /* JADX INFO: renamed from: e */
    public static final zzja f14550e = new zzje(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f14551c;

    /* JADX INFO: renamed from: d */
    public final transient int f14552d;

    public zzje(int i10, Object[] objArr) {
        this.f14551c = objArr;
        this.f14552d = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzja, com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: a */
    public final void mo8478a(Object[] objArr) {
        System.arraycopy(this.f14551c, 0, objArr, 0, this.f14552d);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C2912y4.m8435a(i10, this.f14552d);
        Object obj = this.f14551c[i10];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: l */
    public final int mo8479l() {
        return this.f14552d;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: q */
    public final int mo8480q() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: s */
    public final Object[] mo8481s() {
        return this.f14551c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14552d;
    }
}
