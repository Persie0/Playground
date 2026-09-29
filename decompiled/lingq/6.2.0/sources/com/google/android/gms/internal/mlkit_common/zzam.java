package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;
import java.util.Objects;
import p000.nda;

/* JADX INFO: loaded from: classes2.dex */
final class zzam extends zzaf {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzan f11938c;

    public zzam(zzan zzanVar) {
        this.f11938c = zzanVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzan zzanVar = this.f11938c;
        nda.m17385i(i, zzanVar.f11941e);
        Object[] objArr = zzanVar.f11940d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11938c.f11941e;
    }
}
