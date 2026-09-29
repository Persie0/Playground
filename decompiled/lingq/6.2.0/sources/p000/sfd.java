package p000;

import com.lingq.core.premium.R$string;
import com.lingq.core.premium.upgrade.UpgradeBadgeTier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sfd {
    /* JADX INFO: renamed from: a */
    public static final void m21344a(int i, ye1 ye1Var, ui3 ui3Var) {
        int i2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1154406305);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        b16 b16Var = b16.f7762a;
        if (i3 == 0) {
            i2 |= tj3Var.m22120g(b16Var) ? 32 : 16;
        }
        int i4 = 1;
        byte b = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            int i5 = i2 << 9;
            s9d.m21184c(UpgradeBadgeTier.Premium, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_import_limit_title), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_import_limit_button), ui3Var, b16Var, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_import_limit_subtitle), false, false, qqb.f58092a, tj3Var, (i5 & 7168) | 100663302 | (i5 & 57344), 192);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new d00(ui3Var, i, i4, b);
        }
    }
}
