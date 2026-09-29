package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.feature.onboarding.R$string;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class thd {
    /* JADX INFO: renamed from: a */
    public static final void m22069a(String str, vi3 vi3Var, boolean z, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        str.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2110794034);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            ys2 entries = LanguageLearn.getEntries();
            ArrayList arrayList = new ArrayList();
            for (Object obj : entries) {
                if (((LanguageLearn) obj).isSupported()) {
                    arrayList.add(obj);
                }
            }
            ys2 entries2 = LanguageLearn.getEntries();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : entries2) {
                if (!((LanguageLearn) obj2).isSupported()) {
                    arrayList2.add(obj2);
                }
            }
            gxb.m12968d(vz1.m23620a0(tj3Var, R$string.onboarding_v2_language_title), z, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue), ui3Var, null, ci8.m4703P(-472395534, new hn0((Object) arrayList, (Object) context, (Object) str, vi3Var, (Object) arrayList2, 6), tj3Var), tj3Var, (i2 & 7168) | ((i2 >> 3) & 112) | 1572864 | 24576, 32);
            e16Var2 = b16.f7762a;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3828zc(str, vi3Var, z, ui3Var, e16Var2, i, 2);
        }
    }
}
