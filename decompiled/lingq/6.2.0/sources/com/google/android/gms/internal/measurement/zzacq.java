package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import p000.fg2;
import p000.kib;
import p000.nhb;

/* JADX INFO: loaded from: classes.dex */
final class zzacq extends zzacp {

    /* JADX INFO: renamed from: c */
    public final byte[] f11868c;

    public zzacq(byte[] bArr) {
        bArr.getClass();
        this.f11868c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: d */
    public final byte mo5421d(int i) {
        return this.f11868c[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: f */
    public final int mo5422f() {
        return this.f11868c.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: g */
    public final zzacr mo5423g(int i, int i2) {
        byte[] bArr = this.f11868c;
        int iM5432o = zzacr.m5432o(0, i2, bArr.length);
        return iM5432o == 0 ? zzacr.f11869b : new zzacm(bArr, 0, iM5432o);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: h */
    public final void mo5424h(int i, byte[] bArr) {
        System.arraycopy(this.f11868c, 0, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: i */
    public final void mo5425i(nhb nhbVar) {
        byte[] bArr = this.f11868c;
        nhbVar.mo13255c(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: j */
    public final boolean mo5426j(zzacr zzacrVar) {
        boolean z = zzacrVar instanceof zzacq;
        byte[] bArr = this.f11868c;
        if (z) {
            return Arrays.equals(bArr, ((zzacq) zzacrVar).f11868c);
        }
        boolean z2 = zzacrVar instanceof zzacm;
        if (!z2) {
            return zzacrVar.mo5426j(this);
        }
        int iMo5422f = zzacrVar.mo5422f();
        int length = bArr.length;
        if (length > iMo5422f) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length > zzacrVar.mo5422f()) {
            int iMo5422f2 = zzacrVar.mo5422f();
            fg2.m11819h(String.valueOf(length).length() + 27 + String.valueOf(iMo5422f2).length(), length, iMo5422f2);
            return false;
        }
        if (z) {
            return zzacr.m5433r(bArr, 0, ((zzacq) zzacrVar).f11868c, 0, length);
        }
        if (!z2) {
            return zzacrVar.mo5423g(0, length).equals(mo5423g(0, length));
        }
        zzacm zzacmVar = (zzacm) zzacrVar;
        return zzacr.m5433r(bArr, 0, zzacmVar.m5428s(), zzacmVar.m5429t(), length);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: k */
    public final int mo5427k(int i, int i2) {
        return kib.m15263a(i, this.f11868c, 0, i2);
    }
}
