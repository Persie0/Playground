package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;
import p000.yda;

/* JADX INFO: loaded from: classes2.dex */
final class zzci extends zzbk {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f12105c;

    /* JADX INFO: renamed from: d */
    public final transient int f12106d;

    /* JADX INFO: renamed from: e */
    public final transient int f12107e = 1;

    public zzci(Object[] objArr, int i) {
        this.f12105c = objArr;
        this.f12106d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yda.m25097d(i, this.f12107e);
        Object obj = this.f12105c[i + i + this.f12106d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12107e;
    }
}
