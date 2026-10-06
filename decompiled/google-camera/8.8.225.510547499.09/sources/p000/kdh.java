package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kdh extends kpn {

    /* JADX INFO: renamed from: a */
    private final kdl f35643a;

    /* JADX INFO: renamed from: b */
    private boolean f35644b;

    public kdh(kpj kpjVar, kdl kdlVar) {
        super(kpjVar);
        this.f35644b = false;
        this.f35643a = kdlVar;
    }

    @Override // p000.kpn, p000.kpj, p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f35644b) {
                return;
            }
            this.f35644b = true;
            this.f35643a.mo13971a();
            super.close();
        }
    }
}
