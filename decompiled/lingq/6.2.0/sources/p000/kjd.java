package p000;

import com.lingq.core.premium.R$string;
import com.lingq.core.premium.upgrade.UpgradeBadgeTier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kjd {
    /* JADX INFO: renamed from: a */
    public static final void m15290a(String str, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1421606331);
        int i2 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            vh9 vh9Var = cx2.f34676a;
            he9 he9Var = new he9(((bx2) tj3Var.m22128k(vh9Var)).m4208a(), 0L, bc3.f8323i, null, null, null, null, 0L, null, null, null, aa1.m198b(0.12f, ((bx2) tj3Var.m22128k(vh9Var)).m4208a()), null, null, 63482);
            zf1 zf1Var = ge9.f40637a;
            ho9.m13414a(AbstractC3584sr.m21609V(b16.f7762a, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 0.0f, 2), ui8.m22753b(((fe9) tj3Var.m22128k(zf1Var)).f38956e), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55872p, 0L, 0.0f, 4.0f, null, ci8.m4703P(1497879754, new rw1(29, str, he9Var), tj3Var), tj3Var, 12779520, 88);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3441oz(str, i, 19);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m15291b(int i, ye1 ye1Var, ui3 ui3Var) {
        int i2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1243587223);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        b16 b16Var = b16.f7762a;
        if (i4 == 0) {
            i2 |= tj3Var.m22120g(b16Var) ? 32 : 16;
        }
        byte b = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            int i5 = i2 << 9;
            s9d.m21184c(UpgradeBadgeTier.PremiumPlus, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_simplify_title), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_simplify_button), ui3Var, b16Var, null, false, false, kxb.f48569a, tj3Var, (i5 & 7168) | 100663302 | (i5 & 57344), 224);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new d00(ui3Var, i, i3, b);
        }
    }
}
