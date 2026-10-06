package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frp implements ftn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ frt f23342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ frx f23343b;

    public frp(frx frxVar, frt frtVar) {
        this.f23343b = frxVar;
        this.f23342a = frtVar;
    }

    @Override // p000.ftn
    /* JADX INFO: renamed from: a */
    public final void mo8718a() {
        this.f23343b.f23384h.post(new fro(this, this.f23342a, 2));
    }

    @Override // p000.ftn
    /* JADX INFO: renamed from: b */
    public final void mo8719b(long j) {
        this.f23343b.f23384h.post(new dcr(this, j, this.f23342a, 11));
    }
}
