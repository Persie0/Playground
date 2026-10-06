package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.wear.ambient.AmbientMode;
import p000.C0225gw;
import p000.C0227gy;
import p000.C0259ic;
import p000.C0261ie;
import p000.C0262if;
import p000.C0263ig;
import p000.C0783kw;
import p000.C0864nw;
import p000.InterfaceC0223gu;
import p000.InterfaceC0224gv;
import p000.InterfaceC0238hi;
import p000.InterfaceC0241hl;
import p000.InterfaceC0260id;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements InterfaceC0224gv, InterfaceC0241hl {

    /* JADX INFO: renamed from: a */
    public C0225gw f987a;

    /* JADX INFO: renamed from: b */
    public boolean f988b;

    /* JADX INFO: renamed from: c */
    public C0259ic f989c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0223gu f990d;

    /* JADX INFO: renamed from: e */
    public AmbientMode.AmbientController f991e;

    /* JADX INFO: renamed from: i */
    private Context f992i;

    /* JADX INFO: renamed from: j */
    private int f993j;

    /* JADX INFO: renamed from: k */
    private InterfaceC0238hi f994k;

    /* JADX INFO: renamed from: l */
    private boolean f995l;

    /* JADX INFO: renamed from: m */
    private int f996m;

    /* JADX INFO: renamed from: n */
    private int f997n;

    /* JADX INFO: renamed from: o */
    private int f998o;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: n */
    public static final C0262if m1068n() {
        C0262if c0262if = new C0262if();
        c0262if.gravity = 16;
        return c0262if;
    }

    /* JADX INFO: renamed from: o */
    public static final C0262if m1069o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m1068n();
        }
        C0262if c0262if = layoutParams instanceof C0262if ? new C0262if((C0262if) layoutParams) : new C0262if(layoutParams);
        if (c0262if.gravity <= 0) {
            c0262if.gravity = 16;
        }
        return c0262if;
    }

    @Override // p000.InterfaceC0241hl
    /* JADX INFO: renamed from: a */
    public final void mo1036a(C0225gw c0225gw) {
        this.f987a = c0225gw;
    }

    @Override // p000.InterfaceC0224gv
    /* JADX INFO: renamed from: b */
    public final boolean mo1037b(C0227gy c0227gy) {
        return this.f987a.m9846z(c0227gy, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: bX */
    public final /* bridge */ /* synthetic */ C0783kw generateDefaultLayoutParams() {
        return m1068n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: bZ */
    public final /* bridge */ /* synthetic */ C0783kw generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1069o(layoutParams);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0262if generateLayoutParams(AttributeSet attributeSet) {
        return new C0262if(getContext(), attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0262if;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final Menu m1074g() {
        if (this.f987a == null) {
            Context context = getContext();
            C0225gw c0225gw = new C0225gw(context);
            this.f987a = c0225gw;
            c0225gw.mo9836p(new C0263ig(this, 0));
            C0259ic c0259ic = new C0259ic(context);
            this.f989c = c0259ic;
            c0259ic.m11041p();
            C0259ic c0259ic2 = this.f989c;
            InterfaceC0238hi c0261ie = this.f994k;
            if (c0261ie == null) {
                c0261ie = new C0261ie();
            }
            c0259ic2.f25575e = c0261ie;
            this.f987a.m9828h(this.f989c, this.f992i);
            this.f989c.m11035j(this);
        }
        return this.f987a;
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1068n();
    }

    /* JADX INFO: renamed from: h */
    public final void m1075h() {
        C0259ic c0259ic = this.f989c;
        if (c0259ic != null) {
            c0259ic.m11039n();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1076i(InterfaceC0238hi interfaceC0238hi, InterfaceC0223gu interfaceC0223gu) {
        this.f994k = interfaceC0238hi;
        this.f990d = interfaceC0223gu;
    }

    /* JADX INFO: renamed from: j */
    public final void m1077j(int i) {
        if (this.f993j != i) {
            this.f993j = i;
            if (i == 0) {
                this.f992i = getContext();
            } else {
                this.f992i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1078k(C0259ic c0259ic) {
        this.f989c = c0259ic;
        c0259ic.m11035j(this);
    }

    /* JADX INFO: renamed from: l */
    protected final boolean m1079l(int i) {
        boolean zMo1032c = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0260id)) {
            zMo1032c = ((InterfaceC0260id) childAt).mo1032c();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0260id)) ? zMo1032c : ((InterfaceC0260id) childAt2).mo1033d() | zMo1032c;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1080m() {
        C0259ic c0259ic = this.f989c;
        return c0259ic != null && c0259ic.m11037l();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0259ic c0259ic = this.f989c;
        if (c0259ic != null) {
            c0259ic.mo9491i();
            if (this.f989c.m11037l()) {
                this.f989c.m11036k();
                this.f989c.m11038m();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1075h();
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.f995l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = i4 - i2;
        int i8 = this.f1032h;
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean zM17748a = C0864nw.m17748a(this);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i5 = i7 / 2;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0262if c0262if = (C0262if) childAt.getLayoutParams();
                if (c0262if.f30586a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1079l(i10)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM17748a) {
                        int paddingLeft = getPaddingLeft() + c0262if.leftMargin;
                        width = paddingLeft + measuredWidth;
                        i6 = paddingLeft;
                    } else {
                        width = (getWidth() - getPaddingRight()) - c0262if.rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i13 = i5 - (measuredHeight / 2);
                    childAt.layout(i6, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + c0262if.leftMargin) + c0262if.rightMargin;
                    m1079l(i10);
                    i12++;
                }
            }
            i10++;
        }
        if (childCount == 1) {
            if (i11 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i14 = i5 - (measuredHeight2 / 2);
                int i15 = (i9 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i15, i14, measuredWidth2 + i15, measuredHeight2 + i14);
                return;
            }
            childCount = 1;
        }
        int i16 = i12 - (i11 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (zM17748a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0262if c0262if2 = (C0262if) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0262if2.f30586a) {
                    int i18 = width2 - c0262if2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + c0262if2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0262if c0262if3 = (C0262if) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0262if3.f30586a) {
                int i21 = paddingLeft2 + c0262if3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = i21 + measuredWidth4 + c0262if3.rightMargin + iMax;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v40 */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r6;
        int i4;
        C0225gw c0225gw;
        boolean z5 = this.f995l;
        boolean z6 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f995l = z6;
        if (z5 != z6) {
            this.f996m = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f995l && (c0225gw = this.f987a) != null && size != this.f996m) {
            this.f996m = size;
            c0225gw.m9832l(true);
        }
        int childCount = getChildCount();
        if (!this.f995l || childCount <= 0) {
            int i5 = 0;
            while (i5 < childCount) {
                C0262if c0262if = (C0262if) getChildAt(i5).getLayoutParams();
                c0262if.rightMargin = 0;
                c0262if.leftMargin = 0;
                i5++;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i6 = size2 - paddingLeft;
        int i7 = this.f997n;
        int i8 = i6 / i7;
        int i9 = i6 % i7;
        if (i8 == 0) {
            setMeasuredDimension(i6, 0);
            return;
        }
        int i10 = i7 + (i9 / i8);
        int childCount2 = getChildCount();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z7 = false;
        long j = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i13 < childCount2) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                size3 = size3;
            } else {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i14 = i11 + 1;
                if (z8) {
                    int i15 = this.f998o;
                    r6 = 0;
                    childAt.setPadding(i15, 0, i15, 0);
                } else {
                    r6 = 0;
                }
                C0262if c0262if2 = (C0262if) childAt.getLayoutParams();
                c0262if2.f30591f = r6;
                c0262if2.f30588c = r6;
                c0262if2.f30587b = r6;
                c0262if2.f30589d = r6;
                c0262if2.leftMargin = r6;
                c0262if2.rightMargin = r6;
                c0262if2.f30590e = z8 && ((ActionMenuItemView) childAt).m1031b();
                int i16 = true != c0262if2.f30586a ? i8 : 1;
                C0262if c0262if3 = (C0262if) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z8 ? (ActionMenuItemView) childAt : null;
                boolean z9 = actionMenuItemView != null && actionMenuItemView.m1031b();
                if (i16 <= 0 || (z9 && i16 < 2)) {
                    i4 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i10, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i4 = measuredWidth / i10;
                    if (measuredWidth % i10 != 0) {
                        i4++;
                    }
                    if (z9 && i4 < 2) {
                        i4 = 2;
                    }
                }
                c0262if3.f30589d = !c0262if3.f30586a && z9;
                c0262if3.f30587b = i4;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4 * i10, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i4);
                if (c0262if2.f30589d) {
                    i12++;
                }
                z7 |= c0262if2.f30586a;
                i8 -= i4;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i4 == 1) {
                    j |= (long) (1 << i13);
                }
                i11 = i14;
            }
            i13++;
            size3 = size3;
            paddingTop = paddingTop;
            i6 = i6;
        }
        int i17 = i6;
        int i18 = size3;
        int i19 = iMax;
        int i20 = iMax2;
        if (z7 && i11 == 2) {
            z = true;
            i11 = 2;
        } else {
            z = false;
        }
        boolean z10 = false;
        while (true) {
            if (i12 <= 0 || i8 <= 0) {
                i3 = i20;
                z2 = z10;
                break;
            }
            int i21 = Integer.MAX_VALUE;
            int i22 = 0;
            int i23 = 0;
            long j2 = 0;
            while (i23 < childCount2) {
                int i24 = i20;
                C0262if c0262if4 = (C0262if) getChildAt(i23).getLayoutParams();
                boolean z11 = z10;
                if (c0262if4.f30589d) {
                    int i25 = c0262if4.f30587b;
                    if (i25 < i21) {
                        j2 = 1 << i23;
                        i22 = 1;
                        i21 = i25;
                    } else if (i25 == i21) {
                        i22++;
                        j2 |= 1 << i23;
                    }
                }
                i23++;
                z10 = z11;
                i20 = i24;
            }
            i3 = i20;
            z2 = z10;
            j |= j2;
            if (i22 > i8) {
                break;
            }
            int i26 = i21 + 1;
            int i27 = 0;
            while (i27 < childCount2) {
                View childAt2 = getChildAt(i27);
                C0262if c0262if5 = (C0262if) childAt2.getLayoutParams();
                int i28 = i12;
                long j3 = 1 << i27;
                if ((j2 & j3) != 0) {
                    if (z && c0262if5.f30590e && i8 == 1) {
                        int i29 = this.f998o;
                        childAt2.setPadding(i29 + i10, 0, i29, 0);
                        i8 = 1;
                    }
                    c0262if5.f30587b++;
                    c0262if5.f30591f = true;
                    i8--;
                } else if (c0262if5.f30587b == i26) {
                    j |= j3;
                }
                i27++;
                i12 = i28;
            }
            i20 = i3;
            z10 = true;
        }
        if (z7 || i11 != 1) {
            z3 = false;
        } else {
            z3 = true;
            i11 = 1;
        }
        if (i8 <= 0 || j == 0 || (i8 >= i11 - 1 && !z3 && i19 <= 1)) {
            z4 = z2;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z3) {
                if ((j & 1) != 0 && !((C0262if) getChildAt(0).getLayoutParams()).f30590e) {
                    fBitCount -= 0.5f;
                }
                int i30 = childCount2 - 1;
                if ((j & ((long) (1 << i30))) != 0 && !((C0262if) getChildAt(i30).getLayoutParams()).f30590e) {
                    fBitCount -= 0.5f;
                }
            }
            int i31 = fBitCount > 0.0f ? (int) ((i8 * i10) / fBitCount) : 0;
            boolean z12 = z2;
            int i32 = 0;
            while (i32 < childCount2) {
                if ((j & ((long) (1 << i32))) != 0) {
                    View childAt3 = getChildAt(i32);
                    C0262if c0262if6 = (C0262if) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0262if6.f30588c = i31;
                        c0262if6.f30591f = true;
                        if (i32 == 0) {
                            if (!c0262if6.f30590e) {
                                c0262if6.leftMargin = (-i31) / 2;
                            }
                            i32 = 0;
                        }
                        z12 = true;
                    } else if (c0262if6.f30586a) {
                        c0262if6.f30588c = i31;
                        c0262if6.f30591f = true;
                        c0262if6.rightMargin = (-i31) / 2;
                        z12 = true;
                    } else {
                        if (i32 != 0) {
                            c0262if6.leftMargin = i31 / 2;
                        }
                        if (i32 != childCount2 - 1) {
                            c0262if6.rightMargin = i31 / 2;
                        }
                    }
                }
                i32++;
            }
            z4 = z12;
        }
        if (z4) {
            for (int i33 = 0; i33 < childCount2; i33++) {
                View childAt4 = getChildAt(i33);
                C0262if c0262if7 = (C0262if) childAt4.getLayoutParams();
                if (c0262if7.f30591f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0262if7.f30587b * i10) + c0262if7.f30588c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode == 1073741824 ? i18 : i3);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1123t();
        float f = context.getResources().getDisplayMetrics().density;
        this.f997n = (int) (56.0f * f);
        this.f998o = (int) (f * 4.0f);
        this.f992i = context;
        this.f993j = 0;
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1069o(layoutParams);
    }
}
