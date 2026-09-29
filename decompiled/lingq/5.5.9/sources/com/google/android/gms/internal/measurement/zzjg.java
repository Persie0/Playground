package com.google.android.gms.internal.measurement;

import android.support.v4.media.C0141b;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzjg extends zzjb {

    /* JADX INFO: renamed from: d */
    public final transient Object f14560d;

    public zzjg(Object obj) {
        this.f14560d = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: a */
    public final void mo8478a(Object[] objArr) {
        objArr[0] = this.f14560d;
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14560d.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14560d.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C2714j5(this.f14560d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    /* JADX INFO: renamed from: t */
    public final AbstractC2728k5 iterator() {
        return new C2714j5(this.f14560d);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C0141b.m611g("[", this.f14560d.toString(), "]");
    }
}
