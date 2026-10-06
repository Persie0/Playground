package p000;

/* JADX INFO: renamed from: fj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0185fj implements InterfaceC0238hi {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0186fk f22199a;

    /* JADX INFO: renamed from: b */
    private boolean f22200b;

    public C0185fj(C0186fk c0186fk) {
        this.f22199a = c0186fk;
    }

    @Override // p000.InterfaceC0238hi
    /* JADX INFO: renamed from: a */
    public final void mo8114a(C0225gw c0225gw, boolean z) {
        if (this.f22200b) {
            return;
        }
        this.f22200b = true;
        this.f22199a.f22353a.mo13676d();
        this.f22199a.f22354b.onPanelClosed(108, c0225gw);
        this.f22200b = false;
    }

    @Override // p000.InterfaceC0238hi
    /* JADX INFO: renamed from: b */
    public final boolean mo8115b(C0225gw c0225gw) {
        this.f22199a.f22354b.onMenuOpened(108, c0225gw);
        return true;
    }
}
