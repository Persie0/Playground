package p000;

import android.content.Context;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
public final class ax5 extends dg5 implements lw5 {

    /* JADX INFO: renamed from: V */
    public hi8 f7641V;

    @Override // p000.lw5
    /* JADX INFO: renamed from: c */
    public final void mo3112c(hw5 hw5Var, MenuItem menuItem) {
        hi8 hi8Var = this.f7641V;
        if (hi8Var != null) {
            hi8Var.mo3112c(hw5Var, menuItem);
        }
    }

    @Override // p000.lw5
    /* JADX INFO: renamed from: m */
    public final void mo3113m(hw5 hw5Var, mw5 mw5Var) {
        hi8 hi8Var = this.f7641V;
        if (hi8Var != null) {
            hi8Var.mo3113m(hw5Var, mw5Var);
        }
    }

    @Override // p000.dg5
    /* JADX INFO: renamed from: q */
    public final nm2 mo3114q(Context context, boolean z) {
        zw5 zw5Var = new zw5(context, z);
        zw5Var.setHoverListener(this);
        return zw5Var;
    }
}
