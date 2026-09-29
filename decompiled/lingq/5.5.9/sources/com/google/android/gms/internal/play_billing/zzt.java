package com.google.android.gms.internal.play_billing;

import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
final class zzt extends zzu {

    /* JADX INFO: renamed from: c */
    public final transient int f14586c;

    /* JADX INFO: renamed from: d */
    public final transient int f14587d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzu f14588e;

    public zzt(zzu zzuVar, int i10, int i11) {
        this.f14588e = zzuVar;
        this.f14586c = i10;
        this.f14587d = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: C */
    public final Object[] mo8518C() {
        return this.f14588e.mo8518C();
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, java.util.List
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final zzu subList(int i10, int i11) {
        C8573r0.m16760t1(i10, i11, this.f14587d);
        int i12 = this.f14586c;
        return this.f14588e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C8573r0.m16745o1(i10, this.f14587d);
        return this.f14588e.get(i10 + this.f14586c);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: l */
    public final int mo8520l() {
        return this.f14588e.mo8521q() + this.f14586c + this.f14587d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: q */
    public final int mo8521q() {
        return this.f14588e.mo8521q() + this.f14586c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14587d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: y */
    public final boolean mo8522y() {
        return true;
    }
}
