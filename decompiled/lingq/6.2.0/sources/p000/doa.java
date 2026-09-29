package p000;

import android.content.IntentSender;
import android.util.SparseArray;
import androidx.activity.result.IntentSenderRequest;
import androidx.media3.common.C0713b;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class doa implements wh0 {

    /* JADX INFO: renamed from: e */
    public static final long[] f35970e = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35971a;

    /* JADX INFO: renamed from: b */
    public int f35972b;

    /* JADX INFO: renamed from: c */
    public int f35973c;

    /* JADX INFO: renamed from: d */
    public final Object f35974d;

    public doa(f46 f46Var, C0713b c0713b) {
        this.f35971a = 1;
        k47 k47Var = f46Var.f38414c;
        this.f35974d = k47Var;
        k47Var.m14818M(12);
        int iM14809D = k47Var.m14809D();
        if ("audio/raw".equals(c0713b.f6406o)) {
            int iM22819n = uma.m22819n(c0713b.f6383I) * c0713b.f6381G;
            if (iM14809D % iM22819n != 0) {
                ss5.m21707d0("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iM22819n + ", stsz sample size: " + iM14809D);
                iM14809D = iM22819n;
            }
        }
        this.f35972b = iM14809D == 0 ? -1 : iM14809D;
        this.f35973c = k47Var.m14809D();
    }

    /* JADX INFO: renamed from: d */
    public static long m10552d(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f35970e[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: a */
    public int mo10553a() {
        return this.f35972b;
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: b */
    public int mo10554b() {
        return this.f35973c;
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: c */
    public int mo10555c() {
        int i = this.f35972b;
        return i == -1 ? ((k47) this.f35974d).m14809D() : i;
    }

    /* JADX INFO: renamed from: e */
    public IntentSenderRequest m10556e() {
        return new IntentSenderRequest((IntentSender) this.f35974d, null, this.f35972b, this.f35973c);
    }

    /* JADX INFO: renamed from: f */
    public byte m10557f(int i, int i2) {
        return ((byte[][]) this.f35974d)[i2][i];
    }

    /* JADX INFO: renamed from: g */
    public long m10558g(iy2 iy2Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.f35974d;
        if (this.f35972b == 0) {
            if (!iy2Var.mo13074a(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((f35970e[i4] & ((long) i3)) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.f35973c = i2;
            if (i2 == -1) {
                C3386nv.m17633t("No valid varint length mask found");
                return 0L;
            }
            this.f35972b = 1;
        }
        int i5 = this.f35973c;
        if (i5 > i) {
            this.f35972b = 0;
            return -2L;
        }
        if (i5 != 1) {
            iy2Var.readFully(bArr, 1, i5 - 1);
        }
        this.f35972b = 0;
        return m10552d(bArr, this.f35973c, z2);
    }

    /* JADX INFO: renamed from: h */
    public void m10559h(int i, int i2, int i3) {
        ((byte[][]) this.f35974d)[i2][i] = (byte) i3;
    }

    /* JADX INFO: renamed from: i */
    public void m10560i(int i, int i2, boolean z) {
        ((byte[][]) this.f35974d)[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: j */
    public void m10561j(int i, int i2) {
        this.f35973c = i;
        this.f35972b = i2;
    }

    public String toString() {
        switch (this.f35971a) {
            case 2:
                int i = this.f35972b;
                int i2 = this.f35973c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.f35974d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public doa() {
        this.f35971a = 0;
        this.f35974d = new byte[8];
    }

    public doa(IntentSender intentSender) {
        this.f35971a = 4;
        intentSender.getClass();
        this.f35974d = intentSender;
    }

    public doa(int i, int i2, SparseArray sparseArray) {
        this.f35971a = 3;
        this.f35972b = i;
        this.f35973c = i2;
        this.f35974d = sparseArray;
    }

    public doa(int i, int i2) {
        this.f35971a = 2;
        this.f35974d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f35972b = i;
        this.f35973c = i2;
    }
}
