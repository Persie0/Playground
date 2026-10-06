package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class euf extends chw implements hyw {

    /* JADX INFO: renamed from: b */
    public static final nbh f19913b = nbh.m17259h("com/google/android/apps/camera/legacy/app/module/capture/CaptureModule");

    /* JADX INFO: renamed from: A */
    public final boolean f19914A;

    /* JADX INFO: renamed from: B */
    public final chk f19915B;

    /* JADX INFO: renamed from: C */
    public final hht f19916C;

    /* JADX INFO: renamed from: D */
    public final fmi f19917D;

    /* JADX INFO: renamed from: E */
    public final dpx f19918E;

    /* JADX INFO: renamed from: F */
    public final AccessibilityManager f19919F;

    /* JADX INFO: renamed from: G */
    public final hys f19920G;

    /* JADX INFO: renamed from: H */
    public flz f19921H;

    /* JADX INFO: renamed from: I */
    public nps f19922I;

    /* JADX INFO: renamed from: J */
    public fuc f19923J;

    /* JADX INFO: renamed from: K */
    public dnf f19924K;

    /* JADX INFO: renamed from: L */
    public hkz f19925L;

    /* JADX INFO: renamed from: M */
    public final nps f19926M;

    /* JADX INFO: renamed from: N */
    public final jww f19927N;

    /* JADX INFO: renamed from: Q */
    public final jvb f19930Q;

    /* JADX INFO: renamed from: R */
    public final clo f19931R;

    /* JADX INFO: renamed from: S */
    public final htv f19932S;

    /* JADX INFO: renamed from: T */
    public final ebv f19933T;

    /* JADX INFO: renamed from: U */
    public final fme f19934U;

    /* JADX INFO: renamed from: V */
    public jvb f19935V;

    /* JADX INFO: renamed from: W */
    public final mrm f19936W;

    /* JADX INFO: renamed from: X */
    public final mrm f19937X;

    /* JADX INFO: renamed from: Y */
    public final hua f19938Y;

    /* JADX INFO: renamed from: Z */
    public final fcp f19939Z;

    /* JADX INFO: renamed from: aA */
    private final BottomBarListener f19940aA;

    /* JADX INFO: renamed from: aB */
    private final idl f19941aB;

    /* JADX INFO: renamed from: aC */
    private final dnn f19942aC;

    /* JADX INFO: renamed from: aD */
    private final hkx f19943aD;

    /* JADX INFO: renamed from: aE */
    private final mrm f19944aE;

    /* JADX INFO: renamed from: aF */
    private final gwr f19945aF;

    /* JADX INFO: renamed from: aG */
    private fmj f19946aG;

    /* JADX INFO: renamed from: aJ */
    private final htf f19949aJ;

    /* JADX INFO: renamed from: aK */
    private final iht f19950aK;

    /* JADX INFO: renamed from: aL */
    private final eoq f19951aL;

    /* JADX INFO: renamed from: aP */
    private final idb f19955aP;

    /* JADX INFO: renamed from: aS */
    private final fds f19958aS;

    /* JADX INFO: renamed from: aT */
    private final dfo f19959aT;

    /* JADX INFO: renamed from: aU */
    private final fna f19960aU;

    /* JADX INFO: renamed from: aW */
    private final hyb f19962aW;

    /* JADX INFO: renamed from: aX */
    private final kms f19963aX;

    /* JADX INFO: renamed from: aY */
    private final cwd f19964aY;

    /* JADX INFO: renamed from: ab */
    public final gfa f19967ab;

    /* JADX INFO: renamed from: ac */
    public final dhv f19968ac;

    /* JADX INFO: renamed from: ad */
    public final jwf f19969ad;

    /* JADX INFO: renamed from: ae */
    public final eby f19970ae;

    /* JADX INFO: renamed from: af */
    public final cbz f19971af;

    /* JADX INFO: renamed from: ag */
    public final hwy f19972ag;

    /* JADX INFO: renamed from: ah */
    public final elx f19973ah;

    /* JADX INFO: renamed from: ai */
    public final jwn f19974ai;

    /* JADX INFO: renamed from: aj */
    public final mrm f19975aj;

    /* JADX INFO: renamed from: ak */
    public final glu f19976ak;

    /* JADX INFO: renamed from: al */
    public final ges f19977al;

    /* JADX INFO: renamed from: an */
    public final cdu f19979an;

    /* JADX INFO: renamed from: ao */
    public final ikt f19980ao;

    /* JADX INFO: renamed from: ap */
    public fvu f19981ap;

    /* JADX INFO: renamed from: aq */
    public final gsh f19982aq;

    /* JADX INFO: renamed from: ar */
    public hsu f19983ar;

    /* JADX INFO: renamed from: as */
    public final dfn f19984as;

    /* JADX INFO: renamed from: at */
    public final hee f19985at;

    /* JADX INFO: renamed from: au */
    public final hee f19986au;

    /* JADX INFO: renamed from: av */
    private final fvs f19987av;

    /* JADX INFO: renamed from: aw */
    private final Resources f19988aw;

    /* JADX INFO: renamed from: ax */
    private final hkx f19989ax;

    /* JADX INFO: renamed from: ay */
    private final iey f19990ay;

    /* JADX INFO: renamed from: az */
    private final BottomBarController f19991az;

    /* JADX INFO: renamed from: ba */
    private final bko f19992ba;

    /* JADX INFO: renamed from: bb */
    private final dsx f19993bb;

    /* JADX INFO: renamed from: bc */
    private final gtd f19994bc;

    /* JADX INFO: renamed from: bd */
    private final C1058va f19995bd;

    /* JADX INFO: renamed from: c */
    public final gdc f19996c;

    /* JADX INFO: renamed from: d */
    public final jvd f19997d;

    /* JADX INFO: renamed from: e */
    public final Executor f19998e;

    /* JADX INFO: renamed from: f */
    public final ggm f19999f;

    /* JADX INFO: renamed from: g */
    public final kbz f20000g;

    /* JADX INFO: renamed from: h */
    public final eot f20001h;

    /* JADX INFO: renamed from: i */
    public final igb f20002i;

    /* JADX INFO: renamed from: j */
    public final igf f20003j;

    /* JADX INFO: renamed from: k */
    public final iuj f20004k;

    /* JADX INFO: renamed from: l */
    public final dox f20005l;

    /* JADX INFO: renamed from: m */
    public final hxp f20006m;

    /* JADX INFO: renamed from: n */
    public final dbr f20007n;

    /* JADX INFO: renamed from: o */
    public final idf f20008o;

    /* JADX INFO: renamed from: p */
    public final idg f20009p;

    /* JADX INFO: renamed from: q */
    public final fmy f20010q;

    /* JADX INFO: renamed from: r */
    public final fmh f20011r;

    /* JADX INFO: renamed from: s */
    public final eos f20012s;

    /* JADX INFO: renamed from: t */
    public final icf f20013t;

    /* JADX INFO: renamed from: u */
    public final mrm f20014u;

    /* JADX INFO: renamed from: v */
    public final mrm f20015v;

    /* JADX INFO: renamed from: w */
    public final ohb f20016w;

    /* JADX INFO: renamed from: x */
    public final mrm f20017x;

    /* JADX INFO: renamed from: y */
    public final mrm f20018y;

    /* JADX INFO: renamed from: z */
    public final mrm f20019z;

    /* JADX INFO: renamed from: aH */
    private boolean f19947aH = false;

    /* JADX INFO: renamed from: O */
    public boolean f19928O = false;

    /* JADX INFO: renamed from: P */
    public boolean f19929P = false;

    /* JADX INFO: renamed from: aI */
    private jvb f19948aI = new jvb();

    /* JADX INFO: renamed from: aZ */
    private final jay f19965aZ = new jay((byte[]) null);

    /* JADX INFO: renamed from: aa */
    public final jwf f19966aa = new jwf(true);

    /* JADX INFO: renamed from: aM */
    private final eop f19952aM = new eul(this, 1);

    /* JADX INFO: renamed from: aN */
    private final hxa f19953aN = new euo(this, 1);

    /* JADX INFO: renamed from: aO */
    private final AccessibilityManager.TouchExplorationStateChangeListener f19954aO = new evw(this, 1);

    /* JADX INFO: renamed from: aQ */
    private boolean f19956aQ = false;

    /* JADX INFO: renamed from: aR */
    private boolean f19957aR = false;

    /* JADX INFO: renamed from: am */
    public gyw f19978am = null;

    /* JADX INFO: renamed from: aV */
    private final ieq f19961aV = new iel();

    public euf(Context context, chk chkVar, cdu cduVar, jvd jvdVar, Executor executor, kbz kbzVar, hkx hkxVar, kms kmsVar, ggm ggmVar, gtd gtdVar, hht hhtVar, fvs fvsVar, mrm mrmVar, jww jwwVar, gdc gdcVar, htf htfVar, hua huaVar, eoq eoqVar, iid iidVar, iht ihtVar, AccessibilityManager accessibilityManager, dpx dpxVar, fds fdsVar, nps npsVar, oju ojuVar, bko bkoVar, iey ieyVar, BottomBarController bottomBarController, igb igbVar, iuj iujVar, dox doxVar, gfa gfaVar, hxp hxpVar, gsh gshVar, fcp fcpVar, cbz cbzVar, hwy hwyVar, dbr dbrVar, idf idfVar, idg idgVar, idl idlVar, fmy fmyVar, fmh fmhVar, hee heeVar, dhv dhvVar, fmi fmiVar, icf icfVar, ikt iktVar, mrm mrmVar2, dnn dnnVar, gwr gwrVar, dsx dsxVar, htv htvVar, clo cloVar, cwd cwdVar, hkx hkxVar2, ohb ohbVar, hnw hnwVar, ehi ehiVar, hoa hoaVar, mrm mrmVar3, elx elxVar, jwn jwnVar, mrm mrmVar4, eby ebyVar, hee heeVar2, dfn dfnVar, hyb hybVar, gua guaVar, mrm mrmVar5, dfo dfoVar, glu gluVar, AtomicBoolean atomicBoolean, mrm mrmVar6, mrm mrmVar7, mrm mrmVar8, mrm mrmVar9, ebv ebvVar, hys hysVar, fna fnaVar, C1058va c1058va, ges gesVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f19915B = chkVar;
        kmsVar.getClass();
        this.f19963aX = kmsVar;
        this.f19994bc = gtdVar;
        this.f19979an = cduVar;
        this.f19997d = jvdVar;
        this.f19998e = executor;
        Resources resources = context.getResources();
        this.f19988aw = resources;
        this.f20000g = kbzVar;
        this.f19989ax = hkxVar;
        this.f19999f = ggmVar;
        this.f19916C = hhtVar;
        this.f19958aS = fdsVar;
        this.f19987av = fvsVar;
        this.f20019z = mrmVar;
        this.f19927N = jwwVar;
        this.f19996c = gdcVar;
        this.f19949aJ = htfVar;
        this.f19938Y = huaVar;
        this.f19951aL = eoqVar;
        this.f19950aK = ihtVar;
        this.f19919F = accessibilityManager;
        this.f19918E = dpxVar;
        this.f19926M = npsVar;
        this.f19992ba = bkoVar;
        this.f19990ay = ieyVar;
        this.f19991az = bottomBarController;
        this.f20002i = igbVar;
        this.f20004k = iujVar;
        this.f20005l = doxVar;
        this.f20006m = hxpVar;
        this.f19967ab = gfaVar;
        this.f19982aq = gshVar;
        this.f19939Z = fcpVar;
        this.f20007n = dbrVar;
        this.f20008o = idfVar;
        this.f20009p = idgVar;
        this.f19941aB = idlVar;
        this.f20010q = fmyVar;
        this.f20011r = fmhVar;
        this.f19985at = heeVar;
        this.f19974ai = jwnVar;
        this.f19975aj = mrmVar5;
        this.f19976ak = gluVar;
        this.f19969ad = new jwf(false);
        jvb jvbVar = new jvb();
        this.f19930Q = jvbVar;
        fme fmeVar = new fme();
        this.f19934U = fmeVar;
        this.f19935V = new jvb();
        this.f19968ac = dhvVar;
        this.f19917D = fmiVar;
        this.f20013t = icfVar;
        this.f20015v = mrmVar2;
        this.f19942aC = dnnVar;
        this.f19945aF = gwrVar;
        this.f19993bb = dsxVar;
        this.f19932S = htvVar;
        this.f19931R = cloVar;
        this.f19964aY = cwdVar;
        this.f19943aD = hkxVar2;
        this.f19925L = (hkz) hkxVar2.mo10394a();
        this.f20016w = ohbVar;
        this.f20014u = mrmVar3;
        this.f19973ah = elxVar;
        this.f20017x = mrmVar4;
        this.f19970ae = ebyVar;
        this.f19986au = heeVar2;
        this.f19984as = dfnVar;
        this.f19962aW = hybVar;
        this.f19959aT = dfoVar;
        this.f19936W = mrmVar6;
        this.f19937X = mrmVar7;
        this.f19971af = cbzVar;
        this.f19972ag = hwyVar;
        this.f20018y = mrmVar9;
        this.f19933T = ebvVar;
        this.f19920G = hysVar;
        this.f19960aU = fnaVar;
        this.f19995bd = c1058va;
        this.f19914A = dhvVar.mo6184l(dib.f11360cn);
        this.f19977al = gesVar;
        this.f19944aE = mrmVar8;
        jvbVar.m13537d(fmeVar);
        jvbVar.m13537d(fmeVar.mo3830a(new dsu(this, 17), jvdVar));
        fmeVar.f22546b.execute(new ewo(fmeVar, ((euh) fmhVar).f20104b, 15));
        this.f19955aP = jpd.m13426g(true, 3000, null, null, resources.getString(C0100R.string.gcam_HDR_plus_enhanced_processing), context, false, -1, 10);
        this.f19940aA = new ety(this, iktVar, dbrVar);
        this.f19980ao = iktVar;
        etz etzVar = new etz(this, fcpVar, fmhVar, iktVar, igbVar, atomicBoolean);
        this.f20012s = etzVar;
        this.f20003j = new eua(this);
        this.f20001h = new eot(etzVar);
        jvbVar.m13537d(hnwVar.mo10519f(ehiVar));
        jvbVar.m13537d(hnwVar.mo10519f(hoaVar));
        jvbVar.m13537d(hnwVar.mo10519f(guaVar));
        jvh.m13561i(npsVar, new cdc(this, ojuVar, 6));
    }

    /* JADX INFO: renamed from: H */
    private final void m7889H() {
        this.f19997d.execute(new esc(this, 10));
    }

    /* JADX INFO: renamed from: I */
    private final void m7890I() {
        fmj fmjVar;
        fuc fucVar;
        lku.m15613H(this.f5764a);
        fvs fvsVar = this.f19987av;
        kmg kmgVarM6439b = this.f19942aC.m6439b(this.f19963aX, this.f19968ac, this.f20007n.mo5895d());
        kmgVarM6439b.getClass();
        this.f20004k.mo11773x();
        fmj fmjVarM8836a = fvsVar.m8836a(this.f19994bc.m9743h(kmgVarM6439b, ikw.PHOTO));
        this.f19957aR = true;
        lku.m15613H(this.f5764a);
        fmj fmjVar2 = this.f19946aG;
        if ((fmjVar2 == null || !fmjVar2.m8586a(fmjVarM8836a) || this.f19922I == null) && ((fmjVar = this.f19946aG) == null || !fmjVar.m8586a(fmjVarM8836a) || this.f19935V.mo8995b() || ((fucVar = this.f19923J) != null && fucVar.mo8573g()))) {
            this.f20000g.mo13961e("CaptureModule#startCamera");
            this.f19915B.mo3693g().mo3713c();
            this.f20008o.m11110a();
            if (this.f20018y.mo16813g()) {
                ((cld) this.f20018y.mo16809c()).mo3904h();
            }
            this.f19935V.close();
            this.f19935V = new jvb();
            flz flzVar = fmjVarM8836a.f22561a;
            this.f19921H = flzVar;
            this.f19981ap = this.f19963aX.m14581f(flzVar.f22529a);
            m7889H();
            this.f19981ap.getClass();
            this.f19915B.mo3693g().getClass();
            jvb jvbVar = this.f19935V;
            cjp cjpVar = new cjp();
            jvbVar.m13537d(cjpVar);
            nps npsVarM8838c = this.f19987av.m8838c(fmjVarM8836a, kxk.m14965K(this.f19950aK));
            kxk.m14975U(npsVarM8838c, new eud(this, cjpVar, jvbVar, 0), this.f19997d);
            this.f19922I = npsVarM8838c;
            this.f19946aG = fmjVarM8836a;
            this.f20000g.mo13962f();
        } else {
            m7889H();
            m7901z();
            this.f19915B.mo3693g().mo3724n();
            this.f19915B.mo3693g().mo3720j(true);
        }
        this.f20004k.mo11768s();
        if (this.f19956aQ) {
            return;
        }
        if (cds.m3511j(this.f19992ba.m2611e()) || cds.m3516o(this.f19992ba.m2611e())) {
            this.f20004k.mo11721B(cds.m3516o(this.f19992ba.m2611e()));
            this.f19956aQ = true;
        }
    }

    @Override // p000.hyw
    /* JADX INFO: renamed from: A */
    public final void mo7891A(hyv hyvVar) {
        if (hyvVar.equals(hyv.READY_TO_CAPTURE)) {
            this.f19967ab.mo9113M();
            m7895E(3);
        } else {
            if (this.f19972ag.m10799h()) {
                this.f19920G.m10879b();
            }
            this.f19972ag.m10798g();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m7892B(boolean z) {
        if (this.f5764a) {
            if (!gyw.LONG_EXPOSURE.equals(this.f19978am)) {
                this.f19915B.mo3693g().mo3718h(z);
                this.f19915B.mo3693g().mo3720j(z);
            }
            if (this.f19957aR) {
                if (this.f19968ac.mo6184l(dib.f11357ck) && this.f19920G.m10885h()) {
                    this.f20002i.mo11230b().sendAccessibilityEvent(8);
                }
                this.f19957aR = false;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m7893C(boolean z) {
        if (this.f19996c.mo3831be() == gdb.ON && z) {
            this.f19973ah.mo7482d(this.f19955aP);
        } else {
            this.f19973ah.mo7485g(this.f19955aP);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m7894D() {
        dhv dhvVar = this.f19968ac;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6175c();
        this.f19915B.mo3693g().mo3721k();
    }

    /* JADX INFO: renamed from: E */
    public final void m7895E(int i) {
        this.f19918E.m6560b();
        if (this.f19919F.isTouchExplorationEnabled()) {
            this.f19919F.interrupt();
        }
        this.f19972ag.m10796e(i);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, jwn] */
    /* JADX INFO: renamed from: F */
    public final void m7896F(boolean z) {
        boolean zM7085d;
        this.f20000g.mo13961e("CaptureModule#takePictureNow");
        if (this.f19923J == null) {
            ((nbe) ((nbe) f19913b.m17252c()).mo17276G((char) 1938)).mo17290o("Not taking picture since Camera is closed.");
            this.f20000g.mo13962f();
            return;
        }
        this.f20000g.mo13961e(DNTdN.woAKlCElFj);
        this.f19990ay.mo8077a();
        fuc fucVar = this.f19923J;
        fucVar.getClass();
        if (!((Boolean) fucVar.mo8575i().f39918f.mo3831be()).booleanValue()) {
            ((nbe) ((nbe) f19913b.m17252c()).mo17276G((char) 1937)).mo17290o("Not taking picture since the Camera is not ready to take a picture.");
            this.f20000g.mo13962f();
            this.f20000g.mo13962f();
            return;
        }
        this.f20000g.mo13963g("intervalLogger#onCapture");
        jay jayVar = this.f19965aZ;
        if (jayVar.f33635a == 0) {
            jayVar.f33635a = SystemClock.elapsedRealtime();
        } else {
            SystemClock.elapsedRealtime();
            jayVar.f33635a = SystemClock.elapsedRealtime();
        }
        this.f20000g.mo13963g("updateUi");
        m7892B(false);
        this.f19966aa.mo3415bf(true);
        this.f19917D.m8581b();
        this.f20013t.mo11013l(false);
        this.f19915B.mo3693g().mo3715e();
        if (this.f20018y.mo16813g()) {
            this.f20000g.mo13963g("lockAutoNsSignal");
            ((cld) this.f20018y.mo16809c()).mo3903g();
        }
        if (((Boolean) this.f19970ae.f13316b.mo3831be()).booleanValue() && !z && this.f20018y.mo16813g()) {
            this.f20000g.mo13963g("autoNs#startCapture");
            fuc fucVar2 = this.f19923J;
            fucVar2.getClass();
            Duration duration = (Duration) fucVar2.mo8575i().f39913a.mo3831be();
            duration.toMillis();
            zM7085d = this.f19933T.m7085d(duration);
            ((cld) this.f20018y.mo16809c()).mo3906j(zM7085d, duration);
            this.f19978am = gyw.LONG_EXPOSURE;
        } else {
            this.f20004k.mo11763n();
            zM7085d = false;
        }
        fml fmlVar = new fml(new eue(this, zM7085d));
        this.f19930Q.m13537d(fmlVar);
        if (!z) {
            this.f20000g.mo13963g("indicator#show");
            this.f19962aW.m10865a();
        }
        if (this.f19914A && !z) {
            fuc fucVar3 = this.f19923J;
            fucVar3.getClass();
            if (!gcy.ON.equals((gcy) ((jxc) fucVar3.mo8575i().f39919g).mo3831be()) && !((Boolean) this.f19970ae.f13316b.mo3831be()).booleanValue()) {
                m7894D();
                this.f19916C.mo10316b(C0100R.raw.camera_shutter);
            }
        }
        this.f20000g.mo13963g("takePictureNow");
        fmy fmyVar = this.f20010q;
        fuc fucVar4 = this.f19923J;
        fucVar4.getClass();
        flz flzVar = this.f19921H;
        flzVar.getClass();
        nps npsVarMo8590c = fmyVar.mo8590c(fucVar4, flzVar, fmlVar, this.f19981ap, this.f19928O, z, this.f19925L);
        this.f20000g.mo13962f();
        npsVarMo8590c.mo2282d(new bnp(this, z, 9), this.f19997d);
        this.f19925L.m10428c();
        this.f19925L.m10429d();
        this.f19928O = false;
        this.f19925L = (hkz) this.f19943aD.mo10394a();
        this.f20000g.mo13962f();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m7897G() {
        return this.f19934U.mo3831be().booleanValue() && !this.f19972ag.m10799h();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
        if (this.f19947aH) {
            return;
        }
        this.f19947aH = true;
        this.f20000g.mo13961e("CaptureModule#initialize");
        this.f19930Q.m13537d(this.f19949aJ.mo10733a(new eub(this)));
        if (this.f19936W.mo16813g()) {
            ((hmu) this.f19936W.mo16809c()).m10473b();
        }
        this.f20000g.mo13962f();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        this.f19978am = null;
        this.f20011r.mo7902c();
        this.f19972ag.m10798g();
        this.f19919F.removeTouchExplorationStateChangeListener(this.f19954aO);
        if (this.f19931R.m3926e()) {
            this.f19932S.mo10751b();
        }
        this.f19941aB.m11117b();
        if (this.f19968ac.mo6184l(dib.f11357ck)) {
            this.f19920G.m10884g(this);
            this.f19920G.m10883f();
        }
        if (this.f19944aE.mo16813g()) {
            ((eac) this.f19944aE.mo16809c()).m6992b();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bz */
    public final mrm mo3772bz() {
        return mrm.m16828h(this.f19923J);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: c */
    public final String mo3773c() {
        return this.f19988aw.getString(C0100R.string.photo_accessibility_peek);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f19930Q.close();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: d */
    public final void mo3774d(bnq bnqVar) {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: e */
    public final void mo3775e(Configuration configuration) {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: k */
    public final void mo3777k() {
        this.f19972ag.m10798g();
        if (this.f5764a) {
            this.f19915B.mo3693g().mo3720j(false);
            m7890I();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        this.f19966aa.mo3415bf(false);
        if (this.f19923J != null && cds.m3518q(this.f19992ba)) {
            if ((this.f19981ap.mo14558k() == kmq.f36557a) != cds.m3511j(this.f19992ba.m2611e())) {
                mo3777k();
            } else {
                m7898w();
            }
        }
        fuc fucVar = this.f19923J;
        if (fucVar != null && fucVar.mo8573g()) {
            mo3777k();
        }
        this.f19985at.m10149h();
        this.f19985at.m10148g();
        this.f20006m.m10837d(true);
        if (this.f19968ac.mo6184l(dib.f11357ck)) {
            if (((gzp) this.f19927N.mo3831be()).equals(gzp.OFF)) {
                this.f19998e.execute(new esc(this, 16));
            }
            this.f19920G.m10880c(this);
        }
        if (this.f19944aE.mo16813g()) {
            ((eac) this.f19944aE.mo16809c()).m6991a();
        }
        this.f19919F.addTouchExplorationStateChangeListener(this.f19954aO);
        this.f19967ab.mo9124j();
        jvh.m13561i(this.f19926M, new cis(this, 11));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
        jvb jvbVar = new jvb();
        this.f19948aI = jvbVar;
        jvbVar.m13537d(this.f20002i.mo11233e(this.f20003j));
        this.f19948aI.m13537d(this.f19927N.mo3830a(new dsu(this, 16), this.f19997d));
        this.f19960aU.m8602b(this, ikw.PHOTO, this.f19948aI);
        this.f19991az.addListener(this.f19940aA);
        m7892B(true);
        jvb jvbVar2 = this.f19948aI;
        cwd cwdVar = this.f19964aY;
        AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this);
        synchronized (cwdVar.f9866a) {
            cwdVar.f9866a.add(ambientController);
        }
        jvbVar2.m13537d(new cic(cwdVar, ambientController, 4, (byte[]) null, (byte[]) null, (byte[]) null));
        this.f19995bd.m19463A(this.f20007n.mo5895d().equals(kmq.f36557a) ? new esc(this, 13) : new esc(this, 14), this.f19948aI);
        if (this.f20018y.mo16813g()) {
            ((cld) this.f20018y.mo16809c()).mo3901e(ikw.PHOTO, this.f19948aI);
        }
        this.f20000g.mo13961e("CaptureModule#resume");
        this.f19972ag.m10795d(this, this.f19953aN, this.f19948aI);
        m7890I();
        this.f20000g.mo13961e("CaptureModule#ui-resume");
        this.f19958aS.m8281b();
        this.f19982aq.m9704b();
        this.f19917D.m8583d();
        this.f20000g.mo13962f();
        this.f19970ae.m7097h(this.f19968ac.mo6184l(did.f11424ac));
        this.f20000g.mo13961e("Setup CameraAppUI");
        dnr dnrVar = ((ciq) this.f19915B.mo3693g()).f5818C;
        this.f20000g.mo13962f();
        this.f19915B.mo3704r(this.f19961aV, true);
        gwr gwrVar = this.f19945aF;
        gwrVar.f26628e.execute(new gpn(gwrVar, 15));
        this.f19951aL.m7597a(this.f19952aM);
        this.f19916C.mo10319e();
        this.f20000g.mo13962f();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
        this.f20000g.mo13961e("CaptureModule#stop");
        this.f19978am = null;
        this.f19948aI.close();
        this.f19970ae.m7097h(false);
        this.f19991az.removeListener(this.f19940aA);
        if (((Boolean) this.f19966aa.f34942d).booleanValue()) {
            this.f19966aa.mo3415bf(false);
            m7899x(true);
        }
        this.f19982aq.m9703a();
        this.f19958aS.m8280a();
        this.f19928O = false;
        this.f19972ag.m10798g();
        gwr gwrVar = this.f19945aF;
        gwrVar.f26628e.execute(new gpn(gwrVar, 14));
        this.f20000g.mo13961e("CaptureModule#closeCamera");
        nps npsVar = this.f19922I;
        if (npsVar != null) {
            npsVar.cancel(false);
            this.f19922I = null;
        }
        this.f19923J = null;
        this.f19987av.m8839d();
        this.f19934U.m8577d(jwr.m13637g(false));
        this.f20000g.mo13961e("CameraLifetime#close");
        this.f19935V.close();
        this.f20000g.mo13962f();
        this.f20008o.m11110a();
        this.f20000g.mo13962f();
        dnr dnrVar = ((ciq) this.f19915B.mo3693g()).f5818C;
        this.f19916C.mo10315a();
        this.f19951aL.m7598b(this.f19952aM);
        this.f20000g.mo13962f();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: r */
    public final void mo3783r() {
        this.f19918E.m6560b();
        if (this.f19919F.isTouchExplorationEnabled()) {
            this.f19919F.interrupt();
        }
        m7896F(false);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: s */
    public final void mo3784s(Runnable runnable) {
        runnable.run();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    public final boolean mo3785t() {
        if (this.f19972ag.m10798g()) {
            return true;
        }
        if (this.f19931R.m3926e()) {
            this.f19932S.mo10751b();
            return true;
        }
        if (!this.f19980ao.f31381h) {
            return false;
        }
        this.f20011r.mo7605b(4);
        this.f19997d.execute(new esc(this, 9));
        return true;
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: u */
    public final boolean mo3786u() {
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m7898w() {
        if (cds.m3518q(this.f19992ba)) {
            this.f19993bb.m6703r();
            m7895E(cds.m3503b(this.f19992ba.m2611e()));
            cds.m3507f(this.f19992ba.m2611e());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m7899x(boolean z) {
        this.f19917D.m8580a();
        this.f19959aT.m6078b();
        if (!this.f19931R.m3926e()) {
            this.f19915B.mo3693g().mo3723m();
        }
        m7893C(false);
        if (this.f20018y.mo16813g()) {
            ((cld) this.f20018y.mo16809c()).mo3898b(z);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m7900y(final boolean z, final kmq kmqVar) {
        if (this.f5764a) {
            final kcc kccVarMo13957a = this.f20000g.mo13957a("CaptureModule#changeCamera");
            final hlc hlcVar = (hlc) this.f19989ax.mo10394a();
            final boolean zM5900i = this.f20007n.m5900i();
            dnf dnfVar = this.f19924K;
            if (dnfVar != null) {
                boolean z2 = !zM5900i;
                DebugCanvasView debugCanvasView = dnfVar.f12085b;
                if (debugCanvasView == null) {
                    ((nbe) ((nbe) dnf.f12084a.m17252c()).mo17276G((char) 1013)).mo17290o("UI view not yet initialized");
                } else {
                    debugCanvasView.f12088b.m13967b(z2);
                }
            }
            if (this.f19968ac.mo6184l(dib.f11357ck)) {
                this.f19920G.m10883f();
                if (((gzp) this.f19927N.mo3831be()).equals(gzp.OFF)) {
                    this.f19998e.execute(new esc(this, 12));
                }
            }
            this.f20007n.mo5895d();
            mo3777k();
            if (this.f19968ac.mo6184l(dib.f11285as)) {
                this.f20004k.mo11721B(false);
            }
            lku.m15661o(this.f19935V, KMNlNMe.sIjCMHJeFtin, new Object[0]);
            nps npsVar = this.f19922I;
            if (npsVar != null) {
                jvh.m13562j(nod.m17554j(npsVar, etv.f19876a, not.INSTANCE), new kao() { // from class: etw
                    @Override // p000.kao
                    /* JADX INFO: renamed from: a */
                    public final void mo3483a(Object obj) {
                        euf eufVar = this.f19885a;
                        boolean z3 = z;
                        hlc hlcVar2 = hlcVar;
                        kmq kmqVar2 = kmqVar;
                        boolean z4 = zM5900i;
                        kcc kccVar = kccVarMo13957a;
                        if (z3) {
                            eufVar.f19984as.m6066a(eufVar.f20007n.mo5895d() == kmq.BACK ? kmq.f36557a : kmq.BACK, 2, 3);
                        }
                        hlcVar2.m10437h(hkr.CAMERA_CHANGE_END);
                        eufVar.f19939Z.mo8150Y(kmqVar2 == kmq.BACK ? 3 : 2, z4 ? 3 : 2, hlcVar2.f28241m, hlcVar2.m10436g(hkr.CAMERA_CHANGE_END));
                        hlcVar2.close();
                        if (z4) {
                            eufVar.f20009p.m11113a();
                        } else {
                            idg idgVar = eufVar.f20009p;
                            jwn jwnVar = idgVar.f30433a;
                            if (idgVar.f30434b != null && jwnVar.mo3831be() != gzl.OFF && !idgVar.f30434b.mo10048o("face_retouching_hint")) {
                                idgVar.f30443k = jpd.m13426g(false, 6000, null, new ide(idgVar, 2), idgVar.f30433a.mo3831be() == gzl.ON_LIGHT ? idgVar.f30438f : idgVar.f30439g, idgVar.f30436d, false, -1, 8);
                                idgVar.f30435c.mo7482d(idgVar.f30443k);
                                idgVar.f30445m.m3528h().m13537d(idgVar.f30433a.mo3830a(new gmb(idgVar, (gzl) idgVar.f30433a.mo3831be(), 14), idgVar.f30437e));
                            }
                        }
                        kccVar.mo13952a();
                    }
                }, this.f19997d);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m7901z() {
        this.f19915B.mo3693g().mo3725o();
    }
}
