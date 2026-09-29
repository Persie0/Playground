package com.google.android.gms.internal.mlkit_vision_text_common;

import p000.yda;

/* JADX INFO: loaded from: classes2.dex */
final class zzbj extends zzbk {

    /* JADX INFO: renamed from: c */
    public final transient int f12084c;

    /* JADX INFO: renamed from: d */
    public final transient int f12085d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzbk f12086e;

    public zzbj(zzbk zzbkVar, int i, int i2) {
        this.f12086e = zzbkVar;
        this.f12084c = i;
        this.f12085d = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: f */
    public final int mo5493f() {
        return this.f12086e.mo5494g() + this.f12084c + this.f12085d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: g */
    public final int mo5494g() {
        return this.f12086e.mo5494g() + this.f12084c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yda.m25097d(i, this.f12085d);
        return this.f12086e.get(i + this.f12084c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: h */
    public final Object[] mo5495h() {
        return this.f12086e.mo5495h();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final zzbk subList(int i, int i2) {
        yda.m25098e(i, i2, this.f12085d);
        int i3 = this.f12084c;
        return this.f12086e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12085d;
    }
}
