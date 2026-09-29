package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractMap;
import java.util.Objects;
import p000.yda;

/* JADX INFO: loaded from: classes2.dex */
final class zzcf extends zzbk {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzcg f12099c;

    public zzcf(zzcg zzcgVar) {
        this.f12099c = zzcgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzcg zzcgVar = this.f12099c;
        yda.m25097d(i, zzcgVar.f12102e);
        Object[] objArr = zzcgVar.f12101d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12099c.f12102e;
    }
}
