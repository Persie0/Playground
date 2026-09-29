package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0389a;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes2.dex */
public final class l06 extends AbstractC0389a {

    /* JADX INFO: renamed from: j */
    public final t66 f48854j;

    /* JADX INFO: renamed from: k */
    public boolean f48855k;

    public l06(Context context) {
        super(context);
        this.f48854j = AbstractC0278f.m1260j(d1c.f34856a);
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    /* JADX INFO: renamed from: a */
    public final void mo1707a(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(576708319);
        int i2 = (tj3Var.m22124i(this) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            ((zi3) ((xc9) this.f48854j).getValue()).invoke(tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wz2(this, i, 21);
        }
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f48855k;
    }
}
