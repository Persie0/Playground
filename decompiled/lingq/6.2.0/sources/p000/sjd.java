package p000;

import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.onboarding.R$drawable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sjd {
    /* JADX INFO: renamed from: a */
    public static final void m21437a(int i, int i2, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, boolean z) {
        e16 e16Var2;
        long j;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1466634251);
        int i3 = i2 | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576;
        int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            if (z) {
                tj3Var.m22111b0(-201022897);
                j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55874r;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-200946234);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            mn0 mn0VarM21999m = te1.m21999m(0, 14, j, 0L, tj3Var);
            vh9 vh9Var = ps5.f56764b;
            bq1.m4038N(ui3Var, e16VarM4412e, false, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c, mn0VarM21999m, null, ci8.m4714a(1.0f, aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A)), ci8.m4703P(1076349174, new u75(i, str, i4), tj3Var), tj3Var, ((i3 >> 9) & 14) | 100663296, 164);
            tj3Var = tj3Var;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new v75(str, i, z, ui3Var, e16Var2, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21438b(String str, vi3 vi3Var, boolean z, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        str.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-241164778);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576;
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            List listM23605K = vz1.m23605K(new s75(LearningLevel.Beginner1.getServerName(), R$string.levels_beginner, R$drawable.ic_onboarding_level_1), new s75(LearningLevel.Intermediate1.getServerName(), R$string.levels_intermediate, R$drawable.ic_onboarding_level_3), new s75(LearningLevel.Advanced1.getServerName(), R$string.levels_advanced, R$drawable.ic_onboarding_level_5));
            String strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.onboarding_v2_level_title);
            String strM23620a1 = vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.onboarding_v2_level_subtitle);
            b16 b16Var = b16.f7762a;
            gxb.m12966b(strM23620a0, z, vz1.m23620a0(tj3Var, R$string.ui_continue), ui3Var, b16Var, strM23620a1, ci8.m4703P(1872844552, new t75(listM23605K, str, vi3Var, i3), tj3Var), tj3Var, (i2 & 7168) | ((i2 >> 3) & 112) | 1572864 | 24576, 0);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3828zc(str, vi3Var, z, ui3Var, e16Var2, i, 3);
        }
    }
}
