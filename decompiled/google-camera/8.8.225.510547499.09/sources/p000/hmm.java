package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hmm implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f28333a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f28334b;

    public /* synthetic */ hmm(hjx hjxVar, int i) {
        this.f28334b = i;
        this.f28333a = hjxVar;
    }

    public /* synthetic */ hmm(hmn hmnVar, int i) {
        this.f28334b = i;
        this.f28333a = hmnVar;
    }

    public /* synthetic */ hmm(hmw hmwVar, int i) {
        this.f28334b = i;
        this.f28333a = hmwVar;
    }

    public /* synthetic */ hmm(hng hngVar, int i) {
        this.f28334b = i;
        this.f28333a = hngVar;
    }

    public /* synthetic */ hmm(hnj hnjVar, int i) {
        this.f28334b = i;
        this.f28333a = hnjVar;
    }

    public /* synthetic */ hmm(hnz hnzVar, int i) {
        this.f28334b = i;
        this.f28333a = hnzVar;
    }

    public /* synthetic */ hmm(hot hotVar, int i) {
        this.f28334b = i;
        this.f28333a = hotVar;
    }

    public hmm(hot hotVar, int i, byte[] bArr) {
        this.f28334b = i;
        this.f28333a = hotVar;
    }

    public /* synthetic */ hmm(hpa hpaVar, int i) {
        this.f28334b = i;
        this.f28333a = hpaVar;
    }

    public /* synthetic */ hmm(hpe hpeVar, int i) {
        this.f28334b = i;
        this.f28333a = hpeVar;
    }

    public /* synthetic */ hmm(hpg hpgVar, int i) {
        this.f28334b = i;
        this.f28333a = hpgVar;
    }

    public /* synthetic */ hmm(jww jwwVar, int i) {
        this.f28334b = i;
        this.f28333a = jwwVar;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, jww] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28334b) {
            case 0:
                hmn hmnVar = (hmn) this.f28333a;
                hmnVar.f28337d.mo8165aj(3);
                hmnVar.f28336c.mo9799g(hmk.m10458a(hmnVar.f28335b, hmnVar.f28338e));
                return;
            case 1:
                ((hjx) this.f28333a).m10398a();
                return;
            case 2:
                ((hmn) this.f28333a).f28339f = true;
                return;
            case 3:
                ((hmw) this.f28333a).f28364a.mo3415bf(true);
                return;
            case 4:
                ((hmw) this.f28333a).f28364a.mo3415bf(false);
                return;
            case 5:
                FocusIndicatorView focusIndicatorView = ((hng) this.f28333a).f28447n;
                if (focusIndicatorView != null) {
                    focusIndicatorView.mo4151i();
                    return;
                }
                return;
            case 6:
                ((hng) this.f28333a).f28447n.m4142A();
                return;
            case 7:
                hng hngVar = (hng) this.f28333a;
                mrm mrmVar = hngVar.f28444k;
                if (mrmVar.mo16813g() && hngVar.f28455v) {
                    ((hrx) mrmVar.mo16809c()).mo10671c(hrw.TAXI);
                    hngVar.f28455v = false;
                    return;
                }
                return;
            case 8:
                hnj hnjVar = (hnj) this.f28333a;
                ihk ihkVar = hnjVar.f28486e;
                ihkVar.getClass();
                ihkVar.m11343k();
                jfs jfsVar = hnjVar.f28487f;
                jfsVar.getClass();
                jfsVar.m13092ab("taxi_entered_smarts_chip", 9);
                return;
            case 9:
                ((hnj) this.f28333a).f28485d = true;
                return;
            case 10:
                hnz hnzVar = (hnz) this.f28333a;
                hnzVar.f28557d.run();
                hnzVar.f28554a = 2;
                return;
            case 11:
                hnz hnzVar2 = (hnz) this.f28333a;
                hnzVar2.f28556c.run();
                hnzVar2.f28554a = 3;
                return;
            case 12:
                this.f28333a.mo3415bf(true);
                return;
            case 13:
                this.f28333a.mo3415bf(false);
                return;
            case 14:
                hot hotVar = (hot) this.f28333a;
                hotVar.f28663j.m3465b(hotVar.f28666m);
                return;
            case 15:
                ScheduledFuture scheduledFuture = ((hot) this.f28333a).f28671r;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ((hot) this.f28333a).f28672s.mo14894e(null);
                return;
            case 16:
                hpa hpaVar = (hpa) this.f28333a;
                hpaVar.f28733c.set(true);
                hpaVar.f28745o.set(TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis()));
                return;
            case 17:
                ((hpg) this.f28333a).f28799af.m13650a();
                return;
            case 18:
                hpg hpgVar = (hpg) this.f28333a;
                Iterator it = hpgVar.f28770C.iterator();
                while (it.hasNext()) {
                    hpgVar.f28832y.mo6360h(((gyv) it.next()).f26876b, null);
                }
                return;
            case 19:
                hpg hpgVar2 = (hpg) this.f28333a;
                jxj jxjVar = hpgVar2.f28799af;
                synchronized (jxjVar.f35023d) {
                    lku.m15610E(jxjVar.f35024e == jxi.READY, "%s is expected but we get %s", jxi.READY, jxjVar.f35024e);
                    jxjVar.f35024e = jxi.STARTED;
                    kxk.m14975U(jxjVar.f35020a.mo13751j(jxjVar.f35025f), new jwq(jxjVar, 2), jxjVar.f35021b);
                    break;
                }
                if (hpgVar2.f28811d.mo6184l(diy.f11747d)) {
                    hpgVar2.m10577d();
                } else {
                    hoj hojVar = hpgVar2.f28817j;
                    hojVar.f28593c.set(false);
                    hojVar.f28594d.set(false);
                    hojVar.f28592b.set(false);
                    hojVar.f28599i.set(0L);
                    hojVar.f28600j.set(0L);
                    hojVar.f28601k.set(0L);
                    hojVar.f28598h.set(0);
                    hojVar.f28602l.set(0L);
                    hojVar.f28597g.set(0);
                    hojVar.f28605o.set(0L);
                    hojVar.f28607q.set(0L);
                    hojVar.f28608r.set(0L);
                    hojVar.f28610t.set(0L);
                    hojVar.f28603m.set(0L);
                    hojVar.f28604n.set(0L);
                    hojVar.f28595e.set(true);
                    hojVar.f28582F = mqu.f41450a;
                    hpgVar2.f28817j.f28586J = hpgVar2.f28799af;
                }
                hot hotVar2 = hpgVar2.f28827t;
                hotVar2.f28654a.set(true);
                if (!((Boolean) ((jwf) hotVar2.f28658e.mo6467c()).f34942d).booleanValue()) {
                    hotVar2.f28668o.mo14136w(false);
                    return;
                }
                kfk kfkVar = hotVar2.f28668o;
                kgd kgdVarM14187a = kge.m14187a();
                kgdVarM14187a.m14184c(1);
                kgdVarM14187a.m14183b(1);
                kgdVarM14187a.m14186e(4);
                kfkVar.mo14124k(kgdVarM14187a.m14182a());
                return;
            default:
                hpe hpeVar = (hpe) this.f28333a;
                hpl hplVar = hpeVar.f28764b.f28800ag;
                lku.m15662p(hplVar);
                hpm hpmVar = hplVar.f28880e;
                hpmVar.f28931p.m13541c(new hpi(hpmVar, 16));
                hot hotVar3 = hpeVar.f28764b.f28827t;
                if (hotVar3.f28667n.mo14539H()) {
                    hotVar3.f28658e.mo6471g(hotVar3.f28667n.mo14552e(), hotVar3.f28667n.mo14551d(), hotVar3.f28667n.mo14548a());
                }
                hotVar3.f28675v.m6626f();
                hotVar3.f28669p.m13537d(hotVar3.f28659f.m3417a(hotVar3, hotVar3.f28667n, hotVar3.f28673t.f23601a, jwr.m13637g(false), false, hotVar3.f28662i.mo16813g(), 3));
                hpeVar.f28764b.f28812e.mo3415bf(true);
                return;
        }
    }
}
