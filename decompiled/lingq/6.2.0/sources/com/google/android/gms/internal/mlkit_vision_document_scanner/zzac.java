package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.AbstractMap;
import java.util.Objects;
import p000.oed;

/* JADX INFO: loaded from: classes2.dex */
final class zzac extends zzx {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzad f11998c;

    public zzac(zzad zzadVar) {
        this.f11998c = zzadVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zzad zzadVar = this.f11998c;
        oed.m17956d(i, zzadVar.f12001e);
        Object[] objArr = zzadVar.f12000d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11998c.f12001e;
    }
}
