package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fqn implements fql {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fql f23237a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f23238b;

    public fqn(fql fqlVar, int i) {
        this.f23238b = i;
        this.f23237a = fqlVar;
    }

    @Override // p000.fql
    /* JADX INFO: renamed from: a */
    public final fqk mo8707a(kpw kpwVar, bkn bknVar) {
        throw null;
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f23238b) {
            case 0:
                this.f23237a.close();
                break;
            default:
                this.f23237a.close();
                break;
        }
    }
}
