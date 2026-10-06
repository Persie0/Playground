package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fpc implements kbg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cws f23017a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fpf f23018b;

    /* JADX INFO: renamed from: c */
    private final jww f23019c = new jwf(jxn.FPS_AUTO);

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f23020d = new AtomicBoolean(true);

    public fpc(fpf fpfVar, cws cwsVar) {
        this.f23018b = fpfVar;
        this.f23017a = cwsVar;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        jxn jxnVar;
        gzm gzmVar = (gzm) obj;
        synchronized (this.f23018b.f23039k) {
            gev gevVar = gev.SWISS;
            gzm gzmVar2 = gzm.FPS_AUTO;
            switch (gzmVar) {
                case FPS_AUTO:
                    jxnVar = jxn.FPS_AUTO;
                    break;
                case FPS_24:
                    jxnVar = this.f23018b.f23033e.m5716a() != cxk.CINEMATIC ? jxn.f35050b : jxn.FPS_60C_24E;
                    break;
                case FPS_30:
                    jxnVar = this.f23018b.f23033e.m5716a() != cxk.CINEMATIC ? jxn.FPS_30 : jxn.f35054f;
                    break;
                case FPS_60:
                    jxnVar = jxn.FPS_60;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported FPS option " + String.valueOf(gzmVar));
            }
            if (this.f23020d.compareAndSet(true, false)) {
                this.f23019c.mo3415bf(jxnVar);
                return;
            }
            if (jxnVar == ((jwf) this.f23019c).f34942d) {
                ((nbe) ((nbe) fpf.f23025b.m17251b()).mo17276G((char) 2444)).mo17293r("changeCaptureRate() do nothing since captureRate [%s] does not change", jxnVar);
            } else {
                Object obj2 = ((jwf) this.f23019c).f34942d;
                this.f23019c.mo3415bf(jxnVar);
                cws cwsVarM5690a = this.f23018b.f23031c.m5690a(ikw.VIDEO);
                this.f23017a.mo3415bf(jxnVar);
                if (cwsVarM5690a == this.f23017a) {
                    fpf fpfVar = this.f23018b;
                    jxp jxpVarM6621a = fpfVar.f23042n.m6621a(fpfVar.f23036h.mo5895d());
                    if (this.f23018b.f23037i.mo6184l(dhh.f11073Z) && this.f23018b.f23037i.mo6184l(dhh.f11054G)) {
                        if ((this.f23017a instanceof cwo) && jxpVarM6621a == jxp.RES_1080P) {
                            this.f23018b.f23035g.mo3415bf(jxnVar == jxn.FPS_AUTO ? jxn.FPS_30 : jxnVar);
                        }
                        if ((this.f23017a instanceof cwq) && jxpVarM6621a == jxp.RES_2160P) {
                            this.f23018b.f23034f.mo3415bf(jxnVar);
                        }
                    }
                    this.f23018b.m8660w(4);
                }
            }
        }
    }
}
