package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsq implements fqu {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f23502a;

    public fsq(int i) {
        this.f23502a = i;
    }

    @Override // p000.fqu, p000.kba, java.lang.AutoCloseable
    public final void close() {
        int i = this.f23502a;
    }

    @Override // p000.fqu
    /* JADX INFO: renamed from: a */
    public final boolean mo8697a(kpw kpwVar) {
        switch (this.f23502a) {
            case 0:
                kpwVar.close();
                break;
            default:
                kpwVar.close();
                break;
        }
        return false;
    }
}
