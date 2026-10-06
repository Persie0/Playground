package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frr implements ftg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ frv f23345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ frx f23346b;

    public frr(frx frxVar, frv frvVar) {
        this.f23346b = frxVar;
        this.f23345a = frvVar;
    }

    @Override // p000.ftg
    /* JADX INFO: renamed from: a */
    public final void mo8682a() {
        this.f23346b.f23384h.post(new fro(this, this.f23345a, 4));
    }

    @Override // p000.ftg
    /* JADX INFO: renamed from: b */
    public final void mo8683b(Throwable th) {
        this.f23346b.f23384h.post(new fro(this, this.f23345a, 3));
    }

    @Override // p000.ftg
    /* JADX INFO: renamed from: c */
    public final void mo8684c(kpw kpwVar) {
        this.f23346b.f23384h.post(new epm(this, this.f23345a, kpwVar, 15));
    }
}
