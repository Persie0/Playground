package com.google.android.gms.internal.mlkit_vision_common;

import java.util.AbstractMap;
import p000.ama;

/* JADX INFO: loaded from: classes2.dex */
final class zzv extends zzp {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzw f11974c;

    public zzv(zzw zzwVar) {
        this.f11974c = zzwVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zzw zzwVar = this.f11974c;
        ama.m576a(i, zzwVar.f11977e);
        Object[] objArr = zzwVar.f11976d;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11974c.f11977e;
    }
}
