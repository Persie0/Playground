package p000;

import android.content.res.Configuration;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewa extends chw implements hyw {

    /* JADX INFO: renamed from: b */
    public static final nbh f20497b = nbh.m17259h("com/google/android/apps/camera/legacy/app/module/portrait/PortraitModule");

    /* JADX INFO: renamed from: A */
    public final eby f20498A;

    /* JADX INFO: renamed from: B */
    public final mrm f20499B;

    /* JADX INFO: renamed from: C */
    public final glu f20500C;

    /* JADX INFO: renamed from: D */
    public final mrm f20501D;

    /* JADX INFO: renamed from: E */
    public final hys f20502E;

    /* JADX INFO: renamed from: F */
    public final mrm f20503F;

    /* JADX INFO: renamed from: H */
    public boolean f20505H;

    /* JADX INFO: renamed from: I */
    public jvb f20506I;

    /* JADX INFO: renamed from: J */
    public final gps f20507J;

    /* JADX INFO: renamed from: K */
    public dnf f20508K;

    /* JADX INFO: renamed from: L */
    public jwn f20509L;

    /* JADX INFO: renamed from: M */
    public int f20510M;

    /* JADX INFO: renamed from: N */
    public hkz f20511N;

    /* JADX INFO: renamed from: O */
    public final List f20512O;

    /* JADX INFO: renamed from: T */
    public fmd f20517T;

    /* JADX INFO: renamed from: U */
    public hsu f20518U;

    /* JADX INFO: renamed from: V */
    public final hee f20519V;

    /* JADX INFO: renamed from: W */
    public final bkn f20520W;

    /* JADX INFO: renamed from: X */
    private final fvl f20521X;

    /* JADX INFO: renamed from: Y */
    private final fmy f20522Y;

    /* JADX INFO: renamed from: Z */
    private final gpu f20523Z;

    /* JADX INFO: renamed from: aa */
    private final htf f20524aa;

    /* JADX INFO: renamed from: ab */
    private final gfa f20525ab;

    /* JADX INFO: renamed from: ac */
    private final jww f20526ac;

    /* JADX INFO: renamed from: ad */
    private final dnn f20527ad;

    /* JADX INFO: renamed from: ae */
    private final hkx f20528ae;

    /* JADX INFO: renamed from: af */
    private final hnw f20529af;

    /* JADX INFO: renamed from: ag */
    private final hoa f20530ag;

    /* JADX INFO: renamed from: ah */
    private final fds f20531ah;

    /* JADX INFO: renamed from: ai */
    private final ebv f20532ai;

    /* JADX INFO: renamed from: aj */
    private final fna f20533aj;

    /* JADX INFO: renamed from: ak */
    private final mrm f20534ak;

    /* JADX INFO: renamed from: am */
    private fmc f20536am;

    /* JADX INFO: renamed from: an */
    private final gua f20537an;

    /* JADX INFO: renamed from: aq */
    private final hyb f20540aq;

    /* JADX INFO: renamed from: ar */
    private final kms f20541ar;

    /* JADX INFO: renamed from: as */
    private final bko f20542as;

    /* JADX INFO: renamed from: at */
    private final dsx f20543at;

    /* JADX INFO: renamed from: au */
    private final C1058va f20544au;

    /* JADX INFO: renamed from: c */
    public final kbz f20545c;

    /* JADX INFO: renamed from: d */
    public final dbr f20546d;

    /* JADX INFO: renamed from: e */
    public final chj f20547e;

    /* JADX INFO: renamed from: f */
    public final jvd f20548f;

    /* JADX INFO: renamed from: g */
    public final Executor f20549g;

    /* JADX INFO: renamed from: h */
    public final fvs f20550h;

    /* JADX INFO: renamed from: i */
    public final igf f20551i;

    /* JADX INFO: renamed from: j */
    public final hht f20552j;

    /* JADX INFO: renamed from: k */
    public final cbz f20553k;

    /* JADX INFO: renamed from: l */
    public final eoq f20554l;

    /* JADX INFO: renamed from: m */
    public final idf f20555m;

    /* JADX INFO: renamed from: n */
    public final hua f20556n;

    /* JADX INFO: renamed from: o */
    public final ggm f20557o;

    /* JADX INFO: renamed from: p */
    public final AccessibilityManager f20558p;

    /* JADX INFO: renamed from: q */
    public final dpx f20559q;

    /* JADX INFO: renamed from: r */
    public final iuj f20560r;

    /* JADX INFO: renamed from: s */
    public final dhv f20561s;

    /* JADX INFO: renamed from: u */
    public final fmi f20563u;

    /* JADX INFO: renamed from: v */
    public final BottomBarController f20564v;

    /* JADX INFO: renamed from: w */
    public final igb f20565w;

    /* JADX INFO: renamed from: x */
    public final hwy f20566x;

    /* JADX INFO: renamed from: y */
    public final jww f20567y;

    /* JADX INFO: renamed from: z */
    public final icf f20568z;

    /* JADX INFO: renamed from: t */
    public final imw f20562t = new imw(5);

    /* JADX INFO: renamed from: G */
    public final jwf f20504G = new jwf(false);

    /* JADX INFO: renamed from: al */
    private boolean f20535al = false;

    /* JADX INFO: renamed from: P */
    public gyw f20513P = null;

    /* JADX INFO: renamed from: Q */
    public final BottomBarListener f20514Q = new evv(this);

    /* JADX INFO: renamed from: R */
    public final kbg f20515R = new euz(this, 7);

    /* JADX INFO: renamed from: S */
    public final eop f20516S = new eul(this, 4);

    /* JADX INFO: renamed from: ao */
    private final AccessibilityManager.TouchExplorationStateChangeListener f20538ao = new evw(this, 0);

    /* JADX INFO: renamed from: ap */
    private final hxa f20539ap = new euo(this, 3);

    public ewa(kbz kbzVar, dbr dbrVar, fvl fvlVar, chk chkVar, fvs fvsVar, mrm mrmVar, jvd jvdVar, Executor executor, fmy fmyVar, hht hhtVar, mrm mrmVar2, gps gpsVar, cbz cbzVar, eoq eoqVar, idf idfVar, hua huaVar, ggm ggmVar, AccessibilityManager accessibilityManager, dpx dpxVar, bkn bknVar, iuj iujVar, icf icfVar, jww jwwVar, jww jwwVar2, fmi fmiVar, hwy hwyVar, hee heeVar, kms kmsVar, dhv dhvVar, bko bkoVar, dnn dnnVar, BottomBarController bottomBarController, igb igbVar, gfa gfaVar, dsx dsxVar, hkx hkxVar, hnw hnwVar, hoa hoaVar, eby ebyVar, fds fdsVar, hyb hybVar, gua guaVar, mrm mrmVar3, mrm mrmVar4, glu gluVar, mrm mrmVar5, ebv ebvVar, hys hysVar, htf htfVar, fna fnaVar, C1058va c1058va, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f20545c = kbzVar;
        this.f20521X = fvlVar;
        this.f20546d = dbrVar;
        this.f20547e = chkVar;
        this.f20550h = fvsVar;
        this.f20503F = mrmVar;
        this.f20548f = jvdVar;
        this.f20549g = executor;
        this.f20522Y = fmyVar;
        this.f20552j = hhtVar;
        this.f20507J = gpsVar;
        this.f20553k = cbzVar;
        this.f20554l = eoqVar;
        this.f20555m = idfVar;
        this.f20524aa = htfVar;
        this.f20556n = huaVar;
        this.f20557o = ggmVar;
        this.f20558p = accessibilityManager;
        this.f20559q = dpxVar;
        this.f20520W = bknVar;
        this.f20560r = iujVar;
        this.f20568z = icfVar;
        this.f20526ac = jwwVar;
        this.f20567y = jwwVar2;
        this.f20563u = fmiVar;
        this.f20566x = hwyVar;
        this.f20541ar = kmsVar;
        this.f20561s = dhvVar;
        this.f20542as = bkoVar;
        this.f20527ad = dnnVar;
        this.f20564v = bottomBarController;
        this.f20565w = igbVar;
        this.f20525ab = gfaVar;
        this.f20519V = heeVar;
        this.f20543at = dsxVar;
        this.f20528ae = hkxVar;
        this.f20511N = (hkz) hkxVar.mo10394a();
        this.f20529af = hnwVar;
        this.f20530ag = hoaVar;
        this.f20498A = ebyVar;
        this.f20531ah = fdsVar;
        this.f20499B = mrmVar4;
        this.f20537an = guaVar;
        this.f20540aq = hybVar;
        this.f20500C = gluVar;
        this.f20501D = mrmVar5;
        lku.m15669w(mrmVar2.mo16813g());
        this.f20523Z = (gpu) mrmVar2.mo16809c();
        this.f20502E = hysVar;
        this.f20532ai = ebvVar;
        this.f20533aj = fnaVar;
        this.f20544au = c1058va;
        this.f20534ak = mrmVar3;
        this.f20551i = new evx(this, ebvVar, ebyVar, fmyVar, mrmVar5);
        this.f20512O = new ArrayList();
    }

    @Override // p000.hyw
    /* JADX INFO: renamed from: A */
    public final void mo7891A(hyv hyvVar) {
        if (hyvVar.equals(hyv.READY_TO_CAPTURE)) {
            this.f20525ab.mo9113M();
            m7936x(3);
        } else {
            if (this.f20566x.m10799h()) {
                this.f20502E.m10879b();
            }
            this.f20566x.m10798g();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
        this.f20523Z.mo9604c();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        this.f20513P = null;
        this.f20566x.m10798g();
        this.f20558p.removeTouchExplorationStateChangeListener(this.f20538ao);
        if (this.f20561s.mo6184l(dib.f11357ck)) {
            this.f20502E.m10884g(this);
            this.f20502E.m10883f();
        }
        if (this.f20534ak.mo16813g()) {
            ((eac) this.f20534ak.mo16809c()).m6992b();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bz */
    public final mrm mo3772bz() {
        return mrm.m16828h(this.f20517T);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        m7935w(false);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: e */
    public final void mo3775e(Configuration configuration) {
        this.f20523Z.mo9605d();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: k */
    public final void mo3777k() {
        kcc kccVarMo13957a = this.f20545c.mo13957a("PortraitModule#reconfigureCamera");
        kmg kmgVarM6439b = this.f20527ad.m6439b(this.f20541ar, this.f20561s, this.f20546d.mo5895d());
        kmgVarM6439b.getClass();
        fvu fvuVarM14581f = this.f20541ar.m14581f(kmgVarM6439b);
        if (this.f20561s.mo6184l(dib.f11276aj) || (this.f20546d.m5901j() && fvuVarM14581f.mo14534C())) {
            this.f20560r.mo11765p();
        }
        this.f20560r.mo11773x();
        this.f20560r.mo11726G();
        gps gpsVar = this.f20507J;
        if (gpsVar != null) {
            gpsVar.m9619a();
        }
        this.f20555m.m11110a();
        if (this.f20501D.mo16813g()) {
            ((cld) this.f20501D.mo16809c()).mo3904h();
        }
        this.f20517T = null;
        fmc fmcVar = this.f20536am;
        if (fmcVar != null && !fmcVar.isDone()) {
            this.f20536am.cancel(false);
        }
        this.f20535al = true;
        fmc fmcVarMo8831a = this.f20521X.mo8831a(this.f20546d, this.f20550h, ikw.PORTRAIT);
        this.f20536am = fmcVarMo8831a;
        kxk.m14975U(fmcVarMo8831a, new eog(this, kccVarMo13957a, 6), this.f20548f);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        if (this.f20561s.mo6184l(dib.f11357ck)) {
            if (((gzp) this.f20567y.mo3831be()).equals(gzp.OFF)) {
                this.f20549g.execute(new euj(this, 17));
            }
            this.f20502E.m10880c(this);
        }
        if (this.f20534ak.mo16813g()) {
            ((eac) this.f20534ak.mo16809c()).m6991a();
        }
        this.f20558p.addTouchExplorationStateChangeListener(this.f20538ao);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
        this.f20526ac.mo3415bf(true);
        jvb jvbVar = new jvb();
        this.f20506I = jvbVar;
        jvbVar.m13537d(this.f20529af.mo10519f(this.f20530ag));
        jvb jvbVar2 = this.f20506I;
        hoa hoaVar = this.f20530ag;
        jvbVar2.m13537d(hoaVar.f28562a.mo3830a(new euz(this, 5), this.f20548f));
        this.f20506I.m13537d(this.f20529af.mo10519f(this.f20537an));
        boolean z = false;
        this.f20506I.m13537d(this.f20524aa.mo10733a(new evy(this, 0)));
        this.f20545c.mo13961e("PortraitModule#start");
        mo3777k();
        eby ebyVar = this.f20498A;
        if (this.f20561s.mo6184l(did.f11425ad) && this.f20561s.mo6184l(did.f11424ac)) {
            z = true;
        }
        ebyVar.m7097h(z);
        m7935w(true);
        this.f20564v.addListener(this.f20514Q);
        this.f20506I.m13537d(new eds(this, 17));
        this.f20506I.m13537d(this.f20565w.mo11233e(this.f20551i));
        this.f20506I.m13537d(this.f20567y.mo3830a(new euz(this, 6), this.f20548f));
        this.f20544au.m19463A(new euj(this, 19), this.f20506I);
        this.f20533aj.m8602b(this, ikw.PORTRAIT, this.f20506I);
        this.f20566x.m10795d(this, this.f20539ap, this.f20506I);
        dnr dnrVar = ((ciq) this.f20547e.mo3693g()).f5818C;
        this.f20563u.m8583d();
        this.f20506I.m13537d(this.f20507J);
        this.f20554l.m7597a(this.f20516S);
        this.f20506I.m13537d(new eds(this, 18));
        this.f20531ah.m8281b();
        if (this.f20501D.mo16813g()) {
            ((cld) this.f20501D.mo16809c()).mo3901e(ikw.PORTRAIT, this.f20506I);
        }
        if (cds.m3518q(this.f20542as)) {
            this.f20543at.m6703r();
            m7936x(cds.m3503b(this.f20542as.m2611e()));
            cds.m3507f(this.f20542as.m2611e());
        }
        this.f20519V.m10149h();
        this.f20519V.m10148g();
        this.f20545c.mo13962f();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
        this.f20513P = null;
        if (this.f20536am.isDone()) {
            fmd fmdVar = this.f20517T;
            if (fmdVar != null) {
                fmdVar.close();
                this.f20517T = null;
            }
        } else {
            this.f20536am.cancel(false);
        }
        this.f20550h.m8839d();
        this.f20555m.m11110a();
        this.f20531ah.m8280a();
        dnr dnrVar = ((ciq) this.f20547e.mo3693g()).f5818C;
        this.f20510M = 0;
        this.f20560r.mo11775z();
        this.f20506I.close();
        this.f20498A.m7097h(false);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, jwn] */
    @Override // p000.chw
    /* JADX INFO: renamed from: r */
    public final void mo3783r() {
        this.f20545c.mo13961e("PortraitModule#takePictureNow");
        fmd fmdVar = this.f20517T;
        if (fmdVar == null) {
            ((nbe) ((nbe) f20497b.m17252c()).mo17276G((char) 1997)).mo17290o("Not taking picture since Camera is closed.");
            return;
        }
        if (!((Boolean) fmdVar.m8568b().mo3831be()).booleanValue()) {
            ((nbe) ((nbe) f20497b.m17252c()).mo17276G((char) 1996)).mo17290o("Not taking picture since the Camera is not ready to take a picture.");
            return;
        }
        this.f20559q.m6560b();
        if (this.f20558p.isTouchExplorationEnabled()) {
            this.f20558p.interrupt();
        }
        boolean z = false;
        m7935w(false);
        this.f20563u.m8581b();
        this.f20568z.mo11013l(false);
        this.f20547e.mo3693g().mo3715e();
        if (this.f20501D.mo16813g()) {
            ((cld) this.f20501D.mo16809c()).mo3903g();
        }
        if (((Boolean) this.f20498A.f13316b.mo3831be()).booleanValue() && this.f20501D.mo16813g()) {
            Duration duration = (Duration) fmdVar.mo8575i().f39913a.mo3831be();
            duration.toMillis();
            boolean zM7085d = this.f20532ai.m7085d(duration);
            ((cld) this.f20501D.mo16809c()).mo3906j(zM7085d, duration);
            this.f20513P = gyw.LONG_EXPOSURE;
            z = zM7085d;
        } else {
            this.f20560r.mo11763n();
        }
        this.f20540aq.m10865a();
        nps npsVarMo8589b = this.f20522Y.mo8589b(fmdVar, new evz(this, z), this.f20505H, this.f20511N);
        synchronized (this.f20512O) {
            this.f20512O.add(npsVarMo8589b);
        }
        npsVarMo8589b.mo2282d(new ekr(this, npsVarMo8589b, 20), this.f20548f);
        this.f20511N.m10428c();
        this.f20511N.m10429d();
        this.f20511N = (hkz) this.f20528ae.mo10394a();
        this.f20545c.mo13962f();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: s */
    public final void mo3784s(Runnable runnable) {
        runnable.run();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    public final boolean mo3785t() {
        jvd.m13538a();
        return this.f20566x.m10798g();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: u */
    public final boolean mo3786u() {
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m7935w(boolean z) {
        if (this.f5764a) {
            if (!gyw.LONG_EXPOSURE.equals(this.f20513P)) {
                this.f20547e.mo3693g().mo3718h(z);
                this.f20547e.mo3693g().mo3720j(z);
            }
            if (this.f20535al) {
                if (this.f20561s.mo6184l(dib.f11357ck) && this.f20502E.m10885h()) {
                    this.f20565w.mo11230b().sendAccessibilityEvent(8);
                }
                this.f20535al = false;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m7936x(int i) {
        this.f20559q.m6560b();
        if (this.f20558p.isTouchExplorationEnabled()) {
            this.f20558p.interrupt();
        }
        this.f20566x.m10796e(i);
    }
}
