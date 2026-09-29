package p000;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import kotlinx.coroutines.AbstractC3208a;

/* JADX INFO: loaded from: classes.dex */
public final class lb5 implements rb5, un1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3572sf f49403a;

    /* JADX INFO: renamed from: b */
    public final kn1 f49404b;

    public lb5(AbstractC3572sf abstractC3572sf, kn1 kn1Var) {
        kn1Var.getClass();
        this.f49403a = abstractC3572sf;
        this.f49404b = kn1Var;
        if (abstractC3572sf.mo21327q() == Lifecycle$State.DESTROYED) {
            AbstractC3208a.m15436c(kn1Var, null);
        }
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        AbstractC3572sf abstractC3572sf = this.f49403a;
        if (abstractC3572sf.mo21327q().compareTo(Lifecycle$State.DESTROYED) <= 0) {
            abstractC3572sf.mo21331x(this);
            AbstractC3208a.m15436c(this.f49404b, null);
        }
    }

    @Override // p000.un1
    /* JADX INFO: renamed from: x */
    public final kn1 mo1309x() {
        return this.f49404b;
    }
}
