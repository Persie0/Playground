package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hiq implements hiv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f27940a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f27941b;

    public hiq(crl crlVar, int i) {
        this.f27941b = i;
        this.f27940a = crlVar;
    }

    public hiq(hir hirVar, int i) {
        this.f27941b = i;
        this.f27940a = hirVar;
    }

    @Override // p000.hiv
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo10337a(byte[] bArr) {
        int i = this.f27941b;
    }

    @Override // p000.hiv
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo10338b() {
        int i = this.f27941b;
    }

    @Override // p000.hiv
    /* JADX INFO: renamed from: c */
    public final void mo10339c(int i) {
        switch (this.f27941b) {
            case 0:
                ((hir) this.f27940a).f27943a = true;
                break;
            default:
                ((crl) this.f27940a).f9128c = i;
                break;
        }
    }
}
