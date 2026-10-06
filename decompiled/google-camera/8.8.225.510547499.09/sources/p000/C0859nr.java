package p000;

/* JADX INFO: renamed from: nr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class C0859nr extends agb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f44125a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0860ns f44126b;

    /* JADX INFO: renamed from: c */
    private boolean f44127c = false;

    public C0859nr(C0860ns c0860ns, int i) {
        this.f44126b = c0860ns;
        this.f44125a = i;
    }

    @Override // p000.agb, p000.aga
    /* JADX INFO: renamed from: a */
    public final void mo571a() {
        if (this.f44127c) {
            return;
        }
        this.f44126b.f44333a.setVisibility(this.f44125a);
    }

    @Override // p000.agb, p000.aga
    /* JADX INFO: renamed from: b */
    public final void mo572b() {
        this.f44126b.f44333a.setVisibility(0);
    }

    @Override // p000.agb, p000.aga
    /* JADX INFO: renamed from: c */
    public final void mo573c() {
        this.f44127c = true;
    }
}
