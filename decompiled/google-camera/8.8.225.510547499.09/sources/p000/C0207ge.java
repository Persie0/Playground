package p000;

/* JADX INFO: renamed from: ge */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0207ge extends agb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0208gf f24351a;

    /* JADX INFO: renamed from: b */
    private boolean f24352b = false;

    /* JADX INFO: renamed from: c */
    private int f24353c = 0;

    public C0207ge(C0208gf c0208gf) {
        this.f24351a = c0208gf;
    }

    @Override // p000.agb, p000.aga
    /* JADX INFO: renamed from: a */
    public final void mo571a() {
        int i = this.f24353c + 1;
        this.f24353c = i;
        if (i == this.f24351a.f24467a.size()) {
            aga agaVar = this.f24351a.f24468b;
            if (agaVar != null) {
                agaVar.mo571a();
            }
            this.f24353c = 0;
            this.f24352b = false;
            this.f24351a.f24469c = false;
        }
    }

    @Override // p000.agb, p000.aga
    /* JADX INFO: renamed from: b */
    public final void mo572b() {
        if (this.f24352b) {
            return;
        }
        this.f24352b = true;
        aga agaVar = this.f24351a.f24468b;
        if (agaVar != null) {
            agaVar.mo572b();
        }
    }
}
