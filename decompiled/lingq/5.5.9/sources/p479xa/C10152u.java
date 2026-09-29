package p479xa;

import com.kochava.tracker.BuildConfig;

/* JADX INFO: renamed from: xa.u */
/* JADX INFO: loaded from: classes.dex */
public final class C10152u {

    /* JADX INFO: renamed from: a */
    public byte[] f51441a;

    /* JADX INFO: renamed from: b */
    public int f51442b;

    /* JADX INFO: renamed from: c */
    public int f51443c;

    /* JADX INFO: renamed from: d */
    public int f51444d = 0;

    public C10152u(byte[] bArr, int i10, int i11) {
        this.f51441a = bArr;
        this.f51443c = i10;
        this.f51442b = i11;
        m19152a();
    }

    /* JADX INFO: renamed from: a */
    public final void m19152a() {
        int i10;
        int i11 = this.f51443c;
        C10129a.m18992d(i11 >= 0 && (i11 < (i10 = this.f51442b) || (i11 == i10 && this.f51444d == 0)));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19153b(int i10) {
        int i11 = this.f51443c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f51444d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        boolean z10 = true;
        loop0: while (true) {
            while (true) {
                i11++;
                if (i11 > i13 || i13 >= this.f51442b) {
                    break loop0;
                }
                if (m19159h(i11)) {
                    i13++;
                    i11 += 2;
                }
            }
        }
        int i15 = this.f51442b;
        if (i13 >= i15) {
            if (i13 != i15 || i14 != 0) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19154c() {
        int i10 = this.f51443c;
        int i11 = this.f51444d;
        int i12 = 0;
        while (this.f51443c < this.f51442b && !m19155d()) {
            i12++;
        }
        boolean z10 = this.f51443c == this.f51442b;
        this.f51443c = i10;
        this.f51444d = i11;
        return !z10 && m19153b((i12 * 2) + 1);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19155d() {
        boolean z10 = (this.f51441a[this.f51443c] & (BuildConfig.SDK_TRUNCATE_LENGTH >> this.f51444d)) != 0;
        m19160i();
        return z10;
    }

    /* JADX INFO: renamed from: e */
    public final int m19156e(int i10) {
        int i11;
        int i12;
        this.f51444d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.f51444d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f51444d = i14;
            byte[] bArr = this.f51441a;
            int i15 = this.f51443c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!m19159h(i15 + 1)) {
                i12 = 1;
            }
            this.f51443c = i15 + i12;
        }
        byte[] bArr2 = this.f51441a;
        int i16 = this.f51443c;
        int i17 = ((-1) >>> (32 - i10)) & (i13 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f51444d = 0;
            if (!m19159h(i16 + 1)) {
                i12 = 1;
            }
            this.f51443c = i16 + i12;
        }
        m19152a();
        return i17;
    }

    /* JADX INFO: renamed from: f */
    public final int m19157f() {
        int i10 = 0;
        while (!m19155d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? m19156e(i10) : 0);
    }

    /* JADX INFO: renamed from: g */
    public final int m19158g() {
        int iM19157f = m19157f();
        return ((iM19157f + 1) / 2) * (iM19157f % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m19159h(int i10) {
        if (2 <= i10 && i10 < this.f51442b) {
            byte[] bArr = this.f51441a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m19160i() {
        int i10 = this.f51444d + 1;
        this.f51444d = i10;
        if (i10 == 8) {
            this.f51444d = 0;
            int i11 = this.f51443c;
            this.f51443c = i11 + (m19159h(i11 + 1) ? 2 : 1);
        }
        m19152a();
    }

    /* JADX INFO: renamed from: j */
    public final void m19161j(int i10) {
        int i11 = this.f51443c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f51443c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f51444d;
        this.f51444d = i14;
        if (i14 > 7) {
            this.f51443c = i13 + 1;
            this.f51444d = i14 - 8;
        }
        while (true) {
            while (true) {
                i11++;
                if (i11 > this.f51443c) {
                    m19152a();
                    return;
                } else if (m19159h(i11)) {
                    this.f51443c++;
                    i11 += 2;
                }
            }
        }
    }
}
