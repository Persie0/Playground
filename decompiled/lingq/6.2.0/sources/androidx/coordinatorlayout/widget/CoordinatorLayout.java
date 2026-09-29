package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.R$attr;
import androidx.coordinatorlayout.R$style;
import androidx.coordinatorlayout.R$styleable;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000.C3329mb;
import p000.C3386nv;
import p000.dta;
import p000.f6b;
import p000.hi8;
import p000.hm1;
import p000.im1;
import p000.jm1;
import p000.kh7;
import p000.km1;
import p000.l79;
import p000.lm1;
import p000.lta;
import p000.ma3;
import p000.mm1;
import p000.qg3;
import p000.tj6;
import p000.uj6;
import p000.wsa;

/* JADX INFO: loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements tj6, uj6 {

    /* JADX INFO: renamed from: O */
    public static final String f5464O;

    /* JADX INFO: renamed from: P */
    public static final Class[] f5465P;

    /* JADX INFO: renamed from: Q */
    public static final ThreadLocal f5466Q;

    /* JADX INFO: renamed from: R */
    public static final ma3 f5467R;

    /* JADX INFO: renamed from: S */
    public static final kh7 f5468S;

    /* JADX INFO: renamed from: H */
    public boolean f5469H;

    /* JADX INFO: renamed from: I */
    public f6b f5470I;

    /* JADX INFO: renamed from: J */
    public boolean f5471J;

    /* JADX INFO: renamed from: K */
    public Drawable f5472K;

    /* JADX INFO: renamed from: L */
    public ViewGroup.OnHierarchyChangeListener f5473L;

    /* JADX INFO: renamed from: M */
    public hi8 f5474M;

    /* JADX INFO: renamed from: N */
    public final qg3 f5475N;

    /* JADX INFO: renamed from: a */
    public final ArrayList f5476a;

    /* JADX INFO: renamed from: b */
    public final C3329mb f5477b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f5478c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f5479d;

    /* JADX INFO: renamed from: e */
    public final int[] f5480e;

    /* JADX INFO: renamed from: f */
    public final int[] f5481f;

    /* JADX INFO: renamed from: g */
    public boolean f5482g;

    /* JADX INFO: renamed from: h */
    public boolean f5483h;

    /* JADX INFO: renamed from: i */
    public final int[] f5484i;

    /* JADX INFO: renamed from: j */
    public View f5485j;

    /* JADX INFO: renamed from: k */
    public View f5486k;

    /* JADX INFO: renamed from: l */
    public mm1 f5487l;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0477a();

        /* JADX INFO: renamed from: c */
        public SparseArray f5488c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f5488c = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f5488c.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f5488c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f5488c.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f5488c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f5464O = r0 != null ? r0.getName() : null;
        f5467R = new ma3(9);
        f5465P = new Class[]{Context.class, AttributeSet.class};
        f5466Q = new ThreadLocal();
        f5468S = new kh7(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.f5476a = new ArrayList();
        this.f5477b = new C3329mb(5);
        this.f5478c = new ArrayList();
        this.f5479d = new ArrayList();
        this.f5480e = new int[2];
        this.f5481f = new int[2];
        this.f5475N = new qg3();
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, 0, R$style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, i, 0);
        if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, R$styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, R$style.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, R$styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f5484i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = coordinatorLayout.f5484i;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        coordinatorLayout.f5472K = typedArrayObtainStyledAttributes.getDrawable(R$styleable.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.m1989x();
        super.setOnHierarchyChangeListener(new km1(coordinatorLayout));
        WeakHashMap weakHashMap = dta.f36217a;
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Rect m1972a() {
        Rect rect = (Rect) f5468S.mo14458a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: l */
    public static void m1973l(int i, Rect rect, Rect rect2, lm1 lm1Var, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = lm1Var.f49816c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = lm1Var.f49817d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static lm1 m1974n(View view) {
        lm1 lm1Var = (lm1) view.getLayoutParams();
        if (!lm1Var.f49815b) {
            if (view instanceof hm1) {
                im1 behavior = ((hm1) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                im1 im1Var = lm1Var.f49814a;
                if (im1Var != behavior) {
                    if (im1Var != null) {
                        im1Var.mo6045j();
                    }
                    lm1Var.f49814a = behavior;
                    lm1Var.f49815b = true;
                    if (behavior != null) {
                        behavior.mo6044g(lm1Var);
                    }
                }
                lm1Var.f49815b = true;
                return lm1Var;
            }
            jm1 jm1Var = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                jm1Var = (jm1) superclass.getAnnotation(jm1.class);
                if (jm1Var != null) {
                    break;
                }
            }
            if (jm1Var != null) {
                try {
                    im1 im1Var2 = (im1) jm1Var.value().getDeclaredConstructor(null).newInstance(null);
                    im1 im1Var3 = lm1Var.f49814a;
                    if (im1Var3 != im1Var2) {
                        if (im1Var3 != null) {
                            im1Var3.mo6045j();
                        }
                        lm1Var.f49814a = im1Var2;
                        lm1Var.f49815b = true;
                        if (im1Var2 != null) {
                            im1Var2.mo6044g(lm1Var);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + jm1Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            lm1Var.f49815b = true;
        }
        return lm1Var;
    }

    /* JADX INFO: renamed from: v */
    public static void m1975v(View view, int i) {
        lm1 lm1Var = (lm1) view.getLayoutParams();
        int i2 = lm1Var.f49822i;
        if (i2 != i) {
            WeakHashMap weakHashMap = dta.f36217a;
            view.offsetLeftAndRight(i - i2);
            lm1Var.f49822i = i;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1976w(View view, int i) {
        lm1 lm1Var = (lm1) view.getLayoutParams();
        int i2 = lm1Var.f49823j;
        if (i2 != i) {
            WeakHashMap weakHashMap = dta.f36217a;
            view.offsetTopAndBottom(i - i2);
            lm1Var.f49823j = i;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1977b(lm1 lm1Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lm1Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) lm1Var).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) lm1Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) lm1Var).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // p000.uj6
    /* JADX INFO: renamed from: c */
    public final void mo660c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        im1 im1Var;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                lm1 lm1Var = (lm1) childAt.getLayoutParams();
                if (lm1Var.m16361a(i5) && (im1Var = lm1Var.f49814a) != null) {
                    int[] iArr2 = this.f5480e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    im1Var.mo5997p(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m1983p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof lm1) && super.checkLayoutParams(layoutParams);
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: d */
    public final void mo661d(View view, int i, int i2, int i3, int i4, int i5) {
        mo660c(view, i, i2, i3, i4, 0, this.f5481f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        im1 im1Var = ((lm1) view.getLayoutParams()).f49814a;
        if (im1Var != null) {
            im1Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5472K;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: e */
    public final boolean mo662e(View view, View view2, int i, int i2) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z = false;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view3 = view;
                i3 = i;
                i4 = i2;
            } else {
                lm1 lm1Var = (lm1) childAt.getLayoutParams();
                im1 im1Var = lm1Var.f49814a;
                if (im1Var != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    boolean zMo6000t = im1Var.mo6000t(coordinatorLayout, childAt, view3, i3, i4);
                    z |= zMo6000t;
                    if (i4 == 0) {
                        lm1Var.f49826m = zMo6000t;
                    } else if (i4 == 1) {
                        lm1Var.f49827n = zMo6000t;
                    }
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    if (i4 == 0) {
                        lm1Var.f49826m = false;
                    } else if (i4 == 1) {
                        lm1Var.f49827n = false;
                    }
                }
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            i = i3;
            i2 = i4;
        }
        return z;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: f */
    public final void mo663f(View view, View view2, int i, int i2) {
        this.f5475N.m19945d(i, i2);
        this.f5486k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((lm1) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: g */
    public final void mo664g(View view, int i) {
        this.f5475N.m19946e(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            lm1 lm1Var = (lm1) childAt.getLayoutParams();
            if (lm1Var.m16361a(i)) {
                im1 im1Var = lm1Var.f49814a;
                if (im1Var != null) {
                    im1Var.mo6001u(this, childAt, view, i);
                }
                if (i == 0) {
                    lm1Var.f49826m = false;
                } else if (i == 1) {
                    lm1Var.f49827n = false;
                }
                lm1Var.f49828o = false;
            }
        }
        this.f5486k = null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new lm1();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof lm1) {
            return new lm1((lm1) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new lm1((ViewGroup.MarginLayoutParams) layoutParams) : new lm1(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        m1987t();
        return Collections.unmodifiableList(this.f5476a);
    }

    public final f6b getLastWindowInsets() {
        return this.f5470I;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f5475N.m19943b();
    }

    public Drawable getStatusBarBackground() {
        return this.f5472K;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: h */
    public final void mo665h(View view, int i, int i2, int[] iArr, int i3) {
        im1 im1Var;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                lm1 lm1Var = (lm1) childAt.getLayoutParams();
                if (lm1Var.m16361a(i3) && (im1Var = lm1Var.f49814a) != null) {
                    int[] iArr2 = this.f5480e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    im1Var.mo5996o(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m1983p(1);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1978i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m1980k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m1979j(View view) {
        l79 l79Var = (l79) this.f5477b.f50861c;
        int i = l79Var.f49254c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) l79Var.m15977i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l79Var.m15974f(i2));
            }
        }
        ArrayList arrayList3 = this.f5479d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m1980k(View view, Rect rect) {
        ThreadLocal threadLocal = lta.f50120a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = lta.f50120a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        lta.m16542a(this, view, matrix);
        ThreadLocal threadLocal3 = lta.f50121b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: m */
    public final int m1981m(int i) {
        int[] iArr = this.f5484i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1982o(View view, int i, int i2) {
        kh7 kh7Var = f5468S;
        Rect rectM1972a = m1972a();
        m1980k(view, rectM1972a);
        try {
            return rectM1972a.contains(i, i2);
        } finally {
            rectM1972a.setEmpty();
            kh7Var.mo14460c(rectM1972a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1988u(false);
        if (this.f5469H) {
            if (this.f5487l == null) {
                this.f5487l = new mm1(this, 0);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5487l);
        }
        if (this.f5470I == null) {
            WeakHashMap weakHashMap = dta.f36217a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f5483h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1988u(false);
        if (this.f5469H && this.f5487l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5487l);
        }
        View view = this.f5486k;
        if (view != null) {
            mo664g(view, 0);
        }
        this.f5483h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f5471J || this.f5472K == null) {
            return;
        }
        f6b f6bVar = this.f5470I;
        int iM11574d = f6bVar != null ? f6bVar.m11574d() : 0;
        if (iM11574d > 0) {
            this.f5472K.setBounds(0, 0, getWidth(), iM11574d);
            this.f5472K.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1988u(true);
        }
        boolean zM1986s = m1986s(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM1986s;
        }
        m1988u(true);
        return zM1986s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        im1 im1Var;
        WeakHashMap weakHashMap = dta.f36217a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f5476a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((im1Var = ((lm1) view.getLayoutParams()).f49814a) == null || !im1Var.mo5994l(this, view, layoutDirection))) {
                m1984q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        im1 im1Var;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zMo5995m;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m1987t();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            l79 l79Var = (l79) coordinatorLayout.f5477b.f50861c;
            int i13 = l79Var.f49254c;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) l79Var.m15977i(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.f5469H) {
            boolean z3 = coordinatorLayout.f5483h;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.f5487l == null) {
                        coordinatorLayout.f5487l = new mm1(coordinatorLayout, 0);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f5487l);
                }
                coordinatorLayout.f5469H = true;
            } else {
                if (z3 && coordinatorLayout.f5487l != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f5487l);
                }
                coordinatorLayout.f5469H = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = dta.f36217a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.f5470I != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f5476a;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z2 = false;
                i8 = paddingRight;
            } else {
                lm1 lm1Var = (lm1) view2.getLayoutParams();
                int i19 = lm1Var.f49818e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iM1981m = coordinatorLayout.m1981m(i19);
                    int i20 = lm1Var.f49816c;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iM1981m - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iM11573c = coordinatorLayout.f5470I.m11573c() + coordinatorLayout.f5470I.m11572b();
                            int iM11571a = coordinatorLayout.f5470I.m11571a() + coordinatorLayout.f5470I.m11574d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM11573c, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM11571a, mode2);
                        }
                        im1Var = lm1Var.f49814a;
                        if (im1Var != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i21 = iMakeMeasureSpec;
                            i11 = i17;
                            int i22 = iMakeMeasureSpec2;
                            zMo5995m = im1Var.mo5995m(this, view2, i21, i5, i22);
                            view = view2;
                            iMakeMeasureSpec = i21;
                            i10 = i22;
                            if (zMo5995m) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) lm1Var).leftMargin + ((ViewGroup.MarginLayoutParams) lm1Var).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) lm1Var).topMargin + ((ViewGroup.MarginLayoutParams) lm1Var).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z2 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) lm1Var).leftMargin + ((ViewGroup.MarginLayoutParams) lm1Var).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) lm1Var).topMargin + ((ViewGroup.MarginLayoutParams) lm1Var).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM1981m);
                    }
                    int i23 = size3;
                    i5 = iMax;
                    i4 = i23;
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    im1Var = lm1Var.f49814a;
                    if (im1Var != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i24 = iMakeMeasureSpec;
                        i11 = i17;
                        int i25 = iMakeMeasureSpec2;
                        zMo5995m = im1Var.mo5995m(this, view2, i24, i5, i25);
                        view = view2;
                        iMakeMeasureSpec = i24;
                        i10 = i25;
                        if (zMo5995m) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) lm1Var).leftMargin + ((ViewGroup.MarginLayoutParams) lm1Var).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) lm1Var).topMargin + ((ViewGroup.MarginLayoutParams) lm1Var).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z2 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) lm1Var).leftMargin + ((ViewGroup.MarginLayoutParams) lm1Var).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) lm1Var).topMargin + ((ViewGroup.MarginLayoutParams) lm1Var).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                im1Var = lm1Var.f49814a;
                if (im1Var != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i26 = iMakeMeasureSpec;
                    i11 = i17;
                    int i27 = iMakeMeasureSpec2;
                    zMo5995m = im1Var.mo5995m(this, view2, i26, i5, i27);
                    view = view2;
                    iMakeMeasureSpec = i26;
                    i10 = i27;
                    if (zMo5995m) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) lm1Var).leftMargin + ((ViewGroup.MarginLayoutParams) lm1Var).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) lm1Var).topMargin + ((ViewGroup.MarginLayoutParams) lm1Var).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z2 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) lm1Var).leftMargin + ((ViewGroup.MarginLayoutParams) lm1Var).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) lm1Var).topMargin + ((ViewGroup.MarginLayoutParams) lm1Var).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i28 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i2, i28 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                lm1 lm1Var = (lm1) childAt.getLayoutParams();
                if (lm1Var.m16361a(0)) {
                    im1 im1Var = lm1Var.f49814a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        im1 im1Var;
        int childCount = getChildCount();
        boolean zMo6046n = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                lm1 lm1Var = (lm1) childAt.getLayoutParams();
                if (lm1Var.m16361a(0) && (im1Var = lm1Var.f49814a) != null) {
                    zMo6046n |= im1Var.mo6046n(view);
                }
            }
        }
        return zMo6046n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo665h(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo661d(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo663f(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5563a);
        SparseArray sparseArray = savedState.f5488c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            im1 im1Var = m1974n(childAt).f49814a;
            if (id != -1 && im1Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                im1Var.mo5998r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo5999s;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            im1 im1Var = ((lm1) childAt.getLayoutParams()).f49814a;
            if (id != -1 && im1Var != null && (parcelableMo5999s = im1Var.mo5999s(childAt)) != null) {
                sparseArray.append(id, parcelableMo5999s);
            }
        }
        savedState.f5488c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo662e(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo664g(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM1986s;
        boolean zMo6018v;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5485j == null) {
            zM1986s = m1986s(motionEvent, 1);
            if (!zM1986s) {
                zMo6018v = false;
            }
            motionEventObtain = null;
            if (this.f5485j == null) {
                zMo6018v |= super.onTouchEvent(motionEvent);
            } else if (zM1986s) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo6018v;
            }
            m1988u(false);
            return zMo6018v;
        }
        zM1986s = false;
        im1 im1Var = ((lm1) this.f5485j.getLayoutParams()).f49814a;
        if (im1Var != null) {
            zMo6018v = im1Var.mo6018v(this, this.f5485j, motionEvent);
        } else {
            zMo6018v = false;
        }
        motionEventObtain = null;
        if (this.f5485j == null) {
            zMo6018v |= super.onTouchEvent(motionEvent);
        } else if (zM1986s) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m1988u(false);
        return zMo6018v;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX INFO: renamed from: p */
    public final void m1983p(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zMo6006h;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        lm1 lm1Var;
        int i10;
        View view;
        im1 im1Var;
        WeakHashMap weakHashMap = dta.f36217a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f5476a;
        int size = arrayList2.size();
        Rect rectM1972a = m1972a();
        Rect rectM1972a2 = m1972a();
        Rect rectM1972a3 = m1972a();
        int i11 = 0;
        while (true) {
            kh7 kh7Var = f5468S;
            if (i11 >= size) {
                Rect rect2 = rectM1972a3;
                rectM1972a.setEmpty();
                kh7Var.mo14460c(rectM1972a);
                rectM1972a2.setEmpty();
                kh7Var.mo14460c(rectM1972a2);
                rect2.setEmpty();
                kh7Var.mo14460c(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            lm1 lm1Var2 = (lm1) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i12 = 0;
                while (i12 < i11) {
                    if (lm1Var2.f49825l == ((View) arrayList2.get(i12))) {
                        lm1 lm1Var3 = (lm1) view2.getLayoutParams();
                        if (lm1Var3.f49824k != null) {
                            Rect rectM1972a4 = m1972a();
                            Rect rectM1972a5 = m1972a();
                            lm1 lm1Var4 = lm1Var2;
                            Rect rectM1972a6 = m1972a();
                            m1980k(lm1Var3.f49824k, rectM1972a4);
                            m1978i(view2, rectM1972a5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            lm1Var = lm1Var4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            m1973l(layoutDirection, rectM1972a4, rectM1972a6, lm1Var3, measuredWidth, measuredHeight);
                            boolean z3 = (rectM1972a6.left == rectM1972a5.left && rectM1972a6.top == rectM1972a5.top) ? false : true;
                            m1977b(lm1Var3, rectM1972a6, measuredWidth, measuredHeight);
                            int i13 = rectM1972a6.left - rectM1972a5.left;
                            int i14 = rectM1972a6.top - rectM1972a5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = dta.f36217a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = dta.f36217a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (im1Var = lm1Var3.f49814a) != null) {
                                im1Var.mo6006h(this, view, lm1Var3.f49824k);
                            }
                            rectM1972a4.setEmpty();
                            kh7Var.mo14460c(rectM1972a4);
                            rectM1972a5.setEmpty();
                            kh7Var.mo14460c(rectM1972a5);
                            rectM1972a6.setEmpty();
                            kh7Var.mo14460c(rectM1972a6);
                        } else {
                            lm1Var = lm1Var2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        lm1Var = lm1Var2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    lm1Var2 = lm1Var;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectM1972a3 = rectM1972a3;
                }
                ArrayList arrayList3 = arrayList2;
                lm1 lm1Var5 = lm1Var2;
                int i15 = size;
                Rect rect3 = rectM1972a3;
                i2 = i11;
                View view4 = view2;
                m1978i(view4, rectM1972a2, true);
                if (lm1Var5.f49820g != 0 && !rectM1972a2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(lm1Var5.f49820g, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectM1972a.top = Math.max(rectM1972a.top, rectM1972a2.bottom);
                    } else if (i16 == 80) {
                        rectM1972a.bottom = Math.max(rectM1972a.bottom, getHeight() - rectM1972a2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectM1972a.left = Math.max(rectM1972a.left, rectM1972a2.right);
                    } else if (i17 == 5) {
                        rectM1972a.right = Math.max(rectM1972a.right, getWidth() - rectM1972a2.left);
                    }
                }
                if (lm1Var5.f49821h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = dta.f36217a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        lm1 lm1Var6 = (lm1) view4.getLayoutParams();
                        im1 im1Var2 = lm1Var6.f49814a;
                        Rect rectM1972a7 = m1972a();
                        Rect rectM1972a8 = m1972a();
                        rectM1972a8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (im1Var2 == null || !im1Var2.mo6142e(view4)) {
                            rectM1972a7.set(rectM1972a8);
                        } else if (!rectM1972a8.contains(rectM1972a7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM1972a7.toShortString() + " | Bounds:" + rectM1972a8.toShortString());
                        }
                        rectM1972a8.setEmpty();
                        kh7Var.mo14460c(rectM1972a8);
                        if (rectM1972a7.isEmpty()) {
                            rectM1972a7.setEmpty();
                            kh7Var.mo14460c(rectM1972a7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(lm1Var6.f49821h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectM1972a7.top - ((ViewGroup.MarginLayoutParams) lm1Var6).topMargin) - lm1Var6.f49823j) >= (i9 = rectM1972a.top)) {
                                z = false;
                            } else {
                                m1976w(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM1972a7.bottom) - ((ViewGroup.MarginLayoutParams) lm1Var6).bottomMargin) + lm1Var6.f49823j) < (i7 = rectM1972a.bottom)) {
                                m1976w(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                m1976w(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectM1972a7.left - ((ViewGroup.MarginLayoutParams) lm1Var6).leftMargin) - lm1Var6.f49822i) >= (i6 = rectM1972a.left)) {
                                z2 = false;
                            } else {
                                m1975v(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM1972a7.right) - ((ViewGroup.MarginLayoutParams) lm1Var6).rightMargin) + lm1Var6.f49822i) < (i4 = rectM1972a.right)) {
                                m1975v(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                m1975v(view4, 0);
                            }
                            rectM1972a7.setEmpty();
                            kh7Var.mo14460c(rectM1972a7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((lm1) view4.getLayoutParams()).f49829p);
                    if (rect.equals(rectM1972a2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((lm1) view4.getLayoutParams()).f49829p.set(rectM1972a2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i18);
                    lm1 lm1Var7 = (lm1) view5.getLayoutParams();
                    im1 im1Var3 = lm1Var7.f49814a;
                    if (im1Var3 != null && im1Var3.mo6005f(view5, view4)) {
                        if (i == 0 && lm1Var7.f49828o) {
                            lm1Var7.f49828o = false;
                        } else {
                            if (i != 2) {
                                zMo6006h = im1Var3.mo6006h(this, view5, view4);
                            } else {
                                im1Var3.mo6007i(this, view4);
                                zMo6006h = true;
                            }
                            if (i == 1) {
                                lm1Var7.f49828o = zMo6006h;
                            }
                        }
                    }
                    i18++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                rect = rectM1972a3;
                i2 = i11;
            }
            i11 = i2 + 1;
            rectM1972a3 = rect;
            size = i3;
            arrayList2 = arrayList;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1984q(View view, int i) {
        int i2;
        lm1 lm1Var = (lm1) view.getLayoutParams();
        View view2 = lm1Var.f49824k;
        if (view2 == null && lm1Var.f49819f != -1) {
            C3386nv.m17633t("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        kh7 kh7Var = f5468S;
        if (view2 != null) {
            Rect rectM1972a = m1972a();
            Rect rectM1972a2 = m1972a();
            try {
                m1980k(view2, rectM1972a);
                lm1 lm1Var2 = (lm1) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1973l(i, rectM1972a, rectM1972a2, lm1Var2, measuredWidth, measuredHeight);
                m1977b(lm1Var2, rectM1972a2, measuredWidth, measuredHeight);
                view.layout(rectM1972a2.left, rectM1972a2.top, rectM1972a2.right, rectM1972a2.bottom);
                return;
            } finally {
                rectM1972a.setEmpty();
                kh7Var.mo14460c(rectM1972a);
                rectM1972a2.setEmpty();
                kh7Var.mo14460c(rectM1972a2);
            }
        }
        int i3 = lm1Var.f49818e;
        if (i3 < 0) {
            lm1 lm1Var3 = (lm1) view.getLayoutParams();
            Rect rectM1972a3 = m1972a();
            rectM1972a3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lm1Var3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) lm1Var3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) lm1Var3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) lm1Var3).bottomMargin);
            if (this.f5470I != null) {
                WeakHashMap weakHashMap = dta.f36217a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM1972a3.left = this.f5470I.m11572b() + rectM1972a3.left;
                    rectM1972a3.top = this.f5470I.m11574d() + rectM1972a3.top;
                    rectM1972a3.right -= this.f5470I.m11573c();
                    rectM1972a3.bottom -= this.f5470I.m11571a();
                }
            }
            Rect rectM1972a4 = m1972a();
            int i4 = lm1Var3.f49816c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM1972a3, rectM1972a4, i);
            view.layout(rectM1972a4.left, rectM1972a4.top, rectM1972a4.right, rectM1972a4.bottom);
            rectM1972a3.setEmpty();
            kh7Var.mo14460c(rectM1972a3);
            rectM1972a4.setEmpty();
            kh7Var.mo14460c(rectM1972a4);
            return;
        }
        lm1 lm1Var4 = (lm1) view.getLayoutParams();
        int i5 = lm1Var4.f49816c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM1981m = m1981m(i3) - measuredWidth2;
        if (i6 == 1) {
            iM1981m += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM1981m += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) lm1Var4).leftMargin, Math.min(iM1981m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) lm1Var4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) lm1Var4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) lm1Var4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: r */
    public final void m1985r(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        im1 im1Var = ((lm1) view.getLayoutParams()).f49814a;
        if (im1Var == null || !im1Var.mo6008q(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f5482g) {
            return;
        }
        m1988u(false);
        this.f5482g = true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1986s(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f5478c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        ma3 ma3Var = f5467R;
        if (ma3Var != null) {
            Collections.sort(arrayList, ma3Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo6017k = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            im1 im1Var = ((lm1) view.getLayoutParams()).f49814a;
            if (zMo6017k && actionMasked != 0) {
                if (im1Var != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        im1Var.mo6017k(this, view, motionEventObtain);
                    } else if (i == 1) {
                        im1Var.mo6018v(this, view, motionEventObtain);
                    }
                }
            } else if (!zMo6017k && im1Var != null) {
                if (i == 0) {
                    zMo6017k = im1Var.mo6017k(this, view, motionEvent);
                } else if (i == 1) {
                    zMo6017k = im1Var.mo6018v(this, view, motionEvent);
                }
                if (zMo6017k) {
                    this.f5485j = view;
                }
            }
        }
        arrayList.clear();
        return zMo6017k;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1989x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5473L = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f5472K;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f5472K = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f5472K.setState(getDrawableState());
                }
                Drawable drawable3 = this.f5472K;
                WeakHashMap weakHashMap = dta.f36217a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f5472K.setVisible(getVisibility() == 0, false);
                this.f5472K.setCallback(this);
            }
            WeakHashMap weakHashMap2 = dta.f36217a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f5472K;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f5472K.setVisible(z, false);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: t */
    public final void m1987t() {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1987t():void");
    }

    /* JADX INFO: renamed from: u */
    public final void m1988u(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            im1 im1Var = ((lm1) childAt.getLayoutParams()).f49814a;
            if (im1Var != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    im1Var.mo6017k(this, childAt, motionEventObtain);
                } else {
                    im1Var.mo6018v(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((lm1) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f5485j = null;
        this.f5482g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5472K;
    }

    /* JADX INFO: renamed from: x */
    public final void m1989x() {
        WeakHashMap weakHashMap = dta.f36217a;
        if (!getFitsSystemWindows()) {
            wsa.m24145c(this, null);
            return;
        }
        if (this.f5474M == null) {
            this.f5474M = new hi8(this, 9);
        }
        wsa.m24145c(this, this.f5474M);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new lm1(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
