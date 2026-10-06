package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hft implements hgp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f27576a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f27577b;

    public hft(esl eslVar, int i) {
        this.f27577b = i;
        this.f27576a = eslVar;
    }

    public hft(hfu hfuVar, int i) {
        this.f27577b = i;
        this.f27576a = hfuVar;
    }

    /* JADX INFO: renamed from: f */
    private final void m10208f() {
        esl eslVar = (esl) this.f27576a;
        eslVar.f15420x = true;
        eslVar.m7781D();
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7758b() {
        int i = this.f27577b;
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo7759c() {
        int i = this.f27577b;
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: a */
    public final void mo7757a() {
        switch (this.f27577b) {
            case 0:
                ((hfu) this.f27576a).f27590f.mo10384d();
                break;
            default:
                esl eslVar = (esl) this.f27576a;
                if (eslVar.f15420x) {
                    eslVar.f15420x = false;
                    eslVar.m7781D();
                }
                break;
        }
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: d */
    public final void mo7760d() {
        switch (this.f27577b) {
            case 0:
                ((hfu) this.f27576a).f27590f.mo10385i();
                break;
            default:
                if (!((esl) this.f27576a).f15420x) {
                    m10208f();
                }
                break;
        }
    }

    @Override // p000.hgp
    /* JADX INFO: renamed from: e */
    public final void mo7761e() {
        switch (this.f27577b) {
            case 0:
                ((hfu) this.f27576a).f27590f.mo10385i();
                break;
            default:
                m10208f();
                break;
        }
    }
}
