package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p282nn.AbstractC7803a;
import p282nn.C7807e;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6992c {

    /* JADX INFO: renamed from: c */
    public int f39510c;

    /* JADX INFO: renamed from: e */
    public final InputStream f39512e;

    /* JADX INFO: renamed from: f */
    public int f39513f;

    /* JADX INFO: renamed from: i */
    public int f39516i;

    /* JADX INFO: renamed from: h */
    public int f39515h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final byte[] f39508a = new byte[4096];

    /* JADX INFO: renamed from: b */
    public int f39509b = 0;

    /* JADX INFO: renamed from: d */
    public int f39511d = 0;

    /* JADX INFO: renamed from: g */
    public int f39514g = 0;

    public C6992c(InputStream inputStream) {
        this.f39512e = inputStream;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m13939a(int i10) throws InvalidProtocolBufferException {
        if (this.f39513f != i10) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m13940b() {
        int i10 = this.f39515h;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f39514g + this.f39511d);
    }

    /* JADX INFO: renamed from: c */
    public final void m13941c(int i10) {
        this.f39515h = i10;
        m13953o();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final int m13942d(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f39514g + this.f39511d + i10;
        int i12 = this.f39515h;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.m13935b();
        }
        this.f39515h = i11;
        m13953o();
        return i12;
    }

    /* JADX INFO: renamed from: e */
    public final C7807e m13943e() throws IOException {
        int iM13949k = m13949k();
        int i10 = this.f39509b;
        int i11 = this.f39511d;
        if (iM13949k > i10 - i11 || iM13949k <= 0) {
            return iM13949k == 0 ? AbstractC7803a.f42882a : new C7807e(m13946h(iM13949k));
        }
        C7807e c7807e = AbstractC7803a.f42882a;
        byte[] bArr = new byte[iM13949k];
        System.arraycopy(this.f39508a, i11, bArr, 0, iM13949k);
        C7807e c7807e2 = new C7807e(bArr);
        this.f39511d += iM13949k;
        return c7807e2;
    }

    /* JADX INFO: renamed from: f */
    public final int m13944f() throws IOException {
        return m13949k();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final InterfaceC6997h m13945g(AbstractC6991b abstractC6991b, C6993d c6993d) throws IOException {
        int iM13949k = m13949k();
        if (this.f39516i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iM13942d = m13942d(iM13949k);
        this.f39516i++;
        InterfaceC6997h interfaceC6997h = (InterfaceC6997h) abstractC6991b.mo13787a(this, c6993d);
        m13939a(0);
        this.f39516i--;
        m13941c(iM13942d);
        return interfaceC6997h;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: h */
    public final byte[] m13946h(int i10) throws IOException {
        if (i10 <= 0) {
            if (i10 == 0) {
                return C6995f.f39527a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f39514g;
        int i12 = this.f39511d;
        int i13 = i11 + i12 + i10;
        int i14 = this.f39515h;
        if (i13 > i14) {
            m13956r((i14 - i11) - i12);
            throw InvalidProtocolBufferException.m13935b();
        }
        byte[] bArr = this.f39508a;
        if (i10 < 4096) {
            byte[] bArr2 = new byte[i10];
            int i15 = this.f39509b - i12;
            System.arraycopy(bArr, i12, bArr2, 0, i15);
            int i16 = this.f39509b;
            this.f39511d = i16;
            int i17 = i10 - i15;
            if (i16 - i16 < i17) {
                m13954p(i17);
            }
            System.arraycopy(bArr, 0, bArr2, i15, i17);
            this.f39511d = i17;
            return bArr2;
        }
        int i18 = this.f39509b;
        this.f39514g = i11 + i18;
        this.f39511d = 0;
        this.f39509b = 0;
        int length = i18 - i12;
        int i19 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i19 > 0) {
            int iMin = Math.min(i19, 4096);
            byte[] bArr3 = new byte[iMin];
            int i20 = 0;
            while (i20 < iMin) {
                InputStream inputStream = this.f39512e;
                int i21 = inputStream == null ? -1 : inputStream.read(bArr3, i20, iMin - i20);
                if (i21 == -1) {
                    throw InvalidProtocolBufferException.m13935b();
                }
                this.f39514g += i21;
                i20 += i21;
            }
            i19 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i10];
        System.arraycopy(bArr, i12, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    /* JADX INFO: renamed from: i */
    public final int m13947i() throws IOException {
        int i10 = this.f39511d;
        if (this.f39509b - i10 < 4) {
            m13954p(4);
            i10 = this.f39511d;
        }
        this.f39511d = i10 + 4;
        byte[] bArr = this.f39508a;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: j */
    public final long m13948j() throws IOException {
        int i10 = this.f39511d;
        if (this.f39509b - i10 < 8) {
            m13954p(8);
            i10 = this.f39511d;
        }
        this.f39511d = i10 + 8;
        byte[] bArr = this.f39508a;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r3[r2] < 0) goto L35;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m13949k() throws IOException {
        int i10;
        long j10;
        int i11 = this.f39511d;
        int i12 = this.f39509b;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f39508a;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f39511d = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                long j11 = i15;
                if (j11 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    long j12 = i17;
                    if (j12 < 0) {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        j11 = i18;
                        if (j11 < 0) {
                            j10 = -2080896;
                        } else {
                            i16 = i14 + 1;
                            byte b11 = bArr[i14];
                            i10 = (int) (((long) (i18 ^ (b11 << 28))) ^ 266354560);
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
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.f39511d = i14;
                        return i10;
                    }
                    i10 = (int) (16256 ^ j12);
                    i14 = i16;
                    this.f39511d = i14;
                    return i10;
                }
                j10 = -128;
                i10 = (int) (j10 ^ j11);
                this.f39511d = i14;
                return i10;
            }
        }
        return (int) m13951m();
    }

    /* JADX INFO: renamed from: l */
    public final long m13950l() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f39511d;
        int i11 = this.f39509b;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f39508a;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f39511d = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i12 + 1;
                long j14 = b10 ^ (bArr[i12] << 7);
                if (j14 < 0) {
                    j11 = (-128) ^ j14;
                } else {
                    int i14 = i13 + 1;
                    long j15 = ((long) (bArr[i13] << 14)) ^ j14;
                    if (j15 >= 0) {
                        j11 = j15 ^ 16256;
                        i13 = i14;
                    } else {
                        int i15 = i14 + 1;
                        long j16 = j15 ^ ((long) (bArr[i14] << 21));
                        if (j16 < 0) {
                            j12 = -2080896;
                        } else {
                            int i16 = i15 + 1;
                            long j17 = j16 ^ (((long) bArr[i15]) << 28);
                            if (j17 >= 0) {
                                j13 = 266354560;
                            } else {
                                i15 = i16 + 1;
                                j16 = j17 ^ (((long) bArr[i16]) << 35);
                                if (j16 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i16 = i15 + 1;
                                    j17 = j16 ^ (((long) bArr[i15]) << 42);
                                    if (j17 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i15 = i16 + 1;
                                        j16 = j17 ^ (((long) bArr[i16]) << 49);
                                        if (j16 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i15 + 1;
                                            j10 = (j16 ^ (((long) bArr[i15]) << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i15 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j11 = j10;
                                                }
                                            }
                                        }
                                        i13 = i15;
                                    }
                                    i13 = i16;
                                    j11 = j10;
                                }
                            }
                            j10 = j17 ^ j13;
                            i13 = i16;
                            j11 = j10;
                        }
                        j11 = j12 ^ j16;
                        i13 = i15;
                    }
                }
                this.f39511d = i13;
                return j11;
            }
        }
        return m13951m();
    }

    /* JADX INFO: renamed from: m */
    public final long m13951m() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f39511d == this.f39509b) {
                m13954p(1);
            }
            int i11 = this.f39511d;
            this.f39511d = i11 + 1;
            byte b10 = this.f39508a[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: n */
    public final int m13952n() throws IOException {
        boolean z10;
        if (this.f39511d == this.f39509b) {
            z10 = true;
            if (m13957s(1)) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            this.f39513f = 0;
            return 0;
        }
        int iM13949k = m13949k();
        this.f39513f = iM13949k;
        if ((iM13949k >>> 3) != 0) {
            return iM13949k;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: o */
    public final void m13953o() {
        int i10 = this.f39509b + this.f39510c;
        this.f39509b = i10;
        int i11 = this.f39514g + i10;
        int i12 = this.f39515h;
        if (i11 <= i12) {
            this.f39510c = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f39510c = i13;
        this.f39509b = i10 - i13;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public final void m13954p(int i10) throws IOException {
        if (!m13957s(i10)) {
            throw InvalidProtocolBufferException.m13935b();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m13955q(int i10, CodedOutputStream codedOutputStream) throws IOException {
        int iM13952n;
        int i11 = i10 & 7;
        if (i11 == 0) {
            long jM13950l = m13950l();
            codedOutputStream.m13914v(i10);
            codedOutputStream.m13915w(jM13950l);
            return true;
        }
        if (i11 == 1) {
            long jM13948j = m13948j();
            codedOutputStream.m13914v(i10);
            codedOutputStream.m13913u(jM13948j);
            return true;
        }
        if (i11 == 2) {
            C7807e c7807eM13943e = m13943e();
            codedOutputStream.m13914v(i10);
            codedOutputStream.m13914v(c7807eM13943e.size());
            codedOutputStream.m13910r(c7807eM13943e);
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
            }
            int iM13947i = m13947i();
            codedOutputStream.m13914v(i10);
            codedOutputStream.m13912t(iM13947i);
            return true;
        }
        codedOutputStream.m13914v(i10);
        do {
            iM13952n = m13952n();
            if (iM13952n == 0) {
                break;
            }
        } while (m13955q(iM13952n, codedOutputStream));
        int i12 = ((i10 >>> 3) << 3) | 4;
        m13939a(i12);
        codedOutputStream.m13914v(i12);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m13956r(int i10) throws IOException {
        int i11 = this.f39509b;
        int i12 = this.f39511d;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f39511d = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f39514g;
        int i15 = i14 + i12 + i10;
        int i16 = this.f39515h;
        if (i15 > i16) {
            m13956r((i16 - i14) - i12);
            throw InvalidProtocolBufferException.m13935b();
        }
        this.f39511d = i11;
        m13954p(1);
        while (true) {
            int i17 = i10 - i13;
            int i18 = this.f39509b;
            if (i17 <= i18) {
                this.f39511d = i17;
                return;
            } else {
                i13 += i18;
                this.f39511d = i18;
                m13954p(1);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: s */
    public final boolean m13957s(int i10) throws IOException {
        InputStream inputStream;
        int i11 = this.f39511d;
        int i12 = i11 + i10;
        int i13 = this.f39509b;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f39514g + i11 + i10 <= this.f39515h && (inputStream = this.f39512e) != null) {
            byte[] bArr = this.f39508a;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f39514g += i11;
                this.f39509b -= i11;
                this.f39511d = 0;
            }
            int i14 = this.f39509b;
            int i15 = inputStream.read(bArr, i14, bArr.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f39509b += i15;
                if ((this.f39514g + i10) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                m13953o();
                if (this.f39509b >= i10) {
                    return true;
                }
                return m13957s(i10);
            }
        }
        return false;
    }
}
