package p000;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import java.io.File;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eus extends chw {

    /* JADX INFO: renamed from: b */
    public static final nbh f20137b = nbh.m17259h("com/google/android/apps/camera/legacy/app/module/longexposure/LongExposureMode");

    /* JADX INFO: renamed from: c */
    public static final Float f20138c = Float.valueOf(1.0f);

    /* JADX INFO: renamed from: A */
    public final dgb f20139A;

    /* JADX INFO: renamed from: B */
    public final dfo f20140B;

    /* JADX INFO: renamed from: C */
    public final ebv f20141C;

    /* JADX INFO: renamed from: D */
    public final hys f20142D;

    /* JADX INFO: renamed from: E */
    public final mrm f20143E;

    /* JADX INFO: renamed from: F */
    public final mrm f20144F;

    /* JADX INFO: renamed from: G */
    public final mrm f20145G;

    /* JADX INFO: renamed from: I */
    public boolean f20147I;

    /* JADX INFO: renamed from: J */
    public jvb f20148J;

    /* JADX INFO: renamed from: K */
    public dnf f20149K;

    /* JADX INFO: renamed from: L */
    public CountDownTimer f20150L;

    /* JADX INFO: renamed from: M */
    public hkz f20151M;

    /* JADX INFO: renamed from: N */
    public final fdl f20152N;

    /* JADX INFO: renamed from: Q */
    public final gsh f20155Q;

    /* JADX INFO: renamed from: R */
    public fmd f20156R;

    /* JADX INFO: renamed from: S */
    public hsu f20157S;

    /* JADX INFO: renamed from: T */
    public final hee f20158T;

    /* JADX INFO: renamed from: U */
    public final gtd f20159U;

    /* JADX INFO: renamed from: V */
    private final kbz f20160V;

    /* JADX INFO: renamed from: W */
    private final fvl f20161W;

    /* JADX INFO: renamed from: X */
    private final fvs f20162X;

    /* JADX INFO: renamed from: Y */
    private final hht f20163Y;

    /* JADX INFO: renamed from: Z */
    private final htf f20164Z;

    /* JADX INFO: renamed from: aa */
    private final hwy f20165aa;

    /* JADX INFO: renamed from: ab */
    private final oju f20166ab;

    /* JADX INFO: renamed from: ac */
    private final jww f20167ac;

    /* JADX INFO: renamed from: ad */
    private final jww f20168ad;

    /* JADX INFO: renamed from: ae */
    private final hkx f20169ae;

    /* JADX INFO: renamed from: af */
    private final ehi f20170af;

    /* JADX INFO: renamed from: ag */
    private final hnw f20171ag;

    /* JADX INFO: renamed from: ah */
    private final File f20172ah;

    /* JADX INFO: renamed from: ai */
    private final gfa f20173ai;

    /* JADX INFO: renamed from: aj */
    private fmc f20174aj;

    /* JADX INFO: renamed from: ak */
    private ProgressOverlay f20175ak;

    /* JADX INFO: renamed from: al */
    private final gua f20176al;

    /* JADX INFO: renamed from: am */
    private final mrm f20177am;

    /* JADX INFO: renamed from: an */
    private final fdc f20178an;

    /* JADX INFO: renamed from: ao */
    private final elx f20179ao;

    /* JADX INFO: renamed from: ap */
    private final fna f20180ap;

    /* JADX INFO: renamed from: as */
    private final hyb f20183as;

    /* JADX INFO: renamed from: at */
    private final bko f20184at;

    /* JADX INFO: renamed from: au */
    private final C1058va f20185au;

    /* JADX INFO: renamed from: d */
    public final dbr f20186d;

    /* JADX INFO: renamed from: e */
    public final chj f20187e;

    /* JADX INFO: renamed from: f */
    public final jvd f20188f;

    /* JADX INFO: renamed from: g */
    public final igf f20189g;

    /* JADX INFO: renamed from: h */
    public final fmo f20190h;

    /* JADX INFO: renamed from: i */
    public final eoq f20191i;

    /* JADX INFO: renamed from: j */
    public final hua f20192j;

    /* JADX INFO: renamed from: k */
    public final iuj f20193k;

    /* JADX INFO: renamed from: l */
    public final cbz f20194l;

    /* JADX INFO: renamed from: m */
    public final mrm f20195m;

    /* JADX INFO: renamed from: n */
    public final fmi f20196n;

    /* JADX INFO: renamed from: o */
    public final jww f20197o;

    /* JADX INFO: renamed from: p */
    public final fek f20198p;

    /* JADX INFO: renamed from: q */
    public final dhv f20199q;

    /* JADX INFO: renamed from: r */
    public final BottomBarController f20200r;

    /* JADX INFO: renamed from: s */
    public final igb f20201s;

    /* JADX INFO: renamed from: t */
    public final AccessibilityManager f20202t;

    /* JADX INFO: renamed from: u */
    public final dpx f20203u;

    /* JADX INFO: renamed from: v */
    public final ggm f20204v;

    /* JADX INFO: renamed from: w */
    public final eby f20205w;

    /* JADX INFO: renamed from: x */
    public final fds f20206x;

    /* JADX INFO: renamed from: y */
    public final mrm f20207y;

    /* JADX INFO: renamed from: z */
    public final glu f20208z;

    /* JADX INFO: renamed from: H */
    public boolean f20146H = false;

    /* JADX INFO: renamed from: O */
    public final BottomBarListener f20153O = new euk(this);

    /* JADX INFO: renamed from: P */
    public final eop f20154P = new eul(this, 0);

    /* JADX INFO: renamed from: aq */
    private final ebx f20181aq = new eum(this);

    /* JADX INFO: renamed from: ar */
    private final hxa f20182ar = new euo(this, 0);

    public eus(kbz kbzVar, dbr dbrVar, fvl fvlVar, chk chkVar, fvs fvsVar, mrm mrmVar, jvd jvdVar, fmo fmoVar, hht hhtVar, eoq eoqVar, hua huaVar, iuj iujVar, mrm mrmVar2, jww jwwVar, oju ojuVar, fmi fmiVar, hwy hwyVar, fek fekVar, jww jwwVar2, jww jwwVar3, cbz cbzVar, gsh gshVar, hee heeVar, dhv dhvVar, eby ebyVar, bko bkoVar, BottomBarController bottomBarController, igb igbVar, AccessibilityManager accessibilityManager, dpx dpxVar, ggm ggmVar, hkx hkxVar, fdl fdlVar, fds fdsVar, gtd gtdVar, ehi ehiVar, hnw hnwVar, Context context, hyb hybVar, mrm mrmVar3, glu gluVar, gua guaVar, mrm mrmVar4, fdc fdcVar, dgb dgbVar, gfa gfaVar, dfo dfoVar, elx elxVar, ebv ebvVar, hys hysVar, htf htfVar, mrm mrmVar5, mrm mrmVar6, fna fnaVar, C1058va c1058va, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f20160V = kbzVar;
        this.f20161W = fvlVar;
        this.f20186d = dbrVar;
        this.f20187e = chkVar;
        this.f20162X = fvsVar;
        this.f20145G = mrmVar;
        this.f20188f = jvdVar;
        this.f20190h = fmoVar;
        this.f20163Y = hhtVar;
        this.f20191i = eoqVar;
        this.f20192j = huaVar;
        this.f20193k = iujVar;
        this.f20195m = mrmVar2;
        this.f20197o = jwwVar;
        this.f20196n = fmiVar;
        this.f20165aa = hwyVar;
        this.f20166ab = ojuVar;
        this.f20198p = fekVar;
        this.f20167ac = jwwVar2;
        this.f20168ad = jwwVar3;
        this.f20194l = cbzVar;
        this.f20155Q = gshVar;
        this.f20199q = dhvVar;
        this.f20184at = bkoVar;
        this.f20200r = bottomBarController;
        this.f20201s = igbVar;
        this.f20205w = ebyVar;
        this.f20158T = heeVar;
        this.f20202t = accessibilityManager;
        this.f20203u = dpxVar;
        this.f20204v = ggmVar;
        this.f20169ae = hkxVar;
        this.f20151M = (hkz) hkxVar.mo10394a();
        this.f20152N = fdlVar;
        this.f20206x = fdsVar;
        this.f20159U = gtdVar;
        this.f20170af = ehiVar;
        this.f20171ag = hnwVar;
        this.f20172ah = context.getFilesDir();
        this.f20183as = hybVar;
        this.f20207y = mrmVar3;
        this.f20208z = gluVar;
        this.f20176al = guaVar;
        this.f20177am = mrmVar4;
        this.f20178an = fdcVar;
        this.f20139A = dgbVar;
        this.f20173ai = gfaVar;
        this.f20140B = dfoVar;
        this.f20179ao = elxVar;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6179g();
        dhvVar.mo6179g();
        this.f20141C = ebvVar;
        this.f20142D = hysVar;
        this.f20164Z = htfVar;
        this.f20143E = mrmVar5;
        this.f20144F = mrmVar6;
        this.f20180ap = fnaVar;
        this.f20185au = c1058va;
        this.f20189g = new eun(this, ebyVar, ebvVar, fmoVar, fekVar, fdlVar);
    }

    /* JADX INFO: renamed from: F */
    private final void m7907F(boolean z) {
        if (z) {
            this.f20175ak.m4253a();
        } else {
            this.f20175ak.m4254b();
        }
        this.f20155Q.m9706d(this.f20175ak);
    }

    /* JADX INFO: renamed from: A */
    public final void m7908A(int i) {
        this.f20203u.m6560b();
        if (this.f20202t.isTouchExplorationEnabled()) {
            this.f20202t.interrupt();
        }
        this.f20165aa.m10796e(i);
    }

    /* JADX INFO: renamed from: B */
    public final void m7909B(boolean z) {
        this.f20152N.m11104f();
        if (!z) {
            this.f20163Y.mo10316b(C0100R.raw.camera_shutter);
        } else {
            this.f20163Y.mo10316b(C0100R.raw.astro_longexposure_stop);
            this.f20187e.mo3693g().mo3723m();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m7910C(boolean z) {
        gfa gfaVar = this.f20173ai;
        gfaVar.getClass();
        gfaVar.mo9135v(z, C0100R.drawable.quantum_gm_ic_astrophotography_auto_white_24, C0100R.string.astro_auto_acc_desc, "AutoAstro");
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7911D() {
        if (!this.f20165aa.m10798g()) {
            return false;
        }
        iuj iujVar = this.f20193k;
        iujVar.getClass();
        iujVar.mo11730K(true);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m7912E() {
        fmd fmdVar = this.f20156R;
        return fmdVar != null && ((Boolean) fmdVar.m8568b().mo3831be()).booleanValue();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bS */
    public final void mo3767bS(int i) {
        fmd fmdVar;
        if (i != 0 || (fmdVar = this.f20156R) == null) {
            return;
        }
        m7915y(((Boolean) fmdVar.m8568b().mo3831be()).booleanValue());
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
        m7914x();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        m7911D();
        m7913w(true);
        m7910C(false);
        iuj iujVar = this.f20193k;
        ((ite) iujVar).f32085ai = 0;
        iujVar.mo11775z();
        this.f20193k.mo11765p();
        if (this.f20199q.mo6184l(dib.f11357ck)) {
            this.f20142D.m10883f();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bz */
    public final mrm mo3772bz() {
        return mrm.m16828h(this.f20156R);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        m7915y(false);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: k */
    public final void mo3777k() {
        kcc kccVarMo13957a = this.f20160V.mo13957a("LongExposureMode#startCameraFromCameraSetting");
        this.f20156R = null;
        fmc fmcVar = this.f20174aj;
        if (fmcVar != null && !fmcVar.isDone()) {
            this.f20174aj.cancel(false);
        }
        this.f20174aj = this.f20161W.mo8831a(this.f20186d, this.f20162X, ikw.LONG_EXPOSURE);
        iuj iujVar = this.f20193k;
        ((ite) iujVar).f32085ai = 0;
        iujVar.mo11773x();
        this.f20193k.mo11768s();
        if (this.f20193k.mo11746aa() || !this.f20193k.mo11745Z(ikw.LONG_EXPOSURE) || ((ite) this.f20193k).f32068S) {
            this.f20193k.mo11765p();
        }
        kxk.m14975U(this.f20174aj, new eog(this, kccVarMo13957a, 3), this.f20188f);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        this.f20148J.m13537d(this.f20205w.m7094e(this.f20181aq));
        if (this.f20199q.mo6184l(dib.f11357ck) && ((gzp) this.f20197o.mo3831be()).equals(gzp.OFF)) {
            this.f20142D.m10882e();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
        this.f20198p.mo5711f();
        jvb jvbVar = this.f20148J;
        if (jvbVar != null && !jvbVar.mo8995b()) {
            this.f20148J.close();
        }
        this.f20148J = new jvb();
        this.f20155Q.m9704b();
        this.f20196n.m8583d();
        int i = 1;
        this.f20196n.m8584e(true);
        iiu iiuVar = this.f20196n.f22559b;
        if (iiuVar != null) {
            iiuVar.f31134f = 0;
            iiuVar.f31135g = 0;
            iiuVar.f31139k = false;
        }
        this.f20160V.mo13961e("CuttlefishModule#start");
        mo3777k();
        m7915y(true);
        this.f20200r.addListener(this.f20153O);
        this.f20180ap.m8602b(this, ikw.LONG_EXPOSURE, this.f20148J);
        this.f20148J.m13537d(new eds(this, 11));
        this.f20148J.m13537d(this.f20201s.mo11233e(this.f20189g));
        this.f20148J.m13537d(jwj.m13624c(this.f20197o).mo3830a(new dsu(this, 19), this.f20188f));
        this.f20148J.m13537d(this.f20205w.m7094e(this.f20181aq));
        this.f20148J.m13537d(this.f20164Z.mo10733a(new evy(this, 1)));
        this.f20191i.m7597a(this.f20154P);
        this.f20148J.m13537d(new eds(this, 12));
        this.f20165aa.m10795d(this, this.f20182ar, this.f20148J);
        this.f20175ak = (ProgressOverlay) ((jfs) ((djm) this.f20166ab.get()).f11789c).m13100f(C0100R.id.progress_overlay);
        m7907F(true);
        if (cds.m3518q(this.f20184at)) {
            m7908A(cds.m3503b(this.f20184at.m2611e()));
            cds.m3507f(this.f20184at.m2611e());
        }
        this.f20158T.m10149h();
        this.f20158T.m10148g();
        this.f20206x.m8281b();
        this.f20148J.m13537d(new eds(this, 13));
        this.f20160V.mo13962f();
        this.f20152N.m11103e(this.f20179ao);
        this.f20148J.m13537d(this.f20152N);
        this.f20148J.m13537d(this.f20171ag.mo10519f(this.f20170af));
        this.f20148J.m13537d(this.f20171ag.mo10519f(this.f20176al));
        if (this.f20199q.mo6184l(dih.f11519g) && this.f20172ah.exists()) {
            this.f20148J.m13537d(new nsv(this.f20172ah.getAbsolutePath()));
        }
        if (this.f20177am.mo16813g() && this.f20178an.f21402i) {
            float fMo11757h = this.f20193k.mo11757h();
            Float f = f20138c;
            if (fMo11757h < f.floatValue()) {
                this.f20193k.mo11723D(f.floatValue());
                iuj iujVar = this.f20193k;
                if (((ite) iujVar).f32068S) {
                    iujVar.mo11765p();
                }
            }
            ((fdu) this.f20177am.mo16809c()).mo8270a();
            this.f20178an.f21402i = false;
        }
        this.f20185au.m19463A(new euj(this, i), this.f20148J);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
        if (this.f20174aj.isDone()) {
            fmd fmdVar = this.f20156R;
            if (fmdVar != null) {
                fmdVar.close();
                this.f20156R = null;
            }
        } else {
            this.f20174aj.cancel(false);
        }
        this.f20146H = false;
        this.f20162X.m8839d();
        this.f20196n.m8584e(false);
        m7907F(false);
        this.f20155Q.m9703a();
        this.f20148J.close();
        this.f20198p.mo5712g();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [gwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, oju] */
    @Override // p000.chw
    /* JADX INFO: renamed from: r */
    public final void mo3783r() {
        boolean z;
        this.f20160V.mo13961e("CuttlefishModule#takePictureNow");
        fmd fmdVar = this.f20156R;
        if (fmdVar == null) {
            ((nbe) ((nbe) f20137b.m17252c()).mo17276G((char) 1959)).mo17290o("Not taking picture since Camera is closed.");
            return;
        }
        if (!((Boolean) fmdVar.m8568b().mo3831be()).booleanValue()) {
            ((nbe) ((nbe) f20137b.m17252c()).mo17276G((char) 1958)).mo17290o("Not taking picture since the Camera is not ready to take a picture.");
            return;
        }
        this.f20203u.m6560b();
        if (this.f20202t.isTouchExplorationEnabled()) {
            this.f20202t.interrupt();
        }
        m7915y(false);
        this.f20163Y.mo10316b(C0100R.raw.longexposure_start);
        this.f20205w.m7095f();
        this.f20196n.m8581b();
        Duration duration = (Duration) fmdVar.mo8575i().f39913a.mo3831be();
        duration.toMillis();
        if (!this.f20205w.m7100k() && this.f20143E.mo16813g() && this.f20141C.f13306h) {
            ((clc) this.f20143E.mo16809c()).mo3866D(duration);
        }
        boolean zM7085d = this.f20141C.m7085d(duration);
        if (this.f20205w.m7100k() || !zM7085d) {
            this.f20198p.mo8291i();
        } else {
            this.f20198p.mo8290d();
        }
        this.f20183as.m10865a();
        fmo fmoVar = this.f20190h;
        eur eurVar = new eur(this, zM7085d);
        boolean z2 = this.f20147I;
        fmoVar.f22586s = this.f20151M;
        flz flzVar = fmdVar.f22542b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        kqj kqjVar = fmoVar.f22592y;
        if (((Boolean) fmoVar.f22576i.mo3831be()).booleanValue()) {
            ((Boolean) fmoVar.f22577j.mo3831be()).booleanValue();
        }
        gyn gynVarM14706h = kqjVar.m14706h(jCurrentTimeMillis);
        drj drjVar = fmoVar.f22567B;
        String strM13083S = fmoVar.f22593z.m13083S(jCurrentTimeMillis);
        cjr cjrVarMo8116b = fmoVar.f22568a.mo8116b();
        mrm mrmVarM16829i = mrm.m16829i(fmoVar.f22586s);
        ?? r12 = drjVar.f12397c.get();
        egc egcVar = (egc) drjVar.f12398d.get();
        egcVar.getClass();
        jwn jwnVar = (jwn) drjVar.f12395a.get();
        jwnVar.getClass();
        gqq gqqVar = (gqq) drjVar.f12399e.get();
        gqqVar.getClass();
        gxr gxrVar = new gxr(r12, egcVar, jwnVar, gqqVar, strM13083S, cjrVarMo8116b, gynVarM14706h, mrmVarM16829i, ((gcw) drjVar.f12396b).m9065a());
        kbc kbcVar = flzVar.f22532d.f31019a;
        kbc kbcVarM13907d = ggi.m9210b(fmoVar.f22570c.mo9220j()) ? kbcVar.m13907d() : kbcVar.m13908e();
        fmoVar.f22569b.mo9925e(gxrVar);
        fmoVar.f22585r.m9939a(gxrVar);
        gxrVar.mo9887S(kbcVarM13907d);
        fmoVar.f22591x = gxrVar;
        int i = fmoVar.f22570c.mo9215c().f35503e;
        if (!fmoVar.f22583p.mo6184l(dil.f11632r) || !((Boolean) fmoVar.f22576i.mo3831be()).booleanValue() || !((Boolean) fmoVar.f22577j.mo3831be()).booleanValue()) {
            z = false;
        } else if (!fmdVar.f22543c.mo14542K()) {
            z = true;
        } else if (fmoVar.f22584q.mo3831be() == ikw.IMAGE_INTENT) {
            z = !fmoVar.f22583p.mo6184l(dil.f11631q);
        } else {
            fmoVar.f22583p.mo6175c();
            z = true;
        }
        ftz ftzVarM8808a = fua.m8808a();
        ftzVarM8808a.m8806g(i);
        ftzVarM8808a.m8801b(eurVar);
        ftzVarM8808a.m8804e(fmoVar.f22571d.f26624a);
        ftzVarM8808a.m8802c(fmdVar.f22543c.mo14558k());
        ftzVarM8808a.f23561a = fmdVar.f22543c.mo14546O();
        ftzVarM8808a.m8807h(jwv.m13644a(false));
        ftzVarM8808a.m8803d(z);
        ftzVarM8808a.m8805f(false);
        nps npsVarMo8572f = fmdVar.mo8572f(ftzVarM8808a.m8800a(), gxrVar);
        gxrVar.mo9881M();
        fvu fvuVar = fmdVar.f22543c;
        boolean z3 = fvuVar.mo14558k() == kmq.f36557a;
        String str = z3 ? (String) fmoVar.f22582o.mo10031c(gzy.f27065x) : fmoVar.f22579l;
        boolean zEquals = str.equals(fmoVar.f22578k);
        boolean z4 = ((Integer) fmoVar.f22582o.mo10031c(gzy.f27045d)).intValue() != hyn.OFF.f29942e;
        gzk gzkVarM10013a = gzk.m10013a(((Integer) (z3 ? fmoVar.f22581n : fmoVar.f22580m).mo3831be()).intValue());
        mrm mrmVar = fmoVar.f22588u;
        mrm mrmVarM16829i2 = mrmVar.mo16813g() ? mrm.m16829i(((gmh) mrmVar.mo16809c()).mo9505c()) : mqu.f41450a;
        hjy hjyVarMo9905k = gxrVar.mo9905k();
        fcv fcvVarM8223a = fcw.m8223a();
        fcvVarM8223a.f21295e = 29;
        fcvVarM8223a.f21291a = gxrVar.mo9913s() + "." + krd.JPEG.f37022j;
        fcvVarM8223a.m8214h(z3);
        fcvVarM8223a.m8222p(((Float) fmoVar.f22575h.mo3831be()).floatValue());
        fcvVarM8223a.m8212f(str);
        fcvVarM8223a.m8209c(((Boolean) fmoVar.f22574g.mo3831be()).booleanValue());
        fcvVarM8223a.m8215i(z4);
        fcvVarM8223a.m8221o(((gzp) fmoVar.f22572e.mo3831be()).f26960g);
        fcvVarM8223a.f21292b = Boolean.valueOf(z2);
        fcvVarM8223a.m8208b(fvuVar.mo14555h());
        fcvVarM8223a.m8217k(Boolean.valueOf(zEquals));
        fcvVarM8223a.m8218l(false);
        fcvVarM8223a.m8219m(((Boolean) fmoVar.f22573f.mo3831be()).booleanValue());
        fcvVarM8223a.f21296f = gzkVarM10013a.m10014b();
        fcvVarM8223a.m8216j(gxrVar.mo9904j() == gyx.MARS_STORE);
        fcvVarM8223a.m8211e(fmoVar.f22587t.m9461e());
        fcvVarM8223a.f21293c = mrmVarM16829i2;
        fcvVarM8223a.m8210d(fmoVar.f22566A.m6249y());
        fcvVarM8223a.m8220n(fmoVar.f22589v.isTouchExplorationEnabled());
        fcvVarM8223a.f21294d = mrm.m16829i(((hys) fmoVar.f22590w.get()).m10878a());
        ((hjz) hjyVarMo9905k).f28099y = fcvVarM8223a.m8207a();
        npsVarMo8572f.mo2282d(new euj(this, 0), this.f20188f);
        this.f20151M.m10428c();
        this.f20151M.m10429d();
        this.f20151M = (hkz) this.f20169ae.mo10394a();
        this.f20160V.mo13962f();
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
        if (m7911D()) {
            return true;
        }
        fmd fmdVar = this.f20156R;
        if (fmdVar != null) {
            mca mcaVarMo8575i = fmdVar.mo8575i();
            if (((Boolean) ((jwf) mcaVarMo8575i.f39921i).f34942d).booleanValue()) {
                this.f20190h.mo8591d(mcaVarMo8575i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final void m7913w(boolean z) {
        iuj iujVar = this.f20193k;
        iujVar.getClass();
        iujVar.mo11730K(true);
        this.f20196n.m8580a();
        this.f20187e.mo3693g().mo3723m();
        this.f20152N.m11104f();
        this.f20152N.m8271a();
        this.f20201s.mo11245q();
        this.f20139A.m6092e();
        if (this.f20143E.mo16813g() && this.f20141C.f13306h) {
            ((clc) this.f20143E.mo16809c()).mo3871b(!z);
        }
        CountDownTimer countDownTimer = this.f20150L;
        if (countDownTimer != null) {
            countDownTimer.onFinish();
        }
        if (z || this.f20205w.m7101l()) {
            return;
        }
        this.f20198p.mo8286a();
    }

    /* JADX INFO: renamed from: x */
    public final void m7914x() {
        gzk gzkVarM10013a = gzk.m10013a(((Integer) this.f20168ad.mo3831be()).intValue());
        gzk gzkVar = gzk.ON;
        if (gzkVarM10013a != gzkVar) {
            this.f20168ad.mo3415bf(Integer.valueOf(gzkVar.f26932f));
        }
        gzk gzkVarM10013a2 = gzk.m10013a(((Integer) this.f20167ac.mo3831be()).intValue());
        gzk gzkVar2 = gzk.ON;
        if (gzkVarM10013a2 != gzkVar2) {
            this.f20167ac.mo3415bf(Integer.valueOf(gzkVar2.f26932f));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m7915y(boolean z) {
        if (this.f5764a && !this.f20165aa.m10799h()) {
            this.f20187e.mo3693g().mo3718h(z);
            if (z) {
                this.f20198p.mo8289c();
            } else {
                this.f20198p.mo8293j();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m7916z(boolean z, boolean z2) {
        if (z) {
            this.f20152N.m11104f();
            this.f20187e.mo3693g().mo3722l();
            this.f20187e.mo3693g().mo3713c();
        } else if (z2) {
            this.f20198p.mo8290d();
        } else {
            this.f20201s.mo11206N();
        }
    }
}
