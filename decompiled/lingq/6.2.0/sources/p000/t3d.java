package p000;

import androidx.glance.layout.AbstractC0686a;
import com.lingq.feature.widget.R$drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t3d {

    /* JADX INFO: renamed from: a */
    public static p04 f61832a;

    /* JADX INFO: renamed from: a */
    public static final void m21835a(fk9 fk9Var, tg9 tg9Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-96812179);
        int i2 = 2;
        int i3 = (tj3Var.m22124i(fk9Var) ? 4 : 2) | i | (tj3Var.m22124i(tg9Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            AbstractC0686a.m2485a(te1.m21996j(ci8.m4734s(mn3.f51554a), new C0850ck(R$drawable.streak_widget_gradient_bg), null, 6).mo16935d(new C0836c6(tg9Var, 0)), null, ci8.m4703P(1097371467, new aw5(fk9Var, i2), tj3Var), tj3Var, 384, 2);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new op4(fk9Var, tg9Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final p04 m21836b() {
        p04 p04Var = f61832a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.ArrowUpward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(13.0f, 19.0f);
        f57Var.m11556k(7.83f);
        f57Var.m11552g(4.88f, 4.88f);
        f57Var.m11548c(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        f57Var.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        f57Var.m11552g(-6.59f, -6.59f);
        f57Var.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        f57Var.m11552g(-6.6f, 6.58f);
        f57Var.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        f57Var.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        f57Var.m11551f(11.0f, 7.83f);
        f57Var.m11556k(19.0f);
        f57Var.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        f57Var.m11555j(1.0f, -0.45f, 1.0f, -1.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f61832a = p04VarM17721b;
        return p04VarM17721b;
    }
}
