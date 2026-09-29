package com.google.crypto.tink.shaded.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p000.C3386nv;
import p000.m80;
import p000.o94;
import p000.ux5;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1129d extends m80 {

    /* JADX INFO: renamed from: c */
    public final ByteArrayInputStream f13574c;

    /* JADX INFO: renamed from: d */
    public final byte[] f13575d;

    /* JADX INFO: renamed from: e */
    public int f13576e;

    /* JADX INFO: renamed from: f */
    public int f13577f;

    /* JADX INFO: renamed from: g */
    public int f13578g;

    /* JADX INFO: renamed from: h */
    public int f13579h;

    /* JADX INFO: renamed from: i */
    public int f13580i;

    /* JADX INFO: renamed from: j */
    public int f13581j = Integer.MAX_VALUE;

    public C1129d(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = o94.f54077a;
        this.f13574c = byteArrayInputStream;
        this.f13575d = new byte[4096];
        this.f13576e = 0;
        this.f13578g = 0;
        this.f13580i = 0;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: A */
    public final String mo6435A() throws InvalidProtocolBufferException {
        int iM6469L = m6469L();
        byte[] bArr = this.f13575d;
        if (iM6469L > 0) {
            int i = this.f13576e;
            int i2 = this.f13578g;
            if (iM6469L <= i - i2) {
                String str = new String(bArr, i2, iM6469L, o94.f54077a);
                this.f13578g += iM6469L;
                return str;
            }
        }
        if (iM6469L == 0) {
            return "";
        }
        if (iM6469L > this.f13576e) {
            return new String(m6464G(iM6469L), o94.f54077a);
        }
        m6473P(iM6469L);
        String str2 = new String(bArr, this.f13578g, iM6469L, o94.f54077a);
        this.f13578g += iM6469L;
        return str2;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: B */
    public final String mo6436B() throws IOException {
        int iM6469L = m6469L();
        int i = this.f13578g;
        int i2 = this.f13576e;
        int i3 = i2 - i;
        byte[] bArrM6464G = this.f13575d;
        if (iM6469L <= i3 && iM6469L > 0) {
            this.f13578g = i + iM6469L;
        } else {
            if (iM6469L == 0) {
                return "";
            }
            i = 0;
            if (iM6469L <= i2) {
                m6473P(iM6469L);
                this.f13578g = iM6469L;
            } else {
                bArrM6464G = m6464G(iM6469L);
            }
        }
        return AbstractC1144s.f13628a.m6660a(bArrM6464G, i, iM6469L);
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: C */
    public final int mo6437C() throws InvalidProtocolBufferException {
        if (mo6448e()) {
            this.f13579h = 0;
            return 0;
        }
        int iM6469L = m6469L();
        this.f13579h = iM6469L;
        if ((iM6469L >>> 3) != 0) {
            return iM6469L;
        }
        throw InvalidProtocolBufferException.m6415a();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: D */
    public final int mo6438D() {
        return m6469L();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: E */
    public final long mo6439E() {
        return m6470M();
    }

    /* JADX INFO: renamed from: G */
    public final byte[] m6464G(int i) throws IOException {
        byte[] bArrM6465H = m6465H(i);
        if (bArrM6465H != null) {
            return bArrM6465H;
        }
        int i2 = this.f13578g;
        int i3 = this.f13576e;
        int length = i3 - i2;
        this.f13580i += i3;
        this.f13578g = 0;
        this.f13576e = 0;
        ArrayList<byte[]> arrayListM6466I = m6466I(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f13575d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM6466I) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: H */
    public final byte[] m6465H(int i) throws IOException {
        if (i == 0) {
            return o94.f54078b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.m6419e();
        }
        int i2 = this.f13580i;
        int i3 = this.f13578g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f13581j;
        if (i4 > i5) {
            m6474Q((i5 - i2) - i3);
            throw InvalidProtocolBufferException.m6421g();
        }
        int i6 = this.f13576e - i3;
        int i7 = i - i6;
        ByteArrayInputStream byteArrayInputStream = this.f13574c;
        if (i7 >= 4096) {
            try {
                if (i7 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.f13562a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f13575d, this.f13578g, bArr, 0, i6);
        this.f13580i += this.f13576e;
        this.f13578g = 0;
        this.f13576e = 0;
        while (i6 < i) {
            try {
                int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.m6421g();
                }
                this.f13580i += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.f13562a = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: I */
    public final ArrayList m6466I(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f13574c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.m6421g();
                }
                this.f13580i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public final int m6467J() throws InvalidProtocolBufferException {
        int i = this.f13578g;
        if (this.f13576e - i < 4) {
            m6473P(4);
            i = this.f13578g;
        }
        this.f13578g = i + 4;
        byte[] bArr = this.f13575d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: K */
    public final long m6468K() throws InvalidProtocolBufferException {
        int i = this.f13578g;
        if (this.f13576e - i < 8) {
            m6473P(8);
            i = this.f13578g;
        }
        this.f13578g = i + 8;
        byte[] bArr = this.f13575d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: L */
    public final int m6469L() {
        int i;
        int i2 = this.f13578g;
        int i3 = this.f13576e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f13575d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f13578g = i4;
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
                this.f13578g = i5;
                return i;
            }
        }
        return (int) m6471N();
    }

    /* JADX INFO: renamed from: M */
    public final long m6470M() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f13578g;
        int i2 = this.f13576e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f13575d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f13578g = i3;
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
                this.f13578g = i4;
                return j;
            }
        }
        return m6471N();
    }

    /* JADX INFO: renamed from: N */
    public final long m6471N() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f13578g == this.f13576e) {
                m6473P(1);
            }
            int i2 = this.f13578g;
            this.f13578g = i2 + 1;
            byte b = this.f13575d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m6418d();
    }

    /* JADX INFO: renamed from: O */
    public final void m6472O() {
        int i = this.f13576e + this.f13577f;
        this.f13576e = i;
        int i2 = this.f13580i + i;
        int i3 = this.f13581j;
        if (i2 <= i3) {
            this.f13577f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f13577f = i4;
        this.f13576e = i - i4;
    }

    /* JADX INFO: renamed from: P */
    public final void m6473P(int i) throws InvalidProtocolBufferException {
        if (m6475R(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f13580i) - this.f13578g) {
            throw InvalidProtocolBufferException.m6421g();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: Q */
    public final void m6474Q(int i) throws InvalidProtocolBufferException {
        int i2 = this.f13576e;
        int i3 = this.f13578g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f13578g = i3 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f13574c;
        if (i < 0) {
            throw InvalidProtocolBufferException.m6419e();
        }
        int i5 = this.f13580i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f13581j;
        if (i7 > i8) {
            m6474Q((i8 - i5) - i3);
            throw InvalidProtocolBufferException.m6421g();
        }
        this.f13580i = i6;
        this.f13576e = 0;
        this.f13578g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.f13562a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f13580i += i4;
                m6472O();
                throw th;
            }
        }
        this.f13580i += i4;
        m6472O();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f13576e;
        int i10 = i9 - this.f13578g;
        this.f13578g = i9;
        m6473P(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f13576e;
            if (i11 <= i12) {
                this.f13578g = i11;
                return;
            } else {
                i10 += i12;
                this.f13578g = i12;
                m6473P(1);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m6475R(int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f13574c;
        int i2 = this.f13578g;
        int i3 = i2 + i;
        int i4 = this.f13576e;
        if (i3 <= i4) {
            C3386nv.m17633t(ux5.m22989l("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f13580i;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f13581j) {
            byte[] bArr = this.f13575d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f13580i += i2;
                this.f13576e -= i2;
                this.f13578g = 0;
            }
            int i6 = this.f13576e;
            try {
                int i7 = byteArrayInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f13580i) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    C3386nv.m17621g(i7, byteArrayInputStream.getClass());
                    return false;
                }
                if (i7 > 0) {
                    this.f13576e += i7;
                    m6472O();
                    if (this.f13576e >= i) {
                        return true;
                    }
                    return m6475R(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.f13562a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: a */
    public final void mo6446a(int i) throws InvalidProtocolBufferException {
        if (this.f13579h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: d */
    public final int mo6447d() {
        return this.f13580i + this.f13578g;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: e */
    public final boolean mo6448e() {
        return this.f13578g == this.f13576e && !m6475R(1);
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: k */
    public final void mo6449k(int i) {
        this.f13581j = i;
        m6472O();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: l */
    public final int mo6450l(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.m6419e();
        }
        int i2 = this.f13580i + this.f13578g + i;
        int i3 = this.f13581j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m6421g();
        }
        this.f13581j = i2;
        m6472O();
        return i3;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: m */
    public final boolean mo6451m() {
        return m6470M() != 0;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: n */
    public final ByteString mo6452n() throws IOException {
        int iM6469L = m6469L();
        int i = this.f13576e;
        int i2 = this.f13578g;
        int i3 = i - i2;
        byte[] bArr = this.f13575d;
        if (iM6469L <= i3 && iM6469L > 0) {
            ByteString byteStringM6408g = ByteString.m6408g(bArr, i2, iM6469L);
            this.f13578g += iM6469L;
            return byteStringM6408g;
        }
        if (iM6469L == 0) {
            return ByteString.f13555b;
        }
        byte[] bArrM6465H = m6465H(iM6469L);
        if (bArrM6465H != null) {
            return ByteString.m6408g(bArrM6465H, 0, bArrM6465H.length);
        }
        int i4 = this.f13578g;
        int i5 = this.f13576e;
        int length = i5 - i4;
        this.f13580i += i5;
        this.f13578g = 0;
        this.f13576e = 0;
        ArrayList<byte[]> arrayListM6466I = m6466I(iM6469L - length);
        byte[] bArr2 = new byte[iM6469L];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM6466I) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        ByteString byteString = ByteString.f13555b;
        return new ByteString.LiteralByteString(bArr2);
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: o */
    public final double mo6453o() {
        return Double.longBitsToDouble(m6468K());
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: p */
    public final int mo6454p() {
        return m6469L();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: q */
    public final int mo6455q() {
        return m6467J();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: r */
    public final long mo6456r() {
        return m6468K();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: t */
    public final float mo6457t() {
        return Float.intBitsToFloat(m6467J());
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: u */
    public final int mo6458u() {
        return m6469L();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: v */
    public final long mo6459v() {
        return m6470M();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: w */
    public final int mo6460w() {
        return m6467J();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: x */
    public final long mo6461x() {
        return m6468K();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: y */
    public final int mo6462y() {
        return m80.m16672b(m6469L());
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: z */
    public final long mo6463z() {
        return m80.m16673c(m6470M());
    }
}
