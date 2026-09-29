package p000;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zxc {

    /* JADX INFO: renamed from: a */
    public static final byte[] f72363a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b */
    public static final byte[] f72364b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public static boolean m25851a(iy2 iy2Var) {
        k47 k47Var = new k47(8);
        int i = gh5.m12655a(iy2Var, k47Var).f40819a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        iy2Var.mo13085o(k47Var.f46700a, 0, 4);
        k47Var.m14818M(0);
        int iM14829m = k47Var.m14829m();
        if (iM14829m == 1463899717) {
            return true;
        }
        ss5.m21723u("WavHeaderReader", "Unsupported form type: " + iM14829m);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static gh5 m25852b(int i, iy2 iy2Var, k47 k47Var) throws ParserException {
        gh5 gh5VarM12655a = gh5.m12655a(iy2Var, k47Var);
        while (true) {
            int i2 = gh5VarM12655a.f40819a;
            if (i2 == i) {
                return gh5VarM12655a;
            }
            hn1.m13364n("Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
            long j = gh5VarM12655a.f40820b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.m2517b("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            iy2Var.mo13082k((int) j2);
            gh5VarM12655a = gh5.m12655a(iy2Var, k47Var);
        }
    }
}
