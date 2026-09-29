package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import p000.fg2;
import p000.ghb;
import p000.kib;
import p000.uk9;
import p000.v63;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0960d extends ghb {

    /* JADX INFO: renamed from: d */
    public final InputStream f11832d;

    /* JADX INFO: renamed from: e */
    public final byte[] f11833e;

    /* JADX INFO: renamed from: f */
    public int f11834f;

    /* JADX INFO: renamed from: g */
    public int f11835g;

    /* JADX INFO: renamed from: h */
    public int f11836h;

    /* JADX INFO: renamed from: i */
    public int f11837i;

    /* JADX INFO: renamed from: j */
    public int f11838j;

    /* JADX INFO: renamed from: k */
    public int f11839k = Integer.MAX_VALUE;

    public /* synthetic */ C0960d(InputStream inputStream, int i) {
        this.f11832d = inputStream;
        this.f11833e = new byte[i < 8 ? 8 : i];
        this.f11834f = 0;
        this.f11836h = 0;
        this.f11838j = 0;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: A */
    public final int mo5360A() {
        return mo5366G();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: B */
    public final int mo5361B() {
        return mo5366G();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: C */
    public final int mo5362C() {
        return m5402P();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: D */
    public final long mo5363D() {
        return m5403Q();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: E */
    public final int mo5364E() {
        return ghb.m12664j(mo5366G());
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: F */
    public final long mo5365F() {
        return ghb.m12665k(mo5367H());
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: G */
    public final int mo5366G() {
        int i;
        int i2 = this.f11836h;
        int i3 = this.f11834f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f11833e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f11836h = i4;
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
                this.f11836h = i5;
                return i;
            }
        }
        return (int) m5401O();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: H */
    public final long mo5367H() {
        long j;
        long j2;
        long j3;
        int i = this.f11836h;
        int i2 = this.f11834f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f11833e;
            byte b = bArr[i];
            if (b >= 0) {
                this.f11836h = i3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i6]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i6]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (((long) bArr[i6]) << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.f11836h = i4;
                return j;
            }
        }
        return m5401O();
    }

    /* JADX INFO: renamed from: I */
    public final void m5395I() {
        int i = this.f11834f + this.f11835g;
        this.f11834f = i;
        int i2 = this.f11838j + i;
        int i3 = this.f11839k;
        if (i2 <= i3) {
            this.f11835g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f11835g = i4;
        this.f11834f = i - i4;
    }

    /* JADX INFO: renamed from: J */
    public final void m5396J(int i) throws zzaeh {
        if (m5397K(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.f11838j) - this.f11836h) {
            uk9.m22782q("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m5397K(int i) throws IOException {
        InputStream inputStream = this.f11832d;
        int i2 = this.f11836h;
        int i3 = i2 + i;
        int i4 = this.f11834f;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i5 = this.f11838j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f11839k) {
            byte[] bArr = this.f11833e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.f11838j + i2;
                this.f11838j = i5;
                i4 = this.f11834f - i2;
                this.f11834f = i4;
                this.f11836h = 0;
            }
            try {
                int i6 = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    String strValueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + strValueOf.length() + 39 + 41);
                    sb2.append(strValueOf);
                    sb2.append("#read(byte[]) returned invalid result: ");
                    sb2.append(i6);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                }
                if (i6 > 0) {
                    this.f11834f += i6;
                    m5395I();
                    if (this.f11834f >= i || m5397K(i)) {
                        return true;
                    }
                }
            } catch (zzaeh e) {
                e.f11871a = true;
                throw e;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final byte[] m5398L(int i) throws IOException {
        byte[] bArrM5399M = m5399M(i);
        if (bArrM5399M != null) {
            return bArrM5399M;
        }
        int i2 = this.f11836h;
        int i3 = this.f11834f;
        int i4 = i3 - i2;
        this.f11838j += i3;
        this.f11836h = 0;
        this.f11834f = 0;
        ArrayList<byte[]> arrayListM5400N = m5400N(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f11833e, i2, bArr, 0, i4);
        for (byte[] bArr2 : arrayListM5400N) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: M */
    public final byte[] m5399M(int i) throws IOException {
        if (i == 0) {
            return kib.f47356a;
        }
        int i2 = this.f11838j;
        int i3 = this.f11836h;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            uk9.m22782q("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.f11839k;
        if (i4 > i5) {
            mo5379g((i5 - i2) - i3);
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.f11834f - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f11832d;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (zzaeh e) {
                e.f11871a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f11833e, this.f11836h, bArr, 0, i6);
        this.f11838j += this.f11834f;
        this.f11836h = 0;
        this.f11834f = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.f11838j += i8;
                i6 += i8;
            } catch (zzaeh e2) {
                e2.f11871a = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: N */
    public final ArrayList m5400N(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.f11832d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.f11838j += i3;
                    i2 += i3;
                } catch (zzaeh e) {
                    e.f11871a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public final long m5401O() throws zzaeh {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f11836h == this.f11834f) {
                m5396J(1);
            }
            int i2 = this.f11836h;
            this.f11836h = i2 + 1;
            byte b = this.f11833e[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        uk9.m22782q("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    /* JADX INFO: renamed from: P */
    public final int m5402P() throws zzaeh {
        int i = this.f11836h;
        if (this.f11834f - i < 4) {
            m5396J(4);
            i = this.f11836h;
        }
        this.f11836h = i + 4;
        byte[] bArr = this.f11833e;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: Q */
    public final long m5403Q() throws zzaeh {
        int i = this.f11836h;
        if (this.f11834f - i < 8) {
            m5396J(8);
            i = this.f11836h;
        }
        this.f11836h = i + 8;
        byte[] bArr = this.f11833e;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: a */
    public final int mo5373a(int i) throws zzaeh {
        if (i < 0) {
            uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.f11838j + this.f11836h + i;
        if (i2 < 0) {
            uk9.m22782q("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.f11839k;
        if (i2 > i3) {
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f11839k = i2;
        m5395I();
        return i3;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: b */
    public final void mo5374b(int i) {
        this.f11839k = i;
        m5395I();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: c */
    public final int mo5375c() {
        int i = this.f11839k;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f11838j + this.f11836h);
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: d */
    public final boolean mo5376d() {
        return this.f11836h == this.f11834f && !m5397K(1);
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: e */
    public final int mo5377e() {
        return this.f11838j + this.f11836h;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: f */
    public final int mo5378f(byte[] bArr, int i, int i2) throws IOException {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            v63.m23128b();
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f11834f;
        int i4 = this.f11836h;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int iMin = Math.min(i2, i5);
            System.arraycopy(this.f11833e, this.f11836h, bArr, i, iMin);
            this.f11836h += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i2, (this.f11839k - this.f11838j) - i4);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i6 = this.f11832d.read(bArr, i, iMin2);
            if (i6 != -1) {
                this.f11838j += i6;
            }
            return i6;
        } catch (zzaeh e) {
            e.f11871a = true;
            throw e;
        }
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: g */
    public final void mo5379g(int i) throws zzaeh {
        InputStream inputStream = this.f11832d;
        int i2 = this.f11834f;
        int i3 = this.f11836h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f11836h = i3 + i;
            return;
        }
        if (i < 0) {
            uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.f11838j;
        int i6 = i5 + i3;
        int i7 = this.f11839k;
        if (i6 + i > i7) {
            mo5379g((i7 - i5) - i3);
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.f11838j = i6;
        this.f11834f = 0;
        this.f11836h = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (zzaeh e) {
                    e.f11871a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f11838j += i4;
                m5395I();
                throw th;
            }
        }
        this.f11838j += i4;
        m5395I();
        if (i4 >= i) {
            return;
        }
        int i8 = this.f11834f;
        int i9 = i8 - this.f11836h;
        this.f11836h = i8;
        m5396J(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f11834f;
            if (i10 <= i11) {
                this.f11836h = i10;
                return;
            } else {
                i9 += i11;
                this.f11836h = i11;
                m5396J(1);
            }
        }
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: l */
    public final int mo5380l() throws zzaeh {
        if (mo5376d()) {
            this.f11837i = 0;
            return 0;
        }
        int iMo5366G = mo5366G();
        this.f11837i = iMo5366G;
        if ((iMo5366G >>> 3) != 0) {
            return iMo5366G;
        }
        uk9.m22782q("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: m */
    public final void mo5381m(int i) throws zzaeh {
        if (this.f11837i == i) {
            return;
        }
        uk9.m22782q("Protocol message end-group tag did not match expected tag.");
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: n */
    public final boolean mo5382n(int i) throws zzaeh {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                mo5379g(8);
                return true;
            }
            if (i2 == 2) {
                mo5379g(mo5366G());
                return true;
            }
            if (i2 == 3) {
                m12666i();
                mo5381m(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.f40836b == 0) {
                    mo5381m(0);
                }
                return false;
            }
            if (i2 == 5) {
                mo5379g(4);
                return true;
            }
            fg2.m11817c();
            return false;
        }
        int i3 = this.f11834f - this.f11836h;
        byte[] bArr = this.f11833e;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.f11836h;
                this.f11836h = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            uk9.m22782q("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.f11836h == this.f11834f) {
                m5396J(1);
            }
            int i7 = this.f11836h;
            this.f11836h = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        uk9.m22782q("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: o */
    public final double mo5383o() {
        return Double.longBitsToDouble(m5403Q());
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: p */
    public final float mo5384p() {
        return Float.intBitsToFloat(m5402P());
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: q */
    public final long mo5385q() {
        return mo5367H();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: r */
    public final long mo5386r() {
        return mo5367H();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: s */
    public final int mo5387s() {
        return mo5366G();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: t */
    public final long mo5388t() {
        return m5403Q();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: u */
    public final int mo5389u() {
        return m5402P();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: v */
    public final boolean mo5390v() {
        return mo5367H() != 0;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: w */
    public final String mo5391w() throws zzaeh {
        int iMo5366G = mo5366G();
        byte[] bArr = this.f11833e;
        if (iMo5366G > 0) {
            int i = this.f11834f;
            int i2 = this.f11836h;
            if (iMo5366G <= i - i2) {
                String str = new String(bArr, i2, iMo5366G, StandardCharsets.UTF_8);
                this.f11836h += iMo5366G;
                return str;
            }
        }
        if (iMo5366G == 0) {
            return "";
        }
        if (iMo5366G < 0) {
            uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (iMo5366G > this.f11834f) {
            return new String(m5398L(iMo5366G), StandardCharsets.UTF_8);
        }
        m5396J(iMo5366G);
        String str2 = new String(bArr, this.f11836h, iMo5366G, StandardCharsets.UTF_8);
        this.f11836h += iMo5366G;
        return str2;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: x */
    public final String mo5392x() throws IOException {
        int iMo5366G = mo5366G();
        int i = this.f11836h;
        int i2 = this.f11834f;
        int i3 = i2 - i;
        byte[] bArrM5398L = this.f11833e;
        if (iMo5366G <= i3 && iMo5366G > 0) {
            this.f11836h = i + iMo5366G;
        } else {
            if (iMo5366G == 0) {
                return "";
            }
            if (iMo5366G < 0) {
                uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (iMo5366G <= i2) {
                m5396J(iMo5366G);
                this.f11836h = iMo5366G;
            } else {
                bArrM5398L = m5398L(iMo5366G);
            }
        }
        return AbstractC0961e.m5407d(bArrM5398L, i, iMo5366G);
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: y */
    public final zzacr mo5393y() throws IOException {
        int iMo5366G = mo5366G();
        int i = this.f11834f;
        int i2 = this.f11836h;
        int i3 = i - i2;
        byte[] bArr = this.f11833e;
        if (iMo5366G <= i3 && iMo5366G > 0) {
            zzacr zzacrVarM5431m = zzacr.m5431m(bArr, i2, iMo5366G);
            this.f11836h += iMo5366G;
            return zzacrVarM5431m;
        }
        if (iMo5366G == 0) {
            return zzacr.f11869b;
        }
        if (iMo5366G < 0) {
            uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] bArrM5399M = m5399M(iMo5366G);
        if (bArrM5399M != null) {
            return zzacr.m5431m(bArrM5399M, 0, bArrM5399M.length);
        }
        int i4 = this.f11836h;
        int i5 = this.f11834f;
        int i6 = i5 - i4;
        this.f11838j += i5;
        this.f11836h = 0;
        this.f11834f = 0;
        ArrayList<byte[]> arrayListM5400N = m5400N(iMo5366G - i6);
        byte[] bArr2 = new byte[iMo5366G];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        for (byte[] bArr3 : arrayListM5400N) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            zzacr zzacrVar = zzacr.f11869b;
            return iMo5366G == 0 ? zzacr.f11869b : new zzacq(bArr2);
        } catch (zzaeh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: z */
    public final byte[] mo5394z() throws zzaeh {
        int iMo5366G = mo5366G();
        int i = this.f11834f;
        int i2 = this.f11836h;
        if (iMo5366G <= i - i2 && iMo5366G > 0) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f11833e, i2, i2 + iMo5366G);
            this.f11836h += iMo5366G;
            return bArrCopyOfRange;
        }
        if (iMo5366G >= 0) {
            return m5398L(iMo5366G);
        }
        uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }
}
