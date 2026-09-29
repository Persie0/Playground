package com.google.android.gms.internal.mlkit_common;

import p000.nda;

/* JADX INFO: loaded from: classes2.dex */
final class zzae extends zzaf {

    /* JADX INFO: renamed from: c */
    public final transient int f11927c;

    /* JADX INFO: renamed from: d */
    public final transient int f11928d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzaf f11929e;

    public zzae(zzaf zzafVar, int i, int i2) {
        this.f11929e = zzafVar;
        this.f11927c = i;
        this.f11928d = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: f */
    public final int mo5449f() {
        return this.f11929e.mo5450g() + this.f11927c + this.f11928d;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: g */
    public final int mo5450g() {
        return this.f11929e.mo5450g() + this.f11927c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        nda.m17385i(i, this.f11928d);
        return this.f11929e.get(i + this.f11927c);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: h */
    public final Object[] mo5451h() {
        return this.f11929e.mo5451h();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final zzaf subList(int i, int i2) {
        nda.m17387k(i, i2, this.f11928d);
        int i3 = this.f11927c;
        return this.f11929e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11928d;
    }
}
