package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;
import p000.rla;

/* JADX INFO: loaded from: classes2.dex */
final class zzce extends zzbw {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzcf f12213c;

    public zzce(zzcf zzcfVar) {
        this.f12213c = zzcfVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzcf zzcfVar = this.f12213c;
        rla.m20707a(i, zzcfVar.f12216e);
        Object[] objArr = zzcfVar.f12215d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: i */
    public final boolean mo5664i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12213c.f12216e;
    }
}
