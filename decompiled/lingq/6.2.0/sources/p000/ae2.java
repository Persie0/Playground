package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ae2 extends bq1 {

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ cd3 f534K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ be2 f535L;

    public ae2(be2 be2Var, cd3 cd3Var) {
        this.f535L = be2Var;
        this.f534K = cd3Var;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: o0 */
    public final View mo293o0(int i) {
        cd3 cd3Var = this.f534K;
        if (cd3Var.mo294p0()) {
            return cd3Var.mo293o0(i);
        }
        Dialog dialog = this.f535L.f8417H0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: p0 */
    public final boolean mo294p0() {
        return this.f534K.mo294p0() || this.f535L.f8421L0;
    }
}
