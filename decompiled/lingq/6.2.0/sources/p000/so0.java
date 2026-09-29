package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class so0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61082a;

    /* JADX INFO: renamed from: b */
    public byte[] f61083b;

    /* JADX INFO: renamed from: c */
    public int f61084c;

    /* JADX INFO: renamed from: d */
    public int f61085d;

    /* JADX INFO: renamed from: e */
    public int f61086e;

    public so0(int i, int i2) {
        this.f61082a = 0;
        this.f61084c = i;
        this.f61085d = i2;
        this.f61083b = new byte[(i2 * 2) - 1];
        this.f61086e = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m21497a() {
        int i;
        int i2 = this.f61084c;
        bna.m3987z(i2 >= 0 && (i2 < (i = this.f61086e) || (i2 == i && this.f61085d == 0)));
    }

    /* JADX INFO: renamed from: b */
    public int m21498b() {
        return ((this.f61086e - this.f61084c) * 8) - this.f61085d;
    }

    /* JADX INFO: renamed from: c */
    public void m21499c() {
        if (this.f61085d == 0) {
            return;
        }
        this.f61085d = 0;
        this.f61084c++;
        m21497a();
    }

    /* JADX INFO: renamed from: d */
    public int m21500d() {
        bna.m3987z(this.f61085d == 0);
        return this.f61084c;
    }

    /* JADX INFO: renamed from: e */
    public int m21501e() {
        return (this.f61084c * 8) + this.f61085d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21502f() {
        switch (this.f61082a) {
            case 1:
                boolean z = (this.f61083b[this.f61084c] & (128 >> this.f61085d)) != 0;
                m21510n();
                return z;
            default:
                boolean z2 = (((this.f61083b[this.f61085d] & 255) >> this.f61086e) & 1) == 1;
                m21511o(1);
                return z2;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m21503g(int i) {
        switch (this.f61082a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.f61085d += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.f61085d;
                    if (i3 <= 8) {
                        byte[] bArr = this.f61083b;
                        int i4 = this.f61084c;
                        int i5 = ((-1) >>> (32 - i)) & (((255 & bArr[i4]) >> (8 - i3)) | i2);
                        if (i3 == 8) {
                            this.f61085d = 0;
                            this.f61084c = i4 + 1;
                        }
                        m21497a();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.f61085d = i6;
                    byte[] bArr2 = this.f61083b;
                    int i7 = this.f61084c;
                    this.f61084c = i7 + 1;
                    i2 |= (bArr2[i7] & 255) << i6;
                }
                break;
            default:
                int i8 = this.f61085d;
                int iMin = Math.min(i, 8 - this.f61086e);
                byte[] bArr3 = this.f61083b;
                int i9 = i8 + 1;
                int i10 = ((bArr3[i8] & 255) >> this.f61086e) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i10 |= (bArr3[i9] & 255) << iMin;
                    iMin += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i));
                m21511o(i);
                return i11;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m21504h(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f61083b;
            int i4 = this.f61084c;
            int i5 = i4 + 1;
            this.f61084c = i5;
            byte b = bArr2[i4];
            int i6 = this.f61085d;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.f61085d;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f61083b;
            int i9 = this.f61084c;
            this.f61084c = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f61085d = i8 - 8;
        }
        int i10 = this.f61085d + i7;
        this.f61085d = i10;
        byte[] bArr4 = this.f61083b;
        int i11 = this.f61084c;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f61085d = 0;
            this.f61084c = i11 + 1;
        }
        m21497a();
    }

    /* JADX INFO: renamed from: i */
    public long m21505i(int i) {
        if (i <= 32) {
            int iM21503g = m21503g(i);
            String str = uma.f64080a;
            return ((long) iM21503g) & 4294967295L;
        }
        int iM21503g2 = m21503g(i - 32);
        int iM21503g3 = m21503g(32);
        String str2 = uma.f64080a;
        return (((long) iM21503g3) & 4294967295L) | ((((long) iM21503g2) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: j */
    public void m21506j(int i, byte[] bArr) {
        bna.m3987z(this.f61085d == 0);
        System.arraycopy(this.f61083b, this.f61084c, bArr, 0, i);
        this.f61084c += i;
        m21497a();
    }

    /* JADX INFO: renamed from: k */
    public void m21507k(int i, byte[] bArr) {
        this.f61083b = bArr;
        this.f61084c = 0;
        this.f61085d = 0;
        this.f61086e = i;
    }

    /* JADX INFO: renamed from: l */
    public void m21508l(k47 k47Var) {
        m21507k(k47Var.f46702c, k47Var.f46700a);
        m21509m(k47Var.f46701b * 8);
    }

    /* JADX INFO: renamed from: m */
    public void m21509m(int i) {
        int i2 = i / 8;
        this.f61084c = i2;
        this.f61085d = i - (i2 * 8);
        m21497a();
    }

    /* JADX INFO: renamed from: n */
    public void m21510n() {
        int i = this.f61085d + 1;
        this.f61085d = i;
        if (i == 8) {
            this.f61085d = 0;
            this.f61084c++;
        }
        m21497a();
    }

    /* JADX INFO: renamed from: o */
    public void m21511o(int i) {
        int i2;
        switch (this.f61082a) {
            case 1:
                int i3 = i / 8;
                int i4 = this.f61084c + i3;
                this.f61084c = i4;
                int i5 = (i - (i3 * 8)) + this.f61085d;
                this.f61085d = i5;
                if (i5 > 7) {
                    this.f61084c = i4 + 1;
                    this.f61085d = i5 - 8;
                }
                m21497a();
                break;
            default:
                int i6 = i / 8;
                int i7 = this.f61085d + i6;
                this.f61085d = i7;
                int i8 = (i - (i6 * 8)) + this.f61086e;
                this.f61086e = i8;
                boolean z = true;
                if (i8 > 7) {
                    this.f61085d = i7 + 1;
                    this.f61086e = i8 - 8;
                }
                int i9 = this.f61085d;
                if (i9 < 0 || (i9 >= (i2 = this.f61084c) && (i9 != i2 || this.f61086e != 0))) {
                    z = false;
                }
                bna.m3987z(z);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m21512p(int i) {
        bna.m3987z(this.f61085d == 0);
        this.f61084c += i;
        m21497a();
    }

    public so0(byte[] bArr) {
        this.f61082a = 2;
        this.f61083b = bArr;
        this.f61084c = bArr.length;
    }

    public so0(int i, byte[] bArr) {
        this.f61082a = 1;
        this.f61083b = bArr;
        this.f61086e = i;
    }

    public so0() {
        this.f61082a = 1;
        this.f61083b = uma.f64081b;
    }
}
