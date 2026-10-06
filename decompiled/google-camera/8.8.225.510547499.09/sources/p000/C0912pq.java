package p000;

/* JADX INFO: renamed from: pq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class C0912pq implements InterfaceC0903ph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0913pr f47445a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0909pn f47446b;

    public C0912pq(C0913pr c0913pr, AbstractC0909pn abstractC0909pn) {
        this.f47445a = c0913pr;
        this.f47446b = abstractC0909pn;
    }

    @Override // p000.InterfaceC0903ph
    /* JADX INFO: renamed from: b */
    public final void mo1401b() {
        this.f47445a.f47447a.remove(this.f47446b);
        this.f47446b.m19323c(this);
        this.f47446b.f47441d = null;
        this.f47445a.m19331d();
    }
}
