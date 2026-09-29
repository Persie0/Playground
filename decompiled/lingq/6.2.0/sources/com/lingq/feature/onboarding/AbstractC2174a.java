package com.lingq.feature.onboarding;

import androidx.compose.material3.C0232g0;
import androidx.compose.material3.SnackbarDuration;
import p000.d32;
import p000.p84;
import p000.sx0;
import p000.tj3;
import p000.ui3;
import p000.un1;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2174a {
    /* JADX INFO: renamed from: a */
    public static final void m9104a(C0232g0 c0232g0, Object obj, String str, String str2, SnackbarDuration snackbarDuration, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        c0232g0.getClass();
        str.getClass();
        str2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1468652076);
        int i2 = i | (tj3Var.m22124i(obj) ? 32 : 16) | (tj3Var.m22120g(str) ? 256 : 128) | (tj3Var.m22120g(str2) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 131072 : 65536) | (tj3Var.m22124i(ui3Var2) ? 1048576 : 524288);
        if (tj3Var.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O);
            }
            un1 un1Var = (un1) objM22097O;
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((3670016 & i2) == 1048576) | ((i2 & 458752) == 131072);
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                LqSnackbarKt$LqSnackbar$3$1 lqSnackbarKt$LqSnackbar$3$1 = new LqSnackbarKt$LqSnackbar$3$1(c0232g0, str, str2, snackbarDuration, ui3Var2, ui3Var, null);
                tj3Var.m22131l0(lqSnackbarKt$LqSnackbar$3$1);
                objM22097O2 = lqSnackbarKt$LqSnackbar$3$1;
            }
            d32.m10049l(obj, un1Var, (zi3) objM22097O2, tj3Var);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new sx0(c0232g0, obj, str, str2, snackbarDuration, ui3Var, ui3Var2, i, 2);
        }
    }
}
