package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lda implements ldb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nps f37964a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37965b;

    public lda(nps npsVar, int i) {
        this.f37965b = i;
        this.f37964a = npsVar;
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f37965b) {
            case 0:
                break;
            default:
                kxk.m14975U(this.f37964a, new cod(3), not.INSTANCE);
                break;
        }
    }

    @Override // p000.ldb
    /* JADX INFO: renamed from: a */
    public final void mo15194a() {
        switch (this.f37965b) {
            case 0:
                kxk.m14974T(this.f37964a);
                break;
            default:
                ((ldb) kxk.m14974T(this.f37964a)).mo15194a();
                break;
        }
    }
}
