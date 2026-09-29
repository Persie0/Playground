package p000;

import android.view.autofill.AutofillValue;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.compose.p002ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
public final class a2a extends o31 {

    /* JADX INFO: renamed from: h0 */
    public boolean f133h0;

    /* JADX INFO: renamed from: i0 */
    public vi3 f134i0;

    /* JADX INFO: renamed from: j0 */
    public final y47 f135j0;

    public a2a(boolean z, v56 v56Var, w34 w34Var, boolean z2, uh8 uh8Var, vi3 vi3Var) {
        super(v56Var, w34Var, false, z2, null, uh8Var, new i01(1, vi3Var, z));
        this.f133h0 = z;
        this.f134i0 = vi3Var;
        this.f135j0 = new y47(this, 20);
    }

    @Override // androidx.compose.foundation.AbstractC0075a
    /* JADX INFO: renamed from: c1 */
    public final void mo54c1(tv8 tv8Var) {
        AbstractC0426f.m1866j(tv8Var, this.f133h0 ? ToggleableState.On : ToggleableState.Off);
        C3335mh c3335mh = e41.f36679d;
        C0427g c0427g = AbstractC0424d.f5012s;
        bh4[] bh4VarArr = AbstractC0426f.f5022a;
        bh4 bh4Var = bh4VarArr[9];
        tv8Var.mo3709d(c0427g, c3335mh);
        C0848ci c0848ci = new C0848ci(AutofillValue.forToggle(this.f133h0));
        C0427g c0427g2 = AbstractC0424d.f5013t;
        bh4 bh4Var2 = bh4VarArr[10];
        tv8Var.mo3709d(c0427g2, c0848ci);
        AbstractC0426f.m1859c(tv8Var, new t01(tv8Var, 1));
    }
}
