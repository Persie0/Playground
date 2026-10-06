package p000;

import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.camera.zoomui.view.ZoomKnob;
import com.google.android.apps.camera.zoomui.view.ZoomSliderView;
import com.google.android.apps.camera.zoomui.view.ZoomUi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ite implements iuj, hfc, kba {

    /* JADX INFO: renamed from: al */
    private static final nbh f32049al = nbh.m17259h("com/google/android/apps/camera/zoomui/ZoomUiControllerImpl");

    /* JADX INFO: renamed from: A */
    public final hah f32050A;

    /* JADX INFO: renamed from: B */
    public final jwn f32051B;

    /* JADX INFO: renamed from: C */
    public final jww f32052C;

    /* JADX INFO: renamed from: D */
    public iuc f32053D;

    /* JADX INFO: renamed from: E */
    public itx f32054E;

    /* JADX INFO: renamed from: F */
    public kmq f32055F;

    /* JADX INFO: renamed from: G */
    public ImageButton f32056G;

    /* JADX INFO: renamed from: H */
    public ImageButton f32057H;

    /* JADX INFO: renamed from: I */
    public mrm f32058I;

    /* JADX INFO: renamed from: J */
    public Resources f32059J;

    /* JADX INFO: renamed from: K */
    public ZoomKnob f32060K;

    /* JADX INFO: renamed from: L */
    public SeekBar f32061L;

    /* JADX INFO: renamed from: M */
    public ZoomSliderView f32062M;

    /* JADX INFO: renamed from: N */
    public TextView f32063N;

    /* JADX INFO: renamed from: O */
    public ZoomUi f32064O;

    /* JADX INFO: renamed from: P */
    public isp f32065P;

    /* JADX INFO: renamed from: Q */
    public PointF f32066Q;

    /* JADX INFO: renamed from: R */
    public boolean f32067R;

    /* JADX INFO: renamed from: S */
    public boolean f32068S;

    /* JADX INFO: renamed from: T */
    public boolean f32069T;

    /* JADX INFO: renamed from: U */
    public boolean f32070U;

    /* JADX INFO: renamed from: V */
    public boolean f32071V;

    /* JADX INFO: renamed from: W */
    public boolean f32072W;

    /* JADX INFO: renamed from: X */
    public boolean f32073X;

    /* JADX INFO: renamed from: Y */
    public final boolean f32074Y;

    /* JADX INFO: renamed from: Z */
    public float f32075Z;

    /* JADX INFO: renamed from: aa */
    public float f32077aa;

    /* JADX INFO: renamed from: ab */
    public float f32078ab;

    /* JADX INFO: renamed from: ac */
    public int f32079ac;

    /* JADX INFO: renamed from: ad */
    public int f32080ad;

    /* JADX INFO: renamed from: ae */
    public final AnimatorListenerAdapter f32081ae;

    /* JADX INFO: renamed from: af */
    public final AnimatorListenerAdapter f32082af;

    /* JADX INFO: renamed from: ag */
    public double f32083ag;

    /* JADX INFO: renamed from: ah */
    public double f32084ah;

    /* JADX INFO: renamed from: ai */
    public int f32085ai;

    /* JADX INFO: renamed from: aj */
    public final npk f32086aj;

    /* JADX INFO: renamed from: ak */
    public final jfs f32087ak;

    /* JADX INFO: renamed from: am */
    private final dnn f32088am;

    /* JADX INFO: renamed from: an */
    private final Set f32089an;

    /* JADX INFO: renamed from: ao */
    private final jww f32090ao;

    /* JADX INFO: renamed from: ap */
    private final WindowManager f32091ap;

    /* JADX INFO: renamed from: aq */
    private mrm f32092aq;

    /* JADX INFO: renamed from: ar */
    private List f32093ar;

    /* JADX INFO: renamed from: as */
    private boolean f32094as;

    /* JADX INFO: renamed from: at */
    private final boolean f32095at;

    /* JADX INFO: renamed from: au */
    private final kms f32096au;

    /* JADX INFO: renamed from: c */
    public final dcj f32098c;

    /* JADX INFO: renamed from: d */
    public final dhv f32099d;

    /* JADX INFO: renamed from: e */
    public final jvb f32100e;

    /* JADX INFO: renamed from: f */
    public final jww f32101f;

    /* JADX INFO: renamed from: g */
    public final jww f32102g;

    /* JADX INFO: renamed from: h */
    public final jww f32103h;

    /* JADX INFO: renamed from: i */
    public final Set f32104i;

    /* JADX INFO: renamed from: j */
    public final Set f32105j;

    /* JADX INFO: renamed from: k */
    public final elx f32106k;

    /* JADX INFO: renamed from: l */
    public final fcp f32107l;

    /* JADX INFO: renamed from: m */
    public final boolean f32108m;

    /* JADX INFO: renamed from: n */
    public final kpb f32109n;

    /* JADX INFO: renamed from: o */
    public final jwn f32110o;

    /* JADX INFO: renamed from: p */
    public final float f32111p;

    /* JADX INFO: renamed from: q */
    public final AtomicBoolean f32112q;

    /* JADX INFO: renamed from: r */
    public final Runnable f32113r;

    /* JADX INFO: renamed from: s */
    public final Runnable f32114s;

    /* JADX INFO: renamed from: t */
    public final jww f32115t;

    /* JADX INFO: renamed from: u */
    public final jww f32116u;

    /* JADX INFO: renamed from: v */
    public final mrm f32117v;

    /* JADX INFO: renamed from: w */
    public final Executor f32118w;

    /* JADX INFO: renamed from: x */
    public final AtomicBoolean f32119x;

    /* JADX INFO: renamed from: y */
    public final mrm f32120y;

    /* JADX INFO: renamed from: z */
    public final isq f32121z;

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f32076a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f32097b = new AtomicInteger(0);

    public ite(jww jwwVar, jww jwwVar2, Set set, jfs jfsVar, fcp fcpVar, dhv dhvVar, elx elxVar, jfs jfsVar2, kms kmsVar, dnn dnnVar, dcj dcjVar, kpb kpbVar, jww jwwVar3, float f, npk npkVar, Executor executor, WindowManager windowManager, mrm mrmVar, hah hahVar, jwn jwnVar, jww jwwVar4, jww jwwVar5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z = false;
        Float fValueOf = Float.valueOf(1.0f);
        this.f32101f = new jwf(fValueOf);
        this.f32102g = new jwf(fValueOf);
        this.f32112q = new AtomicBoolean(false);
        this.f32113r = new ipa(this, 19);
        this.f32114s = new ipa(this, 20);
        this.f32116u = new jwf(fValueOf);
        this.f32119x = new AtomicBoolean(false);
        this.f32055F = kmq.BACK;
        mqu mquVar = mqu.f41450a;
        this.f32092aq = mquVar;
        this.f32058I = mquVar;
        this.f32081ae = new isw(this);
        this.f32082af = new isx(this);
        this.f32083ag = -1.0d;
        this.f32084ah = -1.0d;
        this.f32100e = new jvb();
        this.f32103h = jwwVar;
        this.f32115t = jwwVar2;
        boolean zM13077L = jfsVar.m13077L();
        this.f32108m = zM13077L;
        this.f32107l = fcpVar;
        this.f32099d = dhvVar;
        HashSet hashSet = new HashSet(set);
        this.f32104i = hashSet;
        hashSet.add(new itd(this, 0));
        this.f32089an = new HashSet();
        this.f32106k = elxVar;
        this.f32087ak = jfsVar2;
        this.f32096au = kmsVar;
        this.f32088am = dnnVar;
        this.f32098c = dcjVar;
        this.f32109n = kpbVar;
        this.f32110o = jwwVar3;
        this.f32111p = f;
        this.f32068S = dhvVar.mo6184l(dib.f11276aj);
        this.f32086aj = npkVar;
        this.f32118w = executor;
        this.f32117v = mrm.m16828h((Integer) dhvVar.mo6173a(dib.f11293b).orElse(null));
        this.f32095at = dhvVar.mo6184l(dib.f11275ai);
        this.f32091ap = windowManager;
        this.f32120y = mrmVar;
        this.f32121z = new isq(dhvVar);
        this.f32050A = hahVar;
        this.f32051B = jwnVar;
        if (dhvVar.mo6184l(dib.f11279am) && !zM13077L) {
            z = true;
        }
        this.f32074Y = z;
        this.f32052C = jwwVar4;
        this.f32090ao = jwwVar5;
        this.f32105j = new HashSet();
    }

    /* JADX INFO: renamed from: af */
    private final void m11714af(int i) {
        this.f32057H.setVisibility(i);
        this.f32056G.setVisibility(i);
    }

    /* JADX INFO: renamed from: ag */
    private final void m11715ag() {
        float fMin = this.f32077aa;
        if (this.f32099d.mo6184l(dhh.f11112y) && this.f32092aq.mo16813g()) {
            fMin = Math.min(fMin, ((Float) this.f32099d.mo6180h(dhh.f11048A).get()).floatValue());
            ikw ikwVar = (ikw) this.f32110o.mo3831be();
            if (ikwVar.equals(ikw.AMBER)) {
                fMin = 1.0f;
            } else if (!ikwVar.equals(ikw.SLOW_MOTION)) {
                jxn jxnVar = jxn.FPS_AUTO;
                switch ((jxn) this.f32092aq.mo16809c()) {
                    case FPS_AUTO:
                    case FPS_60:
                    case FPS_60C_24E:
                    case f35054f:
                        fMin = !this.f32094as ? Math.min(fMin, ((Float) this.f32099d.mo6180h(dhh.f11050C).get()).floatValue()) : Math.min(fMin, ((Float) this.f32099d.mo6180h(dhh.f11049B).get()).floatValue());
                        break;
                    case f35050b:
                    case FPS_30:
                        if (!this.f32094as) {
                            fMin = Math.min(fMin, ((Float) this.f32099d.mo6180h(dhh.f11049B).get()).floatValue());
                        }
                        break;
                    case FPS_120_HFR_4X:
                    case FPS_240_HFR_8X:
                        fMin = Math.min(fMin, ((Float) this.f32099d.mo6180h(dhh.f11051D).get()).floatValue());
                        break;
                }
            } else {
                fMin = Math.min(fMin, ((Float) this.f32099d.mo6180h(dhh.f11051D).get()).floatValue());
            }
        }
        if (this.f32099d.mo6184l(dio.f11658O) && ((ikw) this.f32110o.mo3831be()).equals(ikw.PORTRAIT) && kmq.BACK == this.f32055F) {
            fMin = Math.min(fMin, ((Float) this.f32099d.mo6180h(dio.f11656M).get()).floatValue());
        }
        if (kmq.f36557a == this.f32055F) {
            fMin = Math.min(fMin, 4.0f);
        }
        Float fValueOf = Float.valueOf(fMin);
        float fMo11756g = fMin / mo11756g();
        if (((Float) this.f32103h.mo3831be()).floatValue() / mo11756g() > fMo11756g) {
            jww jwwVar = this.f32103h;
            Float fValueOf2 = Float.valueOf(fMo11756g);
            jwwVar.mo3415bf(fValueOf2);
            this.f32115t.mo3415bf(fValueOf2);
        }
        itx itxVar = this.f32054E;
        itxVar.f32169E = fMin;
        itxVar.f32208t.m4542k(fMin);
        this.f32101f.mo3415bf(fValueOf);
        m11735P();
        m11769t();
    }

    /* JADX INFO: renamed from: ah */
    private final boolean m11716ah() {
        return this.f32095at && this.f32098c.mo5895d().equals(kmq.f36557a);
    }

    /* JADX INFO: renamed from: ai */
    private final boolean m11717ai() {
        ikw ikwVar = (ikw) this.f32110o.mo3831be();
        return ikwVar == ikw.VIDEO || ikwVar == ikw.TIME_LAPSE;
    }

    /* JADX INFO: renamed from: aj */
    private final fvu m11718aj() {
        kms kmsVar = this.f32096au;
        kmsVar.getClass();
        kmg kmgVarM6439b = this.f32088am.m6439b(kmsVar, this.f32099d, this.f32055F);
        if (m11716ah() && this.f32098c.mo5895d().equals(kmq.f36557a)) {
            kms kmsVar2 = this.f32096au;
            kmgVarM6439b.getClass();
            return gls.m9447i(kmsVar2.m14581f(kmgVarM6439b), this.f32096au);
        }
        kms kmsVar3 = this.f32096au;
        kmgVarM6439b.getClass();
        return kmsVar3.m14581f(kmgVarM6439b);
    }

    /* JADX INFO: renamed from: ak */
    private final boolean m11719ak(fvu fvuVar) {
        return this.f32055F == kmq.f36557a && fvuVar.mo14534C();
    }

    /* JADX INFO: renamed from: A */
    public final void m11720A() {
        this.f32066Q = new PointF(0.0f, 0.0f);
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: B */
    public final void mo11721B(boolean z) {
        this.f32060K.setAccessibilityLiveRegion(0);
        float fMo11752c = mo11752c(z, (ikw) this.f32110o.mo3831be());
        this.f32065P.f32000e = true;
        jww jwwVar = this.f32103h;
        Float fValueOf = Float.valueOf(fMo11752c);
        jwwVar.mo3415bf(fValueOf);
        if (this.f32099d.mo6184l(dib.f11276aj)) {
            this.f32115t.mo3415bf(fValueOf);
        }
        if (this.f32119x.get()) {
            mo11774y();
            this.f32119x.set(false);
        }
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: C */
    public final void mo11722C() {
        this.f32060K.f7333e.set(iug.MAIN_ONLY);
        this.f32065P.f31998c.set(iug.MAIN_ONLY);
        this.f32062M.f7380b.set(iug.MAIN_ONLY);
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: D */
    public final void mo11723D(float f) {
        jww jwwVar = this.f32103h;
        Float fValueOf = Float.valueOf(f);
        jwwVar.mo3415bf(fValueOf);
        this.f32115t.mo3415bf(fValueOf);
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: E */
    public final void mo11724E(float f) {
        this.f32077aa = f;
        m11715ag();
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: F */
    public final void mo11725F(float f) {
        Float fValueOf = Float.valueOf(f);
        itx itxVar = this.f32054E;
        itxVar.f32170F = f;
        ZoomSliderView zoomSliderView = itxVar.f32208t;
        zoomSliderView.f7383e = f;
        zoomSliderView.m4544m();
        this.f32102g.mo3415bf(fValueOf);
        m11735P();
        m11769t();
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: G */
    public final void mo11726G() {
        float fM11755f = m11755f();
        mo11725F(fM11755f);
        if (((Float) this.f32103h.mo3831be()).floatValue() < fM11755f) {
            mo11723D(fM11755f);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m11727H(ImageButton imageButton, final boolean z) {
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: iss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ite iteVar = this.f32029a;
                boolean z2 = z;
                iteVar.f32054E.mo11677d(iteVar.m11748ac(z2), 6);
                if (z2 || !iteVar.m11744Y()) {
                    return;
                }
                if (iteVar.f32087ak.m13088X("wide_selfie_tooltip_display_count") <= 2) {
                    iteVar.f32087ak.m13091aa("wide_selfie_tooltip_display_count", 3);
                }
                if (iteVar.f32058I.mo16813g()) {
                    ((kba) iteVar.f32058I.mo16809c()).close();
                    iteVar.f32058I = mqu.f41450a;
                }
            }
        });
        imageButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: ist
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ite iteVar = this.f32031a;
                iteVar.f32054E.mo11685o(z);
                return true;
            }
        });
        imageButton.setOnTouchListener(new isv(this, 1));
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: I */
    public final void mo11728I(boolean z) {
        if (!z) {
            iuc iucVar = this.f32053D;
            if (iucVar != null) {
                if (this.f32072W) {
                    this.f32054E.mo11688r();
                    return;
                } else {
                    iucVar.mo11693b();
                    return;
                }
            }
            return;
        }
        if (this.f32072W) {
            this.f32054E.mo11691u();
        } else {
            this.f32053D.mo11692a();
        }
        if (this.f32108m) {
            if (!this.f32099d.mo6184l(dib.f11276aj)) {
                m11714af(0);
            }
            mo11765p();
            return;
        }
        m11714af(8);
        if (this.f32099d.mo6184l(dib.f11276aj)) {
            return;
        }
        if (((Float) this.f32103h.mo3831be()).floatValue() == ((Float) ((jwf) this.f32102g).f34942d).floatValue()) {
            mo11763n();
        } else {
            mo11765p();
        }
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: J */
    public final void mo11729J(iug iugVar) {
        this.f32060K.f7333e.set(iugVar);
        this.f32065P.f31998c.set(iugVar);
        this.f32062M.f7380b.set(iugVar);
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: K */
    public final void mo11730K(boolean z) {
        this.f32054E.f32173I = z;
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: L */
    public final void mo11731L() {
        if (this.f32068S) {
            m11762m();
            if (this.f32064O.m4550D()) {
                this.f32054E.mo11674a();
            }
        }
        if (this.f32064O.m4550D()) {
            this.f32054E.mo11681k();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m11732M() {
        m11762m();
        this.f32054E.m11784F();
    }

    /* JADX INFO: renamed from: N */
    public final void m11733N(int i) {
        this.f32080ad = i;
        this.f32079ac = 0;
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: O */
    public final void mo11734O(mrm mrmVar, boolean z) {
        this.f32092aq = mrmVar;
        this.f32094as = z;
        isp ispVar = this.f32065P;
        ispVar.f31999d = z;
        if (mrmVar.mo16813g()) {
            ispVar.f32001f = (jxn) mrmVar.mo16809c();
        }
        if (mrmVar.mo16813g()) {
            m11715ag();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m11735P() {
        ArrayList arrayList = new ArrayList();
        float fFloatValue = ((Float) ((jwf) this.f32102g).f34942d).floatValue();
        float fM6438a = m11719ak(m11718aj()) ? this.f32088am.m6438a(m11718aj()) : 2.0f;
        while (fFloatValue > 0.0f && fM6438a > 1.0f && fFloatValue < ((Float) ((jwf) this.f32101f).f34942d).floatValue()) {
            arrayList.add(Float.valueOf(fFloatValue));
            if (fFloatValue < 1.0f) {
                arrayList.add(Float.valueOf(1.0f));
                fFloatValue = 1.0f;
            }
            fFloatValue *= fM6438a;
        }
        arrayList.add((Float) ((jwf) this.f32101f).f34942d);
        this.f32093ar = arrayList;
    }

    /* JADX INFO: renamed from: Q */
    public final void m11736Q(int i) {
        if (this.f32064O.m4550D()) {
            float fM11702a = this.f32065P.m11702a(i);
            jww jwwVar = this.f32090ao;
            Float fValueOf = Float.valueOf(fM11702a);
            jwwVar.mo3415bf(fValueOf);
            this.f32052C.mo3415bf(gee.f24362b);
            isp ispVar = this.f32065P;
            float fFloatValue = ((Float) this.f32103h.mo3831be()).floatValue();
            AnimatorListenerAdapter animatorListenerAdapter = this.f32082af;
            ispVar.f31997b.setFloatValues(fFloatValue, fM11702a);
            ispVar.f31997b.addListener(animatorListenerAdapter);
            ispVar.f31997b.start();
            this.f32115t.mo3415bf(fValueOf);
            isp ispVar2 = this.f32065P;
            ispVar2.m11706e(this.f32064O, ispVar2.m11705d(fM11702a));
            this.f32054E.m11787J(11, ((Float) this.f32103h.mo3831be()).floatValue(), fM11702a);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m11737R() {
        if (this.f32062M.getVisibility() == 0) {
            this.f32062M.invalidate();
        }
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: S */
    public final void mo11738S() {
        float fM11748ac = m11748ac(true);
        if (this.f32099d.mo6184l(dib.f11351ce)) {
            float f = this.f32062M.f7384f;
            if (fM11748ac > f) {
                fM11748ac = f;
            }
        }
        this.f32054E.mo11677d(fM11748ac, 9);
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: T */
    public final void mo11739T() {
        this.f32054E.mo11677d(m11748ac(false), 9);
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: U */
    public final void mo11740U(float f) {
        this.f32054E.mo11677d(f, 1);
        jww jwwVar = this.f32115t;
        Float fValueOf = Float.valueOf(f);
        jwwVar.mo3415bf(fValueOf);
        this.f32090ao.mo3415bf(fValueOf);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m11741V() {
        ikw ikwVar = (ikw) this.f32110o.mo3831be();
        boolean z = mo11754e() < 1.0f && this.f32098c.mo5895d().equals(kmq.BACK) && this.f32099d.mo6184l(dib.f11274ah);
        if (ikwVar.equals(ikw.PHOTO) || ikwVar.equals(ikw.LONG_EXPOSURE) || ikwVar.equals(ikw.MOTION_BLUR) || ikwVar.equals(ikw.IMAGE_INTENT) || ikwVar.equals(ikw.VIDEO) || ikwVar.equals(ikw.TIME_LAPSE) || ikwVar.equals(ikw.VIDEO_INTENT)) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m11742W() {
        float fM11704c = this.f32065P.m11704c(mo11754e(), mo11754e());
        if (this.f32109n.f36775h) {
            return fM11704c >= 1.0f || mo11754e() >= 1.0f || ((ikw) this.f32110o.mo3831be()).equals(ikw.PORTRAIT) || ((ikw) this.f32110o.mo3831be()).equals(ikw.SLOW_MOTION) || (((ikw) this.f32110o.mo3831be()).equals(ikw.VIDEO) && this.f32094as && (this.f32092aq.mo16809c() == jxn.FPS_60 || this.f32092aq.mo16809c() == jxn.FPS_60C_24E || this.f32092aq.mo16809c() == jxn.f35054f)) || this.f32098c.mo5895d().equals(kmq.f36557a);
        }
        return fM11704c >= 1.0f || mo11754e() >= 1.0f || ((ikw) this.f32110o.mo3831be()).equals(ikw.PORTRAIT) || ((ikw) this.f32110o.mo3831be()).equals(ikw.AMBER) || this.f32098c.mo5895d().equals(kmq.f36557a);
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: X */
    public final boolean mo11743X() {
        return this.f32099d.mo6184l(dib.f11284ar);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m11744Y() {
        return this.f32067R && kmq.f36557a == this.f32055F;
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: Z */
    public final boolean mo11745Z(ikw ikwVar) {
        this.f32060K.setAccessibilityLiveRegion(0);
        return mo11757h() == mo11752c(false, ikwVar);
    }

    @Override // p000.hfc
    /* JADX INFO: renamed from: a */
    public final void mo10180a(mrm mrmVar) {
        this.f32118w.execute(new ipe(this, mrmVar, 4));
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: aa */
    public final boolean mo11746aa() {
        if (!this.f32068S) {
            return mo11757h() != mo11752c(false, (ikw) this.f32110o.mo3831be());
        }
        float fMo11757h = mo11757h();
        return (fMo11757h == 1.0f || fMo11757h == 2.0f || fMo11757h == 0.615f || fMo11757h == 1.5f) ? false : true;
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: ab */
    public final void mo11747ab() {
        ZoomUi zoomUi = this.f32064O;
        if (zoomUi.f7410f) {
            return;
        }
        zoomUi.f7412h.cancel();
        zoomUi.f7410f = true;
        zoomUi.f7412h.start();
    }

    /* JADX INFO: renamed from: ac */
    public final float m11748ac(boolean z) {
        float fFloatValue;
        if (z) {
            Float f = (Float) mkv.m16514V(lku.m15650d(this.f32093ar, new isr(this, 0)), (Float) ((jwf) this.f32101f).f34942d);
            f.getClass();
            fFloatValue = f.floatValue();
        } else {
            Float f2 = (Float) mkv.m16516X(lku.m15650d(this.f32093ar, new isr(this, 2)), (Float) ((jwf) this.f32102g).f34942d);
            f2.getClass();
            fFloatValue = f2.floatValue();
        }
        this.f32103h.mo3831be();
        return fFloatValue;
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: ad */
    public final void mo11749ad(boolean z) {
        if (z) {
            if (!this.f32099d.mo6184l(dib.f11276aj)) {
                mo11763n();
            }
            mo11721B(false);
        }
    }

    /* JADX INFO: renamed from: ae */
    public final void m11750ae(float f) {
        float fM4536e = this.f32062M.m4536e(f);
        ZoomSliderView zoomSliderView = this.f32062M;
        float f2 = zoomSliderView.f7381c;
        float f3 = zoomSliderView.f7382d;
        if (f2 > f3 || fM4536e < f2 || fM4536e > f3) {
            ((nbe) ((nbe) ZoomSliderView.f7341a.m17251b()).mo17276G(4463)).mo17271B("The currentGradationValue of %f is out of range: [%f, %f]", Float.valueOf(zoomSliderView.f7386h), Float.valueOf(zoomSliderView.f7381c), Float.valueOf(zoomSliderView.f7382d));
            float fMax = Math.max(zoomSliderView.f7381c, zoomSliderView.f7382d);
            zoomSliderView.f7382d = fMax;
            float f4 = zoomSliderView.f7386h;
            float f5 = zoomSliderView.f7381c;
            if (f4 <= f5) {
                fMax = f5;
            }
            zoomSliderView.f7386h = fMax;
        }
        if (zoomSliderView.f7395q) {
            return;
        }
        if (!zoomSliderView.f7393o.isFinished()) {
            zoomSliderView.f7393o.forceFinished(true);
            return;
        }
        zoomSliderView.f7386h = fM4536e;
        float f6 = zoomSliderView.f7381c;
        float f7 = zoomSliderView.f7382d;
        zoomSliderView.f7394p = false;
        zoomSliderView.m4538g();
        zoomSliderView.invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final float m11751b() {
        if (this.f32055F == kmq.f36557a && this.f32068S) {
            return this.f32065P.m11702a(1);
        }
        return 1.0f;
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: c */
    public final float mo11752c(boolean z, ikw ikwVar) {
        if (ikwVar == ikw.PORTRAIT && this.f32055F == kmq.f36557a) {
            dhv dhvVar = this.f32099d;
            dhx dhxVar = dio.f11659a;
            dhvVar.mo6175c();
        }
        fvu fvuVarM11718aj = m11718aj();
        float f = this.f32111p;
        if (m11719ak(fvuVarM11718aj) && !z) {
            return this.f32088am.m6438a(fvuVarM11718aj);
        }
        if (m11716ah()) {
            if (this.f32055F == kmq.f36557a) {
                return m11717ai() ? this.f32065P.m11702a(0) : this.f32065P.m11702a(1);
            }
            return ikwVar != ikw.PORTRAIT ? f : m11755f();
        }
        if (ikwVar != ikw.PORTRAIT) {
            return f;
        }
        if (this.f32055F == kmq.f36557a) {
            return this.f32065P.m11702a(!this.f32099d.mo6184l(dio.f11657N) ? 1 : 0);
        }
        return m11755f();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f32120y.mo16813g()) {
            ((hfd) this.f32120y.mo16809c()).mo10171h(this);
        }
        this.f32100e.close();
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: d */
    public final float mo11753d() {
        return ((Float) ((jwf) this.f32101f).f34942d).floatValue();
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: e */
    public final float mo11754e() {
        return ((Float) ((jwf) this.f32102g).f34942d).floatValue();
    }

    /* JADX INFO: renamed from: f */
    final float m11755f() {
        fvu fvuVarM11718aj = m11718aj();
        float fM6438a = this.f32088am.m6438a(fvuVarM11718aj);
        if (this.f32055F == kmq.BACK) {
            return ((Float) this.f32099d.mo6180h(dio.f11664f).orElse(Float.valueOf(1.0f))).floatValue() * fM6438a;
        }
        if (!fvuVarM11718aj.mo14534C() && !this.f32068S) {
            return fM6438a * 1.2f;
        }
        if (m11716ah()) {
            return mo11754e();
        }
        return 1.0f;
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: g */
    public final float mo11756g() {
        float fM4526a = this.f32060K.m4526a(((Float) ((jwf) this.f32102g).f34942d).floatValue(), m11751b());
        if (fM4526a != 0.0f) {
            return fM4526a;
        }
        return 1.0f;
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: h */
    public final float mo11757h() {
        return ((Float) this.f32103h.mo3831be()).floatValue();
    }

    /* JADX INFO: renamed from: i */
    public final float m11758i(MotionEvent motionEvent) {
        float rawY;
        float rawY2;
        ZoomUi zoomUi = this.f32064O;
        ilk ilkVarM11426b = zoomUi.getDisplay() == null ? ilk.PORTRAIT : ilk.m11426b(zoomUi.getDisplay(), zoomUi.getContext());
        if (this.f32066Q == null) {
            return 0.0f;
        }
        if (ilk.m11427e(ilkVarM11426b)) {
            rawY = this.f32066Q.x;
            rawY2 = motionEvent.getRawX();
        } else if (ilkVarM11426b.equals(ilk.REVERSE_LANDSCAPE)) {
            rawY = this.f32066Q.y;
            rawY2 = motionEvent.getRawY();
        } else {
            rawY = motionEvent.getRawY();
            rawY2 = this.f32066Q.y;
        }
        return rawY2 - rawY;
    }

    /* JADX INFO: renamed from: j */
    public final int m11759j(float f) {
        int iRound = Math.round(((float) (Math.log(f / ((Float) ((jwf) this.f32102g).f34942d).floatValue()) / Math.log(((Float) ((jwf) this.f32101f).f34942d).floatValue() / ((Float) ((jwf) this.f32102g).f34942d).floatValue()))) * 100000.0f);
        if (this.f32061L.getProgress() != iRound && !this.f32064O.m4550D()) {
            this.f32061L.setProgress(iRound);
        }
        return iRound;
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: k */
    public final void mo11760k(iui iuiVar) {
        this.f32089an.add(iuiVar);
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: l */
    public final void mo11761l(boolean z) {
        this.f32064O.m4549C(z, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m11762m() {
        this.f32054E.m11795z();
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: n */
    public final void mo11763n() {
        if (this.f32108m) {
            return;
        }
        this.f32054E.mo11674a();
        m11762m();
    }

    /* JADX INFO: renamed from: o */
    public final void m11764o() {
        int i;
        int i2;
        if (this.f32112q.get()) {
            return;
        }
        this.f32069T = true;
        this.f32070U = true;
        this.f32062M.f7393o.forceFinished(true);
        this.f32062M.f7392n = mo11756g();
        this.f32062M.m4540i();
        int iM11759j = m11759j(((Float) this.f32115t.mo3831be()).floatValue());
        this.f32060K.m4530e(iM11759j, ((Float) this.f32115t.mo3831be()).floatValue(), ((Float) ((jwf) this.f32102g).f34942d).floatValue(), m11751b());
        ZoomUi zoomUi = this.f32064O;
        ilk ilkVarM11426b = ((View) zoomUi.getParent()).getDisplay() == null ? ilk.PORTRAIT : ilk.m11426b(((View) zoomUi.getParent()).getDisplay(), zoomUi.getContext());
        float f = 0.0f;
        if (this.f32066Q != null) {
            if (this.f32091ap != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.f32091ap.getDefaultDisplay().getRealMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                i2 = displayMetrics.heightPixels;
            } else {
                i = this.f32059J.getDisplayMetrics().widthPixels;
                i2 = this.f32059J.getDisplayMetrics().heightPixels;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32060K.getLayoutParams();
            if (ilk.m11427e(ilkVarM11426b)) {
                f = (this.f32066Q.x - layoutParams.leftMargin) - (i / 2.0f);
            } else if (ilkVarM11426b.equals(ilk.REVERSE_LANDSCAPE)) {
                f = this.f32066Q.y < 0.0f ? (this.f32066Q.x - layoutParams.leftMargin) - (i2 / 2.0f) : (this.f32066Q.y - layoutParams.leftMargin) - (i2 / 2.0f);
            } else if (this.f32066Q.x < 0.0f) {
                float f2 = i2;
                f = ((this.f32066Q.x + f2) - layoutParams.leftMargin) - (f2 / 2.0f);
            } else {
                float f3 = i2;
                f = ((f3 - this.f32066Q.y) - layoutParams.leftMargin) - (f3 / 2.0f);
            }
        }
        this.f32078ab = f;
        this.f32054E.mo11689s();
        if (this.f32071V) {
            this.f32086aj.m17608d();
        }
        this.f32061L.setProgress(iM11759j);
        m11750ae(((Float) this.f32115t.mo3831be()).floatValue());
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: p */
    public final void mo11765p() {
        lku.m15613H(jvd.m13540d());
        this.f32061L.isEnabled();
        if (!this.f32068S || this.f32108m) {
            this.f32054E.mo11681k();
            if (this.f32108m || mo11746aa()) {
                m11762m();
                return;
            } else {
                m11732M();
                return;
            }
        }
        int i = 3;
        if (mo11754e() >= 1.0f || this.f32110o.mo3831be() == ikw.SLOW_MOTION || this.f32110o.mo3831be() == ikw.PORTRAIT || this.f32110o.mo3831be() == ikw.AMBER || m11742W()) {
            if (m11742W()) {
                i = 2;
            }
        } else if (m11741V()) {
            i = 4;
        }
        this.f32054E.mo11682l(i);
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: q */
    public final void mo11766q(boolean z) {
        this.f32054E.f32172H = z;
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: r */
    public final void mo11767r(boolean z) {
        if (this.f32074Y) {
            this.f32062M.f7396r = z;
        }
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: s */
    public final void mo11768s() {
        if (this.f32068S && this.f32099d.mo6184l(dib.f11275ai)) {
            if (!this.f32098c.mo5895d().equals(kmq.f36557a)) {
                mo11722C();
            } else if (m11716ah() && m11717ai()) {
                mo11722C();
            } else {
                mo11729J(iug.FRONT_PORTRAIT);
            }
            mo11765p();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m11769t() {
        Iterator it = this.f32089an.iterator();
        while (it.hasNext()) {
            ((iui) it.next()).mo11632a();
        }
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: u */
    public final void mo11770u(float f) {
        if (!this.f32099d.mo6184l(dib.f11351ce)) {
            this.f32054E.mo11690t(f);
            return;
        }
        float fM13831s = jzn.m13831s(f, mo11757h());
        if (fM13831s > mo11753d() || fM13831s > this.f32062M.f7384f) {
            return;
        }
        this.f32054E.mo11690t(f);
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: v */
    public final void mo11771v() {
        this.f32075Z = ((Float) this.f32103h.mo3831be()).floatValue();
        this.f32054E.mo11676c();
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: w */
    public final void mo11772w() {
        this.f32054E.mo11686p();
        if (!this.f32108m) {
            this.f32054E.m11784F();
        }
        this.f32054E.m11787J(8, this.f32075Z, ((Float) this.f32103h.mo3831be()).floatValue());
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: x */
    public final void mo11773x() {
        mo11774y();
        if (m11716ah()) {
            mo11775z();
        }
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: y */
    public final void mo11774y() {
        fvu fvuVarM11718aj = m11718aj();
        this.f32077aa = fvuVarM11718aj.mo14549b();
        m11715ag();
        if (m11719ak(fvuVarM11718aj)) {
            float fM6438a = this.f32088am.m6438a(fvuVarM11718aj);
            if (fM6438a > 1.0f) {
                mo11724E(fM6438a * fM6438a);
            } else {
                ((nbe) ((nbe) f32049al.m17251b()).mo17276G((char) 4436)).mo17293r("unable to set zoom max with zoomValue <= 1: %g", Float.valueOf(fM6438a));
            }
        }
    }

    @Override // p000.iuj
    /* JADX INFO: renamed from: z */
    public final void mo11775z() {
        mo11725F(m11718aj().mo14550c());
    }
}
