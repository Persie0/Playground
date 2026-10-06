package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cxm implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f9984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9986c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f9987d;

    public /* synthetic */ cxm(cxo cxoVar, cxk cxkVar, boolean z, int i) {
        this.f9987d = i;
        this.f9985b = cxoVar;
        this.f9986c = cxkVar;
        this.f9984a = z;
    }

    public /* synthetic */ cxm(eqf eqfVar, String str, boolean z, int i) {
        this.f9987d = i;
        this.f9986c = eqfVar;
        this.f9985b = str;
        this.f9984a = z;
    }

    public cxm(exn exnVar, boolean z, bnq bnqVar, int i, byte[] bArr) {
        this.f9987d = i;
        this.f9986c = exnVar;
        this.f9984a = z;
        this.f9985b = bnqVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [bnk, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9987d) {
            case 0:
                Object obj = this.f9985b;
                cxo cxoVar = (cxo) obj;
                cxoVar.m5720e((cxk) this.f9986c, this.f9984a);
                return;
            case 1:
                ((bmj) ((exn) this.f9986c).f20785a).f3780a.mo2767a(this.f9984a, (bnq) this.f9985b);
                return;
            default:
                Object obj2 = this.f9986c;
                Object obj3 = this.f9985b;
                boolean z = this.f9984a;
                eqf eqfVar = (eqf) obj2;
                if (eqfVar.f15125m) {
                    ((nbe) ((nbe) eqf.f15113a.m17252c()).mo17276G((char) 1789)).mo17293r("Shot already done, ignoring %s.", obj3);
                    return;
                }
                try {
                    ((eqf) obj2).f15118f.mo13961e((String) obj3);
                    if (z) {
                        ((eqf) obj2).f15115c.m7659a(((eqf) obj2).f15116d);
                    } else {
                        ((eqf) obj2).f15115c.m7661c(((eqf) obj2).f15116d);
                    }
                    return;
                } finally {
                    eqfVar.f15118f.mo13962f();
                }
        }
    }
}
