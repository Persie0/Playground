package p000;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0d {
    /* JADX INFO: renamed from: a */
    public static final void m16592a(gt8 gt8Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        gt8Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1978098572);
        int i2 = 16;
        int i3 = i | (tj3Var2.m22124i(gt8Var) ? 4 : 2) | (tj3Var2.m22124i(vi3Var) ? 32 : 16) | (tj3Var2.m22124i(vi3Var2) ? 256 : 128);
        if (tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
            C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
            e16 e16VarM4410c = c99.m4410c(c99.m4412e(b16.f7762a, 1.0f), 1.0f);
            boolean z = (i3 & 896) == 256;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new nc8(vi3Var2, 18);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c((ui3) objM22097O, e16VarM4410c, c0269zM1154g, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(809274858, new iz4(i2, gt8Var, vi3Var), tj3Var2), tj3Var, 48, 3072, 8184);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 22, gt8Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static AccessibilityNodeInfo.AccessibilityAction m16593b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
    }
}
