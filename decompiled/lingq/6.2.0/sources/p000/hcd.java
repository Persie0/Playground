package p000;

import com.lingq.core.analytics.embedded.EmbeddedMessage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hcd {
    /* JADX INFO: renamed from: a */
    public static final void m13199a(EmbeddedMessage embeddedMessage, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1348994714);
        int i2 = (tj3Var.m22124i(embeddedMessage) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22120g(e16Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            r46.m20382g(c99.m4429v(e16Var), null, null, null, null, null, ci8.m4703P(-132868492, new op2(embeddedMessage, vi3Var, 3), tj3Var), tj3Var, 1572864, 62);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pp2(embeddedMessage, vi3Var, e16Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final e16 m13200b(e16 e16Var, float f) {
        return e16Var.mo3161g(new xbb(f));
    }
}
