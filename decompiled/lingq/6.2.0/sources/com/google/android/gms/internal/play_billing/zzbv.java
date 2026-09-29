package com.google.android.gms.internal.play_billing;

import p000.rla;

/* JADX INFO: loaded from: classes2.dex */
final class zzbv extends zzbw {

    /* JADX INFO: renamed from: c */
    public final transient int f12202c;

    /* JADX INFO: renamed from: d */
    public final transient int f12203d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzbw f12204e;

    public zzbv(zzbw zzbwVar, int i, int i2) {
        this.f12204e = zzbwVar;
        this.f12202c = i;
        this.f12203d = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: f */
    public final int mo5661f() {
        return this.f12204e.mo5662g() + this.f12202c + this.f12203d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: g */
    public final int mo5662g() {
        return this.f12204e.mo5662g() + this.f12202c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rla.m20707a(i, this.f12203d);
        return this.f12204e.get(i + this.f12202c);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: i */
    public final boolean mo5664i() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: j */
    public final Object[] mo5665j() {
        return this.f12204e.mo5665j();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final zzbw subList(int i, int i2) {
        rla.m20709c(i, i2, this.f12203d);
        int i3 = this.f12202c;
        return this.f12204e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12203d;
    }
}
