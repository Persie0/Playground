package p000;

import androidx.compose.p002ui.input.pointer.AbstractC0328b;
import androidx.compose.p002ui.platform.AbstractC0402n;

/* JADX INFO: loaded from: classes.dex */
public final class lm9 extends AbstractC0328b {
    @Override // androidx.compose.p002ui.input.pointer.AbstractC0328b
    /* JADX INFO: renamed from: a1 */
    public final void mo1458a1(ig7 ig7Var) {
        jg7 jg7Var = (jg7) thb.m22050i(this, AbstractC0402n.f4831w);
        if (jg7Var != null) {
            ((C3758xg) jg7Var).f68160a = ig7Var;
        }
    }

    @Override // androidx.compose.p002ui.input.pointer.AbstractC0328b
    /* JADX INFO: renamed from: c1 */
    public final boolean mo1460c1(int i) {
        return i == 3 || i == 4;
    }

    @Override // p000.pba
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ Object mo956r() {
        return "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
