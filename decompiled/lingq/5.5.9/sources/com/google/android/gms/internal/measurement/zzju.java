package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;

/* JADX INFO: loaded from: classes.dex */
final class zzju extends zzjx {

    /* JADX INFO: renamed from: d */
    public final int f14561d;

    public zzju(byte[] bArr, int i10) {
        super(bArr);
        zzka.m8498G(0, i10, bArr.length);
        this.f14561d = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    /* JADX INFO: renamed from: U */
    public final void mo8489U() {
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: a */
    public final byte mo8490a(int i10) {
        int i11 = this.f14561d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f14562c[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(C0166e.m761g("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(C0204c.m851j("Index > length: ", i10, ", ", i11));
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: l */
    public final byte mo8491l(int i10) {
        return this.f14562c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzjx, com.google.android.gms.internal.measurement.zzka
    /* JADX INFO: renamed from: q */
    public final int mo8492q() {
        return this.f14561d;
    }
}
