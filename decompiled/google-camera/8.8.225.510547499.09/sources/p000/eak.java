package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eak implements knh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ knh f13066a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ eal f13067b;

    public eak(eal ealVar, knh knhVar) {
        this.f13067b = ealVar;
        this.f13066a = knhVar;
    }

    @Override // p000.knh
    /* JADX INFO: renamed from: a */
    public final String mo6998a() {
        return this.f13066a.mo6998a();
    }

    @Override // p000.knh
    /* JADX INFO: renamed from: b */
    public final void mo6999b(long j, long j2, kng kngVar) {
        this.f13066a.mo6999b(j, j2, kngVar);
    }

    @Override // p000.knh, p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f13066a.close();
        synchronized (this.f13067b) {
            this.f13067b.f13068a.remove(this);
        }
    }
}
