package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hqk {

    /* JADX INFO: renamed from: A */
    public final ipt f29053A;

    /* JADX INFO: renamed from: B */
    public final igf f29054B;

    /* JADX INFO: renamed from: C */
    public final eop f29055C;

    /* JADX INFO: renamed from: D */
    public final iqi f29056D;

    /* JADX INFO: renamed from: F */
    public FrameLayout f29058F;

    /* JADX INFO: renamed from: G */
    public idb f29059G;

    /* JADX INFO: renamed from: H */
    public ObjectAnimator f29060H;

    /* JADX INFO: renamed from: I */
    public final dak f29061I;

    /* JADX INFO: renamed from: J */
    public cuk f29062J;

    /* JADX INFO: renamed from: K */
    public ScheduledFuture f29063K;

    /* JADX INFO: renamed from: L */
    public TextView f29064L;

    /* JADX INFO: renamed from: M */
    public hqo f29065M;

    /* JADX INFO: renamed from: N */
    public View f29066N;

    /* JADX INFO: renamed from: O */
    public View f29067O;

    /* JADX INFO: renamed from: P */
    public ViewGroup f29068P;

    /* JADX INFO: renamed from: Q */
    public ViewGroup f29069Q;

    /* JADX INFO: renamed from: R */
    public ViewGroup f29070R;

    /* JADX INFO: renamed from: S */
    public int f29071S;

    /* JADX INFO: renamed from: T */
    public hqn f29072T;

    /* JADX INFO: renamed from: U */
    public jfo f29073U;

    /* JADX INFO: renamed from: V */
    public final djm f29074V;

    /* JADX INFO: renamed from: W */
    private final msi f29075W;

    /* JADX INFO: renamed from: X */
    private idb f29076X;

    /* JADX INFO: renamed from: Y */
    private idb f29077Y;

    /* JADX INFO: renamed from: a */
    public final jww f29078a;

    /* JADX INFO: renamed from: c */
    public final BottomBarController f29080c;

    /* JADX INFO: renamed from: d */
    public final dbr f29081d;

    /* JADX INFO: renamed from: e */
    public final iid f29082e;

    /* JADX INFO: renamed from: f */
    public final Context f29083f;

    /* JADX INFO: renamed from: g */
    public final hxp f29084g;

    /* JADX INFO: renamed from: h */
    public final hxw f29085h;

    /* JADX INFO: renamed from: i */
    public final dhv f29086i;

    /* JADX INFO: renamed from: j */
    public final jvb f29087j;

    /* JADX INFO: renamed from: k */
    public final jvd f29088k;

    /* JADX INFO: renamed from: l */
    public final elx f29089l;

    /* JADX INFO: renamed from: m */
    public final dac f29090m;

    /* JADX INFO: renamed from: n */
    public final daj f29091n;

    /* JADX INFO: renamed from: o */
    public final ScheduledExecutorService f29092o;

    /* JADX INFO: renamed from: p */
    public final igb f29093p;

    /* JADX INFO: renamed from: q */
    public final eoq f29094q;

    /* JADX INFO: renamed from: r */
    public final chk f29095r;

    /* JADX INFO: renamed from: s */
    public final jww f29096s;

    /* JADX INFO: renamed from: t */
    public final jww f29097t;

    /* JADX INFO: renamed from: u */
    public final oju f29098u;

    /* JADX INFO: renamed from: v */
    public final hsk f29099v;

    /* JADX INFO: renamed from: w */
    public final iuj f29100w;

    /* JADX INFO: renamed from: x */
    public final mrm f29101x;

    /* JADX INFO: renamed from: y */
    public final ggm f29102y;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f29079b = new AtomicLong(0);

    /* JADX INFO: renamed from: z */
    public final BottomBarListener f29103z = new hqe(this);

    /* JADX INFO: renamed from: E */
    public final Animator.AnimatorListener f29057E = new hqh(this);

    public hqk(jfs jfsVar, BottomBarController bottomBarController, dbr dbrVar, iid iidVar, Context context, hxp hxpVar, final hxw hxwVar, dhv dhvVar, jvb jvbVar, jww jwwVar, jww jwwVar2, jww jwwVar3, jvd jvdVar, elx elxVar, ipt iptVar, ScheduledExecutorService scheduledExecutorService, igb igbVar, eoq eoqVar, iuj iujVar, chk chkVar, dac dacVar, daj dajVar, oju ojuVar, iqi iqiVar, hsk hskVar, djm djmVar, mrm mrmVar, final jww jwwVar4, ggm ggmVar, msi msiVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29080c = bottomBarController;
        this.f29081d = dbrVar;
        this.f29082e = iidVar;
        this.f29083f = context;
        this.f29085h = hxwVar;
        this.f29086i = dhvVar;
        this.f29088k = jvdVar;
        this.f29089l = elxVar;
        this.f29053A = iptVar;
        this.f29092o = scheduledExecutorService;
        this.f29093p = igbVar;
        this.f29087j = jvbVar;
        this.f29094q = eoqVar;
        this.f29095r = chkVar;
        this.f29090m = dacVar;
        this.f29091n = dajVar;
        this.f29098u = ojuVar;
        this.f29096s = jwwVar;
        this.f29097t = jwwVar2;
        this.f29084g = hxpVar;
        this.f29056D = iqiVar;
        this.f29099v = hskVar;
        this.f29072T = (hqn) jwwVar3.mo3831be();
        this.f29100w = iujVar;
        this.f29074V = djmVar;
        this.f29101x = mrmVar;
        this.f29078a = jwwVar4;
        this.f29102y = ggmVar;
        this.f29075W = msiVar;
        this.f29054B = new hqf(this, jfsVar, null);
        this.f29055C = new hqg(this, iujVar);
        this.f29061I = new dak() { // from class: hqd
            @Override // p000.dak
            /* JADX INFO: renamed from: a */
            public final void mo5826a(int i) {
                double dM10616b;
                hqk hqkVar = this.f29042a;
                jww jwwVar5 = jwwVar4;
                hxw hxwVar2 = hxwVar;
                if (hqkVar.f29073U != null) {
                    hqo hqoVar = hqkVar.f29065M;
                    hqoVar.getClass();
                    hqn hqnVar = (hqn) hqoVar.f29159e.get(i);
                    hqkVar.f29072T = hqnVar;
                    jfo jfoVar = hqkVar.f29073U;
                    hpm hpmVar = (hpm) jfoVar.f33911b;
                    hpmVar.f28936u.mo3415bf(hqnVar);
                    jww jwwVar6 = hpmVar.f28935t;
                    Double d = (Double) hpmVar.f28899R.f29158d.get(hqnVar);
                    d.getClass();
                    jwwVar6.mo3415bf(Double.valueOf(d.doubleValue()));
                    mwx mwxVar = hpmVar.m10583a().f29158d;
                    mwxVar.getClass();
                    try {
                        Double d2 = (Double) mwxVar.get(hqnVar);
                        d2.getClass();
                        dM10616b = d2.doubleValue();
                    } catch (NullPointerException e) {
                        ((nbe) ((nbe) hpm.f28881a.m17252c()).mo17276G((char) 3852)).mo17290o("Cannot find corresponding capture rate");
                        dM10616b = hpmVar.m10583a().m10616b();
                    }
                    if (hpmVar.f28929n.mo6184l(diy.f11747d)) {
                        hpa hpaVar = hpmVar.f28930o;
                        synchronized (hpaVar.f28750t) {
                            if (hpaVar.f28756z.m10617c(dM10616b)) {
                                hpaVar.f28735e.m17568b(dM10616b);
                            }
                        }
                        hpa hpaVar2 = hpmVar.f28930o;
                        synchronized (hpaVar2.f28750t) {
                            hpaVar2.f28727A = hqnVar;
                            if (hpaVar2.f28734d.get()) {
                                hqm hqmVar = hpaVar2.f28753w;
                                hqmVar.getClass();
                                hqmVar.m10609d(hqnVar);
                            }
                        }
                    } else {
                        hoj hojVar = hpmVar.f28928m;
                        if (hojVar.f28584H.m10617c(dM10616b)) {
                            hojVar.f28596f.m17568b(dM10616b);
                        }
                    }
                    ((hqk) jfoVar.f33910a).m10600f();
                    if (((Boolean) jwwVar5.mo3831be()).booleanValue()) {
                        hxwVar2.mo10852e();
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    final void m10595a() {
        this.f29093p.mo11199G(false);
    }

    /* JADX INFO: renamed from: b */
    final void m10596b() {
        this.f29093p.mo11199G(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m10597c(boolean z) {
        ScheduledFuture scheduledFuture = this.f29063K;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f29063K = null;
        }
        this.f29088k.m13541c(new bnp(this, z, 17));
    }

    /* JADX INFO: renamed from: d */
    public final void m10598d(float f) {
        this.f29088k.m13541c(new euw(this, f, 4));
    }

    /* JADX INFO: renamed from: e */
    public final void m10599e() {
        this.f29080c.setSnapshotButtonClickEnabled(true);
    }

    /* JADX INFO: renamed from: f */
    public final void m10600f() {
        m10597c(false);
        if (m10605k()) {
            dhv dhvVar = this.f29086i;
            dhw dhwVar = diy.f11744a;
            dhvVar.mo6175c();
            this.f29063K = this.f29092o.schedule(new hps(this, 7), 60000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: g */
    final void m10601g(boolean z) {
        Context context = this.f29083f;
        idb idbVarM13426g = jpd.m13426g(false, 3000, null, null, context.getResources().getString(true != z ? C0100R.string.vid_chip_low_battery_warning : C0100R.string.vid_chip_low_battery_stop), context, false, -1, 12);
        this.f29077Y = idbVarM13426g;
        this.f29089l.mo7482d(idbVarM13426g);
    }

    /* JADX INFO: renamed from: h */
    final void m10602h(boolean z) {
        if (this.f29086i.mo6184l(diy.f11750g)) {
            if (this.f29076X == null) {
                Context context = this.f29083f;
                this.f29076X = jpd.m13426g(true, 3000, null, null, context.getResources().getString(C0100R.string.notification_static_recording_af_locked), context, false, -1, 2);
            }
            if (z && m10605k() && this.f29081d.m5900i()) {
                this.f29089l.mo7482d(this.f29076X);
            } else {
                this.f29089l.mo7485g(this.f29076X);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    final void m10603i() {
        this.f29088k.m13541c(new hps(this, 4));
        this.f29078a.mo3415bf(true);
        this.f29099v.m10699d(true);
        m10600f();
        if (this.f29072T.equals(hqn.AUTO)) {
            this.f29091n.mo5812c();
            hzo hzoVar = ((hzp) this.f29075W.mo6051a()).f30074a;
            if (bzq.m3253Z(hzoVar.f30073i, hzoVar.f30071g)) {
                this.f29100w.mo11747ab();
            }
        } else {
            this.f29091n.mo5813d();
            if (this.f29086i.mo6184l(diy.f11751h)) {
                this.f29091n.mo5821l();
            }
        }
        this.f29091n.mo5817h(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m10604j() {
        this.f29088k.m13541c(new hps(this, 10));
    }

    /* JADX INFO: renamed from: k */
    final boolean m10605k() {
        return ((Boolean) this.f29078a.mo3831be()).booleanValue();
    }
}
