package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxw implements fzt {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fzq f23832a;

    /* JADX INFO: renamed from: b */
    private final fzt f23833b;

    public fxw(fzq fzqVar, fzt fztVar, byte[] bArr) {
        this.f23832a = fzqVar;
        this.f23833b = fztVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    @Override // p000.fzt
    /* JADX INFO: renamed from: a */
    public final void mo3602a(kpw kpwVar, nps npsVar) {
        if (this.f23832a.f23986a.contains(Integer.valueOf(kpwVar.mo7245a()))) {
            this.f23833b.mo3602a(kpwVar, npsVar);
        } else {
            kpwVar.close();
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f23833b.close();
    }
}
