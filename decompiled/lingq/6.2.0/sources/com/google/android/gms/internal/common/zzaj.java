package com.google.android.gms.internal.common;

import java.util.Objects;
import p000.ted;

/* JADX INFO: loaded from: classes2.dex */
final class zzaj extends zzah {

    /* JADX INFO: renamed from: e */
    public static final zzah f11823e = new zzaj(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f11824c;

    /* JADX INFO: renamed from: d */
    public final transient int f11825d;

    public zzaj(Object[] objArr, int i) {
        this.f11824c = objArr;
        this.f11825d = i;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: d */
    public final Object[] mo5350d() {
        return this.f11824c;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: f */
    public final int mo5351f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: g */
    public final int mo5352g() {
        return this.f11825d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ted.m22020b(i, this.f11825d);
        Object obj = this.f11824c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzah, com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: h */
    public final int mo5353h(Object[] objArr) {
        Object[] objArr2 = this.f11824c;
        int i = this.f11825d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11825d;
    }
}
