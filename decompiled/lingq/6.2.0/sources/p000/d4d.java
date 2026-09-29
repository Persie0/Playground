package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d4d {

    /* JADX INFO: renamed from: a */
    public static p04 f34999a;

    /* JADX INFO: renamed from: a */
    public static final void m10095a(float f, List list, vi3 vi3Var, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        ui3 ui3Var2;
        tj3 tj3Var;
        list.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1447932723);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22114d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ui3Var2 = ui3Var;
            i2 |= tj3Var2.m22124i(ui3Var2) ? 2048 : 1024;
        } else {
            ui3Var2 = ui3Var;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var2, yoc.f70178a, null, null, null, yoc.f70179b, ci8.m4703P(-748237626, new C2925de(list, vi3Var, f), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, ((i2 >> 9) & 14) | 1769520, 16284);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fj8(f, list, vi3Var, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final p04 m10096b() {
        p04 p04Var = f34999a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.AutoAwesome", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(19.46f, 8.0f);
        f57Var.m11552g(0.79f, -1.75f);
        f57Var.m11551f(22.0f, 5.46f);
        f57Var.m11548c(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        f57Var.m11552g(-1.75f, -0.79f);
        f57Var.m11551f(19.46f, 2.0f);
        f57Var.m11548c(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        f57Var.m11552g(-0.79f, 1.75f);
        f57Var.m11551f(16.0f, 4.54f);
        f57Var.m11548c(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        f57Var.m11552g(1.75f, 0.79f);
        f57Var.m11551f(18.54f, 8.0f);
        f57Var.m11547b(18.72f, 8.39f, 19.28f, 8.39f, 19.46f, 8.0f);
        f57Var.m11546a();
        f57Var.m11553h(11.5f, 9.5f);
        f57Var.m11551f(9.91f, 6.0f);
        f57Var.m11547b(9.56f, 5.22f, 8.44f, 5.22f, 8.09f, 6.0f);
        f57Var.m11551f(6.5f, 9.5f);
        f57Var.m11551f(3.0f, 11.09f);
        f57Var.m11548c(-0.78f, 0.36f, -0.78f, 1.47f, 0.0f, 1.82f);
        f57Var.m11552g(3.5f, 1.59f);
        f57Var.m11551f(8.09f, 18.0f);
        f57Var.m11548c(0.36f, 0.78f, 1.47f, 0.78f, 1.82f, 0.0f);
        f57Var.m11552g(1.59f, -3.5f);
        f57Var.m11552g(3.5f, -1.59f);
        f57Var.m11548c(0.78f, -0.36f, 0.78f, -1.47f, 0.0f, -1.82f);
        f57Var.m11551f(11.5f, 9.5f);
        f57Var.m11546a();
        f57Var.m11553h(18.54f, 16.0f);
        f57Var.m11552g(-0.79f, 1.75f);
        f57Var.m11551f(16.0f, 18.54f);
        f57Var.m11548c(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        f57Var.m11552g(1.75f, 0.79f);
        f57Var.m11551f(18.54f, 22.0f);
        f57Var.m11548c(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        f57Var.m11552g(0.79f, -1.75f);
        f57Var.m11551f(22.0f, 19.46f);
        f57Var.m11548c(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        f57Var.m11552g(-1.75f, -0.79f);
        f57Var.m11551f(19.46f, 16.0f);
        f57Var.m11547b(19.28f, 15.61f, 18.72f, 15.61f, 18.54f, 16.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f34999a = p04VarM17721b;
        return p04VarM17721b;
    }
}
