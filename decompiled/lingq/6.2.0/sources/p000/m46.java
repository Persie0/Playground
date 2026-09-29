package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class m46 {

    /* JADX INFO: renamed from: a */
    public int f50573a;

    /* JADX INFO: renamed from: b */
    public int f50574b;

    /* JADX INFO: renamed from: c */
    public int f50575c;

    /* JADX INFO: renamed from: d */
    public int f50576d;

    /* JADX INFO: renamed from: e */
    public int f50577e;

    /* JADX INFO: renamed from: f */
    public int f50578f;

    /* JADX INFO: renamed from: g */
    public Serializable f50579g;

    /* JADX INFO: renamed from: a */
    public boolean m16621a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f50573a = i2;
        this.f50579g = tuc.f62918a[3 - i3];
        int i6 = tuc.f62919b[i5];
        this.f50575c = i6;
        if (i2 == 2) {
            this.f50575c = i6 / 2;
        } else if (i2 == 0) {
            this.f50575c = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    ij6.m13959q();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.f50578f = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? tuc.f62920c[i4 - 1] : tuc.f62921d[i4 - 1];
            this.f50577e = i9;
            this.f50574b = (((i9 * 12) / this.f50575c) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? tuc.f62922e[i4 - 1] : tuc.f62923f[i4 - 1];
                this.f50577e = i10;
                this.f50574b = ((i10 * 144) / this.f50575c) + i7;
            } else {
                int i11 = tuc.f62924g[i4 - 1];
                this.f50577e = i11;
                this.f50574b = (((i3 == 1 ? 72 : 144) * i11) / this.f50575c) + i7;
            }
        }
        this.f50576d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
