package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzx extends zzs {

    /* JADX INFO: renamed from: c */
    public final transient zzr f11978c;

    /* JADX INFO: renamed from: d */
    public final transient zzp f11979d;

    public zzx(zzr zzrVar, zzp zzpVar) {
        this.f11978c = zzrVar;
        this.f11979d = zzpVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11978c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    /* JADX INFO: renamed from: d */
    public final int mo5456d(Object[] objArr) {
        return this.f11979d.mo5456d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f11979d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11978c.size();
    }
}
