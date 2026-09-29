package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import p480xb.C10164g;

/* JADX INFO: loaded from: classes.dex */
final class zzad extends zzy {

    /* JADX INFO: renamed from: c */
    public final transient zzx f14576c;

    /* JADX INFO: renamed from: d */
    public final transient zzu f14577d;

    public zzad(zzx zzxVar, zzu zzuVar) {
        this.f14576c = zzxVar;
        this.f14577d = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: a */
    public final int mo8519a(Object[] objArr) {
        return this.f14577d.mo8519a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14576c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f14577d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzy, com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: s */
    public final zzu mo8525s() {
        return this.f14577d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14576c.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    /* JADX INFO: renamed from: t */
    public final C10164g iterator() {
        return this.f14577d.listIterator(0);
    }
}
