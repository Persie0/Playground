package p357r6;

import com.kochava.tracker.BuildConfig;
import java.io.Serializable;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: r6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8739a {

    /* JADX INFO: renamed from: a */
    public int f46332a;

    /* JADX INFO: renamed from: b */
    public int f46333b;

    /* JADX INFO: renamed from: c */
    public int f46334c;

    /* JADX INFO: renamed from: d */
    public Serializable f46335d;

    /* JADX WARN: Type inference failed for: r0v0, types: [byte[], java.io.Serializable] */
    public C8739a() {
        this.f46335d = C10134c0.f51359f;
    }

    public C8739a(String str, int i10, int i11, int i12) {
        this.f46332a = i10;
        this.f46333b = i11;
        this.f46334c = i12;
        this.f46335d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8739a(byte[] bArr, int i10) {
        this.f46335d = bArr;
        this.f46334c = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m16964a() {
        int i10;
        int i11 = this.f46332a;
        C10129a.m18992d(i11 >= 0 && (i11 < (i10 = this.f46334c) || (i11 == i10 && this.f46333b == 0)));
    }

    /* JADX INFO: renamed from: b */
    public final int m16965b() {
        return ((this.f46334c - this.f46332a) * 8) - this.f46333b;
    }

    /* JADX INFO: renamed from: c */
    public final void m16966c() {
        if (this.f46333b == 0) {
            return;
        }
        this.f46333b = 0;
        this.f46332a++;
        m16964a();
    }

    /* JADX INFO: renamed from: d */
    public final int m16967d() {
        C10129a.m18992d(this.f46333b == 0);
        return this.f46332a;
    }

    /* JADX INFO: renamed from: e */
    public final int m16968e() {
        return (this.f46332a * 8) + this.f46333b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m16969f() {
        boolean z10 = (((byte[]) this.f46335d)[this.f46332a] & (BuildConfig.SDK_TRUNCATE_LENGTH >> this.f46333b)) != 0;
        m16975l();
        return z10;
    }

    /* JADX INFO: renamed from: g */
    public final int m16970g(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f46333b += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f46333b;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f46333b = i13;
            byte[] bArr = (byte[]) this.f46335d;
            int i14 = this.f46332a;
            this.f46332a = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = (byte[]) this.f46335d;
        int i15 = this.f46332a;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f46333b = 0;
            this.f46332a = i15 + 1;
        }
        m16964a();
        return i16;
    }

    /* JADX INFO: renamed from: h */
    public final void m16971h(byte[] bArr, int i10) {
        int i11 = (i10 >> 3) + 0;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = (byte[]) this.f46335d;
            int i13 = this.f46332a;
            int i14 = i13 + 1;
            this.f46332a = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f46333b;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f46333b;
        if (i17 + i16 > 8) {
            byte[] bArr3 = (byte[]) this.f46335d;
            int i18 = this.f46332a;
            this.f46332a = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f46333b = i17 - 8;
        }
        int i19 = this.f46333b + i16;
        this.f46333b = i19;
        byte[] bArr4 = (byte[]) this.f46335d;
        int i20 = this.f46332a;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f46333b = 0;
            this.f46332a = i20 + 1;
        }
        m16964a();
    }

    /* JADX INFO: renamed from: i */
    public final void m16972i(byte[] bArr, int i10) {
        C10129a.m18992d(this.f46333b == 0);
        System.arraycopy((byte[]) this.f46335d, this.f46332a, bArr, 0, i10);
        this.f46332a += i10;
        m16964a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m16973j(byte[] bArr, int i10) {
        this.f46335d = bArr;
        this.f46332a = 0;
        this.f46333b = 0;
        this.f46334c = i10;
    }

    /* JADX INFO: renamed from: k */
    public final void m16974k(int i10) {
        int i11 = i10 / 8;
        this.f46332a = i11;
        this.f46333b = i10 - (i11 * 8);
        m16964a();
    }

    /* JADX INFO: renamed from: l */
    public final void m16975l() {
        int i10 = this.f46333b + 1;
        this.f46333b = i10;
        if (i10 == 8) {
            this.f46333b = 0;
            this.f46332a++;
        }
        m16964a();
    }

    /* JADX INFO: renamed from: m */
    public final void m16976m(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f46332a + i11;
        this.f46332a = i12;
        int i13 = (i10 - (i11 * 8)) + this.f46333b;
        this.f46333b = i13;
        if (i13 > 7) {
            this.f46332a = i12 + 1;
            this.f46333b = i13 - 8;
        }
        m16964a();
    }

    /* JADX INFO: renamed from: n */
    public final void m16977n(int i10) {
        C10129a.m18992d(this.f46333b == 0);
        this.f46332a += i10;
        m16964a();
    }
}
