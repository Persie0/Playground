package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drt implements ipm {

    /* JADX INFO: renamed from: a */
    public mrm f12432a = mqu.f41450a;

    /* JADX INFO: renamed from: b */
    private final dsr f12433b;

    /* JADX INFO: renamed from: c */
    private final dhv f12434c;

    /* JADX INFO: renamed from: d */
    private final jvd f12435d;

    /* JADX INFO: renamed from: e */
    private final hnv f12436e;

    /* JADX INFO: renamed from: f */
    private final hnw f12437f;

    /* JADX INFO: renamed from: g */
    private ipo f12438g;

    public drt(jvd jvdVar, hnv hnvVar, hnw hnwVar, dhv dhvVar, dsr dsrVar) {
        this.f12433b = dsrVar;
        this.f12434c = dhvVar;
        this.f12435d = jvdVar;
        this.f12436e = hnvVar;
        this.f12437f = hnwVar;
    }

    @Override // p000.ipm
    /* JADX INFO: renamed from: a */
    public final ipk mo3626a(ipo ipoVar) {
        if (!this.f12432a.mo16813g() || this.f12438g != ipoVar) {
            if (this.f12432a.mo16813g()) {
                ((dsq) this.f12432a.mo16809c()).close();
            }
            this.f12438g = ipoVar;
            dhv dhvVar = this.f12434c;
            dhx dhxVar = dib.f11240a;
            dhvVar.mo6178f();
            this.f12432a = mrm.m16829i(new dru(((ipg) ipoVar).f31698b, this.f12433b));
        }
        hnw hnwVar = this.f12437f;
        hny hnyVarM10529a = hnz.m10529a();
        hnyVarM10529a.m10525d("FaceObfuscation");
        hnyVarM10529a.m10524c(this.f12435d);
        hnyVarM10529a.m10528g(this.f12436e);
        hnyVarM10529a.m10527f(new drs(this, 0));
        hnyVarM10529a.m10526e(new drs(this, 2));
        hnwVar.mo10519f(hnyVarM10529a.m10522a());
        return (ipk) this.f12432a.mo16809c();
    }
}
