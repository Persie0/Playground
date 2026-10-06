package p000;

import android.app.Activity;
import com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cei implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5442a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5443b;

    public /* synthetic */ cei(Activity activity, int i) {
        this.f5443b = i;
        this.f5442a = activity;
    }

    public /* synthetic */ cei(cee ceeVar, int i) {
        this.f5443b = i;
        this.f5442a = ceeVar;
    }

    public /* synthetic */ cei(cew cewVar, int i) {
        this.f5443b = i;
        this.f5442a = cewVar;
    }

    public /* synthetic */ cei(cfk cfkVar, int i) {
        this.f5443b = i;
        this.f5442a = cfkVar;
    }

    public /* synthetic */ cei(cgb cgbVar, int i) {
        this.f5443b = i;
        this.f5442a = cgbVar;
    }

    public /* synthetic */ cei(cgm cgmVar, int i) {
        this.f5443b = i;
        this.f5442a = cgmVar;
    }

    public /* synthetic */ cei(ciw ciwVar, int i) {
        this.f5443b = i;
        this.f5442a = ciwVar;
    }

    public /* synthetic */ cei(cjt cjtVar, int i) {
        this.f5443b = i;
        this.f5442a = cjtVar;
    }

    public /* synthetic */ cei(ckd ckdVar, int i) {
        this.f5443b = i;
        this.f5442a = ckdVar;
    }

    public /* synthetic */ cei(ckn cknVar, int i) {
        this.f5443b = i;
        this.f5442a = cknVar;
    }

    public /* synthetic */ cei(ckw ckwVar, int i) {
        this.f5443b = i;
        this.f5442a = ckwVar;
    }

    public /* synthetic */ cei(clh clhVar, int i) {
        this.f5443b = i;
        this.f5442a = clhVar;
    }

    public /* synthetic */ cei(fek fekVar, int i) {
        this.f5443b = i;
        this.f5442a = fekVar;
    }

    public cei(fep fepVar, int i, byte[] bArr) {
        this.f5443b = i;
        this.f5442a = fepVar;
    }

    public /* synthetic */ cei(jwf jwfVar, int i) {
        this.f5443b = i;
        this.f5442a = jwfVar;
    }

    public /* synthetic */ cei(kba kbaVar, int i) {
        this.f5443b = i;
        this.f5442a = kbaVar;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [ciw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, kba] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        int i2 = 1;
        switch (this.f5443b) {
            case 0:
                ((Activity) this.f5442a).finish();
                return;
            case 1:
                ((cee) this.f5442a).m3549e();
                return;
            case 2:
                ((cew) this.f5442a).m3586k();
                return;
            case 3:
                ((cew) this.f5442a).m3586k();
                return;
            case 4:
                ((cfk) this.f5442a).f5499a.mo3572b();
                return;
            case 5:
                ((cgb) this.f5442a).m3620g();
                return;
            case 6:
                ((jwf) this.f5442a).mo3415bf(true);
                return;
            case 7:
                ((jwf) this.f5442a).mo3415bf(false);
                return;
            case 8:
                cgm cgmVar = (cgm) this.f5442a;
                cgz cgzVar = cgmVar.f5629d;
                if (cgzVar != null) {
                    cgmVar.m3638a().m3649a(cgzVar.f5710a);
                    return;
                }
                return;
            case 9:
                cgm cgmVar2 = (cgm) this.f5442a;
                cgz cgzVar2 = cgmVar2.f5629d;
                if (cgzVar2 != null) {
                    cgmVar2.f5628c.removeView(cgzVar2);
                    return;
                }
                return;
            case 10:
                cgz cgzVar3 = ((cgm) this.f5442a).f5629d;
                if (cgzVar3 != null) {
                    cgzVar3.setVisibility(0);
                    return;
                }
                return;
            case 11:
                this.f5442a.mo3538bd();
                return;
            case 12:
                ((jvb) ((fep) this.f5442a).f21542a).close();
                return;
            case 13:
                Object obj = this.f5442a;
                lku.m15657k(jvd.m13540d());
                cjt cjtVar = (cjt) obj;
                lku.m15657k(cjtVar.f5943d.isEmpty());
                try {
                    ((cjt) obj).f5942c.set(Boolean.TRUE);
                    while (true) {
                        i++;
                        if (i > 16) {
                            ((nbe) ((nbe) cjt.f5940a.m17252c()).mo17276G(204)).mo17290o("MainThreadExecutor detected possible infinite loop.");
                            break;
                        } else if (((cjt) obj).f5941b.drainTo(((cjt) obj).f5943d) != 0) {
                            Iterator it = ((cjt) obj).f5943d.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            ((cjt) obj).f5943d.clear();
                        }
                    }
                    return;
                } finally {
                    cjtVar.f5942c.set(Boolean.FALSE);
                }
            case 14:
                ((ckd) this.f5442a).close();
                return;
            case 15:
                this.f5442a.close();
                return;
            case 16:
                ((ckn) this.f5442a).m3840b();
                return;
            case 17:
                ((ckw) this.f5442a).m3874e();
                return;
            case 18:
                ((fed) this.f5442a).mo8290d();
                return;
            case 19:
                clh clhVar = (clh) this.f5442a;
                if (clhVar.f6116p) {
                    return;
                }
                clhVar.f6116p = true;
                kfc kfcVar = clhVar.f6114n;
                if (kfcVar != null) {
                    kfcVar.close();
                    clhVar.f6114n = null;
                }
                BaseCurator baseCurator = clhVar.f6113m;
                if (baseCurator != null) {
                    baseCurator.close();
                    clhVar.f6113m = null;
                }
                kba kbaVar = clhVar.f6115o;
                if (kbaVar != null) {
                    kbaVar.close();
                    return;
                }
                return;
            default:
                clh clhVar2 = (clh) this.f5442a;
                lku.m15614I(clhVar2.f6114n == null, "Already started");
                lku.m15614I(!clhVar2.f6116p, "Cannot be started when closed");
                if (clhVar2.f6113m == null) {
                    clhVar2.f6113m = (BaseCurator) clhVar2.f6105e.get();
                }
                clhVar2.f6115o = clhVar2.f6108h.mo3830a(new ckv(clhVar2, 3), clhVar2.f6106f);
                clhVar2.f6114n = clhVar2.f6107g.mo14131r(clhVar2.f6107g.mo14132s(clhVar2.f6111k), 1);
                clhVar2.f6114n.mo9411k(new dtb(clhVar2, i2));
                return;
        }
    }
}
