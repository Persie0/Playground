package p479xa;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.Charset;
import java.util.Arrays;
import p482xd.C10170b;

/* JADX INFO: renamed from: xa.t */
/* JADX INFO: loaded from: classes.dex */
public final class C10151t {

    /* JADX INFO: renamed from: d */
    public static final char[] f51435d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f51436e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final ImmutableSet<Charset> f51437f = ImmutableSet.m9078G(5, C10170b.f51475a, C10170b.f51477c, C10170b.f51480f, C10170b.f51478d, C10170b.f51479e);

    /* JADX INFO: renamed from: a */
    public byte[] f51438a;

    /* JADX INFO: renamed from: b */
    public int f51439b;

    /* JADX INFO: renamed from: c */
    public int f51440c;

    public C10151t() {
        this.f51438a = C10134c0.f51359f;
    }

    public C10151t(int i10) {
        this.f51438a = new byte[i10];
        this.f51440c = i10;
    }

    public C10151t(byte[] bArr) {
        this.f51438a = bArr;
        this.f51440c = bArr.length;
    }

    public C10151t(byte[] bArr, int i10) {
        this.f51438a = bArr;
        this.f51440c = i10;
    }

    /* JADX INFO: renamed from: A */
    public final Charset m19120A() {
        int i10 = this.f51440c;
        int i11 = this.f51439b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f51438a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f51439b = i11 + 3;
                return C10170b.f51477c;
            }
        }
        if (i10 - i11 >= 2) {
            byte[] bArr2 = this.f51438a;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f51439b = i11 + 2;
                return C10170b.f51478d;
            }
            if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f51439b = i11 + 2;
                return C10170b.f51479e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m19121B(int i10) {
        byte[] bArr = this.f51438a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        m19122C(bArr, i10);
    }

    /* JADX INFO: renamed from: C */
    public final void m19122C(byte[] bArr, int i10) {
        this.f51438a = bArr;
        this.f51440c = i10;
        this.f51439b = 0;
    }

    /* JADX INFO: renamed from: D */
    public final void m19123D(int i10) {
        C10129a.m18990b(i10 >= 0 && i10 <= this.f51438a.length);
        this.f51440c = i10;
    }

    /* JADX INFO: renamed from: E */
    public final void m19124E(int i10) {
        C10129a.m18990b(i10 >= 0 && i10 <= this.f51440c);
        this.f51439b = i10;
    }

    /* JADX INFO: renamed from: F */
    public final void m19125F(int i10) {
        m19124E(this.f51439b + i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m19126a(int i10) {
        byte[] bArr = this.f51438a;
        if (i10 > bArr.length) {
            this.f51438a = Arrays.copyOf(bArr, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19127b(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f51438a, this.f51439b, bArr, i10, i11);
        this.f51439b += i11;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5 A[LOOP:0: B:33:0x00ac->B:37:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final char m19128c(Charset charset, char[] cArr) {
        char c10;
        int i10;
        int length;
        int i11;
        boolean z10;
        long j10;
        char c11;
        boolean z11;
        int i12;
        int i13;
        byte b10;
        int i14;
        int i15;
        int i16;
        if (charset.equals(C10170b.f51477c) || charset.equals(C10170b.f51475a)) {
            int i17 = this.f51440c;
            int i18 = this.f51439b;
            if (i17 - i18 >= 1) {
                long j11 = this.f51438a[i18] & 255;
                c10 = (char) j11;
                if (!(((long) c10) == j11)) {
                    throw new IllegalArgumentException(C0062b.m254C1("Out of range: %s", Long.valueOf(j11)));
                }
                i10 = 1;
            } else {
                i10 = 2;
                if (!charset.equals(C10170b.f51480f) || charset.equals(C10170b.f51478d)) {
                    i12 = this.f51440c;
                    i13 = this.f51439b;
                    if (i12 - i13 >= 2) {
                        byte[] bArr = this.f51438a;
                        byte b11 = bArr[i13];
                        b10 = bArr[i13 + 1];
                        i14 = b11 << 8;
                    } else if (charset.equals(C10170b.f51479e)) {
                        i15 = this.f51440c;
                        i16 = this.f51439b;
                        if (i15 - i16 >= 2) {
                            byte[] bArr2 = this.f51438a;
                            byte b12 = bArr2[i16 + 1];
                            b10 = bArr2[i16];
                            i14 = b12 << 8;
                        }
                    }
                    c10 = (char) ((b10 & 255) | i14);
                } else if (charset.equals(C10170b.f51479e)) {
                    i15 = this.f51440c;
                    i16 = this.f51439b;
                    if (i15 - i16 >= 2) {
                        byte[] bArr3 = this.f51438a;
                        byte b13 = bArr3[i16 + 1];
                        b10 = bArr3[i16];
                        i14 = b13 << 8;
                        c10 = (char) ((b10 & 255) | i14);
                    }
                }
            }
            length = cArr.length;
            i11 = 0;
            while (true) {
                if (i11 < length) {
                    z10 = false;
                    break;
                }
                if (cArr[i11] == c10) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            if (z10) {
                this.f51439b += i10;
                j10 = c10;
                c11 = (char) j10;
                if (c11 == j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return c11;
                }
                throw new IllegalArgumentException(C0062b.m254C1("Out of range: %s", Long.valueOf(j10)));
            }
        } else {
            i10 = 2;
            if (charset.equals(C10170b.f51480f)) {
                i12 = this.f51440c;
                i13 = this.f51439b;
                if (i12 - i13 >= 2) {
                    byte[] bArr4 = this.f51438a;
                    byte b14 = bArr4[i13];
                    b10 = bArr4[i13 + 1];
                    i14 = b14 << 8;
                } else if (charset.equals(C10170b.f51479e)) {
                    i15 = this.f51440c;
                    i16 = this.f51439b;
                    if (i15 - i16 >= 2) {
                        byte[] bArr5 = this.f51438a;
                        byte b15 = bArr5[i16 + 1];
                        b10 = bArr5[i16];
                        i14 = b15 << 8;
                    }
                }
            } else {
                i12 = this.f51440c;
                i13 = this.f51439b;
                if (i12 - i13 >= 2) {
                    byte[] bArr6 = this.f51438a;
                    byte b16 = bArr6[i13];
                    b10 = bArr6[i13 + 1];
                    i14 = b16 << 8;
                } else if (charset.equals(C10170b.f51479e)) {
                    i15 = this.f51440c;
                    i16 = this.f51439b;
                    if (i15 - i16 >= 2) {
                        byte[] bArr7 = this.f51438a;
                        byte b17 = bArr7[i16 + 1];
                        b10 = bArr7[i16];
                        i14 = b17 << 8;
                    }
                }
            }
            c10 = (char) ((b10 & 255) | i14);
            length = cArr.length;
            i11 = 0;
            while (true) {
                if (i11 < length) {
                    z10 = false;
                    break;
                }
                if (cArr[i11] == c10) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            if (z10) {
                this.f51439b += i10;
                j10 = c10;
                c11 = (char) j10;
                if (c11 == j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return c11;
                }
                throw new IllegalArgumentException(C0062b.m254C1("Out of range: %s", Long.valueOf(j10)));
            }
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m19129d() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f51439b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    /* JADX INFO: renamed from: e */
    public final String m19130e() {
        return m19131f(C10170b.f51477c);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final String m19131f(Charset charset) {
        int i10;
        byte[] bArr;
        byte[] bArr2;
        C10129a.m18989a("Unsupported charset: " + charset, f51437f.contains(charset));
        if (this.f51440c - this.f51439b == 0) {
            return null;
        }
        Charset charset2 = C10170b.f51475a;
        if (!charset.equals(charset2)) {
            m19120A();
        }
        if (charset.equals(C10170b.f51477c) || charset.equals(charset2)) {
            i10 = 1;
        } else {
            if (!charset.equals(C10170b.f51480f) && !charset.equals(C10170b.f51479e)) {
                if (!charset.equals(C10170b.f51478d)) {
                    throw new IllegalArgumentException("Unsupported charset: " + charset);
                }
            }
            i10 = 2;
        }
        int i11 = this.f51439b;
        while (true) {
            int i12 = this.f51440c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if (charset.equals(C10170b.f51477c) || charset.equals(C10170b.f51475a)) {
                if (C10134c0.m19023H(this.f51438a[i11])) {
                    break;
                }
                if (!charset.equals(C10170b.f51480f) || charset.equals(C10170b.f51478d)) {
                    bArr = this.f51438a;
                    if (bArr[i11] != 0 && C10134c0.m19023H(bArr[i11 + 1])) {
                        break;
                    }
                    if (charset.equals(C10170b.f51479e)) {
                        bArr2 = this.f51438a;
                        if (bArr2[i11 + 1] == 0 && C10134c0.m19023H(bArr2[i11])) {
                            break;
                        }
                    }
                    i11 += i10;
                } else {
                    if (charset.equals(C10170b.f51479e)) {
                        bArr2 = this.f51438a;
                        if (bArr2[i11 + 1] == 0) {
                            continue;
                        }
                    }
                    i11 += i10;
                }
            } else if (charset.equals(C10170b.f51480f)) {
                bArr = this.f51438a;
                if (bArr[i11] != 0) {
                    if (charset.equals(C10170b.f51479e)) {
                        bArr2 = this.f51438a;
                        if (bArr2[i11 + 1] == 0) {
                            continue;
                        }
                    }
                    i11 += i10;
                } else {
                    if (charset.equals(C10170b.f51479e)) {
                        bArr2 = this.f51438a;
                        if (bArr2[i11 + 1] == 0) {
                            continue;
                        }
                    }
                    i11 += i10;
                }
            } else {
                bArr = this.f51438a;
                if (bArr[i11] != 0) {
                    if (charset.equals(C10170b.f51479e)) {
                        bArr2 = this.f51438a;
                        if (bArr2[i11 + 1] == 0) {
                            continue;
                        }
                    }
                    i11 += i10;
                } else {
                    if (charset.equals(C10170b.f51479e)) {
                        bArr2 = this.f51438a;
                        if (bArr2[i11 + 1] == 0) {
                            continue;
                        }
                    }
                    i11 += i10;
                }
            }
        }
        String strM19143r = m19143r(i11 - this.f51439b, charset);
        if (this.f51439b == this.f51440c) {
            return strM19143r;
        }
        if (m19128c(charset, f51435d) == '\r') {
            m19128c(charset, f51436e);
        }
        return strM19143r;
    }

    /* JADX INFO: renamed from: g */
    public final int m19132g() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f51439b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    /* JADX INFO: renamed from: h */
    public final long m19133h() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 48);
        this.f51439b = i17 + 1;
        return j15 | ((((long) bArr[i17]) & 255) << 56);
    }

    /* JADX INFO: renamed from: i */
    public final short m19134i() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f51439b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    /* JADX INFO: renamed from: j */
    public final long m19135j() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        this.f51439b = i13 + 1;
        return j11 | ((((long) bArr[i13]) & 255) << 24);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final int m19136k() {
        int iM19132g = m19132g();
        if (iM19132g >= 0) {
            return iM19132g;
        }
        throw new IllegalStateException(C0166e.m761g("Top bit not zero: ", iM19132g));
    }

    /* JADX INFO: renamed from: l */
    public final int m19137l() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f51439b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    /* JADX INFO: renamed from: m */
    public final long m19138m() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 8);
        this.f51439b = i17 + 1;
        return j15 | (((long) bArr[i17]) & 255);
    }

    /* JADX INFO: renamed from: n */
    public final String m19139n() {
        int i10 = this.f51440c;
        int i11 = this.f51439b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f51440c && this.f51438a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f51438a;
        int i12 = this.f51439b;
        int i13 = C10134c0.f51354a;
        String str = new String(bArr, i12, i11 - i12, C10170b.f51477c);
        this.f51439b = i11;
        if (i11 < this.f51440c) {
            this.f51439b = i11 + 1;
        }
        return str;
    }

    /* JADX INFO: renamed from: o */
    public final String m19140o(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f51439b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f51440c || this.f51438a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f51438a;
        int i14 = C10134c0.f51354a;
        String str = new String(bArr, i11, i13, C10170b.f51477c);
        this.f51439b += i10;
        return str;
    }

    /* JADX INFO: renamed from: p */
    public final short m19141p() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f51439b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    /* JADX INFO: renamed from: q */
    public final String m19142q(int i10) {
        return m19143r(i10, C10170b.f51477c);
    }

    /* JADX INFO: renamed from: r */
    public final String m19143r(int i10, Charset charset) {
        String str = new String(this.f51438a, this.f51439b, i10, charset);
        this.f51439b += i10;
        return str;
    }

    /* JADX INFO: renamed from: s */
    public final int m19144s() {
        return (m19145t() << 21) | (m19145t() << 14) | (m19145t() << 7) | m19145t();
    }

    /* JADX INFO: renamed from: t */
    public final int m19145t() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        this.f51439b = i10 + 1;
        return bArr[i10] & 255;
    }

    /* JADX INFO: renamed from: u */
    public final long m19146u() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
        this.f51439b = i13 + 1;
        return j11 | (((long) bArr[i13]) & 255);
    }

    /* JADX INFO: renamed from: v */
    public final int m19147v() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f51439b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public final int m19148w() {
        int iM19129d = m19129d();
        if (iM19129d >= 0) {
            return iM19129d;
        }
        throw new IllegalStateException(C0166e.m761g("Top bit not zero: ", iM19129d));
    }

    /* JADX INFO: renamed from: x */
    public final long m19149x() {
        long jM19138m = m19138m();
        if (jM19138m >= 0) {
            return jM19138m;
        }
        throw new IllegalStateException(C0166e.m763i("Top bit not zero: ", jM19138m));
    }

    /* JADX INFO: renamed from: y */
    public final int m19150y() {
        byte[] bArr = this.f51438a;
        int i10 = this.f51439b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f51439b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: z */
    public final long m19151z() {
        int i10;
        int i11;
        long j10 = this.f51438a[this.f51439b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException(C0166e.m763i("Invalid UTF-8 sequence first byte: ", j10));
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f51438a[this.f51439b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(C0166e.m763i("Invalid UTF-8 sequence continuation byte: ", j10));
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f51439b += i11;
        return j10;
    }
}
