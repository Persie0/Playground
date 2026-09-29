package p000;

import com.google.common.util.concurrent.C1114d;
import com.lingq.core.premium.R$string;
import com.lingq.core.premium.upgrade.UpgradeBadgeTier;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o2d {
    /* JADX INFO: renamed from: a */
    public static final void m17771a(int i, ye1 ye1Var, ui3 ui3Var) {
        int i2;
        ui3 ui3Var2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1930130961);
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
        byte b = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 << 9;
            ui3Var2 = ui3Var;
            s9d.m21184c(UpgradeBadgeTier.Premium, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_sentence_title), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_sentence_button), ui3Var2, b16Var, null, false, false, xnc.f68415b, tj3Var, (i4 & 7168) | 100663302 | (i4 & 57344), 224);
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new d00(ui3Var2, i, 5, b);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo4534b(C1114d c1114d, Set set);

    /* JADX INFO: renamed from: c */
    public abstract int mo4535c(C1114d c1114d);
}
