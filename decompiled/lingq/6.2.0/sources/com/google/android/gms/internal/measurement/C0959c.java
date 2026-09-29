package com.google.android.gms.internal.measurement;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p000.fg2;
import p000.ghb;
import p000.kib;
import p000.uk9;
import p000.v63;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0959c extends ghb {

    /* JADX INFO: renamed from: d */
    public final byte[] f11826d;

    /* JADX INFO: renamed from: f */
    public int f11828f;

    /* JADX INFO: renamed from: h */
    public int f11830h;

    /* JADX INFO: renamed from: i */
    public int f11831i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f11827e = 0;

    /* JADX INFO: renamed from: g */
    public int f11829g = 0;

    public /* synthetic */ C0959c(byte[] bArr) {
        this.f11826d = bArr;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: A */
    public final int mo5360A() {
        return m5372M();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: B */
    public final int mo5361B() {
        return m5372M();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: C */
    public final int mo5362C() {
        return m5369J();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: D */
    public final long mo5363D() {
        return m5370K();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: E */
    public final int mo5364E() {
        return ghb.m12664j(m5372M());
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: F */
    public final long mo5365F() {
        return ghb.m12665k(mo5367H());
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: G */
    public final int mo5366G() {
        return m5372M();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: H */
    public final long mo5367H() {
        long j;
        long j2;
        long j3;
        int i = this.f11829g;
        int i2 = this.f11827e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f11826d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f11829g = i3;
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
                this.f11829g = i4;
                return j;
            }
        }
        return m5368I();
    }

    /* JADX INFO: renamed from: I */
    public final long m5368I() throws zzaeh {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f11829g;
            if (i2 == this.f11827e) {
                uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.f11829g = i2 + 1;
            byte b = this.f11826d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        uk9.m22782q("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    /* JADX INFO: renamed from: J */
    public final int m5369J() throws zzaeh {
        int i = this.f11829g;
        if (this.f11827e - i < 4) {
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f11829g = i + 4;
        byte[] bArr = this.f11826d;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: K */
    public final long m5370K() throws zzaeh {
        int i = this.f11829g;
        if (this.f11827e - i < 8) {
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.f11829g = i + 8;
        byte[] bArr = this.f11826d;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: renamed from: L */
    public final byte[] m5371L(int i) throws zzaeh {
        if (i > 0) {
            int i2 = this.f11827e;
            int i3 = this.f11829g;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.f11829g = i4;
                return Arrays.copyOfRange(this.f11826d, i3, i4);
            }
        }
        if (i > 0) {
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        if (i == 0) {
            return kib.f47356a;
        }
        uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final int m5372M() {
        int i;
        int i2 = this.f11829g;
        int i3 = this.f11827e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f11826d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f11829g = i4;
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
                this.f11829g = i5;
                return i;
            }
        }
        return (int) m5368I();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: a */
    public final int mo5373a(int i) throws zzaeh {
        if (i < 0) {
            uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + this.f11829g;
        if (i2 < 0) {
            uk9.m22782q("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.f11831i;
        if (i2 > i3) {
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f11831i = i2;
        int i4 = this.f11827e + this.f11828f;
        this.f11827e = i4;
        if (i4 <= i2) {
            this.f11828f = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.f11828f = i5;
        this.f11827e = i4 - i5;
        return i3;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: b */
    public final void mo5374b(int i) {
        this.f11831i = i;
        int i2 = this.f11827e + this.f11828f;
        this.f11827e = i2;
        if (i2 <= i) {
            this.f11828f = 0;
            return;
        }
        int i3 = i2 - i;
        this.f11828f = i3;
        this.f11827e = i2 - i3;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: c */
    public final int mo5375c() {
        int i = this.f11831i;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f11829g;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: d */
    public final boolean mo5376d() {
        return this.f11829g == this.f11827e;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: e */
    public final int mo5377e() {
        return this.f11829g;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: f */
    public final int mo5378f(byte[] bArr, int i, int i2) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            v63.m23128b();
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.f11827e - this.f11829g);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.f11826d, this.f11829g, bArr, i, iMin);
        this.f11829g += iMin;
        return iMin;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: g */
    public final void mo5379g(int i) throws zzaeh {
        if (i >= 0) {
            int i2 = this.f11827e;
            int i3 = this.f11829g;
            if (i <= i2 - i3) {
                this.f11829g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: l */
    public final int mo5380l() throws zzaeh {
        if (mo5376d()) {
            this.f11830h = 0;
            return 0;
        }
        int iM5372M = m5372M();
        this.f11830h = iM5372M;
        if ((iM5372M >>> 3) != 0) {
            return iM5372M;
        }
        uk9.m22782q("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: m */
    public final void mo5381m(int i) throws zzaeh {
        if (this.f11830h == i) {
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
                mo5379g(m5372M());
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
        int i3 = this.f11827e - this.f11829g;
        byte[] bArr = this.f11826d;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.f11829g;
                this.f11829g = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            uk9.m22782q("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = this.f11829g;
            if (i7 == this.f11827e) {
                uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.f11829g = i7 + 1;
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
        return Double.longBitsToDouble(m5370K());
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: p */
    public final float mo5384p() {
        return Float.intBitsToFloat(m5369J());
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
        return m5372M();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: t */
    public final long mo5388t() {
        return m5370K();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: u */
    public final int mo5389u() {
        return m5369J();
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: v */
    public final boolean mo5390v() {
        return mo5367H() != 0;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: w */
    public final String mo5391w() throws zzaeh {
        int iM5372M = m5372M();
        if (iM5372M > 0) {
            int i = this.f11827e;
            int i2 = this.f11829g;
            if (iM5372M <= i - i2) {
                String str = new String(this.f11826d, i2, iM5372M, StandardCharsets.UTF_8);
                this.f11829g += iM5372M;
                return str;
            }
        }
        if (iM5372M == 0) {
            return "";
        }
        if (iM5372M < 0) {
            uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: x */
    public final String mo5392x() throws zzaeh {
        int iM5372M = m5372M();
        if (iM5372M > 0) {
            int i = this.f11827e;
            int i2 = this.f11829g;
            if (iM5372M <= i - i2) {
                String strM5407d = AbstractC0961e.m5407d(this.f11826d, i2, iM5372M);
                this.f11829g += iM5372M;
                return strM5407d;
            }
        }
        if (iM5372M == 0) {
            return "";
        }
        if (iM5372M <= 0) {
            uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: y */
    public final zzacr mo5393y() throws zzaeh {
        int iM5372M = m5372M();
        if (iM5372M > 0) {
            int i = this.f11827e;
            int i2 = this.f11829g;
            if (iM5372M <= i - i2) {
                zzacr zzacrVarM5431m = zzacr.m5431m(this.f11826d, i2, iM5372M);
                this.f11829g += iM5372M;
                return zzacrVarM5431m;
            }
        }
        if (iM5372M == 0) {
            return zzacr.f11869b;
        }
        byte[] bArrM5371L = m5371L(iM5372M);
        zzacr zzacrVar = zzacr.f11869b;
        return bArrM5371L.length == 0 ? zzacr.f11869b : new zzacq(bArrM5371L);
    }

    @Override // p000.ghb
    /* JADX INFO: renamed from: z */
    public final byte[] mo5394z() {
        return m5371L(m5372M());
    }
}
