package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zziz extends zzja {

    /* JADX INFO: renamed from: c */
    public final transient int f14544c;

    /* JADX INFO: renamed from: d */
    public final transient int f14545d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzja f14546e;

    public zziz(zzja zzjaVar, int i10, int i11) {
        this.f14546e = zzjaVar;
        this.f14544c = i10;
        this.f14545d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C2912y4.m8435a(i10, this.f14545d);
        return this.f14546e.get(i10 + this.f14544c);
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: l */
    public final int mo8479l() {
        return this.f14546e.mo8480q() + this.f14544c + this.f14545d;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: q */
    public final int mo8480q() {
        return this.f14546e.mo8480q() + this.f14544c;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    /* JADX INFO: renamed from: s */
    public final Object[] mo8481s() {
        return this.f14546e.mo8481s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14545d;
    }

    @Override // com.google.android.gms.internal.measurement.zzja, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final zzja subList(int i10, int i11) {
        C2912y4.m8436b(i10, i11, this.f14545d);
        int i12 = this.f14544c;
        return this.f14546e.subList(i10 + i12, i11 + i12);
    }
}
