package p000;

import androidx.compose.foundation.AbstractC0080f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k2d {

    /* JADX INFO: renamed from: a */
    public static p04 f46604a;

    /* JADX INFO: renamed from: a */
    public static final void m14774a(dx8 dx8Var, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-955748033);
        int i2 = (tj3Var2.m22124i(dx8Var) ? 4 : 2) | i | (tj3Var2.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            String str = dx8Var.f36398b;
            vx9 vx9Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71406j;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(b16.f7762a, 1.0f), 15);
            zf1 zf1Var = ge9.f40637a;
            tj3Var = tj3Var2;
            lw9.m16554b(str, AbstractC3584sr.m21608U(e16VarM815b, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 131068);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(dx8Var, i, 7, ui3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14775b(fx8 fx8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        fx8Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1105585453);
        int i2 = (tj3Var.m22124i(fx8Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = 18;
        int i4 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b34.m3232b(null, ci8.m4703P(1015249303, new ww8(vi3Var, i4), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(296446946, new iz4(i3, fx8Var, vi3Var), tj3Var), tj3Var, 805306416, 509);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(fx8Var, i, 27, vi3Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final p04 m14776c() {
        p04 p04Var = f46604a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(19.0f, 13.0f);
        f57Var.m11550e(-6.0f);
        f57Var.m11557l(6.0f);
        f57Var.m11550e(-2.0f);
        f57Var.m11557l(-6.0f);
        f57Var.m11549d(5.0f);
        f57Var.m11557l(-2.0f);
        f57Var.m11550e(6.0f);
        f57Var.m11556k(5.0f);
        f57Var.m11550e(2.0f);
        f57Var.m11557l(6.0f);
        f57Var.m11550e(6.0f);
        f57Var.m11557l(2.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f46604a = p04VarM17721b;
        return p04VarM17721b;
    }
}
