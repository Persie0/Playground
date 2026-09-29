package p000;

import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.AbstractC1110a;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class k47 {

    /* JADX INFO: renamed from: d */
    public static final char[] f46696d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f46697e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final ImmutableSet f46698f = ImmutableSet.m6307m(new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE}, 5);

    /* JADX INFO: renamed from: g */
    public static final AtomicBoolean f46699g = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public byte[] f46700a;

    /* JADX INFO: renamed from: b */
    public int f46701b;

    /* JADX INFO: renamed from: c */
    public int f46702c;

    public k47(int i) {
        this.f46700a = new byte[i];
        this.f46702c = i;
    }

    /* JADX INFO: renamed from: b */
    public static int m14803b(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return AbstractC1110a.m6363c((byte) 0, k9d.m15027a(((i & 7) << 2) | ((i2 & 48) >> 4)), k9d.m15027a(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), k9d.m15027a(((b & 3) << 6) | (((byte) i4) & 63)));
    }

    /* JADX INFO: renamed from: d */
    public static int m14804d(Charset charset) {
        bna.m3971r(f46698f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14805e(byte b) {
        return (b & 192) == 128;
    }

    /* JADX INFO: renamed from: A */
    public final int m14806A() {
        m14822f(4);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f46701b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f46701b = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: B */
    public final long m14807B() {
        m14822f(4);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f46701b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f46701b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f46701b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: C */
    public final int m14808C() {
        m14822f(3);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f46701b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f46701b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: D */
    public final int m14809D() {
        int iM14829m = m14829m();
        if (iM14829m >= 0) {
            return iM14829m;
        }
        C3386nv.m17633t(ux5.m22988k(iM14829m, "Top bit not zero: "));
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public final int m14810E() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f46701b == this.f46702c) {
                C3386nv.m17633t("Attempting to read a byte over the limit.");
                return 0;
            }
            long jM14842z = m14842z();
            j |= (127 & jM14842z) << (i * 7);
            if ((jM14842z & 128) == 0) {
                break;
            }
        }
        return AbstractC1110a.m6362b(j);
    }

    /* JADX INFO: renamed from: F */
    public final long m14811F() {
        long jM14836t = m14836t();
        if (jM14836t >= 0) {
            return jM14836t;
        }
        C3386nv.m17633t(wq1.m24116l("Top bit not zero: ", jM14836t));
        return 0L;
    }

    /* JADX INFO: renamed from: G */
    public final int m14812G() {
        m14822f(2);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f46701b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    /* JADX INFO: renamed from: H */
    public final long m14813H() {
        int i;
        m14822f(1);
        long j = this.f46700a[this.f46701b];
        int i2 = 7;
        while (true) {
            if (i2 >= 0) {
                int i3 = 1 << i2;
                if ((((long) i3) & j) == 0) {
                    if (i2 < 6) {
                        j &= (long) (i3 - 1);
                        i = 7 - i2;
                        break;
                    }
                    if (i2 == 7) {
                        i = 1;
                        break;
                    }
                } else {
                    i2--;
                }
            }
            i = 0;
            break;
        }
        if (i == 0) {
            throw new NumberFormatException(wq1.m24116l("Invalid UTF-8 sequence first byte: ", j));
        }
        m14822f(i);
        for (int i4 = 1; i4 < i; i4++) {
            byte b = this.f46700a[this.f46701b + i4];
            if ((b & 192) != 128) {
                throw new NumberFormatException(wq1.m24116l("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f46701b += i;
        return j;
    }

    /* JADX INFO: renamed from: I */
    public final Charset m14814I() {
        if (m14820a() >= 3) {
            byte[] bArr = this.f46700a;
            int i = this.f46701b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f46701b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m14820a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f46700a;
        int i2 = this.f46701b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f46701b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f46701b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: J */
    public final void m14815J(int i) {
        byte[] bArr = this.f46700a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m14816K(i, bArr);
    }

    /* JADX INFO: renamed from: K */
    public final void m14816K(int i, byte[] bArr) {
        this.f46700a = bArr;
        this.f46702c = i;
        this.f46701b = 0;
    }

    /* JADX INFO: renamed from: L */
    public final void m14817L(int i) {
        bna.m3969q(i >= 0 && i <= this.f46700a.length);
        this.f46702c = i;
    }

    /* JADX INFO: renamed from: M */
    public final void m14818M(int i) {
        bna.m3969q(i >= 0 && i <= this.f46702c);
        this.f46701b = i;
    }

    /* JADX INFO: renamed from: N */
    public final void m14819N(int i) {
        m14818M(this.f46701b + i);
    }

    /* JADX INFO: renamed from: a */
    public final int m14820a() {
        return Math.max(this.f46702c - this.f46701b, 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m14821c(int i) {
        byte[] bArr = this.f46700a;
        if (i > bArr.length) {
            this.f46700a = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14822f(int i) {
        if (!f46699g.get() || m14820a() >= i) {
            return;
        }
        ij6.m13949f(m14820a(), ux5.m22998u("bytesNeeded= ", i, ", bytesLeft="));
    }

    /* JADX INFO: renamed from: g */
    public final char m14823g(int i, ByteOrder byteOrder) {
        m14822f(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.f46700a;
        int i2 = this.f46701b;
        if (byteOrder == byteOrder2) {
            int i3 = i2 + i;
            return h6d.m13104c(bArr[i3], bArr[i3 + 1]);
        }
        int i4 = i2 + i;
        return h6d.m13104c(bArr[i4 + 1], bArr[i4]);
    }

    /* JADX INFO: renamed from: h */
    public final int m14824h(Charset charset) {
        int codePoint;
        int i;
        bna.m3971r(f46698f.contains(charset), "Unsupported charset: %s", charset);
        if (m14820a() < m14804d(charset)) {
            fg2.m11818g(this.f46701b, this.f46702c);
            return 0;
        }
        int i2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.f46700a[this.f46701b];
            if ((b & 128) == 0) {
                codePoint = k9d.m15029c(b);
                return (codePoint << 8) | i2;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.f46700a[this.f46701b];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & 224) == 192 && m14820a() >= 2 && m14805e(this.f46700a[this.f46701b + 1])) {
                i = 2;
            } else if ((this.f46700a[this.f46701b] & 240) == 224 && m14820a() >= 3 && m14805e(this.f46700a[this.f46701b + 1]) && m14805e(this.f46700a[this.f46701b + 2])) {
                i = 3;
            } else {
                i = ((this.f46700a[this.f46701b] & 248) == 240 && m14820a() >= 4 && m14805e(this.f46700a[this.f46701b + 1]) && m14805e(this.f46700a[this.f46701b + 2]) && m14805e(this.f46700a[this.f46701b + 3])) ? 4 : 0;
            }
            if (i == 1) {
                codePoint = k9d.m15029c(this.f46700a[this.f46701b]);
            } else if (i == 2) {
                byte[] bArr = this.f46700a;
                int i3 = this.f46701b;
                codePoint = m14803b(0, 0, bArr[i3], bArr[i3 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr2 = this.f46700a;
                        int i4 = this.f46701b;
                        codePoint = m14803b(bArr2[i4], bArr2[i4 + 1], bArr2[i4 + 2], bArr2[i4 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.f46700a;
                int i5 = this.f46701b;
                codePoint = m14803b(0, bArr3[i5] & 15, bArr3[i5 + 1], bArr3[i5 + 2]);
            }
            i2 = i;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cM14823g = m14823g(0, byteOrder);
            if (!Character.isHighSurrogate(cM14823g) || m14820a() < 4) {
                codePoint = cM14823g;
                i2 = 2;
            } else {
                codePoint = Character.toCodePoint(cM14823g, m14823g(2, byteOrder));
                i2 = 4;
            }
        }
        return (codePoint << 8) | i2;
    }

    /* JADX INFO: renamed from: i */
    public final int m14825i() {
        if (m14820a() < 4) {
            fg2.m11818g(this.f46701b, this.f46702c);
            return 0;
        }
        int iM14829m = m14829m();
        this.f46701b -= 4;
        return iM14829m;
    }

    /* JADX INFO: renamed from: j */
    public final int m14826j() {
        m14822f(1);
        return this.f46700a[this.f46701b] & 255;
    }

    /* JADX INFO: renamed from: k */
    public final void m14827k(byte[] bArr, int i, int i2) {
        m14822f(i2);
        System.arraycopy(this.f46700a, this.f46701b, bArr, i, i2);
        this.f46701b += i2;
    }

    /* JADX INFO: renamed from: l */
    public final char m14828l(Charset charset, char[] cArr) {
        int iM14824h;
        if (m14820a() < m14804d(charset) || (iM14824h = m14824h(charset)) == 0) {
            return (char) 0;
        }
        int iM16705b = m9d.m16705b(iM14824h >>> 8);
        if (Character.isSupplementaryCodePoint(iM16705b)) {
            return (char) 0;
        }
        char cM13102a = h6d.m13102a(iM16705b);
        if (!h6d.m13103b(cArr, cM13102a)) {
            return (char) 0;
        }
        this.f46701b = AbstractC1110a.m6362b(iM14824h & 255) + this.f46701b;
        return cM13102a;
    }

    /* JADX INFO: renamed from: m */
    public final int m14829m() {
        m14822f(4);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f46701b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f46701b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f46701b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5 A[ADDED_TO_REGION, EDGE_INSN: B:65:0x00b5->B:55:0x00b5 BREAK  A[LOOP:0: B:25:0x0051->B:53:0x00b2], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5 A[ADDED_TO_REGION, EDGE_INSN: B:67:0x00b5->B:55:0x00b5 BREAK  A[LOOP:0: B:25:0x0051->B:53:0x00b2], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final String m14830n(Charset charset) {
        int i;
        byte[] bArr;
        byte b;
        byte[] bArr2;
        byte b2;
        bna.m3971r(f46698f.contains(charset), "Unsupported charset: %s", charset);
        if (m14820a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m14814I();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                v63.m23142t(charset, "Unsupported charset: ");
                return null;
            }
            i = 2;
        }
        int i2 = this.f46701b;
        while (true) {
            int i3 = this.f46702c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b3 = this.f46700a[i2];
                String str = uma.f64080a;
                if (b3 == 10 || b3 == 13) {
                    break;
                }
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    bArr = this.f46700a;
                    if (bArr[i2] == 0) {
                        b = bArr[i2 + 1];
                        String str2 = uma.f64080a;
                        if (b != 10 || b == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f46700a;
                            if (bArr2[i2 + 1] == 0) {
                                b2 = bArr2[i2];
                                String str3 = uma.f64080a;
                                if (b2 != 10 || b2 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2 += i;
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f46700a;
                            if (bArr2[i2 + 1] == 0) {
                                b2 = bArr2[i2];
                                String str4 = uma.f64080a;
                                if (b2 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i2 += i;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr2 = this.f46700a;
                        if (bArr2[i2 + 1] == 0) {
                            b2 = bArr2[i2];
                            String str5 = uma.f64080a;
                            if (b2 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i2 += i;
                }
            } else if (charset.equals(StandardCharsets.UTF_16)) {
                bArr = this.f46700a;
                if (bArr[i2] == 0) {
                    b = bArr[i2 + 1];
                    String str6 = uma.f64080a;
                    if (b != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f46700a;
                    if (bArr2[i2 + 1] == 0) {
                        b2 = bArr2[i2];
                        String str7 = uma.f64080a;
                        if (b2 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i2 += i;
            } else {
                bArr = this.f46700a;
                if (bArr[i2] == 0) {
                    b = bArr[i2 + 1];
                    String str8 = uma.f64080a;
                    if (b != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f46700a;
                    if (bArr2[i2 + 1] == 0) {
                        b2 = bArr2[i2];
                        String str9 = uma.f64080a;
                        if (b2 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i2 += i;
            }
        }
        String strM14840x = m14840x(i2 - this.f46701b, charset);
        if (this.f46701b != this.f46702c && m14828l(charset, f46696d) == '\r') {
            m14828l(charset, f46697e);
        }
        return strM14840x;
    }

    /* JADX INFO: renamed from: o */
    public final int m14831o() {
        m14822f(4);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f46701b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f46701b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f46701b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: p */
    public final long m14832p() {
        m14822f(8);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f46701b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f46701b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f46701b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f46701b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f46701b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f46701b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f46701b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: q */
    public final long m14833q() {
        m14822f(4);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f46701b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f46701b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f46701b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: r */
    public final int m14834r() {
        int iM14831o = m14831o();
        if (iM14831o >= 0) {
            return iM14831o;
        }
        C3386nv.m17633t(ux5.m22988k(iM14831o, "Top bit not zero: "));
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public final int m14835s() {
        m14822f(2);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        int i3 = bArr[i] & 255;
        this.f46701b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: t */
    public final long m14836t() {
        m14822f(8);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f46701b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f46701b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f46701b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f46701b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f46701b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f46701b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f46701b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    /* JADX INFO: renamed from: u */
    public final String m14837u() {
        if (m14820a() == 0) {
            return null;
        }
        int i = this.f46701b;
        while (i < this.f46702c && this.f46700a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f46700a;
        int i2 = this.f46701b;
        String str = uma.f64080a;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.f46701b = i;
        if (i < this.f46702c) {
            this.f46701b = i + 1;
        }
        return str2;
    }

    /* JADX INFO: renamed from: v */
    public final String m14838v(int i) {
        m14822f(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.f46701b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f46702c || this.f46700a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f46700a;
        String str = uma.f64080a;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.f46701b += i;
        return str2;
    }

    /* JADX INFO: renamed from: w */
    public final short m14839w() {
        m14822f(2);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        int i2 = i + 1;
        this.f46701b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f46701b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* JADX INFO: renamed from: x */
    public final String m14840x(int i, Charset charset) {
        m14822f(i);
        String str = new String(this.f46700a, this.f46701b, i, charset);
        this.f46701b += i;
        return str;
    }

    /* JADX INFO: renamed from: y */
    public final int m14841y() {
        return m14842z() | (m14842z() << 21) | (m14842z() << 14) | (m14842z() << 7);
    }

    /* JADX INFO: renamed from: z */
    public final int m14842z() {
        m14822f(1);
        byte[] bArr = this.f46700a;
        int i = this.f46701b;
        this.f46701b = i + 1;
        return bArr[i] & 255;
    }

    public k47() {
        this.f46700a = uma.f64081b;
    }

    public k47(byte[] bArr) {
        this.f46700a = bArr;
        this.f46702c = bArr.length;
    }

    public k47(int i, byte[] bArr) {
        this.f46700a = bArr;
        this.f46702c = i;
    }
}
