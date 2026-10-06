package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ffg implements hgp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ffh f21614a;

    public ffg(ffh ffhVar) {
        this.f21614a = ffhVar;
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: a */
    public final void mo7757a() {
        if (this.f21614a.f21616b.compareAndSet(true, false)) {
            ffh ffhVar = this.f21614a;
            ffhVar.f21618d = ffhVar.m8335a();
        }
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7758b() {
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: c */
    public final void mo7759c() {
        this.f21614a.f21616b.set(true);
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo7760d() {
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo7761e() {
    }
}
