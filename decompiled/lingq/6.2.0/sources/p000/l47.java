package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class l47 {

    /* JADX INFO: renamed from: a */
    public int f49038a;

    /* JADX INFO: renamed from: b */
    public int f49039b;

    /* JADX INFO: renamed from: c */
    public int f49040c;

    /* JADX INFO: renamed from: d */
    public int f49041d = 0;

    /* JADX INFO: renamed from: e */
    public byte[] f49042e;

    public l47(byte[] bArr, int i, int i2) {
        this.f49042e = bArr;
        this.f49039b = i;
        this.f49040c = i;
        this.f49038a = i2;
        m15779a();
    }

    /* JADX INFO: renamed from: a */
    public void m15779a() {
        int i;
        int i2 = this.f49040c;
        bna.m3987z(i2 >= 0 && (i2 < (i = this.f49038a) || (i2 == i && this.f49041d == 0)));
    }

    /* JADX INFO: renamed from: b */
    public boolean m15780b(int i) {
        int i2 = this.f49040c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f49041d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.f49038a) {
                break;
            }
            if (m15786h(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f49038a;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    /* JADX INFO: renamed from: c */
    public boolean m15781c() {
        int i = this.f49040c;
        int i2 = this.f49041d;
        int i3 = 0;
        while (this.f49040c < this.f49038a && !m15782d()) {
            i3++;
        }
        boolean z = this.f49040c == this.f49038a;
        this.f49040c = i;
        this.f49041d = i2;
        return !z && m15780b((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: d */
    public boolean m15782d() {
        boolean z = (this.f49042e[this.f49040c] & (128 >> this.f49041d)) != 0;
        m15787i();
        return z;
    }

    /* JADX INFO: renamed from: e */
    public int m15783e(int i) {
        int i2;
        this.f49041d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f49041d;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f49041d = i5;
            byte[] bArr = this.f49042e;
            int i6 = this.f49040c;
            i3 |= (bArr[i6] & 255) << i5;
            if (!m15786h(i6 + 1)) {
                i4 = 1;
            }
            this.f49040c = i6 + i4;
        }
        byte[] bArr2 = this.f49042e;
        int i7 = this.f49040c;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f49041d = 0;
            this.f49040c = i7 + (m15786h(i7 + 1) ? 2 : 1);
        }
        m15779a();
        return i8;
    }

    /* JADX INFO: renamed from: f */
    public int m15784f() {
        int i = 0;
        while (!m15782d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m15783e(i) : 0);
    }

    /* JADX INFO: renamed from: g */
    public int m15785g() {
        int iM15784f = m15784f();
        return ((iM15784f + 1) / 2) * (iM15784f % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: h */
    public boolean m15786h(int i) {
        int i2 = i - 2;
        if (this.f49039b > i2 || i >= this.f49038a) {
            return false;
        }
        byte[] bArr = this.f49042e;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: i */
    public void m15787i() {
        int i = this.f49041d + 1;
        this.f49041d = i;
        if (i == 8) {
            this.f49041d = 0;
            int i2 = this.f49040c;
            this.f49040c = i2 + (m15786h(i2 + 1) ? 2 : 1);
        }
        m15779a();
    }

    /* JADX INFO: renamed from: j */
    public void m15788j(int i) {
        int i2 = this.f49040c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f49040c = i4;
        int i5 = (i - (i3 * 8)) + this.f49041d;
        this.f49041d = i5;
        if (i5 > 7) {
            this.f49040c = i4 + 1;
            this.f49041d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f49040c) {
                m15779a();
                return;
            } else if (m15786h(i2)) {
                this.f49040c++;
                i2 += 2;
            }
        }
    }
}
