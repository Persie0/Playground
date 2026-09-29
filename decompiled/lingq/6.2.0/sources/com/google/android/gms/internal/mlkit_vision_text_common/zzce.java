package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;
import p000.yda;

/* JADX INFO: loaded from: classes.dex */
final class zzce extends zzbk {

    /* JADX INFO: renamed from: e */
    public static final zzbk f12096e = new zzce(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f12097c;

    /* JADX INFO: renamed from: d */
    public final transient int f12098d;

    public zzce(Object[] objArr, int i) {
        this.f12097c = objArr;
        this.f12098d = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk, com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: d */
    public final int mo5492d(Object[] objArr) {
        Object[] objArr2 = this.f12097c;
        int i = this.f12098d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: f */
    public final int mo5493f() {
        return this.f12098d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: g */
    public final int mo5494g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yda.m25097d(i, this.f12098d);
        Object obj = this.f12097c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: h */
    public final Object[] mo5495h() {
        return this.f12097c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12098d;
    }
}
