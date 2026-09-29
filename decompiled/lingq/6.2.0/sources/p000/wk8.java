package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wk8 {

    /* JADX INFO: renamed from: a */
    public final gv5 f66975a;

    /* JADX INFO: renamed from: b */
    public final int f66976b;

    /* JADX INFO: renamed from: c */
    public final k47 f66977c;

    /* JADX INFO: renamed from: d */
    public vh0 f66978d;

    /* JADX INFO: renamed from: e */
    public vh0 f66979e;

    /* JADX INFO: renamed from: f */
    public vh0 f66980f;

    /* JADX INFO: renamed from: g */
    public long f66981g;

    public wk8(gv5 gv5Var) {
        int i;
        this.f66975a = gv5Var;
        synchronized (gv5Var) {
            i = ((h72) gv5Var.f41394d).f41860c.f63380b;
        }
        this.f66976b = i;
        this.f66977c = new k47(32);
        vh0 vh0Var = new vh0(i, 0L);
        this.f66978d = vh0Var;
        this.f66979e = vh0Var;
        this.f66980f = vh0Var;
    }

    /* JADX INFO: renamed from: c */
    public static vh0 m24023c(vh0 vh0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= vh0Var.f65366b) {
            vh0Var = (vh0) vh0Var.f65368d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (vh0Var.f65366b - j));
            C3830ze c3830ze = (C3830ze) vh0Var.f65367c;
            byteBuffer.put(c3830ze.f71428a, ((int) (j - vh0Var.f65365a)) + c3830ze.f71429b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == vh0Var.f65366b) {
                vh0Var = (vh0) vh0Var.f65368d;
            }
        }
        return vh0Var;
    }

    /* JADX INFO: renamed from: d */
    public static vh0 m24024d(vh0 vh0Var, long j, byte[] bArr, int i) {
        while (j >= vh0Var.f65366b) {
            vh0Var = (vh0) vh0Var.f65368d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (vh0Var.f65366b - j));
            C3830ze c3830ze = (C3830ze) vh0Var.f65367c;
            System.arraycopy(c3830ze.f71428a, ((int) (j - vh0Var.f65365a)) + c3830ze.f71429b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == vh0Var.f65366b) {
                vh0Var = (vh0) vh0Var.f65368d;
            }
        }
        return vh0Var;
    }

    /* JADX INFO: renamed from: e */
    public static vh0 m24025e(vh0 vh0Var, m32 m32Var, b04 b04Var, k47 k47Var) {
        if (m32Var.m3751d(1073741824)) {
            long j = b04Var.f7721b;
            int iM14812G = 1;
            k47Var.m14815J(1);
            vh0 vh0VarM24024d = m24024d(vh0Var, j, k47Var.f46700a, 1);
            long j2 = j + 1;
            byte b = k47Var.f46700a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            xr1 xr1Var = m32Var.f50499d;
            byte[] bArr = xr1Var.f68560a;
            if (bArr == null) {
                xr1Var.f68560a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            vh0Var = m24024d(vh0VarM24024d, j2, xr1Var.f68560a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                k47Var.m14815J(2);
                vh0Var = m24024d(vh0Var, j3, k47Var.f46700a, 2);
                j3 += 2;
                iM14812G = k47Var.m14812G();
            }
            int[] iArr = xr1Var.f68563d;
            if (iArr == null || iArr.length < iM14812G) {
                iArr = new int[iM14812G];
            }
            int[] iArr2 = xr1Var.f68564e;
            if (iArr2 == null || iArr2.length < iM14812G) {
                iArr2 = new int[iM14812G];
            }
            if (z) {
                int i2 = iM14812G * 6;
                k47Var.m14815J(i2);
                vh0Var = m24024d(vh0Var, j3, k47Var.f46700a, i2);
                j3 += (long) i2;
                k47Var.m14818M(0);
                for (int i3 = 0; i3 < iM14812G; i3++) {
                    iArr[i3] = k47Var.m14812G();
                    iArr2[i3] = k47Var.m14809D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b04Var.f7720a - ((int) (j3 - b04Var.f7721b));
            }
            m8a m8aVar = (m8a) b04Var.f7722c;
            String str = uma.f64080a;
            byte[] bArr2 = m8aVar.f50765b;
            byte[] bArr3 = xr1Var.f68560a;
            int i4 = m8aVar.f50764a;
            int i5 = m8aVar.f50766c;
            int i6 = m8aVar.f50767d;
            xr1Var.f68565f = iM14812G;
            xr1Var.f68563d = iArr;
            xr1Var.f68564e = iArr2;
            xr1Var.f68561b = bArr2;
            xr1Var.f68560a = bArr3;
            xr1Var.f68562c = i4;
            xr1Var.f68566g = i5;
            xr1Var.f68567h = i6;
            MediaCodec.CryptoInfo cryptoInfo = xr1Var.f68568i;
            cryptoInfo.numSubSamples = iM14812G;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            b64 b64Var = xr1Var.f68569j;
            b64Var.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) b64Var.f8007b;
            pattern.set(i5, i6);
            ((MediaCodec.CryptoInfo) b64Var.f8006a).setPattern(pattern);
            long j4 = b04Var.f7721b;
            int i7 = (int) (j3 - j4);
            b04Var.f7721b = j4 + ((long) i7);
            b04Var.f7720a -= i7;
        }
        if (!m32Var.m3751d(268435456)) {
            m32Var.m16609n(b04Var.f7720a);
            return m24023c(vh0Var, b04Var.f7721b, m32Var.f50500e, b04Var.f7720a);
        }
        k47Var.m14815J(4);
        vh0 vh0VarM24024d2 = m24024d(vh0Var, b04Var.f7721b, k47Var.f46700a, 4);
        int iM14809D = k47Var.m14809D();
        b04Var.f7721b += 4;
        b04Var.f7720a -= 4;
        m32Var.m16609n(iM14809D);
        vh0 vh0VarM24023c = m24023c(vh0VarM24024d2, b04Var.f7721b, m32Var.f50500e, iM14809D);
        b04Var.f7721b += (long) iM14809D;
        int i8 = b04Var.f7720a - iM14809D;
        b04Var.f7720a = i8;
        ByteBuffer byteBuffer = m32Var.f50503h;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            m32Var.f50503h = ByteBuffer.allocate(i8);
        } else {
            m32Var.f50503h.clear();
        }
        return m24023c(vh0VarM24023c, b04Var.f7721b, m32Var.f50503h, b04Var.f7720a);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0040 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24026a(long j) {
        vh0 vh0Var;
        if (j == -1) {
            return;
        }
        while (true) {
            vh0Var = this.f66978d;
            if (j < vh0Var.f65366b) {
                break;
            }
            gv5 gv5Var = this.f66975a;
            C3830ze c3830ze = (C3830ze) vh0Var.f65367c;
            synchronized (gv5Var) {
                u42 u42Var = ((h72) gv5Var.f41394d).f41860c;
                synchronized (u42Var) {
                    try {
                        C3830ze[] c3830zeArr = u42Var.f63384f;
                        int i = u42Var.f63383e;
                        u42Var.f63383e = i + 1;
                        c3830zeArr[i] = c3830ze;
                        u42Var.f63382d--;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gv5Var.m12881K(c3830ze);
            }
            vh0 vh0Var2 = this.f66978d;
            vh0Var2.f65367c = null;
            vh0 vh0Var3 = (vh0) vh0Var2.f65368d;
            vh0Var2.f65368d = null;
            this.f66978d = vh0Var3;
        }
        if (this.f66979e.f65365a < vh0Var.f65365a) {
            this.f66979e = vh0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m24027b(int i) {
        C3830ze c3830zeM22446a;
        vh0 vh0Var = this.f66980f;
        if (((C3830ze) vh0Var.f65367c) == null) {
            gv5 gv5Var = this.f66975a;
            synchronized (gv5Var) {
                c3830zeM22446a = ((h72) gv5Var.f41394d).f41860c.m22446a();
                ((HashMap) gv5Var.f41392b).put(c3830zeM22446a, (xb7) gv5Var.f41393c);
                g72 g72Var = (g72) ((h72) gv5Var.f41394d).f41873p.get((xb7) gv5Var.f41393c);
                if (g72Var != null) {
                    synchronized (g72Var) {
                        g72Var.f40312d++;
                    }
                }
            }
            vh0 vh0Var2 = new vh0(this.f66976b, this.f66980f.f65366b);
            vh0Var.f65367c = c3830zeM22446a;
            vh0Var.f65368d = vh0Var2;
        }
        return Math.min(i, (int) (this.f66980f.f65366b - this.f66981g));
    }
}
