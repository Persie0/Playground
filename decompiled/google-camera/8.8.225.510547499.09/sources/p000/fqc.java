package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqc implements fqu {

    /* JADX INFO: renamed from: a */
    private final fqu f23186a;

    /* JADX INFO: renamed from: b */
    private kpw f23187b = null;

    /* JADX INFO: renamed from: c */
    private boolean f23188c = false;

    public fqc(fqu fquVar) {
        this.f23186a = fquVar;
    }

    @Override // p000.fqu
    /* JADX INFO: renamed from: a */
    public final synchronized boolean mo8697a(kpw kpwVar) {
        if (this.f23188c) {
            return this.f23186a.mo8697a(kpwVar);
        }
        kmv kmvVar = new kmv(kpwVar);
        kpw kpwVar2 = this.f23187b;
        if (kpwVar2 != null) {
            kpwVar2.close();
        }
        kpw kpwVarM14585k = kmvVar.m14585k();
        kpwVarM14585k.getClass();
        this.f23187b = new fsn(kpwVarM14585k, kmvVar.mo7248d() + 100000);
        return this.f23186a.mo8697a(kmvVar);
    }

    @Override // p000.fqu, p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f23188c = true;
            kpw kpwVar = this.f23187b;
            if (kpwVar != null) {
                this.f23186a.mo8697a(kpwVar);
                this.f23187b = null;
            }
        }
        this.f23186a.close();
    }
}
