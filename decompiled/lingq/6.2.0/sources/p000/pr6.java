package p000;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3192a;

/* JADX INFO: loaded from: classes.dex */
public final class pr6 {

    /* JADX INFO: renamed from: a */
    public final Runnable f56726a;

    /* JADX INFO: renamed from: b */
    public final cs4 f56727b = AbstractC3192a.m15356a(new C3757xf(this, 25));

    public pr6(Runnable runnable) {
        this.f56726a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final void m19462a(ub5 ub5Var, kr6 kr6Var) {
        kr6Var.getClass();
        final AbstractC3572sf abstractC3572sfMo256K = ub5Var.mo256K();
        if (abstractC3572sfMo256K.mo21327q() == Lifecycle$State.DESTROYED) {
            return;
        }
        jr6 jr6Var = new jr6(kr6Var, new lr6(ub5Var, kr6Var));
        kr6Var.f48364a.add(jr6Var);
        jr6Var.m14628g(false);
        ny8.m17674f(m19463b().f53170c, jr6Var);
        final e72 e72Var = new e72(jr6Var, this, abstractC3572sfMo256K);
        abstractC3572sfMo256K.mo21323g(e72Var);
        kr6Var.f48366c.add(new AutoCloseable() { // from class: mr6
            @Override // java.lang.AutoCloseable
            public final void close() {
                abstractC3572sfMo256K.mo21331x(e72Var);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final nr6 m19463b() {
        return (nr6) this.f56727b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m19464c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        m19463b().f53170c.m17694h(new hr6(onBackInvokedDispatcher, 0), 1);
        m19463b().f53170c.m17694h(new hr6(onBackInvokedDispatcher, 1000000), 0);
    }
}
