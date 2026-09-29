package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import p000.m80;
import p000.o94;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1128c extends m80 {

    /* JADX INFO: renamed from: c */
    public final byte[] f13567c;

    /* JADX INFO: renamed from: d */
    public int f13568d;

    /* JADX INFO: renamed from: e */
    public int f13569e;

    /* JADX INFO: renamed from: f */
    public int f13570f;

    /* JADX INFO: renamed from: g */
    public final int f13571g;

    /* JADX INFO: renamed from: h */
    public int f13572h;

    /* JADX INFO: renamed from: i */
    public int f13573i = Integer.MAX_VALUE;

    public C1128c(byte[] bArr, int i, int i2, boolean z) {
        this.f13567c = bArr;
        this.f13568d = i2 + i;
        this.f13570f = i;
        this.f13571g = i;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: A */
    public final String mo6435A() throws InvalidProtocolBufferException {
        int iM6442I = m6442I();
        if (iM6442I > 0) {
            int i = this.f13568d;
            int i2 = this.f13570f;
            if (iM6442I <= i - i2) {
                String str = new String(this.f13567c, i2, iM6442I, o94.f54077a);
                this.f13570f += iM6442I;
                return str;
            }
        }
        if (iM6442I == 0) {
            return "";
        }
        if (iM6442I < 0) {
            throw InvalidProtocolBufferException.m6419e();
        }
        throw InvalidProtocolBufferException.m6421g();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: B */
    public final String mo6436B() throws InvalidProtocolBufferException {
        int iM6442I = m6442I();
        if (iM6442I > 0) {
            int i = this.f13568d;
            int i2 = this.f13570f;
            if (iM6442I <= i - i2) {
                String strM6660a = AbstractC1144s.f13628a.m6660a(this.f13567c, i2, iM6442I);
                this.f13570f += iM6442I;
                return strM6660a;
            }
        }
        if (iM6442I == 0) {
            return "";
        }
        if (iM6442I <= 0) {
            throw InvalidProtocolBufferException.m6419e();
        }
        throw InvalidProtocolBufferException.m6421g();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: C */
    public final int mo6437C() throws InvalidProtocolBufferException {
        if (mo6448e()) {
            this.f13572h = 0;
            return 0;
        }
        int iM6442I = m6442I();
        this.f13572h = iM6442I;
        if ((iM6442I >>> 3) != 0) {
            return iM6442I;
        }
        throw InvalidProtocolBufferException.m6415a();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: D */
    public final int mo6438D() {
        return m6442I();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: E */
    public final long mo6439E() {
        return m6443J();
    }

    /* JADX INFO: renamed from: G */
    public final int m6440G() throws InvalidProtocolBufferException {
        int i = this.f13570f;
        if (this.f13568d - i < 4) {
            throw InvalidProtocolBufferException.m6421g();
        }
        this.f13570f = i + 4;
        byte[] bArr = this.f13567c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: H */
    public final long m6441H() throws InvalidProtocolBufferException {
        int i = this.f13570f;
        if (this.f13568d - i < 8) {
            throw InvalidProtocolBufferException.m6421g();
        }
        this.f13570f = i + 8;
        byte[] bArr = this.f13567c;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: I */
    public final int m6442I() {
        int i;
        int i2 = this.f13570f;
        int i3 = this.f13568d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f13567c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f13570f = i4;
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
                this.f13570f = i5;
                return i;
            }
        }
        return (int) m6444K();
    }

    /* JADX INFO: renamed from: J */
    public final long m6443J() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f13570f;
        int i2 = this.f13568d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f13567c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f13570f = i3;
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
                this.f13570f = i4;
                return j;
            }
        }
        return m6444K();
    }

    /* JADX INFO: renamed from: K */
    public final long m6444K() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f13570f;
            if (i2 == this.f13568d) {
                throw InvalidProtocolBufferException.m6421g();
            }
            this.f13570f = i2 + 1;
            byte b = this.f13567c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m6418d();
    }

    /* JADX INFO: renamed from: L */
    public final void m6445L() {
        int i = this.f13568d + this.f13569e;
        this.f13568d = i;
        int i2 = i - this.f13571g;
        int i3 = this.f13573i;
        if (i2 <= i3) {
            this.f13569e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f13569e = i4;
        this.f13568d = i - i4;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: a */
    public final void mo6446a(int i) {
        if (this.f13572h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: d */
    public final int mo6447d() {
        return this.f13570f - this.f13571g;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: e */
    public final boolean mo6448e() {
        return this.f13570f == this.f13568d;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: k */
    public final void mo6449k(int i) {
        this.f13573i = i;
        m6445L();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: l */
    public final int mo6450l(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.m6419e();
        }
        int iMo6447d = mo6447d() + i;
        if (iMo6447d < 0) {
            throw InvalidProtocolBufferException.m6420f();
        }
        int i2 = this.f13573i;
        if (iMo6447d > i2) {
            throw InvalidProtocolBufferException.m6421g();
        }
        this.f13573i = iMo6447d;
        m6445L();
        return i2;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: m */
    public final boolean mo6451m() {
        return m6443J() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // p000.m80
    /* JADX INFO: renamed from: n */
    public final ByteString mo6452n() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iM6442I = m6442I();
        byte[] bArr = this.f13567c;
        if (iM6442I > 0) {
            int i = this.f13568d;
            int i2 = this.f13570f;
            if (iM6442I <= i - i2) {
                ByteString byteStringM6408g = ByteString.m6408g(bArr, i2, iM6442I);
                this.f13570f += iM6442I;
                return byteStringM6408g;
            }
        }
        if (iM6442I == 0) {
            return ByteString.f13555b;
        }
        if (iM6442I > 0) {
            int i3 = this.f13568d;
            int i4 = this.f13570f;
            if (iM6442I <= i3 - i4) {
                int i5 = iM6442I + i4;
                this.f13570f = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM6442I <= 0) {
                    throw InvalidProtocolBufferException.m6421g();
                }
                if (iM6442I == 0) {
                    throw InvalidProtocolBufferException.m6419e();
                }
                bArrCopyOfRange = o94.f54078b;
            }
        } else {
            if (iM6442I <= 0) {
                throw InvalidProtocolBufferException.m6421g();
            }
            if (iM6442I == 0) {
                throw InvalidProtocolBufferException.m6419e();
            }
            bArrCopyOfRange = o94.f54078b;
        }
        ByteString byteString = ByteString.f13555b;
        return new ByteString.LiteralByteString(bArrCopyOfRange);
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: o */
    public final double mo6453o() {
        return Double.longBitsToDouble(m6441H());
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: p */
    public final int mo6454p() {
        return m6442I();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: q */
    public final int mo6455q() {
        return m6440G();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: r */
    public final long mo6456r() {
        return m6441H();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: t */
    public final float mo6457t() {
        return Float.intBitsToFloat(m6440G());
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: u */
    public final int mo6458u() {
        return m6442I();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: v */
    public final long mo6459v() {
        return m6443J();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: w */
    public final int mo6460w() {
        return m6440G();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: x */
    public final long mo6461x() {
        return m6441H();
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: y */
    public final int mo6462y() {
        return m80.m16672b(m6442I());
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: z */
    public final long mo6463z() {
        return m80.m16673c(m6443J());
    }
}
