package com.google.android.gms.internal.vision;

import p000.fg2;

/* JADX INFO: loaded from: classes2.dex */
class zzid extends zzia {

    /* JADX INFO: renamed from: d */
    public final byte[] f12298d;

    public zzid(byte[] bArr) {
        this.f12295a = 0;
        bArr.getClass();
        this.f12298d = bArr;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    /* JADX INFO: renamed from: d */
    public byte mo5831d(int i) {
        return this.f12298d[i];
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzht) && mo5832f() == ((zzht) obj).mo5832f()) {
            if (mo5832f() == 0) {
                return true;
            }
            if (!(obj instanceof zzid)) {
                return obj.equals(this);
            }
            zzid zzidVar = (zzid) obj;
            int i = this.f12295a;
            int i2 = zzidVar.f12295a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iMo5832f = mo5832f();
                if (iMo5832f > zzidVar.mo5832f()) {
                    int iMo5832f2 = mo5832f();
                    StringBuilder sb = new StringBuilder(40);
                    sb.append("Length too large: ");
                    sb.append(iMo5832f);
                    sb.append(iMo5832f2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iMo5832f > zzidVar.mo5832f()) {
                    fg2.m11819h(59, iMo5832f, zzidVar.mo5832f());
                    return false;
                }
                byte[] bArr = zzidVar.f12298d;
                int iMo5834j = mo5834j() + iMo5832f;
                int iMo5834j2 = mo5834j();
                int iMo5834j3 = zzidVar.mo5834j();
                while (iMo5834j2 < iMo5834j) {
                    if (this.f12298d[iMo5834j2] == bArr[iMo5834j3]) {
                        iMo5834j2++;
                        iMo5834j3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    /* JADX INFO: renamed from: f */
    public int mo5832f() {
        return this.f12298d.length;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    /* JADX INFO: renamed from: h */
    public byte mo5833h(int i) {
        return this.f12298d[i];
    }

    /* JADX INFO: renamed from: j */
    public int mo5834j() {
        return 0;
    }
}
