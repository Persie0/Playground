package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import p000.C3386nv;
import p000.m9c;
import p000.wq1;
import p000.z3c;

/* JADX INFO: loaded from: classes.dex */
final class zzet extends zzes {

    /* JADX INFO: renamed from: c */
    public final byte[] f12229c;

    public zzet(byte[] bArr) {
        bArr.getClass();
        this.f12229c = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: d */
    public final byte mo5678d(int i) {
        return this.f12229c[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: f */
    public final byte mo5679f(int i) {
        return this.f12229c[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: g */
    public final int mo5680g(int i, int i2) {
        return m9c.m16703a(i, this.f12229c, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: h */
    public final int mo5681h() {
        return this.f12229c.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: i */
    public final zzev mo5682i(int i, int i2) {
        byte[] bArr = this.f12229c;
        int iM5685l = zzev.m5685l(0, i2, bArr.length);
        return iM5685l == 0 ? zzev.f12230b : new zzep(bArr, 0, iM5685l);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: j */
    public final void mo5683j(z3c z3cVar) throws zzfa {
        byte[] bArr = this.f12229c;
        z3cVar.m25436b(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: k */
    public final boolean mo5684k(zzev zzevVar) {
        boolean z = zzevVar instanceof zzet;
        byte[] bArr = this.f12229c;
        if (z) {
            return Arrays.equals(bArr, ((zzet) zzevVar).f12229c);
        }
        boolean z2 = zzevVar instanceof zzep;
        if (!z2) {
            return zzevVar.mo5684k(this);
        }
        int iMo5681h = zzevVar.mo5681h();
        int length = bArr.length;
        if (length > iMo5681h) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > zzevVar.mo5681h()) {
            C3386nv.m17626m(wq1.m24115k("Ran off end of other: 0, ", length, zzevVar.mo5681h(), ", "));
            return false;
        }
        if (z) {
            return zzev.m5687n(bArr, 0, ((zzet) zzevVar).f12229c, 0, length);
        }
        if (!z2) {
            return zzevVar.mo5682i(0, length).equals(mo5682i(0, length));
        }
        zzep zzepVar = (zzep) zzevVar;
        return zzev.m5687n(bArr, 0, zzepVar.f12226c, zzepVar.f12227d, length);
    }
}
