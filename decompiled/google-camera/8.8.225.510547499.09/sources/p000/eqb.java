package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eqb implements fxp {

    /* JADX INFO: renamed from: b */
    public final Runnable f15093b;

    /* JADX INFO: renamed from: d */
    public final int f15095d;

    /* JADX INFO: renamed from: e */
    public kcc f15096e;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ eqc f15098g;

    /* JADX INFO: renamed from: a */
    public final nqf f15092a = nqf.m17621g();

    /* JADX INFO: renamed from: c */
    public final nqf f15094c = nqf.m17621g();

    /* JADX INFO: renamed from: f */
    public boolean f15097f = false;

    public eqb(eqc eqcVar, int i, Runnable runnable) {
        this.f15098g = eqcVar;
        this.f15095d = i;
        this.f15093b = runnable;
    }

    @Override // p000.fxp
    /* JADX INFO: renamed from: a */
    public final synchronized nps mo6600a() {
        this.f15098g.f15102d.execute(new elu(this, 13));
        return this.f15092a;
    }

    @Override // p000.fxp
    /* JADX INFO: renamed from: b */
    public final nps mo6601b() {
        return kxk.m14965K(false);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7673c(boolean z) {
        m7675e();
        this.f15092a.mo14894e(Boolean.valueOf(z));
        if (!z) {
            this.f15098g.f15102d.execute(new elu(this, 14));
            this.f15094c.cancel(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7674d(Runnable runnable, Runnable runnable2) {
        if (!this.f15094c.isCancelled() && !this.f15097f) {
            kxk.m14975U(this.f15094c, new cwx(this, runnable, runnable2, 2), not.INSTANCE);
        } else {
            runnable2.run();
            ((nbe) ((nbe) eqc.f15099a.m17252c()).mo17276G(1775)).mo17291p("Cannot execute, already cancelled %s", this.f15095d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7675e() {
        kcc kccVar = this.f15096e;
        if (kccVar != null) {
            kccVar.mo13952a();
        }
    }
}
