package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.camera.keepalive.ProcessGcService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class elu implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f14670a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f14671b;

    public /* synthetic */ elu(ProcessGcService processGcService, int i) {
        this.f14671b = i;
        this.f14670a = processGcService;
    }

    public /* synthetic */ elu(elv elvVar, int i) {
        this.f14671b = i;
        this.f14670a = elvVar;
    }

    public /* synthetic */ elu(enn ennVar, int i) {
        this.f14671b = i;
        this.f14670a = ennVar;
    }

    public /* synthetic */ elu(ens ensVar, int i) {
        this.f14671b = i;
        this.f14670a = ensVar;
    }

    public /* synthetic */ elu(eod eodVar, int i) {
        this.f14671b = i;
        this.f14670a = eodVar;
    }

    public /* synthetic */ elu(epf epfVar, int i) {
        this.f14671b = i;
        this.f14670a = epfVar;
    }

    public /* synthetic */ elu(epr eprVar, int i) {
        this.f14671b = i;
        this.f14670a = eprVar;
    }

    public /* synthetic */ elu(ept eptVar, int i) {
        this.f14671b = i;
        this.f14670a = eptVar;
    }

    public /* synthetic */ elu(eqb eqbVar, int i) {
        this.f14671b = i;
        this.f14670a = eqbVar;
    }

    public /* synthetic */ elu(eqp eqpVar, int i) {
        this.f14671b = i;
        this.f14670a = eqpVar;
    }

    public /* synthetic */ elu(etn etnVar, int i, byte[] bArr, byte[] bArr2) {
        this.f14671b = i;
        this.f14670a = etnVar;
    }

    public /* synthetic */ elu(FileOutputStream fileOutputStream, int i) {
        this.f14671b = i;
        this.f14670a = fileOutputStream;
    }

    public /* synthetic */ elu(Runnable runnable, int i) {
        this.f14671b = i;
        this.f14670a = runnable;
    }

    public /* synthetic */ elu(String str, int i) {
        this.f14671b = i;
        this.f14670a = str;
    }

    public /* synthetic */ elu(kpw kpwVar, int i) {
        this.f14671b = i;
        this.f14670a = kpwVar;
    }

    public /* synthetic */ elu(ohb ohbVar, int i) {
        this.f14671b = i;
        this.f14670a = ohbVar;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, ohb] */
    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnableMo7495d = null;
        switch (this.f14671b) {
            case 0:
                Object obj = this.f14670a;
                synchronized (elv.f14672a) {
                    elw elwVar = ((elv) obj).f14683l;
                    if (elwVar != null) {
                        elwVar.mo7508q(((elv) obj).f14685n, ((elv) obj).f14679h, ((elv) obj).f14680i, ((elv) obj).f14681j, ((elv) obj).f14682k);
                    }
                    break;
                }
                return;
            case 1:
                Object obj2 = this.f14670a;
                synchronized (elv.f14672a) {
                    elw elwVar2 = ((elv) obj2).f14683l;
                    if (elwVar2 != null) {
                        runnableMo7495d = elwVar2.mo7495d();
                        ((elv) obj2).mo7485g(((elv) obj2).f14683l);
                    }
                    break;
                }
                if (runnableMo7495d != null) {
                    runnableMo7495d.run();
                    return;
                }
                return;
            case 2:
                enn ennVar = (enn) this.f14670a;
                ennVar.f14764a.setJupiterButton(ennVar.m7563a());
                return;
            case 3:
                ((etn) this.f14670a).m7868a();
                return;
            case 4:
                ens ensVar = (ens) this.f14670a;
                ensVar.f14787b = null;
                jvd.m13538a();
                Activity activity = (Activity) ensVar.f14786a.get();
                if (activity == null) {
                    return;
                }
                activity.finish();
                return;
            case 5:
                Object obj3 = this.f14670a;
                ProcessGcService processGcService = (ProcessGcService) obj3;
                if (!processGcService.f6760c.m7571c()) {
                    System.exit(1234);
                    return;
                } else {
                    processGcService.m4188a(5);
                    gtd.m9734o((Context) obj3);
                    return;
                }
            case 6:
                Object obj4 = this.f14670a;
                nbh nbhVar = eod.f14836a;
                try {
                    nbz nbzVar = nch.f41987a;
                    ((FileOutputStream) obj4).close();
                    return;
                } catch (IOException e) {
                    ((nbe) ((nbe) ((nbe) eod.f14836a.m17251b().mo17282g(nch.f41987a, "KeplerEncoder")).mo17283h(e)).mo17276G((char) 1660)).mo17290o("Could not close file.");
                    return;
                }
            case 7:
                Object obj5 = this.f14670a;
                nbz nbzVar2 = nch.f41987a;
                eod eodVar = (eod) obj5;
                eodVar.f14840d.close();
                eodVar.f14842f.close();
                eodVar.f14839c.close();
                eodVar.f14841e.release();
                eodVar.f14838b.shutdown();
                return;
            case 8:
                Object obj6 = this.f14670a;
                synchronized (obj6) {
                    ((epf) obj6).f14966f = null;
                    break;
                }
                return;
            case 9:
                Object obj7 = this.f14670a;
                try {
                    ((epr) obj7).f15021j.mo13961e("MotionBlur#initialize");
                    List listMo13860g = ((epr) obj7).f15018g.mo13860g();
                    kbc kbcVarM13903h = kbc.m13903h(0, 0);
                    Iterator it = listMo13860g.iterator();
                    while (it.hasNext()) {
                        kmd kmdVarMo13854a = ((epr) obj7).f15018g.mo13854a((kmg) it.next());
                        kbcVarM13903h = epr.m7630i(kbcVarM13903h, kmdVarMo13854a);
                        if (kmdVarMo13854a.mo14544M() && kmdVarMo13854a.mo14535D()) {
                            Iterator it2 = ((kmc) kmdVarMo13854a).f36526b.iterator();
                            while (it2.hasNext()) {
                                kbcVarM13903h = epr.m7630i(kbcVarM13903h, ((epr) obj7).f15018g.mo13854a((kmg) it2.next()));
                            }
                        }
                    }
                    if (((epr) obj7).f15022k.mo9617a() == 0) {
                        ((epr) obj7).f15021j.mo13961e("PortraitSegmenter#init");
                        ((epr) obj7).f15022k.mo9618b();
                        ((epr) obj7).f15021j.mo13962f();
                    }
                    boolean zMo6184l = ((epr) obj7).f15017f.mo6184l(dik.f11611i);
                    glk glkVar = ((epr) obj7).f15030s;
                    byte[] bArrM11477a = imp.m11477a((Context) glkVar.f25503d, (String) glkVar.f25501b);
                    glk glkVar2 = ((epr) obj7).f15030s;
                    byte[] bArrM11477a2 = imp.m11477a((Context) glkVar2.f25503d, (String) glkVar2.f25500a);
                    glk glkVar3 = ((epr) obj7).f15030s;
                    ((epr) obj7).f15014c.m7662d(kbcVarM13903h.f35517a, kbcVarM13903h.f35518b, ((epr) obj7).f15019h, ((epr) obj7).f15023l.mo16813g() ? ((File) ((epr) obj7).f15023l.mo16809c()).getAbsolutePath() : "", ((epr) obj7).f15022k.mo9617a(), ((epr) obj7).f15015d, ((epr) obj7).f15029r, zMo6184l, bArrM11477a, bArrM11477a2, imp.m11477a((Context) glkVar3.f25503d, (String) glkVar3.f25502c));
                    ((epr) obj7).f15021j.mo13962f();
                    ((epr) obj7).f15014c.m7663e();
                    ((epr) obj7).f15016e.mo3415bf(true);
                    return;
                } catch (IllegalStateException e2) {
                    ((nbe) ((nbe) ((nbe) epr.f15012a.m17251b()).mo17283h(e2)).mo17276G((char) 1732)).mo17290o("Error initializing processor.");
                    return;
                }
            case 10:
                ((epr) this.f14670a).f15016e.mo3415bf(true);
                return;
            case 11:
                this.f14670a.run();
                return;
            case 12:
                ((eqb) this.f14670a).m7673c(true);
                return;
            case 13:
                Object obj8 = this.f14670a;
                try {
                    if (((eqb) obj8).f15094c.isDone() || ((eqb) obj8).f15097f) {
                        ((nbe) ((nbe) eqc.f15099a.m17252c()).mo17276G(1774)).mo17291p("Cannot execute, already done %s", ((eqb) obj8).f15095d);
                        return;
                    }
                    ((eqb) obj8).f15096e = ((eqb) obj8).f15098g.f15103e.mo13957a("MotionBlur#task-" + ((eqb) obj8).f15095d);
                    ((eqb) obj8).f15093b.run();
                    ((eqb) obj8).f15094c.mo14894e(true);
                    return;
                } catch (Throwable th) {
                    eqb eqbVar = (eqb) obj8;
                    eqbVar.m7675e();
                    eqbVar.f15094c.mo8566a(th);
                    eqbVar.f15092a.mo8566a(th);
                    return;
                }
            case 14:
                ((eqb) this.f14670a).f15097f = true;
                return;
            case 15:
                ((nbe) ((nbe) eqf.f15113a.m17252c()).mo17276G(1792)).mo17293r("onPslDone: %s not executed", this.f14670a);
                return;
            case 16:
                Object obj9 = this.f14670a;
                if (obj9 != null) {
                    ((ept) obj9).m7645d();
                    return;
                }
                return;
            case 17:
                eqp eqpVar = (eqp) this.f14670a;
                if (!((eqz) eqpVar.f15202b.mo3831be()).equals(eqz.ACTION)) {
                    eqpVar.f15202b.mo3415bf(eqz.ACTION);
                }
                eqpVar.f15201a.mo8564b(ikw.MOTION_BLUR);
                return;
            case 18:
                ((eqp) this.f14670a).f15203c.mo3953f(ikw.MOTION_BLUR);
                return;
            case 19:
                this.f14670a.close();
                return;
            default:
                this.f14670a.get();
                return;
        }
    }
}
