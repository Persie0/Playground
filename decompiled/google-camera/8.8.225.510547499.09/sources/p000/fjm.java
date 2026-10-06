package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fjm implements fgx {

    /* JADX INFO: renamed from: a */
    volatile long f22269a = 0;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fgy f22270b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mrm f22271c;

    public fjm(fgy fgyVar, mrm mrmVar) {
        this.f22270b = fgyVar;
        this.f22271c = mrmVar;
    }

    @Override // p000.fgx
    /* JADX INFO: renamed from: f */
    public final void mo6927f(long j) {
        while (true) {
            mrm mrmVarMo8330e = this.f22270b.mo8330e(this.f22269a);
            if (!mrmVarMo8330e.mo16813g()) {
                return;
            }
            this.f22269a = ((Long) mrmVarMo8330e.mo16809c()).longValue();
            ((fhq) this.f22271c.mo16809c()).mo8446b(this.f22269a);
        }
    }
}
