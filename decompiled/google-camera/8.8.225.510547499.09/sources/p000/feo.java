package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class feo implements kbg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f21540a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f21541b;

    public feo(cra craVar, int i) {
        this.f21541b = i;
        this.f21540a = craVar;
    }

    public feo(feq feqVar, int i) {
        this.f21541b = i;
        this.f21540a = feqVar;
    }

    public feo(gof gofVar, int i) {
        this.f21541b = i;
        this.f21540a = gofVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [gof, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gof, java.lang.Object] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* synthetic */ void mo3415bf(Object obj) {
        switch (this.f21541b) {
            case 0:
                ((feq) this.f21540a).m8302a();
                return;
            case 1:
                hsg hsgVar = (hsg) obj;
                if (hsgVar.f29408f != 1) {
                    return;
                }
                int i = hsgVar.f29408f;
                Object obj2 = this.f21540a;
                lku.m15614I(i == 1, "Tracking session not end yet.");
                cra craVar = (cra) obj2;
                craVar.f9069d.mo8187g(false, cra.m5387h(hsgVar), hsgVar.f29407e, hsgVar.f29406d, hsgVar.f29403a.ordinal());
                nqf nqfVar = craVar.f9075j;
                nqfVar.getClass();
                nqfVar.mo14894e(bzq.m3281u());
                long j = hsgVar.f29407e;
                boolean zM3467d = craVar.f9066a.m3467d(craVar.f9072g);
                if (j > 2000) {
                    craVar.f9077l.run();
                    return;
                } else if (zM3467d) {
                    craVar.m5392d(2000 - hsgVar.f29407e, true);
                    return;
                } else {
                    craVar.m5393e();
                    return;
                }
            case 2:
                ((feq) this.f21540a).m8302a();
                return;
            default:
                Integer num = (Integer) obj;
                goe goeVarMo9303a = this.f21540a.mo9303a();
                try {
                    this.f21540a.mo9315m(num.intValue());
                    return;
                } finally {
                    goeVarMo9303a.mo9302a();
                }
        }
    }
}
