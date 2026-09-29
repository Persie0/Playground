package com.lingq.core.p012ui.util;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.p002ui.viewinterop.AbstractC0443c;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import p000.C3445p2;
import p000.d32;
import p000.ln0;
import p000.p84;
import p000.t66;
import p000.tj3;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.ui.util.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1935a {
    /* JADX INFO: renamed from: a */
    public static final void m8801a(boolean z, C0282a c0282a, vi3 vi3Var, ye1 ye1Var, int i) {
        ComposeView composeView;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(53985415);
        int i2 = i | (tj3Var.m22122h(z) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                ComposeView composeView2 = new ComposeView(context, null, 0, 6, null);
                tj3Var.m22131l0(composeView2);
                objM22097O = composeView2;
            }
            ComposeView composeView3 = (ComposeView) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var = (t66) objM22097O2;
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean bool = (Boolean) t66Var.getValue();
            bool.booleanValue();
            boolean zM22124i = tj3Var.m22124i(composeView3) | ((i2 & 14) == 4);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                composeView = composeView3;
                CaptureViewKt$CaptureView$1$1 captureViewKt$CaptureView$1$1 = new CaptureViewKt$CaptureView$1$1(z, composeView, t66Var, vi3Var, null);
                tj3Var.m22131l0(captureViewKt$CaptureView$1$1);
                objM22097O3 = captureViewKt$CaptureView$1$1;
            } else {
                composeView = composeView3;
            }
            d32.m10049l(boolValueOf, bool, (zi3) objM22097O3, tj3Var);
            boolean zM22124i2 = tj3Var.m22124i(composeView) | tj3Var.m22124i(context);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O4 == p84Var) {
                C3445p2 c3445p2 = new C3445p2(composeView, context, c0282a, t66Var, 2);
                tj3Var.m22131l0(c3445p2);
                objM22097O4 = c3445p2;
            }
            AbstractC0443c.m1891b((vi3) objM22097O4, null, null, tj3Var, 0, 6);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ln0(z, c0282a, vi3Var, i, 0);
        }
    }
}
