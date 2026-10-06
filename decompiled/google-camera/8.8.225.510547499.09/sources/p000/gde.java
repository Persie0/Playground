package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gde implements jwd, kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f24277a = nbh.m17259h("com/google/android/apps/camera/one/smartmetering/LazySmartMeteringProcessor");

    /* JADX INFO: renamed from: b */
    public final ecq f24278b;

    /* JADX INFO: renamed from: c */
    public final msi f24279c;

    /* JADX INFO: renamed from: d */
    public final Object f24280d = new Object();

    /* JADX INFO: renamed from: e */
    public kmg f24281e = null;

    /* JADX INFO: renamed from: f */
    public kmv f24282f = null;

    /* JADX INFO: renamed from: g */
    public kpp f24283g = null;

    /* JADX INFO: renamed from: h */
    public boolean f24284h = false;

    public gde(ecq ecqVar, msi msiVar) {
        this.f24278b = ecqVar;
        this.f24279c = msiVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized mrm m9069a() {
        mrm mrmVarM16828h;
        synchronized (this.f24280d) {
            kmv kmvVar = this.f24282f;
            if (kmvVar != null) {
                mrmVarM16828h = mrm.m16828h(kmvVar.m14585k());
                kmvVar.m14586l();
                if (!mrmVarM16828h.mo16813g()) {
                    ((nbe) ((nbe) f24277a.m17252c()).mo17276G(2552)).mo17290o("Couldn't fork latest viewfinder image, already closed!");
                }
            } else {
                ((nbe) ((nbe) f24277a.m17252c()).mo17276G(2551)).mo17290o("Latest viewfinder image not present!");
                mrmVarM16828h = mqu.f41450a;
            }
        }
        return mrmVarM16828h;
    }

    @Override // p000.jwd
    /* JADX INFO: renamed from: b */
    public final String mo9070b() {
        return "LazySmartMeteringProcessor";
    }

    /* JADX INFO: renamed from: c */
    public final void m9071c() {
        synchronized (this.f24280d) {
            kmv kmvVar = this.f24282f;
            if (kmvVar != null) {
                kmvVar.m14586l();
                this.f24282f = null;
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        kmg kmgVar;
        synchronized (this.f24280d) {
            if (this.f24284h) {
                return;
            }
            this.f24284h = true;
            if (this.f24283g != null && (kmgVar = this.f24281e) != null) {
                this.f24278b.mo7155v(this.f24278b.mo7134a(kmgVar));
            }
            m9071c();
            this.f24283g = null;
        }
    }
}
