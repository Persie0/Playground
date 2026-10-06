package com.google.android.apps.camera.p014ui.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.optionsbar.view.TimerWidget;
import com.google.android.apps.camera.p014ui.breadcrumbs.BreadcrumbsView;
import com.google.android.apps.camera.p014ui.layout.GcaLayout;
import com.google.android.apps.camera.p014ui.mars.MarsSwitch;
import com.google.android.apps.camera.p014ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.p014ui.modeswitcher.MoreModesGrid;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p000.cln;
import p000.dac;
import p000.dax;
import p000.dfg;
import p000.dhv;
import p000.dib;
import p000.dox;
import p000.emw;
import p000.era;
import p000.esl;
import p000.fan;
import p000.fbj;
import p000.fbp;
import p000.gxn;
import p000.hmy;
import p000.hyd;
import p000.hzd;
import p000.hze;
import p000.hzj;
import p000.hzk;
import p000.hzm;
import p000.hzn;
import p000.hzo;
import p000.hzp;
import p000.hzt;
import p000.iak;
import p000.idd;
import p000.idu;
import p000.ihk;
import p000.iix;
import p000.iiy;
import p000.ikw;
import p000.ilf;
import p000.ilk;
import p000.ill;
import p000.isb;
import p000.jpd;
import p000.jvd;
import p000.jvh;
import p000.jwf;
import p000.jwn;
import p000.jww;
import p000.kpb;
import p000.lku;
import p000.mpw;
import p000.mqu;
import p000.mrm;
import p000.nbe;
import p000.nbh;
import p000.oyo;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MainActivityLayout extends GcaLayout implements fbp, fbj {

    /* JADX INFO: renamed from: v */
    private static final nbh f7244v = nbh.m17259h("com/google/android/apps/camera/ui/views/MainActivityLayout");

    /* JADX INFO: renamed from: A */
    private FrontLensIndicatorOverlay f7245A;

    /* JADX INFO: renamed from: B */
    private CutoutBar f7246B;

    /* JADX INFO: renamed from: C */
    private MoreModesGrid f7247C;

    /* JADX INFO: renamed from: D */
    private OptionsMenuContainer f7248D;

    /* JADX INFO: renamed from: E */
    private GradientBar f7249E;

    /* JADX INFO: renamed from: F */
    private boolean f7250F;

    /* JADX INFO: renamed from: G */
    private ilk f7251G;

    /* JADX INFO: renamed from: H */
    private View f7252H;

    /* JADX INFO: renamed from: c */
    public final Map f7253c;

    /* JADX INFO: renamed from: d */
    public MarsSwitch f7254d;

    /* JADX INFO: renamed from: e */
    public iak f7255e;

    /* JADX INFO: renamed from: f */
    public TimerWidget f7256f;

    /* JADX INFO: renamed from: g */
    public dac f7257g;

    /* JADX INFO: renamed from: h */
    public final mrm f7258h;

    /* JADX INFO: renamed from: i */
    public mrm f7259i;

    /* JADX INFO: renamed from: j */
    public mrm f7260j;

    /* JADX INFO: renamed from: k */
    public mrm f7261k;

    /* JADX INFO: renamed from: l */
    public mrm f7262l;

    /* JADX INFO: renamed from: m */
    public mrm f7263m;

    /* JADX INFO: renamed from: n */
    public AtomicReference f7264n;

    /* JADX INFO: renamed from: o */
    public jww f7265o;

    /* JADX INFO: renamed from: p */
    public dhv f7266p;

    /* JADX INFO: renamed from: q */
    public fan f7267q;

    /* JADX INFO: renamed from: r */
    public kpb f7268r;

    /* JADX INFO: renamed from: s */
    public jwn f7269s;

    /* JADX INFO: renamed from: t */
    public jww f7270t;

    /* JADX INFO: renamed from: u */
    public hmy f7271u;

    /* JADX INFO: renamed from: w */
    private final Set f7272w;

    /* JADX INFO: renamed from: x */
    @Deprecated
    private final Set f7273x;

    /* JADX INFO: renamed from: y */
    private ModeSwitcher f7274y;

    /* JADX INFO: renamed from: z */
    private BreadcrumbsView f7275z;

    /* JADX WARN: Multi-variable type inference failed */
    public MainActivityLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7272w = mpw.m16752D();
        this.f7273x = new HashSet();
        this.f7253c = new LinkedHashMap();
        mqu mquVar = mqu.f41450a;
        this.f7258h = mquVar;
        this.f7259i = mquVar;
        this.f7260j = mquVar;
        this.f7261k = mquVar;
        this.f7262l = mquVar;
        this.f7263m = mquVar;
        this.f7252H = null;
        ((iiy) ((emw) context).mo4190b(iiy.class)).mo7793b(this);
        this.f7267q.m8097e(this);
    }

    /* JADX INFO: renamed from: A */
    private final void m4452A() {
        this.f7250F = true;
        post(new idd(this, 7));
    }

    /* JADX INFO: renamed from: B */
    private final boolean m4453B(hzo hzoVar) {
        hzt hztVarM10959a;
        if (this.f7264n.get() != null && ((hzp) this.f7264n.get()).f30074a.equals(hzoVar) && !this.f7250F) {
            return false;
        }
        this.f7250F = false;
        if (!hzoVar.m10947a()) {
            this.f7264n.set(hzp.m10949a(hzoVar, this.f7264n.get() == null ? hzm.f30037a : ((hzp) this.f7264n.get()).f30075b, null, this.f7264n.get() == null ? null : ((hzp) this.f7264n.get()).f30077d));
            m4452A();
            return false;
        }
        Trace.beginSection("updateLayoutBoxes");
        hzm hzmVarM10916d = hzk.m10916d(hzoVar, hzoVar.f30073i.equals(hzj.SIMPLIFIED_LAYOUT), getContext(), this.f7271u, new dfg(this, 7));
        if (hzmVarM10916d.f30054r) {
            m4452A();
        }
        if (this.f7252H != null) {
            hztVarM10959a = hzoVar.f30073i.equals(hzj.SIMPLIFIED_LAYOUT) ? hzt.m10959a(new Size(hzmVarM10916d.f30041e.width(), hzmVarM10916d.f30041e.height()), new Rect(), new Rect(), 17) : hzt.m10959a(new Size(hzmVarM10916d.f30041e.width(), hzmVarM10916d.f30041e.height()), new Rect(), new Rect(hzmVarM10916d.f30041e.left, hzmVarM10916d.f30041e.top, hzmVarM10916d.f30038b.getWidth() - hzmVarM10916d.f30041e.right, hzmVarM10916d.f30038b.getHeight() - hzmVarM10916d.f30041e.bottom), 51);
        } else {
            hztVarM10959a = null;
        }
        if (this.f7264n.get() != null && hzmVarM10916d.equals(((hzp) this.f7264n.get()).f30075b)) {
            hzmVarM10916d = ((hzp) this.f7264n.get()).f30075b;
        }
        if (this.f7264n.get() != null && Objects.equals(hztVarM10959a, ((hzp) this.f7264n.get()).f30076c)) {
            hztVarM10959a = ((hzp) this.f7264n.get()).f30076c;
        }
        this.f7264n.set(hzp.m10949a(hzoVar, hzmVarM10916d, hztVarM10959a, this.f7264n.get() != null ? ((hzp) this.f7264n.get()).f30077d : null));
        Trace.endSection();
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static final void m4454r(hzo hzoVar, hze hzeVar, hzd hzdVar) {
        ilk ilkVarM4459y = m4459y(hzoVar.f30071g, hzoVar.f30073i, hzdVar);
        hzeVar.onLayoutUpdated(ilkVarM4459y);
        hzeVar.onLayoutUpdated(hzoVar.f30073i, ilkVarM4459y);
    }

    /* JADX INFO: renamed from: u */
    private final ilk m4455u(Context context, Display display, hzj hzjVar, int i, int i2) {
        if (hzjVar.equals(hzj.SIMPLIFIED_LAYOUT)) {
            return ilk.PORTRAIT;
        }
        boolean z = true;
        if ((context.getResources().getDisplayMetrics().heightPixels <= context.getResources().getDisplayMetrics().widthPixels || i2 <= i) && (context.getResources().getDisplayMetrics().heightPixels >= context.getResources().getDisplayMetrics().widthPixels || i2 >= i)) {
            z = false;
        }
        ilk ilkVarM11426b = ilk.m11426b(display, context);
        if (this.f7251G == null) {
            this.f7251G = ilkVarM11426b;
        }
        if (!z) {
            return this.f7251G;
        }
        this.f7251G = ilkVarM11426b;
        return ilkVarM11426b;
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    private final void m4456v(ilk ilkVar, hzj hzjVar) {
        Iterator it = this.f7273x.iterator();
        while (it.hasNext()) {
            ((ilf) it.next()).mo4159q(ilkVar, hzjVar);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    private static final ilk m4457w(hzj hzjVar, ilk ilkVar, boolean z) {
        if (hzjVar.equals(hzj.TABLET_LAYOUT) || hzjVar.equals(hzj.STARFISH_LAYOUT)) {
            ilkVar = ilk.PORTRAIT;
        }
        return z ? ilkVar.m11429d() : ilkVar;
    }

    /* JADX INFO: renamed from: x */
    private final void m4458x(Size size) {
        m4476q(size, null);
    }

    /* JADX INFO: renamed from: y */
    private static final ilk m4459y(ilk ilkVar, hzj hzjVar, hzd hzdVar) {
        hzj hzjVar2 = hzj.TABLET_LAYOUT;
        hzd hzdVar2 = hzd.NONE;
        switch (hzjVar) {
            case TABLET_LAYOUT:
                break;
            case PHONE_LAYOUT:
            case SIMPLIFIED_LAYOUT:
                return ilkVar;
            case f30014d:
                return ilk.PORTRAIT;
            case STARFISH_LAYOUT:
                if (!ilk.m11427e(ilkVar)) {
                    return ilk.PORTRAIT;
                }
                break;
            default:
                throw new IllegalArgumentException("Unexpected CameraLayoutDecision: ".concat(String.valueOf(String.valueOf(hzjVar))));
        }
        switch (hzdVar.ordinal()) {
            case 0:
                return ilk.PORTRAIT;
            case 1:
                return ilk.REVERSE_LANDSCAPE;
            case 2:
                return ilk.LANDSCAPE;
            default:
                throw new IllegalArgumentException("Unexpected LayoutTransform: ".concat(String.valueOf(String.valueOf(hzdVar))));
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    private static final ilk m4460z(hzj hzjVar, ilk ilkVar) {
        return m4457w(hzjVar, ilkVar, false);
    }

    /* JADX INFO: renamed from: a */
    public final hzo m4461a() {
        return this.f7264n.get() == null ? hzo.f30065a : ((hzp) this.f7264n.get()).f30074a;
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        requestLayout();
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final void m4462c(ilf ilfVar) {
        this.f7273x.add(ilfVar);
        ilk ilkVarM4460z = m4460z(m4461a().f30073i, m4461a().f30071g);
        if (ilk.PORTRAIT.equals(ilkVarM4460z)) {
            return;
        }
        post(new gxn(this, ilfVar, ilkVarM4460z, 14));
    }

    /* JADX INFO: renamed from: d */
    public final void m4463d(hze hzeVar, hzd hzdVar) {
        jvd.m13538a();
        this.f7253c.put(hzeVar, hzdVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            Trace.beginSection("MAL.dispatchApplyWindowInsets");
            return super.dispatchApplyWindowInsets(windowInsets);
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        Trace.beginSection(yTyWiTtGtnBhy.yIsnPudve);
        oyo.m19194j(getContext());
        super.dispatchConfigurationChanged(configuration);
        oyo.m19195k();
        Trace.endSection();
    }

    /* JADX INFO: renamed from: e */
    public final void m4464e() {
        View view = this.f7252H;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
            this.f7252H = null;
            requestLayout();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4465f(View view) {
        this.f7252H = view;
        if (this.f7264n.get() != null) {
            hzm hzmVar = ((hzp) this.f7264n.get()).f30075b;
            hzn hznVarM10948b = hzo.f30065a.m10948b();
            hznVarM10948b.f30058c = m4461a().f30069e;
            hzo hzoVarM10941a = hznVarM10948b.m10941a();
            AtomicReference atomicReference = this.f7264n;
            atomicReference.set(hzp.m10949a(hzoVarM10941a, hzmVar, null, ((hzp) atomicReference.get()).f30077d));
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public final void m4466g(int i, int i2, Integer num) {
        m4476q(new Size(i, i2), num);
    }

    /* JADX INFO: renamed from: h */
    public final void m4467h() {
        Size size = m4461a().f30066b;
        if (size == null) {
            m4458x(null);
        } else {
            m4458x(new Size(Math.max(size.getWidth(), size.getHeight()), Math.min(size.getWidth(), size.getHeight())));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4468i(hzj hzjVar, ilk ilkVar, ikw ikwVar) {
        if (!this.f7262l.mo16813g() || ilkVar == null || hzjVar == null) {
            return;
        }
        dox doxVar = (dox) this.f7262l.mo16809c();
        doxVar.mo6479o(m4457w(hzjVar, ilkVar, hzjVar.equals(hzj.f30014d)));
        doxVar.mo6482r(hzjVar, ikwVar);
    }

    /* JADX INFO: renamed from: j */
    public final void m4469j(hzj hzjVar, ilk ilkVar, ikw ikwVar) {
        if (!this.f7261k.mo16813g() || ilkVar == null || hzjVar == null || ikwVar == null) {
            return;
        }
        ((isb) this.f7261k.mo16809c()).mo11665g(m4457w(hzjVar, ilkVar, hzjVar.equals(hzj.f30014d)), hzjVar);
        ((isb) this.f7261k.mo16809c()).mo11669k(hzjVar, ikwVar);
    }

    /* JADX INFO: renamed from: k */
    public final void m4470k(hzj hzjVar, ilk ilkVar) {
        idu iduVar;
        MarsSwitch marsSwitch = this.f7254d;
        if (marsSwitch == null || ilkVar == null || hzjVar == null) {
            return;
        }
        marsSwitch.m4374b(m4460z(hzjVar, ilkVar));
        iak iakVar = this.f7255e;
        ilk ilkVarM4459y = m4459y(ilkVar, hzjVar, hzd.TO_RIGHT);
        if (!iakVar.f30150c.mo6184l(dib.f11361co) || (iduVar = iakVar.f30160m) == null) {
            return;
        }
        iduVar.m11141g(ilkVarM4459y);
    }

    /* JADX INFO: renamed from: l */
    public final void m4471l(hzj hzjVar, ilk ilkVar) {
        dac dacVar = this.f7257g;
        if (dacVar == null || ilkVar == null || hzjVar == null) {
            return;
        }
        dacVar.mo5795g(m4457w(hzjVar, ilkVar, hzjVar.equals(hzj.f30014d)));
    }

    /* JADX INFO: renamed from: m */
    public final void m4472m(hzj hzjVar, ilk ilkVar) {
        if (!this.f7263m.mo16813g() || ilkVar == null || hzjVar == null) {
            return;
        }
        if (hzj.f30014d.equals(hzjVar)) {
            ilkVar = ilkVar.m11429d();
        }
        ((era) this.f7263m.mo16809c()).mo7655b(m4460z(hzjVar, ilkVar));
    }

    /* JADX INFO: renamed from: n */
    public final void m4473n() {
        m4461a();
    }

    /* JADX INFO: renamed from: o */
    public final void m4474o(hzj hzjVar, ilk ilkVar) {
        if (!this.f7260j.mo16813g() || ilkVar == null || hzjVar == null) {
            return;
        }
        ((dax) this.f7260j.mo16809c()).mo5857l(m4457w(hzjVar, ilkVar, hzjVar.equals(hzj.f30014d)));
        ((dax) this.f7260j.mo16809c()).mo5856k(hzjVar, ilkVar);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f7249E = (GradientBar) findViewById(C0100R.id.gradient_bar);
        this.f7246B = (CutoutBar) findViewById(C0100R.id.cutout_bar);
        this.f7245A = (FrontLensIndicatorOverlay) findViewById(C0100R.id.front_lens_indicator_overlay);
        this.f7274y = (ModeSwitcher) findViewById(C0100R.id.mode_switcher);
        this.f7275z = (BreadcrumbsView) findViewById(C0100R.id.breadcrumbs_ui);
        this.f7247C = (MoreModesGrid) findViewById(C0100R.id.more_modes_grid);
        this.f7248D = (OptionsMenuContainer) findViewById(C0100R.id.options_menu_container);
        m4463d((hze) findViewById(C0100R.id.bottom_bar), hzd.TO_RIGHT);
        m4463d(new iix(this), hzd.TO_LEFT);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        for (jvh jvhVar : this.f7272w) {
            if (jvh.m13546D(motionEvent) && jvhVar.mo11402a(new ihk(motionEvent, getRootView()))) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (this.f7264n.get() == null) {
                    z = false;
                } else {
                    Rect rect = ((hzp) this.f7264n.get()).f30075b.f30045i;
                    z = x > ((float) rect.left) && x < ((float) rect.right) && y > ((float) rect.top) && y < ((float) rect.bottom);
                }
                z2 |= !z;
            }
        }
        return z2 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.google.android.apps.camera.p014ui.layout.GcaLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        oyo.m19195k();
    }

    @Override // com.google.android.apps.camera.p014ui.layout.GcaLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int width;
        int width2;
        Trace.beginSection("MAL.onMeasurePrologue");
        Context context = getContext();
        oyo.m19194j(context);
        Size size = new Size(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        hzj hzjVarM13429j = jpd.m13429j(getContext(), getDisplay(), this.f7266p, (ikw) this.f7265o.mo3831be(), (hyd) this.f7269s.mo3831be(), this.f7268r);
        ilk ilkVarM4455u = m4455u(context, getDisplay(), hzjVarM13429j, size.getWidth(), size.getHeight());
        if (hzjVarM13429j.equals(hzj.f30014d) && !ilkVarM4455u.equals(ilk.LANDSCAPE)) {
            hzjVarM13429j = jpd.m13430k(getContext(), getDisplay(), this.f7268r);
        }
        hzo hzoVarM4461a = m4461a();
        Size size2 = hzoVarM4461a.f30067c;
        Integer num = hzoVarM4461a.f30069e;
        hzn hznVarM10948b = hzoVarM4461a.m10948b();
        hznVarM10948b.m10946f(ilkVarM4455u);
        hznVarM10948b.f30056a = size;
        hznVarM10948b.m10945e((ikw) this.f7265o.mo3831be());
        hznVarM10948b.m10943c(ill.m11433d(this));
        if (size2 != null) {
            size = size2;
        }
        hznVarM10948b.f30057b = size;
        hznVarM10948b.m10942b(hzjVarM13429j);
        hznVarM10948b.f30058c = Integer.valueOf(num != null ? num.intValue() : 90);
        hzo hzoVarM10941a = hznVarM10948b.m10941a();
        lku.m15657k(hzoVarM10941a.m10947a());
        if (m4453B(hzoVarM10941a)) {
            ilk ilkVarM4457w = m4457w(hzjVarM13429j, hzoVarM10941a.f30071g, hzjVarM13429j.equals(hzj.f30014d));
            ModeSwitcher modeSwitcher = this.f7274y;
            if (modeSwitcher.f7066g != ilkVarM4457w) {
                modeSwitcher.f7066g = ilkVarM4457w;
                modeSwitcher.m4390d();
            }
            MoreModesGrid moreModesGrid = this.f7247C;
            moreModesGrid.f7076c = ilkVarM4457w;
            moreModesGrid.m4400c();
            BreadcrumbsView breadcrumbsView = this.f7275z;
            ilk ilkVarM4460z = m4460z(hzjVarM13429j, hzoVarM10941a.f30071g);
            if (breadcrumbsView.f6992a != ilkVarM4460z) {
                breadcrumbsView.f6992a = ilkVarM4460z;
                breadcrumbsView.m4316a();
            }
            ilk ilkVar = hzoVarM10941a.f30071g;
            if (this.f7248D != null && hzjVarM13429j != null && ilkVar != null) {
                if (jpd.m13431l(hzjVarM13429j)) {
                    i3 = 0;
                } else {
                    if (ilk.m11427e(ilkVar)) {
                        width = ((hzp) this.f7264n.get()).f30075b.f30041e.top;
                        width2 = ((hzp) this.f7264n.get()).f30075b.f30040d.top;
                    } else if (ilkVar == ilk.LANDSCAPE) {
                        width = ((hzp) this.f7264n.get()).f30075b.f30041e.left;
                        width2 = ((hzp) this.f7264n.get()).f30075b.f30040d.left;
                    } else {
                        width = ((hzp) this.f7264n.get()).f30075b.f30038b.getWidth() - ((hzp) this.f7264n.get()).f30075b.f30041e.right;
                        width2 = ((hzp) this.f7264n.get()).f30075b.f30038b.getWidth() - ((hzp) this.f7264n.get()).f30075b.f30040d.right;
                    }
                    i3 = width - width2;
                }
                OptionsMenuContainer optionsMenuContainer = this.f7248D;
                ilk ilkVarM4457w2 = m4457w(hzjVarM13429j, ilkVar, hzjVarM13429j.equals(hzj.f30014d));
                optionsMenuContainer.f6825c = hzjVarM13429j;
                optionsMenuContainer.f6824b = ilkVarM4457w2;
                optionsMenuContainer.f6823a = i3;
                optionsMenuContainer.m4240g();
                if (hzjVarM13429j.equals(hzj.f30014d)) {
                    GestureDetector gestureDetector = this.f7248D.f6832j;
                    if (gestureDetector != null) {
                        setOnTouchListener(new cln(gestureDetector, 19));
                    }
                } else {
                    setOnTouchListener(null);
                }
            }
            m4471l(hzjVarM13429j, hzoVarM10941a.f30071g);
            m4474o(hzjVarM13429j, hzoVarM10941a.f30071g);
            m4472m(hzjVarM13429j, hzoVarM10941a.f30071g);
            m4470k(hzjVarM13429j, hzoVarM10941a.f30071g);
            m4468i(hzjVarM13429j, hzoVarM10941a.f30071g, (ikw) this.f7265o.mo3831be());
            m4469j(hzjVarM13429j, hzoVarM10941a.f30071g, (ikw) this.f7265o.mo3831be());
            GradientBar gradientBar = this.f7249E;
            hzj hzjVar = hzoVarM10941a.f30073i;
            ilk ilkVarM4457w3 = m4457w(hzjVar, hzoVarM10941a.f30071g, hzjVar.equals(hzj.f30014d));
            if (gradientBar.f7243a != ilkVarM4457w3) {
                gradientBar.f7243a = ilkVarM4457w3;
                gradientBar.m4451a();
            }
            hzj hzjVar2 = m4461a().f30073i;
            CutoutBar cutoutBar = this.f7246B;
            int i4 = (hzjVar2 == hzj.PHONE_LAYOUT || hzjVar2 == hzj.SIMPLIFIED_LAYOUT) ? 0 : 8;
            cutoutBar.setVisibility(i4);
            CutoutBar cutoutBar2 = this.f7246B;
            ilk ilkVar2 = hzoVarM10941a.f30071g;
            if (cutoutBar2.f7224g != ilkVar2) {
                cutoutBar2.f7224g = ilkVar2;
                cutoutBar2.m4449a();
            }
            int[] iArrM11434e = ill.m11434e(cutoutBar2);
            if (ilk.m11427e(ilkVar2)) {
                cutoutBar2.f7221d = iArrM11434e[0];
                cutoutBar2.f7222e = iArrM11434e[1];
            } else {
                cutoutBar2.f7221d = iArrM11434e[1];
                cutoutBar2.f7222e = iArrM11434e[0];
            }
            FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.f7245A;
            ilk ilkVar3 = hzoVarM10941a.f30071g;
            if (frontLensIndicatorOverlay.f7240p != ilkVar3) {
                frontLensIndicatorOverlay.f7240p = ilkVar3;
                frontLensIndicatorOverlay.m4450a();
            }
            int[] iArrM11434e2 = ill.m11434e(frontLensIndicatorOverlay);
            if (ilk.m11427e(ilkVar3)) {
                frontLensIndicatorOverlay.f7235k = iArrM11434e2[0];
                frontLensIndicatorOverlay.f7236l = iArrM11434e2[1];
            } else {
                frontLensIndicatorOverlay.f7235k = iArrM11434e2[1];
                frontLensIndicatorOverlay.f7236l = iArrM11434e2[0];
            }
            m4473n();
            m4475p();
            m4456v(m4460z(hzoVarM10941a.f30073i, hzoVarM10941a.f30071g), hzoVarM10941a.f30073i);
            boolean zIsInMultiWindowMode = ((Activity) getContext()).isInMultiWindowMode();
            if (((Boolean) ((jwf) this.f7270t).f34942d).booleanValue() != zIsInMultiWindowMode) {
                this.f7270t.mo3415bf(Boolean.valueOf(zIsInMultiWindowMode));
            }
            hzo hzoVarM4461a2 = m4461a();
            for (Map.Entry entry : this.f7253c.entrySet()) {
                m4454r(hzoVarM4461a2, (hze) entry.getKey(), (hzd) entry.getValue());
            }
        }
        Trace.endSection();
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p */
    public final void m4475p() {
        if (this.f7256f == null) {
            return;
        }
        hzj hzjVar = m4461a().f30073i;
        ikw ikwVar = m4461a().f30072h;
        boolean z = hzjVar.equals(hzj.f30014d) && (ikwVar.equals(ikw.PORTRAIT) || ikwVar.equals(ikw.PHOTO) || ikwVar.equals(ikw.LONG_EXPOSURE));
        this.f7256f.setVisibility(true != z ? 8 : 0);
    }

    /* JADX INFO: renamed from: q */
    public final void m4476q(Size size, Integer num) {
        if (getDisplay() == null) {
            ((nbe) ((nbe) f7244v.m17252c()).mo17276G((char) 4275)).mo17290o("Display is null; not setting preview size.");
            post(new gxn(this, size, num, 15));
            return;
        }
        hzo hzoVarM4461a = m4461a();
        Size size2 = hzoVarM4461a.f30066b;
        ilk ilkVarM4455u = size2 != null ? m4455u(getContext(), getDisplay(), hzoVarM4461a.f30073i, size2.getWidth(), size2.getHeight()) : hzoVarM4461a.f30071g;
        hzn hznVarM10948b = hzoVarM4461a.m10948b();
        hznVarM10948b.m10946f(ilkVarM4455u);
        hznVarM10948b.f30057b = size;
        if (num == null) {
            num = hzoVarM4461a.f30069e;
        }
        hznVarM10948b.f30058c = num;
        hznVarM10948b.m10944d();
        hzo hzoVarM10941a = hznVarM10948b.m10941a();
        if (m4453B(hzoVarM10941a)) {
            requestLayout();
            invalidate();
            m4456v(m4460z(hzoVarM10941a.f30073i, hzoVarM10941a.f30071g), hzoVarM10941a.f30073i);
        }
        if (this.f7259i.mo16813g()) {
            ViewfinderCover viewfinderCover = ((esl) ((AmbientMode.AmbientController) this.f7259i.mo16809c()).f1697a).f15335Q;
            if (viewfinderCover.f7293h) {
                return;
            }
            viewfinderCover.f7293h = true;
            viewfinderCover.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4477s(jvh jvhVar) {
        jvd.m13538a();
        this.f7272w.add(jvhVar);
    }

    /* JADX INFO: renamed from: t */
    public final void m4478t(jvh jvhVar) {
        jvd.m13538a();
        this.f7272w.remove(jvhVar);
    }
}
