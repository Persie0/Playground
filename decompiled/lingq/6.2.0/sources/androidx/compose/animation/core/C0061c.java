package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC0278f;
import p000.C3186kj;
import p000.d32;
import p000.l44;
import p000.p84;
import p000.t66;
import p000.tj3;
import p000.we1;
import p000.x18;
import p000.x66;
import p000.xc9;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.animation.core.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0061c {

    /* JADX INFO: renamed from: a */
    public final x66 f1550a = new x66(new l44[16]);

    /* JADX INFO: renamed from: b */
    public final t66 f1551b = AbstractC0278f.m1260j(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public long f1552c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public final t66 f1553d = AbstractC0278f.m1260j(Boolean.TRUE);

    /* JADX INFO: renamed from: a */
    public final void m752a(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-318043801);
        int i2 = (tj3Var.m22124i(this) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(null);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            if (((Boolean) ((xc9) this.f1553d).getValue()).booleanValue() || ((Boolean) ((xc9) this.f1551b).getValue()).booleanValue()) {
                tj3Var.m22111b0(-144841960);
                boolean zM22124i = tj3Var.m22124i(this);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22124i || objM22097O2 == p84Var) {
                    objM22097O2 = new InfiniteTransition$run$1$1(t66Var, this, null);
                    tj3Var.m22131l0(objM22097O2);
                }
                d32.m10047k(tj3Var, (zi3) objM22097O2, this);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-143455237);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3186kj(this, i, 7);
        }
    }
}
