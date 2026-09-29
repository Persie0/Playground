package com.google.android.material.sidesheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC0853cn;
import p000.AbstractC3393o1;
import p000.C3340mm;
import p000.C3386nv;
import p000.C3479q;
import p000.C3671v3;
import p000.RunnableC2971eo;
import p000.dta;
import p000.fs5;
import p000.hm2;
import p000.ho2;
import p000.ig0;
import p000.im1;
import p000.ita;
import p000.jr5;
import p000.js5;
import p000.kg0;
import p000.ks5;
import p000.lm1;
import p000.pb1;
import p000.q39;
import p000.qz2;
import p000.r39;
import p000.rw4;
import p000.u60;
import p000.uv2;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends im1 implements jr5 {

    /* JADX INFO: renamed from: x */
    public static final int f13083x = R$string.side_sheet_accessibility_pane_title;

    /* JADX INFO: renamed from: y */
    public static final int f13084y = R$style.Widget_Material3_SideSheet;

    /* JADX INFO: renamed from: a */
    public rw4 f13085a;

    /* JADX INFO: renamed from: b */
    public final fs5 f13086b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f13087c;

    /* JADX INFO: renamed from: d */
    public final r39 f13088d;

    /* JADX INFO: renamed from: e */
    public final kg0 f13089e;

    /* JADX INFO: renamed from: f */
    public final float f13090f;

    /* JADX INFO: renamed from: g */
    public final boolean f13091g;

    /* JADX INFO: renamed from: h */
    public int f13092h;

    /* JADX INFO: renamed from: i */
    public ita f13093i;

    /* JADX INFO: renamed from: j */
    public boolean f13094j;

    /* JADX INFO: renamed from: k */
    public final float f13095k;

    /* JADX INFO: renamed from: l */
    public int f13096l;

    /* JADX INFO: renamed from: m */
    public int f13097m;

    /* JADX INFO: renamed from: n */
    public int f13098n;

    /* JADX INFO: renamed from: o */
    public int f13099o;

    /* JADX INFO: renamed from: p */
    public WeakReference f13100p;

    /* JADX INFO: renamed from: q */
    public WeakReference f13101q;

    /* JADX INFO: renamed from: r */
    public final int f13102r;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f13103s;

    /* JADX INFO: renamed from: t */
    public ks5 f13104t;

    /* JADX INFO: renamed from: u */
    public int f13105u;

    /* JADX INFO: renamed from: v */
    public final LinkedHashSet f13106v;

    /* JADX INFO: renamed from: w */
    public final ig0 f13107w;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f13089e = new kg0(this);
        this.f13091g = true;
        this.f13092h = 5;
        this.f13095k = 0.1f;
        this.f13102r = -1;
        this.f13106v = new LinkedHashSet();
        this.f13107w = new ig0(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.f13087c = pb1.m19054x(context, typedArrayObtainStyledAttributes, R$styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f13088d = r39.m20281h(context, attributeSet, 0, f13084y).m19627a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.f13102r = resourceId;
            WeakReference weakReference = this.f13101q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f13101q = null;
            WeakReference weakReference2 = this.f13100p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        r39 r39Var = this.f13088d;
        if (r39Var != null) {
            fs5 fs5Var = new fs5(r39Var);
            this.f13086b = fs5Var;
            fs5Var.m12072p(context);
            ColorStateList colorStateList = this.f13087c;
            if (colorStateList != null) {
                this.f13086b.m12076t(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f13086b.setTint(typedValue.data);
            }
        }
        this.f13090f = typedArrayObtainStyledAttributes.getDimension(R$styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.f13091g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SideSheetBehavior_Layout_behavior_draggable, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: A */
    public final void m6165A() {
        View view;
        WeakReference weakReference = this.f13100p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        dta.m10638i(view, 262144);
        dta.m10636g(view, 0);
        dta.m10638i(view, 1048576);
        dta.m10636g(view, 0);
        int i = 2;
        int i2 = 5;
        if (this.f13092h != 5) {
            dta.m10639j(view, C3671v3.f64761k, new uv2(this, i2, i));
        }
        int i3 = 3;
        if (this.f13092h != 3) {
            dta.m10639j(view, C3671v3.f64760j, new uv2(this, i3, i));
        }
    }

    @Override // p000.jr5
    /* JADX INFO: renamed from: a */
    public final void mo6040a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i2;
        ks5 ks5Var = this.f13104t;
        if (ks5Var == null) {
            return;
        }
        u60 u60Var = ks5Var.f44459f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        ks5Var.f44459f = null;
        int i3 = 5;
        if (u60Var == null || Build.VERSION.SDK_INT < 34) {
            m6166w(5);
            return;
        }
        rw4 rw4Var = this.f13085a;
        if (rw4Var != null && rw4Var.m20952d() != 0) {
            i3 = 3;
        }
        C3340mm c3340mm = new C3340mm(this, 8);
        WeakReference weakReference = this.f13101q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            switch (this.f13085a.f59961a) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o69
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f53903a.f13085a.m20953g(marginLayoutParams, AbstractC0853cn.m4880c(i2, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        View view2 = ks5Var.f44455b;
        boolean z = u60Var.f63473d == 0;
        boolean z2 = (Gravity.getAbsoluteGravity(i3, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new qz2(1));
        objectAnimatorOfFloat.setDuration(AbstractC0853cn.m4880c(ks5Var.f44456c, u60Var.f63472c, ks5Var.f44457d));
        objectAnimatorOfFloat.addListener(new js5(ks5Var, z, i3));
        objectAnimatorOfFloat.addListener(c3340mm);
        objectAnimatorOfFloat.start();
    }

    @Override // p000.jr5
    /* JADX INFO: renamed from: b */
    public final void mo6041b(u60 u60Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ks5 ks5Var = this.f13104t;
        if (ks5Var == null) {
            return;
        }
        rw4 rw4Var = this.f13085a;
        int i = (rw4Var == null || rw4Var.m20952d() == 0) ? 5 : 3;
        if (ks5Var.f44459f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        u60 u60Var2 = ks5Var.f44459f;
        ks5Var.f44459f = u60Var;
        if (u60Var2 != null) {
            ks5Var.m15661a(u60Var.f63472c, i, u60Var.f63473d == 0);
        }
        WeakReference weakReference = this.f13100p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f13100p.get();
        WeakReference weakReference2 = this.f13101q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f13085a.m20953g(marginLayoutParams, (int) ((view.getScaleX() * this.f13096l) + this.f13099o));
        view2.requestLayout();
    }

    @Override // p000.jr5
    /* JADX INFO: renamed from: c */
    public final void mo6042c(u60 u60Var) {
        ks5 ks5Var = this.f13104t;
        if (ks5Var == null) {
            return;
        }
        ks5Var.f44459f = u60Var;
    }

    @Override // p000.jr5
    /* JADX INFO: renamed from: d */
    public final void mo6043d() {
        ks5 ks5Var = this.f13104t;
        if (ks5Var == null) {
            return;
        }
        View view = ks5Var.f44455b;
        if (ks5Var.f44459f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        u60 u60Var = ks5Var.f44459f;
        ks5Var.f44459f = null;
        if (u60Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(ks5Var.f44458e);
        animatorSet.start();
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: g */
    public final void mo6044g(lm1 lm1Var) {
        this.f13100p = null;
        this.f13093i = null;
        this.f13104t = null;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: j */
    public final void mo6045j() {
        this.f13100p = null;
        this.f13093i = null;
        this.f13104t = null;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: k */
    public final boolean mo6017k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ita itaVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && dta.m10632c(view) == null) || !this.f13091g) {
            this.f13094j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f13103s) != null) {
            velocityTracker.recycle();
            this.f13103s = null;
        }
        if (this.f13103s == null) {
            this.f13103s = VelocityTracker.obtain();
        }
        this.f13103s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f13105u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f13094j) {
            this.f13094j = false;
            return false;
        }
        return (this.f13094j || (itaVar = this.f13093i) == null || !itaVar.m14142o(motionEvent)) ? false : true;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: l */
    public final boolean mo5994l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int left;
        int i2;
        int iM20951c;
        int i3;
        View viewFindViewById;
        int i4 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f13100p;
        fs5 fs5Var = this.f13086b;
        int i5 = 0;
        if (weakReference == null) {
            this.f13100p = new WeakReference(view);
            this.f13104t = new ks5(view);
            if (fs5Var != null) {
                view.setBackground(fs5Var);
                float elevation = this.f13090f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                fs5Var.m12075s(elevation);
            } else {
                ColorStateList colorStateList = this.f13087c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = dta.f36217a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i6 = this.f13092h == 5 ? 4 : 0;
            if (view.getVisibility() != i6) {
                view.setVisibility(i6);
            }
            m6165A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (dta.m10632c(view) == null) {
                dta.m10641l(view, view.getResources().getString(f13083x));
            }
        }
        int i7 = Gravity.getAbsoluteGravity(((lm1) view.getLayoutParams()).f49816c, i) == 3 ? 1 : 0;
        rw4 rw4Var = this.f13085a;
        if (rw4Var == null || rw4Var.m20952d() != i7) {
            lm1 lm1Var = null;
            r39 r39Var = this.f13088d;
            if (i7 == 0) {
                this.f13085a = new rw4(this, i4);
                if (r39Var != null) {
                    WeakReference weakReference2 = this.f13100p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof lm1)) {
                        lm1Var = (lm1) view3.getLayoutParams();
                    }
                    if (lm1Var == null || ((ViewGroup.MarginLayoutParams) lm1Var).rightMargin <= 0) {
                        q39 q39VarM20285l = r39Var.m20285l();
                        q39VarM20285l.f57201f = new C3479q(0.0f);
                        q39VarM20285l.f57202g = new C3479q(0.0f);
                        r39 r39VarM19627a = q39VarM20285l.m19627a();
                        if (fs5Var != null) {
                            fs5Var.setShapeAppearanceModel(r39VarM19627a);
                        }
                    }
                }
            } else {
                if (i7 != 1) {
                    C3386nv.m17626m(ux5.m22989l("Invalid sheet edge position value: ", i7, ". Must be 0 or 1."));
                    return false;
                }
                this.f13085a = new rw4(this, i5);
                if (r39Var != null) {
                    WeakReference weakReference3 = this.f13100p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof lm1)) {
                        lm1Var = (lm1) view2.getLayoutParams();
                    }
                    if (lm1Var == null || ((ViewGroup.MarginLayoutParams) lm1Var).leftMargin <= 0) {
                        q39 q39VarM20285l2 = r39Var.m20285l();
                        q39VarM20285l2.f57200e = new C3479q(0.0f);
                        q39VarM20285l2.f57203h = new C3479q(0.0f);
                        r39 r39VarM19627a2 = q39VarM20285l2.m19627a();
                        if (fs5Var != null) {
                            fs5Var.setShapeAppearanceModel(r39VarM19627a2);
                        }
                    }
                }
            }
        }
        if (this.f13093i == null) {
            this.f13093i = new ita(coordinatorLayout.getContext(), coordinatorLayout, this.f13107w);
        }
        int iM20951c2 = this.f13085a.m20951c(view);
        coordinatorLayout.m1984q(view, i);
        this.f13097m = coordinatorLayout.getWidth();
        switch (this.f13085a.f59961a) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.f13098n = left;
        this.f13096l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.f13085a.f59961a) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i2 = 0;
        }
        this.f13099o = i2;
        int i8 = this.f13092h;
        if (i8 == 1 || i8 == 2) {
            iM20951c = iM20951c2 - this.f13085a.m20951c(view);
        } else if (i8 == 3) {
            iM20951c = 0;
        } else {
            if (i8 != 5) {
                hm2.m13331a(this.f13092h, "Unexpected value: ");
                return false;
            }
            iM20951c = this.f13085a.m20950b();
        }
        WeakHashMap weakHashMap2 = dta.f36217a;
        view.offsetLeftAndRight(iM20951c);
        if (this.f13101q == null && (i3 = this.f13102r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.f13101q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f13106v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                ho2.m13383c();
                return false;
            }
        }
        return true;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: m */
    public final boolean mo5995m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: r */
    public final void mo5998r(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).f13108c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f13092h = i;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: s */
    public final Parcelable mo5999s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: v */
    public final boolean mo6018v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f13092h == 1 && actionMasked == 0) {
            return true;
        }
        if (m6168y()) {
            this.f13093i.m14136i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f13103s) != null) {
            velocityTracker.recycle();
            this.f13103s = null;
        }
        if (this.f13103s == null) {
            this.f13103s = VelocityTracker.obtain();
        }
        this.f13103s.addMovement(motionEvent);
        if (m6168y() && actionMasked == 2 && !this.f13094j && m6168y()) {
            float fAbs = Math.abs(this.f13105u - motionEvent.getX());
            ita itaVar = this.f13093i;
            if (fAbs > itaVar.f44541b) {
                itaVar.m14129b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f13094j;
    }

    /* JADX INFO: renamed from: w */
    public final void m6166w(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC3393o1.m17738m(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f13100p;
        if (weakReference == null || weakReference.get() == null) {
            m6167x(i);
            return;
        }
        View view = (View) this.f13100p.get();
        RunnableC2971eo runnableC2971eo = new RunnableC2971eo(this, i, 6);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(runnableC2971eo);
        } else {
            runnableC2971eo.run();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m6167x(int i) {
        View view;
        if (this.f13092h == i) {
            return;
        }
        this.f13092h = i;
        WeakReference weakReference = this.f13100p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f13092h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f13106v.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        m6165A();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m6168y() {
        if (this.f13093i != null) {
            return this.f13091g || this.f13092h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.m14141n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        m6167x(2);
        r2.f13089e.m15171a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6169z(View view, int i, boolean z) {
        int iM20949a;
        if (i == 3) {
            iM20949a = this.f13085a.m20949a();
        } else {
            if (i != 5) {
                C3386nv.m17626m(ux5.m22988k(i, "Invalid state to get outer edge offset: "));
                return;
            }
            iM20949a = this.f13085a.m20950b();
        }
        ita itaVar = this.f13093i;
        if (itaVar != null) {
            if (!z) {
                int top = view.getTop();
                itaVar.f44557r = view;
                itaVar.f44542c = -1;
                boolean zM14135h = itaVar.m14135h(iM20949a, top, 0, 0);
                if (!zM14135h && itaVar.f44540a == 0 && itaVar.f44557r != null) {
                    itaVar.f44557r = null;
                }
            }
        }
        m6167x(i);
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1069a();

        /* JADX INFO: renamed from: c */
        public final int f13108c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13108c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13108c);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f13108c = sideSheetBehavior.f13092h;
        }
    }

    public SideSheetBehavior() {
        this.f13089e = new kg0(this);
        this.f13091g = true;
        this.f13092h = 5;
        this.f13095k = 0.1f;
        this.f13102r = -1;
        this.f13106v = new LinkedHashSet();
        this.f13107w = new ig0(this, 1);
    }
}
