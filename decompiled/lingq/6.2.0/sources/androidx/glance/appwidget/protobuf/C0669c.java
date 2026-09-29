package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p000.C3386nv;
import p000.n41;
import p000.q94;
import p000.ux5;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0669c extends n41 {

    /* JADX INFO: renamed from: c */
    public final InputStream f6054c;

    /* JADX INFO: renamed from: d */
    public final byte[] f6055d;

    /* JADX INFO: renamed from: e */
    public int f6056e;

    /* JADX INFO: renamed from: f */
    public int f6057f;

    /* JADX INFO: renamed from: g */
    public int f6058g;

    /* JADX INFO: renamed from: h */
    public int f6059h;

    /* JADX INFO: renamed from: i */
    public int f6060i;

    /* JADX INFO: renamed from: j */
    public int f6061j = Integer.MAX_VALUE;

    public C0669c(InputStream inputStream) {
        q94.m19807a(inputStream, "input");
        this.f6054c = inputStream;
        this.f6055d = new byte[4096];
        this.f6056e = 0;
        this.f6058g = 0;
        this.f6060i = 0;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: A */
    public final int mo2279A() throws InvalidProtocolBufferException {
        if (mo2290g()) {
            this.f6059h = 0;
            return 0;
        }
        int iM2313I = m2313I();
        this.f6059h = iM2313I;
        if ((iM2313I >>> 3) != 0) {
            return iM2313I;
        }
        throw InvalidProtocolBufferException.m2267a();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: B */
    public final int mo2280B() {
        return m2313I();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: C */
    public final long mo2281C() {
        return m2314J();
    }

    /* JADX INFO: renamed from: D */
    public final byte[] m2308D(int i) throws IOException {
        byte[] bArrM2309E = m2309E(i);
        if (bArrM2309E != null) {
            return bArrM2309E;
        }
        int i2 = this.f6058g;
        int i3 = this.f6056e;
        int length = i3 - i2;
        this.f6060i += i3;
        this.f6058g = 0;
        this.f6056e = 0;
        ArrayList<byte[]> arrayListM2310F = m2310F(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f6055d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM2310F) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: E */
    public final byte[] m2309E(int i) throws IOException {
        if (i == 0) {
            return q94.f57450b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.m2271e();
        }
        int i2 = this.f6060i;
        int i3 = this.f6058g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f6061j;
        if (i4 > i5) {
            m2318N((i5 - i2) - i3);
            throw InvalidProtocolBufferException.m2273g();
        }
        int i6 = this.f6056e - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f6054c;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.f6044a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f6055d, this.f6058g, bArr, 0, i6);
        this.f6060i += this.f6056e;
        this.f6058g = 0;
        this.f6056e = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.m2273g();
                }
                this.f6060i += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.f6044a = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: F */
    public final ArrayList m2310F(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f6054c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.m2273g();
                }
                this.f6060i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public final int m2311G() throws InvalidProtocolBufferException {
        int i = this.f6058g;
        if (this.f6056e - i < 4) {
            m2317M(4);
            i = this.f6058g;
        }
        this.f6058g = i + 4;
        byte[] bArr = this.f6055d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: H */
    public final long m2312H() throws InvalidProtocolBufferException {
        int i = this.f6058g;
        if (this.f6056e - i < 8) {
            m2317M(8);
            i = this.f6058g;
        }
        this.f6058g = i + 8;
        byte[] bArr = this.f6055d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: I */
    public final int m2313I() {
        int i;
        int i2 = this.f6058g;
        int i3 = this.f6056e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f6055d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f6058g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f6058g = i5;
                return i;
            }
        }
        return (int) m2315K();
    }

    /* JADX INFO: renamed from: J */
    public final long m2314J() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f6058g;
        int i2 = this.f6056e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f6055d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f6058g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f6058g = i4;
                return j;
            }
        }
        return m2315K();
    }

    /* JADX INFO: renamed from: K */
    public final long m2315K() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f6058g == this.f6056e) {
                m2317M(1);
            }
            int i2 = this.f6058g;
            this.f6058g = i2 + 1;
            byte b = this.f6055d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m2270d();
    }

    /* JADX INFO: renamed from: L */
    public final void m2316L() {
        int i = this.f6056e + this.f6057f;
        this.f6056e = i;
        int i2 = this.f6060i + i;
        int i3 = this.f6061j;
        if (i2 <= i3) {
            this.f6057f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f6057f = i4;
        this.f6056e = i - i4;
    }

    /* JADX INFO: renamed from: M */
    public final void m2317M(int i) throws InvalidProtocolBufferException {
        if (m2319O(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f6060i) - this.f6058g) {
            throw InvalidProtocolBufferException.m2273g();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: N */
    public final void m2318N(int i) throws InvalidProtocolBufferException {
        int i2 = this.f6056e;
        int i3 = this.f6058g;
        if (i <= i2 - i3 && i >= 0) {
            this.f6058g = i3 + i;
            return;
        }
        InputStream inputStream = this.f6054c;
        if (i < 0) {
            throw InvalidProtocolBufferException.m2271e();
        }
        int i4 = this.f6060i;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f6061j;
        if (i6 > i7) {
            m2318N((i7 - i4) - i3);
            throw InvalidProtocolBufferException.m2273g();
        }
        this.f6060i = i5;
        int i8 = i2 - i3;
        this.f6056e = 0;
        this.f6058g = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.f6044a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f6060i += i8;
                m2316L();
                throw th;
            }
        }
        this.f6060i += i8;
        m2316L();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f6056e;
        int i10 = i9 - this.f6058g;
        this.f6058g = i9;
        m2317M(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f6056e;
            if (i11 <= i12) {
                this.f6058g = i11;
                return;
            } else {
                i10 += i12;
                this.f6058g = i12;
                m2317M(1);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m2319O(int i) throws IOException {
        InputStream inputStream = this.f6054c;
        int i2 = this.f6058g;
        int i3 = i2 + i;
        int i4 = this.f6056e;
        if (i3 <= i4) {
            C3386nv.m17633t(ux5.m22989l("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f6060i;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f6061j) {
            byte[] bArr = this.f6055d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f6060i += i2;
                this.f6056e -= i2;
                this.f6058g = 0;
            }
            int i6 = this.f6056e;
            try {
                int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f6060i) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    C3386nv.m17621g(i7, inputStream.getClass());
                    return false;
                }
                if (i7 > 0) {
                    this.f6056e += i7;
                    m2316L();
                    if (this.f6056e >= i) {
                        return true;
                    }
                    return m2319O(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.f6044a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: b */
    public final void mo2288b(int i) throws InvalidProtocolBufferException {
        if (this.f6059h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: f */
    public final int mo2289f() {
        return this.f6060i + this.f6058g;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: g */
    public final boolean mo2290g() {
        return this.f6058g == this.f6056e && !m2319O(1);
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: i */
    public final void mo2291i(int i) {
        this.f6061j = i;
        m2316L();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: k */
    public final int mo2292k(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.m2271e();
        }
        int i2 = this.f6060i + this.f6058g + i;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m2272f();
        }
        int i3 = this.f6061j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m2273g();
        }
        this.f6061j = i2;
        m2316L();
        return i3;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: l */
    public final boolean mo2293l() {
        return m2314J() != 0;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: m */
    public final ByteString mo2294m() throws IOException {
        int iM2313I = m2313I();
        int i = this.f6056e;
        int i2 = this.f6058g;
        int i3 = i - i2;
        byte[] bArr = this.f6055d;
        if (iM2313I <= i3 && iM2313I > 0) {
            ByteString byteStringM2261g = ByteString.m2261g(bArr, i2, iM2313I);
            this.f6058g += iM2313I;
            return byteStringM2261g;
        }
        if (iM2313I == 0) {
            return ByteString.f6037b;
        }
        if (iM2313I < 0) {
            throw InvalidProtocolBufferException.m2271e();
        }
        byte[] bArrM2309E = m2309E(iM2313I);
        if (bArrM2309E != null) {
            return ByteString.m2261g(bArrM2309E, 0, bArrM2309E.length);
        }
        int i4 = this.f6058g;
        int i5 = this.f6056e;
        int length = i5 - i4;
        this.f6060i += i5;
        this.f6058g = 0;
        this.f6056e = 0;
        ArrayList<byte[]> arrayListM2310F = m2310F(iM2313I - length);
        byte[] bArr2 = new byte[iM2313I];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM2310F) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        ByteString byteString = ByteString.f6037b;
        return new ByteString.LiteralByteString(bArr2);
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: n */
    public final double mo2295n() {
        return Double.longBitsToDouble(m2312H());
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: o */
    public final int mo2296o() {
        return m2313I();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: p */
    public final int mo2297p() {
        return m2311G();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: q */
    public final long mo2298q() {
        return m2312H();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: r */
    public final float mo2299r() {
        return Float.intBitsToFloat(m2311G());
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: s */
    public final int mo2300s() {
        return m2313I();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: t */
    public final long mo2301t() {
        return m2314J();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: u */
    public final int mo2302u() {
        return m2311G();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: v */
    public final long mo2303v() {
        return m2312H();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: w */
    public final int mo2304w() {
        return n41.m17206d(m2313I());
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: x */
    public final long mo2305x() {
        return n41.m17207e(m2314J());
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: y */
    public final String mo2306y() throws InvalidProtocolBufferException {
        int iM2313I = m2313I();
        byte[] bArr = this.f6055d;
        if (iM2313I > 0) {
            int i = this.f6056e;
            int i2 = this.f6058g;
            if (iM2313I <= i - i2) {
                String str = new String(bArr, i2, iM2313I, q94.f57449a);
                this.f6058g += iM2313I;
                return str;
            }
        }
        if (iM2313I == 0) {
            return "";
        }
        if (iM2313I < 0) {
            throw InvalidProtocolBufferException.m2271e();
        }
        if (iM2313I > this.f6056e) {
            return new String(m2308D(iM2313I), q94.f57449a);
        }
        m2317M(iM2313I);
        String str2 = new String(bArr, this.f6058g, iM2313I, q94.f57449a);
        this.f6058g += iM2313I;
        return str2;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: z */
    public final String mo2307z() throws IOException {
        int iM2313I = m2313I();
        int i = this.f6058g;
        int i2 = this.f6056e;
        int i3 = i2 - i;
        byte[] bArrM2308D = this.f6055d;
        if (iM2313I <= i3 && iM2313I > 0) {
            this.f6058g = i + iM2313I;
        } else {
            if (iM2313I == 0) {
                return "";
            }
            if (iM2313I < 0) {
                throw InvalidProtocolBufferException.m2271e();
            }
            i = 0;
            if (iM2313I <= i2) {
                m2317M(iM2313I);
                this.f6058g = iM2313I;
            } else {
                bArrM2308D = m2308D(iM2313I);
            }
        }
        return AbstractC0684r.f6107a.m2477a(bArrM2308D, i, iM2313I);
    }
}
