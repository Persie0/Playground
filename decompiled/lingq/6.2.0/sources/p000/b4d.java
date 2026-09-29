package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.core.premium.R$string;
import com.lingq.core.premium.upgrade.UpgradeBadgeTier;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b4d {
    /* JADX INFO: renamed from: a */
    public static final void m3296a(int i, ye1 ye1Var, ui3 ui3Var) {
        int i2;
        ui3 ui3Var2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2109544009);
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
            s9d.m21184c(UpgradeBadgeTier.Premium, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_transcription_title), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_transcription_button), ui3Var2, b16Var, null, false, false, ymb.f70080a, tj3Var, (i4 & 7168) | 100663302 | (i4 & 57344), 224);
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new d00(ui3Var2, i, b, b);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3297b(int i, ye1 ye1Var, ui3 ui3Var, vi3 vi3Var, e16 e16Var, String str, String str2, boolean z) {
        e16 e16Var2;
        str.getClass();
        str2.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1544618839);
        int i2 = 4;
        int i3 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 16384 : 8192) | 196608;
        if (tj3Var.m22099R(i3 & 1, (74899 & i3) != 74898)) {
            String strM23618Z = vz1.m23618Z(com.lingq.feature.onboarding.R$string.onboarding_v2_speaking_title_dynamic, new Object[]{AbstractC3352my.m17093L((Context) tj3Var.m22128k(AbstractC0394f.f4761b), str)}, tj3Var);
            List listM23605K = vz1.m23605K(new jg1("stressed", com.lingq.feature.onboarding.R$string.onboarding_v2_speaking_stressed, "😰"), new jg1("uneasy", com.lingq.feature.onboarding.R$string.onboarding_v2_speaking_uneasy, "😟"), new jg1("steady", com.lingq.feature.onboarding.R$string.onboarding_v2_speaking_steady, "😌"), new jg1("confident", com.lingq.feature.onboarding.R$string.onboarding_v2_speaking_confident, "😎"));
            b16 b16Var = b16.f7762a;
            gxb.m12966b(strM23618Z, z, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue), ui3Var, b16Var, null, ci8.m4703P(-1219404553, new t75(listM23605K, str2, vi3Var, i2), tj3Var), tj3Var, ((i3 >> 3) & 7168) | ((i3 >> 6) & 112) | 1572864 | 24576, 32);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3394o2(str, i, str2, vi3Var, z, ui3Var, e16Var2, 3);
        }
    }
}
