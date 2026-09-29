package androidx.compose.p002ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.R$id;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.runtime.C0277e;
import androidx.compose.runtime.C0281i;
import androidx.compose.runtime.Recomposer$State;
import androidx.compose.runtime.internal.C0282a;
import java.lang.ref.WeakReference;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3572sf;
import p000.C3386nv;
import p000.C3552rx;
import p000.RunnableC0002a0;
import p000.ViewOnAttachStateChangeListenerC3112ii;
import p000.a7b;
import p000.cs4;
import p000.dja;
import p000.dua;
import p000.e41;
import p000.eja;
import p000.fta;
import p000.gta;
import p000.gz8;
import p000.hh7;
import p000.i54;
import p000.kf1;
import p000.kn1;
import p000.n66;
import p000.oha;
import p000.q00;
import p000.t16;
import p000.td3;
import p000.tj3;
import p000.ub5;
import p000.ui3;
import p000.vl1;
import p000.vl8;
import p000.vz1;
import p000.w6b;
import p000.wfb;
import p000.wn3;
import p000.x6b;
import p000.xfa;
import p000.xq3;
import p000.ye1;
import p000.yq3;
import p000.z26;
import p000.zha;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0389a extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public WeakReference f4624a;

    /* JADX INFO: renamed from: b */
    public IBinder f4625b;

    /* JADX INFO: renamed from: c */
    public C0413y f4626c;

    /* JADX INFO: renamed from: d */
    public kf1 f4627d;

    /* JADX INFO: renamed from: e */
    public C0401m f4628e;

    /* JADX INFO: renamed from: f */
    public ui3 f4629f;

    /* JADX INFO: renamed from: g */
    public boolean f4630g;

    /* JADX INFO: renamed from: h */
    public boolean f4631h;

    /* JADX INFO: renamed from: i */
    public boolean f4632i;

    public AbstractC0389a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        final ViewOnAttachStateChangeListenerC3112ii viewOnAttachStateChangeListenerC3112ii = new ViewOnAttachStateChangeListenerC3112ii(this, 2);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3112ii);
        final fta ftaVar = new fta(this);
        hh7.m13243b(this).f44113a.add(ftaVar);
        this.f4629f = new ui3() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                ViewOnAttachStateChangeListenerC3112ii viewOnAttachStateChangeListenerC3112ii2 = viewOnAttachStateChangeListenerC3112ii;
                AbstractC0389a abstractC0389a = this.f4591b;
                abstractC0389a.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3112ii2);
                hh7.m13243b(abstractC0389a).f44113a.remove(ftaVar);
                return xfa.f68157a;
            }
        };
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(kf1 kf1Var) {
        if (this.f4627d != kf1Var) {
            this.f4627d = kf1Var;
            if (kf1Var != null) {
                this.f4624a = null;
            }
            C0413y c0413y = this.f4626c;
            if (c0413y != null) {
                c0413y.mo1823a();
                this.f4626c = null;
                if (isAttachedToWindow()) {
                    m1712f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f4625b != iBinder) {
            this.f4625b = iBinder;
            this.f4624a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1707a(ye1 ye1Var, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m1709c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m1709c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m1708b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f4628e == null) {
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c) {
                        viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) childAt;
                    }
                }
                if (viewTreeObserverOnGlobalLayoutListenerC0391c != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0391c.setComposeViewContext(m1717k(wfb.m23918m(this), viewTreeObserverOnGlobalLayoutListenerC0391c.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                m1712f();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1709c() {
        if (this.f4631h) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: d */
    public final void m1710d() {
        C0401m c0401m;
        View view;
        if (this.f4627d == null && !isAttachedToWindow() && ((c0401m = this.f4628e) == null || (view = c0401m.f4786a) == null || !view.isAttachedToWindow())) {
            C3386nv.m17633t("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            m1712f();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1711e() {
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c ? (ViewTreeObserverOnGlobalLayoutListenerC0391c) childAt : null;
        if (viewTreeObserverOnGlobalLayoutListenerC0391c != null && viewTreeObserverOnGlobalLayoutListenerC0391c.f4679W0) {
            viewTreeObserverOnGlobalLayoutListenerC0391c.getComposeViewContext().m1801b();
            viewTreeObserverOnGlobalLayoutListenerC0391c.f4679W0 = false;
        }
        C0413y c0413y = this.f4626c;
        if (c0413y != null) {
            c0413y.mo1823a();
        }
        this.f4626c = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: f */
    public final void m1712f() {
        if (this.f4626c == null) {
            try {
                this.f4631h = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    C0401m c0401mM1715i = this.f4628e;
                    if (c0401mM1715i == null) {
                        c0401mM1715i = m1715i();
                    }
                    this.f4626c = AbstractC0414z.m1825a(this, c0401mM1715i, new C0282a(1003123809, true, new zi3() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1$1
                        {
                            super(2);
                        }

                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ye1 ye1Var = (ye1) obj;
                            int iIntValue = ((Number) obj2).intValue();
                            tj3 tj3Var = (tj3) ye1Var;
                            if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                this.f4468b.mo1707a(tj3Var, 0);
                            } else {
                                tj3Var.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }));
                    Trace.endSection();
                    this.f4631h = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.f4631h = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo1713g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m25905getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R$id.auto_clear_focus_behavior_tag);
        q00 q00Var = tag instanceof q00 ? (q00) tag : null;
        if (q00Var != null) {
            return q00Var.m19583b();
        }
        return 1;
    }

    public final C0401m getComposeViewContext$ui() {
        return this.f4628e;
    }

    public final boolean getHasComposition() {
        return this.f4626c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f4630g;
    }

    /* JADX INFO: renamed from: h */
    public void mo1714h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: i */
    public final C0401m m1715i() {
        C0401m composeViewContext;
        dua duaVar;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c ? (ViewTreeObserverOnGlobalLayoutListenerC0391c) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC0391c != null) {
                composeViewContext = viewTreeObserverOnGlobalLayoutListenerC0391c.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewM23918m = wfb.m23918m(this);
        C0401m c0401mM23921p = wfb.m23921p(viewM23918m);
        if (c0401mM23921p != null) {
            return m1717k(viewM23918m, c0401mM23921p);
        }
        kf1 kf1VarM1716j = m1716j();
        ub5 ub5VarM25659b = zha.m25659b(viewM23918m);
        if (ub5VarM25659b == null) {
            ub5VarM25659b = composeViewContext != null ? composeViewContext.f4788c : null;
            if (ub5VarM25659b == null) {
                C3386nv.m17633t("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        ub5 ub5Var = ub5VarM25659b;
        vl8 vl8VarM10417a = dja.m10417a(viewM23918m);
        if (vl8VarM10417a == null) {
            vl8VarM10417a = composeViewContext != null ? composeViewContext.f4789d : null;
            if (vl8VarM10417a == null) {
                C3386nv.m17633t("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        vl8 vl8Var = vl8VarM10417a;
        dua duaVarM11183a = eja.m11183a(viewM23918m);
        if (duaVarM11183a == null) {
            duaVar = composeViewContext != null ? composeViewContext.f4790e : null;
        } else {
            duaVar = duaVarM11183a;
        }
        C0401m c0401m = new C0401m(wfb.m23921p(wfb.m23918m(viewM23918m)), viewM23918m, kf1VarM1716j, ub5Var, vl8Var, duaVar);
        viewM23918m.setTag(R$id.androidx_compose_ui_view_compose_view_context, new WeakReference(c0401m));
        return c0401m;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f4632i || super.isTransitionGroup();
    }

    /* JADX INFO: renamed from: j */
    public final kf1 m1716j() {
        C0281i c0281i;
        kn1 kn1Var;
        C0277e c0277e;
        kf1 kf1VarM165a = this.f4627d;
        if (kf1VarM165a == null) {
            kf1VarM165a = a7b.m165a(this);
            if (kf1VarM165a == null) {
                Object parent = getParent();
                while (kf1VarM165a == null && (parent instanceof View)) {
                    View view = (View) parent;
                    kf1VarM165a = a7b.m165a(view);
                    parent = oha.m17996b(view);
                }
            }
            if (kf1VarM165a != null) {
                kf1 kf1Var = (!(kf1VarM165a instanceof C0281i) || ((Recomposer$State) ((C0281i) kf1VarM165a).f3776w.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0) ? kf1VarM165a : null;
                if (kf1Var != null) {
                    this.f4624a = new WeakReference(kf1Var);
                }
            } else {
                kf1VarM165a = null;
            }
            if (kf1VarM165a == null) {
                WeakReference weakReference = this.f4624a;
                if (weakReference == null || (kf1VarM165a = (kf1) weakReference.get()) == null || ((kf1VarM165a instanceof C0281i) && ((Recomposer$State) ((C0281i) kf1VarM165a).f3776w.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0)) {
                    kf1VarM165a = null;
                }
                if (kf1VarM165a == null) {
                    if (!isAttachedToWindow()) {
                        i54.m13663b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object objM17996b = oha.m17996b(this);
                    View view2 = this;
                    while (objM17996b instanceof View) {
                        View view3 = (View) objM17996b;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        objM17996b = view3.getParent();
                    }
                    kf1 kf1VarM165a2 = a7b.m165a(view2);
                    if (kf1VarM165a2 == null) {
                        ((w6b) x6b.f67842a.get()).getClass();
                        kn1 kn1Var2 = EmptyCoroutineContext.f47685a;
                        cs4 cs4Var = C0397i.f4770H;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            kn1Var = (kn1) C0397i.f4770H.getValue();
                        } else {
                            kn1Var = (kn1) C0397i.f4771I.get();
                            if (kn1Var == null) {
                                C3386nv.m17633t("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        kn1 kn1VarPlus = kn1Var.plus(kn1Var2);
                        t16 t16Var = (t16) kn1VarPlus.get(gz8.f41565f);
                        if (t16Var != null) {
                            c0277e = new C0277e(t16Var);
                            C3552rx c3552rx = c0277e.f3740b;
                            synchronized (c3552rx.f59987b) {
                                c3552rx.f59986a = false;
                            }
                        } else {
                            c0277e = null;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        kn1 c0409u = (z26) kn1VarPlus.get(e41.f36681f);
                        if (c0409u == null) {
                            c0409u = new C0409u(view2.getContext().getApplicationContext());
                            ref$ObjectRef.f47718a = c0409u;
                        }
                        if (c0277e != null) {
                            kn1Var2 = c0277e;
                        }
                        kn1 kn1VarPlus2 = kn1VarPlus.plus(kn1Var2).plus(c0409u);
                        c0281i = new C0281i(kn1VarPlus2);
                        synchronized (c0281i.f3757d) {
                            c0281i.f3775v = true;
                        }
                        vl1 vl1VarM23619a = vz1.m23619a(kn1VarPlus2);
                        ub5 ub5VarM25659b = zha.m25659b(view2);
                        AbstractC3572sf abstractC3572sfMo256K = ub5VarM25659b != null ? ub5VarM25659b.mo256K() : null;
                        if (abstractC3572sfMo256K == null) {
                            i54.m13664c("ViewTreeLifecycleOwner not found from " + view2);
                            C3386nv.m17631r();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new td3(2, view2, c0281i));
                        abstractC3572sfMo256K.mo21323g(new C0412x(vl1VarM23619a, c0277e, c0281i, ref$ObjectRef));
                        view2.setTag(R$id.androidx_compose_ui_view_composition_context, c0281i);
                        wn3 wn3Var = wn3.f67092a;
                        Handler handler = view2.getHandler();
                        int i = yq3.f70287a;
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3112ii(wfb.m23926u(wn3Var, new xq3(handler, "windowRecomposer cleanup", false).f68538f, null, new C0386xbfd085b3(c0281i, view2, null), 2), 3));
                    } else {
                        if (!(kf1VarM165a2 instanceof C0281i)) {
                            C3386nv.m17633t("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        c0281i = (C0281i) kf1VarM165a2;
                    }
                    C0281i c0281i2 = ((Recomposer$State) c0281i.f3776w.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0 ? c0281i : null;
                    if (c0281i2 != null) {
                        this.f4624a = new WeakReference(c0281i2);
                    }
                    return c0281i;
                }
            }
        }
        return kf1VarM165a;
    }

    /* JADX INFO: renamed from: k */
    public final C0401m m1717k(View view, C0401m c0401m) {
        kf1 kf1VarM1716j = m1716j();
        ub5 ub5VarM25659b = zha.m25659b(view);
        dua duaVarM11183a = eja.m11183a(view);
        vl8 vl8VarM10417a = dja.m10417a(view);
        kf1 kf1Var = c0401m.f4787b;
        vl8 vl8Var = c0401m.f4789d;
        ub5 ub5Var = c0401m.f4788c;
        if (kf1VarM1716j == kf1Var && ub5VarM25659b == ub5Var && duaVarM11183a == c0401m.f4790e && vl8VarM10417a == vl8Var) {
            return c0401m;
        }
        if (kf1VarM1716j.mo1231j() != c0401m.f4787b.mo1231j()) {
            m1711e();
        }
        if (ub5VarM25659b == null) {
            ub5VarM25659b = ub5Var;
        }
        C0401m c0401m2 = new C0401m(c0401m, view, kf1VarM1716j, ub5VarM25659b, vl8VarM10417a == null ? vl8Var : vl8VarM10417a, duaVarM11183a);
        view.setTag(R$id.androidx_compose_ui_view_compose_view_context, new WeakReference(c0401m2));
        return c0401m2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n66 n66Var = a7b.f332a;
        Object objM17996b = oha.m17996b(this);
        View view = this;
        while (objM17996b instanceof View) {
            View view2 = (View) objM17996b;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objM17996b = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new RunnableC0002a0(this, 0));
        } else {
            m1708b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo1713g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m1712f();
        mo1714h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m25906setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R$id.auto_clear_focus_behavior_tag, q00.m19582a(i));
    }

    public final void setComposeViewContext$ui(C0401m c0401m) {
        if (this.f4628e != c0401m) {
            if (c0401m == null) {
                m1711e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c ? (ViewTreeObserverOnGlobalLayoutListenerC0391c) childAt : null;
                if (viewTreeObserverOnGlobalLayoutListenerC0391c != null) {
                    if (viewTreeObserverOnGlobalLayoutListenerC0391c.getCoroutineContext() != c0401m.f4787b.mo1231j()) {
                        m1711e();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC0391c.setComposeViewContext(c0401m);
                }
            }
            this.f4628e = c0401m;
        }
    }

    public final void setParentCompositionContext(kf1 kf1Var) {
        setParentContext(kf1Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f4630g = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) ((Owner) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f4632i = true;
    }

    public final void setViewCompositionStrategy(gta gtaVar) {
        ui3 ui3Var = this.f4629f;
        if (ui3Var != null) {
            ui3Var.mo0a();
        }
        this.f4629f = gtaVar.mo1822a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        m1709c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m1709c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        m1709c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m1709c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m1709c();
        super.addView(view, i, layoutParams);
    }

    public /* synthetic */ AbstractC0389a(Context context) {
        this(context, null, 0);
    }
}
