package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.onboarding.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f56639a = new C0282a(-1973321409, false, new od1(1));

    static {
        new C0282a(-185850336, false, new nd1(10));
    }

    /* JADX INFO: renamed from: a */
    public static final void m19441a(int i, int i2, ui3 ui3Var, ye1 ye1Var, int i3) {
        int i4;
        ui3 ui3Var2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1092469165);
        if ((i3 & 6) == 0) {
            i4 = (tj3Var.m22116e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= tj3Var.m22116e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= tj3Var.m22120g(b16.f7762a) ? 2048 : 1024;
        }
        int i5 = i4 | 24576;
        if (tj3Var.m22099R(i5 & 1, (i5 & 9363) != 9362)) {
            ui3Var2 = ui3Var;
            gxb.m12965a(vz1.m23620a0(tj3Var, i), vz1.m23620a0(tj3Var, R$string.onboarding_v2_continue), ui3Var2, vz1.m23620a0(tj3Var, i2), null, null, tj3Var, (i5 & 8064) | ((i5 << 3) & 458752), 64);
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yy1(i, i2, ui3Var2, i3);
        }
    }
}
