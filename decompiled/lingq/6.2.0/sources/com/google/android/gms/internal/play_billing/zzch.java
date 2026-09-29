package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import p000.rla;

/* JADX INFO: loaded from: classes2.dex */
final class zzch extends zzbw {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f12219c;

    /* JADX INFO: renamed from: d */
    public final transient int f12220d;

    /* JADX INFO: renamed from: e */
    public final transient int f12221e;

    public zzch(Object[] objArr, int i, int i2) {
        this.f12219c = objArr;
        this.f12220d = i;
        this.f12221e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rla.m20707a(i, this.f12221e);
        Object obj = this.f12219c[i + i + this.f12220d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: i */
    public final boolean mo5664i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12221e;
    }
}
