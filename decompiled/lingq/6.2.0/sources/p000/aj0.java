package p000;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;
import okio.SegmentedByteString;

/* JADX INFO: loaded from: classes.dex */
public final class aj0 implements hj0, gj0, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a */
    public zt8 f722a;

    /* JADX INFO: renamed from: b */
    public long f723b;

    /* JADX INFO: renamed from: A */
    public final boolean m455A(long j, ByteString byteString, int i) {
        byteString.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.f723b && i <= byteString.mo18078d()) {
            return i == 0 || AbstractC0792b.m3129a(this, byteString, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: B */
    public final long mo456B(yd9 yd9Var) {
        yd9Var.getClass();
        long j = 0;
        while (true) {
            long jMo459F = yd9Var.mo459F(this, 8192L);
            if (jMo459F == -1) {
                return j;
            }
            j += jMo459F;
        }
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: D */
    public final String mo457D(long j) throws EOFException {
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("limit < 0: ", j));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM498u = m498u((byte) 10, 0L, j2);
        if (jM498u != -1) {
            return AbstractC0792b.m3131c(this, jM498u);
        }
        if (j2 < this.f723b && m494q(j2 - 1) == 13 && m494q(j2) == 10) {
            return AbstractC0792b.m3131c(this, j2);
        }
        aj0 aj0Var = new aj0();
        m479e(aj0Var, 0L, Math.min(32L, this.f723b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f723b, j) + " content=" + aj0Var.mo497s(aj0Var.f723b).mo18079e() + (char) 8230);
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: E */
    public final long mo458E(gj0 gj0Var) {
        long j = this.f723b;
        if (j > 0) {
            gj0Var.mo471X(this, j);
        }
        return j;
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) {
        aj0Var.getClass();
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return 0L;
        }
        long j2 = this.f723b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        aj0Var.mo471X(this, j);
        return j;
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: G */
    public final /* bridge */ /* synthetic */ gj0 mo460G(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: H */
    public final /* bridge */ /* synthetic */ gj0 mo461H(String str) {
        m495q0(str);
        return this;
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: K */
    public final String mo462K(Charset charset) {
        charset.getClass();
        return m470W(this.f723b, charset);
    }

    /* JADX INFO: renamed from: N */
    public final byte[] m463N(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C3386nv.m17624j(wq1.m24116l("byteCount: ", j));
            return null;
        }
        if (this.f723b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: P */
    public final boolean mo464P(long j) {
        return this.f723b >= j;
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: Q */
    public final int mo465Q() throws EOFException {
        int i = readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX INFO: renamed from: R */
    public final long m466R() {
        long j;
        byte b;
        long j2 = 0;
        if (this.f723b == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            zt8 zt8Var = this.f722a;
            zt8Var.getClass();
            byte[] bArr = zt8Var.f72153a;
            int i2 = zt8Var.f72154b;
            int i3 = zt8Var.f72155c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.f722a = zt8Var.m25776a();
                cu8.m9897a(zt8Var);
            } else {
                zt8Var.f72154b = i2;
            }
            if (z2 || this.f722a == null) {
                long j5 = this.f723b - ((long) i);
                this.f723b = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                StringBuilder sbM22999v = ux5.m22999v(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbM22999v.append(te1.m21983P(m494q(j)));
                throw new NumberFormatException(sbM22999v.toString());
            }
            j2 = j;
        }
        aj0 aj0Var = new aj0();
        aj0Var.m488l0(j3);
        aj0Var.m487k0(b);
        if (!z) {
            aj0Var.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(aj0Var.m472Y()));
    }

    /* JADX INFO: renamed from: T */
    public final long m467T() throws EOFException {
        int i;
        if (this.f723b == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            zt8 zt8Var = this.f722a;
            zt8Var.getClass();
            byte[] bArr = zt8Var.f72153a;
            int i3 = zt8Var.f72154b;
            int i4 = zt8Var.f72155c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(te1.m21983P(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    aj0 aj0Var = new aj0();
                    aj0Var.m489m0(j);
                    aj0Var.m487k0(b);
                    throw new NumberFormatException("Number too large: ".concat(aj0Var.m472Y()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f722a = zt8Var.m25776a();
                cu8.m9897a(zt8Var);
            } else {
                zt8Var.f72154b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f722a != null);
        this.f723b -= (long) i2;
        return j;
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: U */
    public final /* bridge */ /* synthetic */ gj0 mo468U(ByteString byteString) {
        m486j0(byteString);
        return this;
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: V */
    public final short mo469V() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    /* JADX INFO: renamed from: W */
    public final String m470W(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            C3386nv.m17624j(wq1.m24116l("byteCount: ", j));
            return null;
        }
        if (this.f723b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        zt8 zt8Var = this.f722a;
        zt8Var.getClass();
        int i = zt8Var.f72154b;
        if (((long) i) + j > zt8Var.f72155c) {
            return new String(m463N(j), charset);
        }
        int i2 = (int) j;
        String str = new String(zt8Var.f72153a, i, i2, charset);
        int i3 = zt8Var.f72154b + i2;
        zt8Var.f72154b = i3;
        this.f723b -= j;
        if (i3 == zt8Var.f72155c) {
            this.f722a = zt8Var.m25776a();
            cu8.m9897a(zt8Var);
        }
        return str;
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: X */
    public final void mo471X(aj0 aj0Var, long j) {
        zt8 zt8VarM9898b;
        aj0Var.getClass();
        if (aj0Var == this) {
            C3386nv.m17626m("source == this");
            return;
        }
        te1.m22001o(aj0Var.f723b, 0L, j);
        while (j > 0) {
            zt8 zt8Var = aj0Var.f722a;
            zt8Var.getClass();
            int i = zt8Var.f72155c;
            zt8 zt8Var2 = aj0Var.f722a;
            zt8Var2.getClass();
            long j2 = i - zt8Var2.f72154b;
            int i2 = 0;
            if (j < j2) {
                zt8 zt8Var3 = this.f722a;
                zt8 zt8Var4 = zt8Var3 != null ? zt8Var3.f72159g : null;
                if (zt8Var4 != null && zt8Var4.f72157e) {
                    if ((((long) zt8Var4.f72155c) + j) - ((long) (zt8Var4.f72156d ? 0 : zt8Var4.f72154b)) <= 8192) {
                        zt8 zt8Var5 = aj0Var.f722a;
                        zt8Var5.getClass();
                        zt8Var5.m25779d(zt8Var4, (int) j);
                        aj0Var.f723b -= j;
                        this.f723b += j;
                        return;
                    }
                }
                zt8 zt8Var6 = aj0Var.f722a;
                zt8Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > zt8Var6.f72155c - zt8Var6.f72154b) {
                    C3386nv.m17626m("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    zt8VarM9898b = zt8Var6.m25778c();
                } else {
                    zt8VarM9898b = cu8.m9898b();
                    byte[] bArr = zt8Var6.f72153a;
                    byte[] bArr2 = zt8VarM9898b.f72153a;
                    int i4 = zt8Var6.f72154b;
                    AbstractC3550rv.m20827U(bArr, 0, bArr2, i4, i4 + i3);
                }
                zt8VarM9898b.f72155c = zt8VarM9898b.f72154b + i3;
                zt8Var6.f72154b += i3;
                zt8 zt8Var7 = zt8Var6.f72159g;
                zt8Var7.getClass();
                zt8Var7.m25777b(zt8VarM9898b);
                aj0Var.f722a = zt8VarM9898b;
            }
            zt8 zt8Var8 = aj0Var.f722a;
            zt8Var8.getClass();
            long j3 = zt8Var8.f72155c - zt8Var8.f72154b;
            aj0Var.f722a = zt8Var8.m25776a();
            zt8 zt8Var9 = this.f722a;
            if (zt8Var9 == null) {
                this.f722a = zt8Var8;
                zt8Var8.f72159g = zt8Var8;
                zt8Var8.f72158f = zt8Var8;
            } else {
                zt8 zt8Var10 = zt8Var9.f72159g;
                zt8Var10.getClass();
                zt8Var10.m25777b(zt8Var8);
                zt8 zt8Var11 = zt8Var8.f72159g;
                if (zt8Var11 == zt8Var8) {
                    C3386nv.m17633t("cannot compact");
                    return;
                }
                zt8Var11.getClass();
                if (zt8Var11.f72157e) {
                    int i5 = zt8Var8.f72155c - zt8Var8.f72154b;
                    zt8 zt8Var12 = zt8Var8.f72159g;
                    zt8Var12.getClass();
                    int i6 = 8192 - zt8Var12.f72155c;
                    zt8 zt8Var13 = zt8Var8.f72159g;
                    zt8Var13.getClass();
                    if (!zt8Var13.f72156d) {
                        zt8 zt8Var14 = zt8Var8.f72159g;
                        zt8Var14.getClass();
                        i2 = zt8Var14.f72154b;
                    }
                    if (i5 <= i6 + i2) {
                        zt8 zt8Var15 = zt8Var8.f72159g;
                        zt8Var15.getClass();
                        zt8Var8.m25779d(zt8Var15, i5);
                        zt8Var8.m25776a();
                        cu8.m9897a(zt8Var8);
                    }
                }
            }
            aj0Var.f723b -= j3;
            this.f723b += j3;
            j -= j3;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final String m472Y() {
        return m470W(this.f723b, yu0.f70463a);
    }

    /* JADX INFO: renamed from: a */
    public final void m473a() throws EOFException {
        skip(this.f723b);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aj0 clone() {
        aj0 aj0Var = new aj0();
        if (this.f723b == 0) {
            return aj0Var;
        }
        zt8 zt8Var = this.f722a;
        zt8Var.getClass();
        zt8 zt8VarM25778c = zt8Var.m25778c();
        aj0Var.f722a = zt8VarM25778c;
        zt8VarM25778c.f72159g = zt8VarM25778c;
        zt8VarM25778c.f72158f = zt8VarM25778c;
        for (zt8 zt8Var2 = zt8Var.f72158f; zt8Var2 != zt8Var; zt8Var2 = zt8Var2.f72158f) {
            zt8 zt8Var3 = zt8VarM25778c.f72159g;
            zt8Var3.getClass();
            zt8Var2.getClass();
            zt8Var3.m25777b(zt8Var2.m25778c());
        }
        aj0Var.f723b = this.f723b;
        return aj0Var;
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: b0 */
    public final void mo475b0(long j) throws EOFException {
        if (this.f723b < j) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m476c() {
        long j = this.f723b;
        if (j == 0) {
            return 0L;
        }
        zt8 zt8Var = this.f722a;
        zt8Var.getClass();
        zt8 zt8Var2 = zt8Var.f72159g;
        zt8Var2.getClass();
        int i = zt8Var2.f72155c;
        return (i >= 8192 || !zt8Var2.f72157e) ? j : j - ((long) (i - zt8Var2.f72154b));
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: c0 */
    public final /* bridge */ /* synthetic */ gj0 mo477c0(long j) {
        m488l0(j);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.t89
    public final void close() {
    }

    @Override // p000.gj0
    /* JADX INFO: renamed from: d0 */
    public final OutputStream mo478d0() {
        return new zi0(this, 0);
    }

    /* JADX INFO: renamed from: e */
    public final void m479e(aj0 aj0Var, long j, long j2) {
        aj0Var.getClass();
        long j3 = j;
        te1.m22001o(this.f723b, j3, j2);
        if (j2 == 0) {
            return;
        }
        aj0Var.f723b += j2;
        zt8 zt8Var = this.f722a;
        while (true) {
            zt8Var.getClass();
            long j4 = zt8Var.f72155c - zt8Var.f72154b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            zt8Var = zt8Var.f72158f;
        }
        long j5 = j2;
        while (j5 > 0) {
            zt8Var.getClass();
            zt8 zt8VarM25778c = zt8Var.m25778c();
            int i = zt8VarM25778c.f72154b + ((int) j3);
            zt8VarM25778c.f72154b = i;
            zt8VarM25778c.f72155c = Math.min(i + ((int) j5), zt8VarM25778c.f72155c);
            zt8 zt8Var2 = aj0Var.f722a;
            if (zt8Var2 == null) {
                zt8VarM25778c.f72159g = zt8VarM25778c;
                zt8VarM25778c.f72158f = zt8VarM25778c;
                aj0Var.f722a = zt8VarM25778c;
            } else {
                zt8 zt8Var3 = zt8Var2.f72159g;
                zt8Var3.getClass();
                zt8Var3.m25777b(zt8VarM25778c);
            }
            j5 -= (long) (zt8VarM25778c.f72155c - zt8VarM25778c.f72154b);
            zt8Var = zt8Var.f72158f;
            j3 = 0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj0)) {
            return false;
        }
        long j = this.f723b;
        aj0 aj0Var = (aj0) obj;
        if (j != aj0Var.f723b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        zt8 zt8Var = this.f722a;
        zt8Var.getClass();
        zt8 zt8Var2 = aj0Var.f722a;
        zt8Var2.getClass();
        int i = zt8Var.f72154b;
        int i2 = zt8Var2.f72154b;
        long j2 = 0;
        while (j2 < this.f723b) {
            long jMin = Math.min(zt8Var.f72155c - i, zt8Var2.f72155c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (zt8Var.f72153a[i] != zt8Var2.f72153a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == zt8Var.f72155c) {
                zt8Var = zt8Var.f72158f;
                zt8Var.getClass();
                i = zt8Var.f72154b;
            }
            if (i2 == zt8Var2.f72155c) {
                zt8Var2 = zt8Var2.f72158f;
                zt8Var2.getClass();
                i2 = zt8Var2.f72154b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: f0 */
    public final InputStream mo480f0() {
        return new yi0(this, 0);
    }

    @Override // p000.gj0, p000.t89, java.io.Flushable
    public final void flush() {
    }

    /* JADX INFO: renamed from: g0 */
    public final int m481g0() {
        int i;
        int i2;
        int i3;
        if (this.f723b == 0) {
            throw new EOFException();
        }
        byte bM494q = m494q(0L);
        if ((bM494q & 128) == 0) {
            i = bM494q & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bM494q & 224) == 192) {
            i = bM494q & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bM494q & 240) == 224) {
            i = bM494q & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bM494q & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bM494q & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f723b < j) {
            StringBuilder sbM22998u = ux5.m22998u("size < ", i2, ": ");
            sbM22998u.append(this.f723b);
            sbM22998u.append(" (to read code point prefixed 0x");
            sbM22998u.append(te1.m21983P(bM494q));
            sbM22998u.append(')');
            throw new EOFException(sbM22998u.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bM494q2 = m494q(j2);
            if ((bM494q2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bM494q2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // p000.hj0, p000.gj0
    /* JADX INFO: renamed from: h */
    public final aj0 mo482h() {
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public final ByteString m483h0(int i) {
        if (i == 0) {
            return ByteString.f54513d;
        }
        te1.m22001o(this.f723b, 0L, i);
        zt8 zt8Var = this.f722a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            zt8Var.getClass();
            int i5 = zt8Var.f72155c;
            int i6 = zt8Var.f72154b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            zt8Var = zt8Var.f72158f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        zt8 zt8Var2 = this.f722a;
        int i7 = 0;
        while (i2 < i) {
            zt8Var2.getClass();
            bArr[i7] = zt8Var2.f72153a;
            i2 += zt8Var2.f72155c - zt8Var2.f72154b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = zt8Var2.f72154b;
            zt8Var2.f72156d = true;
            i7++;
            zt8Var2 = zt8Var2.f72158f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public final int hashCode() {
        zt8 zt8Var = this.f722a;
        if (zt8Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = zt8Var.f72155c;
            for (int i3 = zt8Var.f72154b; i3 < i2; i3++) {
                i = (i * 31) + zt8Var.f72153a[i3];
            }
            zt8Var = zt8Var.f72158f;
            zt8Var.getClass();
        } while (zt8Var != this.f722a);
        return i;
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return c1a.f9314d;
    }

    /* JADX INFO: renamed from: i0 */
    public final zt8 m485i0(int i) {
        if (i < 1 || i > 8192) {
            C3386nv.m17626m("unexpected capacity");
            return null;
        }
        zt8 zt8Var = this.f722a;
        if (zt8Var == null) {
            zt8 zt8VarM9898b = cu8.m9898b();
            this.f722a = zt8VarM9898b;
            zt8VarM9898b.f72159g = zt8VarM9898b;
            zt8VarM9898b.f72158f = zt8VarM9898b;
            return zt8VarM9898b;
        }
        zt8 zt8Var2 = zt8Var.f72159g;
        zt8Var2.getClass();
        if (zt8Var2.f72155c + i <= 8192 && zt8Var2.f72157e) {
            return zt8Var2;
        }
        zt8 zt8VarM9898b2 = cu8.m9898b();
        zt8Var2.m25777b(zt8VarM9898b2);
        return zt8VarM9898b2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m486j0(ByteString byteString) {
        byteString.getClass();
        byteString.mo18090s(this, byteString.mo18078d());
    }

    /* JADX INFO: renamed from: k0 */
    public final void m487k0(int i) {
        zt8 zt8VarM485i0 = m485i0(1);
        byte[] bArr = zt8VarM485i0.f72153a;
        int i2 = zt8VarM485i0.f72155c;
        zt8VarM485i0.f72155c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f723b++;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m488l0(long j) {
        boolean z;
        if (j == 0) {
            m487k0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m495q0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = AbstractC0792b.f7703a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > AbstractC0792b.f7704b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        zt8 zt8VarM485i0 = m485i0(i);
        byte[] bArr2 = zt8VarM485i0.f72153a;
        int i2 = zt8VarM485i0.f72155c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = AbstractC0792b.f7703a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        zt8VarM485i0.f72155c += i;
        this.f723b += (long) i;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m489m0(long j) {
        if (j == 0) {
            m487k0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        zt8 zt8VarM485i0 = m485i0(i);
        byte[] bArr = zt8VarM485i0.f72153a;
        int i2 = zt8VarM485i0.f72155c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC0792b.f7703a[(int) (15 & j)];
            j >>>= 4;
        }
        zt8VarM485i0.f72155c += i;
        this.f723b += (long) i;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m490n0(int i) {
        zt8 zt8VarM485i0 = m485i0(4);
        byte[] bArr = zt8VarM485i0.f72153a;
        int i2 = zt8VarM485i0.f72155c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        zt8VarM485i0.f72155c = i2 + 4;
        this.f723b += 4;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m491o0(int i) {
        zt8 zt8VarM485i0 = m485i0(2);
        byte[] bArr = zt8VarM485i0.f72153a;
        int i2 = zt8VarM485i0.f72155c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        zt8VarM485i0.f72155c = i2 + 2;
        this.f723b += 2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m492p() {
        return this.f723b == 0;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m493p0(int i, String str, int i2) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            C3386nv.m17624j(ux5.m22988k(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C3386nv.m17624j(wq1.m24115k("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            C3386nv.m17623i(str.length(), ux5.m22998u("endIndex > string.length: ", i2, " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                zt8 zt8VarM485i0 = m485i0(1);
                byte[] bArr = zt8VarM485i0.f72153a;
                int i3 = zt8VarM485i0.f72155c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = zt8VarM485i0.f72155c;
                int i6 = (i3 + i) - i5;
                zt8VarM485i0.f72155c = i5 + i6;
                this.f723b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    zt8 zt8VarM485i1 = m485i0(2);
                    byte[] bArr2 = zt8VarM485i1.f72153a;
                    int i7 = zt8VarM485i1.f72155c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    zt8VarM485i1.f72155c = i7 + 2;
                    this.f723b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    zt8 zt8VarM485i2 = m485i0(3);
                    byte[] bArr3 = zt8VarM485i2.f72153a;
                    int i8 = zt8VarM485i2.f72155c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    zt8VarM485i2.f72155c = i8 + 3;
                    this.f723b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m487k0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        zt8 zt8VarM485i3 = m485i0(4);
                        byte[] bArr4 = zt8VarM485i3.f72153a;
                        int i11 = zt8VarM485i3.f72155c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        zt8VarM485i3.f72155c = i11 + 4;
                        this.f723b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final byte m494q(long j) {
        te1.m22001o(this.f723b, j, 1L);
        zt8 zt8Var = this.f722a;
        zt8Var.getClass();
        long j2 = this.f723b;
        if (j2 - j < j) {
            while (j2 > j) {
                zt8Var = zt8Var.f72159g;
                zt8Var.getClass();
                j2 -= (long) (zt8Var.f72155c - zt8Var.f72154b);
            }
            return zt8Var.f72153a[(int) ((((long) zt8Var.f72154b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = zt8Var.f72155c;
            int i2 = zt8Var.f72154b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return zt8Var.f72153a[(int) ((((long) i2) + j) - j3)];
            }
            zt8Var = zt8Var.f72158f;
            zt8Var.getClass();
            j3 = j4;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m495q0(String str) {
        str.getClass();
        m493p0(0, str, str.length());
    }

    /* JADX INFO: renamed from: r0 */
    public final void m496r0(int i) {
        if (i < 128) {
            m487k0(i);
            return;
        }
        if (i < 2048) {
            zt8 zt8VarM485i0 = m485i0(2);
            byte[] bArr = zt8VarM485i0.f72153a;
            int i2 = zt8VarM485i0.f72155c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            zt8VarM485i0.f72155c = i2 + 2;
            this.f723b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m487k0(63);
            return;
        }
        if (i < 65536) {
            zt8 zt8VarM485i1 = m485i0(3);
            byte[] bArr2 = zt8VarM485i1.f72153a;
            int i3 = zt8VarM485i1.f72155c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            zt8VarM485i1.f72155c = i3 + 3;
            this.f723b += 3;
            return;
        }
        if (i > 1114111) {
            C3386nv.m17626m("Unexpected code point: 0x".concat(te1.m21984Q(i)));
            return;
        }
        zt8 zt8VarM485i2 = m485i0(4);
        byte[] bArr3 = zt8VarM485i2.f72153a;
        int i4 = zt8VarM485i2.f72155c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        zt8VarM485i2.f72155c = i4 + 4;
        this.f723b += 4;
    }

    public final int read(byte[] bArr, int i, int i2) {
        te1.m22001o(bArr.length, i, i2);
        zt8 zt8Var = this.f722a;
        if (zt8Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, zt8Var.f72155c - zt8Var.f72154b);
        byte[] bArr2 = zt8Var.f72153a;
        int i3 = zt8Var.f72154b;
        AbstractC3550rv.m20827U(bArr2, i, bArr, i3, i3 + iMin);
        int i4 = zt8Var.f72154b + iMin;
        zt8Var.f72154b = i4;
        this.f723b -= (long) iMin;
        if (i4 == zt8Var.f72155c) {
            this.f722a = zt8Var.m25776a();
            cu8.m9897a(zt8Var);
        }
        return iMin;
    }

    @Override // p000.hj0
    public final byte readByte() {
        if (this.f723b == 0) {
            throw new EOFException();
        }
        zt8 zt8Var = this.f722a;
        zt8Var.getClass();
        int i = zt8Var.f72154b;
        int i2 = zt8Var.f72155c;
        int i3 = i + 1;
        byte b = zt8Var.f72153a[i];
        this.f723b--;
        if (i3 != i2) {
            zt8Var.f72154b = i3;
            return b;
        }
        this.f722a = zt8Var.m25776a();
        cu8.m9897a(zt8Var);
        return b;
    }

    @Override // p000.hj0
    public final int readInt() throws EOFException {
        if (this.f723b < 4) {
            throw new EOFException();
        }
        zt8 zt8Var = this.f722a;
        zt8Var.getClass();
        int i = zt8Var.f72154b;
        int i2 = zt8Var.f72155c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = zt8Var.f72153a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f723b -= 4;
        if (i5 != i2) {
            zt8Var.f72154b = i5;
            return i6;
        }
        this.f722a = zt8Var.m25776a();
        cu8.m9897a(zt8Var);
        return i6;
    }

    @Override // p000.hj0
    public final short readShort() throws EOFException {
        if (this.f723b < 2) {
            throw new EOFException();
        }
        zt8 zt8Var = this.f722a;
        zt8Var.getClass();
        int i = zt8Var.f72154b;
        int i2 = zt8Var.f72155c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = zt8Var.f72153a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f723b -= 2;
        if (i5 == i2) {
            this.f722a = zt8Var.m25776a();
            cu8.m9897a(zt8Var);
        } else {
            zt8Var.f72154b = i5;
        }
        return (short) i6;
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: s */
    public final ByteString mo497s(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C3386nv.m17624j(wq1.m24116l("byteCount: ", j));
            return null;
        }
        if (this.f723b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(m463N(j));
        }
        ByteString byteStringM483h0 = m483h0((int) j);
        skip(j);
        return byteStringM483h0;
    }

    @Override // p000.hj0
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            zt8 zt8Var = this.f722a;
            if (zt8Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, zt8Var.f72155c - zt8Var.f72154b);
            long j2 = iMin;
            this.f723b -= j2;
            j -= j2;
            int i = zt8Var.f72154b + iMin;
            zt8Var.f72154b = i;
            if (i == zt8Var.f72155c) {
                this.f722a = zt8Var.m25776a();
                cu8.m9897a(zt8Var);
            }
        }
    }

    public final String toString() {
        long j = this.f723b;
        if (j <= 2147483647L) {
            return m483h0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f723b).toString());
    }

    /* JADX INFO: renamed from: u */
    public final long m498u(byte b, long j, long j2) {
        zt8 zt8Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f723b + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f723b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (zt8Var = this.f722a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                zt8Var = zt8Var.f72159g;
                zt8Var.getClass();
                j4 -= (long) (zt8Var.f72155c - zt8Var.f72154b);
            }
            while (j4 < j2) {
                byte[] bArr = zt8Var.f72153a;
                int iMin = (int) Math.min(zt8Var.f72155c, (((long) zt8Var.f72154b) + j2) - j4);
                for (int i = (int) ((((long) zt8Var.f72154b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - zt8Var.f72154b)) + j4;
                    }
                }
                j4 += (long) (zt8Var.f72155c - zt8Var.f72154b);
                zt8Var = zt8Var.f72158f;
                zt8Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (zt8Var.f72155c - zt8Var.f72154b)) + j3;
            if (j5 > j) {
                break;
            }
            zt8Var = zt8Var.f72158f;
            zt8Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = zt8Var.f72153a;
            int iMin2 = (int) Math.min(zt8Var.f72155c, (((long) zt8Var.f72154b) + j2) - j3);
            for (int i2 = (int) ((((long) zt8Var.f72154b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - zt8Var.f72154b)) + j3;
                }
            }
            j3 += (long) (zt8Var.f72155c - zt8Var.f72154b);
            zt8Var = zt8Var.f72158f;
            zt8Var.getClass();
            j = j3;
        }
        return -1L;
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: w */
    public final byte[] mo499w() {
        return m463N(this.f723b);
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        te1.m22001o(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            zt8 zt8VarM485i0 = m485i0(1);
            int iMin = Math.min(i3 - i, 8192 - zt8VarM485i0.f72155c);
            int i4 = i + iMin;
            AbstractC3550rv.m20827U(bArr, zt8VarM485i0.f72155c, zt8VarM485i0.f72153a, i, i4);
            zt8VarM485i0.f72155c += iMin;
            i = i4;
        }
        this.f723b += j;
    }

    @Override // p000.gj0
    public final /* bridge */ /* synthetic */ gj0 writeByte(int i) {
        m487k0(i);
        return this;
    }

    @Override // p000.gj0
    public final /* bridge */ /* synthetic */ gj0 writeInt(int i) {
        m490n0(i);
        return this;
    }

    @Override // p000.gj0
    public final /* bridge */ /* synthetic */ gj0 writeShort(int i) {
        m491o0(i);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final long m500x(ByteString byteString) {
        byteString.getClass();
        return m502z(byteString, 0L);
    }

    @Override // p000.hj0
    /* JADX INFO: renamed from: y */
    public final int mo501y(rz6 rz6Var) throws EOFException {
        rz6Var.getClass();
        int iM3132d = AbstractC0792b.m3132d(this, rz6Var, false);
        if (iM3132d == -1) {
            return -1;
        }
        skip(rz6Var.f60085a[iM3132d].mo18078d());
        return iM3132d;
    }

    /* JADX INFO: renamed from: z */
    public final long m502z(ByteString byteString, long j) {
        byteString.getClass();
        long j2 = 0;
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("fromIndex < 0: ", j));
            return 0L;
        }
        zt8 zt8Var = this.f722a;
        if (zt8Var == null) {
            return -1L;
        }
        long j3 = this.f723b;
        if (j3 - j < j) {
            while (j3 > j) {
                zt8Var = zt8Var.f72159g;
                zt8Var.getClass();
                j3 -= (long) (zt8Var.f72155c - zt8Var.f72154b);
            }
            if (byteString.mo18078d() == 2) {
                byte bMo18082i = byteString.mo18082i(0);
                byte bMo18082i2 = byteString.mo18082i(1);
                while (j3 < this.f723b) {
                    byte[] bArr = zt8Var.f72153a;
                    int i = zt8Var.f72155c;
                    for (int i2 = (int) ((((long) zt8Var.f72154b) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bMo18082i || b == bMo18082i2) {
                            return ((long) (i2 - zt8Var.f72154b)) + j3;
                        }
                    }
                    j3 += (long) (zt8Var.f72155c - zt8Var.f72154b);
                    zt8Var = zt8Var.f72158f;
                    zt8Var.getClass();
                    j = j3;
                }
            } else {
                byte[] bArrMo18081h = byteString.mo18081h();
                while (j3 < this.f723b) {
                    byte[] bArr2 = zt8Var.f72153a;
                    int i3 = zt8Var.f72155c;
                    for (int i4 = (int) ((((long) zt8Var.f72154b) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrMo18081h) {
                            if (b2 == b3) {
                                return ((long) (i4 - zt8Var.f72154b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (zt8Var.f72155c - zt8Var.f72154b);
                    zt8Var = zt8Var.f72158f;
                    zt8Var.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (zt8Var.f72155c - zt8Var.f72154b)) + j2;
            if (j4 > j) {
                break;
            }
            zt8Var = zt8Var.f72158f;
            zt8Var.getClass();
            j2 = j4;
        }
        if (byteString.mo18078d() == 2) {
            byte bMo18082i3 = byteString.mo18082i(0);
            byte bMo18082i4 = byteString.mo18082i(1);
            while (j2 < this.f723b) {
                byte[] bArr3 = zt8Var.f72153a;
                int i5 = zt8Var.f72155c;
                for (int i6 = (int) ((((long) zt8Var.f72154b) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bMo18082i3 || b4 == bMo18082i4) {
                        return ((long) (i6 - zt8Var.f72154b)) + j2;
                    }
                }
                j2 += (long) (zt8Var.f72155c - zt8Var.f72154b);
                zt8Var = zt8Var.f72158f;
                zt8Var.getClass();
                j = j2;
            }
        } else {
            byte[] bArrMo18081h2 = byteString.mo18081h();
            while (j2 < this.f723b) {
                byte[] bArr4 = zt8Var.f72153a;
                int i7 = zt8Var.f72155c;
                for (int i8 = (int) ((((long) zt8Var.f72154b) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrMo18081h2) {
                        if (b5 == b6) {
                            return ((long) (i8 - zt8Var.f72154b)) + j2;
                        }
                    }
                }
                j2 += (long) (zt8Var.f72155c - zt8Var.f72154b);
                zt8Var = zt8Var.f72158f;
                zt8Var.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            zt8 zt8VarM485i0 = m485i0(1);
            int iMin = Math.min(i, 8192 - zt8VarM485i0.f72155c);
            byteBuffer.get(zt8VarM485i0.f72153a, zt8VarM485i0.f72155c, iMin);
            i -= iMin;
            zt8VarM485i0.f72155c += iMin;
        }
        this.f723b += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        zt8 zt8Var = this.f722a;
        if (zt8Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), zt8Var.f72155c - zt8Var.f72154b);
        byteBuffer.put(zt8Var.f72153a, zt8Var.f72154b, iMin);
        int i = zt8Var.f72154b + iMin;
        zt8Var.f72154b = i;
        this.f723b -= (long) iMin;
        if (i == zt8Var.f72155c) {
            this.f722a = zt8Var.m25776a();
            cu8.m9897a(zt8Var);
        }
        return iMin;
    }

    @Override // p000.gj0
    public final gj0 write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }
}
