package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.C0166e;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0845h {

    /* JADX INFO: renamed from: a */
    public int f5857a;

    /* JADX INFO: renamed from: b */
    public final int f5858b = 100;

    /* JADX INFO: renamed from: c */
    public final int f5859c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public C0847i f5860d;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    public static final class a extends AbstractC0845h {

        /* JADX INFO: renamed from: e */
        public final byte[] f5861e;

        /* JADX INFO: renamed from: f */
        public int f5862f;

        /* JADX INFO: renamed from: g */
        public int f5863g;

        /* JADX INFO: renamed from: h */
        public int f5864h;

        /* JADX INFO: renamed from: i */
        public final int f5865i;

        /* JADX INFO: renamed from: j */
        public int f5866j;

        /* JADX INFO: renamed from: k */
        public int f5867k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f5861e = bArr;
            this.f5862f = i11 + i10;
            this.f5864h = i10;
            this.f5865i = i10;
        }

        /* JADX INFO: renamed from: A */
        public final int m3278A() throws IOException {
            int i10;
            int i11 = this.f5864h;
            int i12 = this.f5862f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f5861e;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f5864h = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                i16 = i14 + 1;
                                byte b11 = bArr[i14];
                                i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                i16 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i16 + 1;
                                                    if (bArr[i16] < 0) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i16;
                    }
                    this.f5864h = i14;
                    return i10;
                }
            }
            return (int) m3280C();
        }

        /* JADX INFO: renamed from: B */
        public final long m3279B() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f5864h;
            int i12 = this.f5862f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f5861e;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f5864h = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 >= 0) {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 < 0) {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                long j13 = i18;
                                int i19 = i14 + 1;
                                long j14 = (((long) bArr[i14]) << 28) ^ j13;
                                if (j14 >= 0) {
                                    j11 = j14 ^ 266354560;
                                    i14 = i19;
                                } else {
                                    int i20 = i19 + 1;
                                    long j15 = j14 ^ (((long) bArr[i19]) << 35);
                                    if (j15 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i16 = i20 + 1;
                                        long j16 = j15 ^ (((long) bArr[i20]) << 42);
                                        if (j16 >= 0) {
                                            j10 = j16 ^ 4363953127296L;
                                        } else {
                                            i20 = i16 + 1;
                                            j15 = j16 ^ (((long) bArr[i16]) << 49);
                                            if (j15 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                i16 = i20 + 1;
                                                j10 = (j15 ^ (((long) bArr[i20]) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    i20 = i16 + 1;
                                                    if (bArr[i16] >= 0) {
                                                        j11 = j10;
                                                    }
                                                }
                                            }
                                            i14 = i20;
                                        }
                                        i14 = i16;
                                        j11 = j10;
                                    }
                                    j11 = j12 ^ j15;
                                    i14 = i20;
                                }
                            }
                            this.f5864h = i14;
                            return j11;
                        }
                        j10 = i17 ^ 16256;
                        i14 = i16;
                        j11 = j10;
                        this.f5864h = i14;
                        return j11;
                    }
                    i10 = i15 ^ (-128);
                    j11 = i10;
                    this.f5864h = i14;
                    return j11;
                }
            }
            return m3280C();
        }

        /* JADX INFO: renamed from: C */
        public final long m3280C() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f5864h;
                if (i11 == this.f5862f) {
                    throw InvalidProtocolBufferException.m3148h();
                }
                this.f5864h = i11 + 1;
                byte b10 = this.f5861e[i11];
                j10 |= ((long) (b10 & 127)) << i10;
                if ((b10 & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.m3145c();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: D */
        public final void m3281D(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f5862f;
                int i12 = this.f5864h;
                if (i10 <= i11 - i12) {
                    this.f5864h = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.m3148h();
            }
            throw InvalidProtocolBufferException.m3146d();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: a */
        public final void mo3254a(int i10) throws InvalidProtocolBufferException {
            if (this.f5866j != i10) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: b */
        public final int mo3255b() {
            return this.f5864h - this.f5865i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: c */
        public final boolean mo3256c() throws IOException {
            return this.f5864h == this.f5862f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: d */
        public final void mo3257d(int i10) {
            this.f5867k = i10;
            int i11 = this.f5862f + this.f5863g;
            this.f5862f = i11;
            int i12 = i11 - this.f5865i;
            if (i12 <= i10) {
                this.f5863g = 0;
                return;
            }
            int i13 = i12 - i10;
            this.f5863g = i13;
            this.f5862f = i11 - i13;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: e */
        public final int mo3258e(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.m3146d();
            }
            int i11 = this.f5864h;
            int i12 = this.f5865i;
            int i13 = (i11 - i12) + i10;
            int i14 = this.f5867k;
            if (i13 > i14) {
                throw InvalidProtocolBufferException.m3148h();
            }
            this.f5867k = i13;
            int i15 = this.f5862f + this.f5863g;
            this.f5862f = i15;
            int i16 = i15 - i12;
            if (i16 > i13) {
                int i17 = i16 - i13;
                this.f5863g = i17;
                this.f5862f = i15 - i17;
            } else {
                this.f5863g = 0;
            }
            return i14;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: f */
        public final boolean mo3259f() throws IOException {
            return m3279B() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0039 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x003b  */
        /* JADX WARN: Code duplicated, block: B:20:0x0048  */
        /* JADX WARN: Code duplicated, block: B:23:0x004e  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: g */
        public final ByteString mo3260g() throws IOException {
            byte[] bArrCopyOfRange;
            int iM3278A = m3278A();
            byte[] bArr = this.f5861e;
            if (iM3278A > 0) {
                int i10 = this.f5862f;
                int i11 = this.f5864h;
                if (iM3278A <= i10 - i11) {
                    ByteString byteStringM3057q = ByteString.m3057q(bArr, i11, iM3278A);
                    this.f5864h += iM3278A;
                    return byteStringM3057q;
                }
            }
            if (iM3278A == 0) {
                return ByteString.f5793b;
            }
            if (iM3278A > 0) {
                int i12 = this.f5862f;
                int i13 = this.f5864h;
                if (iM3278A <= i12 - i13) {
                    int i14 = iM3278A + i13;
                    this.f5864h = i14;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
                } else {
                    if (iM3278A <= 0) {
                        throw InvalidProtocolBufferException.m3148h();
                    }
                    if (iM3278A == 0) {
                        throw InvalidProtocolBufferException.m3146d();
                    }
                    bArrCopyOfRange = C0871u.f5936b;
                }
            } else {
                if (iM3278A <= 0) {
                    throw InvalidProtocolBufferException.m3148h();
                }
                if (iM3278A == 0) {
                    throw InvalidProtocolBufferException.m3146d();
                }
                bArrCopyOfRange = C0871u.f5936b;
            }
            ByteString byteString = ByteString.f5793b;
            return new ByteString.LiteralByteString(bArrCopyOfRange);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: h */
        public final double mo3261h() throws IOException {
            return Double.longBitsToDouble(m3283z());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: i */
        public final int mo3262i() throws IOException {
            return m3278A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: j */
        public final int mo3263j() throws IOException {
            return m3282y();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: k */
        public final long mo3264k() throws IOException {
            return m3283z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: l */
        public final float mo3265l() throws IOException {
            return Float.intBitsToFloat(m3282y());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: m */
        public final int mo3266m() throws IOException {
            return m3278A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: n */
        public final long mo3267n() throws IOException {
            return m3279B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: o */
        public final int mo3268o() throws IOException {
            return m3282y();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: p */
        public final long mo3269p() throws IOException {
            return m3283z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: q */
        public final int mo3270q() throws IOException {
            int iM3278A = m3278A();
            return (-(iM3278A & 1)) ^ (iM3278A >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: r */
        public final long mo3271r() throws IOException {
            long jM3279B = m3279B();
            return (-(jM3279B & 1)) ^ (jM3279B >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: s */
        public final String mo3272s() throws IOException {
            int iM3278A = m3278A();
            if (iM3278A > 0) {
                int i10 = this.f5862f;
                int i11 = this.f5864h;
                if (iM3278A <= i10 - i11) {
                    String str = new String(this.f5861e, i11, iM3278A, C0871u.f5935a);
                    this.f5864h += iM3278A;
                    return str;
                }
            }
            if (iM3278A == 0) {
                return "";
            }
            if (iM3278A < 0) {
                throw InvalidProtocolBufferException.m3146d();
            }
            throw InvalidProtocolBufferException.m3148h();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: t */
        public final String mo3273t() throws IOException {
            int iM3278A = m3278A();
            if (iM3278A > 0) {
                int i10 = this.f5862f;
                int i11 = this.f5864h;
                if (iM3278A <= i10 - i11) {
                    String strMo3159a = Utf8.f5816a.mo3159a(this.f5861e, i11, iM3278A);
                    this.f5864h += iM3278A;
                    return strMo3159a;
                }
            }
            if (iM3278A == 0) {
                return "";
            }
            if (iM3278A <= 0) {
                throw InvalidProtocolBufferException.m3146d();
            }
            throw InvalidProtocolBufferException.m3148h();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: u */
        public final int mo3274u() throws IOException {
            if (mo3256c()) {
                this.f5866j = 0;
                return 0;
            }
            int iM3278A = m3278A();
            this.f5866j = iM3278A;
            if ((iM3278A >>> 3) != 0) {
                return iM3278A;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: v */
        public final int mo3275v() throws IOException {
            return m3278A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: w */
        public final long mo3276w() throws IOException {
            return m3279B();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: x */
        public final boolean mo3277x(int i10) throws IOException {
            int iMo3274u;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                int i13 = this.f5862f - this.f5864h;
                byte[] bArr = this.f5861e;
                if (i13 >= 10) {
                    while (i12 < 10) {
                        int i14 = this.f5864h;
                        this.f5864h = i14 + 1;
                        if (bArr[i14] < 0) {
                            i12++;
                        }
                    }
                    throw InvalidProtocolBufferException.m3145c();
                }
                while (i12 < 10) {
                    int i15 = this.f5864h;
                    if (i15 == this.f5862f) {
                        throw InvalidProtocolBufferException.m3148h();
                    }
                    this.f5864h = i15 + 1;
                    if (bArr[i15] < 0) {
                        i12++;
                    }
                }
                throw InvalidProtocolBufferException.m3145c();
                return true;
            }
            if (i11 == 1) {
                m3281D(8);
                return true;
            }
            if (i11 == 2) {
                m3281D(m3278A());
                return true;
            }
            if (i11 == 3) {
                do {
                    iMo3274u = mo3274u();
                    if (iMo3274u == 0) {
                        break;
                    }
                } while (mo3277x(iMo3274u));
                mo3254a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 == 5) {
                m3281D(4);
                return true;
            }
            int i16 = InvalidProtocolBufferException.f5813a;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }

        /* JADX INFO: renamed from: y */
        public final int m3282y() throws IOException {
            int i10 = this.f5864h;
            if (this.f5862f - i10 < 4) {
                throw InvalidProtocolBufferException.m3148h();
            }
            this.f5864h = i10 + 4;
            byte[] bArr = this.f5861e;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: z */
        public final long m3283z() throws IOException {
            int i10 = this.f5864h;
            if (this.f5862f - i10 < 8) {
                throw InvalidProtocolBufferException.m3148h();
            }
            this.f5864h = i10 + 8;
            byte[] bArr = this.f5861e;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$b */
    public static final class b extends AbstractC0845h {

        /* JADX INFO: renamed from: e */
        public final InputStream f5868e;

        /* JADX INFO: renamed from: f */
        public final byte[] f5869f;

        /* JADX INFO: renamed from: g */
        public int f5870g;

        /* JADX INFO: renamed from: h */
        public int f5871h;

        /* JADX INFO: renamed from: i */
        public int f5872i;

        /* JADX INFO: renamed from: j */
        public int f5873j;

        /* JADX INFO: renamed from: k */
        public int f5874k;

        /* JADX INFO: renamed from: l */
        public int f5875l = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = C0871u.f5935a;
            this.f5868e = fileInputStream;
            this.f5869f = new byte[4096];
            this.f5870g = 0;
            this.f5872i = 0;
            this.f5874k = 0;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: A */
        public final ArrayList m3284A(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f5868e.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.m3148h();
                    }
                    this.f5874k += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: B */
        public final int m3285B() throws IOException {
            int i10 = this.f5872i;
            if (this.f5870g - i10 < 4) {
                m3291H(4);
                i10 = this.f5872i;
            }
            this.f5872i = i10 + 4;
            byte[] bArr = this.f5869f;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* JADX INFO: renamed from: C */
        public final long m3286C() throws IOException {
            int i10 = this.f5872i;
            if (this.f5870g - i10 < 8) {
                m3291H(8);
                i10 = this.f5872i;
            }
            this.f5872i = i10 + 8;
            byte[] bArr = this.f5869f;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: D */
        public final int m3287D() throws IOException {
            int i10;
            int i11 = this.f5872i;
            int i12 = this.f5870g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f5869f;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f5872i = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                i16 = i14 + 1;
                                byte b11 = bArr[i14];
                                i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                i16 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i16 + 1;
                                                    if (bArr[i16] < 0) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i16;
                    }
                    this.f5872i = i14;
                    return i10;
                }
            }
            return (int) m3289F();
        }

        /* JADX INFO: renamed from: E */
        public final long m3288E() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f5872i;
            int i12 = this.f5870g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f5869f;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f5872i = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 >= 0) {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 < 0) {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                long j13 = i18;
                                int i19 = i14 + 1;
                                long j14 = (((long) bArr[i14]) << 28) ^ j13;
                                if (j14 >= 0) {
                                    j11 = j14 ^ 266354560;
                                    i14 = i19;
                                } else {
                                    int i20 = i19 + 1;
                                    long j15 = j14 ^ (((long) bArr[i19]) << 35);
                                    if (j15 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i16 = i20 + 1;
                                        long j16 = j15 ^ (((long) bArr[i20]) << 42);
                                        if (j16 >= 0) {
                                            j10 = j16 ^ 4363953127296L;
                                        } else {
                                            i20 = i16 + 1;
                                            j15 = j16 ^ (((long) bArr[i16]) << 49);
                                            if (j15 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                i16 = i20 + 1;
                                                j10 = (j15 ^ (((long) bArr[i20]) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    i20 = i16 + 1;
                                                    if (bArr[i16] >= 0) {
                                                        j11 = j10;
                                                    }
                                                }
                                            }
                                            i14 = i20;
                                        }
                                    }
                                    j11 = j12 ^ j15;
                                    i14 = i20;
                                }
                            }
                            this.f5872i = i14;
                            return j11;
                        }
                        j10 = i17 ^ 16256;
                        i14 = i16;
                        j11 = j10;
                        this.f5872i = i14;
                        return j11;
                    }
                    i10 = i15 ^ (-128);
                    j11 = i10;
                    this.f5872i = i14;
                    return j11;
                }
            }
            return m3289F();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: F */
        public final long m3289F() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f5872i == this.f5870g) {
                    m3291H(1);
                }
                int i11 = this.f5872i;
                this.f5872i = i11 + 1;
                byte b10 = this.f5869f[i11];
                j10 |= ((long) (b10 & 127)) << i10;
                if ((b10 & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.m3145c();
        }

        /* JADX INFO: renamed from: G */
        public final void m3290G() {
            int i10 = this.f5870g + this.f5871h;
            this.f5870g = i10;
            int i11 = this.f5874k + i10;
            int i12 = this.f5875l;
            if (i11 <= i12) {
                this.f5871h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f5871h = i13;
            this.f5870g = i10 - i13;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: H */
        public final void m3291H(int i10) throws IOException {
            if (m3293J(i10)) {
                return;
            }
            if (i10 <= (this.f5859c - this.f5874k) - this.f5872i) {
                throw InvalidProtocolBufferException.m3148h();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        /* JADX INFO: renamed from: I */
        public final void m3292I(int i10) throws IOException {
            int i11 = this.f5870g;
            int i12 = this.f5872i;
            if (i10 <= i11 - i12 && i10 >= 0) {
                this.f5872i = i12 + i10;
                return;
            }
            InputStream inputStream = this.f5868e;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.m3146d();
            }
            int i13 = this.f5874k;
            int i14 = i13 + i12;
            int i15 = i14 + i10;
            int i16 = this.f5875l;
            if (i15 > i16) {
                m3292I((i16 - i13) - i12);
                throw InvalidProtocolBufferException.m3148h();
            }
            this.f5874k = i14;
            int i17 = i11 - i12;
            this.f5870g = 0;
            this.f5872i = 0;
            while (i17 < i10) {
                long j10 = i10 - i17;
                try {
                    long jSkip = inputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i17 += (int) jSkip;
                    }
                } finally {
                    this.f5874k += i17;
                    m3290G();
                }
            }
            if (i17 >= i10) {
                return;
            }
            int i18 = this.f5870g;
            int i19 = i18 - this.f5872i;
            this.f5872i = i18;
            m3291H(1);
            while (true) {
                int i20 = i10 - i19;
                int i21 = this.f5870g;
                if (i20 <= i21) {
                    this.f5872i = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f5872i = i21;
                    m3291H(1);
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: J */
        public final boolean m3293J(int i10) throws IOException {
            int i11 = this.f5872i;
            int i12 = i11 + i10;
            int i13 = this.f5870g;
            if (i12 <= i13) {
                throw new IllegalStateException(C0166e.m762h("refillBuffer() called when ", i10, " bytes were already available in buffer"));
            }
            int i14 = this.f5874k;
            int i15 = this.f5859c;
            if (i10 > (i15 - i14) - i11 || i14 + i11 + i10 > this.f5875l) {
                return false;
            }
            byte[] bArr = this.f5869f;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f5874k += i11;
                this.f5870g -= i11;
                this.f5872i = 0;
            }
            int i16 = this.f5870g;
            int iMin = Math.min(bArr.length - i16, (i15 - this.f5874k) - i16);
            InputStream inputStream = this.f5868e;
            int i17 = inputStream.read(bArr, i16, iMin);
            if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
            }
            if (i17 <= 0) {
                return false;
            }
            this.f5870g += i17;
            m3290G();
            if (this.f5870g >= i10) {
                return true;
            }
            return m3293J(i10);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: a */
        public final void mo3254a(int i10) throws InvalidProtocolBufferException {
            if (this.f5873j != i10) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: b */
        public final int mo3255b() {
            return this.f5874k + this.f5872i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: c */
        public final boolean mo3256c() throws IOException {
            return this.f5872i == this.f5870g && !m3293J(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: d */
        public final void mo3257d(int i10) {
            this.f5875l = i10;
            m3290G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: e */
        public final int mo3258e(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.m3146d();
            }
            int i11 = this.f5874k + this.f5872i + i10;
            int i12 = this.f5875l;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.m3148h();
            }
            this.f5875l = i11;
            m3290G();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: f */
        public final boolean mo3259f() throws IOException {
            return m3288E() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: g */
        public final ByteString mo3260g() throws IOException {
            int iM3287D = m3287D();
            int i10 = this.f5870g;
            int i11 = this.f5872i;
            int i12 = i10 - i11;
            byte[] bArr = this.f5869f;
            if (iM3287D <= i12 && iM3287D > 0) {
                ByteString byteStringM3057q = ByteString.m3057q(bArr, i11, iM3287D);
                this.f5872i += iM3287D;
                return byteStringM3057q;
            }
            if (iM3287D == 0) {
                return ByteString.f5793b;
            }
            byte[] bArrM3295z = m3295z(iM3287D);
            if (bArrM3295z != null) {
                return ByteString.m3057q(bArrM3295z, 0, bArrM3295z.length);
            }
            int i13 = this.f5872i;
            int i14 = this.f5870g;
            int length = i14 - i13;
            this.f5874k += i14;
            this.f5872i = 0;
            this.f5870g = 0;
            ArrayList<byte[]> arrayListM3284A = m3284A(iM3287D - length);
            byte[] bArr2 = new byte[iM3287D];
            System.arraycopy(bArr, i13, bArr2, 0, length);
            for (byte[] bArr3 : arrayListM3284A) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ByteString byteString = ByteString.f5793b;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: h */
        public final double mo3261h() throws IOException {
            return Double.longBitsToDouble(m3286C());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: i */
        public final int mo3262i() throws IOException {
            return m3287D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: j */
        public final int mo3263j() throws IOException {
            return m3285B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: k */
        public final long mo3264k() throws IOException {
            return m3286C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: l */
        public final float mo3265l() throws IOException {
            return Float.intBitsToFloat(m3285B());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: m */
        public final int mo3266m() throws IOException {
            return m3287D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: n */
        public final long mo3267n() throws IOException {
            return m3288E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: o */
        public final int mo3268o() throws IOException {
            return m3285B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: p */
        public final long mo3269p() throws IOException {
            return m3286C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: q */
        public final int mo3270q() throws IOException {
            int iM3287D = m3287D();
            return (-(iM3287D & 1)) ^ (iM3287D >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: r */
        public final long mo3271r() throws IOException {
            long jM3288E = m3288E();
            return (-(jM3288E & 1)) ^ (jM3288E >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: s */
        public final String mo3272s() throws IOException {
            int iM3287D = m3287D();
            byte[] bArr = this.f5869f;
            if (iM3287D > 0) {
                int i10 = this.f5870g;
                int i11 = this.f5872i;
                if (iM3287D <= i10 - i11) {
                    String str = new String(bArr, i11, iM3287D, C0871u.f5935a);
                    this.f5872i += iM3287D;
                    return str;
                }
            }
            if (iM3287D == 0) {
                return "";
            }
            if (iM3287D > this.f5870g) {
                return new String(m3294y(iM3287D), C0871u.f5935a);
            }
            m3291H(iM3287D);
            String str2 = new String(bArr, this.f5872i, iM3287D, C0871u.f5935a);
            this.f5872i += iM3287D;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: t */
        public final String mo3273t() throws IOException {
            int iM3287D = m3287D();
            int i10 = this.f5872i;
            int i11 = this.f5870g;
            int i12 = i11 - i10;
            byte[] bArrM3294y = this.f5869f;
            if (iM3287D <= i12 && iM3287D > 0) {
                this.f5872i = i10 + iM3287D;
            } else {
                if (iM3287D == 0) {
                    return "";
                }
                i10 = 0;
                if (iM3287D <= i11) {
                    m3291H(iM3287D);
                    this.f5872i = iM3287D + 0;
                } else {
                    bArrM3294y = m3294y(iM3287D);
                }
            }
            return Utf8.f5816a.mo3159a(bArrM3294y, i10, iM3287D);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: u */
        public final int mo3274u() throws IOException {
            if (mo3256c()) {
                this.f5873j = 0;
                return 0;
            }
            int iM3287D = m3287D();
            this.f5873j = iM3287D;
            if ((iM3287D >>> 3) != 0) {
                return iM3287D;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: v */
        public final int mo3275v() throws IOException {
            return m3287D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: w */
        public final long mo3276w() throws IOException {
            return m3288E();
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0845h
        /* JADX INFO: renamed from: x */
        public final boolean mo3277x(int i10) throws IOException {
            int iMo3274u;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                int i13 = this.f5870g - this.f5872i;
                byte[] bArr = this.f5869f;
                if (i13 >= 10) {
                    while (i12 < 10) {
                        int i14 = this.f5872i;
                        this.f5872i = i14 + 1;
                        if (bArr[i14] < 0) {
                            i12++;
                        }
                    }
                    throw InvalidProtocolBufferException.m3145c();
                }
                while (i12 < 10) {
                    if (this.f5872i == this.f5870g) {
                        m3291H(1);
                    }
                    int i15 = this.f5872i;
                    this.f5872i = i15 + 1;
                    if (bArr[i15] < 0) {
                        i12++;
                    }
                }
                throw InvalidProtocolBufferException.m3145c();
                return true;
            }
            if (i11 == 1) {
                m3292I(8);
                return true;
            }
            if (i11 == 2) {
                m3292I(m3287D());
                return true;
            }
            if (i11 == 3) {
                do {
                    iMo3274u = mo3274u();
                    if (iMo3274u == 0) {
                        break;
                    }
                } while (mo3277x(iMo3274u));
                mo3254a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 == 5) {
                m3292I(4);
                return true;
            }
            int i16 = InvalidProtocolBufferException.f5813a;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }

        /* JADX INFO: renamed from: y */
        public final byte[] m3294y(int i10) throws IOException {
            byte[] bArrM3295z = m3295z(i10);
            if (bArrM3295z != null) {
                return bArrM3295z;
            }
            int i11 = this.f5872i;
            int i12 = this.f5870g;
            int length = i12 - i11;
            this.f5874k += i12;
            this.f5872i = 0;
            this.f5870g = 0;
            ArrayList<byte[]> arrayListM3284A = m3284A(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f5869f, i11, bArr, 0, length);
            for (byte[] bArr2 : arrayListM3284A) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        /* JADX INFO: renamed from: z */
        public final byte[] m3295z(int i10) throws IOException {
            if (i10 == 0) {
                return C0871u.f5936b;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.m3146d();
            }
            int i11 = this.f5874k;
            int i12 = this.f5872i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f5859c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i14 = this.f5875l;
            if (i13 > i14) {
                m3292I((i14 - i11) - i12);
                throw InvalidProtocolBufferException.m3148h();
            }
            int i15 = this.f5870g - i12;
            int i16 = i10 - i15;
            InputStream inputStream = this.f5868e;
            if (i16 >= 4096 && i16 > inputStream.available()) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f5869f, this.f5872i, bArr, 0, i15);
            this.f5874k += this.f5870g;
            this.f5872i = 0;
            this.f5870g = 0;
            while (i15 < i10) {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.m3148h();
                }
                this.f5874k += i17;
                i15 += i17;
            }
            return bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3254a(int i10) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: b */
    public abstract int mo3255b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo3256c() throws IOException;

    /* JADX INFO: renamed from: d */
    public abstract void mo3257d(int i10);

    /* JADX INFO: renamed from: e */
    public abstract int mo3258e(int i10) throws InvalidProtocolBufferException;

    /* JADX INFO: renamed from: f */
    public abstract boolean mo3259f() throws IOException;

    /* JADX INFO: renamed from: g */
    public abstract ByteString mo3260g() throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract double mo3261h() throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract int mo3262i() throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract int mo3263j() throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract long mo3264k() throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract float mo3265l() throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract int mo3266m() throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract long mo3267n() throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract int mo3268o() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract long mo3269p() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract int mo3270q() throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract long mo3271r() throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract String mo3272s() throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract String mo3273t() throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract int mo3274u() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract int mo3275v() throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract long mo3276w() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract boolean mo3277x(int i10) throws IOException;
}
