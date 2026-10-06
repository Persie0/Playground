package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fml implements fub, kba {

    /* JADX INFO: renamed from: a */
    private fub f22564a;

    public fml(fub fubVar) {
        this.f22564a = fubVar;
    }

    @Override // p000.fub
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7883a() {
        fub fubVar = this.f22564a;
        if (fubVar != null) {
            fubVar.mo7883a();
        }
    }

    @Override // p000.fub
    /* JADX INFO: renamed from: b */
    public final synchronized void mo7884b(long j) {
        fub fubVar = this.f22564a;
        if (fubVar != null) {
            fubVar.mo7884b(j);
        }
    }

    @Override // p000.fub
    /* JADX INFO: renamed from: c */
    public final synchronized void mo7885c() {
        fub fubVar = this.f22564a;
        if (fubVar != null) {
            fubVar.mo7885c();
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f22564a = null;
    }

    @Override // p000.fub
    /* JADX INFO: renamed from: d */
    public final synchronized void mo7886d(float f) {
        fub fubVar = this.f22564a;
        if (fubVar != null) {
            fubVar.mo7886d(f);
        }
    }

    @Override // p000.fub
    /* JADX INFO: renamed from: e */
    public final synchronized void mo7887e(float f, int i) {
    }

    @Override // p000.fub
    /* JADX INFO: renamed from: f */
    public final synchronized void mo7888f(float f, long j) {
        fub fubVar = this.f22564a;
        if (fubVar != null) {
            fubVar.mo7888f(f, j);
        }
    }
}
