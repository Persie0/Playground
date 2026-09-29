package com.google.android.gms.internal.mlkit_vision_document_scanner;

import p000.oed;

/* JADX INFO: loaded from: classes2.dex */
final class zzw extends zzx {

    /* JADX INFO: renamed from: c */
    public final transient int f12011c;

    /* JADX INFO: renamed from: d */
    public final transient int f12012d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzx f12013e;

    public zzw(zzx zzxVar, int i, int i2) {
        this.f12013e = zzxVar;
        this.f12011c = i;
        this.f12012d = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    /* JADX INFO: renamed from: d */
    public final Object[] mo5464d() {
        return this.f12013e.mo5464d();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    /* JADX INFO: renamed from: f */
    public final int mo5465f() {
        return this.f12013e.mo5465f() + this.f12011c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzt
    /* JADX INFO: renamed from: g */
    public final int mo5466g() {
        return this.f12013e.mo5465f() + this.f12011c + this.f12012d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oed.m17956d(i, this.f12012d);
        return this.f12013e.get(i + this.f12011c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzx, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final zzx subList(int i, int i2) {
        oed.m17957e(i, i2, this.f12012d);
        int i3 = this.f12011c;
        return this.f12013e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12012d;
    }
}
