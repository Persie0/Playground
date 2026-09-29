package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yid {
    /* JADX INFO: renamed from: a */
    public static final void m25158a(String str, String str2, String str3, ui3 ui3Var, ye1 ye1Var, int i) {
        ui3 ui3Var2;
        str.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-464357405);
        int i2 = (tj3Var.m22120g(str) ? 4 : 2) | i | (tj3Var.m22120g(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ui3Var2 = ui3Var;
            i2 |= tj3Var.m22124i(ui3Var2) ? 2048 : 1024;
        } else {
            ui3Var2 = ui3Var;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16Var, 1.0f), 200.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4414g);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ss5.m21702b((str3 == null || str3.length() == 0) ? str2 : str3, null, c99.m4411d(b16Var, 1.0f), null, (str3 == null || str3.length() == 0) ? hl1.f42565b : hl1.f42564a, tj3Var, 432, 4024);
            e16 e16VarM4414g2 = c99.m4414g(c99.m4412e(b16Var, 1.0f), 80.0f);
            gc0 gc0Var = nj0.f52815j;
            ci0 ci0Var = ci0.f10109a;
            qh0.m19963a(d32.m10006C(ci0Var.mo3727a(e16VarM4414g2, gc0Var), ui0.m22749e(vi0.Companion, vz1.m23605K(new aa1(aa1.f411j), new aa1(aa1.m198b(0.6f, aa1.f403b))), 0.0f, 0.0f, 14)), tj3Var, 0);
            vx9 vx9Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71404h;
            long j = aa1.f406e;
            e16 e16VarMo3727a = ci0Var.mo3727a(b16Var, nj0.f52814i);
            zf1 zf1Var = ge9.f40637a;
            lw9.m16554b(str, AbstractC3584sr.m21607T(e16VarMo3727a, ((fe9) tj3Var.m22128k(zf1Var)).f38960i), j, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, vx9Var, tj3Var, (i2 & 14) | 384, 24960, 110584);
            ui3 ui3Var4 = ui3Var2;
            omd.m18141c(ui3Var4, AbstractC3584sr.m21607T(ci0Var.mo3727a(b16Var, nj0.f52810e), ((fe9) tj3Var.m22128k(zf1Var)).f38952a), false, null, null, cxb.f34696a, tj3Var, ((i2 >> 9) & 14) | 1572864, 60);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(str, str2, str3, ui3Var, i);
        }
    }
}
