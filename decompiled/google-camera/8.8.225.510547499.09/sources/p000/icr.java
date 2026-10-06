package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.p014ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.p014ui.modeswitcher.MoreModesGrid;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import p021j$.util.Collection$EL;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icr implements icx, icy, icn, fbp, fbj {

    /* JADX INFO: renamed from: a */
    public static final nbh f30372a = nbh.m17259h("com/google/android/apps/camera/ui/modeswitcher/ModeSwitcherControllerImpl");

    /* JADX INFO: renamed from: b */
    public final EnumMap f30373b;

    /* JADX INFO: renamed from: c */
    public final EnumMap f30374c;

    /* JADX INFO: renamed from: d */
    public ModeSwitcher f30375d;

    /* JADX INFO: renamed from: e */
    MoreModesGrid f30376e;

    /* JADX INFO: renamed from: f */
    public final igb f30377f;

    /* JADX INFO: renamed from: g */
    public boolean f30378g;

    /* JADX INFO: renamed from: h */
    public boolean f30379h;

    /* JADX INFO: renamed from: i */
    public kba f30380i;

    /* JADX INFO: renamed from: j */
    public final Context f30381j;

    /* JADX INFO: renamed from: k */
    public final kbz f30382k;

    /* JADX INFO: renamed from: l */
    public final elx f30383l;

    /* JADX INFO: renamed from: m */
    public idb f30384m;

    /* JADX INFO: renamed from: n */
    public mrm f30385n;

    /* JADX INFO: renamed from: o */
    public final jwn f30386o;

    /* JADX INFO: renamed from: p */
    public final jwn f30387p;

    /* JADX INFO: renamed from: q */
    public final jvb f30388q;

    /* JADX INFO: renamed from: r */
    public final jfs f30389r;

    /* JADX INFO: renamed from: s */
    private mrm f30390s;

    /* JADX INFO: renamed from: t */
    private boolean f30391t;

    /* JADX INFO: renamed from: u */
    private final ohb f30392u;

    /* JADX INFO: renamed from: v */
    private final jvd f30393v;

    /* JADX INFO: renamed from: w */
    private final ohb f30394w;

    /* JADX INFO: renamed from: x */
    private final oju f30395x;

    /* JADX INFO: renamed from: y */
    private final dhv f30396y;

    /* JADX INFO: renamed from: z */
    private final ics f30397z;

    public icr(Context context, jvb jvbVar, Map map, ModeSwitcher modeSwitcher, MoreModesGrid moreModesGrid, igb igbVar, dhv dhvVar, ohb ohbVar, ohb ohbVar2, oju ojuVar, jvd jvdVar, kbz kbzVar, elx elxVar, jfs jfsVar, jwn jwnVar, jwn jwnVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        EnumMap enumMap = new EnumMap(ikw.class);
        this.f30373b = enumMap;
        this.f30374c = new EnumMap(ikw.class);
        mqu mquVar = mqu.f41450a;
        this.f30390s = mquVar;
        this.f30391t = false;
        this.f30378g = false;
        this.f30379h = false;
        ico icoVar = new ico(0);
        this.f30397z = icoVar;
        this.f30385n = mquVar;
        this.f30381j = context;
        this.f30388q = jvbVar;
        this.f30375d = modeSwitcher;
        this.f30376e = moreModesGrid;
        this.f30377f = igbVar;
        this.f30396y = dhvVar;
        this.f30394w = ohbVar;
        this.f30395x = ojuVar;
        this.f30392u = ohbVar2;
        this.f30393v = jvdVar;
        this.f30382k = kbzVar;
        this.f30383l = elxVar;
        this.f30389r = jfsVar;
        this.f30386o = jwnVar;
        int i = dia.f11213a;
        dhvVar.mo6175c();
        this.f30387p = jwnVar2;
        modeSwitcher.f7069j = icoVar;
        modeSwitcher.f7061b = this;
        enumMap.putAll(map);
        Iterator it = enumMap.keySet().iterator();
        while (it.hasNext()) {
            m11083i((ikw) it.next());
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m11075B() {
        if (this.f30385n.mo16813g()) {
            ((jvb) this.f30385n.mo16809c()).close();
        }
    }

    /* JADX INFO: renamed from: C */
    private final boolean m11076C(ikw ikwVar) {
        return this.f30374c.get(ikwVar) == this.f30375d;
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: A */
    public final void mo11077A(boolean z) {
        this.f30375d.m4391e(z, true);
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: a */
    public final ila mo11078a() {
        return this.f30375d.f7062c.m11063a();
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        m11075B();
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: c */
    public final ila mo11079c() {
        return new ici(this.f30375d.f7062c, 0);
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: d */
    public final ila mo11080d() {
        return new ici(this.f30375d.f7062c, 2);
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: e */
    public final kba mo11081e() {
        mo11090p(false);
        return new hcu(this, 12);
    }

    @Override // p000.icy
    /* JADX INFO: renamed from: f */
    public final void mo11007f(ikw ikwVar) {
        m11075B();
        this.f30391t = false;
        if (this.f30390s.mo16813g()) {
            ((icy) this.f30390s.mo16809c()).mo11007f(ikwVar);
        }
        m11098x(ikwVar);
    }

    @Override // p000.icy
    /* JADX INFO: renamed from: g */
    public final void mo11008g(ikw ikwVar) {
        m11075B();
        this.f30391t = true;
        if (this.f30390s.mo16813g()) {
            ((icy) this.f30390s.mo16809c()).mo11008g(ikwVar);
        }
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: h */
    public final kba mo11082h() {
        m11091q(4);
        return new hcu(this, 13);
    }

    /* JADX INFO: renamed from: i */
    public final void m11083i(ikw ikwVar) {
        jwn jwnVar = (jwn) this.f30373b.get(ikwVar);
        if (jwnVar != null) {
            this.f30388q.m13537d(jwnVar.mo3830a(new gmb(this, ikwVar, 13), not.INSTANCE));
        }
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: j */
    public final void mo11084j(ikw ikwVar) {
        lku.m15607B(!m11099y(ikwVar), "Mode %s already configured in More Modes", ikwVar);
        this.f30374c.put(ikwVar, this.f30375d);
        this.f30375d.m4389c(ikwVar);
        m11093s(ikwVar);
    }

    /* JADX INFO: renamed from: k */
    public final void m11085k(ikw ikwVar) {
        lku.m15607B(!m11076C(ikwVar), "Mode %s already configured in mode list", ikwVar);
        MoreModesGrid moreModesGrid = this.f30376e;
        moreModesGrid.getClass();
        this.f30374c.put(ikwVar, moreModesGrid);
        MoreModesGrid moreModesGrid2 = this.f30376e;
        jvd.m13538a();
        lku.m15670x(ikwVar != ikw.UNINITIALIZED, HRLmc.hhDbnGLANVW);
        lku.m15670x(ikwVar != ikw.MORE_MODES, "Cannot append MORE_MODES mode");
        moreModesGrid2.f7075b.add(new icw(ikwVar));
        if (!moreModesGrid2.f7078e) {
            moreModesGrid2.f7078e = true;
            moreModesGrid2.requestLayout();
        }
        m11093s(ikwVar);
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: l */
    public final void mo11086l(ikw ikwVar) {
        lku.m15669w(!m11076C(ikw.MORE_MODES));
        this.f30375d.m4389c(ikw.MORE_MODES);
        this.f30374c.put(ikw.MORE_MODES, this.f30375d);
        ModeSwitcher modeSwitcher = this.f30375d;
        ikwVar.getClass();
        modeSwitcher.f7070k = ikwVar;
        boolean z = modeSwitcher.f7064e;
        ikw ikwVar2 = modeSwitcher.f7070k;
        ick ickVar = modeSwitcher.f7062c;
        ickVar.f30350k = ikwVar2;
        ickVar.f30354o = 2;
        ickVar.f30342c.isEmpty();
        modeSwitcher.f7064e = true;
        modeSwitcher.setEnabled(true);
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: m */
    public final void mo11087m() {
        ModeSwitcher modeSwitcher = this.f30375d;
        if (modeSwitcher != null) {
            inw.m11549a(4, modeSwitcher);
        }
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: n */
    public final void mo11088n(boolean z) {
        MoreModesGrid moreModesGrid = this.f30376e;
        if (moreModesGrid != null) {
            if (z) {
                boolean z2 = !this.f30391t;
                lku.m15670x(true, "use hideImmediately to transition without animation");
                moreModesGrid.f7079f.cancel();
                AnimatorSet animatorSet = new AnimatorSet();
                if (z2) {
                    animatorSet.playTogether(moreModesGrid.m4399b(false), moreModesGrid.m4398a(false));
                } else {
                    animatorSet.play(moreModesGrid.m4398a(false));
                }
                animatorSet.setDuration(moreModesGrid.f7081h);
                animatorSet.addListener(new icv(moreModesGrid));
                animatorSet.start();
                moreModesGrid.f7079f = animatorSet;
            } else {
                moreModesGrid.f7079f.cancel();
                moreModesGrid.setAlpha(0.0f);
                moreModesGrid.setTranslationX(moreModesGrid.f7082i);
                moreModesGrid.setVisibility(8);
            }
            kba kbaVar = this.f30380i;
            if (kbaVar != null) {
                kbaVar.close();
            }
        }
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: o */
    public final void mo11089o(ikw ikwVar, boolean z) {
        if (m11076C(ikwVar)) {
            this.f30375d.m4393g(ikwVar, z);
            return;
        }
        if (ikwVar.equals(ikw.TIME_LAPSE) || ikwVar.equals(ikw.SLOW_MOTION)) {
            this.f30375d.m4393g(ikw.VIDEO, z);
            return;
        }
        if (!this.f30378g || m11099y(ikwVar) || ikwVar == ikw.REWIND) {
            return;
        }
        throw new IllegalArgumentException("Mode " + String.valueOf(ikwVar) + " is not configured.");
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: p */
    public final void mo11090p(boolean z) {
        ModeSwitcher modeSwitcher = this.f30375d;
        if (modeSwitcher != null) {
            modeSwitcher.setEnabled(z);
            this.f30376e.setEnabled(z);
            m11098x(this.f30375d.f7070k);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m11091q(int i) {
        this.f30375d.setImportantForAccessibility(i);
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: r */
    public final void mo11092r(icy icyVar) {
        this.f30390s = mrm.m16829i(icyVar);
        this.f30375d.f7068i = this;
        this.f30376e.f7083j = mrm.m16829i(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m11093s(ikw ikwVar) {
        jwn jwnVar = (jwn) this.f30373b.get(ikwVar);
        ict ictVar = (ict) this.f30374c.get(ikwVar);
        if (jwnVar == null || ictVar == null) {
            return;
        }
        jwn jwnVar2 = (jwn) this.f30373b.get(ikwVar);
        boolean z = false;
        if (jwnVar2 != null && !((Boolean) jwnVar2.mo3831be()).booleanValue()) {
            z = true;
        }
        ictVar.mo4395i(ikwVar, z);
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: t */
    public final void mo11094t(fcp fcpVar) {
        this.f30375d.f7067h = fcpVar;
        this.f30376e.f7077d = fcpVar;
    }

    @Override // p000.icx
    /* JADX INFO: renamed from: u */
    public final void mo11095u() {
        ModeSwitcher modeSwitcher = this.f30375d;
        if (modeSwitcher == null) {
            return;
        }
        modeSwitcher.m4391e(true, false);
        inw.m11549a(0, this.f30375d);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [dhv, java.lang.Object] */
    @Override // p000.icx
    /* JADX INFO: renamed from: v */
    public final void mo11096v() {
        MoreModesGrid moreModesGrid = this.f30376e;
        if (moreModesGrid != null) {
            moreModesGrid.f7079f.cancel();
            Animator animatorM4398a = moreModesGrid.m4398a(true);
            Animator animatorM4399b = moreModesGrid.m4399b(true);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(animatorM4398a).with(animatorM4399b);
            animatorSet.setDuration(moreModesGrid.f7080g);
            moreModesGrid.setPivotY(moreModesGrid.getHeight());
            moreModesGrid.setPivotX(moreModesGrid.getWidth() / 2.0f);
            moreModesGrid.setAlpha(0.0f);
            moreModesGrid.setTranslationX(0.0f);
            moreModesGrid.setTranslationY(0.0f);
            boolean zM13058H = false;
            moreModesGrid.setVisibility(0);
            AccessibilityManager accessibilityManager = (AccessibilityManager) moreModesGrid.getContext().getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled() && moreModesGrid.getChildCount() > 1) {
                moreModesGrid.getChildAt(1).sendAccessibilityEvent(8);
            }
            animatorSet.start();
            moreModesGrid.f7079f = animatorSet;
            if (this.f30378g) {
                if (this.f30379h) {
                    m11097w();
                    return;
                }
                return;
            }
            ((iik) this.f30395x).get();
            boolean zM13074G = ((jfs) this.f30394w.get()).m13074G(this.f30381j);
            jfs jfsVar = (jfs) this.f30394w.get();
            Context context = this.f30381j;
            if (jfsVar.f33914a.mo6184l(dib.f11255aO)) {
                oes oesVar = new oes(context.getPackageManager());
                if (oesVar.m18441c(oesVar.m18440b(), "com.google.vr.apps.ornament.measure.MeasureMainActivity")) {
                    zM13058H = jfs.m13058H(oesVar);
                }
            }
            kxk.m14975U(((iad) this.f30392u.get()).m10975a(), new icq(this, zM13074G, jfs.m13059I(this.f30381j), zM13058H), this.f30393v);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11097w() {
        if (this.f30396y.mo6184l(dig.f11506t)) {
            jwn jwnVar = (jwn) this.f30373b.get(ikw.LENS);
            if (jwnVar != null && ((Boolean) jwnVar.mo3831be()).booleanValue()) {
                return;
            }
            icw icwVar = (icw) Collection$EL.stream(this.f30376e.f7075b).filter(new Predicate() { // from class: icu
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public final /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public final /* synthetic */ Predicate m11101or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    ColorFilter colorFilter = MoreModesGrid.f7073a;
                    return ((icw) obj).f30400a.equals(ikw.LENS);
                }
            }).findFirst().orElse(null);
            mrm mrmVarM16829i = icwVar == null ? mqu.f41450a : mrm.m16829i(icwVar.f30401b);
            if (mrmVarM16829i.mo16813g()) {
                View view = (View) mrmVarM16829i.mo16809c();
                view.getViewTreeObserver().addOnGlobalLayoutListener(new hsq(this, view, 2));
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11098x(ikw ikwVar) {
        if (this.f30378g) {
            hye hyeVar = ((hyd) this.f30386o.mo3831be()).f29901a;
            boolean z = false;
            if (ikwVar == ikw.MORE_MODES && (hyeVar == hye.JARVIS || ((Boolean) this.f30387p.mo3831be()).booleanValue())) {
                z = true;
            }
            this.f30376e.m4401d(!z);
            idb idbVar = this.f30384m;
            idbVar.getClass();
            if (z) {
                this.f30383l.mo7482d(idbVar);
            } else {
                this.f30383l.mo7485g(idbVar);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m11099y(ikw ikwVar) {
        return this.f30374c.get(ikwVar) == this.f30376e;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.icx
    /* JADX INFO: renamed from: z */
    public final void mo11100z(float f, int i) {
        ModeSwitcher modeSwitcher = this.f30375d;
        try {
            ick ickVar = modeSwitcher.f7062c;
            int left = 0;
            lku.m15669w(f <= 1.0f);
            TextView textView = ickVar.f30346g;
            textView.getClass();
            int iIndexOfChild = ickVar.indexOfChild(textView);
            if (iIndexOfChild >= 0) {
                TextView textView2 = (TextView) ickVar.getChildAt(iIndexOfChild + (i != 1 ? 1 : -1));
                left = (textView.getLeft() + textView.getRight()) / 2;
                if (textView2 != null) {
                    left += Math.round((((textView2.getLeft() + textView2.getRight()) / 2) - left) * f);
                }
            }
            modeSwitcher.m4392f(left, true);
        } catch (Throwable th) {
            ((nbe) ((nbe) ModeSwitcher.f7060a.m17251b()).mo17276G((char) 4151)).mo17293r("Working around b/110351942: %s", th);
        }
    }
}
