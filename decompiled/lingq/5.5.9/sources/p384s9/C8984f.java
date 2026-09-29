package p384s9;

import java.io.IOException;
import p261m9.C7504e;

/* JADX INFO: renamed from: s9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8984f {

    /* JADX INFO: renamed from: d */
    public static final long[] f47158d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f47159a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f47160b;

    /* JADX INFO: renamed from: c */
    public int f47161c;

    /* JADX INFO: renamed from: a */
    public static long m17229a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f47158d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final long m17230b(C7504e c7504e, boolean z10, boolean z11, int i10) throws IOException {
        int i11;
        int i12 = this.f47160b;
        byte[] bArr = this.f47159a;
        if (i12 == 0) {
            if (!c7504e.mo14993b(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((f47158d[i14] & ((long) i13)) != 0) {
                    i11 = i14 + 1;
                    break;
                }
                i14++;
            }
            this.f47161c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f47160b = 1;
        }
        int i15 = this.f47161c;
        if (i15 > i10) {
            this.f47160b = 0;
            return -2L;
        }
        if (i15 != 1) {
            c7504e.mo14993b(bArr, 1, i15 - 1, false);
        }
        this.f47160b = 0;
        return m17229a(bArr, this.f47161c, z11);
    }
}
