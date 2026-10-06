package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwz implements cww {

    /* JADX INFO: renamed from: a */
    private final cww f9922a;

    /* JADX INFO: renamed from: d */
    private int f9925d = 2;

    /* JADX INFO: renamed from: b */
    private boolean f9923b = false;

    /* JADX INFO: renamed from: c */
    private final Object f9924c = new Object();

    public cwz(cww cwwVar) {
        this.f9922a = cwwVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m5695c() {
        synchronized (this.f9924c) {
            if (this.f9925d != 2) {
                this.f9925d = 2;
                if (this.f9923b) {
                    close();
                }
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9924c) {
            int i = this.f9925d;
            if (i != 1) {
                if (i == 3) {
                    this.f9923b = true;
                    return;
                }
                this.f9922a.close();
                this.f9925d = 1;
                this.f9923b = false;
            }
        }
    }

    @Override // p000.cww
    /* JADX INFO: renamed from: a */
    public final nps mo5692a(gyv gyvVar) {
        synchronized (this.f9924c) {
            int i = this.f9925d;
            boolean z = true;
            if (i == 1) {
                return kxk.m14964J(new IllegalStateException("has been closed."));
            }
            if (i == 3) {
                return kxk.m14964J(new IllegalStateException("there is already a snapshot request in flight."));
            }
            if (i != 2) {
                z = false;
            }
            lku.m15613H(z);
            this.f9925d = 3;
            nps npsVarMo5692a = this.f9922a.mo5692a(gyvVar);
            npsVarMo5692a.mo2282d(new cui(this, 9), not.INSTANCE);
            return npsVarMo5692a;
        }
    }

    @Override // p000.cww
    /* JADX INFO: renamed from: b */
    public final nps mo5693b(kmq kmqVar, kay kayVar) {
        synchronized (this.f9924c) {
            int i = this.f9925d;
            boolean z = true;
            if (i == 1) {
                return kxk.m14964J(new IllegalStateException("has been closed."));
            }
            if (i == 3) {
                return kxk.m14964J(new IllegalStateException("there is already a snapshot request in flight."));
            }
            if (i != 2) {
                z = false;
            }
            lku.m15613H(z);
            this.f9925d = 3;
            nps npsVarMo5693b = this.f9922a.mo5693b(kmqVar, kayVar);
            npsVarMo5693b.mo2282d(new cui(this, 8), not.INSTANCE);
            return npsVarMo5693b;
        }
    }
}
