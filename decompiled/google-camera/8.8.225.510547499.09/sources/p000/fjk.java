package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fjk implements fgx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f22263a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22264b;

    public /* synthetic */ fjk(fir firVar, int i) {
        this.f22264b = i;
        this.f22263a = firVar;
    }

    public /* synthetic */ fjk(oju ojuVar, int i) {
        this.f22264b = i;
        this.f22263a = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v4, types: [fir, java.lang.Object] */
    @Override // p000.fgx
    /* JADX INFO: renamed from: f */
    public final void mo6927f(long j) {
        switch (this.f22264b) {
            case 0:
                ((fgr) this.f22263a).get().mo8395ca();
                break;
            case 1:
                this.f22263a.mo8471d();
                break;
            case 2:
                ((gtk) this.f22263a.get()).m9761c(j);
                break;
            default:
                ((hfd) ((hfb) this.f22263a).m10179a().mo16809c()).mo8395ca();
                break;
        }
    }
}
