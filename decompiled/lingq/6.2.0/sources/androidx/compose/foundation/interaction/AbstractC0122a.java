package androidx.compose.foundation.interaction;

import androidx.compose.runtime.AbstractC0278f;
import p000.d32;
import p000.p84;
import p000.t66;
import p000.tj3;
import p000.v56;
import p000.we1;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.interaction.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0122a {
    /* JADX INFO: renamed from: a */
    public static final t66 m957a(v56 v56Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
            tj3Var.m22131l0(objM22097O);
        }
        t66 t66Var = (t66) objM22097O;
        boolean z = (((i & 14) ^ 6) > 4 && tj3Var.m22120g(v56Var)) || (i & 6) == 4;
        Object objM22097O2 = tj3Var.m22097O();
        if (z || objM22097O2 == p84Var) {
            objM22097O2 = new FocusInteractionKt$collectIsFocusedAsState$1$1(v56Var, t66Var, null);
            tj3Var.m22131l0(objM22097O2);
        }
        d32.m10047k(tj3Var, (zi3) objM22097O2, v56Var);
        return t66Var;
    }
}
