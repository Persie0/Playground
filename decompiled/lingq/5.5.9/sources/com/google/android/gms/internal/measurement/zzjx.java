package com.google.android.gms.internal.measurement;

import androidx.activity.result.C0204c;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class zzjx extends zzjw {

    /* JADX INFO: renamed from: c */
    public final byte[] f14562c;

    public zzjx(byte[] bArr) {
        bArr.getClass();
        this.f14562c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: C */
    public final void mo8493C(AbstractC2887w5 abstractC2887w5) throws IOException {
        ((C2874v5) abstractC2887w5).m8319Q1(this.f14562c, mo8492q());
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: D */
    public final boolean mo8494D() {
        return C2851t8.m8264d(this.f14562c, 0, mo8492q());
    }

    /* JADX INFO: renamed from: U */
    public void mo8489U() {
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: a */
    public byte mo8490a(int i10) {
        return this.f14562c[i10];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzka) || mo8492q() != ((zzka) obj).mo8492q()) {
            return false;
        }
        if (mo8492q() == 0) {
            return true;
        }
        if (!(obj instanceof zzjx)) {
            return obj.equals(this);
        }
        zzjx zzjxVar = (zzjx) obj;
        int i10 = this.f14564a;
        int i11 = zzjxVar.f14564a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int iMo8492q = mo8492q();
        if (iMo8492q > zzjxVar.mo8492q()) {
            throw new IllegalArgumentException("Length too large: " + iMo8492q + mo8492q());
        }
        if (iMo8492q > zzjxVar.mo8492q()) {
            throw new IllegalArgumentException(C0204c.m851j("Ran off end of other: 0, ", iMo8492q, ", ", zzjxVar.mo8492q()));
        }
        zzjxVar.mo8489U();
        int i12 = 0;
        int i13 = 0;
        while (i12 < iMo8492q) {
            if (this.f14562c[i12] != zzjxVar.f14562c[i13]) {
                return false;
            }
            i12++;
            i13++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: l */
    public byte mo8491l(int i10) {
        return this.f14562c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: q */
    public int mo8492q() {
        return this.f14562c.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: s */
    public final int mo8495s(int i10, int i11) {
        Charset charset = C2849t6.f14439a;
        for (int i12 = 0; i12 < i11; i12++) {
            i10 = (i10 * 31) + this.f14562c[i12];
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: t */
    public final zzka mo8496t() {
        int iM8498G = zzka.m8498G(0, 47, mo8492q());
        return iM8498G == 0 ? zzka.f14563b : new zzju(this.f14562c, iM8498G);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: y */
    public final String mo8497y(Charset charset) {
        return new String(this.f14562c, 0, mo8492q(), charset);
    }
}
