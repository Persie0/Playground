package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzao extends zzaj {

    /* JADX INFO: renamed from: c */
    public final transient zzai f11942c;

    /* JADX INFO: renamed from: d */
    public final transient zzaf f11943d;

    public zzao(zzai zzaiVar, zzaf zzafVar) {
        this.f11942c = zzaiVar;
        this.f11943d = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11942c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    /* JADX INFO: renamed from: d */
    public final int mo5448d(Object[] objArr) {
        return this.f11943d.mo5448d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f11943d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11942c.size();
    }
}
