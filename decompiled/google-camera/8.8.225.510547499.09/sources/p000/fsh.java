package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsh implements fqu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fsi f23459a;

    public fsh(fsi fsiVar) {
        this.f23459a = fsiVar;
    }

    @Override // p000.fqu
    /* JADX INFO: renamed from: a */
    public final boolean mo8697a(kpw kpwVar) {
        this.f23459a.f23463d.post(new fro(this, kpwVar, 5));
        return true;
    }

    @Override // p000.fqu, p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f23459a.f23464e.mo13940b("DBG closing sink");
        this.f23459a.f23463d.post(new fnx(this, 15));
    }
}
