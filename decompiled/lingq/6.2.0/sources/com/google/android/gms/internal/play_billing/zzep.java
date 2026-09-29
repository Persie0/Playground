package com.google.android.gms.internal.play_billing;

import p000.C3386nv;
import p000.m9c;
import p000.ux5;
import p000.wq1;
import p000.z3c;

/* JADX INFO: loaded from: classes2.dex */
final class zzep extends zzes {

    /* JADX INFO: renamed from: c */
    public final byte[] f12226c;

    /* JADX INFO: renamed from: d */
    public final int f12227d;

    /* JADX INFO: renamed from: e */
    public final int f12228e;

    public zzep(byte[] bArr, int i, int i2) {
        zzev.m5685l(i, i + i2, bArr.length);
        this.f12226c = bArr;
        this.f12227d = i;
        this.f12228e = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: d */
    public final byte mo5678d(int i) {
        int i2 = this.f12228e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f12226c[this.f12227d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(ux5.m22988k(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(wq1.m24115k("Index > length: ", i, i2, ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: f */
    public final byte mo5679f(int i) {
        return this.f12226c[this.f12227d + i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: g */
    public final int mo5680g(int i, int i2) {
        return m9c.m16703a(i, this.f12226c, this.f12227d, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: h */
    public final int mo5681h() {
        return this.f12228e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: i */
    public final zzev mo5682i(int i, int i2) {
        int iM5685l = zzev.m5685l(i, i2, this.f12228e);
        if (iM5685l == 0) {
            return zzev.f12230b;
        }
        return new zzep(this.f12226c, this.f12227d + i, iM5685l);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: j */
    public final void mo5683j(z3c z3cVar) throws zzfa {
        z3cVar.m25436b(this.f12226c, this.f12227d, this.f12228e);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    /* JADX INFO: renamed from: k */
    public final boolean mo5684k(zzev zzevVar) {
        boolean z = zzevVar instanceof zzet;
        if (!z && !(zzevVar instanceof zzep)) {
            return zzevVar.mo5684k(this);
        }
        int iMo5681h = zzevVar.mo5681h();
        int i = this.f12228e;
        if (i > iMo5681h) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > zzevVar.mo5681h()) {
            C3386nv.m17626m(wq1.m24115k("Ran off end of other: 0, ", i, zzevVar.mo5681h(), ", "));
            return false;
        }
        byte[] bArr = this.f12226c;
        int i2 = this.f12227d;
        if (z) {
            return zzev.m5687n(bArr, i2, ((zzet) zzevVar).f12229c, 0, i);
        }
        if (!(zzevVar instanceof zzep)) {
            return zzevVar.mo5682i(0, i).equals(mo5682i(i2, i + i2));
        }
        zzep zzepVar = (zzep) zzevVar;
        return zzev.m5687n(bArr, i2, zzepVar.f12226c, zzepVar.f12227d, i);
    }
}
