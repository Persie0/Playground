package com.google.android.gms.internal.vision;

import java.util.logging.Logger;
import p000.dnb;
import p000.f0d;
import p000.gfc;
import p000.iwc;
import p000.noc;
import p000.uk9;
import p000.wfc;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C1031p {

    /* JADX INFO: renamed from: e */
    public static final Logger f12234e = Logger.getLogger(C1031p.class.getName());

    /* JADX INFO: renamed from: f */
    public static final boolean f12235f = f0d.f38162e;

    /* JADX INFO: renamed from: a */
    public C1032q f12236a;

    /* JADX INFO: renamed from: b */
    public final byte[] f12237b;

    /* JADX INFO: renamed from: c */
    public final int f12238c;

    /* JADX INFO: renamed from: d */
    public int f12239d;

    public C1031p(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            uk9.m22783r("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.f12237b = bArr;
        this.f12239d = 0;
        this.f12238c = i;
    }

    /* JADX INFO: renamed from: f */
    public static int m5715f(String str) {
        int length;
        try {
            length = AbstractC1040y.m5821a(str);
        } catch (zzmg unused) {
            length = str.getBytes(noc.f53082a).length;
        }
        return m5725t(length) + length;
    }

    /* JADX INFO: renamed from: h */
    public static int m5716h(int i, zzht zzhtVar) {
        int iM5725t = m5725t(i << 3);
        int iMo5832f = zzhtVar.mo5832f();
        return dnb.m10500a(iMo5832f, iMo5832f, iM5725t);
    }

    /* JADX INFO: renamed from: i */
    public static int m5717i(int i, gfc gfcVar, iwc iwcVar) {
        int iM5725t = m5725t(i << 3) << 1;
        int iMo5745c = gfcVar.mo5745c();
        if (iMo5745c == -1) {
            iMo5745c = iwcVar.mo5763e(gfcVar);
            gfcVar.mo5744b(iMo5745c);
        }
        return iM5725t + iMo5745c;
    }

    /* JADX INFO: renamed from: m */
    public static int m5718m(int i) {
        return m5725t(i << 3);
    }

    /* JADX INFO: renamed from: n */
    public static int m5719n(int i, long j) {
        return m5720o(j) + m5725t(i << 3);
    }

    /* JADX INFO: renamed from: o */
    public static int m5720o(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: p */
    public static int m5721p(int i) {
        if (i >= 0) {
            return m5725t(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: q */
    public static int m5722q(int i, long j) {
        return m5720o((j >> 63) ^ (j << 1)) + m5725t(i << 3);
    }

    /* JADX INFO: renamed from: r */
    public static int m5723r(int i) {
        return m5725t(i << 3) + 8;
    }

    /* JADX INFO: renamed from: s */
    public static int m5724s(int i, int i2) {
        return m5725t(i2) + m5725t(i << 3);
    }

    /* JADX INFO: renamed from: t */
    public static int m5725t(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: u */
    public static int m5726u(int i, int i2) {
        return m5725t((i2 >> 31) ^ (i2 << 1)) + m5725t(i << 3);
    }

    /* JADX INFO: renamed from: v */
    public static int m5727v(int i) {
        return m5725t(i << 3) + 4;
    }

    /* JADX INFO: renamed from: a */
    public final void m5728a(byte b) throws zzii$zzb {
        try {
            byte[] bArr = this.f12237b;
            int i = this.f12239d;
            this.f12239d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzii$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12239d), Integer.valueOf(this.f12238c), 1), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5729b(int i) throws zzii$zzb {
        if (i >= 0) {
            m5733g(i);
        } else {
            m5731d(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5730c(int i, int i2) {
        m5733g((i << 3) | i2);
    }

    /* JADX INFO: renamed from: d */
    public final void m5731d(long j) {
        boolean z = f12235f;
        byte[] bArr = this.f12237b;
        if (!z || m5732e() < 10) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f12239d;
                if (j2 == 0) {
                    this.f12239d = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        this.f12239d = i + 1;
                        bArr[i] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzii$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12239d), Integer.valueOf(this.f12238c), 1), e);
                    }
                }
                throw new zzii$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12239d), Integer.valueOf(this.f12238c), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i2 = this.f12239d;
            if (j3 == 0) {
                this.f12239d = i2 + 1;
                f0d.m11438e(bArr, i2, (byte) j);
                return;
            } else {
                this.f12239d = i2 + 1;
                f0d.m11438e(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m5732e() {
        return this.f12238c - this.f12239d;
    }

    /* JADX INFO: renamed from: g */
    public final void m5733g(int i) throws zzii$zzb {
        boolean z = f12235f;
        byte[] bArr = this.f12237b;
        if (!z || wfc.m23932a() || m5732e() < 5) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f12239d;
                if (i2 == 0) {
                    this.f12239d = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    try {
                        this.f12239d = i3 + 1;
                        bArr[i3] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzii$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12239d), Integer.valueOf(this.f12238c), 1), e);
                    }
                }
                throw new zzii$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12239d), Integer.valueOf(this.f12238c), 1), e);
            }
        }
        int i4 = i & (-128);
        int i5 = this.f12239d;
        if (i4 == 0) {
            this.f12239d = i5 + 1;
            f0d.m11438e(bArr, i5, (byte) i);
            return;
        }
        this.f12239d = i5 + 1;
        f0d.m11438e(bArr, i5, (byte) (i | 128));
        int i6 = i >>> 7;
        int i7 = i6 & (-128);
        int i8 = this.f12239d;
        if (i7 == 0) {
            this.f12239d = i8 + 1;
            f0d.m11438e(bArr, i8, (byte) i6);
            return;
        }
        this.f12239d = i8 + 1;
        f0d.m11438e(bArr, i8, (byte) (i6 | 128));
        int i9 = i >>> 14;
        int i10 = i9 & (-128);
        int i11 = this.f12239d;
        if (i10 == 0) {
            this.f12239d = i11 + 1;
            f0d.m11438e(bArr, i11, (byte) i9);
            return;
        }
        this.f12239d = i11 + 1;
        f0d.m11438e(bArr, i11, (byte) (i9 | 128));
        int i12 = i >>> 21;
        int i13 = i12 & (-128);
        int i14 = this.f12239d;
        if (i13 == 0) {
            this.f12239d = i14 + 1;
            f0d.m11438e(bArr, i14, (byte) i12);
            return;
        }
        this.f12239d = i14 + 1;
        f0d.m11438e(bArr, i14, (byte) (i12 | 128));
        int i15 = this.f12239d;
        this.f12239d = i15 + 1;
        f0d.m11438e(bArr, i15, (byte) (i >>> 28));
    }

    /* JADX INFO: renamed from: j */
    public final void m5734j(long j) {
        try {
            byte[] bArr = this.f12237b;
            int i = this.f12239d;
            int i2 = i + 1;
            this.f12239d = i2;
            bArr[i] = (byte) j;
            int i3 = i + 2;
            this.f12239d = i3;
            bArr[i2] = (byte) (j >> 8);
            int i4 = i + 3;
            this.f12239d = i4;
            bArr[i3] = (byte) (j >> 16);
            int i5 = i + 4;
            this.f12239d = i5;
            bArr[i4] = (byte) (j >> 24);
            int i6 = i + 5;
            this.f12239d = i6;
            bArr[i5] = (byte) (j >> 32);
            int i7 = i + 6;
            this.f12239d = i7;
            bArr[i6] = (byte) (j >> 40);
            int i8 = i + 7;
            this.f12239d = i8;
            bArr[i7] = (byte) (j >> 48);
            this.f12239d = i + 8;
            bArr[i8] = (byte) (j >> 56);
        } catch (IndexOutOfBoundsException e) {
            throw new zzii$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12239d), Integer.valueOf(this.f12238c), 1), e);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5735k(byte[] bArr, int i, int i2) throws zzii$zzb {
        try {
            System.arraycopy(bArr, i, this.f12237b, this.f12239d, i2);
            this.f12239d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzii$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12239d), Integer.valueOf(this.f12238c), Integer.valueOf(i2)), e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5736l(int i) {
        try {
            byte[] bArr = this.f12237b;
            int i2 = this.f12239d;
            int i3 = i2 + 1;
            this.f12239d = i3;
            bArr[i2] = (byte) i;
            int i4 = i2 + 2;
            this.f12239d = i4;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i2 + 3;
            this.f12239d = i5;
            bArr[i4] = (byte) (i >> 16);
            this.f12239d = i2 + 4;
            bArr[i5] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e) {
            throw new zzii$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12239d), Integer.valueOf(this.f12238c), 1), e);
        }
    }
}
