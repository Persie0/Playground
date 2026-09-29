package androidx.compose.p002ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.AbstractC0278f;
import p000.pk9;
import p000.t66;
import p000.tj3;
import p000.x18;
import p000.xc9;
import p000.xfa;
import p000.y52;
import p000.ye1;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends AbstractC0389a {

    /* JADX INFO: renamed from: j */
    public final t66 f4530j;

    /* JADX INFO: renamed from: k */
    public boolean f4531k;

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    /* JADX INFO: renamed from: a */
    public final void mo1707a(ye1 ye1Var, final int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(420213850);
        int i2 = (tj3Var.m22124i(this) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            zi3 zi3Var = (zi3) ((xc9) this.f4530j).getValue();
            if (zi3Var == null) {
                tj3Var.m22111b0(-1238823553);
            } else {
                tj3Var.m22111b0(98585282);
                zi3Var.invoke(tj3Var, 0);
            }
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(i) { // from class: androidx.compose.ui.platform.ComposeView$Content$1
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iM19383z = pk9.m19383z(1);
                    this.f4532b.mo1707a((ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f4531k;
    }

    public final void setContent(zi3 zi3Var) {
        this.f4531k = true;
        ((xc9) this.f4530j).setValue(zi3Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            m1710d();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4530j = AbstractC0278f.m1260j(null);
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
