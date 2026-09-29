package p000;

import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: loaded from: classes2.dex */
public final class sn3 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public static final sn3 f61056b = new sn3(6);

    /* JADX INFO: renamed from: c */
    public static final rn3 f61057c = new rn3();

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: g */
    public final void mo21323g(tb5 tb5Var) {
        if (!(tb5Var instanceof c72)) {
            v63.m23131i(tb5Var, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
            return;
        }
        c72 c72Var = (c72) tb5Var;
        rn3 rn3Var = f61057c;
        c72Var.mo4380A(rn3Var);
        c72Var.mo1335n(rn3Var);
        c72Var.mo1756z(rn3Var);
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: q */
    public final Lifecycle$State mo21327q() {
        return Lifecycle$State.RESUMED;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: x */
    public final void mo21331x(tb5 tb5Var) {
    }
}
