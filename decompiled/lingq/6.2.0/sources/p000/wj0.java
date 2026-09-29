package p000;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;

/* JADX INFO: loaded from: classes.dex */
public abstract class wj0 {

    /* JADX INFO: renamed from: a */
    public static final x17 f66899a;

    /* JADX INFO: renamed from: b */
    public static final x17 f66900b;

    /* JADX INFO: renamed from: c */
    public static final float f66901c;

    static {
        float f = ma0.f50825a;
        float f2 = ma0.f50826b;
        ShapeKeyTokens shapeKeyTokens = ck0.f10188a;
        f66899a = new x17(f, 8.0f, f2, 8.0f);
        AbstractC3584sr.m21624f(16.0f, 8.0f, f2, 8.0f);
        f66900b = new x17(12.0f, 8.0f, 12.0f, 8.0f);
        AbstractC3584sr.m21624f(12.0f, 8.0f, 16.0f, 8.0f);
        f66901c = 58.0f;
        int i = ek0.f37377a;
        int i2 = bk0.f8630a;
        int i3 = ak0.f750a;
        int i4 = dk0.f35740a;
    }

    /* JADX INFO: renamed from: a */
    public static vj0 m23996a(long j, long j2, long j3, ye1 ye1Var, int i) {
        if ((i & 2) != 0) {
            j2 = aa1.f412k;
        }
        long j4 = j2;
        long j5 = aa1.f412k;
        return m23998c(((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51799a).m23297a(j, j4, j5, (i & 8) != 0 ? j5 : j3);
    }

    /* JADX INFO: renamed from: b */
    public static xj0 m23997b(int i) {
        if ((i & 1) != 0) {
            ColorSchemeKeyTokens colorSchemeKeyTokens = a43.f201a;
        }
        return new xj0(0.0f, a43.f206f);
    }

    /* JADX INFO: renamed from: c */
    public static vj0 m23998c(pa1 pa1Var) {
        vj0 vj0Var = pa1Var.f55838W;
        if (vj0Var != null) {
            return vj0Var;
        }
        vj0 vj0Var2 = new vj0(ra1.m20491d(pa1Var, a43.f201a), ra1.m20491d(pa1Var, a43.f207g), aa1.m198b(a43.f203c, ra1.m20491d(pa1Var, a43.f202b)), aa1.m198b(a43.f205e, ra1.m20491d(pa1Var, a43.f204d)));
        pa1Var.f55838W = vj0Var2;
        return vj0Var2;
    }

    /* JADX INFO: renamed from: d */
    public static vj0 m23999d(pa1 pa1Var) {
        vj0 vj0Var = pa1Var.f55839X;
        if (vj0Var != null) {
            return vj0Var;
        }
        long j = aa1.f411j;
        vj0 vj0Var2 = new vj0(j, ra1.m20491d(pa1Var, d07.f34808c), j, aa1.m198b(d07.f34807b, ra1.m20491d(pa1Var, d07.f34806a)));
        pa1Var.f55839X = vj0Var2;
        return vj0Var2;
    }

    /* JADX INFO: renamed from: e */
    public static vj0 m24000e(pa1 pa1Var) {
        vj0 vj0Var = pa1Var.f55840Y;
        if (vj0Var != null) {
            return vj0Var;
        }
        long j = aa1.f411j;
        vj0 vj0Var2 = new vj0(j, ra1.m20491d(pa1Var, ColorSchemeKeyTokens.Primary), j, aa1.m198b(xs9.f68665b, ra1.m20491d(pa1Var, xs9.f68664a)));
        pa1Var.f55840Y = vj0Var2;
        return vj0Var2;
    }

    /* JADX INFO: renamed from: f */
    public static float m24001f() {
        if (((Boolean) ((xc9) di7.f35689a).getValue()).booleanValue()) {
            return 36.0f;
        }
        ShapeKeyTokens shapeKeyTokens = ck0.f10188a;
        return 40.0f;
    }

    /* JADX INFO: renamed from: g */
    public static vj0 m24002g(long j, long j2, ye1 ye1Var, int i) {
        if ((i & 1) != 0) {
            j = aa1.f412k;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = aa1.f412k;
        }
        long j4 = aa1.f412k;
        return m23999d(((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51799a).m23297a(j3, j2, j4, j4);
    }
}
