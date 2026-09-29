package p000;

import com.lingq.feature.onboarding.p014v2.pages.AbstractC2228a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rjd {
    /* JADX INFO: renamed from: a */
    public static final void m20675a(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var) {
        ui3 ui3Var2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1947714608);
        int i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i | 48;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            ui3Var2 = ui3Var;
            AbstractC2228a.m9183c(true, ui3Var2, b16Var, tj3Var, ((i2 << 3) & 112) | 390, 0);
            e16Var = b16Var;
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ov1(ui3Var2, e16Var, i, 3);
        }
    }
}
