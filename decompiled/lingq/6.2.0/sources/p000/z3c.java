package p000;

import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfa;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class z3c {

    /* JADX INFO: renamed from: e */
    public static final boolean f70844e = lkc.f49788e;

    /* JADX INFO: renamed from: a */
    public gw9 f70845a;

    /* JADX INFO: renamed from: b */
    public final byte[] f70846b;

    /* JADX INFO: renamed from: c */
    public final int f70847c;

    /* JADX INFO: renamed from: d */
    public int f70848d;

    public z3c(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            C3386nv.m17626m(wq1.m24115k("Array range is invalid. Buffer.length=", length, i, ", offset=0, length="));
            throw null;
        }
        this.f70846b = bArr;
        this.f70848d = 0;
        this.f70847c = i;
    }

    /* JADX INFO: renamed from: o */
    public static int m25433o(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: p */
    public static int m25434p(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: a */
    public final void m25435a(byte b) throws zzfa {
        int i = this.f70848d;
        try {
            int i2 = i + 1;
            try {
                this.f70846b[i] = b;
                this.f70848d = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzfa(i, this.f70847c, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m25436b(byte[] bArr, int i, int i2) throws zzfa {
        try {
            System.arraycopy(bArr, i, this.f70846b, this.f70848d, i2);
            this.f70848d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(this.f70848d, this.f70847c, i2, e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m25437c(int i, zzev zzevVar) throws zzfa {
        m25446l((i << 3) | 2);
        m25446l(zzevVar.mo5681h());
        zzevVar.mo5683j(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m25438d(int i, int i2) throws zzfa {
        m25446l((i << 3) | 5);
        m25439e(i2);
    }

    /* JADX INFO: renamed from: e */
    public final void m25439e(int i) throws zzfa {
        int i2 = this.f70848d;
        try {
            byte[] bArr = this.f70846b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f70848d = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(i2, this.f70847c, 4, e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m25440f(int i, long j) throws zzfa {
        m25446l((i << 3) | 1);
        m25441g(j);
    }

    /* JADX INFO: renamed from: g */
    public final void m25441g(long j) throws zzfa {
        int i = this.f70848d;
        try {
            byte[] bArr = this.f70846b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f70848d = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzfa(i, this.f70847c, 8, e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m25442h(int i, int i2) throws zzfa {
        m25446l(i << 3);
        m25443i(i2);
    }

    /* JADX INFO: renamed from: i */
    public final void m25443i(int i) throws zzfa {
        if (i >= 0) {
            m25446l(i);
        } else {
            m25448n(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m25444j(int i, int i2) throws zzfa {
        m25446l((i << 3) | i2);
    }

    /* JADX INFO: renamed from: k */
    public final void m25445k(int i, int i2) throws zzfa {
        m25446l(i << 3);
        m25446l(i2);
    }

    /* JADX INFO: renamed from: l */
    public final void m25446l(int i) throws zzfa {
        int i2;
        int i3 = this.f70848d;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f70846b;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f70848d = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzfa(i2, this.f70847c, 1, e);
                }
            }
            throw new zzfa(i2, this.f70847c, 1, e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m25447m(int i, long j) throws zzfa {
        m25446l(i << 3);
        m25448n(j);
    }

    /* JADX INFO: renamed from: n */
    public final void m25448n(long j) throws zzfa {
        int i;
        int i2 = this.f70848d;
        boolean z = f70844e;
        byte[] bArr = this.f70846b;
        int i3 = this.f70847c;
        if (!z || i3 - i2 < 10) {
            int i4 = i2;
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i5 = i4 + 1;
                try {
                    bArr[i4] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i4 = i5;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i5;
                    throw new zzfa(i, i3, 1, e);
                }
            }
            i = i4 + 1;
            try {
                bArr[i4] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzfa(i, i3, 1, e);
            }
        } else {
            int i6 = i2;
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                lkc.f49786c.mo4821g(bArr, lkc.f49789f + ((long) i6), (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i6++;
            }
            i = i6 + 1;
            lkc.f49786c.mo4821g(bArr, lkc.f49789f + ((long) i6), (byte) j3);
        }
        this.f70848d = i;
    }
}
