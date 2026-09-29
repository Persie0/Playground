package com.google.android.gms.internal.common;

import p000.ted;

/* JADX INFO: loaded from: classes2.dex */
final class zzag extends zzah {

    /* JADX INFO: renamed from: c */
    public final transient int f11819c;

    /* JADX INFO: renamed from: d */
    public final transient int f11820d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzah f11821e;

    public zzag(zzah zzahVar, int i, int i2) {
        this.f11821e = zzahVar;
        this.f11819c = i;
        this.f11820d = i2;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: d */
    public final Object[] mo5350d() {
        return this.f11821e.mo5350d();
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: f */
    public final int mo5351f() {
        return this.f11821e.mo5351f() + this.f11819c;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: g */
    public final int mo5352g() {
        return this.f11821e.mo5351f() + this.f11819c + this.f11820d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ted.m22020b(i, this.f11820d);
        return this.f11821e.get(i + this.f11819c);
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: j */
    public final zzah subList(int i, int i2) {
        ted.m22021c(i, i2, this.f11820d);
        int i3 = this.f11819c;
        return this.f11821e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11820d;
    }
}
