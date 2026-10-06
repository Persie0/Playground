package android.support.v7.widget;

import android.R;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import p000.C0192fq;
import p000.C0208gf;
import p000.C0251hv;
import p000.C0253hx;
import p000.InterfaceC0238hi;
import p000.InterfaceC0252hw;
import p000.InterfaceC0757jx;
import p000.InterfaceC0758jy;
import p000.RunnableC0059be;
import p000.acr;
import p000.aet;
import p000.aeu;
import p000.aev;
import p000.afb;
import p000.aff;
import p000.afh;
import p000.afq;
import p000.agf;
import p000.ago;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0757jx, aet, aeu {

    /* JADX INFO: renamed from: a */
    static final int[] f959a = {C0100R.attr.actionBarSize, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A */
    private final Runnable f960A;

    /* JADX INFO: renamed from: B */
    private final aev f961B;

    /* JADX INFO: renamed from: b */
    public int f962b;

    /* JADX INFO: renamed from: c */
    public ActionBarContainer f963c;

    /* JADX INFO: renamed from: d */
    public boolean f964d;

    /* JADX INFO: renamed from: e */
    public boolean f965e;

    /* JADX INFO: renamed from: f */
    public boolean f966f;

    /* JADX INFO: renamed from: g */
    public int f967g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0252hw f968h;

    /* JADX INFO: renamed from: i */
    public ViewPropertyAnimator f969i;

    /* JADX INFO: renamed from: j */
    public final AnimatorListenerAdapter f970j;

    /* JADX INFO: renamed from: k */
    private int f971k;

    /* JADX INFO: renamed from: l */
    private ContentFrameLayout f972l;

    /* JADX INFO: renamed from: m */
    private InterfaceC0758jy f973m;

    /* JADX INFO: renamed from: n */
    private Drawable f974n;

    /* JADX INFO: renamed from: o */
    private boolean f975o;

    /* JADX INFO: renamed from: p */
    private boolean f976p;

    /* JADX INFO: renamed from: q */
    private int f977q;

    /* JADX INFO: renamed from: r */
    private final Rect f978r;

    /* JADX INFO: renamed from: s */
    private final Rect f979s;

    /* JADX INFO: renamed from: t */
    private final Rect f980t;

    /* JADX INFO: renamed from: u */
    private ago f981u;

    /* JADX INFO: renamed from: v */
    private ago f982v;

    /* JADX INFO: renamed from: w */
    private ago f983w;

    /* JADX INFO: renamed from: x */
    private ago f984x;

    /* JADX INFO: renamed from: y */
    private OverScroller f985y;

    /* JADX INFO: renamed from: z */
    private final Runnable f986z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: v */
    private final void m1051v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f959a);
        this.f971k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f974n = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f975o = context.getApplicationInfo().targetSdkVersion < 19;
        this.f985y = new OverScroller(context);
    }

    /* JADX INFO: renamed from: w */
    private static final boolean m1052w(View view, Rect rect, boolean z) {
        boolean z2;
        C0253hx c0253hx = (C0253hx) view.getLayoutParams();
        if (c0253hx.leftMargin != rect.left) {
            c0253hx.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0253hx.topMargin != rect.top) {
            c0253hx.topMargin = rect.top;
            z2 = true;
        }
        if (c0253hx.rightMargin != rect.right) {
            c0253hx.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || c0253hx.bottomMargin == rect.bottom) {
            return z2;
        }
        c0253hx.bottomMargin = rect.bottom;
        return true;
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: a */
    public final void mo1053a() {
        m1056i();
        this.f973m.mo13676d();
    }

    /* JADX INFO: renamed from: b */
    public final void m1054b() {
        removeCallbacks(this.f986z);
        removeCallbacks(this.f960A);
        ViewPropertyAnimator viewPropertyAnimator = this.f969i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: c */
    public final void mo1055c(int i) {
        m1056i();
        switch (i) {
            case 2:
                this.f973m.mo13678f();
                break;
            case 5:
                this.f973m.mo13677e();
                break;
            case 109:
                this.f964d = true;
                this.f975o = getContext().getApplicationInfo().targetSdkVersion < 19;
                break;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0253hx;
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: d */
    public final void mo392d(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f974n == null || this.f975o) {
            return;
        }
        int bottom = this.f963c.getVisibility() == 0 ? (int) (this.f963c.getBottom() + this.f963c.getTranslationY() + 0.5f) : 0;
        this.f974n.setBounds(0, bottom, getWidth(), this.f974n.getIntrinsicHeight() + bottom);
        this.f974n.draw(canvas);
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: e */
    public final void mo393e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000.aeu
    /* JADX INFO: renamed from: f */
    public final void mo397f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo393e(view, i, i2, i3, i4, i5);
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: g */
    public final void mo394g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0253hx();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0253hx(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f961B.m398a();
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: h */
    public final void mo395h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: i */
    final void m1056i() {
        InterfaceC0758jy interfaceC0758jyM1338f;
        if (this.f972l == null) {
            this.f972l = (ContentFrameLayout) findViewById(C0100R.id.action_bar_activity_content);
            this.f963c = (ActionBarContainer) findViewById(C0100R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(C0100R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0758jy) {
                interfaceC0758jyM1338f = (InterfaceC0758jy) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException(qQLA.GMjvHuYAzTdVYwZ.concat(String.valueOf(callbackFindViewById.getClass().getSimpleName())));
                }
                interfaceC0758jyM1338f = ((Toolbar) callbackFindViewById).m1338f();
            }
            this.f973m = interfaceC0758jyM1338f;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1057j(int i) {
        m1054b();
        this.f963c.setTranslationY(-Math.max(0, Math.min(i, this.f963c.getHeight())));
    }

    /* JADX INFO: renamed from: k */
    public final void m1058k(boolean z) {
        if (z != this.f976p) {
            this.f976p = z;
            if (z) {
                return;
            }
            m1054b();
            m1057j(0);
        }
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: l */
    public final void mo1059l(Menu menu, InterfaceC0238hi interfaceC0238hi) {
        m1056i();
        this.f973m.mo13681i(menu, interfaceC0238hi);
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: m */
    public final void mo1060m() {
        m1056i();
        this.f973m.mo13682j();
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: n */
    public final void mo1061n(Window.Callback callback) {
        m1056i();
        this.f973m.mo13685m(callback);
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: o */
    public final void mo1062o(CharSequence charSequence) {
        m1056i();
        this.f973m.mo13686n(charSequence);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1056i();
        ago agoVarM602n = ago.m602n(windowInsets, this);
        boolean zM1052w = m1052w(this.f963c, new Rect(agoVarM602n.m604b(), agoVarM602n.m606d(), agoVarM602n.m605c(), agoVarM602n.m603a()), false);
        afh.m475f(this, agoVarM602n, this.f978r);
        ago agoVarM613l = agoVarM602n.m613l(this.f978r.left, this.f978r.top, this.f978r.right, this.f978r.bottom);
        this.f981u = agoVarM613l;
        if (!this.f982v.equals(agoVarM613l)) {
            this.f982v = this.f981u;
            zM1052w = true;
        }
        if (this.f979s.equals(this.f978r)) {
            if (zM1052w) {
            }
            return agoVarM602n.m610i().m612k().m611j().m607e();
        }
        this.f979s.set(this.f978r);
        requestLayout();
        return agoVarM602n.m610i().m612k().m611j().m607e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1051v(getContext());
        aff.m467c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1054b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0253hx c0253hx = (C0253hx) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = c0253hx.leftMargin + paddingLeft;
                int i7 = c0253hx.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        m1056i();
        measureChildWithMargins(this.f963c, i, 0, i2, 0);
        C0253hx c0253hx = (C0253hx) this.f963c.getLayoutParams();
        int iMax = Math.max(0, this.f963c.getMeasuredWidth() + c0253hx.leftMargin + c0253hx.rightMargin);
        int iMax2 = Math.max(0, this.f963c.getMeasuredHeight() + c0253hx.topMargin + c0253hx.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f963c.getMeasuredState());
        boolean z = (afb.m423d(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f971k;
        } else {
            measuredHeight = this.f963c.getVisibility() != 8 ? this.f963c.getMeasuredHeight() : 0;
        }
        this.f980t.set(this.f978r);
        ago agoVar = this.f981u;
        this.f983w = agoVar;
        if (this.f964d || z) {
            acr acrVarM220c = acr.m220c(agoVar.m604b(), this.f983w.m606d() + measuredHeight, this.f983w.m605c(), this.f983w.m603a());
            agf agfVar = new agf(this.f983w);
            agfVar.mo577c(acrVarM220c);
            this.f983w = agfVar.mo575a();
        } else {
            this.f980t.top += measuredHeight;
            Rect rect = this.f980t;
            rect.bottom = rect.bottom;
            this.f983w = this.f983w.m613l(0, measuredHeight, 0, 0);
        }
        m1052w(this.f972l, this.f980t, true);
        if (!this.f984x.equals(this.f983w)) {
            ago agoVar2 = this.f983w;
            this.f984x = agoVar2;
            afq.m542b(this.f972l, agoVar2);
        }
        measureChildWithMargins(this.f972l, i, 0, i2, 0);
        C0253hx c0253hx2 = (C0253hx) this.f972l.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f972l.getMeasuredWidth() + c0253hx2.leftMargin + c0253hx2.rightMargin);
        int iMax4 = Math.max(iMax2, this.f972l.getMeasuredHeight() + c0253hx2.topMargin + c0253hx2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f972l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f976p || !z) {
            return false;
        }
        this.f985y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f985y.getFinalY() > this.f963c.getHeight()) {
            m1054b();
            this.f960A.run();
        } else {
            m1054b();
            this.f986z.run();
        }
        this.f966f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f977q + i2;
        this.f977q = i5;
        m1057j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C0192fq c0192fq;
        C0208gf c0208gf;
        this.f961B.m399b(i, 0);
        ActionBarContainer actionBarContainer = this.f963c;
        this.f977q = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        m1054b();
        InterfaceC0252hw interfaceC0252hw = this.f968h;
        if (interfaceC0252hw == null || (c0208gf = (c0192fq = (C0192fq) interfaceC0252hw).f23165m) == null) {
            return;
        }
        c0208gf.m9154a();
        c0192fq.f23165m = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f963c.getVisibility() != 0) {
            return false;
        }
        return this.f976p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f976p || this.f966f) {
            return;
        }
        if (this.f977q <= this.f963c.getHeight()) {
            m1054b();
            postDelayed(this.f986z, 600L);
        } else {
            m1054b();
            postDelayed(this.f960A, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m1056i();
        int i2 = this.f967g ^ i;
        this.f967g = i;
        InterfaceC0252hw interfaceC0252hw = this.f968h;
        if (interfaceC0252hw != null) {
            int i3 = i & 256;
            int i4 = i & 4;
            C0192fq c0192fq = (C0192fq) interfaceC0252hw;
            c0192fq.f23163k = i3 == 0;
            if (i4 == 0 || i3 == 0) {
                if (c0192fq.f23164l) {
                    c0192fq.f23164l = false;
                    c0192fq.m8692x(true);
                }
            } else if (!c0192fq.f23164l) {
                c0192fq.f23164l = true;
                c0192fq.m8692x(true);
            }
        }
        if ((i2 & 256) == 0 || this.f968h == null) {
            return;
        }
        aff.m467c(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f962b = i;
        InterfaceC0252hw interfaceC0252hw = this.f968h;
        if (interfaceC0252hw != null) {
            ((C0192fq) interfaceC0252hw).f23162j = i;
        }
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: p */
    public final boolean mo1063p() {
        m1056i();
        return this.f973m.mo13687o();
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: q */
    public final boolean mo1064q() {
        m1056i();
        return this.f973m.mo13689q();
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: r */
    public final boolean mo1065r() {
        m1056i();
        return this.f973m.mo13690r();
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: s */
    public final boolean mo1066s() {
        m1056i();
        return this.f973m.mo13691s();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: t */
    public final boolean mo396t(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p000.InterfaceC0757jx
    /* JADX INFO: renamed from: u */
    public final boolean mo1067u() {
        m1056i();
        return this.f973m.mo13692t();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f962b = 0;
        this.f978r = new Rect();
        this.f979s = new Rect();
        this.f980t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.f981u = ago.f308a;
        ago agoVar = ago.f308a;
        this.f982v = agoVar;
        this.f983w = agoVar;
        this.f984x = agoVar;
        this.f970j = new C0251hv(this);
        this.f986z = new RunnableC0059be(this, 11);
        this.f960A = new RunnableC0059be(this, 12);
        m1051v(context);
        this.f961B = new aev();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0253hx(layoutParams);
    }
}
