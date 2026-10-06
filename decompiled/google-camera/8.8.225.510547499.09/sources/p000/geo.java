package p000;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import com.google.android.apps.camera.optionsbar.view.TimerWidget;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import p021j$.util.Collection$EL;
import p021j$.util.concurrent.ConcurrentHashMap;
import p021j$.util.function.Consumer$CC;
import p021j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class geo implements gfa, gfe {

    /* JADX INFO: renamed from: a */
    public static final nbh f24397a = nbh.m17259h("com/google/android/apps/camera/optionsbar/OptionsBarController2");

    /* JADX INFO: renamed from: b */
    public final jww f24398b;

    /* JADX INFO: renamed from: c */
    public final jvd f24399c;

    /* JADX INFO: renamed from: d */
    public final kbz f24400d;

    /* JADX INFO: renamed from: e */
    public kmq f24401e;

    /* JADX INFO: renamed from: h */
    public OptionsMenuView f24404h;

    /* JADX INFO: renamed from: i */
    public OptionsMenuContainer f24405i;

    /* JADX INFO: renamed from: j */
    public final gfe f24406j;

    /* JADX INFO: renamed from: m */
    public final jww f24409m;

    /* JADX INFO: renamed from: n */
    public final geh f24410n;

    /* JADX INFO: renamed from: o */
    public final mxk f24411o;

    /* JADX INFO: renamed from: p */
    public final geq f24412p;

    /* JADX INFO: renamed from: q */
    public final jvb f24413q;

    /* JADX INFO: renamed from: s */
    private boolean f24415s;

    /* JADX INFO: renamed from: t */
    private final ges f24416t;

    /* JADX INFO: renamed from: u */
    private final hah f24417u;

    /* JADX INFO: renamed from: r */
    private boolean f24414r = true;

    /* JADX INFO: renamed from: f */
    public gey f24402f = new gey() { // from class: gem
        @Override // p000.gey
        /* JADX INFO: renamed from: a */
        public final void mo3800a() {
        }
    };

    /* JADX INFO: renamed from: g */
    public gez f24403g = new gez() { // from class: gen
        @Override // p000.gez
        /* JADX INFO: renamed from: a */
        public final void mo3801a() {
        }
    };

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f24407k = new AtomicBoolean(true);

    /* JADX INFO: renamed from: l */
    public final Set f24408l = ConcurrentHashMap.newKeySet();

    public geo(jww jwwVar, jvd jvdVar, kbz kbzVar, jvb jvbVar, fcp fcpVar, jww jwwVar2, hah hahVar, geh gehVar, Set set, geq geqVar, ges gesVar) {
        this.f24398b = jwwVar;
        this.f24399c = jvdVar;
        this.f24400d = kbzVar;
        this.f24413q = jvbVar;
        this.f24410n = gehVar;
        this.f24411o = mxk.m17134F(set);
        this.f24412p = geqVar;
        this.f24416t = gesVar;
        this.f24406j = fcpVar;
        this.f24409m = jwwVar2;
        this.f24417u = hahVar;
    }

    /* JADX INFO: renamed from: N */
    private final void m9100N() {
        this.f24405i.m4241h();
        this.f24410n.m9098i(m9103B());
        lku.m15657k(!mo9105D());
    }

    /* JADX INFO: renamed from: O */
    private final void m9101O() {
        this.f24405i.m4242i();
        this.f24410n.m9098i(m9103B());
        lku.m15657k(mo9105D());
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: A */
    public final boolean mo9102A(gev gevVar) {
        return this.f24404h.m4248b(gevVar);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m9103B() {
        if (!this.f24408l.isEmpty() || this.f24407k.get()) {
            return Collection$EL.stream(this.f24411o).anyMatch(new dam(this, 16));
        }
        return this.f24405i.m4238e().m4247a() > 0;
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: C */
    public final boolean mo9104C() {
        return this.f24415s;
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: D */
    public final boolean mo9105D() {
        return this.f24405i.isEnabled();
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: E */
    public final boolean mo9106E() {
        return this.f24414r;
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean mo9107F() {
        return gew.m9150a(this);
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: G */
    public final boolean mo9108G() {
        return this.f24405i.m4244k();
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: H */
    public final boolean mo9109H(PointF pointF) {
        return jvh.m13571s(pointF, this.f24404h) || jvh.m13571s(pointF, this.f24405i.m4236c());
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: I */
    public final jvb mo9110I() {
        return this.f24413q;
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: J */
    public final void mo9111J(fvu fvuVar) {
        kmq kmqVar = this.f24401e;
        boolean z = this.f24414r;
        boolean z2 = this.f24415s;
        this.f24401e = fvuVar.mo14558k();
        this.f24414r = fvuVar.mo14541J();
        this.f24415s = fvuVar.mo14537F();
        if (this.f24401e.equals(kmqVar) && this.f24414r == z && this.f24415s == z2) {
            return;
        }
        mo9129o(true, null);
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: L */
    public final void mo9112L(int i) {
        boolean zMo9108G = mo9108G();
        boolean zIsEnabled = this.f24405i.isEnabled();
        if (zMo9108G || !zIsEnabled) {
            this.f24407k.get();
            this.f24408l.size();
            return;
        }
        m9138y();
        if (m9103B()) {
            OptionsMenuContainer optionsMenuContainer = this.f24405i;
            if (!optionsMenuContainer.isEnabled() || optionsMenuContainer.m4235b() == null || optionsMenuContainer.m4238e().m4247a() == 0) {
                return;
            }
            Collection$EL.forEach(optionsMenuContainer.f6830h, fax.f21156i);
            Animator animatorM9202a = new ggb(optionsMenuContainer, true, optionsMenuContainer.m4234a()).m9202a();
            animatorM9202a.addListener(new ggd(optionsMenuContainer));
            animatorM9202a.start();
            optionsMenuContainer.m4243j(true);
            this.f24412p.m9141a(i);
        }
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: M */
    public final void mo9113M() {
        if (mo9108G()) {
            OptionsMenuContainer optionsMenuContainer = this.f24405i;
            Animator animator = optionsMenuContainer.f6827e;
            if (animator == null || !animator.isRunning()) {
                Collection$EL.forEach(optionsMenuContainer.f6830h, fax.f21155h);
                optionsMenuContainer.f6827e = new ggb(optionsMenuContainer, false, optionsMenuContainer.m4234a()).m9202a();
                optionsMenuContainer.f6827e.start();
                optionsMenuContainer.m4238e().fullScroll(33);
                optionsMenuContainer.m4243j(false);
                geq geqVar = this.f24412p;
                kmq kmqVar = this.f24401e;
                kmqVar.getClass();
                geqVar.f24421c = kmqVar;
                geqVar.f24420b = mo9115b();
                this.f24412p.m9142b();
            }
        }
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: a */
    public final View mo9114a() {
        return (View) this.f24410n.f24380d;
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: b */
    public final ikw mo9115b() {
        return (ikw) this.f24398b.mo3831be();
    }

    @Override // p000.gfe
    /* JADX INFO: renamed from: bM */
    public final void mo9116bM(final gfc gfcVar, final gev gevVar, final int i) {
        if (Collection$EL.stream(this.f24411o).noneMatch(new gek(gevVar, gfcVar, 0))) {
            return;
        }
        Collection$EL.stream(this.f24411o).filter(new gek(gevVar, gfcVar, 2)).forEach(new Consumer() { // from class: gel
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                geo geoVar = this.f24391a;
                gfc gfcVar2 = gfcVar;
                gev gevVar2 = gevVar;
                int i2 = i;
                ((gfb) obj).mo5773i().mo3415bf(gfcVar2);
                geoVar.f24406j.mo9116bM(gfcVar2, gevVar2, i2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Collection$EL.stream(this.f24411o).filter(new dam(gevVar, 11)).forEach(new fvi(this, 4));
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kba mo9117c() {
        mo9127m();
        return new ezc(this, 17);
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: d */
    public final mrm mo9118d(gev gevVar, gfc gfcVar) {
        mrm mrmVar;
        OptionsMenuView optionsMenuView = this.f24404h;
        synchronized (optionsMenuView) {
            mrmVar = (mrm) Collection$EL.stream(optionsMenuView.f6842b).filter(new gfw(gevVar, 2)).map(new cwp(gfcVar, 15)).findFirst().orElseGet(drv.f12449c);
        }
        return mrmVar;
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: e */
    public final nps mo9119e() {
        geh gehVar = this.f24410n;
        gehVar.f24380d.mo4228k();
        gehVar.m9095f();
        final nqf nqfVarM17621g = nqf.m17621g();
        this.f24405i.postDelayed(new Runnable() { // from class: gej
            @Override // java.lang.Runnable
            public final void run() {
                nqfVarM17621g.mo14894e(true);
            }
        }, this.f24405i.getResources().getInteger(C0100R.integer.motion_animation_duration));
        return nqfVarM17621g;
    }

    /* JADX INFO: renamed from: f */
    public final void m9120f(Stream stream) {
        stream.filter(new dam(this, 12)).forEach(new fvi(this, 9));
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: g */
    public final void mo9121g(gfg gfgVar) {
        this.f24405i.m4239f(gfgVar);
    }

    @Override // p000.gfa
    @Deprecated
    /* JADX INFO: renamed from: h */
    public final void mo9122h() {
        if (mo9105D()) {
            m9100N();
        }
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: i */
    public final void mo9123i() {
        OptionsMenuContainer optionsMenuContainer = this.f24405i;
        if (optionsMenuContainer != null) {
            optionsMenuContainer.f6831i = false;
        }
    }

    @Override // p000.gfa
    @Deprecated
    /* JADX INFO: renamed from: j */
    public final void mo9124j() {
        if (mo9105D()) {
            return;
        }
        m9101O();
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: k */
    public final void mo9125k() {
        OptionsMenuContainer optionsMenuContainer = this.f24405i;
        if (optionsMenuContainer != null) {
            optionsMenuContainer.f6831i = true;
        }
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: l */
    public final void mo9126l() {
        if (!this.f24405i.m4246m()) {
            ilt iltVar = this.f24405i.f6826d;
            iltVar.m11447a();
            iltVar.f31462c = 1;
            iltVar.f31461b = AnimatorInflater.loadAnimator(iltVar.f31460a.getContext(), R.animator.fade_in);
            iltVar.f31461b.setDuration(200L);
            iltVar.f31461b.setTarget(iltVar.f31460a);
            iltVar.f31461b.addListener(new ilr(iltVar));
            iltVar.f31461b.start();
            lku.m15657k(iltVar.f31461b.isStarted());
        }
        m9101O();
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: m */
    public final void mo9127m() {
        m9100N();
        if (this.f24405i.m4246m()) {
            OptionsMenuContainer optionsMenuContainer = this.f24405i;
            ilt iltVar = optionsMenuContainer.f6826d;
            iltVar.m11447a();
            iltVar.f31462c = 2;
            iltVar.f31461b = AnimatorInflater.loadAnimator(iltVar.f31460a.getContext(), R.animator.fade_out);
            iltVar.f31461b.setDuration(200L);
            iltVar.f31461b.setTarget(iltVar.f31460a);
            iltVar.f31461b.addListener(new ils(iltVar));
            iltVar.f31461b.start();
            Collection$EL.forEach(optionsMenuContainer.f6830h, fax.f21154g);
        }
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: n */
    public final void mo9128n(gfg gfgVar) {
        this.f24405i.f6830h.remove(gfgVar);
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: o */
    public final void mo9129o(boolean z, gev gevVar) {
        boolean zMo9108G;
        if (z) {
            this.f24399c.m13541c(new fro(this, gevVar, 10));
            zMo9108G = false;
        } else {
            zMo9108G = mo9108G();
        }
        this.f24408l.size();
        if (gevVar == null) {
            this.f24407k.set(true);
        } else {
            this.f24408l.add(gevVar);
        }
        if (zMo9108G) {
            m9138y();
        } else {
            this.f24399c.m13541c(new fzz(this, 12));
        }
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: p */
    public final void mo9130p(gey geyVar) {
        this.f24402f = geyVar;
    }

    @Override // p000.ilf
    /* JADX INFO: renamed from: q */
    public final void mo4159q(ilk ilkVar, hzj hzjVar) {
        this.f24410n.f24380d.mo4219b(ilkVar, hzjVar);
        this.f24416t.m9144b();
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: r */
    public final void mo9131r(gzl gzlVar) {
        geh gehVar = this.f24410n;
        if (gzl.OFF.equals(gzlVar)) {
            gehVar.f24380d.mo4223f(gzl.OFF);
            gehVar.m9095f();
        } else {
            gehVar.m9094e();
            gehVar.f24380d.mo4223f(gzlVar);
        }
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: s */
    public final void mo9132s(gez gezVar) {
        this.f24403g = gezVar;
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: t */
    public final void mo9133t() {
        int iIntValue = ((Integer) this.f24417u.mo10031c(gzy.f27040ax)).intValue();
        geh gehVar = this.f24410n;
        gehVar.m9094e();
        gehVar.f24380d.mo4227j(iIntValue == 1);
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: u */
    public final void mo9134u(boolean z, gex gexVar) {
        gfx gfxVar = (gfx) gexVar;
        mo9135v(z, gfxVar.f24628c, gfxVar.f24629d, gfxVar.f24630e);
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: v */
    public final void mo9135v(boolean z, int i, int i2, String str) {
        mo9136w(z, i, this.f24405i.getResources().getString(i2), str);
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: w */
    public final void mo9136w(boolean z, int i, String str, String str2) {
        geh gehVar = this.f24410n;
        if (z) {
            gehVar.f24380d.mo4225h(false);
            gehVar.m9097h(str2, true, i, str);
        } else {
            gehVar.m9097h(str2, false, i, str);
            gehVar.m9096g();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m9137x(gfb gfbVar) {
        gev gevVarMo5771g = gfbVar.mo5771g();
        if (!this.f24404h.m4248b(gevVarMo5771g)) {
            gfbVar.mo5840z(this, false);
            return;
        }
        boolean zMo5777m = gfbVar.mo5777m(this);
        gfbVar.mo5840z(this, zMo5777m);
        if (!zMo5777m) {
            int iMo5767c = gfbVar.mo5767c();
            String string = iMo5767c <= 0 ? null : this.f24404h.getResources().getString(iMo5767c);
            OptionsMenuView optionsMenuView = this.f24404h;
            synchronized (optionsMenuView) {
                Collection$EL.stream(optionsMenuView.f6842b).filter(new gfw(gevVarMo5771g, 6)).forEach(new fvi(string, 14));
            }
            return;
        }
        OptionsMenuView optionsMenuView2 = this.f24404h;
        synchronized (optionsMenuView2) {
            Collection$EL.stream(optionsMenuView2.f6842b).filter(new gfw(gevVarMo5771g, 5)).forEach(fax.f21158k);
        }
        mws mwsVarMo5774j = gfbVar.mo5774j();
        int size = mwsVarMo5774j.size();
        for (int i = 0; i < size; i++) {
            gfc gfcVar = (gfc) mwsVarMo5774j.get(i);
            if (gfbVar.mo5834v(this, gfcVar)) {
                OptionsMenuView optionsMenuView3 = this.f24404h;
                gev gevVarMo5771g2 = gfbVar.mo5771g();
                synchronized (optionsMenuView3) {
                    Collection$EL.stream(optionsMenuView3.f6842b).filter(new gfw(gevVarMo5771g2, 7)).forEach(new fvi(gfcVar, 16));
                }
            } else {
                OptionsMenuView optionsMenuView4 = this.f24404h;
                gev gevVarMo5771g3 = gfbVar.mo5771g();
                synchronized (optionsMenuView4) {
                    Collection$EL.stream(optionsMenuView4.f6842b).filter(new gfw(gevVarMo5771g3, 4)).forEach(new fvi(gfcVar, 13));
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m9138y() {
        this.f24407k.get();
        this.f24408l.size();
        jvd.m13540d();
        if (this.f24407k.get()) {
            this.f24399c.m13541c(new fzz(this, 13));
        } else {
            if (this.f24408l.isEmpty()) {
                return;
            }
            this.f24399c.m13541c(new fzz(this, 14));
        }
    }

    @Override // p000.gfa
    /* JADX INFO: renamed from: z */
    public final void mo9139z(View view, View view2) {
        lku.m15613H(jvd.m13540d());
        this.f24400d.mo13961e("OptionsBarCtrl#wire");
        if (view instanceof OptionsMenuContainer) {
            OptionsMenuContainer optionsMenuContainer = (OptionsMenuContainer) view;
            this.f24405i = optionsMenuContainer;
            optionsMenuContainer.m4238e().f6848h = new AmbientModeSupport.AmbientController(this);
            optionsMenuContainer.f6832j = new GestureDetector(optionsMenuContainer.f6829g, new gge(optionsMenuContainer, this));
            int i = 5;
            optionsMenuContainer.setOnTouchListener(new cln(optionsMenuContainer, i));
            OptionsMenuView optionsMenuViewM4238e = this.f24405i.m4238e();
            this.f24404h = optionsMenuViewM4238e;
            optionsMenuViewM4238e.f6846f = this;
            optionsMenuViewM4238e.f6843c = true;
            LinearLayout linearLayout = optionsMenuViewM4238e.f6847g;
            linearLayout.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 0, 0);
            optionsMenuViewM4238e.f6847g.setLayoutParams(marginLayoutParams);
            this.f24405i.m4239f(new hrj(this, 1));
            KeyEvent.Callback callbackM4234a = this.f24405i.m4234a();
            geh gehVar = this.f24410n;
            gehVar.f24380d = (gfn) callbackM4234a;
            int i2 = 2;
            gehVar.f24380d.setOnClickListener(new flr(gehVar, i2));
            int i3 = 3;
            gehVar.f24381e.m13537d(gehVar.f24378b.mo3830a(new gcu(gehVar, i3), gehVar.f24379c));
            ((gfa) gehVar.f24377a.get()).mo9121g(gehVar);
            Context context = this.f24405i.getContext();
            View viewM4236c = this.f24405i.m4236c();
            viewM4236c.setOnClickListener(new flr(this, i3));
            viewM4236c.setOnLongClickListener(new iyu(context, 1));
            int i4 = 6;
            if (view2 instanceof TimerWidget) {
                mrm mrmVarM16828h = mrm.m16828h((gfl) Collection$EL.stream(this.f24411o).filter(fjv.f22311e).findFirst().map(new cwp(this, 14)).orElse(null));
                if (mrmVarM16828h.mo16813g()) {
                    ges gesVar = this.f24416t;
                    TimerWidget timerWidget = (TimerWidget) view2;
                    gfl gflVar = (gfl) mrmVarM16828h.mo16809c();
                    gesVar.f24432i = timerWidget;
                    gfe gfeVar = new gfe() { // from class: ger
                        @Override // p000.gfe
                        /* JADX INFO: renamed from: bM */
                        public final void mo9116bM(gfc gfcVar, gev gevVar, int i5) {
                            gfe gfeVar2 = this;
                            gfc gfcVar2 = ges.f24424a;
                            if (gevVar.equals(gev.TIMER)) {
                                gfeVar2.mo9116bM(gfcVar, gevVar, 3);
                            }
                        }
                    };
                    gfc gfcVar = (gfc) ((mzq) ges.f24425b).f41853c.get(gesVar.f24426c.mo3831be());
                    if (gfcVar == null) {
                        gfcVar = ges.f24424a;
                    }
                    gesVar.f24431h = new ggg(context, gflVar, gfcVar, gfeVar, null, null, 0, true, false);
                    ((LinearLayout) timerWidget.findViewById(C0100R.id.timer_widget_row_holder)).addView(gesVar.f24431h);
                    gesVar.f24431h.m9207e();
                    gesVar.f24431h.m9206d();
                    gesVar.f24428e.m13537d(gesVar.f24426c.mo3830a(new gcu(gesVar, i), gesVar.f24427d));
                    gesVar.f24428e.m13537d(gesVar.f24429f.mo3830a(new gcu(gesVar, i4), gesVar.f24427d));
                    AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(gesVar);
                    ((ite) gesVar.f24430g).f32105j.add(ambientController);
                    gesVar.f24428e.m13537d(new eip(gesVar, ambientController, 18, null, null));
                }
            }
            C1112xa c1112xa = new C1112xa();
            C1112xa c1112xa2 = new C1112xa();
            Collection$EL.forEach(this.f24411o, new cwu(c1112xa, c1112xa2, i2));
            if (!c1112xa2.isEmpty()) {
                ((nbe) ((nbe) f24397a.m17252c()).mo17276G((char) 2611)).mo17290o("wire: Some menu items have the same category:");
                Collection$EL.stream(this.f24411o).filter(new dam(c1112xa2, 13)).forEach(fax.f21152e);
            }
            this.f24413q.m13537d(this.f24398b.mo3830a(new gcu(this, 4), not.INSTANCE));
            Collection$EL.forEach(this.f24411o, new fvi(this, i4));
            Collection$EL.forEach(this.f24411o, new fvi(this, 7));
        } else {
            ((nbe) ((nbe) f24397a.m17252c()).mo17276G((char) 2610)).mo17290o("OptionsMenuContainer is null!");
        }
        this.f24400d.mo13962f();
    }
}
