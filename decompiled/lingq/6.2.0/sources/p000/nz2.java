package p000;

import com.lingq.feature.onboarding.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nz2 {

    /* JADX INFO: renamed from: a */
    public static final List f53427a = vz1.m23605K(new pw6("never", R$string.onboarding_v2_familiarity_never, "🤷"), new pw6("heard", R$string.onboarding_v2_familiarity_heard, "👂"), new pw6("watched/read", R$string.onboarding_v2_familiarity_watched_read, "👀"), new pw6("used", R$string.onboarding_v2_familiarity_used, "✅"));

    /* JADX INFO: renamed from: a */
    public static final void m17707a(String str, vi3 vi3Var, boolean z, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        str.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1406146432);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            wxb.m24202a(R$string.onboarding_v2_familiarity_title, f53427a, str, vi3Var, z, ui3Var, null, null, tj3Var, (i2 << 6) & 4194176, 384);
            e16Var2 = b16.f7762a;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3828zc(str, vi3Var, z, ui3Var, e16Var2, i, 1);
        }
    }
}
