package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hre implements gfg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f29264a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f29265b;

    public hre(dav davVar, int i) {
        this.f29265b = i;
        this.f29264a = davVar;
    }

    public hre(hrg hrgVar, int i) {
        this.f29265b = i;
        this.f29264a = hrgVar;
    }

    public hre(iak iakVar, int i) {
        this.f29265b = i;
        this.f29264a = iakVar;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5759a() {
        int i = this.f29265b;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5760b() {
        int i = this.f29265b;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo5761c() {
        int i = this.f29265b;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: d */
    public final void mo5762d() {
        switch (this.f29265b) {
            case 0:
                ((hrg) this.f29264a).mo7498g();
                break;
            case 1:
                dbg dbgVar = ((dav) this.f29264a).f10320a;
                dbgVar.getClass();
                if (dbgVar.mo5872c()) {
                    ((dav) this.f29264a).f10320a.mo5871b();
                }
                break;
            default:
                ((iak) this.f29264a).m10987d();
                break;
        }
    }
}
