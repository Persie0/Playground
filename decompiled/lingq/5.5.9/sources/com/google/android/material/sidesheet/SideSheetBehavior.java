package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.activity.RunnableC0191j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.linguist.R;
import gd.C5768g;
import gd.C5772k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p072dd.C5150c;
import p084e3.C5365c;
import p150h9.C5935r;
import p153hc.C6031a;
import p154hd.AbstractC6036e;
import p154hd.C6032a;
import p154hd.InterfaceC6033b;
import p338qd.C8573r0;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.C10284f;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0768c<V> {

    /* JADX INFO: renamed from: a */
    public C6032a f15441a;

    /* JADX INFO: renamed from: b */
    public C5768g f15442b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f15443c;

    /* JADX INFO: renamed from: d */
    public final C5772k f15444d;

    /* JADX INFO: renamed from: e */
    public final SideSheetBehavior<V>.C3051b f15445e;

    /* JADX INFO: renamed from: f */
    public final float f15446f;

    /* JADX INFO: renamed from: g */
    public boolean f15447g;

    /* JADX INFO: renamed from: h */
    public int f15448h;

    /* JADX INFO: renamed from: i */
    public C5365c f15449i;

    /* JADX INFO: renamed from: j */
    public boolean f15450j;

    /* JADX INFO: renamed from: k */
    public final float f15451k;

    /* JADX INFO: renamed from: l */
    public int f15452l;

    /* JADX INFO: renamed from: m */
    public int f15453m;

    /* JADX INFO: renamed from: n */
    public int f15454n;

    /* JADX INFO: renamed from: o */
    public WeakReference<V> f15455o;

    /* JADX INFO: renamed from: p */
    public WeakReference<View> f15456p;

    /* JADX INFO: renamed from: q */
    public int f15457q;

    /* JADX INFO: renamed from: r */
    public VelocityTracker f15458r;

    /* JADX INFO: renamed from: s */
    public int f15459s;

    /* JADX INFO: renamed from: t */
    public final LinkedHashSet f15460t;

    /* JADX INFO: renamed from: u */
    public final C3050a f15461u;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3049a();

        /* JADX INFO: renamed from: c */
        public final int f15462c;

        /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$SavedState$a */
        public class C3049a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15462c = parcel.readInt();
        }

        public SavedState(android.view.AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f15462c = sideSheetBehavior.f15448h;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeInt(this.f15462c);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    public class C3050a extends C5365c.c {
        public C3050a() {
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: a */
        public final int mo8584a(View view, int i10) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return C8573r0.m16699T(i10, sideSheetBehavior.f15441a.m12472a(), sideSheetBehavior.f15453m);
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: b */
        public final int mo8585b(View view, int i10) {
            return view.getTop();
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: c */
        public final int mo8586c(View view) {
            return SideSheetBehavior.this.f15453m;
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: f */
        public final void mo8588f(int i10) {
            if (i10 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f15447g) {
                    sideSheetBehavior.m8809s(1);
                }
            }
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: g */
        public final void mo8589g(View view, int i10, int i11) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f15456p;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                C6032a c6032a = sideSheetBehavior.f15441a;
                int left = view.getLeft();
                view.getRight();
                int i12 = c6032a.f35677a.f15453m;
                if (left <= i12) {
                    marginLayoutParams.rightMargin = i12 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.f15460t;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            C6032a c6032a2 = sideSheetBehavior.f15441a;
            int i13 = c6032a2.f35677a.f15453m;
            c6032a2.m12472a();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC6033b) it.next()).m12474b();
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: h */
        public final void mo8590h(View view, float f3, float f10) {
            int left;
            int i10;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            C6032a c6032a = sideSheetBehavior.f15441a;
            c6032a.getClass();
            if (f3 >= 0.0f) {
                float right = view.getRight();
                SideSheetBehavior<? extends View> sideSheetBehavior2 = c6032a.f35677a;
                boolean z10 = false;
                if (Math.abs((sideSheetBehavior2.f15451k * f3) + right) > 0.5f) {
                    if (!(((Math.abs(f3) > Math.abs(f10) ? 1 : (Math.abs(f3) == Math.abs(f10) ? 0 : -1)) > 0) && f10 > ((float) 500))) {
                        if (view.getLeft() > (sideSheetBehavior2.f15453m - c6032a.m12472a()) / 2) {
                            z10 = true;
                        }
                        if (z10) {
                        }
                    }
                    i10 = 5;
                } else {
                    if (f3 == 0.0f) {
                        left = view.getLeft();
                        if (Math.abs(left - c6032a.m12472a()) < Math.abs(left - sideSheetBehavior2.f15453m)) {
                        }
                    } else {
                        if (Math.abs(f3) > Math.abs(f10)) {
                            z10 = true;
                        }
                        if (!z10) {
                            left = view.getLeft();
                            if (Math.abs(left - c6032a.m12472a()) < Math.abs(left - sideSheetBehavior2.f15453m)) {
                            }
                        }
                    }
                    i10 = 5;
                }
                sideSheetBehavior.m8810t(view, i10, true);
            }
            i10 = 3;
            sideSheetBehavior.m8810t(view, i10, true);
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: i */
        public final boolean mo8591i(View view, int i10) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.f15448h == 1 || (weakReference = sideSheetBehavior.f15455o) == null || weakReference.get() != view) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    public class C3051b {

        /* JADX INFO: renamed from: a */
        public int f15464a;

        /* JADX INFO: renamed from: b */
        public boolean f15465b;

        /* JADX INFO: renamed from: c */
        public final RunnableC0191j f15466c = new RunnableC0191j(14, this);

        public C3051b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m8812a(int i10) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f15455o;
            if (weakReference != null) {
                if (weakReference.get() == null) {
                    return;
                }
                this.f15464a = i10;
                if (!this.f15465b) {
                    V v10 = sideSheetBehavior.f15455o.get();
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.d.m18676m(v10, this.f15466c);
                    this.f15465b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.f15445e = new C3051b();
        this.f15447g = true;
        this.f15448h = 5;
        this.f15451k = 0.1f;
        this.f15457q = -1;
        this.f15460t = new LinkedHashSet();
        this.f15461u = new C3050a();
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15445e = new C3051b();
        this.f15447g = true;
        this.f15448h = 5;
        this.f15451k = 0.1f;
        this.f15457q = -1;
        this.f15460t = new LinkedHashSet();
        this.f15461u = new C3050a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35641J);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f15443c = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f15444d = new C5772k(C5772k.m12150b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f15457q = resourceId;
            WeakReference<View> weakReference = this.f15456p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f15456p = null;
            WeakReference<V> weakReference2 = this.f15455o;
            if (weakReference2 != null) {
                V v10 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    if (C10029b0.g.m18699c(v10)) {
                        v10.requestLayout();
                    }
                }
            }
        }
        C5772k c5772k = this.f15444d;
        if (c5772k != null) {
            C5768g c5768g = new C5768g(c5772k);
            this.f15442b = c5768g;
            c5768g.m12138j(context);
            ColorStateList colorStateList = this.f15443c;
            if (colorStateList != null) {
                this.f15442b.m12141m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f15442b.setTint(typedValue.data);
            }
        }
        this.f15446f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f15447g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f15441a == null) {
            this.f15441a = new C6032a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: c */
    public final void mo2937c(CoordinatorLayout.C0771f c0771f) {
        this.f15455o = null;
        this.f15449i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: f */
    public final void mo2940f() {
        this.f15455o = null;
        this.f15449i = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: g */
    public final boolean mo2941g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        C5365c c5365c;
        VelocityTracker velocityTracker;
        if (!v10.isShown() && C10029b0.m18649e(v10) == null) {
            z10 = false;
        } else if (this.f15447g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f15450j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f15458r) != null) {
            velocityTracker.recycle();
            this.f15458r = null;
        }
        if (this.f15458r == null) {
            this.f15458r = VelocityTracker.obtain();
        }
        this.f15458r.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (this.f15450j) {
                    this.f15450j = false;
                    return false;
                }
            }
            return this.f15450j && (c5365c = this.f15449i) != null && c5365c.m11538r(motionEvent);
        }
        this.f15459s = (int) motionEvent.getX();
        if (this.f15450j) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    /* JADX WARN: Code duplicated, block: B:68:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: h */
    public final boolean mo2942h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        int i11;
        int i12;
        View viewFindViewById;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.d.m18665b(coordinatorLayout) && !C10029b0.d.m18665b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        int left = 0;
        if (this.f15455o == null) {
            this.f15455o = new WeakReference<>(v10);
            C5768g c5768g = this.f15442b;
            if (c5768g != null) {
                C10029b0.d.m18680q(v10, c5768g);
                C5768g c5768g2 = this.f15442b;
                float fM18715i = this.f15446f;
                if (fM18715i == -1.0f) {
                    fM18715i = C10029b0.i.m18715i(v10);
                }
                c5768g2.m12140l(fM18715i);
            } else {
                ColorStateList colorStateList = this.f15443c;
                if (colorStateList != null) {
                    C10029b0.i.m18723q(v10, colorStateList);
                }
            }
            int i13 = this.f15448h == 5 ? 4 : 0;
            if (v10.getVisibility() != i13) {
                v10.setVisibility(i13);
            }
            m8811u();
            if (C10029b0.d.m18666c(v10) == 0) {
                C10029b0.d.m18682s(v10, 1);
            }
            if (C10029b0.m18649e(v10) == null) {
                C10029b0.m18659o(v10, v10.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f15449i == null) {
            this.f15449i = new C5365c(coordinatorLayout.getContext(), coordinatorLayout, this.f15461u);
        }
        C6032a c6032a = this.f15441a;
        c6032a.getClass();
        int left2 = v10.getLeft() - c6032a.f35677a.f15454n;
        coordinatorLayout.m2928q(v10, i10);
        this.f15453m = coordinatorLayout.getWidth();
        this.f15452l = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        if (marginLayoutParams != null) {
            this.f15441a.getClass();
            i11 = marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        this.f15454n = i11;
        int i14 = this.f15448h;
        if (i14 != 1 && i14 != 2) {
            if (i14 != 3) {
                if (i14 != 5) {
                    throw new IllegalStateException("Unexpected value: " + this.f15448h);
                }
                left = this.f15441a.f35677a.f15453m;
            }
            v10.offsetLeftAndRight(left);
            if (this.f15456p == null && (i12 = this.f15457q) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i12)) != null) {
                this.f15456p = new WeakReference<>(viewFindViewById);
            }
            for (InterfaceC6033b interfaceC6033b : this.f15460t) {
                if (interfaceC6033b instanceof AbstractC6036e) {
                    ((AbstractC6036e) interfaceC6033b).getClass();
                }
            }
            return true;
        }
        C6032a c6032a2 = this.f15441a;
        c6032a2.getClass();
        left = left2 - (v10.getLeft() - c6032a2.f35677a.f15454n);
        v10.offsetLeftAndRight(left);
        if (this.f15456p == null) {
            this.f15456p = new WeakReference<>(viewFindViewById);
        }
        while (r10.hasNext()) {
            if (interfaceC6033b instanceof AbstractC6036e) {
                ((AbstractC6036e) interfaceC6033b).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: i */
    public final boolean mo2943i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: n */
    public final void mo2948n(View view, Parcelable parcelable) {
        int i10 = ((SavedState) parcelable).f15462c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f15448h = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: o */
    public final Parcelable mo2949o(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: r */
    public final boolean mo2952r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z10 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f15448h;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        C5365c c5365c = this.f15449i;
        if (c5365c != null && (this.f15447g || i10 == 1)) {
            c5365c.m11531k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f15458r) != null) {
            velocityTracker.recycle();
            this.f15458r = null;
        }
        if (this.f15458r == null) {
            this.f15458r = VelocityTracker.obtain();
        }
        this.f15458r.addMovement(motionEvent);
        C5365c c5365c2 = this.f15449i;
        if ((c5365c2 != null && (this.f15447g || this.f15448h == 1)) && actionMasked == 2 && !this.f15450j) {
            if ((c5365c2 != null && (this.f15447g || this.f15448h == 1)) && Math.abs(this.f15459s - motionEvent.getX()) > this.f15449i.f33710b) {
                z10 = true;
            }
            if (z10) {
                this.f15449i.m11522b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f15450j;
    }

    /* JADX INFO: renamed from: s */
    public final void m8809s(int i10) {
        V v10;
        if (this.f15448h == i10) {
            return;
        }
        this.f15448h = i10;
        WeakReference<V> weakReference = this.f15455o;
        if (weakReference != null && (v10 = weakReference.get()) != null) {
            int i11 = this.f15448h == 5 ? 4 : 0;
            if (v10.getVisibility() != i11) {
                v10.setVisibility(i11);
            }
            Iterator it = this.f15460t.iterator();
            while (it.hasNext()) {
                ((InterfaceC6033b) it.next()).m12473a();
            }
            m8811u();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t */
    public final void m8810t(View view, int i10, boolean z10) {
        int iM12472a;
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f15441a.f35677a;
        if (i10 == 3) {
            iM12472a = sideSheetBehavior.f15441a.m12472a();
        } else {
            if (i10 != 5) {
                sideSheetBehavior.getClass();
                throw new IllegalArgumentException(C0166e.m761g("Invalid state to get outer edge offset: ", i10));
            }
            iM12472a = sideSheetBehavior.f15441a.f35677a.f15453m;
        }
        C5365c c5365c = sideSheetBehavior.f15449i;
        boolean z11 = false;
        if (c5365c != null) {
            if (!z10) {
                int top = view.getTop();
                c5365c.f33726r = view;
                c5365c.f33711c = -1;
                boolean zM11529i = c5365c.m11529i(iM12472a, top, 0, 0);
                if (!zM11529i && c5365c.f33709a == 0 && c5365c.f33726r != null) {
                    c5365c.f33726r = null;
                }
                if (zM11529i) {
                    z11 = true;
                }
            } else if (c5365c.m11537q(iM12472a, view.getTop())) {
                z11 = true;
            }
        }
        if (!z11) {
            m8809s(i10);
        } else {
            m8809s(2);
            this.f15445e.m8812a(i10);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8811u() {
        V v10;
        WeakReference<V> weakReference = this.f15455o;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        C10029b0.m18655k(v10, 262144);
        C10029b0.m18652h(v10, 0);
        C10029b0.m18655k(v10, 1048576);
        C10029b0.m18652h(v10, 0);
        int i10 = 2;
        int i11 = 5;
        if (this.f15448h != 5) {
            C10029b0.m18656l(v10, C10284f.a.f51749l, new C5935r(i11, i10, this));
        }
        int i12 = 3;
        if (this.f15448h != 3) {
            C10029b0.m18656l(v10, C10284f.a.f51747j, new C5935r(i12, i10, this));
        }
    }
}
