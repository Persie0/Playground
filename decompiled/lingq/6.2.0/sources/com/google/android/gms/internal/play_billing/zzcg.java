package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzcg extends zzca {

    /* JADX INFO: renamed from: c */
    public final transient zzbz f12217c;

    /* JADX INFO: renamed from: d */
    public final transient zzbw f12218d;

    public zzcg(zzbz zzbzVar, zzbw zzbwVar) {
        this.f12217c = zzbzVar;
        this.f12218d = zzbwVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12217c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: d */
    public final int mo5660d(Object[] objArr) {
        return this.f12218d.mo5660d(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: h */
    public final zzbw mo5663h() {
        return this.f12218d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f12218d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12217c.size();
    }
}
