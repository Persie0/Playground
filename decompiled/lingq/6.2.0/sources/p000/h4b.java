package p000;

import com.lingq.feature.onboarding.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h4b {

    /* JADX INFO: renamed from: a */
    public static final List f41796a = vz1.m23605K(new pw6("everyday conversations", R$string.onboarding_v2_where_everyday_conversations, "🗣️"), new pw6("school", R$string.onboarding_v2_where_school, "📚"), new pw6("work", R$string.onboarding_v2_where_work, "💼"), new pw6("online", R$string.onboarding_v2_where_online, "📱"), new pw6("watching/reading", R$string.onboarding_v2_where_watching, "🎬"), new pw6("travel", R$string.onboarding_v2_where_travel, "✈️"), new pw6("not sure", R$string.onboarding_v2_where_not_sure, "🤔"));

    /* JADX INFO: renamed from: a */
    public static final void m13047a(int i, ye1 ye1Var, ui3 ui3Var, vi3 vi3Var, e16 e16Var, String str, String str2, boolean z) {
        int i2;
        tj3 tj3Var;
        e16 e16Var2;
        str.getClass();
        vi3Var.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-2051246081);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22122h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (tj3Var2.m22099R(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 << 3;
            tj3Var = tj3Var2;
            wxb.m24202a(R$string.onboarding_v2_where_title, f41796a, str, vi3Var, z, ui3Var, str2, Integer.valueOf(R$string.onboarding_v2_where_subtitle), tj3Var, ((i3 << 6) & 8064) | (57344 & i4) | (458752 & i4) | (i4 & 3670016) | ((i3 << 15) & 29360128), 0);
            e16Var2 = b16.f7762a;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gb5(str, vi3Var, str2, z, ui3Var, e16Var2, i, 2);
        }
    }
}
