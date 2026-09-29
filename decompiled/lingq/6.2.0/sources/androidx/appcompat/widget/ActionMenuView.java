package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p000.C3636u5;
import p000.C3747x5;
import p000.C3821z5;
import p000.InterfaceC0008a6;
import p000.InterfaceC3784y5;
import p000.bd5;
import p000.cd5;
import p000.gw5;
import p000.hw5;
import p000.ix5;
import p000.mw5;
import p000.to2;
import p000.vqb;
import p000.web;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends cd5 implements gw5, ix5 {

    /* JADX INFO: renamed from: K */
    public hw5 f1108K;

    /* JADX INFO: renamed from: L */
    public Context f1109L;

    /* JADX INFO: renamed from: M */
    public int f1110M;

    /* JADX INFO: renamed from: N */
    public boolean f1111N;

    /* JADX INFO: renamed from: O */
    public C0035b f1112O;

    /* JADX INFO: renamed from: P */
    public web f1113P;

    /* JADX INFO: renamed from: Q */
    public boolean f1114Q;

    /* JADX INFO: renamed from: R */
    public int f1115R;

    /* JADX INFO: renamed from: S */
    public final int f1116S;

    /* JADX INFO: renamed from: T */
    public final int f1117T;

    /* JADX INFO: renamed from: U */
    public InterfaceC0008a6 f1118U;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1116S = (int) (56.0f * f);
        this.f1117T = (int) (f * 4.0f);
        this.f1109L = context;
        this.f1110M = 0;
    }

    /* JADX INFO: renamed from: j */
    public static C3821z5 m670j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            C3821z5 c3821z5 = new C3821z5();
            ((LinearLayout.LayoutParams) c3821z5).gravity = 16;
            return c3821z5;
        }
        C3821z5 c3821z6 = layoutParams instanceof C3821z5 ? new C3821z5((C3821z5) layoutParams) : new C3821z5(layoutParams);
        if (((LinearLayout.LayoutParams) c3821z6).gravity <= 0) {
            ((LinearLayout.LayoutParams) c3821z6).gravity = 16;
        }
        return c3821z6;
    }

    @Override // p000.gw5
    /* JADX INFO: renamed from: a */
    public final boolean mo647a(mw5 mw5Var) {
        return this.f1108K.m13534q(mw5Var, null, 0);
    }

    @Override // p000.ix5
    /* JADX INFO: renamed from: b */
    public final void mo648b(hw5 hw5Var) {
        this.f1108K = hw5Var;
    }

    @Override // p000.cd5, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3821z5;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p000.cd5
    /* JADX INFO: renamed from: f */
    public final bd5 generateDefaultLayoutParams() {
        C3821z5 c3821z5 = new C3821z5();
        ((LinearLayout.LayoutParams) c3821z5).gravity = 16;
        return c3821z5;
    }

    @Override // p000.cd5
    /* JADX INFO: renamed from: g */
    public final bd5 generateLayoutParams(AttributeSet attributeSet) {
        return new C3821z5(getContext(), attributeSet);
    }

    @Override // p000.cd5, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C3821z5 c3821z5 = new C3821z5();
        ((LinearLayout.LayoutParams) c3821z5).gravity = 16;
        return c3821z5;
    }

    @Override // p000.cd5, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3821z5(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f1108K == null) {
            Context context = getContext();
            hw5 hw5Var = new hw5(context);
            this.f1108K = hw5Var;
            hw5Var.f43041e = new vqb(this, 1);
            C0035b c0035b = new C0035b(context);
            this.f1112O = c0035b;
            c0035b.f1201H = true;
            c0035b.f1202I = true;
            c0035b.f1218e = new to2();
            this.f1108K.m13519b(c0035b, this.f1109L);
            C0035b c0035b2 = this.f1112O;
            c0035b2.f1221h = this;
            this.f1108K = c0035b2.f1216c;
        }
        return this.f1108K;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0035b c0035b = this.f1112O;
        C3747x5 c3747x5 = c0035b.f1223j;
        if (c3747x5 != null) {
            return c3747x5.getDrawable();
        }
        if (c0035b.f1225l) {
            return c0035b.f1224k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1110M;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p000.cd5
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ bd5 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m670j(layoutParams);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m674k(int i) {
        boolean zMo641a = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC3784y5)) {
            zMo641a = ((InterfaceC3784y5) childAt).mo641a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC3784y5)) ? zMo641a : ((InterfaceC3784y5) childAt2).mo642b() | zMo641a;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0035b c0035b = this.f1112O;
        if (c0035b != null) {
            c0035b.mo703c(false);
            if (this.f1112O.m711k()) {
                this.f1112O.m706f();
                this.f1112O.m714n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0035b c0035b = this.f1112O;
        if (c0035b != null) {
            c0035b.m706f();
            C3636u5 c3636u5 = c0035b.f1209P;
            if (c3636u5 != null) {
                c3636u5.m24176a();
            }
        }
    }

    @Override // p000.cd5, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f1114Q) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C3821z5 c3821z5 = (C3821z5) childAt.getLayoutParams();
                if (c3821z5.f70930a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m674k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c3821z5).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c3821z5).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c3821z5).leftMargin) + ((LinearLayout.LayoutParams) c3821z5).rightMargin;
                    m674k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C3821z5 c3821z6 = (C3821z5) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c3821z6.f70930a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c3821z6).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c3821z6).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C3821z5 c3821z7 = (C3821z5) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c3821z7.f70930a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c3821z7).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c3821z7).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // p000.cd5, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        hw5 hw5Var;
        boolean z = this.f1114Q;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1114Q = z2;
        if (z != z2) {
            this.f1115R = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1114Q && (hw5Var = this.f1108K) != null && size != this.f1115R) {
            this.f1115R = size;
            hw5Var.m13533p(true);
        }
        int childCount = getChildCount();
        if (!this.f1114Q || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C3821z5 c3821z5 = (C3821z5) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c3821z5).rightMargin = 0;
                ((LinearLayout.LayoutParams) c3821z5).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f1116S;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.f1117T;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C3821z5 c3821z6 = (C3821z5) childAt.getLayoutParams();
                c3821z6.f70935f = false;
                c3821z6.f70932c = 0;
                c3821z6.f70931b = 0;
                c3821z6.f70933d = false;
                ((LinearLayout.LayoutParams) c3821z6).leftMargin = 0;
                ((LinearLayout.LayoutParams) c3821z6).rightMargin = 0;
                c3821z6.f70934e = z4 && ((ActionMenuItemView) childAt).m644e();
                int i18 = c3821z6.f70930a ? 1 : i10;
                C3821z5 c3821z7 = (C3821z5) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = actionMenuItemView != null && actionMenuItemView.m644e();
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                c3821z7.f70933d = !c3821z7.f70930a && z6;
                c3821z7.f70931b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c3821z6.f70933d) {
                    i15++;
                }
                if (c3821z6.f70930a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                C3821z5 c3821z8 = (C3821z5) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c3821z8.f70933d) {
                    int i28 = c3821z8.f70931b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C3821z5 c3821z9 = (C3821z5) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c3821z9.f70934e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c3821z9.f70931b += r11;
                    c3821z9.f70935f = r11;
                    i23--;
                } else if (c3821z9.f70931b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((C3821z5) getChildAt(0).getLayoutParams()).f70934e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C3821z5) getChildAt(i31).getLayoutParams()).f70934e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C3821z5 c3821z10 = (C3821z5) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c3821z10.f70932c = i32;
                        c3821z10.f70935f = true;
                        if (i33 == 0 && !c3821z10.f70934e) {
                            ((LinearLayout.LayoutParams) c3821z10).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c3821z10.f70930a) {
                        c3821z10.f70932c = i32;
                        c3821z10.f70935f = true;
                        ((LinearLayout.LayoutParams) c3821z10).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c3821z10).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c3821z10).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C3821z5 c3821z11 = (C3821z5) childAt4.getLayoutParams();
                if (c3821z11.f70935f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c3821z11.f70931b * i22) + c3821z11.f70932c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1112O.f1206M = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0008a6 interfaceC0008a6) {
        this.f1118U = interfaceC0008a6;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0035b c0035b = this.f1112O;
        C3747x5 c3747x5 = c0035b.f1223j;
        if (c3747x5 != null) {
            c3747x5.setImageDrawable(drawable);
        } else {
            c0035b.f1225l = true;
            c0035b.f1224k = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f1111N = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1110M != i) {
            this.f1110M = i;
            if (i == 0) {
                this.f1109L = getContext();
            } else {
                this.f1109L = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0035b c0035b) {
        this.f1112O = c0035b;
        c0035b.f1221h = this;
        this.f1108K = c0035b.f1216c;
    }

    @Override // p000.cd5, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m670j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
