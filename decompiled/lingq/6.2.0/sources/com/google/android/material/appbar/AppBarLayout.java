package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$integer;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.lingq.core.p012ui.views.CollapsibleToolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC0853cn;
import p000.AbstractC3122is;
import p000.AbstractC3184kh;
import p000.AbstractC3584sr;
import p000.C3156jq;
import p000.C3386nv;
import p000.C3692vo;
import p000.C3729wo;
import p000.ata;
import p000.bna;
import p000.ck6;
import p000.dta;
import p000.dy9;
import p000.f6b;
import p000.fs5;
import p000.hm1;
import p000.im1;
import p000.k80;
import p000.l79;
import p000.lm1;
import p000.lr3;
import p000.nr3;
import p000.omd;
import p000.pb1;
import p000.pxc;
import p000.qs5;
import p000.r46;
import p000.rj6;
import p000.wsa;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements hm1 {

    /* JADX INFO: renamed from: W */
    public static final int f12562W = R$style.Widget_Design_AppBarLayout;

    /* JADX INFO: renamed from: H */
    public ColorStateList f12563H;

    /* JADX INFO: renamed from: I */
    public int f12564I;

    /* JADX INFO: renamed from: J */
    public WeakReference f12565J;

    /* JADX INFO: renamed from: K */
    public ValueAnimator f12566K;

    /* JADX INFO: renamed from: L */
    public ValueAnimator.AnimatorUpdateListener f12567L;

    /* JADX INFO: renamed from: M */
    public final ArrayList f12568M;

    /* JADX INFO: renamed from: N */
    public final LinkedHashSet f12569N;

    /* JADX INFO: renamed from: O */
    public final long f12570O;

    /* JADX INFO: renamed from: P */
    public final TimeInterpolator f12571P;

    /* JADX INFO: renamed from: Q */
    public int[] f12572Q;

    /* JADX INFO: renamed from: R */
    public int f12573R;

    /* JADX INFO: renamed from: S */
    public Drawable f12574S;

    /* JADX INFO: renamed from: T */
    public Integer f12575T;

    /* JADX INFO: renamed from: U */
    public final float f12576U;

    /* JADX INFO: renamed from: V */
    public Behavior f12577V;

    /* JADX INFO: renamed from: a */
    public int f12578a;

    /* JADX INFO: renamed from: b */
    public int f12579b;

    /* JADX INFO: renamed from: c */
    public int f12580c;

    /* JADX INFO: renamed from: d */
    public int f12581d;

    /* JADX INFO: renamed from: e */
    public boolean f12582e;

    /* JADX INFO: renamed from: f */
    public int f12583f;

    /* JADX INFO: renamed from: g */
    public f6b f12584g;

    /* JADX INFO: renamed from: h */
    public ArrayList f12585h;

    /* JADX INFO: renamed from: i */
    public boolean f12586i;

    /* JADX INFO: renamed from: j */
    public boolean f12587j;

    /* JADX INFO: renamed from: k */
    public boolean f12588k;

    /* JADX INFO: renamed from: l */
    public boolean f12589l;

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12562W;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        this.f12579b = -1;
        this.f12580c = -1;
        this.f12581d = -1;
        this.f12583f = 0;
        this.f12568M = new ArrayList();
        this.f12569N = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayM10751d = dy9.m10751d(context3, attributeSet, pxc.f56964a, i, i2, new int[0]);
        try {
            if (typedArrayM10751d.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayM10751d.getResourceId(0, 0)));
            }
            typedArrayM10751d.recycle();
            TypedArray typedArrayM10751d2 = dy9.m10751d(context2, attributeSet, R$styleable.AppBarLayout, i, i2, new int[0]);
            this.f12563H = pb1.m19054x(context2, typedArrayM10751d2, R$styleable.AppBarLayout_liftOnScrollColor);
            this.f12570O = r46.m20364G(context2, R$attr.motionDurationMedium2, getResources().getInteger(R$integer.app_bar_elevation_anim_duration));
            this.f12571P = r46.m20365H(context2, R$attr.motionEasingStandardInterpolator, AbstractC0853cn.f10296a);
            if (typedArrayM10751d2.hasValue(R$styleable.AppBarLayout_expanded)) {
                m5983e(typedArrayM10751d2.getBoolean(R$styleable.AppBarLayout_expanded, false), false, false);
            }
            if (typedArrayM10751d2.hasValue(R$styleable.AppBarLayout_elevation)) {
                pxc.m19567b(this, typedArrayM10751d2.getDimensionPixelSize(R$styleable.AppBarLayout_elevation, 0));
            }
            setBackground(typedArrayM10751d2.getDrawable(R$styleable.AppBarLayout_android_background));
            if (typedArrayM10751d2.hasValue(R$styleable.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(typedArrayM10751d2.getBoolean(R$styleable.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (typedArrayM10751d2.hasValue(R$styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(typedArrayM10751d2.getBoolean(R$styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
            this.f12576U = getResources().getDimension(R$dimen.design_appbar_elevation);
            this.f12589l = typedArrayM10751d2.getBoolean(R$styleable.AppBarLayout_liftOnScroll, false);
            this.f12564I = typedArrayM10751d2.getResourceId(R$styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
            setStatusBarForeground(typedArrayM10751d2.getDrawable(R$styleable.AppBarLayout_statusBarForeground));
            typedArrayM10751d2.recycle();
            ck6 ck6Var = new ck6(this, 2);
            WeakHashMap weakHashMap = dta.f36217a;
            wsa.m24145c(this, ck6Var);
        } catch (Throwable th) {
            typedArrayM10751d.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C3729wo m5979b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            C3729wo c3729wo = new C3729wo((LinearLayout.LayoutParams) layoutParams);
            c3729wo.f67108a = 1;
            return c3729wo;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C3729wo c3729wo2 = new C3729wo((ViewGroup.MarginLayoutParams) layoutParams);
            c3729wo2.f67108a = 1;
            return c3729wo2;
        }
        C3729wo c3729wo3 = new C3729wo(layoutParams);
        c3729wo3.f67108a = 1;
        return c3729wo3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3729wo generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C3729wo c3729wo = new C3729wo(context, attributeSet);
        c3729wo.f67108a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
        c3729wo.f67108a = typedArrayObtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
        c3729wo.f67109b = typedArrayObtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new C3156jq(6);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
            c3729wo.f67110c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return c3729wo;
    }

    /* JADX INFO: renamed from: c */
    public final void m5981c() {
        Behavior behavior = this.f12577V;
        BaseBehavior.SavedState savedStateM5992F = (behavior == null || this.f12579b == -1 || this.f12583f != 0) ? null : behavior.m5992F(AbsSavedState.f5562b, this);
        this.f12579b = -1;
        this.f12580c = -1;
        this.f12581d = -1;
        if (savedStateM5992F != null) {
            Behavior behavior2 = this.f12577V;
            if (behavior2.f12593m != null) {
                return;
            }
            behavior2.f12593m = savedStateM5992F;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3729wo;
    }

    /* JADX INFO: renamed from: d */
    public final void m5982d(int i) {
        this.f12578a = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.f12585h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                CollapsibleToolbar collapsibleToolbar = (CollapsibleToolbar) this.f12585h.get(i2);
                if (collapsibleToolbar != null && collapsibleToolbar.f24178T0) {
                    collapsibleToolbar.setProgress((-i) / getTotalScrollRange());
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f12574S == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f12578a);
        this.f12574S.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f12574S;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5983e(boolean z, boolean z2, boolean z3) {
        this.f12583f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5984f(boolean z) {
        if (this.f12586i || this.f12588k == z) {
            return false;
        }
        this.f12588k = z;
        refreshDrawableState();
        if (!(getBackground() instanceof fs5)) {
            return true;
        }
        if (this.f12563H != null) {
            m5986h(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f12589l) {
            return true;
        }
        float f = this.f12576U;
        m5986h(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5985g(View view) {
        int i;
        if (this.f12565J == null && (i = this.f12564I) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f12564I);
            }
            if (viewFindViewById != null) {
                this.f12565J = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f12565J;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C3729wo c3729wo = new C3729wo(-1, -2);
        c3729wo.f67108a = 1;
        return c3729wo;
    }

    @Override // p000.hm1
    public im1 getBehavior() {
        Behavior behavior = new Behavior();
        this.f12577V = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.f12580c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C3729wo c3729wo = (C3729wo) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = c3729wo.f67108a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) c3729wo).topMargin + ((LinearLayout.LayoutParams) c3729wo).bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.f12580c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f12581d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C3729wo c3729wo = (C3729wo) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c3729wo).topMargin + ((LinearLayout.LayoutParams) c3729wo).bottomMargin + childAt.getMeasuredHeight();
                int i3 = c3729wo.f67108a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f12581d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f12564I;
    }

    public fs5 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof fs5) {
            return (fs5) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f12583f;
    }

    public Drawable getStatusBarForeground() {
        return this.f12574S;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        f6b f6bVar = this.f12584g;
        if (f6bVar != null) {
            return f6bVar.m11574d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f12579b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C3729wo c3729wo = (C3729wo) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = c3729wo.f67108a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) c3729wo).topMargin + ((LinearLayout.LayoutParams) c3729wo).bottomMargin + minimumHeight;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f12579b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: renamed from: h */
    public final void m5986h(float f, float f2) {
        ValueAnimator valueAnimator = this.f12566K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f12566K = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f12570O);
        this.f12566K.setInterpolator(this.f12571P);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f12567L;
        if (animatorUpdateListener != null) {
            this.f12566K.addUpdateListener(animatorUpdateListener);
        }
        this.f12566K.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof fs5) {
            AbstractC3184kh.m15200G(this, (fs5) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f12572Q == null) {
            this.f12572Q = new int[4];
        }
        int[] iArr = this.f12572Q;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f12587j;
        int i2 = R$attr.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.f12588k) ? R$attr.state_lifted : -R$attr.state_lifted;
        int i3 = R$attr.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.f12588k) ? R$attr.state_collapsed : -R$attr.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f12565J;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f12565J = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = dta.f36217a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        m5981c();
        this.f12582e = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((C3729wo) getChildAt(i5).getLayoutParams()).f67110c != null) {
                this.f12582e = true;
                break;
            }
        }
        Drawable drawable = this.f12574S;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f12586i) {
            return;
        }
        if (!this.f12589l) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((C3729wo) getChildAt(i6).getLayoutParams()).f67108a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.f12587j != z2) {
            this.f12587j = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = AbstractC3584sr.m21645x(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        m5981c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final fs5 fs5Var;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof fs5) {
            fs5Var = (fs5) drawable;
        } else {
            ColorStateList colorStateListM14107u = AbstractC3122is.m14107u(drawable);
            if (colorStateListM14107u == null) {
                fs5Var = null;
            } else {
                fs5 fs5Var2 = new fs5();
                fs5Var2.m12076t(colorStateListM14107u);
                fs5Var = fs5Var2;
            }
        }
        if (fs5Var != null && (colorStateList = fs5Var.f39578b.f36162c) != null) {
            this.f12573R = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.f12563H;
            if (colorStateList2 != null) {
                final Integer numM18120H = omd.m18120H(getContext(), R$attr.colorSurface);
                this.f12567L = new ValueAnimator.AnimatorUpdateListener() { // from class: uo
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.f64121a;
                        LinkedHashSet linkedHashSet = appBarLayout.f12569N;
                        ArrayList arrayList = appBarLayout.f12568M;
                        int iM18130T = omd.m18130T(appBarLayout.f12573R, ((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateList2.getDefaultColor());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM18130T);
                        fs5 fs5Var3 = fs5Var;
                        fs5Var3.m12076t(colorStateListValueOf);
                        if (appBarLayout.f12574S != null && (num = appBarLayout.f12575T) != null && num.equals(numM18120H)) {
                            appBarLayout.f12574S.setTint(iM18130T);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    ho2.m13383c();
                                    return;
                                } else if (fs5Var3.f39578b.f36162c != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw wq1.m24110f(it2);
                        }
                    }
                };
            } else {
                fs5Var.m12072p(context);
                this.f12567L = new C3692vo(0, this, fs5Var);
            }
            drawable = fs5Var;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof fs5) {
            ((fs5) background).m12075s(f);
        }
    }

    public void setExpanded(boolean z) {
        m5983e(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f12589l = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f12563H != colorStateList) {
            this.f12563H = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f12564I = -1;
        if (view != null) {
            this.f12565J = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.f12565J;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f12565J = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f12564I = i;
        WeakReference weakReference = this.f12565J;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f12565J = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f12586i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            C3386nv.m17626m("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i) {
        this.f12583f = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f12574S;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f12574S = drawableMutate;
            if (drawableMutate instanceof fs5) {
                numValueOf = Integer.valueOf(((fs5) drawableMutate).f39567Q);
            } else {
                ColorStateList colorStateListM14107u = AbstractC3122is.m14107u(drawableMutate);
                if (colorStateListM14107u != null) {
                    numValueOf = Integer.valueOf(colorStateListM14107u.getDefaultColor());
                }
            }
            this.f12575T = numValueOf;
            Drawable drawable3 = this.f12574S;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f12574S.setState(getDrawableState());
                }
                this.f12574S.setLayoutDirection(getLayoutDirection());
                this.f12574S.setVisible(getVisibility() == 0, false);
                this.f12574S.setCallback(this);
            }
            if (this.f12574S != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(bna.m3932U(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        pxc.m19567b(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f12574S;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12574S;
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m5979b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m5979b(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends lr3 {

        /* JADX INFO: renamed from: j */
        public int f12590j;

        /* JADX INFO: renamed from: k */
        public int f12591k;

        /* JADX INFO: renamed from: l */
        public ValueAnimator f12592l;

        /* JADX INFO: renamed from: m */
        public SavedState f12593m;

        /* JADX INFO: renamed from: n */
        public WeakReference f12594n;

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C1048c();

            /* JADX INFO: renamed from: c */
            public boolean f12595c;

            /* JADX INFO: renamed from: d */
            public boolean f12596d;

            /* JADX INFO: renamed from: e */
            public int f12597e;

            /* JADX INFO: renamed from: f */
            public float f12598f;

            /* JADX INFO: renamed from: g */
            public boolean f12599g;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f12595c = parcel.readByte() != 0;
                this.f12596d = parcel.readByte() != 0;
                this.f12597e = parcel.readInt();
                this.f12598f = parcel.readFloat();
                this.f12599g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f12595c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f12596d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f12597e);
                parcel.writeFloat(this.f12598f);
                parcel.writeByte(this.f12599g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f50037f = -1;
            this.f50039h = -1;
        }

        /* JADX INFO: renamed from: B */
        public static View m5987B(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((lm1) childAt.getLayoutParams()).f49814a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: D */
        public static View m5988D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof rj6) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005a  */
        /* JADX INFO: renamed from: H */
        public static void m5989H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zM5985g;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((C3729wo) childAt.getLayoutParams()).f67108a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = childAt.getMinimumHeight();
                    zM5985g = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zM5985g = false;
                    }
                } else {
                    zM5985g = false;
                }
            } else {
                zM5985g = false;
            }
            if (appBarLayout.f12589l) {
                zM5985g = appBarLayout.m5985g(m5988D(coordinatorLayout));
            }
            boolean zM5984f = appBarLayout.m5984f(zM5985g);
            if (!z) {
                if (zM5984f) {
                    List list = (List) ((l79) coordinatorLayout.f5477b.f50861c).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f5479d;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        im1 im1Var = ((lm1) ((View) arrayList.get(i5)).getLayoutParams()).f49814a;
                        if (im1Var instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) im1Var).f53167f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        /* JADX INFO: renamed from: C */
        public final void m5990C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(mo6002y() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iMo6002y = mo6002y();
            ValueAnimator valueAnimator = this.f12592l;
            if (iMo6002y == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f12592l.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f12592l = valueAnimator2;
                valueAnimator2.setInterpolator(AbstractC0853cn.f10300e);
                this.f12592l.addUpdateListener(new C1046a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.f12592l.setDuration(Math.min(iRound, 600));
            this.f12592l.setIntValues(iMo6002y, i);
            this.f12592l.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        /* JADX INFO: renamed from: E */
        public final void m5991E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = mo6003z(coordinatorLayout, appBarLayout2, mo6002y() - i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.f12589l) {
                appBarLayout2.m5984f(appBarLayout2.m5985g(view));
            }
        }

        /* JADX INFO: renamed from: F */
        public final SavedState m5992F(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iM12201w = m12201w();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iM12201w;
                if (childAt.getTop() + iM12201w <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f5562b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = iM12201w == 0;
                    savedState.f12596d = z;
                    savedState.f12595c = !z && (-iM12201w) >= appBarLayout.getTotalScrollRange();
                    savedState.f12597e = i;
                    savedState.f12599g = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.f12598f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: G */
        public final void m5993G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iMo6002y = mo6002y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C3729wo c3729wo = (C3729wo) childAt.getLayoutParams();
                if ((c3729wo.f67108a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) c3729wo).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c3729wo).bottomMargin;
                }
                int i2 = -iMo6002y;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                C3729wo c3729wo2 = (C3729wo) childAt2.getLayoutParams();
                int i3 = c3729wo2.f67108a;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iMo6002y < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) c3729wo2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) c3729wo2).bottomMargin;
                    }
                    if (iMo6002y < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    m5990C(coordinatorLayout, appBarLayout, AbstractC3584sr.m21645x(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // p000.fua, p000.im1
        /* JADX INFO: renamed from: l */
        public final boolean mo5994l(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo5994l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f12593m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            m5990C(coordinatorLayout, appBarLayout, i2);
                        } else {
                            m16469A(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            m5990C(coordinatorLayout, appBarLayout, 0);
                        } else {
                            m16469A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f12595c) {
                m16469A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f12596d) {
                m16469A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f12597e);
                int i3 = -childAt.getBottom();
                if (this.f12593m.f12599g) {
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f12593m.f12598f) + i3;
                }
                m16469A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f12583f = 0;
            this.f12593m = null;
            int iM21645x = AbstractC3584sr.m21645x(m12201w(), -appBarLayout.getTotalScrollRange(), 0);
            k80 k80Var = this.f39720a;
            if (k80Var == null) {
                this.f39721b = iM21645x;
            } else if (k80Var.f46845c != iM21645x) {
                k80Var.f46845c = iM21645x;
                k80Var.m14979b();
            }
            m5989H(coordinatorLayout, appBarLayout, m12201w(), 0, true);
            appBarLayout.m5982d(m12201w());
            WeakHashMap weakHashMap = dta.f36217a;
            if (ata.m3034a(coordinatorLayout) != null) {
                return true;
            }
            dta.m10640k(coordinatorLayout, new C1047b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: m */
        public final boolean mo5995m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((lm1) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m1985r(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: o */
        public final /* bridge */ /* synthetic */ void mo5996o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            m5991E(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: p */
        public final void mo5997p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.mo6003z(coordinatorLayout2, appBarLayout, mo6002y() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0) {
                WeakHashMap weakHashMap = dta.f36217a;
                if (ata.m3034a(coordinatorLayout2) != null) {
                    return;
                }
                dta.m10640k(coordinatorLayout2, new C1047b(coordinatorLayout2, baseBehavior, appBarLayout));
            }
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: r */
        public final void mo5998r(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.f12593m = (SavedState) parcelable;
            } else {
                this.f12593m = null;
            }
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: s */
        public final Parcelable mo5999s(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateM5992F = m5992F(absSavedState, (AppBarLayout) view);
            return savedStateM5992F == null ? absSavedState : savedStateM5992F;
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: t */
        public final boolean mo6000t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.f12589l || appBarLayout.f12588k || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.f12592l) != null) {
                valueAnimator.cancel();
            }
            this.f12594n = null;
            this.f12591k = i2;
            return z;
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: u */
        public final void mo6001u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f12591k == 0 || i == 1) {
                m5993G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f12589l) {
                    appBarLayout.m5984f(appBarLayout.m5985g(view2));
                }
            }
            this.f12594n = new WeakReference(view2);
        }

        @Override // p000.lr3
        /* JADX INFO: renamed from: y */
        public final int mo6002y() {
            return m12201w() + this.f12590j;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:66:0x0163  */
        /* JADX WARN: Code duplicated, block: B:68:0x0173  */
        /* JADX WARN: Code duplicated, block: B:72:0x0182  */
        /* JADX WARN: Code duplicated, block: B:73:0x0184  */
        /* JADX WARN: Code duplicated, block: B:92:0x0176 A[SYNTHETIC] */
        @Override // p000.lr3
        /* JADX INFO: renamed from: z */
        public final int mo6003z(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            boolean z;
            int i4;
            List list;
            int i5;
            View view2;
            im1 im1Var;
            int i6;
            C3156jq c3156jq;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iMo6002y = mo6002y();
            int i7 = 0;
            if (i2 == 0 || iMo6002y < i2 || iMo6002y > i3) {
                this.f12590j = 0;
            } else {
                int iM21645x = AbstractC3584sr.m21645x(i, i2, i3);
                if (iMo6002y != iM21645x) {
                    if (!appBarLayout.f12582e) {
                        top = iM21645x;
                        break;
                    }
                    int iAbs = Math.abs(iM21645x);
                    int childCount = appBarLayout.getChildCount();
                    int i8 = 0;
                    while (true) {
                        if (i8 < childCount) {
                            View childAt = appBarLayout.getChildAt(i8);
                            C3729wo c3729wo = (C3729wo) childAt.getLayoutParams();
                            Interpolator interpolator = c3729wo.f67110c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i8++;
                            } else if (interpolator != null) {
                                int i9 = c3729wo.f67108a;
                                if ((i9 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) c3729wo).topMargin + ((LinearLayout.LayoutParams) c3729wo).bottomMargin;
                                    if ((i9 & 2) != 0) {
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iM21645x);
                                    break;
                                }
                            }
                        }
                        top = iM21645x;
                        break;
                    }
                    k80 k80Var = this.f39720a;
                    int i10 = 1;
                    if (k80Var != null) {
                        if (k80Var.f46845c != top) {
                            k80Var.f46845c = top;
                            k80Var.m14979b();
                            z = true;
                        }
                        int i11 = iMo6002y - iM21645x;
                        this.f12590j = iM21645x - top;
                        if (z) {
                            i6 = 0;
                            while (i6 < appBarLayout.getChildCount()) {
                                C3729wo c3729wo2 = (C3729wo) appBarLayout.getChildAt(i6).getLayoutParams();
                                c3156jq = c3729wo2.f67109b;
                                if (c3156jq == null && (c3729wo2.f67108a & i10) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i6);
                                    float fM12201w = m12201w();
                                    Rect rect = (Rect) c3156jq.f45991b;
                                    Rect rect2 = (Rect) c3156jq.f45990a;
                                    childAt2.getDrawingRect(rect2);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                    rect2.offset(0, -appBarLayout.getTopInset());
                                    float fAbs = rect2.top - Math.abs(fM12201w);
                                    if (fAbs <= 0.0f) {
                                        float fM21644w = 1.0f - AbstractC3584sr.m21644w(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                        float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fM21644w * fM21644w)));
                                        childAt2.setTranslationY(fHeight);
                                        childAt2.getDrawingRect(rect);
                                        rect.offset(0, (int) (-fHeight));
                                        if (fHeight >= rect.height()) {
                                            childAt2.setAlpha(0.0f);
                                        } else {
                                            childAt2.setAlpha(1.0f);
                                        }
                                        childAt2.setClipBounds(rect);
                                    } else {
                                        childAt2.setClipBounds(null);
                                        childAt2.setTranslationY(0.0f);
                                        childAt2.setAlpha(1.0f);
                                    }
                                }
                                i6++;
                                i10 = 1;
                            }
                        }
                        if (!z && appBarLayout.f12582e && (list = (List) ((l79) coordinatorLayout.f5477b.f50861c).get(appBarLayout)) != null && !list.isEmpty()) {
                            for (i5 = 0; i5 < list.size(); i5++) {
                                view2 = (View) list.get(i5);
                                im1Var = ((lm1) view2.getLayoutParams()).f49814a;
                                if (im1Var != null) {
                                    im1Var.mo6006h(coordinatorLayout, view2, appBarLayout);
                                }
                            }
                        }
                        appBarLayout.m5982d(m12201w());
                        if (iM21645x < iMo6002y) {
                            i4 = -1;
                        } else {
                            i4 = 1;
                        }
                        m5989H(coordinatorLayout, appBarLayout, iM21645x, i4, false);
                        i7 = i11;
                    } else {
                        this.f39721b = top;
                    }
                    z = false;
                    int i12 = iMo6002y - iM21645x;
                    this.f12590j = iM21645x - top;
                    if (z) {
                        i6 = 0;
                        while (i6 < appBarLayout.getChildCount()) {
                            C3729wo c3729wo3 = (C3729wo) appBarLayout.getChildAt(i6).getLayoutParams();
                            c3156jq = c3729wo3.f67109b;
                            if (c3156jq == null) {
                            }
                            i6++;
                            i10 = 1;
                        }
                    }
                    if (!z) {
                        while (i5 < list.size()) {
                            view2 = (View) list.get(i5);
                            im1Var = ((lm1) view2.getLayoutParams()).f49814a;
                            if (im1Var != null) {
                                im1Var.mo6006h(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.m5982d(m12201w());
                    if (iM21645x < iMo6002y) {
                        i4 = -1;
                    } else {
                        i4 = 1;
                    }
                    m5989H(coordinatorLayout, appBarLayout, iM21645x, i4, false);
                    i7 = i12;
                }
            }
            WeakHashMap weakHashMap = dta.f36217a;
            if (ata.m3034a(coordinatorLayout) != null) {
                return i7;
            }
            dta.m10640k(coordinatorLayout, new C1047b(coordinatorLayout, this, appBarLayout));
            return i7;
        }

        public BaseBehavior() {
            this.f50037f = -1;
            this.f50039h = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        C3729wo c3729wo = new C3729wo(-1, -2);
        c3729wo.f67108a = 1;
        return c3729wo;
    }

    public static class ScrollingViewBehavior extends nr3 {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
            this.f53167f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: z */
        public static AppBarLayout m6004z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: f */
        public final boolean mo6005f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: h */
        public boolean mo6006h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            im1 im1Var = ((lm1) view2.getLayoutParams()).f49814a;
            if (im1Var instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) im1Var).f12590j) + this.f53166e) - m17597y(view2);
                WeakHashMap weakHashMap = dta.f36217a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f12589l) {
                return false;
            }
            appBarLayout.m5984f(appBarLayout.m5985g(view));
            return false;
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: i */
        public final void mo6007i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                dta.m10640k(coordinatorLayout, null);
            }
        }

        @Override // p000.im1
        /* JADX INFO: renamed from: q */
        public final boolean mo6008q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutM6004z = m6004z(coordinatorLayout.m1979j(view));
            if (appBarLayoutM6004z != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f53164c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutM6004z.m5983e(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
