package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0224f;
import com.linguist.R;
import java.util.WeakHashMap;
import p080e.C5292x;
import p080e.LayoutInflaterFactory2C5275g;
import p164i.C6106g;
import p312p2.C8170b;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10058q;
import p471x2.C10063s0;
import p471x2.InterfaceC10054o;
import p471x2.InterfaceC10056p;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0302c0, InterfaceC10054o, InterfaceC10056p {

    /* JADX INFO: renamed from: W */
    public static final int[] f810W = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: H */
    public int f811H;

    /* JADX INFO: renamed from: I */
    public final Rect f812I;

    /* JADX INFO: renamed from: J */
    public final Rect f813J;

    /* JADX INFO: renamed from: K */
    public final Rect f814K;

    /* JADX INFO: renamed from: L */
    public C10063s0 f815L;

    /* JADX INFO: renamed from: M */
    public C10063s0 f816M;

    /* JADX INFO: renamed from: N */
    public C10063s0 f817N;

    /* JADX INFO: renamed from: O */
    public C10063s0 f818O;

    /* JADX INFO: renamed from: P */
    public InterfaceC0236d f819P;

    /* JADX INFO: renamed from: Q */
    public OverScroller f820Q;

    /* JADX INFO: renamed from: R */
    public ViewPropertyAnimator f821R;

    /* JADX INFO: renamed from: S */
    public final C0233a f822S;

    /* JADX INFO: renamed from: T */
    public final RunnableC0234b f823T;

    /* JADX INFO: renamed from: U */
    public final RunnableC0235c f824U;

    /* JADX INFO: renamed from: V */
    public final C10058q f825V;

    /* JADX INFO: renamed from: a */
    public int f826a;

    /* JADX INFO: renamed from: b */
    public int f827b;

    /* JADX INFO: renamed from: c */
    public ContentFrameLayout f828c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f829d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0305d0 f830e;

    /* JADX INFO: renamed from: f */
    public Drawable f831f;

    /* JADX INFO: renamed from: g */
    public boolean f832g;

    /* JADX INFO: renamed from: h */
    public boolean f833h;

    /* JADX INFO: renamed from: i */
    public boolean f834i;

    /* JADX INFO: renamed from: j */
    public boolean f835j;

    /* JADX INFO: renamed from: k */
    public boolean f836k;

    /* JADX INFO: renamed from: l */
    public int f837l;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0233a extends AnimatorListenerAdapter {
        public C0233a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f821R = null;
            actionBarOverlayLayout.f836k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f821R = null;
            actionBarOverlayLayout.f836k = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC0234b implements Runnable {
        public RunnableC0234b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.m975q();
            actionBarOverlayLayout.f821R = actionBarOverlayLayout.f829d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f822S);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC0235c implements Runnable {
        public RunnableC0235c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.m975q();
            actionBarOverlayLayout.f821R = actionBarOverlayLayout.f829d.animate().translationY(-actionBarOverlayLayout.f829d.getHeight()).setListener(actionBarOverlayLayout.f822S);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0236d {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0237e extends ViewGroup.MarginLayoutParams {
        public C0237e() {
            super(-1, -1);
        }

        public C0237e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0237e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f827b = 0;
        this.f812I = new Rect();
        this.f813J = new Rect();
        this.f814K = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C10063s0 c10063s0 = C10063s0.f51076b;
        this.f815L = c10063s0;
        this.f816M = c10063s0;
        this.f817N = c10063s0;
        this.f818O = c10063s0;
        this.f822S = new C0233a();
        this.f823T = new RunnableC0234b();
        this.f824U = new RunnableC0235c();
        m976r(context);
        this.f825V = new C10058q();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m959p(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        C0237e c0237e = (C0237e) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) c0237e).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) c0237e).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) c0237e).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) c0237e).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) c0237e).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) c0237e).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) c0237e).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) c0237e).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    /* JADX INFO: renamed from: a */
    public final boolean mo960a() {
        m977s();
        return this.f830e.mo1134a();
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    /* JADX INFO: renamed from: b */
    public final void mo961b() {
        m977s();
        this.f830e.mo1135b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    /* JADX INFO: renamed from: c */
    public final void mo962c(C0224f c0224f, LayoutInflaterFactory2C5275g.c cVar) {
        m977s();
        this.f830e.mo1136c(c0224f, cVar);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0237e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    /* JADX INFO: renamed from: d */
    public final boolean mo963d() {
        m977s();
        return this.f830e.mo1137d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f831f == null || this.f832g) {
            return;
        }
        if (this.f829d.getVisibility() == 0) {
            translationY = (int) (this.f829d.getTranslationY() + this.f829d.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f831f.setBounds(0, translationY, getWidth(), this.f831f.getIntrinsicHeight() + translationY);
        this.f831f.draw(canvas);
    }

    @Override // p471x2.InterfaceC10056p
    /* JADX INFO: renamed from: e */
    public final void mo964e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        mo970k(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    /* JADX INFO: renamed from: f */
    public final boolean mo965f() {
        m977s();
        return this.f830e.mo1139f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    /* JADX INFO: renamed from: g */
    public final boolean mo966g() {
        m977s();
        return this.f830e.mo1140g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0237e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0237e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0237e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f829d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C10058q c10058q = this.f825V;
        return c10058q.f51048b | c10058q.f51047a;
    }

    public CharSequence getTitle() {
        m977s();
        return this.f830e.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    /* JADX INFO: renamed from: h */
    public final boolean mo967h() {
        m977s();
        return this.f830e.mo1141h();
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    /* JADX INFO: renamed from: i */
    public final void mo968i(int i10) {
        m977s();
        if (i10 == 2) {
            this.f830e.mo1151r();
        } else if (i10 == 5) {
            this.f830e.mo1152s();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    /* JADX INFO: renamed from: j */
    public final void mo969j() {
        m977s();
        this.f830e.mo1142i();
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: k */
    public final void mo970k(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: l */
    public final boolean mo971l(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: m */
    public final void mo972m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: n */
    public final void mo973n(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: o */
    public final void mo974o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m977s();
        C10063s0 c10063s0M18863i = C10063s0.m18863i(this, windowInsets);
        boolean zM959p = m959p(this.f829d, new Rect(c10063s0M18863i.m18866c(), c10063s0M18863i.m18868e(), c10063s0M18863i.m18867d(), c10063s0M18863i.m18865b()), false);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        Rect rect = this.f812I;
        C10029b0.i.m18708b(this, c10063s0M18863i, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        C10063s0.k kVar = c10063s0M18863i.f51077a;
        C10063s0 c10063s0Mo18887l = kVar.mo18887l(i10, i11, i12, i13);
        this.f815L = c10063s0Mo18887l;
        boolean z10 = true;
        if (!this.f816M.equals(c10063s0Mo18887l)) {
            this.f816M = this.f815L;
            zM959p = true;
        }
        Rect rect2 = this.f813J;
        if (rect2.equals(rect)) {
            z10 = zM959p;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return kVar.mo18898a().f51077a.mo18894c().f51077a.mo18893b().m18870h();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m976r(getContext());
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.h.m18706c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m975q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0237e c0237e = (C0237e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) c0237e).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) c0237e).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        C10063s0.e cVar;
        m977s();
        measureChildWithMargins(this.f829d, i10, 0, i11, 0);
        C0237e c0237e = (C0237e) this.f829d.getLayoutParams();
        int iMax = Math.max(0, this.f829d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0237e).leftMargin + ((ViewGroup.MarginLayoutParams) c0237e).rightMargin);
        int iMax2 = Math.max(0, this.f829d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0237e).topMargin + ((ViewGroup.MarginLayoutParams) c0237e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f829d.getMeasuredState());
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean z10 = (C10029b0.d.m18670g(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f826a;
            if (this.f834i && this.f829d.getTabContainer() != null) {
                measuredHeight += this.f826a;
            }
        } else if (this.f829d.getVisibility() != 8) {
            measuredHeight = this.f829d.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        Rect rect = this.f812I;
        Rect rect2 = this.f814K;
        rect2.set(rect);
        C10063s0 c10063s0 = this.f815L;
        this.f817N = c10063s0;
        if (this.f833h || z10) {
            C8170b c8170bM16218b = C8170b.m16218b(c10063s0.m18866c(), this.f817N.m18868e() + measuredHeight, this.f817N.m18867d(), this.f817N.m18865b() + 0);
            C10063s0 c10063s1 = this.f817N;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                cVar = new C10063s0.d(c10063s1);
            } else {
                cVar = i12 >= 29 ? new C10063s0.c(c10063s1) : new C10063s0.b(c10063s1);
            }
            cVar.mo18874g(c8170bM16218b);
            this.f817N = cVar.mo18872b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.f817N = c10063s0.f51077a.mo18887l(0, measuredHeight, 0, 0);
        }
        m959p(this.f828c, rect2, true);
        if (!this.f818O.equals(this.f817N)) {
            C10063s0 c10063s2 = this.f817N;
            this.f818O = c10063s2;
            C10029b0.m18646b(this.f828c, c10063s2);
        }
        measureChildWithMargins(this.f828c, i10, 0, i11, 0);
        C0237e c0237e2 = (C0237e) this.f828c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f828c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0237e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0237e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f828c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0237e2).topMargin + ((ViewGroup.MarginLayoutParams) c0237e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f828c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        boolean z11 = false;
        if (this.f835j && z10) {
            this.f820Q.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.f820Q.getFinalY() > this.f829d.getHeight()) {
                z11 = true;
            }
            if (z11) {
                m975q();
                this.f824U.run();
            } else {
                m975q();
                this.f823T.run();
            }
            this.f836k = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f837l + i11;
        this.f837l = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        C5292x c5292x;
        C6106g c6106g;
        this.f825V.f51047a = i10;
        this.f837l = getActionBarHideOffset();
        m975q();
        InterfaceC0236d interfaceC0236d = this.f819P;
        if (interfaceC0236d == null || (c6106g = (c5292x = (C5292x) interfaceC0236d).f33549t) == null) {
            return;
        }
        c6106g.m12607a();
        c5292x.f33549t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f829d.getVisibility() != 0) {
            return false;
        }
        return this.f835j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f835j && !this.f836k) {
            if (this.f837l <= this.f829d.getHeight()) {
                m975q();
                postDelayed(this.f823T, 600L);
            } else {
                m975q();
                postDelayed(this.f824U, 600L);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        m977s();
        int i11 = this.f811H ^ i10;
        this.f811H = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        InterfaceC0236d interfaceC0236d = this.f819P;
        if (interfaceC0236d != null) {
            ((C5292x) interfaceC0236d).f33545p = !z11;
            if (z10 || !z11) {
                C5292x c5292x = (C5292x) interfaceC0236d;
                if (c5292x.f33546q) {
                    c5292x.f33546q = false;
                    c5292x.m11415t(true);
                }
            } else {
                C5292x c5292x2 = (C5292x) interfaceC0236d;
                if (!c5292x2.f33546q) {
                    c5292x2.f33546q = true;
                    c5292x2.m11415t(true);
                }
            }
        }
        if ((i11 & 256) != 0 && this.f819P != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.h.m18706c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f827b = i10;
        InterfaceC0236d interfaceC0236d = this.f819P;
        if (interfaceC0236d != null) {
            ((C5292x) interfaceC0236d).f33544o = i10;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m975q() {
        removeCallbacks(this.f823T);
        removeCallbacks(this.f824U);
        ViewPropertyAnimator viewPropertyAnimator = this.f821R;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m976r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f810W);
        this.f826a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f831f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f832g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f820Q = new OverScroller(context);
    }

    /* JADX INFO: renamed from: s */
    public final void m977s() {
        InterfaceC0305d0 wrapper;
        if (this.f828c == null) {
            this.f828c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f829d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0305d0) {
                wrapper = (InterfaceC0305d0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f830e = wrapper;
        }
    }

    public void setActionBarHideOffset(int i10) {
        m975q();
        this.f829d.setTranslationY(-Math.max(0, Math.min(i10, this.f829d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0236d interfaceC0236d) {
        this.f819P = interfaceC0236d;
        if (getWindowToken() != null) {
            ((C5292x) this.f819P).f33544o = this.f827b;
            int i10 = this.f811H;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.h.m18706c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f834i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f835j) {
            this.f835j = z10;
            if (!z10) {
                m975q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        m977s();
        this.f830e.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        m977s();
        this.f830e.setIcon(drawable);
    }

    public void setLogo(int i10) {
        m977s();
        this.f830e.mo1147n(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f833h = z10;
        this.f832g = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    public void setWindowCallback(Window.Callback callback) {
        m977s();
        this.f830e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0302c0
    public void setWindowTitle(CharSequence charSequence) {
        m977s();
        this.f830e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
