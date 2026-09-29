package p000;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.p002ui.platform.AbstractC0394f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gzc {
    /* JADX INFO: renamed from: a */
    public static final void m12982a(jq8 jq8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        jq8Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-173417166);
        int i2 = (tj3Var.m22124i(jq8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4411d(b16.f7762a, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38960i);
            boolean zM22124i = tj3Var.m22124i(jq8Var) | tj3Var.m22124i(context) | ((i2 & 112) == 32);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ws6((Object) jq8Var, vi3Var, context, 8);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21607T, null, null, null, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 510);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(jq8Var, i, 28, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m12983b(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* JADX INFO: renamed from: c */
    public static void m12984c(AccessibilityEvent accessibilityEvent, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC3170k3.m14780d(accessibilityEvent, z);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m12985d(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
