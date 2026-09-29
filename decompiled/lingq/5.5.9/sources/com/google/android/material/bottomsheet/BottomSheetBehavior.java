package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.linguist.R;
import gd.C5768g;
import gd.C5772k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import mc.C7535a;
import mc.C7536b;
import mc.C7537c;
import mc.C7541g;
import p003a2.C0009a;
import p072dd.C5150c;
import p084e3.C5365c;
import p153hc.C6031a;
import p338qd.C8573r0;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10061r0;
import p497y2.C10284f;
import p507yc.C10347n;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0768c<V> {

    /* JADX INFO: renamed from: A */
    public final BottomSheetBehavior<V>.C2963d f14818A;

    /* JADX INFO: renamed from: B */
    public ValueAnimator f14819B;

    /* JADX INFO: renamed from: C */
    public int f14820C;

    /* JADX INFO: renamed from: D */
    public int f14821D;

    /* JADX INFO: renamed from: E */
    public int f14822E;

    /* JADX INFO: renamed from: F */
    public float f14823F;

    /* JADX INFO: renamed from: G */
    public int f14824G;

    /* JADX INFO: renamed from: H */
    public final float f14825H;

    /* JADX INFO: renamed from: I */
    public boolean f14826I;

    /* JADX INFO: renamed from: J */
    public boolean f14827J;

    /* JADX INFO: renamed from: K */
    public boolean f14828K;

    /* JADX INFO: renamed from: L */
    public int f14829L;

    /* JADX INFO: renamed from: M */
    public C5365c f14830M;

    /* JADX INFO: renamed from: N */
    public boolean f14831N;

    /* JADX INFO: renamed from: O */
    public int f14832O;

    /* JADX INFO: renamed from: P */
    public boolean f14833P;

    /* JADX INFO: renamed from: Q */
    public final float f14834Q;

    /* JADX INFO: renamed from: R */
    public int f14835R;

    /* JADX INFO: renamed from: S */
    public int f14836S;

    /* JADX INFO: renamed from: T */
    public int f14837T;

    /* JADX INFO: renamed from: U */
    public WeakReference<V> f14838U;

    /* JADX INFO: renamed from: V */
    public WeakReference<View> f14839V;

    /* JADX INFO: renamed from: W */
    public final ArrayList<AbstractC2962c> f14840W;

    /* JADX INFO: renamed from: X */
    public VelocityTracker f14841X;

    /* JADX INFO: renamed from: Y */
    public int f14842Y;

    /* JADX INFO: renamed from: Z */
    public int f14843Z;

    /* JADX INFO: renamed from: a */
    public int f14844a;

    /* JADX INFO: renamed from: a0 */
    public boolean f14845a0;

    /* JADX INFO: renamed from: b */
    public boolean f14846b;

    /* JADX INFO: renamed from: b0 */
    public HashMap f14847b0;

    /* JADX INFO: renamed from: c */
    public final float f14848c;

    /* JADX INFO: renamed from: c0 */
    public final SparseIntArray f14849c0;

    /* JADX INFO: renamed from: d */
    public int f14850d;

    /* JADX INFO: renamed from: d0 */
    public final C2961b f14851d0;

    /* JADX INFO: renamed from: e */
    public int f14852e;

    /* JADX INFO: renamed from: f */
    public boolean f14853f;

    /* JADX INFO: renamed from: g */
    public int f14854g;

    /* JADX INFO: renamed from: h */
    public final int f14855h;

    /* JADX INFO: renamed from: i */
    public C5768g f14856i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f14857j;

    /* JADX INFO: renamed from: k */
    public int f14858k;

    /* JADX INFO: renamed from: l */
    public int f14859l;

    /* JADX INFO: renamed from: m */
    public int f14860m;

    /* JADX INFO: renamed from: n */
    public boolean f14861n;

    /* JADX INFO: renamed from: o */
    public final boolean f14862o;

    /* JADX INFO: renamed from: p */
    public final boolean f14863p;

    /* JADX INFO: renamed from: q */
    public final boolean f14864q;

    /* JADX INFO: renamed from: r */
    public final boolean f14865r;

    /* JADX INFO: renamed from: s */
    public final boolean f14866s;

    /* JADX INFO: renamed from: t */
    public final boolean f14867t;

    /* JADX INFO: renamed from: u */
    public final boolean f14868u;

    /* JADX INFO: renamed from: v */
    public int f14869v;

    /* JADX INFO: renamed from: w */
    public int f14870w;

    /* JADX INFO: renamed from: x */
    public final boolean f14871x;

    /* JADX INFO: renamed from: y */
    public final C5772k f14872y;

    /* JADX INFO: renamed from: z */
    public boolean f14873z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2959a();

        /* JADX INFO: renamed from: c */
        public final int f14874c;

        /* JADX INFO: renamed from: d */
        public final int f14875d;

        /* JADX INFO: renamed from: e */
        public final boolean f14876e;

        /* JADX INFO: renamed from: f */
        public final boolean f14877f;

        /* JADX INFO: renamed from: g */
        public final boolean f14878g;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        public class C2959a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f14874c = parcel.readInt();
            this.f14875d = parcel.readInt();
            this.f14876e = parcel.readInt() == 1;
            this.f14877f = parcel.readInt() == 1;
            this.f14878g = parcel.readInt() == 1;
        }

        public SavedState(android.view.AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f14874c = bottomSheetBehavior.f14829L;
            this.f14875d = bottomSheetBehavior.f14852e;
            this.f14876e = bottomSheetBehavior.f14846b;
            this.f14877f = bottomSheetBehavior.f14826I;
            this.f14878g = bottomSheetBehavior.f14827J;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeInt(this.f14874c);
            parcel.writeInt(this.f14875d);
            parcel.writeInt(this.f14876e ? 1 : 0);
            parcel.writeInt(this.f14877f ? 1 : 0);
            parcel.writeInt(this.f14878g ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class RunnableC2960a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f14879a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f14880b;

        public RunnableC2960a(View view, int i10) {
            this.f14879a = view;
            this.f14880b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.m8609G(this.f14879a, this.f14880b, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C2961b extends C5365c.c {
        public C2961b() {
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: a */
        public final int mo8584a(View view, int i10) {
            return view.getLeft();
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: b */
        public final int mo8585b(View view, int i10) {
            return C8573r0.m16699T(i10, BottomSheetBehavior.this.m8618y(), mo8620d());
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: d */
        public final int mo8620d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f14826I ? bottomSheetBehavior.f14837T : bottomSheetBehavior.f14824G;
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: f */
        public final void mo8588f(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f14828K) {
                    bottomSheetBehavior.m8607E(1);
                }
            }
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: g */
        public final void mo8589g(View view, int i10, int i11) {
            BottomSheetBehavior.this.m8616u(i11);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: h */
        public final void mo8590h(View view, float f3, float f10) {
            int i10;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f10 < 0.0f) {
                if (bottomSheetBehavior.f14846b) {
                    i10 = 3;
                } else {
                    int top = view.getTop();
                    System.currentTimeMillis();
                    if (top > bottomSheetBehavior.f14822E) {
                        i10 = 6;
                    }
                    i10 = 3;
                }
            } else if (bottomSheetBehavior.f14826I && bottomSheetBehavior.m8608F(view, f10)) {
                if (Math.abs(f3) >= Math.abs(f10) || f10 <= bottomSheetBehavior.f14850d) {
                    if (!(view.getTop() > (bottomSheetBehavior.m8618y() + bottomSheetBehavior.f14837T) / 2)) {
                        if (!bottomSheetBehavior.f14846b && Math.abs(view.getTop() - bottomSheetBehavior.m8618y()) >= Math.abs(view.getTop() - bottomSheetBehavior.f14822E)) {
                            i10 = 6;
                        } else {
                            i10 = 3;
                        }
                    }
                }
                i10 = 5;
            } else {
                if (f10 == 0.0f || Math.abs(f3) > Math.abs(f10)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f14846b) {
                        int i11 = bottomSheetBehavior.f14822E;
                        if (top2 < i11) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f14824G)) {
                                i10 = 3;
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - bottomSheetBehavior.f14824G)) {
                        }
                        i10 = 6;
                    } else if (Math.abs(top2 - bottomSheetBehavior.f14821D) < Math.abs(top2 - bottomSheetBehavior.f14824G)) {
                        i10 = 3;
                    }
                } else {
                    if (!bottomSheetBehavior.f14846b) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - bottomSheetBehavior.f14822E) < Math.abs(top3 - bottomSheetBehavior.f14824G)) {
                            i10 = 6;
                        }
                    }
                    i10 = 4;
                }
                i10 = 4;
            }
            bottomSheetBehavior.getClass();
            bottomSheetBehavior.m8609G(view, i10, true);
        }

        @Override // p084e3.C5365c.c
        /* JADX INFO: renamed from: i */
        public final boolean mo8591i(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f14829L;
            boolean z10 = false;
            if (i11 == 1 || bottomSheetBehavior.f14845a0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f14842Y == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f14839V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.f14838U;
            if (weakReference2 != null && weakReference2.get() == view) {
                z10 = true;
            }
            return z10;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public static abstract class AbstractC2962c {
        /* JADX INFO: renamed from: a */
        public void mo8621a(View view) {
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo8622b(View view);

        /* JADX INFO: renamed from: c */
        public abstract void mo8623c(View view, int i10);
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public class C2963d {

        /* JADX INFO: renamed from: a */
        public int f14883a;

        /* JADX INFO: renamed from: b */
        public boolean f14884b;

        /* JADX INFO: renamed from: c */
        public final a f14885c = new a();

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2963d c2963d = C2963d.this;
                c2963d.f14884b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                C5365c c5365c = bottomSheetBehavior.f14830M;
                if (c5365c != null && c5365c.m11527g()) {
                    c2963d.m8624a(c2963d.f14883a);
                } else if (bottomSheetBehavior.f14829L == 2) {
                    bottomSheetBehavior.m8607E(c2963d.f14883a);
                }
            }
        }

        public C2963d() {
        }

        /* JADX INFO: renamed from: a */
        public final void m8624a(int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.f14838U;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f14883a = i10;
            if (this.f14884b) {
                return;
            }
            V v10 = bottomSheetBehavior.f14838U.get();
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18676m(v10, this.f14885c);
            this.f14884b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f14844a = 0;
        this.f14846b = true;
        this.f14858k = -1;
        this.f14859l = -1;
        this.f14818A = new C2963d();
        this.f14823F = 0.5f;
        this.f14825H = -1.0f;
        this.f14828K = true;
        this.f14829L = 4;
        this.f14834Q = 0.1f;
        this.f14840W = new ArrayList<>();
        this.f14849c0 = new SparseIntArray();
        this.f14851d0 = new C2961b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f14844a = 0;
        this.f14846b = true;
        this.f14858k = -1;
        this.f14859l = -1;
        this.f14818A = new C2963d();
        this.f14823F = 0.5f;
        this.f14825H = -1.0f;
        this.f14828K = true;
        this.f14829L = 4;
        this.f14834Q = 0.1f;
        this.f14840W = new ArrayList<>();
        this.f14849c0 = new SparseIntArray();
        this.f14851d0 = new C2961b();
        this.f14855h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35656f);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f14857j = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f14872y = new C5772k(C5772k.m12150b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        C5772k c5772k = this.f14872y;
        if (c5772k != null) {
            C5768g c5768g = new C5768g(c5772k);
            this.f14856i = c5768g;
            c5768g.m12138j(context);
            ColorStateList colorStateList = this.f14857j;
            if (colorStateList != null) {
                this.f14856i.m12141m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f14856i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f14819B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f14819B.addUpdateListener(new C7535a(this));
        this.f14825H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f14858k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f14859l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i10 = typedValuePeekValue.data) != -1) {
            m8605C(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            m8605C(i10);
        }
        m8604B(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.f14861n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        m8603A(typedArrayObtainStyledAttributes.getBoolean(6, true));
        this.f14827J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f14828K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f14844a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f3 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f3 <= 0.0f || f3 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f14823F = f3;
        if (this.f14838U != null) {
            this.f14822E = (int) ((1.0f - f3) * this.f14837T);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.f14820C = dimensionPixelOffset;
            m8611I(this.f14829L, true);
        } else {
            int i11 = typedValuePeekValue2.data;
            if (i11 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.f14820C = i11;
            m8611I(this.f14829L, true);
        }
        this.f14850d = typedArrayObtainStyledAttributes.getInt(11, 500);
        this.f14862o = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f14863p = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f14864q = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f14865r = typedArrayObtainStyledAttributes.getBoolean(20, true);
        this.f14866s = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f14867t = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f14868u = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.f14871x = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f14848c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: v */
    public static View m8601v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.i.m18722p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewM8601v = m8601v(viewGroup.getChildAt(i10));
                if (viewM8601v != null) {
                    return viewM8601v;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static <V extends View> BottomSheetBehavior<V> m8602w(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C0771f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.AbstractC0768c abstractC0768c = ((CoordinatorLayout.C0771f) layoutParams).f5550a;
        if (abstractC0768c instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC0768c;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    /* JADX INFO: renamed from: A */
    public final void m8603A(boolean z10) {
        if (this.f14846b == z10) {
            return;
        }
        this.f14846b = z10;
        if (this.f14838U != null) {
            m8614s();
        }
        m8607E((this.f14846b && this.f14829L == 6) ? 3 : this.f14829L);
        m8611I(this.f14829L, true);
        m8610H();
    }

    /* JADX INFO: renamed from: B */
    public final void m8604B(boolean z10) {
        if (this.f14826I != z10) {
            this.f14826I = z10;
            if (!z10 && this.f14829L == 5) {
                m8606D(4);
            }
            m8610H();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m8605C(int i10) {
        boolean z10 = false;
        if (i10 != -1) {
            if (!this.f14853f) {
                if (this.f14852e != i10) {
                }
            }
            this.f14853f = false;
            this.f14852e = Math.max(0, i10);
            z10 = true;
        } else if (!this.f14853f) {
            this.f14853f = true;
            z10 = true;
        }
        if (z10) {
            m8613K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: D */
    public final void m8606D(int i10) {
        boolean z10;
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(C0009a.m23l(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f14826I && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f14846b && m8619z(i10) <= this.f14821D) ? 3 : i10;
        WeakReference<V> weakReference = this.f14838U;
        if (weakReference == null || weakReference.get() == null) {
            m8607E(i10);
            return;
        }
        V v10 = this.f14838U.get();
        RunnableC2960a runnableC2960a = new RunnableC2960a(v10, i11);
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            z10 = C10029b0.g.m18698b(v10);
        }
        if (z10) {
            v10.post(runnableC2960a);
        } else {
            runnableC2960a.run();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m8607E(int i10) {
        V v10;
        if (this.f14829L == i10) {
            return;
        }
        this.f14829L = i10;
        WeakReference<V> weakReference = this.f14838U;
        if (weakReference != null && (v10 = weakReference.get()) != null) {
            int i11 = 0;
            if (i10 == 3) {
                m8612J(true);
            } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                m8612J(false);
            }
            m8611I(i10, true);
            while (true) {
                ArrayList<AbstractC2962c> arrayList = this.f14840W;
                if (i11 >= arrayList.size()) {
                    m8610H();
                    return;
                } else {
                    arrayList.get(i11).mo8623c(v10, i10);
                    i11++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m8608F(View view, float f3) {
        if (this.f14827J) {
            return true;
        }
        if (view.getTop() < this.f14824G) {
            return false;
        }
        return Math.abs(((f3 * this.f14834Q) + ((float) view.getTop())) - ((float) this.f14824G)) / ((float) m8615t()) > 0.5f;
    }

    /* JADX INFO: renamed from: G */
    public final void m8609G(View view, int i10, boolean z10) {
        int iM8619z = m8619z(i10);
        C5365c c5365c = this.f14830M;
        boolean z11 = false;
        if (c5365c != null) {
            if (!z10) {
                int left = view.getLeft();
                c5365c.f33726r = view;
                c5365c.f33711c = -1;
                boolean zM11529i = c5365c.m11529i(left, iM8619z, 0, 0);
                if (!zM11529i && c5365c.f33709a == 0 && c5365c.f33726r != null) {
                    c5365c.f33726r = null;
                }
                if (zM11529i) {
                    z11 = true;
                }
            } else if (c5365c.m11537q(view.getLeft(), iM8619z)) {
                z11 = true;
            }
        }
        if (!z11) {
            m8607E(i10);
            return;
        }
        m8607E(2);
        m8611I(i10, true);
        this.f14818A.m8624a(i10);
    }

    /* JADX INFO: renamed from: H */
    public final void m8610H() {
        V v10;
        int iM19273a;
        WeakReference<V> weakReference = this.f14838U;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        C10029b0.m18655k(v10, 524288);
        C10029b0.m18652h(v10, 0);
        C10029b0.m18655k(v10, 262144);
        C10029b0.m18652h(v10, 0);
        C10029b0.m18655k(v10, 1048576);
        C10029b0.m18652h(v10, 0);
        SparseIntArray sparseIntArray = this.f14849c0;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            C10029b0.m18655k(v10, i10);
            C10029b0.m18652h(v10, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f14846b && this.f14829L != 6) {
            String string = v10.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C7537c c7537c = new C7537c(this, 6);
            ArrayList arrayListM18650f = C10029b0.m18650f(v10);
            int i11 = 0;
            while (true) {
                if (i11 >= arrayListM18650f.size()) {
                    int i12 = 0;
                    int i13 = -1;
                    while (true) {
                        int[] iArr = C10029b0.f50996d;
                        if (i12 >= iArr.length || i13 != -1) {
                            break;
                        }
                        int i14 = iArr[i12];
                        boolean z10 = true;
                        for (int i15 = 0; i15 < arrayListM18650f.size(); i15++) {
                            z10 &= ((C10284f.a) arrayListM18650f.get(i15)).m19273a() != i14;
                        }
                        if (z10) {
                            i13 = i14;
                        }
                        i12++;
                    }
                    iM19273a = i13;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C10284f.a) arrayListM18650f.get(i11)).f51755a).getLabel())) {
                    iM19273a = ((C10284f.a) arrayListM18650f.get(i11)).m19273a();
                    break;
                }
                i11++;
            }
            if (iM19273a != -1) {
                C10284f.a aVar = new C10284f.a(null, iM19273a, string, c7537c, null);
                View.AccessibilityDelegate accessibilityDelegateM18648d = C10029b0.m18648d(v10);
                C10026a c10026a = accessibilityDelegateM18648d == null ? null : accessibilityDelegateM18648d instanceof C10026a.a ? ((C10026a.a) accessibilityDelegateM18648d).f50991a : new C10026a(accessibilityDelegateM18648d);
                if (c10026a == null) {
                    c10026a = new C10026a();
                }
                C10029b0.m18658n(v10, c10026a);
                C10029b0.m18655k(v10, aVar.m19273a());
                C10029b0.m18650f(v10).add(aVar);
                C10029b0.m18652h(v10, 0);
            }
            sparseIntArray.put(0, iM19273a);
        }
        if (this.f14826I && this.f14829L != 5) {
            C10029b0.m18656l(v10, C10284f.a.f51749l, new C7537c(this, 5));
        }
        int i16 = this.f14829L;
        if (i16 == 3) {
            C10029b0.m18656l(v10, C10284f.a.f51748k, new C7537c(this, this.f14846b ? 4 : 6));
            return;
        }
        if (i16 == 4) {
            C10029b0.m18656l(v10, C10284f.a.f51747j, new C7537c(this, this.f14846b ? 3 : 6));
        } else {
            if (i16 != 6) {
                return;
            }
            C10029b0.m18656l(v10, C10284f.a.f51748k, new C7537c(this, 4));
            C10029b0.m18656l(v10, C10284f.a.f51747j, new C7537c(this, 3));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m8611I(int i10, boolean z10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z11 = this.f14829L == 3 && (this.f14871x || m8618y() == 0);
        if (this.f14873z == z11 || this.f14856i == null) {
            return;
        }
        this.f14873z = z11;
        float f3 = 0.0f;
        if (z10 && (valueAnimator = this.f14819B) != null) {
            if (valueAnimator.isRunning()) {
                this.f14819B.reverse();
                return;
            }
            if (!z11) {
                f3 = 1.0f;
            }
            this.f14819B.setFloatValues(1.0f - f3, f3);
            this.f14819B.start();
            return;
        }
        ValueAnimator valueAnimator2 = this.f14819B;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f14819B.cancel();
        }
        C5768g c5768g = this.f14856i;
        if (!this.f14873z) {
            f3 = 1.0f;
        }
        c5768g.m12142n(f3);
    }

    /* JADX INFO: renamed from: J */
    public final void m8612J(boolean z10) {
        WeakReference<V> weakReference = this.f14838U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f14847b0 != null) {
                    return;
                } else {
                    this.f14847b0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f14838U.get() && z10) {
                    this.f14847b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (!z10) {
                this.f14847b0 = null;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m8613K() {
        V v10;
        if (this.f14838U != null) {
            m8614s();
            if (this.f14829L == 4 && (v10 = this.f14838U.get()) != null) {
                v10.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: c */
    public final void mo2937c(CoordinatorLayout.C0771f c0771f) {
        this.f14838U = null;
        this.f14830M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: f */
    public final void mo2940f() {
        this.f14838U = null;
        this.f14830M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: g */
    public final boolean mo2941g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        C5365c c5365c;
        if (!v10.isShown() || !this.f14828K) {
            this.f14831N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f14842Y = -1;
            VelocityTracker velocityTracker = this.f14841X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f14841X = null;
            }
        }
        if (this.f14841X == null) {
            this.f14841X = VelocityTracker.obtain();
        }
        this.f14841X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f14843Z = (int) motionEvent.getY();
            if (this.f14829L != 2) {
                WeakReference<View> weakReference = this.f14839V;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m2926j(view, x10, this.f14843Z)) {
                    this.f14842Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f14845a0 = true;
                }
            }
            this.f14831N = this.f14842Y == -1 && !coordinatorLayout.m2926j(v10, x10, this.f14843Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f14845a0 = false;
            this.f14842Y = -1;
            if (this.f14831N) {
                this.f14831N = false;
                return false;
            }
        }
        if (!this.f14831N && (c5365c = this.f14830M) != null && c5365c.m11538r(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f14839V;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f14831N || this.f14829L == 1 || coordinatorLayout.m2926j(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f14830M == null || Math.abs(((float) this.f14843Z) - motionEvent.getY()) <= ((float) this.f14830M.f33710b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: h */
    public final boolean mo2942h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.d.m18665b(coordinatorLayout) && !C10029b0.d.m18665b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        int i11 = 0;
        if (this.f14838U == null) {
            this.f14854g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i12 = Build.VERSION.SDK_INT;
            boolean z10 = (i12 < 29 || this.f14861n || this.f14853f) ? false : true;
            if (this.f14862o || this.f14863p || this.f14864q || this.f14866s || this.f14867t || this.f14868u || z10) {
                C10347n.m19361a(v10, new C7536b(this, z10));
            }
            C7541g c7541g = new C7541g(v10);
            if (i12 >= 30) {
                v10.setWindowInsetsAnimationCallback(new C10061r0.d.a(c7541g));
            } else {
                Object tag = v10.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener aVar = new C10061r0.c.a(v10, c7541g);
                v10.setTag(R.id.tag_window_insets_animation_callback, aVar);
                if (tag == null) {
                    v10.setOnApplyWindowInsetsListener(aVar);
                }
            }
            this.f14838U = new WeakReference<>(v10);
            C5768g c5768g = this.f14856i;
            if (c5768g != null) {
                C10029b0.d.m18680q(v10, c5768g);
                C5768g c5768g2 = this.f14856i;
                float fM18715i = this.f14825H;
                if (fM18715i == -1.0f) {
                    fM18715i = C10029b0.i.m18715i(v10);
                }
                c5768g2.m12140l(fM18715i);
            } else {
                ColorStateList colorStateList = this.f14857j;
                if (colorStateList != null) {
                    C10029b0.i.m18723q(v10, colorStateList);
                }
            }
            m8610H();
            if (C10029b0.d.m18666c(v10) == 0) {
                C10029b0.d.m18682s(v10, 1);
            }
        }
        if (this.f14830M == null) {
            this.f14830M = new C5365c(coordinatorLayout.getContext(), coordinatorLayout, this.f14851d0);
        }
        int top = v10.getTop();
        coordinatorLayout.m2928q(v10, i10);
        this.f14836S = coordinatorLayout.getWidth();
        this.f14837T = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.f14835R = height;
        int i13 = this.f14837T;
        int i14 = i13 - height;
        int i15 = this.f14870w;
        if (i14 < i15) {
            if (this.f14865r) {
                this.f14835R = i13;
            } else {
                this.f14835R = i13 - i15;
            }
        }
        this.f14821D = Math.max(0, i13 - this.f14835R);
        this.f14822E = (int) ((1.0f - this.f14823F) * this.f14837T);
        m8614s();
        int i16 = this.f14829L;
        if (i16 == 3) {
            v10.offsetTopAndBottom(m8618y());
        } else if (i16 == 6) {
            v10.offsetTopAndBottom(this.f14822E);
        } else if (this.f14826I && i16 == 5) {
            v10.offsetTopAndBottom(this.f14837T);
        } else if (i16 == 4) {
            v10.offsetTopAndBottom(this.f14824G);
        } else if (i16 == 1 || i16 == 2) {
            v10.offsetTopAndBottom(top - v10.getTop());
        }
        m8611I(this.f14829L, false);
        this.f14839V = new WeakReference<>(m8601v(v10));
        while (true) {
            ArrayList<AbstractC2962c> arrayList = this.f14840W;
            if (i11 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i11).mo8621a(v10);
            i11++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: i */
    public final boolean mo2943i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m8617x(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f14858k, marginLayoutParams.width), m8617x(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f14859l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: j */
    public final boolean mo2944j(View view) {
        WeakReference<View> weakReference = this.f14839V;
        if (weakReference != null && view == weakReference.get()) {
            if (this.f14829L != 3) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: k */
    public final void mo2945k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f14839V;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v10.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < m8618y()) {
                int iM8618y = top - m8618y();
                iArr[1] = iM8618y;
                int i14 = -iM8618y;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                v10.offsetTopAndBottom(i14);
                m8607E(3);
            } else {
                if (!this.f14828K) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                v10.offsetTopAndBottom(-i11);
                m8607E(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i15 = this.f14824G;
            if (i13 > i15 && !this.f14826I) {
                int i16 = top - i15;
                iArr[1] = i16;
                int i17 = -i16;
                WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
                v10.offsetTopAndBottom(i17);
                m8607E(4);
            } else {
                if (!this.f14828K) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap<View, C10049l0> weakHashMap4 = C10029b0.f50993a;
                v10.offsetTopAndBottom(-i11);
                m8607E(1);
            }
        }
        m8616u(v10.getTop());
        this.f14832O = i11;
        this.f14833P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: l */
    public final void mo2946l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: n */
    public final void mo2948n(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i10 = this.f14844a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f14852e = savedState.f14875d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f14846b = savedState.f14876e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f14826I = savedState.f14877f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f14827J = savedState.f14878g;
            }
        }
        int i11 = savedState.f14874c;
        if (i11 == 1 || i11 == 2) {
            this.f14829L = 4;
        } else {
            this.f14829L = i11;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: o */
    public final Parcelable mo2949o(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: p */
    public final boolean mo2950p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.f14832O = 0;
        this.f14833P = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (java.lang.Math.abs(r6 - r5.f14821D) < java.lang.Math.abs(r6 - r5.f14824G)) goto L55;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2951q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        int top;
        int top2;
        int i11;
        float yVelocity;
        int i12 = 3;
        if (v10.getTop() == m8618y()) {
            m8607E(3);
            return;
        }
        WeakReference<View> weakReference = this.f14839V;
        if (weakReference != null && view == weakReference.get() && this.f14833P) {
            if (this.f14832O > 0) {
                if (!this.f14846b && v10.getTop() > this.f14822E) {
                    i12 = 6;
                }
            } else if (this.f14826I) {
                VelocityTracker velocityTracker = this.f14841X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f14848c);
                    yVelocity = this.f14841X.getYVelocity(this.f14842Y);
                }
                if (m8608F(v10, yVelocity)) {
                    i12 = 5;
                } else if (this.f14832O == 0) {
                    top2 = v10.getTop();
                    if (this.f14846b) {
                        i11 = this.f14822E;
                        if (top2 < i11) {
                            if (Math.abs(top2 - i11) < Math.abs(top2 - this.f14824G)) {
                                i12 = 6;
                            }
                            i12 = 4;
                        } else if (top2 < Math.abs(top2 - this.f14824G)) {
                            i12 = 6;
                        }
                    }
                } else {
                    if (this.f14846b) {
                        top = v10.getTop();
                        if (Math.abs(top - this.f14822E) < Math.abs(top - this.f14824G)) {
                            i12 = 6;
                        }
                    }
                    i12 = 4;
                }
            } else if (this.f14832O == 0) {
                top2 = v10.getTop();
                if (this.f14846b) {
                    i11 = this.f14822E;
                    if (top2 < i11) {
                        if (Math.abs(top2 - i11) < Math.abs(top2 - this.f14824G)) {
                            i12 = 6;
                        }
                        i12 = 4;
                    } else if (top2 < Math.abs(top2 - this.f14824G)) {
                        i12 = 6;
                    }
                }
            } else {
                if (this.f14846b) {
                    top = v10.getTop();
                    if (Math.abs(top - this.f14822E) < Math.abs(top - this.f14824G)) {
                        i12 = 6;
                    }
                }
                i12 = 4;
            }
            m8609G(v10, i12, false);
            this.f14833P = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: r */
    public final boolean mo2952r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f14829L;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        C5365c c5365c = this.f14830M;
        if (c5365c != null && (this.f14828K || i10 == 1)) {
            c5365c.m11531k(motionEvent);
        }
        if (actionMasked == 0) {
            this.f14842Y = -1;
            VelocityTracker velocityTracker = this.f14841X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f14841X = null;
            }
        }
        if (this.f14841X == null) {
            this.f14841X = VelocityTracker.obtain();
        }
        this.f14841X.addMovement(motionEvent);
        if (this.f14830M != null && (this.f14828K || this.f14829L == 1)) {
            z10 = true;
        }
        if (z10 && actionMasked == 2 && !this.f14831N) {
            float fAbs = Math.abs(this.f14843Z - motionEvent.getY());
            C5365c c5365c2 = this.f14830M;
            if (fAbs > c5365c2.f33710b) {
                c5365c2.m11522b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f14831N;
    }

    /* JADX INFO: renamed from: s */
    public final void m8614s() {
        int iM8615t = m8615t();
        if (this.f14846b) {
            this.f14824G = Math.max(this.f14837T - iM8615t, this.f14821D);
        } else {
            this.f14824G = this.f14837T - iM8615t;
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m8615t() {
        int i10;
        if (this.f14853f) {
            return Math.min(Math.max(this.f14854g, this.f14837T - ((this.f14836S * 9) / 16)), this.f14835R) + this.f14869v;
        }
        return (this.f14861n || this.f14862o || (i10 = this.f14860m) <= 0) ? this.f14852e + this.f14869v : Math.max(this.f14852e, i10 + this.f14855h);
    }

    /* JADX INFO: renamed from: u */
    public final void m8616u(int i10) {
        V v10 = this.f14838U.get();
        if (v10 != null) {
            ArrayList<AbstractC2962c> arrayList = this.f14840W;
            if (!arrayList.isEmpty()) {
                int i11 = this.f14824G;
                if (i10 <= i11 && i11 != m8618y()) {
                    m8618y();
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    arrayList.get(i12).mo8622b(v10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m8617x(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: y */
    public final int m8618y() {
        if (this.f14846b) {
            return this.f14821D;
        }
        return Math.max(this.f14820C, this.f14865r ? 0 : this.f14870w);
    }

    /* JADX INFO: renamed from: z */
    public final int m8619z(int i10) {
        if (i10 == 3) {
            return m8618y();
        }
        if (i10 == 4) {
            return this.f14824G;
        }
        if (i10 == 5) {
            return this.f14837T;
        }
        if (i10 == 6) {
            return this.f14822E;
        }
        throw new IllegalArgumentException(C0166e.m761g("Invalid state to get top offset: ", i10));
    }
}
