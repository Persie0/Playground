package p000;

import androidx.compose.material3.tokens.ShapeKeyTokens;

/* JADX INFO: loaded from: classes.dex */
public final class my3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f52030a = 0;

    static {
        int i = aab.f429a;
        ShapeKeyTokens shapeKeyTokens = ib9.f43906a;
        int i2 = zv5.f72276a;
        int i3 = mp4.f51700a;
        int i4 = z9b.f71246a;
    }

    /* JADX INFO: renamed from: a */
    public static ly3 m17148a(pa1 pa1Var, long j) {
        ly3 ly3Var = pa1Var.f55853f0;
        if (ly3Var != null) {
            return ly3Var;
        }
        long j2 = aa1.f411j;
        ly3 ly3Var2 = new ly3(j2, j, j2, aa1.m198b(rg9.f59242a, j));
        pa1Var.f55853f0 = ly3Var2;
        return ly3Var2;
    }

    /* JADX INFO: renamed from: b */
    public static ly3 m17149b(long j, long j2, ye1 ye1Var, int i) {
        if ((i & 1) != 0) {
            j = aa1.f412k;
        }
        tj3 tj3Var = (tj3) ye1Var;
        return m17148a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a).m16572a(j, j2, aa1.f412k, aa1.m198b(rg9.f59242a, j2));
    }

    /* JADX INFO: renamed from: c */
    public static long m17150c() {
        float f = ib9.f43907b;
        return AbstractC3584sr.m21614a(ib9.f43908c + f + f, 40.0f);
    }
}
