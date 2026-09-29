package p000;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ja3 extends d16 implements y93 {
    @Override // p000.y93
    /* JADX INFO: renamed from: H */
    public final void mo1893H(w93 w93Var) {
        View viewM19874a = qdd.m19874a(this);
        w93Var.mo15334d(this.f34837a.f34836I && qdd.m19874a(this).hasFocusable());
        View viewFindFocus = viewM19874a.findFocus();
        if (viewFindFocus != null) {
            w93Var.mo23817e(s93.m21165a(viewFindFocus, viewM19874a));
        }
    }
}
