package com.google.android.gms.internal.mlkit_vision_common;

import p000.ama;

/* JADX INFO: loaded from: classes2.dex */
final class zzo extends zzp {

    /* JADX INFO: renamed from: c */
    public final transient int f11963c;

    /* JADX INFO: renamed from: d */
    public final transient int f11964d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzp f11965e;

    public zzo(zzp zzpVar, int i, int i2) {
        this.f11965e = zzpVar;
        this.f11963c = i;
        this.f11964d = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: f */
    public final int mo5457f() {
        return this.f11965e.mo5458g() + this.f11963c + this.f11964d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: g */
    public final int mo5458g() {
        return this.f11965e.mo5458g() + this.f11963c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ama.m576a(i, this.f11964d);
        return this.f11965e.get(i + this.f11963c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: h */
    public final Object[] mo5459h() {
        return this.f11965e.mo5459h();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final zzp subList(int i, int i2) {
        ama.m577b(i, i2, this.f11964d);
        int i3 = this.f11963c;
        return this.f11965e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11964d;
    }
}
