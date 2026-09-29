package com.lingq.feature.collections.components;

import androidx.compose.foundation.lazy.C0127b;
import p000.C3709w4;
import p000.d32;
import p000.tj3;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.collections.components.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2033a {
    /* JADX INFO: renamed from: a */
    public static final void m8939a(C0127b c0127b, vi3 vi3Var, ye1 ye1Var, int i) {
        c0127b.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-273681317);
        int i2 = (tj3Var.m22120g(c0127b) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new CollectionObserveListEndKt$CollectionObserveListEnd$1$1(c0127b, vi3Var, null);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O, c0127b);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(c0127b, i, 6, vi3Var);
        }
    }
}
