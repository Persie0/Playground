package p000;

import android.content.Context;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.feature.review.views.result.ReviewResultType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jxc {

    /* JADX INFO: renamed from: a */
    public static final Object f46370a = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m14740a(ReviewResultType reviewResultType, String str, String str2, String str3, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        str.getClass();
        str3.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(271810951);
        int i2 = i | (tj3Var.m22116e(reviewResultType.ordinal()) ? 4 : 2) | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22122h(true) ? 256 : 128) | (tj3Var.m22120g(str2) ? 2048 : 1024) | (tj3Var.m22120g(str3) ? 16384 : 8192) | (tj3Var.m22124i(ui3Var) ? 1048576 : 524288) | (tj3Var.m22124i(ui3Var2) ? 8388608 : 4194304);
        if (tj3Var.m22099R(i2 & 1, (4793491 & i2) != 4793490)) {
            AbstractC0054a.m729d(true, null, AbstractC0070i.m771f(0.5f, ss5.m21703b0(30, 0, null, 6)), AbstractC0070i.m773h(ss5.m21703b0(30, 60, null, 4), 2), null, ci8.m4703P(-1385990737, new sg8((Context) tj3Var.m22128k(AbstractC0394f.f4761b), str2, reviewResultType, str3, str, ui3Var, ui3Var2, 0), tj3Var), tj3Var, ((i2 >> 6) & 14) | 199680, 18);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zs0(reviewResultType, str, str2, str3, ui3Var, ui3Var2, i);
        }
    }
}
