package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvn implements fvl {

    /* JADX INFO: renamed from: a */
    public static final nbh f23648a = nbh.m17259h("com/google/android/apps/camera/one/capture/CaptureCameraDeviceManagerImpl");

    /* JADX INFO: renamed from: b */
    public jvb f23649b;

    /* JADX INFO: renamed from: c */
    public nps f23650c;

    /* JADX INFO: renamed from: d */
    public fuc f23651d;

    /* JADX INFO: renamed from: e */
    public fvs f23652e;

    /* JADX INFO: renamed from: f */
    public flz f23653f;

    /* JADX INFO: renamed from: g */
    public fvu f23654g;

    /* JADX INFO: renamed from: h */
    private final kdp f23655h;

    /* JADX INFO: renamed from: i */
    private final iht f23656i;

    /* JADX INFO: renamed from: j */
    private final dhv f23657j;

    /* JADX INFO: renamed from: k */
    private final dnn f23658k;

    /* JADX INFO: renamed from: l */
    private final Runnable f23659l = new fnx(this, 16);

    /* JADX INFO: renamed from: m */
    private final kms f23660m;

    /* JADX INFO: renamed from: n */
    private final gtd f23661n;

    public fvn(kdp kdpVar, gtd gtdVar, kms kmsVar, iht ihtVar, dhv dhvVar, dnn dnnVar, byte[] bArr, byte[] bArr2) {
        this.f23655h = kdpVar;
        this.f23661n = gtdVar;
        this.f23660m = kmsVar;
        this.f23656i = ihtVar;
        this.f23657j = dhvVar;
        this.f23658k = dnnVar;
        this.f23649b = kdpVar.m14001a();
    }

    @Override // p000.fvl
    /* JADX INFO: renamed from: a */
    public final fmc mo8831a(dbr dbrVar, fvs fvsVar, ikw ikwVar) {
        fvsVar.getClass();
        fmc fmcVar = new fmc(this.f23659l);
        kmg kmgVarM6439b = this.f23658k.m6439b(this.f23660m, this.f23657j, dbrVar.mo5895d());
        kmgVarM6439b.getClass();
        flz flzVarM9743h = this.f23661n.m9743h(kmgVarM6439b, ikwVar);
        this.f23653f = flzVarM9743h;
        this.f23652e = fvsVar;
        this.f23649b.close();
        kba kbaVarM14002b = this.f23655h.m14002b("CaptureCameraDeviceOpener : ".concat(String.valueOf(toString())));
        jvb jvbVarM14001a = this.f23655h.m14001a();
        jvbVarM14001a.m13537d(kbaVarM14002b);
        this.f23649b = jvbVarM14001a;
        this.f23654g = this.f23660m.m14581f(flzVarM9743h.f22529a);
        cjp cjpVar = new cjp();
        jvbVarM14001a.m13537d(cjpVar);
        nps npsVarM8837b = this.f23652e.m8837b(flzVarM9743h, kxk.m14965K(this.f23656i));
        this.f23650c = npsVarM8837b;
        kxk.m14975U(npsVarM8837b, new fvm(this, cjpVar, fmcVar, jvbVarM14001a), jzn.m13824l("CCDevMngr"));
        return fmcVar;
    }
}
