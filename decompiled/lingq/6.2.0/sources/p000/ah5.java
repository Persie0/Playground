package p000;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: loaded from: classes.dex */
public final class ah5 extends bh5 implements rb5 {

    /* JADX INFO: renamed from: e */
    public final ub5 f653e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ w56 f654f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah5(w56 w56Var, ub5 ub5Var, op6 op6Var) {
        super(w56Var, op6Var);
        this.f654f = w56Var;
        this.f653e = ub5Var;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        ub5 ub5Var2 = this.f653e;
        Lifecycle$State lifecycle$StateMo21327q = ub5Var2.mo256K().mo21327q();
        if (lifecycle$StateMo21327q == Lifecycle$State.DESTROYED) {
            this.f654f.mo13910h(this.f8538a);
            return;
        }
        Lifecycle$State lifecycle$State = null;
        while (lifecycle$State != lifecycle$StateMo21327q) {
            m3717a(mo402g());
            lifecycle$State = lifecycle$StateMo21327q;
            lifecycle$StateMo21327q = ub5Var2.mo256K().mo21327q();
        }
    }

    @Override // p000.bh5
    /* JADX INFO: renamed from: d */
    public final void mo400d() {
        this.f653e.mo256K().mo21331x(this);
    }

    @Override // p000.bh5
    /* JADX INFO: renamed from: f */
    public final boolean mo401f(ub5 ub5Var) {
        return this.f653e == ub5Var;
    }

    @Override // p000.bh5
    /* JADX INFO: renamed from: g */
    public final boolean mo402g() {
        return this.f653e.mo256K().mo21327q().isAtLeast(Lifecycle$State.STARTED);
    }
}
