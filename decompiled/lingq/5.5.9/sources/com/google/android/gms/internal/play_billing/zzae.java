package com.google.android.gms.internal.play_billing;

import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
final class zzae extends zzu {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f14578c;

    /* JADX INFO: renamed from: d */
    public final transient int f14579d;

    /* JADX INFO: renamed from: e */
    public final transient int f14580e;

    public zzae(int i10, int i11, Object[] objArr) {
        this.f14578c = objArr;
        this.f14579d = i10;
        this.f14580e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C8573r0.m16745o1(i10, this.f14580e);
        Object obj = this.f14578c[i10 + i10 + this.f14579d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14580e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: y */
    public final boolean mo8522y() {
        return true;
    }
}
