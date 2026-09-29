package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes2.dex */
final class zzhw extends zzid {

    /* JADX INFO: renamed from: e */
    public final int f12296e;

    /* JADX INFO: renamed from: f */
    public final int f12297f;

    public zzhw(byte[] bArr, int i, int i2) {
        super(bArr);
        zzht.m5830i(i, i + i2, bArr.length);
        this.f12296e = i;
        this.f12297f = i2;
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    /* JADX INFO: renamed from: d */
    public final byte mo5831d(int i) {
        int i2 = this.f12297f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f12298d[this.f12296e + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    /* JADX INFO: renamed from: f */
    public final int mo5832f() {
        return this.f12297f;
    }

    @Override // com.google.android.gms.internal.vision.zzid, com.google.android.gms.internal.vision.zzht
    /* JADX INFO: renamed from: h */
    public final byte mo5833h(int i) {
        return this.f12298d[this.f12296e + i];
    }

    @Override // com.google.android.gms.internal.vision.zzid
    /* JADX INFO: renamed from: j */
    public final int mo5834j() {
        return this.f12296e;
    }
}
