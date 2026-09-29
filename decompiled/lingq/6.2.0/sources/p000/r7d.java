package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r7d {

    /* JADX INFO: renamed from: a */
    public static p04 f58867a;

    /* JADX INFO: renamed from: a */
    public static final void m20437a(e16 e16Var, String str, String str2, List list, InterfaceC3624tu interfaceC3624tu, vi3 vi3Var, ui3 ui3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        str.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-191738740);
        int i2 = i | 6 | (tj3Var.m22120g(str) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(list) ? 2048 : 1024;
        }
        int i3 = i2 | (tj3Var.m22124i(vi3Var) ? 131072 : 65536) | (tj3Var.m22124i(ui3Var) ? 1048576 : 524288);
        if (tj3Var.m22099R(i3 & 1, (599187 & i3) != 599186)) {
            l5d.m15820a(null, 0.0f, ui3Var, ci8.m4703P(-722178811, new zs0(str, str2, interfaceC3624tu, list, vi3Var, (Context) tj3Var.m22128k(AbstractC0394f.f4761b)), tj3Var), tj3Var, ((i3 >> 12) & 896) | 3072);
            e16Var2 = b16.f7762a;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fn0(e16Var2, str, str2, list, interfaceC3624tu, vi3Var, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final p04 m20438b() {
        p04 p04Var = f58867a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(18.3f, 5.71f);
        f57VarM17730e.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        f57VarM17730e.m11551f(12.0f, 10.59f);
        f57VarM17730e.m11551f(7.11f, 5.7f);
        f57VarM17730e.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        f57VarM17730e.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        f57VarM17730e.m11551f(10.59f, 12.0f);
        f57VarM17730e.m11551f(5.7f, 16.89f);
        f57VarM17730e.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        f57VarM17730e.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        f57VarM17730e.m11551f(12.0f, 13.41f);
        f57VarM17730e.m11552g(4.89f, 4.89f);
        f57VarM17730e.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        f57VarM17730e.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        f57VarM17730e.m11551f(13.41f, 12.0f);
        f57VarM17730e.m11552g(4.89f, -4.89f);
        f57VarM17730e.m11548c(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f58867a = p04VarM17721b;
        return p04VarM17721b;
    }
}
