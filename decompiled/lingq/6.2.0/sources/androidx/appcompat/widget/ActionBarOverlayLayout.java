package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import java.util.WeakHashMap;
import p000.C3172k5;
import p000.C3360n5;
import p000.C3386nv;
import p000.C3397o5;
import p000.InterfaceC3323m5;
import p000.RunnableC3286l5;
import p000.bna;
import p000.c6b;
import p000.dta;
import p000.dx5;
import p000.f6b;
import p000.hw5;
import p000.l64;
import p000.n5b;
import p000.o5b;
import p000.p32;
import p000.p5b;
import p000.q5b;
import p000.qg3;
import p000.r5b;
import p000.s5a;
import p000.s5b;
import p000.t5b;
import p000.tj6;
import p000.uj6;
import p000.wsa;
import p000.x5a;
import p000.yua;
import p000.z4b;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements tj6, uj6 {

    /* JADX INFO: renamed from: a0 */
    public static final int[] f1076a0 = {R$attr.actionBarSize, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: b0 */
    public static final f6b f1077b0;

    /* JADX INFO: renamed from: c0 */
    public static final Rect f1078c0;

    /* JADX INFO: renamed from: H */
    public final Rect f1079H;

    /* JADX INFO: renamed from: I */
    public final Rect f1080I;

    /* JADX INFO: renamed from: J */
    public final Rect f1081J;

    /* JADX INFO: renamed from: K */
    public final Rect f1082K;

    /* JADX INFO: renamed from: L */
    public f6b f1083L;

    /* JADX INFO: renamed from: M */
    public f6b f1084M;

    /* JADX INFO: renamed from: N */
    public f6b f1085N;

    /* JADX INFO: renamed from: O */
    public f6b f1086O;

    /* JADX INFO: renamed from: P */
    public InterfaceC3323m5 f1087P;

    /* JADX INFO: renamed from: Q */
    public OverScroller f1088Q;

    /* JADX INFO: renamed from: R */
    public ViewPropertyAnimator f1089R;

    /* JADX INFO: renamed from: S */
    public final C3172k5 f1090S;

    /* JADX INFO: renamed from: T */
    public final RunnableC3286l5 f1091T;

    /* JADX INFO: renamed from: U */
    public final RunnableC3286l5 f1092U;

    /* JADX INFO: renamed from: V */
    public final qg3 f1093V;

    /* JADX INFO: renamed from: W */
    public final C3397o5 f1094W;

    /* JADX INFO: renamed from: a */
    public int f1095a;

    /* JADX INFO: renamed from: b */
    public int f1096b;

    /* JADX INFO: renamed from: c */
    public ContentFrameLayout f1097c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f1098d;

    /* JADX INFO: renamed from: e */
    public p32 f1099e;

    /* JADX INFO: renamed from: f */
    public Drawable f1100f;

    /* JADX INFO: renamed from: g */
    public boolean f1101g;

    /* JADX INFO: renamed from: h */
    public boolean f1102h;

    /* JADX INFO: renamed from: i */
    public boolean f1103i;

    /* JADX INFO: renamed from: j */
    public boolean f1104j;

    /* JADX INFO: renamed from: k */
    public int f1105k;

    /* JADX INFO: renamed from: l */
    public int f1106l;

    static {
        t5b o5bVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            o5bVar = new s5b();
        } else if (i >= 35) {
            o5bVar = new r5b();
        } else if (i >= 34) {
            o5bVar = new q5b();
        } else if (i >= 31) {
            o5bVar = new p5b();
        } else {
            o5bVar = i >= 30 ? new o5b() : new n5b();
        }
        o5bVar.mo17241h(l64.m15830c(0, 1, 0, 1));
        f1077b0 = o5bVar.mo17237b();
        f1078c0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1096b = 0;
        this.f1079H = new Rect();
        this.f1080I = new Rect();
        this.f1081J = new Rect();
        this.f1082K = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        f6b f6bVar = f6b.f38535b;
        this.f1083L = f6bVar;
        this.f1084M = f6bVar;
        this.f1085N = f6bVar;
        this.f1086O = f6bVar;
        this.f1090S = new C3172k5(this, 0);
        this.f1091T = new RunnableC3286l5(this, 0);
        this.f1092U = new RunnableC3286l5(this, 1);
        m666i(context);
        this.f1093V = new qg3();
        C3397o5 c3397o5 = new C3397o5(context);
        this.f1094W = c3397o5;
        addView(c3397o5);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m658a(View view, Rect rect, boolean z) {
        boolean z2;
        C3360n5 c3360n5 = (C3360n5) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c3360n5).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c3360n5).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c3360n5).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c3360n5).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c3360n5).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c3360n5).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c3360n5).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c3360n5).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public final void m659b() {
        removeCallbacks(this.f1091T);
        removeCallbacks(this.f1092U);
        ViewPropertyAnimator viewPropertyAnimator = this.f1089R;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // p000.uj6
    /* JADX INFO: renamed from: c */
    public final void mo660c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo661d(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3360n5;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: d */
    public final void mo661d(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f1100f != null) {
            if (this.f1098d.getVisibility() == 0) {
                translationY = (int) (this.f1098d.getTranslationY() + this.f1098d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f1100f.setBounds(0, translationY, getWidth(), this.f1100f.getIntrinsicHeight() + translationY);
            this.f1100f.draw(canvas);
        }
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: e */
    public final boolean mo662e(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: f */
    public final void mo663f(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: g */
    public final void mo664g(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3360n5(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3360n5(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1098d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1093V.m19943b();
    }

    public CharSequence getTitle() {
        m668k();
        return ((x5a) this.f1099e).f67786a.getTitle();
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: h */
    public final void mo665h(View view, int i, int i2, int[] iArr, int i3) {
    }

    /* JADX INFO: renamed from: i */
    public final void m666i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1076a0);
        this.f1095a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1100f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1088Q = new OverScroller(context);
    }

    /* JADX INFO: renamed from: j */
    public final void m667j(int i) {
        m668k();
        if (i == 2) {
            ((x5a) this.f1099e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((x5a) this.f1099e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m668k() {
        p32 wrapper;
        if (this.f1097c == null) {
            this.f1097c = (ContentFrameLayout) findViewById(R$id.action_bar_activity_content);
            this.f1098d = (ActionBarContainer) findViewById(R$id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R$id.action_bar);
            if (callbackFindViewById instanceof p32) {
                wrapper = (p32) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    C3386nv.m17633t("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f1099e = wrapper;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m669l(Menu menu, dx5 dx5Var) {
        m668k();
        x5a x5aVar = (x5a) this.f1099e;
        Toolbar toolbar = x5aVar.f67786a;
        if (x5aVar.f67798m == null) {
            C0035b c0035b = new C0035b(toolbar.getContext());
            x5aVar.f67798m = c0035b;
            c0035b.f1222i = R$id.action_menu_presenter;
        }
        C0035b c0035b2 = x5aVar.f67798m;
        c0035b2.f1218e = dx5Var;
        hw5 hw5Var = (hw5) menu;
        if (hw5Var == null && toolbar.f1168a == null) {
            return;
        }
        toolbar.m689f();
        hw5 hw5Var2 = toolbar.f1168a.f1108K;
        if (hw5Var2 == hw5Var) {
            return;
        }
        if (hw5Var2 != null) {
            hw5Var2.m13535r(toolbar.f1185i0);
            hw5Var2.m13535r(toolbar.f1187j0);
        }
        if (toolbar.f1187j0 == null) {
            toolbar.f1187j0 = new s5a(toolbar);
        }
        c0035b2.f1206M = true;
        Context context = toolbar.f1186j;
        if (hw5Var != null) {
            hw5Var.m13519b(c0035b2, context);
            hw5Var.m13519b(toolbar.f1187j0, toolbar.f1186j);
        } else {
            c0035b2.mo712l(context, null);
            toolbar.f1187j0.mo712l(toolbar.f1186j, null);
            c0035b2.mo703c(true);
            toolbar.f1187j0.mo703c(true);
        }
        toolbar.f1168a.setPopupTheme(toolbar.f1188k);
        toolbar.f1168a.setPresenter(c0035b2);
        toolbar.f1185i0 = c0035b2;
        toolbar.m699t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m668k();
        f6b f6bVarM11570g = f6b.m11570g(this, windowInsets);
        boolean zM658a = m658a(this.f1098d, new Rect(f6bVarM11570g.m11572b(), f6bVarM11570g.m11574d(), f6bVarM11570g.m11573c(), f6bVarM11570g.m11571a()), false);
        WeakHashMap weakHashMap = dta.f36217a;
        Rect rect = this.f1079H;
        wsa.m24144b(this, f6bVarM11570g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        c6b c6bVar = f6bVarM11570g.f38536a;
        f6b f6bVarMo4371r = c6bVar.mo4371r(i, i2, i3, i4);
        this.f1083L = f6bVarMo4371r;
        boolean z = true;
        if (!this.f1084M.equals(f6bVarMo4371r)) {
            this.f1084M = this.f1083L;
            zM658a = true;
        }
        Rect rect2 = this.f1080I;
        if (rect2.equals(rect)) {
            z = zM658a;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c6bVar.mo4360a().f38536a.mo4362c().f38536a.mo4361b().m11575f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m666i(getContext());
        WeakHashMap weakHashMap = dta.f36217a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m659b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C3360n5 c3360n5 = (C3360n5) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c3360n5).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c3360n5).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        f6b f6bVar;
        int i3;
        t5b n5bVar;
        m668k();
        measureChildWithMargins(this.f1098d, i, 0, i2, 0);
        C3360n5 c3360n5 = (C3360n5) this.f1098d.getLayoutParams();
        int iMax = Math.max(0, this.f1098d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c3360n5).leftMargin + ((ViewGroup.MarginLayoutParams) c3360n5).rightMargin);
        int iMax2 = Math.max(0, this.f1098d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3360n5).topMargin + ((ViewGroup.MarginLayoutParams) c3360n5).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1098d.getMeasuredState());
        WeakHashMap weakHashMap = dta.f36217a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f1095a;
            if (this.f1102h && this.f1098d.getTabContainer() != null) {
                measuredHeight += this.f1095a;
            }
        } else {
            measuredHeight = this.f1098d.getVisibility() != 8 ? this.f1098d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1079H;
        Rect rect2 = this.f1081J;
        rect2.set(rect);
        this.f1085N = this.f1083L;
        if (this.f1101g || z) {
            l64 l64VarM15830c = l64.m15830c(this.f1085N.m11572b(), this.f1085N.m11574d() + measuredHeight, this.f1085N.m11573c(), this.f1085N.m11571a());
            f6bVar = this.f1085N;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                n5bVar = new s5b(f6bVar);
            } else if (i3 >= 35) {
                n5bVar = new r5b(f6bVar);
            } else if (i3 >= 34) {
                n5bVar = new q5b(f6bVar);
            } else if (i3 >= 31) {
                n5bVar = new p5b(f6bVar);
            } else if (i3 >= 30) {
                n5bVar = new o5b(f6bVar);
            } else {
                n5bVar = new n5b(f6bVar);
            }
            n5bVar.mo17241h(l64VarM15830c);
            this.f1085N = n5bVar.mo17237b();
        } else {
            C3397o5 c3397o5 = this.f1094W;
            f6b f6bVar2 = f1077b0;
            Rect rect3 = this.f1082K;
            wsa.m24144b(c3397o5, f6bVar2, rect3);
            if (rect3.equals(f1078c0)) {
                l64 l64VarM15830c2 = l64.m15830c(this.f1085N.m11572b(), this.f1085N.m11574d() + measuredHeight, this.f1085N.m11573c(), this.f1085N.m11571a());
                f6bVar = this.f1085N;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    n5bVar = new s5b(f6bVar);
                } else if (i3 >= 35) {
                    n5bVar = new r5b(f6bVar);
                } else if (i3 >= 34) {
                    n5bVar = new q5b(f6bVar);
                } else if (i3 >= 31) {
                    n5bVar = new p5b(f6bVar);
                } else if (i3 >= 30) {
                    n5bVar = new o5b(f6bVar);
                } else {
                    n5bVar = new n5b(f6bVar);
                }
                n5bVar.mo17241h(l64VarM15830c2);
                this.f1085N = n5bVar.mo17237b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1085N = this.f1085N.f38536a.mo4371r(0, measuredHeight, 0, 0);
            }
        }
        m658a(this.f1097c, rect2, true);
        if (!this.f1086O.equals(this.f1085N)) {
            f6b f6bVar3 = this.f1085N;
            this.f1086O = f6bVar3;
            dta.m10631b(this.f1097c, f6bVar3);
        }
        measureChildWithMargins(this.f1097c, i, 0, i2, 0);
        C3360n5 c3360n6 = (C3360n5) this.f1097c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1097c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c3360n6).leftMargin + ((ViewGroup.MarginLayoutParams) c3360n6).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1097c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c3360n6).topMargin + ((ViewGroup.MarginLayoutParams) c3360n6).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1097c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1103i || !z) {
            return false;
        }
        this.f1088Q.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1088Q.getFinalY() > this.f1098d.getHeight()) {
            m659b();
            this.f1092U.run();
        } else {
            m659b();
            this.f1091T.run();
        }
        this.f1104j = true;
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
        int i5 = this.f1105k + i2;
        this.f1105k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        z4b z4bVar;
        yua yuaVar;
        this.f1093V.m19944c(i);
        this.f1105k = getActionBarHideOffset();
        m659b();
        InterfaceC3323m5 interfaceC3323m5 = this.f1087P;
        if (interfaceC3323m5 == null || (yuaVar = (z4bVar = (z4b) interfaceC3323m5).f70923s) == null) {
            return;
        }
        yuaVar.m25346a();
        z4bVar.f70923s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1098d.getVisibility() != 0) {
            return false;
        }
        return this.f1103i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1103i || this.f1104j) {
            return;
        }
        if (this.f1105k <= this.f1098d.getHeight()) {
            m659b();
            postDelayed(this.f1091T, 600L);
        } else {
            m659b();
            postDelayed(this.f1092U, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m668k();
        int i2 = this.f1106l ^ i;
        this.f1106l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC3323m5 interfaceC3323m5 = this.f1087P;
        if (interfaceC3323m5 != null) {
            z4b z4bVar = (z4b) interfaceC3323m5;
            z4bVar.f70919o = !z2;
            if (z || !z2) {
                if (z4bVar.f70920p) {
                    z4bVar.f70920p = false;
                    z4bVar.m25463f(true);
                }
            } else if (!z4bVar.f70920p) {
                z4bVar.f70920p = true;
                z4bVar.m25463f(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1087P == null) {
            return;
        }
        WeakHashMap weakHashMap = dta.f36217a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1096b = i;
        InterfaceC3323m5 interfaceC3323m5 = this.f1087P;
        if (interfaceC3323m5 != null) {
            ((z4b) interfaceC3323m5).f70918n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m659b();
        this.f1098d.setTranslationY(-Math.max(0, Math.min(i, this.f1098d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC3323m5 interfaceC3323m5) {
        this.f1087P = interfaceC3323m5;
        if (getWindowToken() != null) {
            ((z4b) this.f1087P).f70918n = this.f1096b;
            int i = this.f1106l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = dta.f36217a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1102h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1103i) {
            this.f1103i = z;
            if (z) {
                return;
            }
            m659b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m668k();
        x5a x5aVar = (x5a) this.f1099e;
        x5aVar.f67789d = i != 0 ? bna.m3932U(x5aVar.f67786a.getContext(), i) : null;
        x5aVar.m24290c();
    }

    public void setLogo(int i) {
        m668k();
        x5a x5aVar = (x5a) this.f1099e;
        x5aVar.f67790e = i != 0 ? bna.m3932U(x5aVar.f67786a.getContext(), i) : null;
        x5aVar.m24290c();
    }

    public void setOverlayMode(boolean z) {
        this.f1101g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        m668k();
        ((x5a) this.f1099e).f67796k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m668k();
        x5a x5aVar = (x5a) this.f1099e;
        if (x5aVar.f67792g) {
            return;
        }
        Toolbar toolbar = x5aVar.f67786a;
        x5aVar.f67793h = charSequence;
        if ((x5aVar.f67787b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (x5aVar.f67792g) {
                dta.m10641l(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C3360n5(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m668k();
        x5a x5aVar = (x5a) this.f1099e;
        x5aVar.f67789d = drawable;
        x5aVar.m24290c();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
