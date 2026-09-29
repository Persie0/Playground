package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Objects;
import p000.oed;

/* JADX INFO: loaded from: classes2.dex */
final class zzaf extends zzx {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f12004c;

    /* JADX INFO: renamed from: d */
    public final transient int f12005d;

    /* JADX INFO: renamed from: e */
    public final transient int f12006e = 1;

    public zzaf(Object[] objArr, int i) {
        this.f12004c = objArr;
        this.f12005d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oed.m17956d(i, this.f12006e);
        Object obj = this.f12004c[i + i + this.f12005d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12006e;
    }
}
