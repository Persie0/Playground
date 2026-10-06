package p000;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.p014ui.views.ViewfinderCover;
import com.google.android.apps.camera.p014ui.wirers.PreviewOverlay;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class esl implements chk, fbp, fbd, fbg, fbn, fbl, fbj, fbo, ezs, ezx, ezt, fae, icd, ice, gxk {

    /* JADX INFO: renamed from: a */
    public static final nbh f15318a = nbh.m17259h("com/google/android/apps/camera/legacy/app/app/CameraActivityControllerImpl");

    /* JADX INFO: renamed from: A */
    public hye f15319A;

    /* JADX INFO: renamed from: B */
    public Parcelable f15320B;

    /* JADX INFO: renamed from: C */
    public Serializable f15321C;

    /* JADX INFO: renamed from: D */
    public boolean f15322D;

    /* JADX INFO: renamed from: E */
    public boolean f15323E;

    /* JADX INFO: renamed from: F */
    public boolean f15324F;

    /* JADX INFO: renamed from: G */
    public kba f15325G;

    /* JADX INFO: renamed from: H */
    public final boh f15326H;

    /* JADX INFO: renamed from: I */
    public final icf f15327I;

    /* JADX INFO: renamed from: J */
    public final jww f15328J;

    /* JADX INFO: renamed from: K */
    public final jww f15329K;

    /* JADX INFO: renamed from: L */
    public final jww f15330L;

    /* JADX INFO: renamed from: M */
    public final jww f15331M;

    /* JADX INFO: renamed from: N */
    public final oju f15332N;

    /* JADX INFO: renamed from: O */
    public final ohb f15333O;

    /* JADX INFO: renamed from: P */
    public final iuj f15334P;

    /* JADX INFO: renamed from: Q */
    public final ViewfinderCover f15335Q;

    /* JADX INFO: renamed from: R */
    public final ohb f15336R;

    /* JADX INFO: renamed from: S */
    public final nqf f15337S;

    /* JADX INFO: renamed from: T */
    public final mrm f15338T;

    /* JADX INFO: renamed from: U */
    public final cdu f15339U;

    /* JADX INFO: renamed from: V */
    private final cej f15340V;

    /* JADX INFO: renamed from: W */
    private final hba f15341W;

    /* JADX INFO: renamed from: X */
    private final nps f15342X;

    /* JADX INFO: renamed from: Y */
    private final hzu f15343Y;

    /* JADX INFO: renamed from: Z */
    private final ContentResolver f15344Z;

    /* JADX INFO: renamed from: aD */
    private boolean f15348aD;

    /* JADX INFO: renamed from: aE */
    private boolean f15349aE;

    /* JADX INFO: renamed from: aG */
    private final dbr f15351aG;

    /* JADX INFO: renamed from: aH */
    private final iak f15352aH;

    /* JADX INFO: renamed from: aI */
    private final jww f15353aI;

    /* JADX INFO: renamed from: aJ */
    private final hmw f15354aJ;

    /* JADX INFO: renamed from: aK */
    private final mrm f15355aK;

    /* JADX INFO: renamed from: aL */
    private final clo f15356aL;

    /* JADX INFO: renamed from: aM */
    private final jwn f15357aM;

    /* JADX INFO: renamed from: aN */
    private final jww f15358aN;

    /* JADX INFO: renamed from: aR */
    private final bog f15362aR;

    /* JADX INFO: renamed from: aS */
    private final ilo f15363aS;

    /* JADX INFO: renamed from: aT */
    private final kms f15364aT;

    /* JADX INFO: renamed from: aU */
    private final ihk f15365aU;

    /* JADX INFO: renamed from: aV */
    private final msa f15366aV;

    /* JADX INFO: renamed from: aW */
    private final bko f15367aW;

    /* JADX INFO: renamed from: aX */
    private final kon f15368aX;

    /* JADX INFO: renamed from: aY */
    private final glk f15369aY;

    /* JADX INFO: renamed from: aZ */
    private final cwd f15370aZ;

    /* JADX INFO: renamed from: aa */
    private final Context f15371aa;

    /* JADX INFO: renamed from: ab */
    private final jvd f15372ab;

    /* JADX INFO: renamed from: ac */
    private final Executor f15373ac;

    /* JADX INFO: renamed from: ad */
    private final hkx f15374ad;

    /* JADX INFO: renamed from: ae */
    private final fca f15375ae;

    /* JADX INFO: renamed from: af */
    private final ggm f15376af;

    /* JADX INFO: renamed from: ag */
    private final had f15377ag;

    /* JADX INFO: renamed from: ah */
    private final hai f15378ah;

    /* JADX INFO: renamed from: ai */
    private final Window f15379ai;

    /* JADX INFO: renamed from: aj */
    private final fba f15380aj;

    /* JADX INFO: renamed from: ak */
    private final gvo f15381ak;

    /* JADX INFO: renamed from: al */
    private final oju f15382al;

    /* JADX INFO: renamed from: am */
    private final boolean f15383am;

    /* JADX INFO: renamed from: an */
    private final ohb f15384an;

    /* JADX INFO: renamed from: ao */
    private dju f15385ao;

    /* JADX INFO: renamed from: ap */
    private dju f15386ap;

    /* JADX INFO: renamed from: aq */
    private mrm f15387aq;

    /* JADX INFO: renamed from: ar */
    private chv f15388ar;

    /* JADX INFO: renamed from: as */
    private final huf f15389as;

    /* JADX INFO: renamed from: at */
    private final huu f15390at;

    /* JADX INFO: renamed from: au */
    private final eoq f15391au;

    /* JADX INFO: renamed from: av */
    private final Runnable f15392av;

    /* JADX INFO: renamed from: aw */
    private final jwn f15393aw;

    /* JADX INFO: renamed from: ax */
    private final jww f15394ax;

    /* JADX INFO: renamed from: ay */
    private final hbg f15395ay;

    /* JADX INFO: renamed from: az */
    private ikw f15396az;

    /* JADX INFO: renamed from: b */
    public final BottomBarController f15397b;

    /* JADX INFO: renamed from: ba */
    private final bkn f15398ba;

    /* JADX INFO: renamed from: c */
    public final Context f15399c;

    /* JADX INFO: renamed from: d */
    public final doe f15400d;

    /* JADX INFO: renamed from: e */
    public final Handler f15401e;

    /* JADX INFO: renamed from: f */
    public final CameraActivityTiming f15402f;

    /* JADX INFO: renamed from: g */
    public final kcu f15403g;

    /* JADX INFO: renamed from: h */
    public final iht f15404h;

    /* JADX INFO: renamed from: i */
    public final Resources f15405i;

    /* JADX INFO: renamed from: j */
    public final hah f15406j;

    /* JADX INFO: renamed from: k */
    public final kbz f15407k;

    /* JADX INFO: renamed from: l */
    public final oju f15408l;

    /* JADX INFO: renamed from: m */
    public final dhv f15409m;

    /* JADX INFO: renamed from: n */
    public final iid f15410n;

    /* JADX INFO: renamed from: o */
    public chm f15411o;

    /* JADX INFO: renamed from: p */
    public chw f15412p;

    /* JADX INFO: renamed from: q */
    public final mrm f15413q;

    /* JADX INFO: renamed from: r */
    public final ohb f15414r;

    /* JADX INFO: renamed from: t */
    public final fcp f15416t;

    /* JADX INFO: renamed from: u */
    public final gfa f15417u;

    /* JADX INFO: renamed from: y */
    public boolean f15421y;

    /* JADX INFO: renamed from: z */
    public boolean f15422z;

    /* JADX INFO: renamed from: s */
    public hku f15415s = new hku(new ksa(), new kbx());

    /* JADX INFO: renamed from: v */
    public boolean f15418v = false;

    /* JADX INFO: renamed from: aA */
    private boolean f15345aA = false;

    /* JADX INFO: renamed from: w */
    public boolean f15419w = false;

    /* JADX INFO: renamed from: x */
    public boolean f15420x = false;

    /* JADX INFO: renamed from: aB */
    private boolean f15346aB = true;

    /* JADX INFO: renamed from: aC */
    private boolean f15347aC = false;

    /* JADX INFO: renamed from: aF */
    private boolean f15350aF = false;

    /* JADX INFO: renamed from: aO */
    private final eop f15359aO = new esf(this);

    /* JADX INFO: renamed from: aP */
    private final hgp f15360aP = new hft(this, 1);

    /* JADX INFO: renamed from: aQ */
    private final chs f15361aQ = new esi(this, 0);

    public esl(Context context, Context context2, Resources resources, Window window, ContentResolver contentResolver, Handler handler, bko bkoVar, fba fbaVar, ActivityC0157ei activityC0157ei, cdu cduVar, cej cejVar, jvd jvdVar, Executor executor, bkn bknVar, boolean z, ggm ggmVar, kms kmsVar, nps npsVar, kcu kcuVar, fca fcaVar, had hadVar, hah hahVar, hai haiVar, hzu hzuVar, iht ihtVar, iid iidVar, ohb ohbVar, hba hbaVar, doe doeVar, gvo gvoVar, oju ojuVar, cwd cwdVar, kbz kbzVar, hkx hkxVar, CameraActivityTiming cameraActivityTiming, oju ojuVar2, huf hufVar, huu huuVar, glk glkVar, ihk ihkVar, Intent intent, BottomBarController bottomBarController, dhv dhvVar, eoq eoqVar, fcp fcpVar, icf icfVar, gfa gfaVar, Runnable runnable, jww jwwVar, jww jwwVar2, jww jwwVar3, jww jwwVar4, oju ojuVar3, ohb ohbVar2, dbr dbrVar, iuj iujVar, iak iakVar, jwn jwnVar, jww jwwVar5, mrm mrmVar, ohb ohbVar3, ohb ohbVar4, hbg hbgVar, nqf nqfVar, jww jwwVar6, ilo iloVar, mrm mrmVar2, hmw hmwVar, mrm mrmVar3, msa msaVar, clo cloVar, jwn jwnVar2, jww jwwVar7, kon konVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        esj esjVar = new esj(this, 0);
        this.f15362aR = esjVar;
        this.f15399c = context;
        this.f15371aa = context2;
        this.f15405i = resources;
        this.f15379ai = window;
        this.f15397b = bottomBarController;
        this.f15344Z = contentResolver;
        jvdVar.getClass();
        this.f15372ab = jvdVar;
        executor.getClass();
        this.f15373ac = executor;
        this.f15401e = handler;
        handler.getLooper().getClass();
        this.f15367aW = bkoVar;
        bknVar.getClass();
        this.f15398ba = bknVar;
        this.f15339U = cduVar;
        this.f15380aj = fbaVar;
        cejVar.getClass();
        this.f15340V = cejVar;
        this.f15383am = z;
        ggmVar.getClass();
        this.f15376af = ggmVar;
        kmsVar.getClass();
        this.f15364aT = kmsVar;
        this.f15342X = npsVar;
        kcuVar.getClass();
        this.f15403g = kcuVar;
        fcaVar.getClass();
        this.f15375ae = fcaVar;
        hadVar.getClass();
        this.f15377ag = hadVar;
        this.f15406j = hahVar;
        this.f15378ah = haiVar;
        hzuVar.getClass();
        this.f15343Y = hzuVar;
        ihtVar.getClass();
        this.f15404h = ihtVar;
        hbaVar.getClass();
        this.f15341W = hbaVar;
        doeVar.getClass();
        this.f15400d = doeVar;
        this.f15410n = iidVar;
        this.f15384an = ohbVar;
        hufVar.getClass();
        this.f15389as = hufVar;
        huuVar.getClass();
        this.f15390at = huuVar;
        glkVar.getClass();
        this.f15369aY = glkVar;
        this.f15365aU = ihkVar;
        gvoVar.getClass();
        this.f15381ak = gvoVar;
        ojuVar.getClass();
        this.f15382al = ojuVar;
        kbzVar.getClass();
        this.f15407k = kbzVar;
        this.f15374ad = hkxVar;
        cwdVar.getClass();
        this.f15370aZ = cwdVar;
        this.f15402f = cameraActivityTiming;
        ojuVar2.getClass();
        this.f15408l = ojuVar2;
        this.f15409m = dhvVar;
        eoqVar.getClass();
        this.f15391au = eoqVar;
        this.f15416t = fcpVar;
        this.f15327I = icfVar;
        this.f15417u = gfaVar;
        this.f15392av = runnable;
        this.f15328J = jwwVar;
        this.f15330L = jwwVar2;
        this.f15329K = jwwVar3;
        this.f15331M = jwwVar4;
        this.f15332N = ojuVar3;
        this.f15333O = ohbVar2;
        this.f15351aG = dbrVar;
        this.f15334P = iujVar;
        this.f15352aH = iakVar;
        this.f15335Q = iidVar.f31068e;
        this.f15393aw = jwnVar;
        this.f15394ax = jwwVar5;
        this.f15413q = mrmVar;
        this.f15414r = ohbVar3;
        this.f15336R = ohbVar4;
        this.f15395ay = hbgVar;
        this.f15337S = nqfVar;
        this.f15353aI = jwwVar6;
        this.f15363aS = iloVar;
        this.f15338T = mrmVar2;
        this.f15354aJ = hmwVar;
        this.f15355aK = mrmVar3;
        this.f15366aV = msaVar;
        this.f15356aL = cloVar;
        this.f15357aM = jwnVar2;
        this.f15358aN = jwwVar7;
        this.f15368aX = konVar;
        boolean zM3517p = cds.m3517p(bkoVar);
        boolean z2 = (!intent.getBooleanExtra("open_socialshare", false) || z || zM3517p) ? false : true;
        this.f15322D = z2;
        if (z2) {
            Parcelable parcelableExtra = intent.getParcelableExtra("filmstrip_item_data");
            parcelableExtra.getClass();
            this.f15320B = parcelableExtra;
            Serializable serializableExtra = intent.getSerializableExtra("filmstrip_item_type");
            serializableExtra.getClass();
            this.f15321C = serializableExtra;
        }
        this.f15323E = (!intent.getBooleanExtra("open_filmstrip", false) || z || zM3517p) ? false : true;
        this.f15348aD = (!intent.getBooleanExtra("open_empty_vault", false) || z || zM3517p) ? false : true;
        this.f15349aE = intent.getBooleanExtra(BEeWZPor.oeSEHuPeIyqZEfg, false);
        jwwVar6.mo3830a(new dsu(this, 13), jvdVar);
        new WeakReference(activityC0157ei);
        this.f15326H = new boh(esjVar, handler);
        icfVar.mo11010i(this);
        icfVar.mo11012k(this);
    }

    /* JADX INFO: renamed from: F */
    private final int m7765F() {
        return this.f15420x ? 2 : 0;
    }

    /* JADX INFO: renamed from: G */
    private final void m7766G(boolean z) {
        chg chgVar = (chg) jvh.m13560h(this.f15342X);
        if (chgVar == null) {
            return;
        }
        synchronized (chgVar) {
            kmg kmgVar = chgVar.f5733e;
            if (kmgVar != null) {
                chgVar.m3675g(kmgVar.m14576a());
            }
        }
        chgVar.m3681m(z);
        chgVar.f5732d = null;
    }

    /* JADX INFO: renamed from: H */
    private final void m7767H(final ikw ikwVar, Executor executor, Executor executor2) {
        if (this.f15345aA || this.f15396az != ikwVar) {
            this.f15345aA = false;
            this.f15407k.mo13961e(PMZiHihxLGEy.qOXXvFm.concat(String.valueOf(String.valueOf(ikwVar))));
            if (!this.f15402f.m4306d()) {
                this.f15402f.m4305c();
            }
            hku hkuVar = (hku) this.f15374ad.mo10394a();
            this.f15415s = hkuVar;
            ikwVar.name();
            jeu jeuVar = hkuVar.f28243o;
            chw chwVar = this.f15412p;
            ikw ikwVar2 = ikw.MOTION_BLUR;
            chwVar.m3776j();
            chwVar.m3782q();
            ciq ciqVar = (ciq) this.f15411o;
            FrameLayout frameLayout = ciqVar.f5841g;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            if (ikwVar != ikwVar2) {
                ciqVar.mo3720j(true);
            } else {
                ciqVar.f5843i.mo11198F();
            }
            ciqVar.f5849o = null;
            PreviewOverlay previewOverlay = ciqVar.f5848n;
            previewOverlay.f7297a = null;
            previewOverlay.f7298b = null;
            final nqf nqfVarM17621g = nqf.m17621g();
            if (m7775P(this.f15396az) || !m7775P(ikwVar)) {
                nqfVarM17621g.mo14894e(null);
            } else {
                executor.execute(new Runnable() { // from class: ese
                    @Override // java.lang.Runnable
                    public final void run() {
                        esl eslVar = this.f15305a;
                        ikw ikwVar3 = ikwVar;
                        nqf nqfVar = nqfVarM17621g;
                        eslVar.f15407k.mo13961e("doSelectMode " + String.valueOf(ikwVar3) + " disconnectSync");
                        eslVar.f15403g.mo13985b();
                        eslVar.f15407k.mo13962f();
                        nqfVar.mo14894e(null);
                    }
                });
            }
            kxk.m14975U(nqfVarM17621g, new cou(this, ikwVar, 5), executor2);
            this.f15407k.mo13962f();
        }
    }

    /* JADX INFO: renamed from: I */
    private final void m7768I(int i, Intent intent) {
        bko bkoVar = this.f15367aW;
        intent.getClass();
        ((Activity) bkoVar.f3652a).setResult(i, intent);
        mo3707u("CameraActivityController: Intent completed with a valid result. Closing activity.");
    }

    /* JADX INFO: renamed from: J */
    private final void m7769J() {
        this.f15407k.mo13961e("resetSettingsOnModeChange");
        this.f15366aV.m16854i();
        this.f15354aJ.m10478c();
        this.f15407k.mo13962f();
    }

    /* JADX INFO: renamed from: K */
    private final void m7770K() {
        this.f15407k.mo13961e("resetStartupSettingsForAllModules");
        dbr dbrVar = this.f15351aG;
        dbrVar.m5898g(dbrVar.f10418a);
        this.f15394ax.mo3415bf(gzp.f26957e);
        this.f15392av.run();
        this.f15356aL.f6150d = false;
        this.f15354aJ.m10478c();
        this.f15366aV.m16854i();
        if (this.f15338T.mo16813g()) {
        }
        if (this.f15355aK.mo16813g()) {
            ((hmu) this.f15355aK.mo16809c()).m10474c();
        }
        if (((Boolean) this.f15406j.mo10031c(gzy.f27036at)).booleanValue()) {
            this.f15352aH.m10989f(false);
            ((htf) this.f15408l.get()).mo10740h();
        }
        this.f15407k.mo13962f();
    }

    /* JADX INFO: renamed from: L */
    private final void m7771L(ikw ikwVar) {
        hnp hnpVar = hnp.OFF;
        ikw ikwVar2 = ikw.UNINITIALIZED;
        switch (ikwVar.ordinal()) {
            case 1:
                this.f15390at.mo10760k();
                break;
            case 2:
                this.f15390at.mo10765p();
                break;
            case 3:
                this.f15390at.mo10759j();
                break;
            case 4:
                this.f15390at.mo10755b();
                break;
            case 5:
                this.f15390at.mo10763n();
                break;
            case 6:
                this.f15390at.mo10761l();
                break;
            case 11:
                this.f15390at.mo10758i();
                break;
            case 12:
                this.f15390at.mo10756c();
                break;
            case 13:
                this.f15390at.mo10764o();
                break;
            case 15:
                this.f15390at.mo10757d();
                break;
            case 17:
                this.f15390at.mo10762m();
                break;
            case 19:
                this.f15390at.mo10766q();
                break;
        }
    }

    /* JADX INFO: renamed from: M */
    private final void m7772M(int i) {
        if (i == 2) {
            ((ciq) this.f15411o).f5837c.setVisibility(4);
        } else {
            ((ciq) this.f15411o).f5837c.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: N */
    private final boolean m7773N() {
        return cds.m3517p(this.f15367aW);
    }

    /* JADX INFO: renamed from: O */
    private final boolean m7774O() {
        return ((cht) this.f15414r.get()).mo3757i();
    }

    /* JADX INFO: renamed from: P */
    private final boolean m7775P(ikw ikwVar) {
        return ((gtd) this.f15398ba.m2578aa(ikwVar).f26334a).m9742g();
    }

    /* JADX INFO: renamed from: Q */
    private final synchronized void m7776Q() {
        if (this.f15387aq == null) {
            this.f15387aq = bzq.m3267g(this.f15399c);
        }
    }

    /* JADX INFO: renamed from: R */
    private final void m7777R() {
        this.f15407k.mo13961e("setupCameraFacingFromIntent");
        if (!cds.m3509h(this.f15367aW.m2611e())) {
            this.f15407k.mo13962f();
            return;
        }
        kmg kmgVarMo13858e = cds.m3511j(this.f15367aW.m2611e()) ? this.f15364aT.mo13858e(kmq.f36557a) : null;
        if (kmgVarMo13858e == null) {
            kmgVarMo13858e = this.f15364aT.mo13858e(kmq.BACK);
        }
        if (kmgVarMo13858e == null) {
            kmgVarMo13858e = this.f15364aT.mo13855b();
        }
        kmgVarMo13858e.getClass();
        this.f15351aG.m5898g(kmgVarMo13858e.f36540a.equals("0") ? kmq.BACK : kmq.f36557a);
        this.f15407k.mo13962f();
    }

    @Override // p000.gvn
    /* JADX INFO: renamed from: A */
    public final void mo7778A() {
        chw chwVar = this.f15412p;
        if (chwVar == null) {
            return;
        }
        chwVar.m3776j();
        this.f15412p.m3782q();
        this.f15412p.mo3784s(new esc(this, 0));
        this.f15324F = true;
        if (((gtd) this.f15398ba.m2578aa(this.f15396az).f26334a).m9742g()) {
            m7766G(true);
        } else {
            this.f15403g.mo13985b();
        }
    }

    @Override // p000.fae
    /* JADX INFO: renamed from: B */
    public final void mo7779B(boolean z) {
        chw chwVar = this.f15412p;
        if (chwVar != null) {
            chwVar.mo3768bT(z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: C */
    public final void m7780C(ikw ikwVar) {
        this.f15407k.mo13961e("setModuleFromMode ".concat(String.valueOf(String.valueOf(ikwVar))));
        jvd.m13538a();
        if (!mo3708v()) {
            this.f15407k.mo13962f();
            return;
        }
        gtd gtdVarM2578aa = this.f15398ba.m2578aa(ikwVar);
        if (!m7775P(ikwVar)) {
            m7766G(true);
        }
        this.f15396az = ikwVar;
        m7771L(ikwVar);
        this.f15353aI.mo3415bf(fnb.f22775a);
        jvb jvbVarM3529i = this.f15339U.m3529i();
        chw chwVar = (chw) gtdVarM2578aa.f26335b.get();
        jvbVarM3529i.m13537d(chwVar);
        this.f15412p = chwVar;
        chwVar.mo3769bU();
        this.f15415s.m10426c();
        this.f15407k.mo13962f();
        ((iqi) this.f15336R.get()).mo11606f();
        this.f15412p.mo3784s(new ekr(this, ikwVar, 16));
    }

    /* JADX INFO: renamed from: D */
    public final void m7781D() {
        if (this.f15412p == null) {
            return;
        }
        int iM7765F = m7765F();
        m7772M(iM7765F);
        this.f15412p.mo3767bS(iM7765F);
    }

    /* JADX INFO: renamed from: E */
    public final int m7782E() {
        return iku.m11411e(this.f15396az);
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: a */
    public final void mo2769a(int i) {
        ((nbe) ((nbe) f15318a.m17252c()).mo17276G(1882)).mo17291p("Camera disabled: %d", i);
        this.f15400d.mo6456d();
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: b */
    public final void mo2770b(bnq bnqVar) {
        if (this.f15422z) {
            m7766G(false);
            return;
        }
        if (!((gtd) this.f15398ba.m2578aa(this.f15396az).f26334a).m9742g()) {
            m7766G(false);
            ((nbe) ((nbe) f15318a.m17252c()).mo17276G(1886)).mo17299x("Camera opened but the module shouldn't be requesting. Close & return. mode=%s camera=%s", this.f15396az, bnqVar.mo2716a());
            return;
        }
        if (this.f15412p != null) {
            boi boiVarMo2721f = bnqVar.mo2721f();
            boiVarMo2721f.f4000q = 0;
            bnqVar.mo2728m(boiVarMo2721f);
            try {
                this.f15412p.mo3774d(bnqVar);
            } catch (RuntimeException e) {
                ((nbe) ((nbe) ((nbe) f15318a.m17251b()).mo17283h(e)).mo17276G((char) 1885)).mo17290o(PMZiHihxLGEy.SRCTg);
                this.f15400d.mo6458f(e);
            }
        }
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        this.f15344Z.unregisterContentObserver(this.f15385ao);
        this.f15344Z.unregisterContentObserver(this.f15386ap);
        ciq ciqVar = (ciq) this.f15411o;
        ciqVar.f5857w.unregisterDisplayListener(ciqVar.f5846l);
        ciqVar.f5844j.m6428a(null);
    }

    @Override // p000.ezx
    /* JADX INFO: renamed from: bD */
    public final void mo6425bD(Intent intent) {
        bko bkoVar = this.f15367aW;
        intent.getClass();
        ((Activity) bkoVar.f3652a).setIntent(intent);
        String action = intent.getAction();
        this.f15346aB = true;
        this.f15389as.mo5712g();
        jbx.m12867l(this.f15389as);
        this.f15389as.mo5711f();
        if (this.f15351aG.m5901j() != cds.m3511j(intent)) {
            this.f15345aA = true;
        }
        if (cds.m3510i(intent)) {
            this.f15378ah.mo10033e(gzy.f27050i, (Integer) this.f15409m.mo6173a(dib.f11378t).get());
        }
        ikw ikwVarM7783x = m7783x();
        if (this.f15327I.mo11020s(ikwVarM7783x)) {
            this.f15327I.mo11013l(true);
        }
        if (!ikwVarM7783x.equals(ikw.PHOTO)) {
            ikwVarM7783x.name();
            this.f15345aA = true;
            this.f15418v = false;
        }
        m7770K();
        m7777R();
        not notVar = not.INSTANCE;
        m7767H(ikwVarM7783x, notVar, notVar);
        this.f15334P.mo11721B(cds.m3516o(this.f15367aW.m2611e()));
        iuj iujVar = this.f15334P;
        if (((ite) iujVar).f32068S) {
            iujVar.mo11765p();
        } else {
            iujVar.mo11763n();
        }
        if (!this.f15422z && this.f15346aB) {
            this.f15411o.mo3719i();
            this.f15346aB = false;
        }
        ShortcutManager shortcutManager = (ShortcutManager) this.f15371aa.getSystemService(ShortcutManager.class);
        if (cds.m3511j(this.f15367aW.m2611e())) {
            shortcutManager.reportShortcutUsed("selfie");
        }
        if (action == null || !action.equals("android.media.action.VIDEO_CAMERA")) {
            return;
        }
        shortcutManager.reportShortcutUsed("video");
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        this.f15407k.mo13961e("CameraActivityController.onPause");
        this.f15421y = true;
        if (!m7774O() && !this.f15343Y.m10962c() && !this.f15383am && !this.f15412p.mo3787v()) {
            ciq ciqVar = (ciq) this.f15411o;
            icc iccVar = ciqVar.f5839e.f7292g;
            int i = iccVar.f30322r;
            if (i != -1) {
                iccVar.f30323s.mo3415bf(Integer.valueOf(i));
                iccVar.f30322r = -1;
            }
            iccVar.f30307c.cancel();
            iccVar.f30310f.cancel();
            iccVar.f30308d.cancel();
            iccVar.f30325u = ikw.UNINITIALIZED;
            iccVar.f30315k = mqu.f41450a;
            iccVar.f30303F = 1;
            iccVar.m11051h();
            ciqVar.f5839e.m4499k();
            this.f15350aF = true;
            this.f15407k.mo13964h();
        }
        this.f15391au.m7598b(this.f15359aO);
        dju djuVar = this.f15385ao;
        djuVar.f11822b = null;
        djuVar.m6261a(true);
        this.f15386ap.m6261a(true);
        this.f15412p.m3776j();
        if (((cht) this.f15414r.get()).mo3757i()) {
            ((nbe) ((nbe) f15318a.m17252c()).mo17276G((char) 1894)).mo17290o("Disconnecting the camera device because filmstrip was launched.");
            this.f15403g.mo13984a();
            this.f15324F = true;
            this.f15412p.m3782q();
        }
        if (cds.m3502a(this.f15367aW.m2611e()) >= 0.0f) {
            this.f15363aS.m11438a();
        }
        this.f15407k.mo13962f();
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f15407k.mo13961e("CameraActivityController.onResume");
        this.f15421y = false;
        this.f15391au.m7597a(this.f15359aO);
        this.f15389as.mo10382b();
        if (!m7774O()) {
            if (this.f15324F) {
                this.f15412p.m3771bW();
            }
            this.f15412p.m3779m();
        }
        this.f15324F = false;
        if (this.f15410n.f31075l.getVisibility() != 0) {
            this.f15402f.m4305c();
        }
        if (this.f15350aF) {
            chm chmVar = this.f15411o;
            ikw ikwVar = ikw.UNINITIALIZED;
            chmVar.mo3724n();
            this.f15350aF = false;
        }
        this.f15346aB = false;
        if ((this.f15386ap.f11821a || this.f15385ao.f11821a) && !this.f15339U.m3527g() && !this.f15383am) {
            this.f15388ar.mo3763g();
        }
        this.f15385ao.m6261a(false);
        this.f15386ap.m6261a(false);
        float fM3502a = cds.m3502a(this.f15367aW.m2611e());
        if (fM3502a >= 0.0f && fM3502a <= 1.0f) {
            ilo iloVar = this.f15363aS;
            if (fM3502a >= 0.0f && fM3502a <= 1.0f) {
                iloVar.m11441d(fM3502a);
                iloVar.f31455a++;
            }
        }
        this.f15407k.mo13962f();
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        int i;
        this.f15407k.mo13961e("CameraActivityController.onStart");
        this.f15422z = false;
        if (mo3708v()) {
            if (this.f15349aE && !this.f15383am) {
                this.f15352aH.m10989f(true);
                this.f15349aE = false;
            }
            if (this.f15418v) {
                this.f15327I.mo11005d(false);
                m7780C(ikw.PHOTO);
                this.f15390at.mo10754a();
                this.f15418v = false;
                this.f15327I.mo11011j(ikw.PHOTO, false);
            }
            if (this.f15346aB || !m7774O()) {
                this.f15411o.mo3719i();
            }
            dhv dhvVar = this.f15409m;
            dhx dhxVar = dib.f11240a;
            dhvVar.mo6175c();
            this.f15409m.mo6175c();
            this.f15409m.mo6178f();
            if (this.f15409m.mo6184l(dib.f11351ce) && !this.f15409m.mo6184l(dib.f11353cg) && ((Integer) this.f15409m.mo6173a(dib.f11228O).get()).intValue() == -1) {
                hnp hnpVarM10514a = hnp.m10514a(((Boolean) this.f15406j.mo10031c(gzy.f27055n)).booleanValue());
                if (!((hnp) this.f15358aN.mo3831be()).equals(hnpVarM10514a)) {
                    this.f15358aN.mo3415bf(hnpVarM10514a);
                    fcp fcpVar = this.f15416t;
                    nxl nxlVarM18137O = nly.f43704e.m18137O();
                    ikw ikwVar = ikw.UNINITIALIZED;
                    switch (hnpVarM10514a) {
                        case OFF:
                            i = 3;
                            break;
                        case AUTO:
                            i = 4;
                            break;
                        case ON:
                            i = 2;
                            break;
                        default:
                            i = 1;
                            break;
                    }
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nly nlyVar = (nly) nxlVarM18137O.f44974b;
                    nlyVar.f43707b = i - 1;
                    nlyVar.f43706a |= 1;
                    int iM11411e = iku.m11411e(this.f15396az);
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar = nxlVarM18137O.f44974b;
                    nly nlyVar2 = (nly) nxqVar;
                    nlyVar2.f43708c = iM11411e - 1;
                    nlyVar2.f43706a |= 2;
                    if (!nxqVar.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nly nlyVar3 = (nly) nxlVarM18137O.f44974b;
                    nlyVar3.f43709d = 2;
                    nlyVar3.f43706a |= 4;
                    fcpVar.mo8204x(mws.m17097l((nly) nxlVarM18137O.mo18103l()));
                }
            }
            jvb jvbVarM3530j = this.f15339U.m3530j();
            kon konVar = this.f15368aX;
            konVar.f36702b = this;
            jvbVarM3530j.m13537d(new ezc(konVar, 20, (byte[]) null, (byte[]) null, (byte[]) null));
            this.f15407k.mo13961e("CameraActivityController.start");
            m7776Q();
            this.f15407k.mo13964h();
            this.f15389as.mo10382b();
            this.f15412p.m3771bW();
            this.f15416t.mo8151Z(m7782E(), 2);
            this.f15407k.mo13964h();
            if (!this.f15383am) {
                this.f15385ao.f11822b = new gtf();
            }
            m7772M(m7765F());
            this.f15381ak.mo9795c(this);
            this.f15407k.mo13962f();
            this.f15407k.mo13962f();
        }
    }

    @Override // p000.ezs
    /* JADX INFO: renamed from: bH */
    public final boolean mo3807bH() {
        if (m7765F() == 2) {
            return false;
        }
        if (this.f15411o.mo3807bH()) {
            return true;
        }
        if (this.f15396az == ikw.PHOTO) {
            return false;
        }
        if (this.f15327I.mo11002a().contains(this.f15396az)) {
            this.f15327I.mo11007f(ikw.PHOTO);
        } else {
            this.f15411o.mo3714d();
        }
        return true;
    }

    @Override // p000.fbd
    /* JADX INFO: renamed from: bI */
    public final void mo6422bI() {
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: c */
    public final void mo2771c(int i, String str) {
        ((nbe) ((nbe) f15318a.m17252c()).mo17276G((char) 1888)).mo17293r("Camera open failure: %s", str);
        this.f15400d.mo6458f(null);
    }

    @Override // p000.bnm
    /* JADX INFO: renamed from: d */
    public final void mo2772d(int i, String str) {
        ((nbe) ((nbe) f15318a.m17252c()).mo17276G(1889)).mo17296u("Camera open already: %d,%s", i, str);
        this.f15400d.mo6460h();
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        this.f15407k.mo13961e("CameraActivityController.onStop");
        this.f15350aF = false;
        this.f15422z = true;
        this.f15407k.mo13964h();
        this.f15412p.m3782q();
        this.f15324F = false;
        this.f15407k.mo13964h();
        ((ciq) this.f15411o).m3809r();
        this.f15381ak.mo9793a();
        if (this.f15419w) {
            mo3707u("CameraActivityController: Fatal error during onPause!");
        } else {
            m7766G(true);
            this.f15407k.mo13964h();
        }
        dhv dhvVar = this.f15409m;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        this.f15409m.mo6175c();
        this.f15407k.mo13964h();
        this.f15407k.mo13962f();
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: f */
    public final Context mo3692f() {
        return this.f15399c;
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: g */
    public final chm mo3693g() {
        return this.f15411o;
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: h */
    public final chw mo3694h() {
        return this.f15412p;
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: i */
    public final fca mo3695i() {
        return this.f15375ae;
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: j */
    public final ggm mo3696j() {
        return this.f15376af;
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: k */
    public final had mo3697k() {
        return this.f15377ag;
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: l */
    public final ikw mo3698l() {
        return this.f15396az;
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: m */
    public final void mo3699m() {
        m7768I(0, new Intent());
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: n */
    public final void mo3700n(Intent intent) {
        m7768I(-1, intent);
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: o */
    public final void mo3701o(Intent intent) {
        this.f15346aB = false;
        intent.addFlags(524288);
        this.f15381ak.mo9799g(intent);
    }

    @Override // p000.chj, p000.icd
    /* JADX INFO: renamed from: p */
    public final void mo3702p(ikw ikwVar) {
        if (this.f15421y) {
            return;
        }
        this.f15407k.mo13961e("onModeSelected ".concat(String.valueOf(String.valueOf(ikwVar))));
        boolean zMo11745Z = this.f15334P.mo11745Z(this.f15396az);
        try {
            m7771L(ikwVar);
            m7767H(ikwVar, this.f15373ac, this.f15372ab);
        } finally {
            m7769J();
            this.f15334P.mo11749ad(zMo11745Z);
            this.f15407k.mo13962f();
        }
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: q */
    public final void mo3703q() {
        this.f15416t.mo8179ax();
        Context context = this.f15399c;
        dhv dhvVar = this.f15409m;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        this.f15381ak.mo9799g(new Intent(context, (Class<?>) CameraSettingsActivity.class));
    }

    @Override // p000.chj
    /* JADX INFO: renamed from: r */
    public final void mo3704r(ieq ieqVar, boolean z) {
        if (z && ieqVar.mo11148d()) {
            this.f15411o.mo3726p(2, ieqVar);
        } else {
            this.f15411o.mo3726p(3, ieqVar);
        }
    }

    @Override // p000.chk
    /* JADX INFO: renamed from: s */
    public final Context mo3705s() {
        return this.f15371aa;
    }

    @Override // p000.chk
    /* JADX INFO: renamed from: t */
    public final Window mo3706t() {
        return this.f15379ai;
    }

    @Override // p000.chk
    /* JADX INFO: renamed from: u */
    public final void mo3707u(String str) {
        this.f15340V.m3557a(str);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ikg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ikg, java.lang.Object] */
    @Override // p000.chk
    /* JADX INFO: renamed from: v */
    public final boolean mo3708v() throws Exception {
        this.f15407k.mo13961e("initialize");
        jvd.m13538a();
        if (!this.f15347aC && !this.f15339U.m3527g()) {
            int i = 1;
            this.f15347aC = true;
            this.f15407k.mo13961e("CameraActivityController#init");
            this.f15407k.mo13961e(xPAWq.RMwQ);
            this.f15407k.mo13963g("AppUpgrader#upgrade");
            this.f15341W.m10086d(this.f15377ag);
            this.f15395ay.m10083b(kmq.f36557a);
            this.f15395ay.m10083b(kmq.BACK);
            m7770K();
            m7777R();
            this.f15407k.mo13963g("UiWirer#wire");
            ihk ihkVar = this.f15365aU;
            ihkVar.f30966a.mo6340a();
            ihkVar.f30967b.mo6340a();
            this.f15407k.mo13963g("UiControllerInitializer#init");
            glk glkVar = this.f15369aY;
            ikw ikwVar = ikw.UNINITIALIZED;
            switch (((ikw) glkVar.f25503d).ordinal()) {
                case 7:
                    ((hwk) glkVar.f25500a.get()).mo5711f();
                    break;
                case 8:
                    ((hww) glkVar.f25502c.get()).mo5711f();
                    break;
                default:
                    ((htw) glkVar.f25501b.get()).mo5711f();
                    break;
            }
            jvh.m13562j(this.f15342X, new cis(this, 8), not.INSTANCE);
            this.f15407k.mo13963g("FilmstripData#init");
            this.f15388ar = (chv) this.f15382al.get();
            cht chtVar = (cht) this.f15414r.get();
            this.f15407k.mo13963g("FilmstripUi#init");
            RoundedThumbnailView roundedThumbnailView = this.f15410n.f31070g;
            chtVar.mo3758j(this);
            fdh.m8265e(this.f15372ab, this.f15380aj, chtVar);
            this.f15407k.mo13963g("Filmstrip#observers");
            this.f15385ao = new dju();
            this.f15386ap = new dju();
            this.f15344Z.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f15385ao);
            this.f15344Z.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.f15386ap);
            this.f15407k.mo13963g("CameraAppUI#init");
            this.f15410n.f31066c.f7259i = mrm.m16829i(new AmbientMode.AmbientController(this));
            ViewfinderCover viewfinderCover = this.f15335Q;
            viewfinderCover.f7292g.f30321q = this.f15393aw;
            viewfinderCover.f7292g.f30323s = this.f15378ah.mo10030b(gzy.f27045d);
            ViewfinderCover viewfinderCover2 = this.f15335Q;
            viewfinderCover2.f7291f = new bdv(this, 5);
            ggm ggmVar = this.f15376af;
            viewfinderCover2.f7292g.f30298A = mrm.m16829i(ggmVar);
            ViewfinderCover viewfinderCover3 = this.f15335Q;
            ica icaVar = new ica() { // from class: esd
                @Override // p000.ica
                /* JADX INFO: renamed from: a */
                public final boolean mo7756a() {
                    return ((Boolean) this.f15304a.f15406j.mo10031c(gzy.f26989A)).booleanValue();
                }
            };
            icc iccVar = viewfinderCover3.f7292g;
            iccVar.f30299B = icaVar;
            iccVar.f30300C = this.f15351aG;
            this.f15404h.f31010j = mrm.m16829i(new AmbientMode.AmbientController(this));
            this.f15411o = ((chl) this.f15384an.get()).mo3710a(m7773N());
            if (this.f15413q.mo16813g()) {
                ((hgo) this.f15413q.mo16809c()).mo10210a(this.f15360aP);
            }
            this.f15339U.m3529i().m13537d(chtVar.mo3753a(this.f15361aQ));
            this.f15407k.mo13963g("CameraFacing#config");
            this.f15339U.m3529i().m13537d(this.f15351aG.mo3830a(new dsu(this, 14), not.INSTANCE));
            this.f15407k.mo13962f();
            m7780C(m7783x());
            this.f15407k.mo13961e("CameraUi#prepareModuleUi");
            ciq ciqVar = (ciq) this.f15411o;
            ConstraintLayout constraintLayout = ciqVar.f5837c;
            ciqVar.f5852r.mo11157h(ciqVar.f5850p);
            if (ciqVar.f5838d.mo11020s(ciqVar.f5836b.mo3698l())) {
                ciqVar.f5838d.mo11013l(true);
            } else {
                ciqVar.f5838d.mo11013l(false);
            }
            if (!ciqVar.f5838d.mo11020s(ciqVar.f5836b.mo3698l())) {
                ciqVar.m3808q(ciqVar.f5836b.mo3698l());
            }
            if (this.f15383am || m7773N() || this.f15339U.m3527g()) {
                this.f15388ar.mo3759bs();
            } else {
                this.f15388ar.mo3765i();
            }
            if (this.f15413q.mo16813g()) {
                ((hgo) this.f15413q.mo16809c()).mo10210a(new esg(this));
            }
            jvh.m13562j(((htf) this.f15408l.get()).mo10735c(), new cis(this, 9), not.INSTANCE);
            if (this.f15348aD) {
                this.f15348aD = false;
                Handler handler = this.f15401e;
                cht chtVar2 = (cht) this.f15414r.get();
                chtVar2.getClass();
                handler.post(new esc(chtVar2, i));
            }
            this.f15407k.mo13963g("ActivityUi#initCallbacks");
            this.f15410n.f31075l.setOnDrawListener(new esh(this));
            this.f15339U.m3529i().m13537d(this.f15357aM.mo3830a(new dsu(this, 15), this.f15372ab));
            this.f15407k.mo13963g("ActivityLifecycle#observe");
            this.f15380aj.m8097e(this);
            this.f15407k.mo13962f();
            this.f15407k.mo13962f();
            this.f15402f.m10438i(hkp.ACTIVITY_INITIALIZED, CameraActivityTiming.f6961a);
        }
        this.f15407k.mo13962f();
        return this.f15347aC;
    }

    @Override // p000.chk
    /* JADX INFO: renamed from: w */
    public final cwd mo3709w() {
        return this.f15370aZ;
    }

    /* JADX INFO: renamed from: x */
    public final ikw m7783x() {
        return cds.m3505d(this.f15367aW.m2611e());
    }

    @Override // p000.ezt
    /* JADX INFO: renamed from: y */
    public final void mo7784y(Configuration configuration) {
        this.f15412p.mo3775e(configuration);
    }

    @Override // p000.gvn
    /* JADX INFO: renamed from: z */
    public final void mo7785z() {
        chw chwVar = this.f15412p;
        if (chwVar == null) {
            return;
        }
        chwVar.m3771bW();
        this.f15412p.m3779m();
    }
}
