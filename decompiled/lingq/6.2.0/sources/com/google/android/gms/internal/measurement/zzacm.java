package com.google.android.gms.internal.measurement;

import p000.fg2;
import p000.kib;
import p000.nhb;

/* JADX INFO: loaded from: classes2.dex */
final class zzacm extends zzacp {

    /* JADX INFO: renamed from: c */
    public final byte[] f11865c;

    /* JADX INFO: renamed from: d */
    public final int f11866d;

    /* JADX INFO: renamed from: e */
    public final int f11867e;

    public zzacm(byte[] bArr, int i, int i2) {
        zzacr.m5432o(i, i + i2, bArr.length);
        this.f11865c = bArr;
        this.f11866d = i;
        this.f11867e = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: d */
    public final byte mo5421d(int i) {
        return this.f11865c[this.f11866d + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: f */
    public final int mo5422f() {
        return this.f11867e;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: g */
    public final zzacr mo5423g(int i, int i2) {
        int iM5432o = zzacr.m5432o(i, i2, this.f11867e);
        if (iM5432o == 0) {
            return zzacr.f11869b;
        }
        return new zzacm(this.f11865c, this.f11866d + i, iM5432o);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: h */
    public final void mo5424h(int i, byte[] bArr) {
        System.arraycopy(this.f11865c, this.f11866d, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: i */
    public final void mo5425i(nhb nhbVar) {
        nhbVar.mo13255c(this.f11865c, this.f11866d, this.f11867e);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: j */
    public final boolean mo5426j(zzacr zzacrVar) {
        boolean z = zzacrVar instanceof zzacq;
        if (!z && !(zzacrVar instanceof zzacm)) {
            return zzacrVar.mo5426j(this);
        }
        int iMo5422f = zzacrVar.mo5422f();
        int i = this.f11867e;
        if (i > iMo5422f) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i > zzacrVar.mo5422f()) {
            int iMo5422f2 = zzacrVar.mo5422f();
            fg2.m11819h(String.valueOf(i).length() + 27 + String.valueOf(iMo5422f2).length(), i, iMo5422f2);
            return false;
        }
        byte[] bArr = this.f11865c;
        int i2 = this.f11866d;
        if (z) {
            return zzacr.m5433r(bArr, i2, ((zzacq) zzacrVar).f11868c, 0, i);
        }
        if (!(zzacrVar instanceof zzacm)) {
            return zzacrVar.mo5423g(0, i).equals(mo5423g(i2, i + i2));
        }
        zzacm zzacmVar = (zzacm) zzacrVar;
        return zzacr.m5433r(bArr, i2, zzacmVar.f11865c, zzacmVar.f11866d, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: k */
    public final int mo5427k(int i, int i2) {
        return kib.m15263a(i, this.f11865c, this.f11866d, i2);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ byte[] m5428s() {
        return this.f11865c;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int m5429t() {
        return this.f11866d;
    }
}
