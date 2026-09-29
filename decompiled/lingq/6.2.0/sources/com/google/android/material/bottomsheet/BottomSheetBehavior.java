package com.google.android.material.bottomsheet;

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
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000.AbstractC0853cn;
import p000.AbstractC3393o1;
import p000.C3098i3;
import p000.C3133j3;
import p000.C3340mm;
import p000.C3386nv;
import p000.C3671v3;
import p000.RunnableC3842zq;
import p000.ata;
import p000.dta;
import p000.fs5;
import p000.gg0;
import p000.gka;
import p000.hg0;
import p000.ig0;
import p000.im1;
import p000.ita;
import p000.jg0;
import p000.jr5;
import p000.kg0;
import p000.lm1;
import p000.m64;
import p000.nr5;
import p000.pb1;
import p000.qz2;
import p000.r39;
import p000.u60;
import p000.ux5;
import p000.ztb;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends im1 implements jr5 {

    /* JADX INFO: renamed from: l0 */
    public static final int f12683l0 = R$style.Widget_Design_BottomSheet_Modal;

    /* JADX INFO: renamed from: A */
    public boolean f12684A;

    /* JADX INFO: renamed from: B */
    public final kg0 f12685B;

    /* JADX INFO: renamed from: C */
    public final ValueAnimator f12686C;

    /* JADX INFO: renamed from: D */
    public final int f12687D;

    /* JADX INFO: renamed from: E */
    public int f12688E;

    /* JADX INFO: renamed from: F */
    public int f12689F;

    /* JADX INFO: renamed from: G */
    public final float f12690G;

    /* JADX INFO: renamed from: H */
    public int f12691H;

    /* JADX INFO: renamed from: I */
    public final float f12692I;

    /* JADX INFO: renamed from: J */
    public boolean f12693J;

    /* JADX INFO: renamed from: K */
    public boolean f12694K;

    /* JADX INFO: renamed from: L */
    public boolean f12695L;

    /* JADX INFO: renamed from: M */
    public final boolean f12696M;

    /* JADX INFO: renamed from: N */
    public boolean f12697N;

    /* JADX INFO: renamed from: O */
    public int f12698O;

    /* JADX INFO: renamed from: P */
    public ita f12699P;

    /* JADX INFO: renamed from: Q */
    public boolean f12700Q;

    /* JADX INFO: renamed from: R */
    public int f12701R;

    /* JADX INFO: renamed from: S */
    public boolean f12702S;

    /* JADX INFO: renamed from: T */
    public final float f12703T;

    /* JADX INFO: renamed from: U */
    public int f12704U;

    /* JADX INFO: renamed from: V */
    public int f12705V;

    /* JADX INFO: renamed from: W */
    public int f12706W;

    /* JADX INFO: renamed from: X */
    public WeakReference f12707X;

    /* JADX INFO: renamed from: Y */
    public final ArrayList f12708Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f12709Z;

    /* JADX INFO: renamed from: a */
    public final int f12710a;

    /* JADX INFO: renamed from: a0 */
    public VelocityTracker f12711a0;

    /* JADX INFO: renamed from: b */
    public boolean f12712b;

    /* JADX INFO: renamed from: b0 */
    public nr5 f12713b0;

    /* JADX INFO: renamed from: c */
    public final float f12714c;

    /* JADX INFO: renamed from: c0 */
    public int f12715c0;

    /* JADX INFO: renamed from: d */
    public final int f12716d;

    /* JADX INFO: renamed from: d0 */
    public int f12717d0;

    /* JADX INFO: renamed from: e */
    public final boolean f12718e;

    /* JADX INFO: renamed from: e0 */
    public WeakReference f12719e0;

    /* JADX INFO: renamed from: f */
    public int f12720f;

    /* JADX INFO: renamed from: f0 */
    public boolean f12721f0;

    /* JADX INFO: renamed from: g */
    public boolean f12722g;

    /* JADX INFO: renamed from: g0 */
    public HashMap f12723g0;

    /* JADX INFO: renamed from: h */
    public int f12724h;

    /* JADX INFO: renamed from: h0 */
    public final SparseIntArray f12725h0;

    /* JADX INFO: renamed from: i */
    public final int f12726i;

    /* JADX INFO: renamed from: i0 */
    public final SparseIntArray f12727i0;

    /* JADX INFO: renamed from: j */
    public final fs5 f12728j;

    /* JADX INFO: renamed from: j0 */
    public final SparseIntArray f12729j0;

    /* JADX INFO: renamed from: k */
    public final ColorStateList f12730k;

    /* JADX INFO: renamed from: k0 */
    public final ig0 f12731k0;

    /* JADX INFO: renamed from: l */
    public final int f12732l;

    /* JADX INFO: renamed from: m */
    public final int f12733m;

    /* JADX INFO: renamed from: n */
    public int f12734n;

    /* JADX INFO: renamed from: o */
    public final boolean f12735o;

    /* JADX INFO: renamed from: p */
    public final boolean f12736p;

    /* JADX INFO: renamed from: q */
    public final boolean f12737q;

    /* JADX INFO: renamed from: r */
    public final boolean f12738r;

    /* JADX INFO: renamed from: s */
    public final boolean f12739s;

    /* JADX INFO: renamed from: t */
    public final boolean f12740t;

    /* JADX INFO: renamed from: u */
    public final boolean f12741u;

    /* JADX INFO: renamed from: v */
    public final boolean f12742v;

    /* JADX INFO: renamed from: w */
    public int f12743w;

    /* JADX INFO: renamed from: x */
    public int f12744x;

    /* JADX INFO: renamed from: y */
    public final boolean f12745y;

    /* JADX INFO: renamed from: z */
    public final r39 f12746z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.f12710a = 0;
        this.f12712b = true;
        this.f12732l = -1;
        this.f12733m = -1;
        this.f12685B = new kg0(this);
        this.f12690G = 0.5f;
        this.f12692I = -1.0f;
        this.f12695L = true;
        this.f12696M = true;
        this.f12698O = 4;
        this.f12703T = 0.1f;
        this.f12708Y = new ArrayList();
        this.f12709Z = new ArrayList();
        this.f12717d0 = -1;
        this.f12725h0 = new SparseIntArray();
        this.f12727i0 = new SparseIntArray();
        this.f12729j0 = new SparseIntArray();
        this.f12731k0 = new ig0(this, i2);
        this.f12726i = context.getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.f12730k = pb1.m19054x(context, typedArrayObtainStyledAttributes, R$styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f12746z = r39.m20281h(context, attributeSet, R$attr.bottomSheetStyle, f12683l0).m19627a();
        }
        r39 r39Var = this.f12746z;
        if (r39Var != null) {
            fs5 fs5Var = new fs5(r39Var);
            this.f12728j = fs5Var;
            fs5Var.m12072p(context);
            ColorStateList colorStateList = this.f12730k;
            if (colorStateList != null) {
                this.f12728j.m12076t(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f12728j.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m6049y(), 1.0f);
        this.f12686C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f12686C.addUpdateListener(new gg0(this, i2));
        this.f12692I = typedArrayObtainStyledAttributes.getDimension(R$styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.f12732l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.f12733m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            m6031L(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            m6031L(i);
        }
        m6030K(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.f12735o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        m6029J(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.f12694K = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.f12695L = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f12696M = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_draggableOnNestedScroll, true);
        this.f12710a = typedArrayObtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            C3386nv.m17626m("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.f12690G = f;
        if (this.f12707X != null) {
            this.f12689F = (int) ((1.0f - f) * this.f12706W);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
            if (dimensionPixelOffset < 0) {
                C3386nv.m17626m("offset must be greater than or equal to 0");
                throw null;
            }
            this.f12687D = dimensionPixelOffset;
            m6037R(this.f12698O, true);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                C3386nv.m17626m("offset must be greater than or equal to 0");
                throw null;
            }
            this.f12687D = i3;
            m6037R(this.f12698O, true);
        }
        this.f12716d = typedArrayObtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.f12718e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f12559xdccd7a5b, false);
        this.f12736p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f12737q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f12738r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f12739s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f12740t = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f12741u = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f12742v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f12745y = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f12714c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: B */
    public static View m6020B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM6020B = m6020B(viewGroup.getChildAt(i));
            if (viewM6020B != null) {
                return viewM6020B;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static BottomSheetBehavior m6021C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof lm1)) {
            C3386nv.m17626m("The view is not a child of CoordinatorLayout");
            return null;
        }
        im1 im1Var = ((lm1) layoutParams).f49814a;
        if (im1Var instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) im1Var;
        }
        C3386nv.m17626m("The view is not associated with BottomSheetBehavior");
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static int m6022D(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: A */
    public final void m6023A(int i) {
        View view = (View) this.f12707X.get();
        if (view != null) {
            ArrayList arrayList = this.f12709Z;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f12691H;
            if (i <= i2 && i2 != m6024E()) {
                m6024E();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((jg0) arrayList.get(i3)).mo14439b(view);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final int m6024E() {
        if (this.f12712b) {
            return this.f12688E;
        }
        return Math.max(this.f12687D, this.f12739s ? 0 : this.f12744x);
    }

    /* JADX INFO: renamed from: F */
    public final int m6025F(int i) {
        if (i == 3) {
            return m6024E();
        }
        if (i == 4) {
            return this.f12691H;
        }
        if (i == 5) {
            return this.f12706W;
        }
        if (i == 6) {
            return this.f12689F;
        }
        C3386nv.m17626m(ux5.m22988k(i, "Invalid state to get top offset: "));
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m6026G() {
        WeakReference weakReference = this.f12707X;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f12707X.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m6027H(View view) {
        Iterator it = this.f12708Y.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public final void m6028I(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.f12708Y.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m6028I(viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m6029J(boolean z) {
        if (this.f12712b == z) {
            return;
        }
        this.f12712b = z;
        if (this.f12707X != null) {
            m6048x();
        }
        m6033N((this.f12712b && this.f12698O == 6) ? 3 : this.f12698O);
        m6037R(this.f12698O, true);
        m6036Q();
    }

    /* JADX INFO: renamed from: K */
    public final void m6030K(boolean z) {
        if (this.f12693J != z) {
            this.f12693J = z;
            if (!z && this.f12698O == 5) {
                m6032M(4);
            }
            m6036Q();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m6031L(int i) {
        boolean z = this.f12722g;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.f12722g = true;
            }
        } else {
            if (!z && this.f12720f == i) {
                return;
            }
            this.f12722g = false;
            this.f12720f = Math.max(0, i);
        }
        m6039T();
    }

    /* JADX INFO: renamed from: M */
    public final void m6032M(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC3393o1.m17738m(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f12693J && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f12712b && m6025F(i) <= this.f12688E) ? 3 : i;
        WeakReference weakReference = this.f12707X;
        if (weakReference == null || weakReference.get() == null) {
            m6033N(i);
            return;
        }
        View view = (View) this.f12707X.get();
        RunnableC3842zq runnableC3842zq = new RunnableC3842zq(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(runnableC3842zq);
        } else {
            runnableC3842zq.run();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m6033N(int i) {
        View view;
        if (this.f12698O == i) {
            return;
        }
        this.f12698O = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f12693J;
        }
        WeakReference weakReference = this.f12707X;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            m6038S(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m6038S(false);
        }
        m6037R(i, true);
        while (true) {
            ArrayList arrayList = this.f12709Z;
            if (i2 >= arrayList.size()) {
                m6036Q();
                return;
            } else {
                ((jg0) arrayList.get(i2)).mo14440c(view, i);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m6034O(View view, float f) {
        if (this.f12694K) {
            return true;
        }
        if (view.getTop() < this.f12691H) {
            return false;
        }
        return Math.abs(((f * this.f12703T) + ((float) view.getTop())) - ((float) this.f12691H)) / ((float) m6050z()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m6033N(2);
        m6037R(r4, true);
        r2.f12685B.m15171a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m14141n(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6035P(View view, int i, boolean z) {
        int iM6025F = m6025F(i);
        ita itaVar = this.f12699P;
        if (itaVar != null) {
            if (!z) {
                int left = view.getLeft();
                itaVar.f44557r = view;
                itaVar.f44542c = -1;
                boolean zM14135h = itaVar.m14135h(left, iM6025F, 0, 0);
                if (!zM14135h && itaVar.f44540a == 0 && itaVar.f44557r != null) {
                    itaVar.f44557r = null;
                }
            }
        }
        m6033N(i);
    }

    /* JADX INFO: renamed from: Q */
    public final void m6036Q() {
        View view;
        WeakReference weakReference = this.f12707X;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        dta.m10638i(view, 1048576);
        dta.m10636g(view, 0);
        dta.m10638i(view, 524288);
        dta.m10636g(view, 0);
        dta.m10638i(view, 262144);
        dta.m10636g(view, 0);
        SparseIntArray sparseIntArray = this.f12727i0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            dta.m10638i(view, i);
            dta.m10636g(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.f12725h0;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            dta.m10638i(view, i2);
            dta.m10636g(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.f12729j0;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            dta.m10638i(view, i3);
            dta.m10636g(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f12712b && this.f12698O != 6) {
            sparseIntArray2.put(0, m6047w(view, R$string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.f12693J) {
            int i4 = 5;
            if (this.f12698O != 5) {
                dta.m10639j(view, C3671v3.f64761k, new ztb(this, i4, 2));
            }
        }
        int i5 = this.f12698O;
        if (i5 == 3) {
            if (this.f12694K && this.f12693J) {
                return;
            }
            sparseIntArray3.put(0, m6047w(view, R$string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i5 == 4) {
            sparseIntArray.put(0, m6047w(view, R$string.bottomsheet_action_expand, 3));
        } else {
            if (i5 != 6) {
                return;
            }
            if (!this.f12694K || !this.f12693J) {
                sparseIntArray3.put(0, m6047w(view, R$string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, m6047w(view, R$string.bottomsheet_action_expand, 3));
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m6037R(int i, boolean z) {
        fs5 fs5Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f12698O == 3 && (this.f12745y || m6026G());
        if (this.f12684A == z2 || (fs5Var = this.f12728j) == null) {
            return;
        }
        this.f12684A = z2;
        ValueAnimator valueAnimator = this.f12686C;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            fs5Var.m12077u(this.f12684A ? m6049y() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(fs5Var.f39578b.f36169j, z2 ? m6049y() : 1.0f);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m6038S(boolean z) {
        WeakReference weakReference = this.f12707X;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f12723g0 != null) {
                    return;
                } else {
                    this.f12723g0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f12707X.get() && z) {
                    this.f12723g0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f12723g0 = null;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m6039T() {
        View view;
        if (this.f12707X != null) {
            m6048x();
            if (this.f12698O != 4 || (view = (View) this.f12707X.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p000.jr5
    /* JADX INFO: renamed from: a */
    public final void mo6040a() {
        nr5 nr5Var = this.f12713b0;
        if (nr5Var == null) {
            return;
        }
        int i = nr5Var.f44457d;
        int i2 = nr5Var.f44456c;
        u60 u60Var = nr5Var.f44459f;
        nr5Var.f44459f = null;
        if (u60Var != null) {
            float f = u60Var.f63472c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.f12693J) {
                    AnimatorSet animatorSetM17604a = nr5Var.m17604a();
                    animatorSetM17604a.setDuration(AbstractC0853cn.m4880c(i2, f, i));
                    animatorSetM17604a.start();
                    m6032M(4);
                    return;
                }
                C3340mm c3340mm = new C3340mm(this, 2);
                View view = nr5Var.f44455b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new qz2(1));
                objectAnimatorOfFloat.setDuration(AbstractC0853cn.m4880c(i2, f, i));
                objectAnimatorOfFloat.addListener(new C3340mm(nr5Var, 7));
                objectAnimatorOfFloat.addListener(c3340mm);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        m6032M(this.f12693J ? 5 : 4);
    }

    @Override // p000.jr5
    /* JADX INFO: renamed from: b */
    public final void mo6041b(u60 u60Var) {
        nr5 nr5Var = this.f12713b0;
        if (nr5Var == null) {
            return;
        }
        if (nr5Var.f44459f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        u60 u60Var2 = nr5Var.f44459f;
        nr5Var.f44459f = u60Var;
        if (u60Var2 == null) {
            return;
        }
        nr5Var.m17605b(u60Var.f63472c);
    }

    @Override // p000.jr5
    /* JADX INFO: renamed from: c */
    public final void mo6042c(u60 u60Var) {
        nr5 nr5Var = this.f12713b0;
        if (nr5Var == null) {
            return;
        }
        nr5Var.f44459f = u60Var;
    }

    @Override // p000.jr5
    /* JADX INFO: renamed from: d */
    public final void mo6043d() {
        nr5 nr5Var = this.f12713b0;
        if (nr5Var == null) {
            return;
        }
        if (nr5Var.f44459f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        u60 u60Var = nr5Var.f44459f;
        nr5Var.f44459f = null;
        if (u60Var == null) {
            return;
        }
        AnimatorSet animatorSetM17604a = nr5Var.m17604a();
        animatorSetM17604a.setDuration(nr5Var.f44458e);
        animatorSetM17604a.start();
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: g */
    public final void mo6044g(lm1 lm1Var) {
        this.f12707X = null;
        this.f12699P = null;
        this.f12713b0 = null;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: j */
    public final void mo6045j() {
        this.f12707X = null;
        this.f12699P = null;
        this.f12713b0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0124  */
    @Override // p000.im1
    /* JADX INFO: renamed from: k */
    public final boolean mo6017k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int i;
        ita itaVar;
        if (!view.isShown() || !this.f12695L) {
            this.f12700Q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f12715c0 = -1;
            this.f12717d0 = -1;
            this.f12719e0 = null;
            VelocityTracker velocityTracker = this.f12711a0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12711a0 = null;
            }
        }
        if (this.f12711a0 == null) {
            this.f12711a0 = VelocityTracker.obtain();
        }
        this.f12711a0.addMovement(motionEvent);
        ArrayList arrayList = this.f12708Y;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f12717d0 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        view2 = null;
                        break;
                    }
                    view2 = (View) ((WeakReference) it.next()).get();
                    if (view2 != null && coordinatorLayout.m1982o(view2, x2, y)) {
                        break;
                    }
                }
            } else {
                view2 = null;
                break;
            }
            WeakReference weakReference = new WeakReference(view2);
            this.f12719e0 = weakReference;
            if (this.f12698O != 2 && weakReference.get() != null) {
                this.f12715c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f12721f0 = true;
            }
            this.f12700Q = this.f12715c0 == -1 && !coordinatorLayout.m1982o(view, x, this.f12717d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12721f0 = false;
            this.f12719e0 = null;
            this.f12715c0 = -1;
            if (this.f12700Q) {
                this.f12700Q = false;
                return false;
            }
        }
        if (this.f12700Q || (itaVar = this.f12699P) == null || !itaVar.m14142o(motionEvent)) {
            if (actionMasked == 2) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((WeakReference) it2.next()).get() != null) {
                        if (!this.f12700Q && this.f12698O != 1) {
                            if (!this.f12718e) {
                                View view3 = arrayList.isEmpty() ? null : (View) ((WeakReference) arrayList.get(0)).get();
                                if (view3 != null && coordinatorLayout.m1982o(view3, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    break;
                                }
                                if (this.f12699P == null) {
                                    break;
                                }
                            } else {
                                WeakReference weakReference2 = this.f12719e0;
                                if (weakReference2 != null && weakReference2.get() != null) {
                                    break;
                                }
                                if (this.f12699P == null || (i = this.f12717d0) == -1 || Math.abs(i - motionEvent.getY()) <= this.f12699P.f44541b) {
                                    break;
                                }
                            }
                        } else {
                            break;
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: l */
    public final boolean mo5994l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.f12707X == null) {
            this.f12724h = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
            boolean z = (this.f12735o || this.f12722g) ? false : true;
            if (this.f12736p || this.f12737q || this.f12738r || this.f12740t || this.f12741u || this.f12742v || z) {
                gka.m12722a(view, new hg0((BottomSheetBehavior) this, z));
            }
            dta.m10642m(view, new m64(view));
            this.f12707X = new WeakReference(view);
            this.f12713b0 = new nr5(view);
            fs5 fs5Var = this.f12728j;
            if (fs5Var != null) {
                view.setBackground(fs5Var);
                float elevation = this.f12692I;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                fs5Var.m12075s(elevation);
            } else {
                ColorStateList colorStateList = this.f12730k;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            m6036Q();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f12699P == null) {
            this.f12699P = new ita(coordinatorLayout.getContext(), coordinatorLayout, this.f12731k0);
        }
        int top = view.getTop();
        coordinatorLayout.m1984q(view, i);
        this.f12705V = coordinatorLayout.getWidth();
        this.f12706W = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f12704U = height;
        int iMin = this.f12706W;
        int i3 = iMin - height;
        int i4 = this.f12744x;
        if (i3 < i4) {
            boolean z2 = this.f12739s;
            int i5 = this.f12733m;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.f12704U = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.f12704U = iMin2;
            }
        }
        this.f12688E = Math.max(0, this.f12706W - this.f12704U);
        this.f12689F = (int) ((1.0f - this.f12690G) * this.f12706W);
        m6048x();
        int i6 = this.f12698O;
        if (i6 == 3) {
            int iM6024E = m6024E();
            WeakHashMap weakHashMap = dta.f36217a;
            view.offsetTopAndBottom(iM6024E);
        } else if (i6 == 6) {
            int i7 = this.f12689F;
            WeakHashMap weakHashMap2 = dta.f36217a;
            view.offsetTopAndBottom(i7);
        } else if (this.f12693J && i6 == 5) {
            int i8 = this.f12706W;
            WeakHashMap weakHashMap3 = dta.f36217a;
            view.offsetTopAndBottom(i8);
        } else if (i6 == 4) {
            int i9 = this.f12691H;
            WeakHashMap weakHashMap4 = dta.f36217a;
            view.offsetTopAndBottom(i9);
        } else if (i6 == 1 || i6 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = dta.f36217a;
            view.offsetTopAndBottom(top2);
        }
        m6037R(this.f12698O, false);
        ArrayList arrayList = this.f12708Y;
        arrayList.clear();
        if (this.f12718e) {
            m6028I(view);
        } else {
            arrayList.add(new WeakReference(m6020B(view)));
        }
        while (true) {
            ArrayList arrayList2 = this.f12709Z;
            if (i2 >= arrayList2.size()) {
                return true;
            }
            ((jg0) arrayList2.get(i2)).mo14438a(view);
            i2++;
        }
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: m */
    public final boolean mo5995m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m6022D(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f12732l, marginLayoutParams.width), m6022D(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f12733m, marginLayoutParams.height));
        return true;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: n */
    public final boolean mo6046n(View view) {
        Iterator it = this.f12708Y.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null) {
                if (!m6027H(view) || this.f12698O == 3 || this.f12697N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: o */
    public final void mo5996o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean zM6027H;
        if (i3 != 1 && (zM6027H = m6027H(view2))) {
            int top = view.getTop();
            int i4 = top - i2;
            boolean z = this.f12696M;
            if (i2 > 0) {
                if (!this.f12702S && !z && zM6027H && view2.canScrollVertically(1)) {
                    this.f12697N = true;
                    return;
                }
                if (i4 < m6024E()) {
                    int iM6024E = top - m6024E();
                    iArr[1] = iM6024E;
                    WeakHashMap weakHashMap = dta.f36217a;
                    view.offsetTopAndBottom(-iM6024E);
                    m6033N(3);
                } else {
                    if (!this.f12695L) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = dta.f36217a;
                    view.offsetTopAndBottom(-i2);
                    m6033N(1);
                }
            } else if (i2 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.f12702S && !z && zM6027H && zCanScrollVertically) {
                    this.f12697N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i5 = this.f12691H;
                    if (i4 > i5 && !this.f12693J) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = dta.f36217a;
                        view.offsetTopAndBottom(-i6);
                        m6033N(4);
                    } else {
                        if (!this.f12695L) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = dta.f36217a;
                        view.offsetTopAndBottom(-i2);
                        m6033N(1);
                    }
                }
            }
            m6023A(view.getTop());
            this.f12701R = i2;
            this.f12702S = true;
            this.f12697N = false;
        }
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: p */
    public final void mo5997p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: r */
    public final void mo5998r(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f12710a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f12720f = savedState.f12748d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f12712b = savedState.f12749e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f12693J = savedState.f12750f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f12694K = savedState.f12751g;
            }
        }
        int i2 = savedState.f12747c;
        if (i2 == 1 || i2 == 2) {
            this.f12698O = 4;
        } else {
            this.f12698O = i2;
        }
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: s */
    public final Parcelable mo5999s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: t */
    public final boolean mo6000t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.f12701R = 0;
        this.f12702S = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    @Override // p000.im1
    /* JADX INFO: renamed from: u */
    public final void mo6001u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == m6024E()) {
            m6033N(3);
            return;
        }
        if (m6027H(view2) && this.f12702S) {
            if (this.f12701R > 0) {
                if (!this.f12712b && view.getTop() > this.f12689F) {
                    i3 = 6;
                }
            } else if (this.f12693J) {
                VelocityTracker velocityTracker = this.f12711a0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, this.f12714c);
                    yVelocity = this.f12711a0.getYVelocity(this.f12715c0);
                }
                if (m6034O(view, yVelocity)) {
                    i3 = 5;
                } else if (this.f12701R == 0) {
                    top2 = view.getTop();
                    if (this.f12712b) {
                        i2 = this.f12689F;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.f12691H)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f12691H)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.f12688E) >= Math.abs(top2 - this.f12691H)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.f12712b) {
                        top = view.getTop();
                        if (Math.abs(top - this.f12689F) < Math.abs(top - this.f12691H)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.f12701R == 0) {
                top2 = view.getTop();
                if (this.f12712b) {
                    i2 = this.f12689F;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.f12691H)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.f12691H)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.f12688E) >= Math.abs(top2 - this.f12691H)) {
                    i3 = 4;
                }
            } else {
                if (!this.f12712b) {
                    top = view.getTop();
                    if (Math.abs(top - this.f12689F) < Math.abs(top - this.f12691H)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            m6035P(view, i3, false);
            this.f12702S = false;
        }
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: v */
    public final boolean mo6018v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f12698O;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ita itaVar = this.f12699P;
        if (itaVar != null && (this.f12695L || i == 1)) {
            itaVar.m14136i(motionEvent);
        }
        if (actionMasked == 0) {
            this.f12715c0 = -1;
            this.f12717d0 = -1;
            this.f12719e0 = null;
            VelocityTracker velocityTracker = this.f12711a0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12711a0 = null;
            }
        }
        if (this.f12711a0 == null) {
            this.f12711a0 = VelocityTracker.obtain();
        }
        this.f12711a0.addMovement(motionEvent);
        if (this.f12699P != null && ((this.f12695L || this.f12698O == 1) && actionMasked == 2 && !this.f12700Q)) {
            float fAbs = Math.abs(this.f12717d0 - motionEvent.getY());
            ita itaVar2 = this.f12699P;
            if (fAbs > itaVar2.f44541b) {
                itaVar2.m14129b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f12700Q;
    }

    /* JADX INFO: renamed from: w */
    public final int m6047w(View view, int i, int i2) {
        int iM23075a;
        String string = view.getResources().getString(i);
        ztb ztbVar = new ztb(this, i2, 2);
        ArrayList arrayListM10633d = dta.m10633d(view);
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListM10633d.size()) {
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    int[] iArr = dta.f36218b;
                    if (i4 >= 32 || i5 != -1) {
                        break;
                    }
                    int i6 = iArr[i4];
                    boolean z = true;
                    for (int i7 = 0; i7 < arrayListM10633d.size(); i7++) {
                        z &= ((C3671v3) arrayListM10633d.get(i7)).m23075a() != i6;
                    }
                    if (z) {
                        i5 = i6;
                    }
                    i4++;
                }
                iM23075a = i5;
                break;
            }
            if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C3671v3) arrayListM10633d.get(i3)).f64769a).getLabel())) {
                iM23075a = ((C3671v3) arrayListM10633d.get(i3)).m23075a();
                break;
            }
            i3++;
        }
        if (iM23075a != -1) {
            C3671v3 c3671v3 = new C3671v3(null, iM23075a, string, ztbVar, null);
            View.AccessibilityDelegate accessibilityDelegateM3034a = ata.m3034a(view);
            C3133j3 c3133j3 = accessibilityDelegateM3034a == null ? null : accessibilityDelegateM3034a instanceof C3098i3 ? ((C3098i3) accessibilityDelegateM3034a).f43394a : new C3133j3(accessibilityDelegateM3034a);
            if (c3133j3 == null) {
                c3133j3 = new C3133j3();
            }
            dta.m10640k(view, c3133j3);
            dta.m10638i(view, c3671v3.m23075a());
            dta.m10633d(view).add(c3671v3);
            dta.m10636g(view, 0);
        }
        return iM23075a;
    }

    /* JADX INFO: renamed from: x */
    public final void m6048x() {
        int iM6050z = m6050z();
        boolean z = this.f12712b;
        int i = this.f12706W;
        if (z) {
            this.f12691H = Math.max(i - iM6050z, this.f12688E);
        } else {
            this.f12691H = i - iM6050z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX INFO: renamed from: y */
    public final float m6049y() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        fs5 fs5Var = this.f12728j;
        if (fs5Var != null && (weakReference = this.f12707X) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f12707X.get();
            if (m6026G() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fM12069m = fs5Var.m12069m();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fM12069m <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fM12069m;
                    }
                } else {
                    f = 0.0f;
                }
                float[] fArr = fs5Var.f39574X;
                float fMo11947a = fArr != null ? fArr[0] : fs5Var.f39578b.f36160a.mo13920d().f58567f.mo11947a(fs5Var.m12065i());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo11947a > 0.0f) {
                        f2 = radius2 / fMo11947a;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: z */
    public final int m6050z() {
        int iMin;
        int i;
        int i2;
        if (this.f12722g) {
            iMin = Math.min(Math.max(this.f12724h, this.f12706W - ((this.f12705V * 9) / 16)), this.f12704U);
            i = this.f12743w;
        } else {
            if (!this.f12735o && !this.f12736p && (i2 = this.f12734n) > 0) {
                return Math.max(this.f12720f, i2 + this.f12726i);
            }
            iMin = this.f12720f;
            i = this.f12743w;
        }
        return iMin + i;
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1049a();

        /* JADX INFO: renamed from: c */
        public final int f12747c;

        /* JADX INFO: renamed from: d */
        public final int f12748d;

        /* JADX INFO: renamed from: e */
        public final boolean f12749e;

        /* JADX INFO: renamed from: f */
        public final boolean f12750f;

        /* JADX INFO: renamed from: g */
        public final boolean f12751g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12747c = parcel.readInt();
            this.f12748d = parcel.readInt();
            this.f12749e = parcel.readInt() == 1;
            this.f12750f = parcel.readInt() == 1;
            this.f12751g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12747c);
            parcel.writeInt(this.f12748d);
            parcel.writeInt(this.f12749e ? 1 : 0);
            parcel.writeInt(this.f12750f ? 1 : 0);
            parcel.writeInt(this.f12751g ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f12747c = bottomSheetBehavior.f12698O;
            this.f12748d = bottomSheetBehavior.f12720f;
            this.f12749e = bottomSheetBehavior.f12712b;
            this.f12750f = bottomSheetBehavior.f12693J;
            this.f12751g = bottomSheetBehavior.f12694K;
        }
    }

    public BottomSheetBehavior() {
        this.f12710a = 0;
        this.f12712b = true;
        this.f12732l = -1;
        this.f12733m = -1;
        this.f12685B = new kg0(this);
        this.f12690G = 0.5f;
        this.f12692I = -1.0f;
        this.f12695L = true;
        this.f12696M = true;
        this.f12698O = 4;
        this.f12703T = 0.1f;
        this.f12708Y = new ArrayList();
        this.f12709Z = new ArrayList();
        this.f12717d0 = -1;
        this.f12725h0 = new SparseIntArray();
        this.f12727i0 = new SparseIntArray();
        this.f12729j0 = new SparseIntArray();
        this.f12731k0 = new ig0(this, 0);
    }
}
