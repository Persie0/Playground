package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.glance.layout.AbstractC0686a;
import com.lingq.feature.widget.R$drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gpb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f41167a = new C0282a(-1936484142, false, new ld1(17));

    /* JADX INFO: renamed from: a */
    public static final void m12794a(fk9 fk9Var, tg9 tg9Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1116815875);
        int i2 = (tj3Var.m22124i(fk9Var) ? 4 : 2) | i | (tj3Var.m22124i(tg9Var) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            AbstractC0686a.m2485a(te1.m21996j(ci8.m4734s(mn3.f51554a), new C0850ck(R$drawable.streak_widget_gradient_bg), null, 6).mo16935d(new C0836c6(tg9Var, 0)), C3532re.f59144d, ci8.m4703P(-262600101, new aw5(fk9Var, i3), tj3Var), tj3Var, 384, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new op4(fk9Var, tg9Var, i, i4);
        }
    }
}
