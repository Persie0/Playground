package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evr implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f20473a;

    /* JADX INFO: renamed from: b */
    private final oju f20474b;

    /* JADX INFO: renamed from: c */
    private final oju f20475c;

    /* JADX INFO: renamed from: d */
    private final oju f20476d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f20477e;

    public evr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i) {
        this.f20477e = i;
        this.f20473a = ojuVar;
        this.f20474b = ojuVar2;
        this.f20475c = ojuVar3;
        this.f20476d = ojuVar4;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f20477e) {
            case 0:
                break;
        }
        return m7931a();
    }

    /* JADX INFO: renamed from: a */
    public final fvs m7931a() {
        switch (this.f20477e) {
            case 0:
                fvq fvqVar = (fvq) this.f20473a.get();
                oju ojuVar = this.f20474b;
                mrm mrmVarM6617a = ((dra) this.f20475c).m6617a();
                dhv dhvVar = (dhv) this.f20476d.get();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6177e();
                return fvqVar.mo8834a(((ewf) ojuVar).get(), mrmVarM6617a, new lqc(false), ikw.PORTRAIT);
            default:
                fvq fvqVar2 = (fvq) this.f20473a.get();
                oju ojuVar2 = this.f20474b;
                mrm mrmVarM6617a2 = ((dra) this.f20475c).m6617a();
                dhv dhvVar2 = (dhv) this.f20476d.get();
                dhx dhxVar2 = dib.f11240a;
                dhvVar2.mo6178f();
                dhx dhxVar3 = did.f11416a;
                dhvVar2.mo6178f();
                return fvqVar2.mo8834a(((ewf) ojuVar2).get(), mrmVarM6617a2, new lqc(false), ikw.LONG_EXPOSURE);
        }
    }
}
