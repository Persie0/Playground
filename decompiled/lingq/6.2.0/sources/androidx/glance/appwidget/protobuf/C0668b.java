package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import p000.n41;
import p000.q94;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0668b extends n41 {

    /* JADX INFO: renamed from: c */
    public final byte[] f6047c;

    /* JADX INFO: renamed from: d */
    public int f6048d;

    /* JADX INFO: renamed from: e */
    public int f6049e;

    /* JADX INFO: renamed from: f */
    public int f6050f;

    /* JADX INFO: renamed from: g */
    public final int f6051g;

    /* JADX INFO: renamed from: h */
    public int f6052h;

    /* JADX INFO: renamed from: i */
    public int f6053i = Integer.MAX_VALUE;

    public C0668b(byte[] bArr, int i, int i2, boolean z) {
        this.f6047c = bArr;
        this.f6048d = i2 + i;
        this.f6050f = i;
        this.f6051g = i;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: A */
    public final int mo2279A() throws InvalidProtocolBufferException {
        if (mo2290g()) {
            this.f6052h = 0;
            return 0;
        }
        int iM2284F = m2284F();
        this.f6052h = iM2284F;
        if ((iM2284F >>> 3) != 0) {
            return iM2284F;
        }
        throw InvalidProtocolBufferException.m2267a();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: B */
    public final int mo2280B() {
        return m2284F();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: C */
    public final long mo2281C() {
        return m2285G();
    }

    /* JADX INFO: renamed from: D */
    public final int m2282D() throws InvalidProtocolBufferException {
        int i = this.f6050f;
        if (this.f6048d - i < 4) {
            throw InvalidProtocolBufferException.m2273g();
        }
        this.f6050f = i + 4;
        byte[] bArr = this.f6047c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: E */
    public final long m2283E() throws InvalidProtocolBufferException {
        int i = this.f6050f;
        if (this.f6048d - i < 8) {
            throw InvalidProtocolBufferException.m2273g();
        }
        this.f6050f = i + 8;
        byte[] bArr = this.f6047c;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: F */
    public final int m2284F() {
        int i;
        int i2 = this.f6050f;
        int i3 = this.f6048d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f6047c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f6050f = i4;
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
                this.f6050f = i5;
                return i;
            }
        }
        return (int) m2286H();
    }

    /* JADX INFO: renamed from: G */
    public final long m2285G() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f6050f;
        int i2 = this.f6048d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f6047c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f6050f = i3;
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
                this.f6050f = i4;
                return j;
            }
        }
        return m2286H();
    }

    /* JADX INFO: renamed from: H */
    public final long m2286H() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f6050f;
            if (i2 == this.f6048d) {
                throw InvalidProtocolBufferException.m2273g();
            }
            this.f6050f = i2 + 1;
            byte b = this.f6047c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m2270d();
    }

    /* JADX INFO: renamed from: I */
    public final void m2287I() {
        int i = this.f6048d + this.f6049e;
        this.f6048d = i;
        int i2 = i - this.f6051g;
        int i3 = this.f6053i;
        if (i2 <= i3) {
            this.f6049e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f6049e = i4;
        this.f6048d = i - i4;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: b */
    public final void mo2288b(int i) throws InvalidProtocolBufferException {
        if (this.f6052h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: f */
    public final int mo2289f() {
        return this.f6050f - this.f6051g;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: g */
    public final boolean mo2290g() {
        return this.f6050f == this.f6048d;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: i */
    public final void mo2291i(int i) {
        this.f6053i = i;
        m2287I();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: k */
    public final int mo2292k(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.m2271e();
        }
        int iMo2289f = mo2289f() + i;
        if (iMo2289f < 0) {
            throw InvalidProtocolBufferException.m2272f();
        }
        int i2 = this.f6053i;
        if (iMo2289f > i2) {
            throw InvalidProtocolBufferException.m2273g();
        }
        this.f6053i = iMo2289f;
        m2287I();
        return i2;
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: l */
    public final boolean mo2293l() {
        return m2285G() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p000.n41
    /* JADX INFO: renamed from: m */
    public final ByteString mo2294m() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iM2284F = m2284F();
        byte[] bArr = this.f6047c;
        if (iM2284F > 0) {
            int i = this.f6048d;
            int i2 = this.f6050f;
            if (iM2284F <= i - i2) {
                ByteString byteStringM2261g = ByteString.m2261g(bArr, i2, iM2284F);
                this.f6050f += iM2284F;
                return byteStringM2261g;
            }
        }
        if (iM2284F == 0) {
            return ByteString.f6037b;
        }
        if (iM2284F > 0) {
            int i3 = this.f6048d;
            int i4 = this.f6050f;
            if (iM2284F <= i3 - i4) {
                int i5 = iM2284F + i4;
                this.f6050f = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM2284F <= 0) {
                    throw InvalidProtocolBufferException.m2273g();
                }
                if (iM2284F == 0) {
                    throw InvalidProtocolBufferException.m2271e();
                }
                bArrCopyOfRange = q94.f57450b;
            }
        } else {
            if (iM2284F <= 0) {
                throw InvalidProtocolBufferException.m2273g();
            }
            if (iM2284F == 0) {
                throw InvalidProtocolBufferException.m2271e();
            }
            bArrCopyOfRange = q94.f57450b;
        }
        ByteString byteString = ByteString.f6037b;
        return new ByteString.LiteralByteString(bArrCopyOfRange);
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: n */
    public final double mo2295n() {
        return Double.longBitsToDouble(m2283E());
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: o */
    public final int mo2296o() {
        return m2284F();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: p */
    public final int mo2297p() {
        return m2282D();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: q */
    public final long mo2298q() {
        return m2283E();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: r */
    public final float mo2299r() {
        return Float.intBitsToFloat(m2282D());
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: s */
    public final int mo2300s() {
        return m2284F();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: t */
    public final long mo2301t() {
        return m2285G();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: u */
    public final int mo2302u() {
        return m2282D();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: v */
    public final long mo2303v() {
        return m2283E();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: w */
    public final int mo2304w() {
        return n41.m17206d(m2284F());
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: x */
    public final long mo2305x() {
        return n41.m17207e(m2285G());
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: y */
    public final String mo2306y() throws InvalidProtocolBufferException {
        int iM2284F = m2284F();
        if (iM2284F > 0) {
            int i = this.f6048d;
            int i2 = this.f6050f;
            if (iM2284F <= i - i2) {
                String str = new String(this.f6047c, i2, iM2284F, q94.f57449a);
                this.f6050f += iM2284F;
                return str;
            }
        }
        if (iM2284F == 0) {
            return "";
        }
        if (iM2284F < 0) {
            throw InvalidProtocolBufferException.m2271e();
        }
        throw InvalidProtocolBufferException.m2273g();
    }

    @Override // p000.n41
    /* JADX INFO: renamed from: z */
    public final String mo2307z() throws InvalidProtocolBufferException {
        int iM2284F = m2284F();
        if (iM2284F > 0) {
            int i = this.f6048d;
            int i2 = this.f6050f;
            if (iM2284F <= i - i2) {
                String strM2477a = AbstractC0684r.f6107a.m2477a(this.f6047c, i2, iM2284F);
                this.f6050f += iM2284F;
                return strM2477a;
            }
        }
        if (iM2284F == 0) {
            return "";
        }
        if (iM2284F <= 0) {
            throw InvalidProtocolBufferException.m2271e();
        }
        throw InvalidProtocolBufferException.m2273g();
    }
}
