package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.ListenableFuture;
import com.lingq.feature.onboarding.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sed {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX INFO: renamed from: a */
    public static final void m21321a(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, String str2) {
        ui3 ui3Var2;
        String strM23618Z;
        str.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1430513790);
        int i2 = (tj3Var.m22120g(str) ? 4 : 2) | i | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | 3072;
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            String strM17093L = AbstractC3352my.m17093L((Context) tj3Var.m22128k(AbstractC0394f.f4761b), str2);
            switch (str) {
                case "travel":
                    tj3Var.m22111b0(1829011745);
                    strM23618Z = vz1.m23618Z(R$string.onboarding_v2_goal_confirm_travel, new Object[]{strM17093L}, tj3Var);
                    tj3Var.m22139q(false);
                    break;
                case "career/studies":
                    tj3Var.m22111b0(1829016961);
                    strM23618Z = vz1.m23618Z(R$string.onboarding_v2_goal_confirm_career, new Object[]{strM17093L}, tj3Var);
                    tj3Var.m22139q(false);
                    break;
                case "brain":
                    tj3Var.m22111b0(1829032128);
                    strM23618Z = vz1.m23618Z(R$string.onboarding_v2_goal_confirm_brain, new Object[]{strM17093L}, tj3Var);
                    tj3Var.m22139q(false);
                    break;
                case "friends/family":
                    tj3Var.m22111b0(1829027201);
                    strM23618Z = vz1.m23618Z(R$string.onboarding_v2_goal_confirm_family, new Object[]{strM17093L}, tj3Var);
                    tj3Var.m22139q(false);
                    break;
                case "culture":
                    tj3Var.m22111b0(1829021954);
                    strM23618Z = vz1.m23618Z(R$string.onboarding_v2_goal_confirm_culture, new Object[]{strM17093L}, tj3Var);
                    tj3Var.m22139q(false);
                    break;
                default:
                    tj3Var.m22111b0(1829035234);
                    strM23618Z = vz1.m23618Z(R$string.onboarding_v2_goal_confirm_default, new Object[]{strM17093L}, tj3Var);
                    tj3Var.m22139q(false);
                    break;
            }
            ui3Var2 = ui3Var;
            gxb.m12965a(strM23618Z, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue), ui3Var2, vz1.m23620a0(tj3Var, R$string.onboarding_v2_goal_confirm_subtitle), null, lqb.f50018a, tj3Var, (i2 & 896) | 1575936, 32);
            e16Var = b16.f7762a;
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fo3(str, str2, ui3Var2, e16Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m21322b(ListenableFuture listenableFuture) {
        listenableFuture.mo52a(new s3d(listenableFuture, 3), AbstractC1120j.m6404a());
    }
}
