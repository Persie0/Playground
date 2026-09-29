package androidx.compose.p002ui.viewinterop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.p002ui.R$id;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.input.nestedscroll.C0317a;
import androidx.compose.p002ui.input.nestedscroll.C0320d;
import androidx.compose.p002ui.input.pointer.AbstractC0330d;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0364n;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.runtime.C0272a;
import java.util.Arrays;
import java.util.HashMap;
import p000.AbstractC3497qg;
import p000.C3151jl;
import p000.C3721wg;
import p000.RunnableC3501qk;
import p000.a7b;
import p000.aq4;
import p000.b16;
import p000.bna;
import p000.bq1;
import p000.c17;
import p000.c6b;
import p000.d66;
import p000.dd9;
import p000.dta;
import p000.e16;
import p000.ea4;
import p000.ed9;
import p000.f6b;
import p000.fb2;
import p000.gr6;
import p000.i54;
import p000.krb;
import p000.l64;
import p000.l70;
import p000.lda;
import p000.n66;
import p000.n84;
import p000.nv8;
import p000.oe1;
import p000.pvc;
import p000.qg3;
import p000.ub5;
import p000.uea;
import p000.ui3;
import p000.uj6;
import p000.vi3;
import p000.vl8;
import p000.vz1;
import p000.wfb;
import p000.wsa;
import p000.x66;
import p000.xfa;
import p000.xwc;
import p000.ym0;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0442b extends ViewGroup implements uj6, oe1, c17, gr6 {

    /* JADX INFO: renamed from: H */
    public vl8 f5177H;

    /* JADX INFO: renamed from: I */
    public final int[] f5178I;

    /* JADX INFO: renamed from: J */
    public long f5179J;

    /* JADX INFO: renamed from: K */
    public f6b f5180K;

    /* JADX INFO: renamed from: L */
    public vi3 f5181L;

    /* JADX INFO: renamed from: M */
    public final ui3 f5182M;

    /* JADX INFO: renamed from: N */
    public final ui3 f5183N;

    /* JADX INFO: renamed from: O */
    public vi3 f5184O;

    /* JADX INFO: renamed from: P */
    public final int[] f5185P;

    /* JADX INFO: renamed from: Q */
    public int f5186Q;

    /* JADX INFO: renamed from: R */
    public int f5187R;

    /* JADX INFO: renamed from: S */
    public final qg3 f5188S;

    /* JADX INFO: renamed from: T */
    public boolean f5189T;

    /* JADX INFO: renamed from: U */
    public final C0357g f5190U;

    /* JADX INFO: renamed from: a */
    public final C0317a f5191a;

    /* JADX INFO: renamed from: b */
    public final View f5192b;

    /* JADX INFO: renamed from: c */
    public final Owner f5193c;

    /* JADX INFO: renamed from: d */
    public ui3 f5194d;

    /* JADX INFO: renamed from: e */
    public boolean f5195e;

    /* JADX INFO: renamed from: f */
    public ui3 f5196f;

    /* JADX INFO: renamed from: g */
    public ui3 f5197g;

    /* JADX INFO: renamed from: h */
    public e16 f5198h;

    /* JADX INFO: renamed from: i */
    public vi3 f5199i;

    /* JADX INFO: renamed from: j */
    public fb2 f5200j;

    /* JADX INFO: renamed from: k */
    public vi3 f5201k;

    /* JADX INFO: renamed from: l */
    public ub5 f5202l;

    public AbstractC0442b(Context context, C0272a c0272a, int i, C0317a c0317a, View view, Owner owner) {
        super(context);
        this.f5191a = c0317a;
        this.f5192b = view;
        this.f5193c = owner;
        n66 n66Var = a7b.f332a;
        setTag(R$id.androidx_compose_ui_view_composition_context, c0272a);
        setSaveFromParentEnabled(false);
        addView(view);
        dta.m10642m(this, new C3151jl(this, 0));
        wsa.m24145c(this, this);
        this.f5194d = AndroidViewHolder$update$1.f5132b;
        this.f5196f = AndroidViewHolder$reset$1.f5129b;
        this.f5197g = AndroidViewHolder$release$1.f5128b;
        b16 b16Var = b16.f7762a;
        this.f5198h = b16Var;
        this.f5200j = vz1.m23621b();
        this.f5178I = new int[2];
        this.f5179J = 0L;
        this.f5182M = new AndroidViewHolder$runUpdate$1(this);
        this.f5183N = new ui3() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                this.f5130b.getLayoutNode().m1563F();
                return xfa.f68157a;
            }
        };
        this.f5185P = new int[2];
        this.f5186Q = Integer.MIN_VALUE;
        this.f5187R = Integer.MIN_VALUE;
        this.f5188S = new qg3();
        final C0357g c0357g = new C0357g(3);
        c0357g.f4317J = this;
        final e16 e16VarMo3161g = xwc.m24741N(vz1.m23654x(AbstractC0330d.m1467a(nv8.m17643c(AbstractC0319c.m1450a(b16Var, ea4.f36923a, c0317a), true, AndroidViewHolder$layoutNode$1$coreModifier$1.f5114b), this), new vi3() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ym0 ym0VarM16515r = ((InterfaceC0310a) obj).mo603o0().m16515r();
                AbstractC0442b abstractC0442b = this.f5115b;
                if (abstractC0442b.getView().getVisibility() != 8) {
                    abstractC0442b.f5189T = true;
                    Owner owner2 = c0357g.f4316I;
                    ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = owner2 instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c ? (ViewTreeObserverOnGlobalLayoutListenerC0391c) owner2 : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC0391c != null) {
                        Canvas canvasM19936a = AbstractC3497qg.m19936a(ym0VarM16515r);
                        viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui().getClass();
                        this.draw(canvasM19936a);
                    }
                    abstractC0442b.f5189T = false;
                }
                return xfa.f68157a;
            }
        }), new vi3() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                WindowInsets windowInsetsM11575f;
                C0357g c0357g2 = c0357g;
                AbstractC0442b abstractC0442b = this.f5118b;
                ea4.m10996b(abstractC0442b, c0357g2);
                ((ViewTreeObserverOnGlobalLayoutListenerC0391c) abstractC0442b.f5193c).f4684a0 = true;
                int[] iArr = abstractC0442b.f5178I;
                int i2 = iArr[0];
                int i3 = iArr[1];
                abstractC0442b.getView().getLocationOnScreen(iArr);
                long j = abstractC0442b.f5179J;
                long jMo1687j = ((aq4) obj).mo1687j();
                abstractC0442b.f5179J = jMo1687j;
                f6b f6bVar = abstractC0442b.f5180K;
                if (f6bVar != null && ((i2 != iArr[0] || i3 != iArr[1] || !n84.m17279a(j, jMo1687j)) && (windowInsetsM11575f = abstractC0442b.m1888m(f6bVar).m11575f()) != null)) {
                    abstractC0442b.getView().dispatchApplyWindowInsets(windowInsetsM11575f);
                }
                return xfa.f68157a;
            }
        }).mo3161g(new C0444d(new AndroidViewHolder$layoutNode$1$coreModifier$4(this)));
        c0357g.m1596j0(this.f5198h.mo3161g(e16VarMo3161g));
        this.f5199i = new vi3() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                c0357g.m1596j0(((e16) obj).mo3161g(e16VarMo3161g));
                return xfa.f68157a;
            }
        };
        c0357g.m1589f0(this.f5200j);
        this.f5201k = new vi3() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                c0357g.m1589f0((fb2) obj);
                return xfa.f68157a;
            }
        };
        c0357g.f4349h0 = new vi3() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                Owner owner2 = (Owner) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = owner2 instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c ? (ViewTreeObserverOnGlobalLayoutListenerC0391c) owner2 : null;
                AbstractC0442b abstractC0442b = this.f5108b;
                if (viewTreeObserverOnGlobalLayoutListenerC0391c != null) {
                    HashMap<AbstractC0442b, C0357g> holderToLayoutNode = viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    C0357g c0357g2 = c0357g;
                    holderToLayoutNode.put(abstractC0442b, c0357g2);
                    viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui().addView(abstractC0442b);
                    viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(c0357g2, abstractC0442b);
                    abstractC0442b.setImportantForAccessibility(1);
                    dta.m10640k(abstractC0442b, new C3721wg(viewTreeObserverOnGlobalLayoutListenerC0391c, c0357g2, viewTreeObserverOnGlobalLayoutListenerC0391c));
                }
                if (abstractC0442b.getView().getParent() != abstractC0442b) {
                    abstractC0442b.addView(abstractC0442b.getView());
                }
                return xfa.f68157a;
            }
        };
        c0357g.f4351i0 = new vi3() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                Owner owner2 = (Owner) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = owner2 instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c ? (ViewTreeObserverOnGlobalLayoutListenerC0391c) owner2 : null;
                AbstractC0442b abstractC0442b = this.f5110b;
                if (viewTreeObserverOnGlobalLayoutListenerC0391c != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui().removeViewInLayout(abstractC0442b);
                    lda.m16118d(viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(abstractC0442b));
                    abstractC0442b.setImportantForAccessibility(0);
                }
                abstractC0442b.removeAllViewsInLayout();
                return xfa.f68157a;
            }
        };
        c0357g.m1594i0(new C0441a(this, c0357g));
        this.f5190U = c0357g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0364n getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            i54.m13663b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0391c) this.f5193c).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: k */
    public static final int m1886k(AbstractC0442b abstractC0442b, int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(l70.m15945h(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: l */
    public static l64 m1887l(l64 l64Var, int i, int i2, int i3, int i4) {
        int i5 = l64Var.f49116a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = l64Var.f49117b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = l64Var.f49118c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = l64Var.f49119d - i4;
        return l64.m15830c(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // p000.oe1
    /* JADX INFO: renamed from: a */
    public final void mo1496a() {
        this.f5197g.mo0a();
    }

    @Override // p000.oe1
    /* JADX INFO: renamed from: b */
    public final void mo1497b() {
        this.f5196f.mo0a();
        removeAllViewsInLayout();
    }

    @Override // p000.uj6
    /* JADX INFO: renamed from: c */
    public final void mo660c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f5192b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ea4.m10997c(i))) << 32) | (((long) Float.floatToRawIntBits(ea4.m10997c(i2))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(ea4.m10997c(i3))) << 32) | (((long) Float.floatToRawIntBits(ea4.m10997c(i4))) & 4294967295L);
            int iM10999e = ea4.m10999e(i5);
            C0320d c0320d = this.f5191a.f4083a;
            C0320d c0320dM1452a1 = c0320d != null ? c0320d.m1452a1() : null;
            long jMo920u0 = c0320dM1452a1 != null ? c0320dM1452a1.mo920u0(iM10999e, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = krb.m15660a(Float.intBitsToFloat((int) (jMo920u0 >> 32)));
            iArr[1] = krb.m15660a(Float.intBitsToFloat((int) (jMo920u0 & 4294967295L)));
        }
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: d */
    public final void mo661d(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.f5192b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ea4.m10997c(i))) << 32) | (((long) Float.floatToRawIntBits(ea4.m10997c(i2))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(ea4.m10997c(i3))) << 32) | (((long) Float.floatToRawIntBits(ea4.m10997c(i4))) & 4294967295L);
            int iM10999e = ea4.m10999e(i5);
            C0320d c0320d = this.f5191a.f4083a;
            C0320d c0320dM1452a1 = c0320d != null ? c0320d.m1452a1() : null;
            if (c0320dM1452a1 != null) {
                c0320dM1452a1.mo920u0(iM10999e, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: e */
    public final boolean mo662e(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: f */
    public final void mo663f(View view, View view2, int i, int i2) {
        this.f5188S.m19945d(i, i2);
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: g */
    public final void mo664g(View view, int i) {
        this.f5188S.m19946e(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f5185P;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final fb2 getDensity() {
        return this.f5200j;
    }

    public final View getInteropView() {
        return this.f5192b;
    }

    public final C0357g getLayoutNode() {
        return this.f5190U;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f5192b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final ub5 getLifecycleOwner() {
        return this.f5202l;
    }

    public final e16 getModifier() {
        return this.f5198h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f5188S.m19943b();
    }

    public final vi3 getOnDensityChanged$ui() {
        return this.f5201k;
    }

    public final vi3 getOnModifierChanged$ui() {
        return this.f5199i;
    }

    public final vi3 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f5184O;
    }

    public final ui3 getRelease() {
        return this.f5197g;
    }

    public final ui3 getReset() {
        return this.f5196f;
    }

    public final vl8 getSavedStateRegistryOwner() {
        return this.f5177H;
    }

    public final ui3 getUpdate() {
        return this.f5194d;
    }

    public final View getView() {
        return this.f5192b;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: h */
    public final void mo665h(View view, int i, int i2, int[] iArr, int i3) {
        if (this.f5192b.isNestedScrollingEnabled()) {
            float fM10997c = ea4.m10997c(i);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ea4.m10997c(i2))) & 4294967295L) | (((long) Float.floatToRawIntBits(fM10997c)) << 32);
            int iM10999e = ea4.m10999e(i3);
            C0320d c0320d = this.f5191a.f4083a;
            C0320d c0320dM1452a1 = c0320d != null ? c0320d.m1452a1() : null;
            long jMo1183P = c0320dM1452a1 != null ? c0320dM1452a1.mo1183P(iM10999e, jFloatToRawIntBits) : 0L;
            iArr[0] = krb.m15660a(Float.intBitsToFloat((int) (jMo1183P >> 32)));
            iArr[1] = krb.m15660a(Float.intBitsToFloat((int) (jMo1183P & 4294967295L)));
        }
    }

    @Override // p000.oe1
    /* JADX INFO: renamed from: i */
    public final void mo1502i() {
        View view = this.f5192b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f5196f.mo0a();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f5189T) {
            this.f5190U.m1563F();
            return null;
        }
        this.f5192b.postOnAnimation(new RunnableC3501qk(1, this.f5183N));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f5192b.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: m */
    public final f6b m1888m(f6b f6bVar) {
        c6b c6bVar = f6bVar.f38536a;
        l64 l64VarMo136i = c6bVar.mo136i(-1);
        l64 l64Var = l64.f49115e;
        if (!l64VarMo136i.equals(l64Var) || !c6bVar.mo137j(-9).equals(l64Var) || c6bVar.mo4365h() != null) {
            C0353c c0353c = (C0353c) this.f5190U.f4335a0.f46676d;
            if (c0353c.f4307n0.f34836I) {
                long jM19495C = pvc.m19495C(c0353c.mo1671R(0L));
                int i = (int) (jM19495C >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jM19495C & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jMo1687j = bq1.m4054e0(c0353c).mo1687j();
                int i3 = (int) (jMo1687j >> 32);
                int i4 = (int) (jMo1687j & 4294967295L);
                long j = c0353c.f49303c;
                long jM19495C2 = pvc.m19495C(c0353c.mo1671R((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jM19495C2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jM19495C2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return f6bVar.f38536a.mo4371r(i, i2, i5, i7);
                }
            }
        }
        return f6bVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((AndroidViewHolder$runUpdate$1) this.f5182M).mo0a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f5189T) {
            this.f5190U.m1563F();
        } else {
            this.f5192b.postOnAnimation(new RunnableC3501qk(1, this.f5183N));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[Catch: all -> 0x0096, LOOP:1: B:14:0x0035->B:25:0x007b, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000e, B:8:0x0018, B:26:0x0080, B:28:0x0088, B:33:0x0098, B:30:0x008d, B:11:0x0029, B:14:0x0035, B:16:0x004a, B:18:0x0056, B:20:0x0060, B:22:0x0070, B:25:0x007b, B:34:0x009c), top: B:39:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0080 A[EDGE_INSN: B:46:0x0080->B:26:0x0080 BREAK  A[LOOP:1: B:14:0x0035->B:25:0x007b], SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i;
        super.onDetachedFromWindow();
        ed9 ed9Var = getSnapshotObserver().f4460a;
        synchronized (ed9Var.f37076g) {
            try {
                x66 x66Var = ed9Var.f37075f;
                int i2 = x66Var.f67832c;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = x66Var.f67830a;
                    if (i3 < i2) {
                        dd9 dd9Var = (dd9) objArr[i3];
                        d66 d66Var = (d66) dd9Var.f35459f.m17259k(this);
                        if (d66Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = d66Var.f35035b;
                            int[] iArr = d66Var.f35036c;
                            long[] jArr = d66Var.f35034a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i5 != length) {
                                            break;
                                            break;
                                        } else {
                                            i5++;
                                            i3 = i;
                                        }
                                    } else {
                                        int i6 = 8;
                                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i5 << 3) + i8;
                                                Object obj = objArr2[i9];
                                                int i10 = iArr[i9];
                                                dd9Var.m10299c(this, obj);
                                            }
                                            j >>= i6;
                                            i8++;
                                            i6 = i6;
                                        }
                                        if (i7 != i6) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!dd9Var.f35459f.m17258j()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = x66Var.f67830a;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i11 = i2 - i4;
                        Arrays.fill(objArr, i11, i2, (Object) null);
                        x66Var.f67832c = i11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f5192b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f5192b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f5186Q = i;
        this.f5187R = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f5192b.isNestedScrollingEnabled()) {
            return false;
        }
        wfb.m23926u(this.f5191a.m1449c(), null, null, new AndroidViewHolder$onNestedFling$1(z, this, uea.m22716a(ea4.m10998d(f), ea4.m10998d(f2)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.f5192b.isNestedScrollingEnabled()) {
            return false;
        }
        wfb.m23926u(this.f5191a.m1449c(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, uea.m22716a(ea4.m10998d(f), ea4.m10998d(f2)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        vi3 vi3Var = this.f5181L;
        if (vi3Var == null) {
            return true;
        }
        vi3Var.invoke(rect != null ? bna.m3984x0(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        vi3 vi3Var = this.f5184O;
        if (vi3Var != null) {
            vi3Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public final f6b mo1889s(View view, f6b f6bVar) {
        this.f5180K = new f6b(f6bVar);
        return m1888m(f6bVar);
    }

    public final void setDensity(fb2 fb2Var) {
        if (fb2Var != this.f5200j) {
            this.f5200j = fb2Var;
            vi3 vi3Var = this.f5201k;
            if (vi3Var != null) {
                vi3Var.invoke(fb2Var);
            }
        }
    }

    public final void setLifecycleOwner(ub5 ub5Var) {
        if (ub5Var != this.f5202l) {
            this.f5202l = ub5Var;
            setTag(androidx.lifecycle.runtime.R$id.view_tree_lifecycle_owner, ub5Var);
        }
    }

    public final void setModifier(e16 e16Var) {
        if (e16Var != this.f5198h) {
            this.f5198h = e16Var;
            vi3 vi3Var = this.f5199i;
            if (vi3Var != null) {
                vi3Var.invoke(e16Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(vi3 vi3Var) {
        this.f5201k = vi3Var;
    }

    public final void setOnModifierChanged$ui(vi3 vi3Var) {
        this.f5199i = vi3Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(vi3 vi3Var) {
        this.f5184O = vi3Var;
    }

    public final void setRelease(ui3 ui3Var) {
        this.f5197g = ui3Var;
    }

    public final void setReset(ui3 ui3Var) {
        this.f5196f = ui3Var;
    }

    public final void setSavedStateRegistryOwner(vl8 vl8Var) {
        if (vl8Var != this.f5177H) {
            this.f5177H = vl8Var;
            setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, vl8Var);
        }
    }

    public final void setUpdate(ui3 ui3Var) {
        this.f5194d = ui3Var;
        this.f5195e = true;
        ((AndroidViewHolder$runUpdate$1) this.f5182M).mo0a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // p000.c17
    /* JADX INFO: renamed from: x */
    public final boolean mo1611x() {
        return isAttachedToWindow();
    }
}
