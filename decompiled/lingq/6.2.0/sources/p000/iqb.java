package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.onboarding.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iqb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f44440a = new C0282a(1174014795, false, new nd1(28));

    /* JADX INFO: renamed from: b */
    public static final C0282a f44441b = new C0282a(944580080, false, new nd1(29));

    /* JADX INFO: renamed from: c */
    public static final C0282a f44442c = new C0282a(1422364648, false, new qd1(0));

    /* JADX INFO: renamed from: d */
    public static final C0282a f44443d = new C0282a(-1531650622, false, new qd1(1));

    /* JADX INFO: renamed from: e */
    public static final C0282a f44444e = new C0282a(-372769314, false, new qd1(2));

    /* JADX INFO: renamed from: f */
    public static final C0282a f44445f = new C0282a(1177332994, false, new qd1(3));

    /* JADX INFO: renamed from: g */
    public static final C0282a f44446g = new C0282a(440253963, false, new qd1(4));

    /* JADX INFO: renamed from: a */
    public static final void m14080a(int i, ye1 ye1Var, ui3 ui3Var, vi3 vi3Var, e16 e16Var, String str, String str2, boolean z) {
        e16 e16Var2;
        str.getClass();
        str2.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1883470685);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 16384 : 8192) | 196608;
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            String strM23618Z = vz1.m23618Z(R$string.onboarding_v2_motivation_title_dynamic, new Object[]{AbstractC3352my.m17093L((Context) tj3Var.m22128k(AbstractC0394f.f4761b), str)}, tj3Var);
            List listM23605K = vz1.m23605K(new v36("travel", R$string.onboarding_v2_motivation_travel, "✈️"), new v36("career/studies", R$string.onboarding_v2_motivation_career, "💼"), new v36("culture", R$string.onboarding_v2_motivation_culture, "🎭"), new v36("friends/family", R$string.onboarding_v2_motivation_family, "👥"), new v36("brain", R$string.onboarding_v2_motivation_brain, "🧠"), new v36("other", R$string.onboarding_v2_motivation_other, "💬"));
            b16 b16Var = b16.f7762a;
            gxb.m12966b(strM23618Z, z, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue), ui3Var, b16Var, null, ci8.m4703P(1338049707, new t75(listM23605K, str2, vi3Var, 2), tj3Var), tj3Var, ((i2 >> 6) & 112) | 1572864 | ((i2 >> 3) & 7168) | 24576, 32);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3394o2(str, i, str2, vi3Var, z, ui3Var, e16Var2, 2);
        }
    }
}
