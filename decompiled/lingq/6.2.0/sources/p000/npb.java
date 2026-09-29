package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.onboarding.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class npb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f53107a = new C0282a(-483480726, false, new nd1(6));

    /* JADX INFO: renamed from: a */
    public static final void m17580a(int i, ye1 ye1Var, ui3 ui3Var, vi3 vi3Var, e16 e16Var, String str, String str2, boolean z) {
        e16 e16Var2;
        str.getClass();
        str2.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2031765831);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 16384 : 8192) | 196608;
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            List listM23605K = vz1.m23605K(new bm9("immersive", R$string.onboarding_v2_method_immersive, R$string.onboarding_v2_method_immersive_desc, "🎧"), new bm9("self-directed", R$string.onboarding_v2_method_self_directed, R$string.onboarding_v2_method_self_directed_desc, "🧭"), new bm9("guided", R$string.onboarding_v2_method_guided, R$string.onboarding_v2_method_guided_desc, "🎓"), new bm9("interactive", R$string.onboarding_v2_method_interactive, R$string.onboarding_v2_method_interactive_desc, "💬"), new bm9("unsure", R$string.onboarding_v2_method_unsure, R$string.onboarding_v2_method_unsure_desc, "🤔"));
            String strM23618Z = vz1.m23618Z(R$string.onboarding_v2_method_title_dynamic, new Object[]{AbstractC3352my.m17093L(context, str)}, tj3Var);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_method_subtitle);
            b16 b16Var = b16.f7762a;
            gxb.m12966b(strM23618Z, z, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue), ui3Var, b16Var, strM23620a0, ci8.m4703P(711262357, new t75(listM23605K, str2, vi3Var, 1), tj3Var), tj3Var, ((i2 >> 6) & 112) | 1572864 | ((i2 >> 3) & 7168) | 24576, 0);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3394o2(str, i, str2, vi3Var, z, ui3Var, e16Var2, 1);
        }
    }
}
