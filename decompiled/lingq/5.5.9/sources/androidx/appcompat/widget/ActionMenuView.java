package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.InterfaceC0228j;
import androidx.appcompat.view.menu.InterfaceC0229k;
import java.util.Iterator;
import p471x2.InterfaceC10048l;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends C0323j0 implements C0224f.b, InterfaceC0229k {

    /* JADX INFO: renamed from: K */
    public C0224f f866K;

    /* JADX INFO: renamed from: L */
    public Context f867L;

    /* JADX INFO: renamed from: M */
    public int f868M;

    /* JADX INFO: renamed from: N */
    public boolean f869N;

    /* JADX INFO: renamed from: O */
    public ActionMenuPresenter f870O;

    /* JADX INFO: renamed from: P */
    public InterfaceC0228j.a f871P;

    /* JADX INFO: renamed from: Q */
    public C0224f.a f872Q;

    /* JADX INFO: renamed from: R */
    public boolean f873R;

    /* JADX INFO: renamed from: S */
    public int f874S;

    /* JADX INFO: renamed from: T */
    public final int f875T;

    /* JADX INFO: renamed from: U */
    public final int f876U;

    /* JADX INFO: renamed from: V */
    public InterfaceC0249e f877V;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC0245a {
        /* JADX INFO: renamed from: a */
        boolean mo882a();

        /* JADX INFO: renamed from: b */
        boolean mo883b();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0246b implements InterfaceC0228j.a {
        @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
        /* JADX INFO: renamed from: c */
        public final void mo942c(C0224f c0224f, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
        /* JADX INFO: renamed from: d */
        public final boolean mo943d(C0224f c0224f) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0247c extends C0323j0.a {

        /* JADX INFO: renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f878a;

        /* JADX INFO: renamed from: b */
        @ViewDebug.ExportedProperty
        public int f879b;

        /* JADX INFO: renamed from: c */
        @ViewDebug.ExportedProperty
        public int f880c;

        /* JADX INFO: renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f881d;

        /* JADX INFO: renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f882e;

        /* JADX INFO: renamed from: f */
        public boolean f883f;

        public C0247c() {
            super(-2, -2);
            this.f878a = false;
        }

        public C0247c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0247c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0247c(C0247c c0247c) {
            super(c0247c);
            this.f878a = c0247c.f878a;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0248d implements C0224f.a {
        public C0248d() {
        }

        @Override // androidx.appcompat.view.menu.C0224f.a
        /* JADX INFO: renamed from: a */
        public final boolean mo940a(C0224f c0224f, MenuItem menuItem) {
            boolean z10;
            boolean zOnMenuItemClick;
            InterfaceC0249e interfaceC0249e = ActionMenuView.this.f877V;
            if (interfaceC0249e == null) {
                return false;
            }
            Toolbar toolbar = Toolbar.this;
            Iterator<InterfaceC10048l> it = toolbar.f1083e0.f51036b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (it.next().mo3670a(menuItem)) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                zOnMenuItemClick = true;
            } else {
                Toolbar.InterfaceC0293h interfaceC0293h = toolbar.f1087g0;
                zOnMenuItemClick = interfaceC0293h != null ? interfaceC0293h.onMenuItemClick(menuItem) : false;
            }
            return zOnMenuItemClick;
        }

        @Override // androidx.appcompat.view.menu.C0224f.a
        /* JADX INFO: renamed from: b */
        public final void mo941b(C0224f c0224f) {
            C0224f.a aVar = ActionMenuView.this.f872Q;
            if (aVar != null) {
                aVar.mo941b(c0224f);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC0249e {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f875T = (int) (56.0f * f3);
        this.f876U = (int) (f3 * 4.0f);
        this.f867L = context;
        this.f868M = 0;
    }

    /* JADX INFO: renamed from: l */
    public static C0247c m983l(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            C0247c c0247c = new C0247c();
            ((LinearLayout.LayoutParams) c0247c).gravity = 16;
            return c0247c;
        }
        C0247c c0247c2 = layoutParams instanceof C0247c ? new C0247c((C0247c) layoutParams) : new C0247c(layoutParams);
        if (((LinearLayout.LayoutParams) c0247c2).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0247c2).gravity = 16;
        }
        return c0247c2;
    }

    @Override // androidx.appcompat.view.menu.C0224f.b
    /* JADX INFO: renamed from: a */
    public final boolean mo889a(C0226h c0226h) {
        return this.f866K.m933q(c0226h, null, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k
    /* JADX INFO: renamed from: b */
    public final void mo237b(C0224f c0224f) {
        this.f866K = c0224f;
    }

    @Override // androidx.appcompat.widget.C0323j0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0247c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.C0323j0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0247c c0247c = new C0247c();
        ((LinearLayout.LayoutParams) c0247c).gravity = 16;
        return c0247c;
    }

    @Override // androidx.appcompat.widget.C0323j0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0247c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.C0323j0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m983l(layoutParams);
    }

    public Menu getMenu() {
        if (this.f866K == null) {
            Context context = getContext();
            C0224f c0224f = new C0224f(context);
            this.f866K = c0224f;
            c0224f.f697e = new C0248d();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f870O = actionMenuPresenter;
            actionMenuPresenter.f841H = true;
            actionMenuPresenter.f842I = true;
            InterfaceC0228j.a c0246b = this.f871P;
            if (c0246b == null) {
                c0246b = new C0246b();
            }
            actionMenuPresenter.f637e = c0246b;
            this.f866K.m918b(actionMenuPresenter, this.f867L);
            ActionMenuPresenter actionMenuPresenter2 = this.f870O;
            actionMenuPresenter2.f640h = this;
            this.f866K = actionMenuPresenter2.f635c;
        }
        return this.f866K;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f870O;
        ActionMenuPresenter.C0242d c0242d = actionMenuPresenter.f854j;
        if (c0242d != null) {
            return c0242d.getDrawable();
        }
        if (actionMenuPresenter.f856l) {
            return actionMenuPresenter.f855k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f868M;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.C0323j0
    /* JADX INFO: renamed from: h */
    public final C0323j0.a generateDefaultLayoutParams() {
        C0247c c0247c = new C0247c();
        ((LinearLayout.LayoutParams) c0247c).gravity = 16;
        return c0247c;
    }

    @Override // androidx.appcompat.widget.C0323j0
    /* JADX INFO: renamed from: i */
    public final C0323j0.a generateLayoutParams(AttributeSet attributeSet) {
        return new C0247c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.C0323j0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C0323j0.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m983l(layoutParams);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m987m(int i10) {
        boolean zMo883b = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof InterfaceC0245a)) {
            zMo883b = false | ((InterfaceC0245a) childAt).mo882a();
        }
        if (i10 > 0 && (childAt2 instanceof InterfaceC0245a)) {
            zMo883b |= ((InterfaceC0245a) childAt2).mo883b();
        }
        return zMo883b;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f870O;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo896d(false);
            if (this.f870O.m980j()) {
                this.f870O.m979b();
                this.f870O.m981n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f870O;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m979b();
            ActionMenuPresenter.C0239a c0239a = actionMenuPresenter.f849P;
            if (c0239a == null || !c0239a.m951b()) {
                return;
            }
            c0239a.f759j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.C0323j0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f873R) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zM1200a = C0318h1.m1200a(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C0247c c0247c = (C0247c) childAt.getLayoutParams();
                if (c0247c.f878a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m987m(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM1200a) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0247c).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0247c).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0247c).leftMargin) + ((LinearLayout.LayoutParams) c0247c).rightMargin;
                    m987m(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zM1200a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                C0247c c0247c2 = (C0247c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0247c2.f878a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) c0247c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0247c2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            C0247c c0247c3 = (C0247c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0247c3.f878a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) c0247c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0247c3).rightMargin + iMax + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v40 */
    @Override // androidx.appcompat.widget.C0323j0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        ?? r10;
        int i15;
        C0224f c0224f;
        boolean z12 = this.f873R;
        boolean z13 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f873R = z13;
        if (z12 != z13) {
            this.f874S = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f873R && (c0224f = this.f866K) != null && size != this.f874S) {
            this.f874S = size;
            c0224f.m932p(true);
        }
        int childCount = getChildCount();
        if (!this.f873R || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                C0247c c0247c = (C0247c) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) c0247c).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0247c).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.f875T;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z14 = false;
        int i24 = 0;
        long j10 = 0;
        while (true) {
            i12 = this.f876U;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = i17;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i27 = i22 + 1;
                if (z15) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                C0247c c0247c2 = (C0247c) childAt.getLayoutParams();
                c0247c2.f883f = false;
                c0247c2.f880c = 0;
                c0247c2.f879b = 0;
                c0247c2.f881d = false;
                ((LinearLayout.LayoutParams) c0247c2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0247c2).rightMargin = 0;
                c0247c2.f882e = z15 && ((ActionMenuItemView) childAt).m884l();
                int i28 = c0247c2.f878a ? 1 : i19;
                C0247c c0247c3 = (C0247c) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z15 ? (ActionMenuItemView) childAt : null;
                boolean z16 = actionMenuItemView != null && actionMenuItemView.m884l();
                if (i28 <= 0 || (z16 && i28 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i28 * i21, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i21;
                    if (measuredWidth % i21 != 0) {
                        i15++;
                    }
                    if (z16 && i15 < 2) {
                        i15 = 2;
                    }
                }
                c0247c3.f881d = !c0247c3.f878a && z16;
                c0247c3.f879b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i21 * i15, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (c0247c2.f881d) {
                    i24++;
                }
                if (c0247c2.f878a) {
                    z14 = true;
                }
                i19 -= i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j10 |= (long) (1 << i23);
                }
                i22 = i27;
            }
            i23++;
            size3 = i25;
            i17 = i26;
            paddingBottom = paddingBottom;
            mode = mode;
        }
        int i29 = mode;
        int i30 = i17;
        int i31 = size3;
        boolean z17 = z14 && i22 == 2;
        boolean z18 = false;
        while (true) {
            if (i24 <= 0 || i19 <= 0) {
                z10 = z18;
                break;
            }
            int i32 = Integer.MAX_VALUE;
            int i33 = 0;
            int i34 = 0;
            long j11 = 0;
            while (i34 < childCount2) {
                C0247c c0247c4 = (C0247c) getChildAt(i34).getLayoutParams();
                boolean z19 = z18;
                if (c0247c4.f881d) {
                    int i35 = c0247c4.f879b;
                    if (i35 < i32) {
                        j11 = 1 << i34;
                        i32 = i35;
                        i33 = 1;
                    } else if (i35 == i32) {
                        j11 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z18 = z19;
            }
            z10 = z18;
            j10 |= j11;
            if (i33 > i19) {
                break;
            }
            int i36 = i32 + 1;
            int i37 = 0;
            while (i37 < childCount2) {
                View childAt2 = getChildAt(i37);
                C0247c c0247c5 = (C0247c) childAt2.getLayoutParams();
                int i38 = iMax;
                int i39 = childMeasureSpec;
                int i40 = childCount2;
                long j12 = 1 << i37;
                if ((j11 & j12) != 0) {
                    if (z17 && c0247c5.f882e) {
                        r10 = 1;
                        r10 = 1;
                        if (i19 == 1) {
                            childAt2.setPadding(i12 + i21, 0, i12, 0);
                        }
                    } else {
                        r10 = 1;
                    }
                    c0247c5.f879b += r10;
                    c0247c5.f883f = r10;
                    i19--;
                } else if (c0247c5.f879b == i36) {
                    j10 |= j12;
                }
                i37++;
                childMeasureSpec = i39;
                iMax = i38;
                childCount2 = i40;
            }
            z18 = true;
        }
        int i41 = iMax;
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        boolean z20 = !z14 && i22 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i22 - 1 && !z20 && iMax2 <= 1)) {
            i13 = i43;
            z11 = z10;
        } else {
            float fBitCount = Long.bitCount(j10);
            if (!z20) {
                if ((j10 & 1) != 0 && !((C0247c) getChildAt(0).getLayoutParams()).f882e) {
                    fBitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j10 & ((long) (1 << i44))) != 0 && !((C0247c) getChildAt(i44).getLayoutParams()).f882e) {
                    fBitCount -= 0.5f;
                }
            }
            int i45 = fBitCount > 0.0f ? (int) ((i19 * i21) / fBitCount) : 0;
            boolean z21 = z10;
            i13 = i43;
            for (int i46 = 0; i46 < i13; i46++) {
                if ((j10 & ((long) (1 << i46))) != 0) {
                    View childAt3 = getChildAt(i46);
                    C0247c c0247c6 = (C0247c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0247c6.f880c = i45;
                        c0247c6.f883f = true;
                        if (i46 == 0 && !c0247c6.f882e) {
                            ((LinearLayout.LayoutParams) c0247c6).leftMargin = (-i45) / 2;
                        }
                        z21 = true;
                    } else if (c0247c6.f878a) {
                        c0247c6.f880c = i45;
                        c0247c6.f883f = true;
                        ((LinearLayout.LayoutParams) c0247c6).rightMargin = (-i45) / 2;
                        z21 = true;
                    } else {
                        if (i46 != 0) {
                            ((LinearLayout.LayoutParams) c0247c6).leftMargin = i45 / 2;
                        }
                        if (i46 != i13 - 1) {
                            ((LinearLayout.LayoutParams) c0247c6).rightMargin = i45 / 2;
                        }
                    }
                }
            }
            z11 = z21;
        }
        if (z11) {
            int i47 = 0;
            while (i47 < i13) {
                View childAt4 = getChildAt(i47);
                C0247c c0247c7 = (C0247c) childAt4.getLayoutParams();
                if (c0247c7.f883f) {
                    i14 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0247c7.f879b * i21) + c0247c7.f880c, 1073741824), i14);
                } else {
                    i14 = i42;
                }
                i47++;
                i42 = i14;
            }
        }
        setMeasuredDimension(i30, i29 != 1073741824 ? i41 : i31);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f870O.f846M = z10;
    }

    public void setOnMenuItemClickListener(InterfaceC0249e interfaceC0249e) {
        this.f877V = interfaceC0249e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f870O;
        ActionMenuPresenter.C0242d c0242d = actionMenuPresenter.f854j;
        if (c0242d != null) {
            c0242d.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.f856l = true;
            actionMenuPresenter.f855k = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.f869N = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f868M != i10) {
            this.f868M = i10;
            if (i10 == 0) {
                this.f867L = getContext();
            } else {
                this.f867L = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f870O = actionMenuPresenter;
        actionMenuPresenter.f640h = this;
        this.f866K = actionMenuPresenter.f635c;
    }
}
