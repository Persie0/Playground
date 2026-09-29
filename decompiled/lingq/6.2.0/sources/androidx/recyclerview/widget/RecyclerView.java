package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.recyclerview.R$attr;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.R$styleable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000.C3386nv;
import p000.C3451p8;
import p000.C3488q8;
import p000.a38;
import p000.a72;
import p000.ata;
import p000.b38;
import p000.c38;
import p000.ck6;
import p000.d38;
import p000.dta;
import p000.e38;
import p000.f38;
import p000.fd5;
import p000.fqb;
import p000.fta;
import p000.g38;
import p000.gg2;
import p000.gzc;
import p000.h38;
import p000.hh7;
import p000.ij6;
import p000.k38;
import p000.l38;
import p000.l79;
import p000.m28;
import p000.m38;
import p000.n28;
import p000.n38;
import p000.o28;
import p000.o38;
import p000.p28;
import p000.pj3;
import p000.q38;
import p000.qfa;
import p000.qta;
import p000.rj6;
import p000.s01;
import p000.sad;
import p000.sj6;
import p000.t28;
import p000.tbd;
import p000.tk5;
import p000.u28;
import p000.u8a;
import p000.uk9;
import p000.ux5;
import p000.uz2;
import p000.v28;
import p000.v63;
import p000.vz1;
import p000.w28;
import p000.wa4;
import p000.xp7;
import p000.y28;
import p000.ysa;
import p000.z28;
import p000.zj3;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements rj6 {

    /* JADX INFO: renamed from: X0 */
    public static boolean f6595X0 = false;

    /* JADX INFO: renamed from: Y0 */
    public static boolean f6596Y0 = false;

    /* JADX INFO: renamed from: Z0 */
    public static final int[] f6597Z0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: a1 */
    public static final float f6598a1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: b1 */
    public static final boolean f6599b1 = true;

    /* JADX INFO: renamed from: c1 */
    public static final boolean f6600c1 = true;

    /* JADX INFO: renamed from: d1 */
    public static final Class[] f6601d1;

    /* JADX INFO: renamed from: e1 */
    public static final wa4 f6602e1;

    /* JADX INFO: renamed from: f1 */
    public static final l38 f6603f1;

    /* JADX INFO: renamed from: A0 */
    public zj3 f6604A0;

    /* JADX INFO: renamed from: B0 */
    public final pj3 f6605B0;

    /* JADX INFO: renamed from: C0 */
    public final k38 f6606C0;

    /* JADX INFO: renamed from: D0 */
    public d38 f6607D0;

    /* JADX INFO: renamed from: E0 */
    public ArrayList f6608E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f6609F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f6610G0;

    /* JADX INFO: renamed from: H */
    public p28 f6611H;

    /* JADX INFO: renamed from: H0 */
    public final o28 f6612H0;

    /* JADX INFO: renamed from: I */
    public y28 f6613I;

    /* JADX INFO: renamed from: I0 */
    public boolean f6614I0;

    /* JADX INFO: renamed from: J */
    public final ArrayList f6615J;

    /* JADX INFO: renamed from: J0 */
    public q38 f6616J0;

    /* JADX INFO: renamed from: K */
    public final ArrayList f6617K;

    /* JADX INFO: renamed from: K0 */
    public final int[] f6618K0;

    /* JADX INFO: renamed from: L */
    public final ArrayList f6619L;

    /* JADX INFO: renamed from: L0 */
    public sj6 f6620L0;

    /* JADX INFO: renamed from: M */
    public c38 f6621M;

    /* JADX INFO: renamed from: M0 */
    public final int[] f6622M0;

    /* JADX INFO: renamed from: N */
    public boolean f6623N;

    /* JADX INFO: renamed from: N0 */
    public final int[] f6624N0;

    /* JADX INFO: renamed from: O */
    public boolean f6625O;

    /* JADX INFO: renamed from: O0 */
    public final int[] f6626O0;

    /* JADX INFO: renamed from: P */
    public boolean f6627P;

    /* JADX INFO: renamed from: P0 */
    public final ArrayList f6628P0;

    /* JADX INFO: renamed from: Q */
    public int f6629Q;

    /* JADX INFO: renamed from: Q0 */
    public final m28 f6630Q0;

    /* JADX INFO: renamed from: R */
    public boolean f6631R;

    /* JADX INFO: renamed from: R0 */
    public boolean f6632R0;

    /* JADX INFO: renamed from: S */
    public boolean f6633S;

    /* JADX INFO: renamed from: S0 */
    public int f6634S0;

    /* JADX INFO: renamed from: T */
    public boolean f6635T;

    /* JADX INFO: renamed from: T0 */
    public int f6636T0;

    /* JADX INFO: renamed from: U */
    public int f6637U;

    /* JADX INFO: renamed from: U0 */
    public final boolean f6638U0;

    /* JADX INFO: renamed from: V */
    public boolean f6639V;

    /* JADX INFO: renamed from: V0 */
    public final n28 f6640V0;

    /* JADX INFO: renamed from: W */
    public final AccessibilityManager f6641W;

    /* JADX INFO: renamed from: W0 */
    public final gg2 f6642W0;

    /* JADX INFO: renamed from: a */
    public final float f6643a;

    /* JADX INFO: renamed from: a0 */
    public ArrayList f6644a0;

    /* JADX INFO: renamed from: b */
    public final C0726b f6645b;

    /* JADX INFO: renamed from: b0 */
    public boolean f6646b0;

    /* JADX INFO: renamed from: c */
    public final g38 f6647c;

    /* JADX INFO: renamed from: c0 */
    public boolean f6648c0;

    /* JADX INFO: renamed from: d */
    public SavedState f6649d;

    /* JADX INFO: renamed from: d0 */
    public int f6650d0;

    /* JADX INFO: renamed from: e */
    public final C3488q8 f6651e;

    /* JADX INFO: renamed from: e0 */
    public int f6652e0;

    /* JADX INFO: renamed from: f */
    public final u8a f6653f;

    /* JADX INFO: renamed from: f0 */
    public u28 f6654f0;

    /* JADX INFO: renamed from: g */
    public final qfa f6655g;

    /* JADX INFO: renamed from: g0 */
    public EdgeEffect f6656g0;

    /* JADX INFO: renamed from: h */
    public boolean f6657h;

    /* JADX INFO: renamed from: h0 */
    public EdgeEffect f6658h0;

    /* JADX INFO: renamed from: i */
    public final m28 f6659i;

    /* JADX INFO: renamed from: i0 */
    public EdgeEffect f6660i0;

    /* JADX INFO: renamed from: j */
    public final Rect f6661j;

    /* JADX INFO: renamed from: j0 */
    public EdgeEffect f6662j0;

    /* JADX INFO: renamed from: k */
    public final Rect f6663k;

    /* JADX INFO: renamed from: k0 */
    public v28 f6664k0;

    /* JADX INFO: renamed from: l */
    public final RectF f6665l;

    /* JADX INFO: renamed from: l0 */
    public int f6666l0;

    /* JADX INFO: renamed from: m0 */
    public int f6667m0;

    /* JADX INFO: renamed from: n0 */
    public VelocityTracker f6668n0;

    /* JADX INFO: renamed from: o0 */
    public int f6669o0;

    /* JADX INFO: renamed from: p0 */
    public int f6670p0;

    /* JADX INFO: renamed from: q0 */
    public int f6671q0;

    /* JADX INFO: renamed from: r0 */
    public int f6672r0;

    /* JADX INFO: renamed from: s0 */
    public int f6673s0;

    /* JADX INFO: renamed from: t0 */
    public b38 f6674t0;

    /* JADX INFO: renamed from: u0 */
    public final int f6675u0;

    /* JADX INFO: renamed from: v0 */
    public final int f6676v0;

    /* JADX INFO: renamed from: w0 */
    public final float f6677w0;

    /* JADX INFO: renamed from: x0 */
    public final float f6678x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f6679y0;

    /* JADX INFO: renamed from: z0 */
    public final n38 f6680z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0727c();

        /* JADX INFO: renamed from: c */
        public Parcelable f6681c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6681c = parcel.readParcelable(classLoader == null ? y28.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f6681c, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f6601d1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f6602e1 = new wa4(2);
        f6603f1 = new l38();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.f6645b = new C0726b(this);
        this.f6647c = new g38(this);
        this.f6655g = new qfa(2);
        this.f6659i = new m28(this, 0);
        this.f6661j = new Rect();
        this.f6663k = new Rect();
        this.f6665l = new RectF();
        this.f6615J = new ArrayList();
        this.f6617K = new ArrayList();
        this.f6619L = new ArrayList();
        this.f6629Q = 0;
        this.f6646b0 = false;
        this.f6648c0 = false;
        this.f6650d0 = 0;
        this.f6652e0 = 0;
        this.f6654f0 = f6603f1;
        a72 a72Var = new a72();
        a72Var.f64742a = null;
        a72Var.f64743b = new ArrayList();
        a72Var.f64744c = 120L;
        a72Var.f64745d = 120L;
        a72Var.f64746e = 250L;
        a72Var.f64747f = 250L;
        int i2 = 1;
        a72Var.f306g = true;
        a72Var.f307h = new ArrayList();
        a72Var.f308i = new ArrayList();
        a72Var.f309j = new ArrayList();
        a72Var.f310k = new ArrayList();
        a72Var.f311l = new ArrayList();
        a72Var.f312m = new ArrayList();
        a72Var.f313n = new ArrayList();
        a72Var.f314o = new ArrayList();
        a72Var.f315p = new ArrayList();
        a72Var.f316q = new ArrayList();
        a72Var.f317r = new ArrayList();
        this.f6664k0 = a72Var;
        this.f6666l0 = 0;
        this.f6667m0 = -1;
        this.f6677w0 = Float.MIN_VALUE;
        this.f6678x0 = Float.MIN_VALUE;
        this.f6679y0 = true;
        this.f6680z0 = new n38(this);
        this.f6605B0 = f6600c1 ? new pj3(i2) : null;
        k38 k38Var = new k38();
        k38Var.f46627a = -1;
        k38Var.f46628b = 0;
        k38Var.f46629c = 0;
        k38Var.f46630d = 1;
        k38Var.f46631e = 0;
        k38Var.f46632f = false;
        k38Var.f46633g = false;
        k38Var.f46634h = false;
        k38Var.f46635i = false;
        k38Var.f46636j = false;
        k38Var.f46637k = false;
        this.f6606C0 = k38Var;
        this.f6609F0 = false;
        this.f6610G0 = false;
        o28 o28Var = new o28(this);
        this.f6612H0 = o28Var;
        this.f6614I0 = false;
        this.f6618K0 = new int[2];
        this.f6622M0 = new int[2];
        this.f6624N0 = new int[2];
        this.f6626O0 = new int[2];
        this.f6628P0 = new ArrayList();
        this.f6630Q0 = new m28(this, i2);
        this.f6634S0 = 0;
        this.f6636T0 = 0;
        this.f6640V0 = new n28(this);
        this.f6642W0 = new gg2(getContext(), new o28(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6673s0 = viewConfiguration.getScaledTouchSlop();
        this.f6677w0 = sad.m21188a(viewConfiguration);
        this.f6678x0 = sad.m21189b(viewConfiguration);
        this.f6675u0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6676v0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6643a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f6664k0.f64742a = o28Var;
        this.f6651e = new C3488q8(new ck6(this, 25));
        this.f6653f = new u8a(new n28(this));
        WeakHashMap weakHashMap = dta.f36217a;
        if (ysa.m25308a(this) == 0) {
            ysa.m25309b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f6641W = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new q38(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i, 0);
        ata.m3035b(this, context, R$styleable.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(R$styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f6657h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerView_android_clipToPadding, true);
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                C3386nv.m17626m("Trying to set fast scroller without both required drawables.".concat(m2710C()));
                throw null;
            }
            Resources resources = getContext().getResources();
            typedArray = typedArrayObtainStyledAttributes;
            new uz2(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R$dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R$dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R$dimen.fastscroll_margin));
        } else {
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        this.f6638U0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(y28.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f6601d1);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((y28) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    ij6.m13950g(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    ij6.m13950g(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    ij6.m13950g(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    ij6.m13950g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    ij6.m13950g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr = f6597Z0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ata.m3035b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(hh7.f42376b, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: H */
    public static RecyclerView m2698H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM2698H = m2698H(viewGroup.getChildAt(i));
            if (recyclerViewM2698H != null) {
                return recyclerViewM2698H;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public static o38 m2699N(View view) {
        if (view == null) {
            return null;
        }
        return ((z28) view.getLayoutParams()).f70799a;
    }

    private sj6 getScrollingChildHelper() {
        if (this.f6620L0 == null) {
            this.f6620L0 = new sj6(this);
        }
        return this.f6620L0;
    }

    /* JADX INFO: renamed from: l */
    public static void m2706l(o38 o38Var) {
        WeakReference weakReference = o38Var.f53782b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == o38Var.f53781a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            o38Var.f53782b = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m2707o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && tbd.m21943a(edgeEffect) != 0.0f) {
            int iRound = Math.round(tbd.m21945c(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || tbd.m21943a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(tbd.m21945c(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f6595X0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f6596Y0 = z;
    }

    /* JADX INFO: renamed from: A */
    public final void m2708A() {
        if (this.f6660i0 != null) {
            return;
        }
        EdgeEffect edgeEffectMo15775a = this.f6654f0.mo15775a(this);
        this.f6660i0 = edgeEffectMo15775a;
        if (this.f6657h) {
            edgeEffectMo15775a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo15775a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m2709B() {
        if (this.f6658h0 != null) {
            return;
        }
        EdgeEffect edgeEffectMo15775a = this.f6654f0.mo15775a(this);
        this.f6658h0 = edgeEffectMo15775a;
        if (this.f6657h) {
            edgeEffectMo15775a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo15775a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: C */
    public final String m2710C() {
        return " " + super.toString() + ", adapter:" + this.f6611H + ", layout:" + this.f6613I + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: D */
    public final void m2711D(k38 k38Var) {
        if (getScrollState() != 2) {
            k38Var.getClass();
            return;
        }
        OverScroller overScroller = this.f6680z0.f52291c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        k38Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: E */
    public final View m2712E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m2713F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f6619L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c38 c38Var = (c38) arrayList.get(i);
            if (c38Var.mo4302d(motionEvent) && action != 3) {
                this.f6621M = c38Var;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final void m2714G(int[] iArr) {
        u8a u8aVar = this.f6653f;
        int iM22544e = u8aVar.m22544e();
        if (iM22544e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM22544e; i3++) {
            o38 o38VarM2699N = m2699N(u8aVar.m22543d(i3));
            if (!o38VarM2699N.m17797q()) {
                int iM17784d = o38VarM2699N.m17784d();
                if (iM17784d < i) {
                    i = iM17784d;
                }
                if (iM17784d > i2) {
                    i2 = iM17784d;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: I */
    public final o38 m2715I(int i) {
        o38 o38Var = null;
        if (this.f6646b0) {
            return null;
        }
        u8a u8aVar = this.f6653f;
        int iM22549j = u8aVar.m22549j();
        for (int i2 = 0; i2 < iM22549j; i2++) {
            o38 o38VarM2699N = m2699N(u8aVar.m22548i(i2));
            if (o38VarM2699N != null && !o38VarM2699N.m17790j() && m2717K(o38VarM2699N) == i) {
                if (!((ArrayList) u8aVar.f63596e).contains(o38VarM2699N.f53781a)) {
                    return o38VarM2699N;
                }
                o38Var = o38VarM2699N;
            }
        }
        return o38Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX INFO: renamed from: J */
    public final boolean m2716J(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        y28 y28Var = this.f6613I;
        if (y28Var == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.f6633S) {
            boolean zMo2679d = y28Var.mo2679d();
            boolean zMo2680e = this.f6613I.mo2680e();
            if (!zMo2679d || Math.abs(i) < i3) {
                i = 0;
            }
            if (!zMo2680e || Math.abs(i2) < i3) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.f6656g0;
                    if (edgeEffect == null || tbd.m21943a(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.f6660i0;
                        if (edgeEffect2 == null || tbd.m21943a(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (m2744j0(this.f6660i0, i, getWidth())) {
                            this.f6660i0.onAbsorb(i);
                            i = 0;
                        }
                    } else {
                        int i6 = -i;
                        if (m2744j0(this.f6656g0, i6, getWidth())) {
                            this.f6656g0.onAbsorb(i6);
                            i = 0;
                        }
                    }
                    iMax = i;
                    i = 0;
                }
                if (i2 == 0) {
                    i5 = i2;
                    i2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.f6658h0;
                    if (edgeEffect3 == null || tbd.m21943a(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.f6662j0;
                        if (edgeEffect4 == null || tbd.m21943a(edgeEffect4) == 0.0f) {
                            i5 = i2;
                            i2 = 0;
                        } else if (m2744j0(this.f6662j0, i2, getHeight())) {
                            this.f6662j0.onAbsorb(i2);
                            i2 = 0;
                        }
                    } else {
                        int i7 = -i2;
                        if (m2744j0(this.f6658h0, i7, getHeight())) {
                            this.f6658h0.onAbsorb(i7);
                            i2 = 0;
                        }
                    }
                    i5 = 0;
                }
                n38 n38Var = this.f6680z0;
                if (iMax != 0 || i2 != 0) {
                    int i8 = -i4;
                    iMax = Math.max(i8, Math.min(iMax, i4));
                    i2 = Math.max(i8, Math.min(i2, i4));
                    m2751n0(1);
                    n38Var.m17199a(iMax, i2);
                }
                if (i != 0 || i5 != 0) {
                    float f = i;
                    float f2 = i5;
                    if (!dispatchNestedPreFling(f, f2)) {
                        boolean z = zMo2679d || zMo2680e;
                        dispatchNestedFling(f, f2, z);
                        b38 b38Var = this.f6674t0;
                        if (b38Var == null || !b38Var.mo3269a(i, i5)) {
                            if (z) {
                                m2751n0(1);
                                int i9 = -i4;
                                n38Var.m17199a(Math.max(i9, Math.min(i, i4)), Math.max(i9, Math.min(i5, i4)));
                                return true;
                            }
                        }
                        return true;
                    }
                } else if (iMax != 0 || i2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final int m2717K(o38 o38Var) {
        if ((o38Var.f53790j & 524) == 0 && o38Var.m17787g()) {
            int i = o38Var.f53783c;
            ArrayList arrayList = (ArrayList) this.f6651e.f57370d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3451p8 c3451p8 = (C3451p8) arrayList.get(i2);
                int i3 = c3451p8.f55717a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = c3451p8.f55718b;
                        if (i4 <= i) {
                            int i5 = c3451p8.f55719c;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = c3451p8.f55718b;
                        if (i6 == i) {
                            i = c3451p8.f55719c;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (c3451p8.f55719c <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c3451p8.f55718b <= i) {
                    i += c3451p8.f55719c;
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: L */
    public final long m2718L(o38 o38Var) {
        return this.f6611H.f55487b ? o38Var.f53785e : o38Var.f53783c;
    }

    /* JADX INFO: renamed from: M */
    public final o38 m2719M(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m2699N(view);
        }
        uk9.m22776j("View ", view, " is not a direct child of ", this);
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final Rect m2720O(View view) {
        z28 z28Var = (z28) view.getLayoutParams();
        boolean z = z28Var.f70801c;
        Rect rect = z28Var.f70800b;
        if (z) {
            k38 k38Var = this.f6606C0;
            if (!k38Var.f46633g || (!z28Var.f70799a.m17793m() && !z28Var.f70799a.m17788h())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f6617K;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.f6661j;
                    rect2.set(0, 0, 0, 0);
                    ((w28) arrayList.get(i)).mo17638f(rect2, view, this, k38Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                z28Var.f70801c = false;
                return rect;
            }
        }
        return rect;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m2721P() {
        return !this.f6627P || this.f6646b0 || this.f6651e.m19755x();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m2722Q() {
        return this.f6650d0 > 0;
    }

    /* JADX INFO: renamed from: R */
    public final void m2723R(int i) {
        if (this.f6613I == null) {
            return;
        }
        setScrollState(2);
        this.f6613I.mo2697w0(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: S */
    public final void m2724S() {
        u8a u8aVar = this.f6653f;
        int iM22549j = u8aVar.m22549j();
        for (int i = 0; i < iM22549j; i++) {
            ((z28) u8aVar.m22548i(i).getLayoutParams()).f70801c = true;
        }
        ArrayList arrayList = this.f6647c.f40125c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            z28 z28Var = (z28) ((o38) arrayList.get(i2)).f53781a.getLayoutParams();
            if (z28Var != null) {
                z28Var.f70801c = true;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m2725T(int i, int i2, boolean z) {
        int i3 = i + i2;
        u8a u8aVar = this.f6653f;
        int iM22549j = u8aVar.m22549j();
        for (int i4 = 0; i4 < iM22549j; i4++) {
            o38 o38VarM2699N = m2699N(u8aVar.m22548i(i4));
            if (o38VarM2699N != null && !o38VarM2699N.m17797q()) {
                int i5 = o38VarM2699N.f53783c;
                k38 k38Var = this.f6606C0;
                if (i5 >= i3) {
                    if (f6596Y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + o38VarM2699N + " now at position " + (o38VarM2699N.f53783c - i2));
                    }
                    o38VarM2699N.m17794n(-i2, z);
                    k38Var.f46632f = true;
                } else if (i5 >= i) {
                    if (f6596Y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + o38VarM2699N + " now REMOVED");
                    }
                    o38VarM2699N.m17781a(8);
                    o38VarM2699N.m17794n(-i2, z);
                    o38VarM2699N.f53783c = i - 1;
                    k38Var.f46632f = true;
                }
            }
        }
        g38 g38Var = this.f6647c;
        ArrayList arrayList = g38Var.f40125c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o38 o38Var = (o38) arrayList.get(size);
            if (o38Var != null) {
                int i6 = o38Var.f53783c;
                if (i6 >= i3) {
                    if (f6596Y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + o38Var + " now at position " + (o38Var.f53783c - i2));
                    }
                    o38Var.m17794n(-i2, z);
                } else if (i6 >= i) {
                    o38Var.m17781a(8);
                    g38Var.m12336h(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: U */
    public final void m2726U() {
        this.f6650d0++;
    }

    /* JADX INFO: renamed from: V */
    public final void m2727V(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f6650d0 - 1;
        this.f6650d0 = i2;
        if (i2 < 1) {
            if (f6595X0 && i2 < 0) {
                C3386nv.m17633t("layout or scroll counter cannot go below zero.Some calls are not matching".concat(m2710C()));
                return;
            }
            this.f6650d0 = 0;
            if (z) {
                int i3 = this.f6637U;
                this.f6637U = 0;
                if (i3 != 0 && (accessibilityManager = this.f6641W) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    gzc.m12985d(accessibilityEventObtain, i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f6628P0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    o38 o38Var = (o38) arrayList.get(size);
                    if (o38Var.f53781a.getParent() == this && !o38Var.m17797q() && (i = o38Var.f53797q) != -1) {
                        o38Var.f53781a.setImportantForAccessibility(i);
                        o38Var.f53797q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m2728W(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6667m0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f6667m0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f6671q0 = x;
            this.f6669o0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f6672r0 = y;
            this.f6670p0 = y;
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m2729X() {
        if (this.f6614I0 || !this.f6623N) {
            return;
        }
        WeakHashMap weakHashMap = dta.f36217a;
        postOnAnimation(this.f6630Q0);
        this.f6614I0 = true;
    }

    /* JADX INFO: renamed from: Y */
    public final void m2730Y() {
        boolean z;
        boolean z2 = this.f6646b0;
        C3488q8 c3488q8 = this.f6651e;
        boolean z3 = false;
        if (z2) {
            c3488q8.m19723I((ArrayList) c3488q8.f57370d);
            c3488q8.m19723I((ArrayList) c3488q8.f57371e);
            c3488q8.f57368b = 0;
            if (this.f6648c0) {
                this.f6613I.mo2621d0();
            }
        }
        if (this.f6664k0 != null && this.f6613I.mo2613I0()) {
            c3488q8.m19721G();
        } else {
            c3488q8.m19747o();
        }
        boolean z4 = this.f6609F0 || this.f6610G0;
        boolean z5 = this.f6627P && this.f6664k0 != null && ((z = this.f6646b0) || z4 || this.f6613I.f69176f) && (!z || this.f6611H.f55487b);
        k38 k38Var = this.f6606C0;
        k38Var.f46636j = z5;
        if (z5 && z4 && !this.f6646b0 && this.f6664k0 != null && this.f6613I.mo2613I0()) {
            z3 = true;
        }
        k38Var.f46637k = z3;
    }

    /* JADX INFO: renamed from: Z */
    public final void m2731Z(boolean z) {
        this.f6648c0 = z | this.f6648c0;
        this.f6646b0 = true;
        u8a u8aVar = this.f6653f;
        int iM22549j = u8aVar.m22549j();
        for (int i = 0; i < iM22549j; i++) {
            o38 o38VarM2699N = m2699N(u8aVar.m22548i(i));
            if (o38VarM2699N != null && !o38VarM2699N.m17797q()) {
                o38VarM2699N.m17781a(6);
            }
        }
        m2724S();
        g38 g38Var = this.f6647c;
        ArrayList arrayList = g38Var.f40125c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o38 o38Var = (o38) arrayList.get(i2);
            if (o38Var != null) {
                o38Var.m17781a(6);
                o38Var.m17781a(1024);
            }
        }
        p28 p28Var = g38Var.f40130h.f6611H;
        if (p28Var == null || !p28Var.f55487b) {
            g38Var.m12335g();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2732a0(o38 o38Var, xp7 xp7Var) {
        o38Var.f53790j &= -8193;
        boolean z = this.f6606C0.f46634h;
        qfa qfaVar = this.f6655g;
        if (z && o38Var.m17793m() && !o38Var.m17790j() && !o38Var.m17797q()) {
            ((tk5) qfaVar.f57706b).m22180f(o38Var, m2718L(o38Var));
        }
        l79 l79Var = (l79) qfaVar.f57705a;
        qta qtaVarM20161a = (qta) l79Var.get(o38Var);
        if (qtaVarM20161a == null) {
            qtaVarM20161a = qta.m20161a();
            l79Var.put(o38Var, qtaVarM20161a);
        }
        qtaVarM20161a.f58201b = xp7Var;
        qtaVarM20161a.f58200a |= 4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        y28 y28Var = this.f6613I;
        if (y28Var != null) {
            y28Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m2733b0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f6656g0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f6656g0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f6658h0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f6658h0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f6660i0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f6660i0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f6662j0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f6662j0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final int m2734c0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f6656g0;
        float f2 = 0.0f;
        if (edgeEffect == null || tbd.m21943a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f6660i0;
            if (edgeEffect2 != null && tbd.m21943a(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.f6660i0;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fM21945c = tbd.m21945c(edgeEffect3, width, height);
                    if (tbd.m21943a(this.f6660i0) == 0.0f) {
                        this.f6660i0.onRelease();
                    }
                    f2 = fM21945c;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.f6656g0;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -tbd.m21945c(edgeEffect4, -width, 1.0f - height);
                if (tbd.m21943a(this.f6656g0) == 0.0f) {
                    this.f6656g0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof z28) && this.f6613I.mo2625f((z28) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        y28 y28Var = this.f6613I;
        if (y28Var != null && y28Var.mo2679d()) {
            return this.f6613I.mo2687j(this.f6606C0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        y28 y28Var = this.f6613I;
        if (y28Var != null && y28Var.mo2679d()) {
            return this.f6613I.mo2630k(this.f6606C0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        y28 y28Var = this.f6613I;
        if (y28Var != null && y28Var.mo2679d()) {
            return this.f6613I.mo2631l(this.f6606C0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        y28 y28Var = this.f6613I;
        if (y28Var != null && y28Var.mo2680e()) {
            return this.f6613I.mo2692m(this.f6606C0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        y28 y28Var = this.f6613I;
        if (y28Var != null && y28Var.mo2680e()) {
            return this.f6613I.mo2634n(this.f6606C0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        y28 y28Var = this.f6613I;
        if (y28Var != null && y28Var.mo2680e()) {
            return this.f6613I.mo2635o(this.f6606C0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final int m2735d0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f6658h0;
        float f2 = 0.0f;
        if (edgeEffect == null || tbd.m21943a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f6662j0;
            if (edgeEffect2 != null && tbd.m21943a(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.f6662j0;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fM21945c = tbd.m21945c(edgeEffect3, height, 1.0f - width);
                    if (tbd.m21943a(this.f6662j0) == 0.0f) {
                        this.f6662j0.onRelease();
                    }
                    f2 = fM21945c;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.f6658h0;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -tbd.m21945c(edgeEffect4, -height, width);
                if (tbd.m21943a(this.f6658h0) == 0.0f) {
                    this.f6658h0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        y28 layoutManager = getLayoutManager();
        int iMo6133a = 0;
        if (layoutManager != null) {
            if (layoutManager.mo2680e()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m2746k0(0, measuredHeight, false);
                        return true;
                    }
                    m2746k0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zMo2661P = layoutManager.mo2661P();
                    if (keyCode == 122) {
                        if (zMo2661P) {
                            iMo6133a = getAdapter().mo6133a();
                        }
                    } else if (!zMo2661P) {
                        iMo6133a = getAdapter().mo6133a();
                    }
                    m2747l0(iMo6133a);
                    return true;
                }
            } else if (layoutManager.mo2679d()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m2746k0(measuredWidth, 0, false);
                        return true;
                    }
                    m2746k0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zMo2661P2 = layoutManager.mo2661P();
                    if (keyCode2 == 122) {
                        if (zMo2661P2) {
                            iMo6133a = getAdapter().mo6133a();
                        }
                    } else if (!zMo2661P2) {
                        iMo6133a = getAdapter().mo6133a();
                    }
                    m2747l0(iMo6133a);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m21421a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m21422b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m21424d(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m21426f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.f6617K;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((w28) arrayList.get(i)).mo12779h(canvas, this, this.f6606C0);
        }
        EdgeEffect edgeEffect = this.f6656g0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f6657h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f6656g0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f6658h0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f6657h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f6658h0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f6660i0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f6657h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f6660i0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f6662j0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f6657h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f6662j0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f6664k0 == null || arrayList.size() <= 0 || !this.f6664k0.mo153f()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m2736e0(w28 w28Var) {
        y28 y28Var = this.f6613I;
        if (y28Var != null) {
            y28Var.mo2677c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f6617K;
        arrayList.remove(w28Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m2724S();
        requestLayout();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m2737f0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f6661j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof z28) {
            z28 z28Var = (z28) layoutParams;
            if (!z28Var.f70801c) {
                Rect rect2 = z28Var.f70800b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f6613I.mo6096t0(this, view, this.f6661j, !this.f6627P, view2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0160  */
    /* JADX WARN: Code duplicated, block: B:114:0x0164  */
    /* JADX WARN: Code duplicated, block: B:116:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0180  */
    /* JADX WARN: Code duplicated, block: B:128:0x0182  */
    /* JADX WARN: Code duplicated, block: B:131:0x0186  */
    /* JADX WARN: Code duplicated, block: B:132:0x0188  */
    /* JADX WARN: Code duplicated, block: B:133:0x018a  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x0114  */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0168, code lost:
    
        if (r16 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0175, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0178, code lost:
    
        if (r16 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x017b, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0183, code lost:
    
        if ((r5 * r6) <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x018b, code lost:
    
        if ((r5 * r6) >= 0) goto L136;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View viewMo2616X;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b;
        boolean z;
        this.f6613I.getClass();
        boolean z2 = (this.f6611H == null || this.f6613I == null || m2722Q() || this.f6633S) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        k38 k38Var = this.f6606C0;
        g38 g38Var = this.f6647c;
        if (z2 && (i == 2 || i == 1)) {
            if (this.f6613I.mo2680e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.f6613I.mo2679d()) {
                z = focusFinder.findNextFocus(this, view, (this.f6613I.f69172b.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                m2753p();
                if (m2712E(view) != null) {
                    m2749m0();
                    this.f6613I.mo2616X(view, i, g38Var, k38Var);
                    m2752o0(false);
                }
                return null;
            }
            viewMo2616X = focusFinder.findNextFocus(this, view, i);
            if (viewMo2616X == null) {
            }
            if (viewMo2616X != null) {
                if (view != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.f6661j;
                    rect.set(0, 0, width, height);
                    int width2 = viewMo2616X.getWidth();
                    int height2 = viewMo2616X.getHeight();
                    Rect rect2 = this.f6663k;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(viewMo2616X, rect2);
                    if (this.f6613I.f69172b.getLayoutDirection() == 1) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    i3 = rect.left;
                    i4 = rect2.left;
                    int i7 = i3 < i4 ? 1 : 1;
                    i5 = rect.top;
                    i6 = rect2.top;
                    b = i5 < i6 ? (byte) 1 : (byte) 1;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i == 130) {
                                            C3386nv.m17627n("Invalid direction: ", i, m2710C());
                                            return null;
                                        }
                                    }
                                }
                            }
                        } else if (b <= 0) {
                            if (b == 0) {
                            }
                        }
                    } else if (b >= 0) {
                        if (b == 0) {
                        }
                    }
                }
                return viewMo2616X;
            }
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        if (viewFindNextFocus == null && z2) {
            m2753p();
            if (m2712E(view) != null) {
                m2749m0();
                viewMo2616X = this.f6613I.mo2616X(view, i, g38Var, k38Var);
                m2752o0(false);
            }
            return null;
        }
        viewMo2616X = viewFindNextFocus;
        if (viewMo2616X == null && !viewMo2616X.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m2737f0(viewMo2616X, null);
            return view;
        }
        if (viewMo2616X != null && viewMo2616X != this && viewMo2616X != view && m2712E(viewMo2616X) != null) {
            if (view != null && m2712E(view) != null) {
                int width3 = view.getWidth();
                int height3 = view.getHeight();
                Rect rect3 = this.f6661j;
                rect3.set(0, 0, width3, height3);
                int width4 = viewMo2616X.getWidth();
                int height4 = viewMo2616X.getHeight();
                Rect rect4 = this.f6663k;
                rect4.set(0, 0, width4, height4);
                offsetDescendantRectToMyCoords(view, rect3);
                offsetDescendantRectToMyCoords(viewMo2616X, rect4);
                if (this.f6613I.f69172b.getLayoutDirection() == 1) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                i3 = rect3.left;
                i4 = rect4.left;
                if ((i3 < i4 && rect3.right > i4) || rect3.right >= rect4.right) {
                    int i8 = rect3.right;
                    int i9 = rect4.right;
                    i7 = ((i8 > i9 || i3 >= i9) && i3 > i4) ? -1 : 0;
                }
                i5 = rect3.top;
                i6 = rect4.top;
                if ((i5 < i6 && rect3.bottom > i6) || rect3.bottom >= rect4.bottom) {
                    int i10 = rect3.bottom;
                    int i11 = rect4.bottom;
                    b = ((i10 > i11 || i5 >= i11) && i5 > i6) ? (byte) -1 : (byte) 0;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i == 130) {
                                        C3386nv.m17627n("Invalid direction: ", i, m2710C());
                                        return null;
                                    }
                                }
                            }
                        }
                    } else if (b <= 0) {
                        if (b == 0) {
                        }
                    }
                } else if (b >= 0) {
                    if (b == 0) {
                    }
                }
            }
            return viewMo2616X;
        }
        return super.focusSearch(view, i);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
      0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX INFO: renamed from: g0 */
    public final boolean m2738g0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        m2753p();
        p28 p28Var = this.f6611H;
        int[] iArr = this.f6626O0;
        if (p28Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m2740h0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f6617K.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m2762w(i4, i5, i6, i7, this.f6622M0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.f6671q0;
        int[] iArr2 = this.f6622M0;
        int i13 = iArr2[0];
        this.f6671q0 = i12 - i13;
        int i14 = this.f6672r0;
        int i15 = iArr2[1];
        this.f6672r0 = i14 - i15;
        int[] iArr3 = this.f6624N0;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || fqb.m11999a(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    m2765z();
                    z = true;
                    z2 = false;
                    tbd.m21945c(this.f6656g0, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        m2708A();
                        tbd.m21945c(this.f6660i0, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f2 < 0.0f) {
                        m2709B();
                        tbd.m21945c(this.f6658h0, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        m2764y();
                        tbd.m21945c(this.f6662j0, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (z3 || f != 0.0f || f2 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && fqb.m11999a(motionEvent, 4194304)) {
                            m2733b0();
                        }
                    }
                    z3 = z;
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        m2733b0();
                    }
                }
                z3 = z;
                if (f2 < 0.0f) {
                    m2709B();
                    tbd.m21945c(this.f6658h0, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    m2764y();
                    tbd.m21945c(this.f6662j0, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        m2733b0();
                    }
                }
                z3 = z;
                if (z3) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    m2733b0();
                }
            }
            m2750n(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            m2763x(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        y28 y28Var = this.f6613I;
        if (y28Var != null) {
            return y28Var.mo2638r();
        }
        C3386nv.m17633t("RecyclerView has no LayoutManager".concat(m2710C()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        y28 y28Var = this.f6613I;
        if (y28Var != null) {
            return y28Var.mo2640s(getContext(), attributeSet);
        }
        C3386nv.m17633t("RecyclerView has no LayoutManager".concat(m2710C()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public p28 getAdapter() {
        return this.f6611H;
    }

    @Override // android.view.View
    public int getBaseline() {
        y28 y28Var = this.f6613I;
        if (y28Var == null) {
            return super.getBaseline();
        }
        y28Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f6657h;
    }

    public q38 getCompatAccessibilityDelegate() {
        return this.f6616J0;
    }

    public u28 getEdgeEffectFactory() {
        return this.f6654f0;
    }

    public v28 getItemAnimator() {
        return this.f6664k0;
    }

    public int getItemDecorationCount() {
        return this.f6617K.size();
    }

    public y28 getLayoutManager() {
        return this.f6613I;
    }

    public int getMaxFlingVelocity() {
        return this.f6676v0;
    }

    public int getMinFlingVelocity() {
        return this.f6675u0;
    }

    public long getNanoTime() {
        if (f6600c1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public b38 getOnFlingListener() {
        return this.f6674t0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f6679y0;
    }

    public f38 getRecycledViewPool() {
        return this.f6647c.m12331c();
    }

    public int getScrollState() {
        return this.f6666l0;
    }

    /* JADX INFO: renamed from: h */
    public final void m2739h(o38 o38Var) {
        View view = o38Var.f53781a;
        boolean z = view.getParent() == this;
        this.f6647c.m12341m(m2719M(view));
        boolean zM17792l = o38Var.m17792l();
        u8a u8aVar = this.f6653f;
        if (zM17792l) {
            u8aVar.m22541b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            u8aVar.m22540a(view, -1, true);
            return;
        }
        int iIndexOfChild = ((n28) u8aVar.f63594c).f52241a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            v63.m23142t(view, "view is not a child, cannot hide ");
        } else {
            ((s01) u8aVar.f63595d).m20998j(iIndexOfChild);
            u8aVar.m22550k(view);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m2740h0(int i, int i2, int[] iArr) {
        o38 o38Var;
        m2749m0();
        m2726U();
        Trace.beginSection("RV Scroll");
        k38 k38Var = this.f6606C0;
        m2711D(k38Var);
        g38 g38Var = this.f6647c;
        int iMo2645v0 = i != 0 ? this.f6613I.mo2645v0(i, g38Var, k38Var) : 0;
        int iMo2649x0 = i2 != 0 ? this.f6613I.mo2649x0(i2, g38Var, k38Var) : 0;
        Trace.endSection();
        u8a u8aVar = this.f6653f;
        int iM22544e = u8aVar.m22544e();
        for (int i3 = 0; i3 < iM22544e; i3++) {
            View viewM22543d = u8aVar.m22543d(i3);
            o38 o38VarM2719M = m2719M(viewM22543d);
            if (o38VarM2719M != null && (o38Var = o38VarM2719M.f53789i) != null) {
                View view = o38Var.f53781a;
                int left = viewM22543d.getLeft();
                int top = viewM22543d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m2727V(true);
        m2752o0(false);
        if (iArr != null) {
            iArr[0] = iMo2645v0;
            iArr[1] = iMo2649x0;
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m21429i();
    }

    /* JADX INFO: renamed from: i */
    public final void m2741i(w28 w28Var) {
        y28 y28Var = this.f6613I;
        if (y28Var != null) {
            y28Var.mo2677c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f6617K;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(w28Var);
        m2724S();
        requestLayout();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m2742i0(int i) {
        if (this.f6633S) {
            return;
        }
        m2756q0();
        y28 y28Var = this.f6613I;
        if (y28Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            y28Var.mo2697w0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f6623N;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f6633S;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m21431k();
    }

    /* JADX INFO: renamed from: j */
    public final void m2743j(d38 d38Var) {
        if (this.f6608E0 == null) {
            this.f6608E0 = new ArrayList();
        }
        this.f6608E0.add(d38Var);
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m2744j0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM21943a = tbd.m21943a(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f6643a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f6598a1;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM21943a;
    }

    /* JADX INFO: renamed from: k */
    public final void m2745k(String str) {
        if (!m2722Q()) {
            if (this.f6652e0 > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(m2710C()));
            }
        } else if (str == null) {
            C3386nv.m17633t("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(m2710C()));
        } else {
            C3386nv.m17633t(str);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m2746k0(int i, int i2, boolean z) {
        y28 y28Var = this.f6613I;
        if (y28Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f6633S) {
            return;
        }
        if (!y28Var.mo2679d()) {
            i = 0;
        }
        if (!this.f6613I.mo2680e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().m21434n(i3, 1);
        }
        this.f6680z0.m17201c(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m2747l0(int i) {
        if (this.f6633S) {
            return;
        }
        y28 y28Var = this.f6613I;
        if (y28Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            y28Var.mo2654G0(this, i);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2748m() {
        u8a u8aVar = this.f6653f;
        int iM22549j = u8aVar.m22549j();
        for (int i = 0; i < iM22549j; i++) {
            o38 o38VarM2699N = m2699N(u8aVar.m22548i(i));
            if (!o38VarM2699N.m17797q()) {
                o38VarM2699N.f53784d = -1;
                o38VarM2699N.f53787g = -1;
            }
        }
        g38 g38Var = this.f6647c;
        ArrayList arrayList = g38Var.f40123a;
        ArrayList arrayList2 = g38Var.f40125c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            o38 o38Var = (o38) arrayList2.get(i2);
            o38Var.f53784d = -1;
            o38Var.f53787g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            o38 o38Var2 = (o38) arrayList.get(i3);
            o38Var2.f53784d = -1;
            o38Var2.f53787g = -1;
        }
        ArrayList arrayList3 = g38Var.f40124b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                o38 o38Var3 = (o38) g38Var.f40124b.get(i4);
                o38Var3.f53784d = -1;
                o38Var3.f53787g = -1;
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m2749m0() {
        int i = this.f6629Q + 1;
        this.f6629Q = i;
        if (i != 1 || this.f6633S) {
            return;
        }
        this.f6631R = false;
    }

    /* JADX INFO: renamed from: n */
    public final void m2750n(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f6656g0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f6656g0.onRelease();
            zIsFinished = this.f6656g0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f6660i0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f6660i0.onRelease();
            zIsFinished |= this.f6660i0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f6658h0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f6658h0.onRelease();
            zIsFinished |= this.f6658h0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f6662j0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f6662j0.onRelease();
            zIsFinished |= this.f6662j0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final void m2751n0(int i) {
        boolean zMo2679d = this.f6613I.mo2679d();
        int i2 = zMo2679d;
        if (this.f6613I.mo2680e()) {
            i2 = (zMo2679d ? 1 : 0) | 2;
        }
        getScrollingChildHelper().m21434n(i2, i);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m2752o0(boolean z) {
        if (this.f6629Q < 1) {
            if (f6595X0) {
                C3386nv.m17633t("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(m2710C()));
                return;
            }
            this.f6629Q = 1;
        }
        if (!z && !this.f6633S) {
            this.f6631R = false;
        }
        if (this.f6629Q == 1) {
            if (z && this.f6631R && !this.f6633S && this.f6613I != null && this.f6611H != null) {
                m2758s();
            }
            if (!this.f6633S) {
                this.f6631R = false;
            }
        }
        this.f6629Q--;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f6650d0 = 0;
        this.f6623N = true;
        this.f6627P = this.f6627P && !isLayoutRequested();
        this.f6647c.m12333e();
        y28 y28Var = this.f6613I;
        if (y28Var != null) {
            y28Var.f69177g = true;
            y28Var.mo6095V(this);
        }
        this.f6614I0 = false;
        if (f6600c1) {
            ThreadLocal threadLocal = zj3.f71642e;
            zj3 zj3Var = (zj3) threadLocal.get();
            this.f6604A0 = zj3Var;
            if (zj3Var == null) {
                this.f6604A0 = new zj3();
                WeakHashMap weakHashMap = dta.f36217a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                zj3 zj3Var2 = this.f6604A0;
                zj3Var2.f71646c = (long) (1.0E9f / refreshRate);
                threadLocal.set(zj3Var2);
            }
            ArrayList arrayList = this.f6604A0.f71644a;
            if (f6595X0 && arrayList.contains(this)) {
                C3386nv.m17633t("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zj3 zj3Var;
        super.onDetachedFromWindow();
        v28 v28Var = this.f6664k0;
        if (v28Var != null) {
            v28Var.mo152e();
        }
        m2756q0();
        int i = 0;
        this.f6623N = false;
        y28 y28Var = this.f6613I;
        if (y28Var != null) {
            y28Var.f69177g = false;
            y28Var.mo2669W(this);
        }
        this.f6628P0.clear();
        removeCallbacks(this.f6630Q0);
        this.f6655g.getClass();
        while (qta.f58199d.mo14458a() != null) {
        }
        g38 g38Var = this.f6647c;
        ArrayList arrayList = g38Var.f40125c;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            hh7.m13242a(((o38) arrayList.get(i2)).f53781a);
        }
        g38Var.m12334f(g38Var.f40130h.f6611H, false);
        int i3 = hh7.f42375a;
        while (i < getChildCount()) {
            int i4 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                v63.m23128b();
                return;
            }
            ArrayList arrayList2 = hh7.m13243b(childAt).f44113a;
            for (int iM23602H = vz1.m23602H(arrayList2); -1 < iM23602H; iM23602H--) {
                ((fta) arrayList2.get(iM23602H)).f39633a.m1711e();
            }
            i = i4;
        }
        if (!f6600c1 || (zj3Var = this.f6604A0) == null) {
            return;
        }
        boolean zRemove = zj3Var.f71644a.remove(this);
        if (!f6595X0 || zRemove) {
            this.f6604A0 = null;
        } else {
            C3386nv.m17633t("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f6617K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((w28) arrayList.get(i)).mo17639g(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.f6613I != null && !this.f6633S && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.f6613I.mo2680e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f6613I.mo2679d() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f2;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f6613I.mo2680e()) {
                    float f3 = -axisValue;
                    axisValue = 0.0f;
                    f = f3;
                } else if (!this.f6613I.mo2679d()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.f6638U0;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.f6678x0);
            int i3 = (int) (axisValue * this.f6677w0);
            if (z) {
                OverScroller overScroller = this.f6680z0.f52291c;
                m2746k0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                y28 y28Var = this.f6613I;
                if (y28Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f6633S) {
                    int[] iArr = this.f6626O0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo2679d = y28Var.mo2679d();
                    boolean zMo2680e = this.f6613I.mo2680e();
                    int i4 = zMo2680e ? (zMo2679d ? 1 : 0) | 2 : zMo2679d ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iM2734c0 = i3 - m2734c0(i3, y);
                    int iM2735d0 = i2 - m2735d0(i2, x);
                    getScrollingChildHelper().m21434n(i4, 1);
                    if (m2761v(zMo2679d ? iM2734c0 : 0, zMo2680e ? iM2735d0 : 0, 1, this.f6626O0, this.f6622M0)) {
                        iM2734c0 -= iArr[0];
                        iM2735d0 -= iArr[1];
                    }
                    m2738g0(zMo2679d ? iM2734c0 : 0, zMo2680e ? iM2735d0 : 0, motionEvent, 1);
                    zj3 zj3Var = this.f6604A0;
                    if (zj3Var != null && (iM2734c0 != 0 || iM2735d0 != 0)) {
                        zj3Var.m25676a(this, iM2734c0, iM2735d0);
                    }
                    m2754p0(1);
                }
            }
            if (i != 0 && !z) {
                this.f6642W0.m12580a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f6633S) {
            this.f6621M = null;
            if (m2713F(motionEvent)) {
                VelocityTracker velocityTracker = this.f6668n0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m2754p0(0);
                m2733b0();
                setScrollState(0);
                return true;
            }
            y28 y28Var = this.f6613I;
            if (y28Var != null) {
                boolean zMo2679d = y28Var.mo2679d();
                boolean zMo2680e = this.f6613I.mo2680e();
                if (this.f6668n0 == null) {
                    this.f6668n0 = VelocityTracker.obtain();
                }
                this.f6668n0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f6635T) {
                        this.f6635T = false;
                    }
                    this.f6667m0 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f6671q0 = x;
                    this.f6669o0 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f6672r0 = y;
                    this.f6670p0 = y;
                    EdgeEffect edgeEffect = this.f6656g0;
                    if (edgeEffect == null || tbd.m21943a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        tbd.m21945c(this.f6656g0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.f6660i0;
                    if (edgeEffect2 != null && tbd.m21943a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        tbd.m21945c(this.f6660i0, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.f6658h0;
                    if (edgeEffect3 != null && tbd.m21943a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        tbd.m21945c(this.f6658h0, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.f6662j0;
                    if (edgeEffect4 != null && tbd.m21943a(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        tbd.m21945c(this.f6662j0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.f6666l0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m2754p0(1);
                    }
                    int[] iArr = this.f6624N0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m2751n0(0);
                } else if (actionMasked == 1) {
                    this.f6668n0.clear();
                    m2754p0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f6667m0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f6667m0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f6666l0 != 1) {
                        int i = x2 - this.f6669o0;
                        int i2 = y2 - this.f6670p0;
                        if (!zMo2679d || Math.abs(i) <= this.f6673s0) {
                            z2 = false;
                        } else {
                            this.f6671q0 = x2;
                            z2 = true;
                        }
                        if (zMo2680e && Math.abs(i2) > this.f6673s0) {
                            this.f6672r0 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f6668n0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    m2754p0(0);
                    m2733b0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f6667m0 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f6671q0 = x3;
                    this.f6669o0 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f6672r0 = y3;
                    this.f6670p0 = y3;
                } else if (actionMasked == 6) {
                    m2728W(motionEvent);
                }
                if (this.f6666l0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        m2758s();
        Trace.endSection();
        this.f6627P = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        y28 y28Var = this.f6613I;
        if (y28Var == null) {
            m2755q(i, i2);
            return;
        }
        boolean zMo2659O = y28Var.mo2659O();
        boolean z = false;
        k38 k38Var = this.f6606C0;
        if (zMo2659O) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f6613I.f69172b.m2755q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f6632R0 = z;
            if (z || this.f6611H == null) {
                return;
            }
            if (k38Var.f46630d == 1) {
                m2759t();
            }
            this.f6613I.m24908z0(i, i2);
            k38Var.f46635i = true;
            m2760u();
            this.f6613I.m24885B0(i, i2);
            if (this.f6613I.mo2653E0()) {
                this.f6613I.m24908z0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                k38Var.f46635i = true;
                m2760u();
                this.f6613I.m24885B0(i, i2);
            }
            this.f6634S0 = getMeasuredWidth();
            this.f6636T0 = getMeasuredHeight();
            return;
        }
        if (this.f6625O) {
            this.f6613I.f69172b.m2755q(i, i2);
            return;
        }
        if (this.f6639V) {
            m2749m0();
            m2726U();
            m2730Y();
            m2727V(true);
            if (k38Var.f46637k) {
                k38Var.f46633g = true;
            } else {
                this.f6651e.m19747o();
                k38Var.f46633g = false;
            }
            this.f6639V = false;
            m2752o0(false);
        } else if (k38Var.f46637k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        p28 p28Var = this.f6611H;
        if (p28Var != null) {
            k38Var.f46631e = p28Var.mo6133a();
        } else {
            k38Var.f46631e = 0;
        }
        m2749m0();
        this.f6613I.f69172b.m2755q(i, i2);
        m2752o0(false);
        k38Var.f46633g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m2722Q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f6649d = savedState;
        super.onRestoreInstanceState(savedState.f5563a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f6649d;
        if (savedState2 != null) {
            savedState.f6681c = savedState2.f6681c;
            return savedState;
        }
        y28 y28Var = this.f6613I;
        if (y28Var != null) {
            savedState.f6681c = y28Var.mo2690k0();
            return savedState;
        }
        savedState.f6681c = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f6662j0 = null;
        this.f6658h0 = null;
        this.f6660i0 = null;
        this.f6656g0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x010f A[PHI: r1
      0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM2713F;
        boolean z;
        if (!this.f6633S && !this.f6635T) {
            c38 c38Var = this.f6621M;
            if (c38Var == null) {
                zM2713F = motionEvent.getAction() == 0 ? false : m2713F(motionEvent);
            } else {
                c38Var.mo4301a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f6621M = null;
                }
                zM2713F = true;
            }
            if (zM2713F) {
                VelocityTracker velocityTracker = this.f6668n0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m2754p0(0);
                m2733b0();
                setScrollState(0);
                return true;
            }
            y28 y28Var = this.f6613I;
            if (y28Var != null) {
                boolean zMo2679d = y28Var.mo2679d();
                boolean zMo2680e = this.f6613I.mo2680e();
                if (this.f6668n0 == null) {
                    this.f6668n0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f6624N0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.f6668n0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.f6668n0;
                        int i = this.f6676v0;
                        velocityTracker2.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, i);
                        float f = zMo2679d ? -this.f6668n0.getXVelocity(this.f6667m0) : 0.0f;
                        float f2 = zMo2680e ? -this.f6668n0.getYVelocity(this.f6667m0) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !m2716J((int) f, (int) f2, this.f6675u0, i)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.f6668n0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        m2754p0(0);
                        m2733b0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f6667m0);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f6667m0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.f6671q0 - x;
                        int iMax2 = this.f6672r0 - y;
                        if (this.f6666l0 != 1) {
                            if (zMo2679d) {
                                int i2 = this.f6673s0;
                                iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                                if (iMax != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zMo2680e) {
                                int i3 = this.f6673s0;
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                                if (iMax2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.f6666l0 == 1) {
                            int[] iArr2 = this.f6626O0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iM2734c0 = iMax - m2734c0(iMax, motionEvent.getY());
                            int iM2735d0 = iMax2 - m2735d0(iMax2, motionEvent.getX());
                            boolean zM2761v = m2761v(zMo2679d ? iM2734c0 : 0, zMo2680e ? iM2735d0 : 0, 0, this.f6626O0, this.f6622M0);
                            int[] iArr3 = this.f6622M0;
                            if (zM2761v) {
                                iM2734c0 -= iArr2[0];
                                iM2735d0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i4 = iM2734c0;
                            int i5 = iM2735d0;
                            this.f6671q0 = x - iArr3[0];
                            this.f6672r0 = y - iArr3[1];
                            if (m2738g0(zMo2679d ? i4 : 0, zMo2680e ? i5 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            zj3 zj3Var = this.f6604A0;
                            if (zj3Var != null && (i4 != 0 || i5 != 0)) {
                                zj3Var.m25676a(this, i4, i5);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.f6668n0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        m2754p0(0);
                        m2733b0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f6667m0 = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f6671q0 = x2;
                        this.f6669o0 = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f6672r0 = y2;
                        this.f6670p0 = y2;
                    } else if (actionMasked == 6) {
                        m2728W(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.f6667m0 = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.f6671q0 = x3;
                this.f6669o0 = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.f6672r0 = y3;
                this.f6670p0 = y3;
                m2751n0(0);
                this.f6668n0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m2753p() {
        if (!this.f6627P || this.f6646b0) {
            Trace.beginSection("RV FullInvalidate");
            m2758s();
            Trace.endSection();
            return;
        }
        C3488q8 c3488q8 = this.f6651e;
        if (c3488q8.m19755x()) {
            int i = c3488q8.f57368b;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (c3488q8.m19755x()) {
                    Trace.beginSection("RV FullInvalidate");
                    m2758s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            m2749m0();
            m2726U();
            c3488q8.m19721G();
            if (!this.f6631R) {
                u8a u8aVar = this.f6653f;
                int iM22544e = u8aVar.m22544e();
                for (int i2 = 0; i2 < iM22544e; i2++) {
                    o38 o38VarM2699N = m2699N(u8aVar.m22543d(i2));
                    if (o38VarM2699N != null && !o38VarM2699N.m17797q() && o38VarM2699N.m17793m()) {
                        m2758s();
                    }
                }
                c3488q8.m19743k();
            }
            m2752o0(true);
            m2727V(true);
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m2754p0(int i) {
        getScrollingChildHelper().m21436p(i);
    }

    /* JADX INFO: renamed from: q */
    public final void m2755q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = dta.f36217a;
        setMeasuredDimension(y28.m24882g(i, paddingRight, getMinimumWidth()), y28.m24882g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m2756q0() {
        fd5 fd5Var;
        setScrollState(0);
        n38 n38Var = this.f6680z0;
        n38Var.f52295g.removeCallbacks(n38Var);
        n38Var.f52291c.abortAnimation();
        y28 y28Var = this.f6613I;
        if (y28Var == null || (fd5Var = y28Var.f69175e) == null) {
            return;
        }
        fd5Var.m11787o();
    }

    /* JADX INFO: renamed from: r */
    public final void m2757r(View view) {
        m2699N(view);
        ArrayList arrayList = this.f6644a0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a38) this.f6644a0.get(size)).mo74b(view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        o38 o38VarM2699N = m2699N(view);
        if (o38VarM2699N != null) {
            if (o38VarM2699N.m17792l()) {
                o38VarM2699N.f53790j &= -257;
            } else if (!o38VarM2699N.m17797q()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(o38VarM2699N);
                C3386nv.m17630q(sb, m2710C());
                return;
            }
        } else if (f6595X0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            C3386nv.m17630q(sb2, m2710C());
            return;
        }
        view.clearAnimation();
        m2757r(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        fd5 fd5Var = this.f6613I.f69175e;
        if ((fd5Var == null || !fd5Var.m11781i()) && !m2722Q() && view2 != null) {
            m2737f0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f6613I.mo6096t0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f6619L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c38) arrayList.get(i)).mo4303e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f6629Q != 0 || this.f6633S) {
            this.f6631R = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0277  */
    /* JADX WARN: Code duplicated, block: B:164:0x0347  */
    /* JADX WARN: Code duplicated, block: B:183:0x0387  */
    /* JADX WARN: Code duplicated, block: B:185:0x038a  */
    /* JADX WARN: Code duplicated, block: B:191:0x039f  */
    /* JADX WARN: Code duplicated, block: B:193:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:196:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:199:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:205:0x03c3 A[LOOP:4: B:198:0x03b0->B:205:0x03c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:211:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:214:0x03e1 A[LOOP:5: B:207:0x03ce->B:214:0x03e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:244:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x03e4 A[EDGE_INSN: B:247:0x03e4->B:215:0x03e4 BREAK  A[LOOP:5: B:207:0x03ce->B:214:0x03e1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03df A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final void m2758s() {
        byte b;
        long j;
        o38 o38Var;
        int i;
        int iM14789b;
        int i2;
        int iMin;
        o38 o38VarM2715I;
        View view;
        o38 o38VarM2715I2;
        View view2;
        int i3;
        View viewFindViewById;
        View view3;
        boolean z;
        l79 l79Var;
        xp7 xp7Var;
        boolean zM154g;
        byte b2;
        if (this.f6611H == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f6613I == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        k38 k38Var = this.f6606C0;
        byte b3 = 0;
        k38Var.f46635i = false;
        byte b4 = 1;
        Object[] objArr = this.f6632R0 && !(this.f6634S0 == getWidth() && this.f6636T0 == getHeight());
        this.f6634S0 = 0;
        this.f6636T0 = 0;
        this.f6632R0 = false;
        if (k38Var.f46630d == 1) {
            m2759t();
            this.f6613I.m24907y0(this);
            m2760u();
        } else {
            C3488q8 c3488q8 = this.f6651e;
            if ((((ArrayList) c3488q8.f57371e).isEmpty() || ((ArrayList) c3488q8.f57370d).isEmpty()) && !objArr == true && this.f6613I.f69184n == getWidth() && this.f6613I.f69185o == getHeight()) {
                this.f6613I.m24907y0(this);
            } else {
                this.f6613I.m24907y0(this);
                m2760u();
            }
        }
        k38Var.m14788a(4);
        m2749m0();
        m2726U();
        k38Var.f46630d = 1;
        boolean z2 = k38Var.f46636j;
        u8a u8aVar = this.f6653f;
        g38 g38Var = this.f6647c;
        qfa qfaVar = this.f6655g;
        if (z2) {
            int iM22544e = u8aVar.m22544e() - 1;
            while (true) {
                int i4 = 3;
                if (iM22544e < 0) {
                    b = b4;
                    l79 l79Var2 = (l79) qfaVar.f57705a;
                    int i5 = l79Var2.f49254c - 1;
                    while (i5 >= 0) {
                        o38 o38Var2 = (o38) l79Var2.m15974f(i5);
                        qta qtaVar = (qta) l79Var2.m15975g(i5);
                        int i6 = qtaVar.f58200a;
                        int i7 = i6 & 3;
                        n28 n28Var = this.f6640V0;
                        if (i7 == i4) {
                            RecyclerView recyclerView = n28Var.f52241a;
                            recyclerView.f6613I.m24901q0(o38Var2.f53781a, recyclerView.f6647c);
                        } else if ((i6 & 1) != 0) {
                            xp7 xp7Var2 = qtaVar.f58201b;
                            if (xp7Var2 == null) {
                                RecyclerView recyclerView2 = n28Var.f52241a;
                                recyclerView2.f6613I.m24901q0(o38Var2.f53781a, recyclerView2.f6647c);
                            } else {
                                n28Var.m17190b(o38Var2, xp7Var2, qtaVar.f58202c);
                            }
                        } else if ((i6 & 14) == 14) {
                            n28Var.m17189a(o38Var2, qtaVar.f58201b, qtaVar.f58202c);
                        } else {
                            if ((i6 & 12) == 12) {
                                xp7 xp7Var3 = qtaVar.f58201b;
                                xp7 xp7Var4 = qtaVar.f58202c;
                                n28Var.getClass();
                                o38Var2.m17796p(false);
                                RecyclerView recyclerView3 = n28Var.f52241a;
                                boolean z3 = recyclerView3.f6646b0;
                                v28 v28Var = recyclerView3.f6664k0;
                                if (!z3) {
                                    a72 a72Var = (a72) v28Var;
                                    a72Var.getClass();
                                    int i8 = xp7Var3.f68498b;
                                    int i9 = xp7Var4.f68498b;
                                    if (i8 == i9) {
                                        l79Var = l79Var2;
                                        if (xp7Var3.f68499c == xp7Var4.f68499c) {
                                            a72Var.m23068c(o38Var2);
                                            zM154g = false;
                                        }
                                        if (zM154g) {
                                            recyclerView3.m2729X();
                                        }
                                    } else {
                                        l79Var = l79Var2;
                                    }
                                    zM154g = a72Var.m154g(o38Var2, i8, xp7Var3.f68499c, i9, xp7Var4.f68499c);
                                    if (zM154g) {
                                        recyclerView3.m2729X();
                                    }
                                } else if (v28Var.mo150a(o38Var2, o38Var2, xp7Var3, xp7Var4)) {
                                    recyclerView3.m2729X();
                                }
                                xp7Var = null;
                            } else {
                                l79Var = l79Var2;
                                if ((i6 & 4) != 0) {
                                    xp7Var = null;
                                    n28Var.m17190b(o38Var2, qtaVar.f58201b, null);
                                } else {
                                    xp7Var = null;
                                    if ((i6 & 8) != 0) {
                                        n28Var.m17189a(o38Var2, qtaVar.f58201b, qtaVar.f58202c);
                                    }
                                }
                            }
                            qtaVar.f58200a = 0;
                            qtaVar.f58201b = xp7Var;
                            qtaVar.f58202c = xp7Var;
                            qta.f58199d.mo14460c(qtaVar);
                            i5--;
                            l79Var2 = l79Var;
                            i4 = 3;
                        }
                        l79Var = l79Var2;
                        xp7Var = null;
                        qtaVar.f58200a = 0;
                        qtaVar.f58201b = xp7Var;
                        qtaVar.f58202c = xp7Var;
                        qta.f58199d.mo14460c(qtaVar);
                        i5--;
                        l79Var2 = l79Var;
                        i4 = 3;
                    }
                    break;
                }
                o38 o38VarM2699N = m2699N(u8aVar.m22543d(iM22544e));
                if (o38VarM2699N.m17797q()) {
                    b2 = b4;
                } else {
                    long jM2718L = m2718L(o38VarM2699N);
                    this.f6664k0.getClass();
                    xp7 xp7Var5 = new xp7(3, b3);
                    xp7Var5.m24630a(o38VarM2699N);
                    tk5 tk5Var = (tk5) qfaVar.f57706b;
                    b2 = b4;
                    l79 l79Var3 = (l79) qfaVar.f57705a;
                    o38 o38Var3 = (o38) tk5Var.m22176b(jM2718L);
                    if (o38Var3 == null || o38Var3.m17797q()) {
                        qfaVar.m19906d(o38VarM2699N, xp7Var5);
                    } else {
                        qta qtaVar2 = (qta) l79Var3.get(o38Var3);
                        byte b5 = (qtaVar2 == null || (qtaVar2.f58200a & 1) == 0) ? b3 : b2;
                        qta qtaVar3 = (qta) l79Var3.get(o38VarM2699N);
                        byte b6 = (qtaVar3 == null || (qtaVar3.f58200a & 1) == 0) ? b3 : b2;
                        if (b5 == 0 || o38Var3 != o38VarM2699N) {
                            xp7 xp7VarM19909h = qfaVar.m19909h(o38Var3, 4);
                            qfaVar.m19906d(o38VarM2699N, xp7Var5);
                            xp7 xp7VarM19909h2 = qfaVar.m19909h(o38VarM2699N, 8);
                            if (xp7VarM19909h == null) {
                                int iM22544e2 = u8aVar.m22544e();
                                for (int i10 = 0; i10 < iM22544e2; i10++) {
                                    o38 o38VarM2699N2 = m2699N(u8aVar.m22543d(i10));
                                    if (o38VarM2699N2 != o38VarM2699N && m2718L(o38VarM2699N2) == jM2718L) {
                                        p28 p28Var = this.f6611H;
                                        if (p28Var == null || !p28Var.f55487b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(o38VarM2699N2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(o38VarM2699N);
                                            v63.m23138p(sb, m2710C());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(o38VarM2699N2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(o38VarM2699N);
                                        v63.m23138p(sb2, m2710C());
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + o38Var3 + " cannot be found but it is necessary for " + o38VarM2699N + m2710C());
                            } else {
                                o38Var3.m17796p(false);
                                if (b5 != 0) {
                                    m2739h(o38Var3);
                                }
                                if (o38Var3 != o38VarM2699N) {
                                    if (b6 != 0) {
                                        m2739h(o38VarM2699N);
                                    }
                                    o38Var3.f53788h = o38VarM2699N;
                                    m2739h(o38Var3);
                                    g38Var.m12341m(o38Var3);
                                    o38VarM2699N.m17796p(false);
                                    o38VarM2699N.f53789i = o38Var3;
                                }
                                if (this.f6664k0.mo150a(o38Var3, o38VarM2699N, xp7VarM19909h, xp7VarM19909h2)) {
                                    m2729X();
                                }
                            }
                        } else {
                            qfaVar.m19906d(o38VarM2699N, xp7Var5);
                        }
                    }
                }
                iM22544e--;
                b4 = b2;
                b3 = 0;
            }
        } else {
            b = 1;
        }
        View view4 = null;
        this.f6613I.m24900p0(g38Var);
        k38Var.f46628b = k38Var.f46631e;
        this.f6646b0 = false;
        this.f6648c0 = false;
        k38Var.f46636j = false;
        k38Var.f46637k = false;
        this.f6613I.f69176f = false;
        ArrayList arrayList = g38Var.f40124b;
        if (arrayList != null) {
            arrayList.clear();
        }
        y28 y28Var = this.f6613I;
        if (y28Var.f69181k) {
            y28Var.f69180j = 0;
            y28Var.f69181k = false;
            g38Var.m12342n();
        }
        this.f6613I.mo2629i0(k38Var);
        boolean z4 = b;
        m2727V(z4);
        m2752o0(false);
        ((l79) qfaVar.f57705a).clear();
        ((tk5) qfaVar.f57706b).m22175a();
        int[] iArr = this.f6618K0;
        int i11 = iArr[0];
        int i12 = iArr[z4 ? 1 : 0];
        m2714G(iArr);
        if (iArr[0] != i11 || iArr[z4 ? 1 : 0] != i12) {
            m2763x(0, 0);
        }
        if (this.f6679y0 && this.f6611H != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = k38Var.f46639m;
                if (j == -1) {
                    o38Var = null;
                } else {
                    o38Var = null;
                }
                if (o38Var != null) {
                    view3 = o38Var.f53781a;
                    if (!((ArrayList) u8aVar.f63596e).contains(view3)) {
                        if (u8aVar.m22544e() > 0) {
                            i = k38Var.f46638l;
                            if (i == -1) {
                                i = 0;
                            }
                            iM14789b = k38Var.m14789b();
                            i2 = i;
                            while (true) {
                                if (i2 < iM14789b) {
                                    o38VarM2715I2 = m2715I(i2);
                                    if (o38VarM2715I2 != null) {
                                        view2 = o38VarM2715I2.f53781a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iM14789b, i) - 1; iMin >= 0; iMin--) {
                                    o38VarM2715I = m2715I(iMin);
                                    if (o38VarM2715I == null) {
                                        break;
                                        break;
                                    }
                                    view = o38VarM2715I.f53781a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (u8aVar.m22544e() > 0) {
                        i = k38Var.f46638l;
                        if (i == -1) {
                            i = 0;
                        }
                        iM14789b = k38Var.m14789b();
                        i2 = i;
                        while (true) {
                            if (i2 < iM14789b) {
                                o38VarM2715I2 = m2715I(i2);
                                if (o38VarM2715I2 != null) {
                                    view2 = o38VarM2715I2.f53781a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                o38VarM2715I = m2715I(iMin);
                                if (o38VarM2715I == null) {
                                    break;
                                    break;
                                }
                                view = o38VarM2715I.f53781a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (u8aVar.m22544e() > 0) {
                    i = k38Var.f46638l;
                    if (i == -1) {
                        i = 0;
                    }
                    iM14789b = k38Var.m14789b();
                    i2 = i;
                    while (true) {
                        if (i2 < iM14789b) {
                            o38VarM2715I2 = m2715I(i2);
                            if (o38VarM2715I2 != null) {
                                view2 = o38VarM2715I2.f53781a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            o38VarM2715I = m2715I(iMin);
                            if (o38VarM2715I == null) {
                                break;
                                break;
                            }
                            view = o38VarM2715I.f53781a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = k38Var.f46640n;
                    if (i3 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) u8aVar.f63596e).contains(getFocusedChild())) {
                j = k38Var.f46639m;
                if (j == -1 && (z = this.f6611H.f55487b) && z) {
                    int iM22549j = u8aVar.m22549j();
                    o38Var = null;
                    for (int i13 = 0; i13 < iM22549j; i13++) {
                        o38 o38VarM2699N3 = m2699N(u8aVar.m22548i(i13));
                        if (o38VarM2699N3 != null && !o38VarM2699N3.m17790j() && o38VarM2699N3.f53785e == j) {
                            if (!((ArrayList) u8aVar.f63596e).contains(o38VarM2699N3.f53781a)) {
                                o38Var = o38VarM2699N3;
                                break;
                            }
                            o38Var = o38VarM2699N3;
                        }
                    }
                } else {
                    o38Var = null;
                }
                if (o38Var != null) {
                    view3 = o38Var.f53781a;
                    if (!((ArrayList) u8aVar.f63596e).contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (u8aVar.m22544e() > 0) {
                        i = k38Var.f46638l;
                        if (i == -1) {
                            i = 0;
                        }
                        iM14789b = k38Var.m14789b();
                        i2 = i;
                        while (true) {
                            if (i2 < iM14789b) {
                                o38VarM2715I2 = m2715I(i2);
                                if (o38VarM2715I2 != null) {
                                    view2 = o38VarM2715I2.f53781a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                o38VarM2715I = m2715I(iMin);
                                if (o38VarM2715I == null) {
                                    break;
                                }
                                view = o38VarM2715I.f53781a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (u8aVar.m22544e() > 0) {
                    i = k38Var.f46638l;
                    if (i == -1) {
                        i = 0;
                    }
                    iM14789b = k38Var.m14789b();
                    i2 = i;
                    while (true) {
                        if (i2 < iM14789b) {
                            o38VarM2715I2 = m2715I(i2);
                            if (o38VarM2715I2 != null) {
                                view2 = o38VarM2715I2.f53781a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            o38VarM2715I = m2715I(iMin);
                            if (o38VarM2715I == null) {
                                break;
                                break;
                            }
                            view = o38VarM2715I.f53781a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = k38Var.f46640n;
                    if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        k38Var.f46639m = -1L;
        k38Var.f46638l = -1;
        k38Var.f46640n = -1;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        y28 y28Var = this.f6613I;
        if (y28Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f6633S) {
            return;
        }
        boolean zMo2679d = y28Var.mo2679d();
        boolean zMo2680e = this.f6613I.mo2680e();
        if (zMo2679d || zMo2680e) {
            if (!zMo2679d) {
                i = 0;
            }
            if (!zMo2680e) {
                i2 = 0;
            }
            m2738g0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m2722Q()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iM12983b = accessibilityEvent != null ? gzc.m12983b(accessibilityEvent) : 0;
            this.f6637U |= iM12983b != 0 ? iM12983b : 0;
        }
    }

    public void setAccessibilityDelegateCompat(q38 q38Var) {
        this.f6616J0 = q38Var;
        dta.m10640k(this, q38Var);
    }

    public void setAdapter(p28 p28Var) {
        setLayoutFrozen(false);
        p28 p28Var2 = this.f6611H;
        C0726b c0726b = this.f6645b;
        if (p28Var2 != null) {
            p28Var2.f55486a.unregisterObserver(c0726b);
            this.f6611H.mo13582g(this);
        }
        v28 v28Var = this.f6664k0;
        if (v28Var != null) {
            v28Var.mo152e();
        }
        y28 y28Var = this.f6613I;
        g38 g38Var = this.f6647c;
        if (y28Var != null) {
            y28Var.m24898o0(g38Var);
            this.f6613I.m24900p0(g38Var);
        }
        g38Var.f40123a.clear();
        g38Var.m12335g();
        C3488q8 c3488q8 = this.f6651e;
        c3488q8.m19723I((ArrayList) c3488q8.f57370d);
        c3488q8.m19723I((ArrayList) c3488q8.f57371e);
        c3488q8.f57368b = 0;
        p28 p28Var3 = this.f6611H;
        this.f6611H = p28Var;
        if (p28Var != null) {
            p28Var.f55486a.registerObserver(c0726b);
            p28Var.mo13581d(this);
        }
        y28 y28Var2 = this.f6613I;
        if (y28Var2 != null) {
            y28Var2.mo2780U();
        }
        p28 p28Var4 = this.f6611H;
        g38Var.f40123a.clear();
        g38Var.m12335g();
        g38Var.m12334f(p28Var3, true);
        f38 f38VarM12331c = g38Var.m12331c();
        if (p28Var3 != null) {
            f38VarM12331c.f38366b--;
        }
        if (f38VarM12331c.f38366b == 0) {
            SparseArray sparseArray = f38VarM12331c.f38365a;
            for (int i = 0; i < sparseArray.size(); i++) {
                e38 e38Var = (e38) sparseArray.valueAt(i);
                Iterator it = e38Var.f36658a.iterator();
                while (it.hasNext()) {
                    hh7.m13242a(((o38) it.next()).f53781a);
                }
                e38Var.f36658a.clear();
            }
        }
        if (p28Var4 != null) {
            f38VarM12331c.f38366b++;
        }
        g38Var.m12333e();
        this.f6606C0.f46632f = true;
        m2731Z(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(t28 t28Var) {
        if (t28Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f6657h) {
            this.f6662j0 = null;
            this.f6658h0 = null;
            this.f6660i0 = null;
            this.f6656g0 = null;
        }
        this.f6657h = z;
        super.setClipToPadding(z);
        if (this.f6627P) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(u28 u28Var) {
        u28Var.getClass();
        this.f6654f0 = u28Var;
        this.f6662j0 = null;
        this.f6658h0 = null;
        this.f6660i0 = null;
        this.f6656g0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f6625O = z;
    }

    public void setItemAnimator(v28 v28Var) {
        v28 v28Var2 = this.f6664k0;
        if (v28Var2 != null) {
            v28Var2.mo152e();
            this.f6664k0.f64742a = null;
        }
        this.f6664k0 = v28Var;
        if (v28Var != null) {
            v28Var.f64742a = this.f6612H0;
        }
    }

    public void setItemViewCacheSize(int i) {
        g38 g38Var = this.f6647c;
        g38Var.f40127e = i;
        g38Var.m12342n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(y28 y28Var) {
        RecyclerView recyclerView;
        if (y28Var == this.f6613I) {
            return;
        }
        m2756q0();
        y28 y28Var2 = this.f6613I;
        g38 g38Var = this.f6647c;
        if (y28Var2 != null) {
            v28 v28Var = this.f6664k0;
            if (v28Var != null) {
                v28Var.mo152e();
            }
            this.f6613I.m24898o0(g38Var);
            this.f6613I.m24900p0(g38Var);
            g38Var.f40123a.clear();
            g38Var.m12335g();
            if (this.f6623N) {
                y28 y28Var3 = this.f6613I;
                y28Var3.f69177g = false;
                y28Var3.mo2669W(this);
            }
            this.f6613I.m24886C0(null);
            this.f6613I = null;
        } else {
            g38Var.f40123a.clear();
            g38Var.m12335g();
        }
        u8a u8aVar = this.f6653f;
        ((s01) u8aVar.f63595d).m20997i();
        ArrayList arrayList = (ArrayList) u8aVar.f63596e;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((n28) u8aVar.f63594c).f52241a;
            if (size < 0) {
                break;
            }
            o38 o38VarM2699N = m2699N((View) arrayList.get(size));
            if (o38VarM2699N != null) {
                int i = o38VarM2699N.f53796p;
                if (recyclerView.m2722Q()) {
                    o38VarM2699N.f53797q = i;
                    recyclerView.f6628P0.add(o38VarM2699N);
                } else {
                    o38VarM2699N.f53781a.setImportantForAccessibility(i);
                }
                o38VarM2699N.f53796p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.m2757r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f6613I = y28Var;
        if (y28Var != null) {
            if (y28Var.f69172b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(y28Var);
                uk9.m22778m(sb, " is already attached to a RecyclerView:", y28Var.f69172b.m2710C());
                return;
            } else {
                y28Var.m24886C0(this);
                if (this.f6623N) {
                    y28 y28Var4 = this.f6613I;
                    y28Var4.f69177g = true;
                    y28Var4.mo6095V(this);
                }
            }
        }
        g38Var.m12342n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            C3386nv.m17626m("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m21432l(z);
    }

    public void setOnFlingListener(b38 b38Var) {
        this.f6674t0 = b38Var;
    }

    @Deprecated
    public void setOnScrollListener(d38 d38Var) {
        this.f6607D0 = d38Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f6679y0 = z;
    }

    public void setRecycledViewPool(f38 f38Var) {
        g38 g38Var = this.f6647c;
        RecyclerView recyclerView = g38Var.f40130h;
        g38Var.m12334f(recyclerView.f6611H, false);
        f38 f38Var2 = g38Var.f40129g;
        if (f38Var2 != null) {
            f38Var2.f38366b--;
        }
        g38Var.f40129g = f38Var;
        if (f38Var != null && recyclerView.getAdapter() != null) {
            g38Var.f40129g.f38366b++;
        }
        g38Var.m12333e();
    }

    @Deprecated
    public void setRecyclerListener(h38 h38Var) {
    }

    public void setScrollState(int i) {
        fd5 fd5Var;
        if (i == this.f6666l0) {
            return;
        }
        if (f6596Y0) {
            StringBuilder sbM22998u = ux5.m22998u("setting scroll state to ", i, " from ");
            sbM22998u.append(this.f6666l0);
            Log.d("RecyclerView", sbM22998u.toString(), new Exception());
        }
        this.f6666l0 = i;
        if (i != 2) {
            n38 n38Var = this.f6680z0;
            n38Var.f52295g.removeCallbacks(n38Var);
            n38Var.f52291c.abortAnimation();
            y28 y28Var = this.f6613I;
            if (y28Var != null && (fd5Var = y28Var.f69175e) != null) {
                fd5Var.m11787o();
            }
        }
        y28 y28Var2 = this.f6613I;
        if (y28Var2 != null) {
            y28Var2.mo2796l0(i);
        }
        d38 d38Var = this.f6607D0;
        if (d38Var != null) {
            d38Var.mo6122a(this, i);
        }
        ArrayList arrayList = this.f6608E0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((d38) this.f6608E0.get(size)).mo6122a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f6673s0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f6673s0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(m38 m38Var) {
        this.f6647c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m21433m(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m21435o();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f6633S) {
            m2745k("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f6633S = true;
                this.f6635T = true;
                m2756q0();
                return;
            }
            this.f6633S = false;
            if (this.f6631R && this.f6613I != null && this.f6611H != null) {
                requestLayout();
            }
            this.f6631R = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2759t() {
        qta qtaVar;
        View viewM2712E;
        k38 k38Var = this.f6606C0;
        k38Var.m14788a(1);
        m2711D(k38Var);
        k38Var.f46635i = false;
        m2749m0();
        qfa qfaVar = this.f6655g;
        l79 l79Var = (l79) qfaVar.f57705a;
        l79 l79Var2 = (l79) qfaVar.f57705a;
        l79Var.clear();
        tk5 tk5Var = (tk5) qfaVar.f57706b;
        tk5Var.m22175a();
        m2726U();
        m2730Y();
        o38 o38VarM2719M = null;
        View focusedChild = (this.f6679y0 && hasFocus() && this.f6611H != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM2712E = m2712E(focusedChild)) != null) {
            o38VarM2719M = m2719M(viewM2712E);
        }
        if (o38VarM2719M == null) {
            k38Var.f46639m = -1L;
            k38Var.f46638l = -1;
            k38Var.f46640n = -1;
        } else {
            k38Var.f46639m = this.f6611H.f55487b ? o38VarM2719M.f53785e : -1L;
            k38Var.f46638l = this.f6646b0 ? -1 : o38VarM2719M.m17790j() ? o38VarM2719M.f53784d : o38VarM2719M.m17782b();
            View focusedChild2 = o38VarM2719M.f53781a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            k38Var.f46640n = id;
        }
        k38Var.f46634h = k38Var.f46636j && this.f6610G0;
        this.f6610G0 = false;
        this.f6609F0 = false;
        k38Var.f46633g = k38Var.f46637k;
        k38Var.f46631e = this.f6611H.mo6133a();
        m2714G(this.f6618K0);
        boolean z = k38Var.f46636j;
        u8a u8aVar = this.f6653f;
        if (z) {
            int iM22544e = u8aVar.m22544e();
            for (int i = 0; i < iM22544e; i++) {
                o38 o38VarM2699N = m2699N(u8aVar.m22543d(i));
                if (!o38VarM2699N.m17797q() && (!o38VarM2699N.m17788h() || this.f6611H.f55487b)) {
                    v28 v28Var = this.f6664k0;
                    v28.m23067b(o38VarM2699N);
                    o38VarM2699N.m17785e();
                    v28Var.getClass();
                    xp7 xp7Var = new xp7(3, (byte) 0);
                    xp7Var.m24630a(o38VarM2699N);
                    qta qtaVarM20161a = (qta) l79Var2.get(o38VarM2699N);
                    if (qtaVarM20161a == null) {
                        qtaVarM20161a = qta.m20161a();
                        l79Var2.put(o38VarM2699N, qtaVarM20161a);
                    }
                    qtaVarM20161a.f58201b = xp7Var;
                    qtaVarM20161a.f58200a |= 4;
                    if (k38Var.f46634h && o38VarM2699N.m17793m() && !o38VarM2699N.m17790j() && !o38VarM2699N.m17797q() && !o38VarM2699N.m17788h()) {
                        tk5Var.m22180f(o38VarM2699N, m2718L(o38VarM2699N));
                    }
                }
            }
        }
        if (k38Var.f46637k) {
            int iM22549j = u8aVar.m22549j();
            for (int i2 = 0; i2 < iM22549j; i2++) {
                o38 o38VarM2699N2 = m2699N(u8aVar.m22548i(i2));
                if (f6595X0 && o38VarM2699N2.f53783c == -1 && !o38VarM2699N2.m17790j()) {
                    C3386nv.m17633t("view holder cannot have position -1 unless it is removed".concat(m2710C()));
                    return;
                }
                if (!o38VarM2699N2.m17797q() && o38VarM2699N2.f53784d == -1) {
                    o38VarM2699N2.f53784d = o38VarM2699N2.f53783c;
                }
            }
            boolean z2 = k38Var.f46632f;
            k38Var.f46632f = false;
            this.f6613I.mo2628h0(this.f6647c, k38Var);
            k38Var.f46632f = z2;
            for (int i3 = 0; i3 < u8aVar.m22544e(); i3++) {
                o38 o38VarM2699N3 = m2699N(u8aVar.m22543d(i3));
                if (!o38VarM2699N3.m17797q() && ((qtaVar = (qta) l79Var2.get(o38VarM2699N3)) == null || (qtaVar.f58200a & 4) == 0)) {
                    v28.m23067b(o38VarM2699N3);
                    boolean z3 = (o38VarM2699N3.f53790j & 8192) != 0;
                    v28 v28Var2 = this.f6664k0;
                    o38VarM2699N3.m17785e();
                    v28Var2.getClass();
                    xp7 xp7Var2 = new xp7(3, (byte) 0);
                    xp7Var2.m24630a(o38VarM2699N3);
                    if (z3) {
                        m2732a0(o38VarM2699N3, xp7Var2);
                    } else {
                        qta qtaVarM20161a2 = (qta) l79Var2.get(o38VarM2699N3);
                        if (qtaVarM20161a2 == null) {
                            qtaVarM20161a2 = qta.m20161a();
                            l79Var2.put(o38VarM2699N3, qtaVarM20161a2);
                        }
                        qtaVarM20161a2.f58200a |= 2;
                        qtaVarM20161a2.f58201b = xp7Var2;
                    }
                }
            }
            m2748m();
        } else {
            m2748m();
        }
        m2727V(true);
        m2752o0(false);
        k38Var.f46630d = 2;
    }

    /* JADX INFO: renamed from: u */
    public final void m2760u() {
        m2749m0();
        m2726U();
        k38 k38Var = this.f6606C0;
        k38Var.m14788a(6);
        this.f6651e.m19747o();
        k38Var.f46631e = this.f6611H.mo6133a();
        k38Var.f46629c = 0;
        if (this.f6649d != null) {
            p28 p28Var = this.f6611H;
            int iOrdinal = p28Var.f55488c.ordinal();
            if (iOrdinal == 1 ? p28Var.mo6133a() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.f6649d.f6681c;
                if (parcelable != null) {
                    this.f6613I.mo2688j0(parcelable);
                }
                this.f6649d = null;
            }
        }
        k38Var.f46633g = false;
        this.f6613I.mo2628h0(this.f6647c, k38Var);
        k38Var.f46632f = false;
        k38Var.f46636j = k38Var.f46636j && this.f6664k0 != null;
        k38Var.f46630d = 4;
        m2727V(true);
        m2752o0(false);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m2761v(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m21423c(i, i2, i3, iArr, iArr2);
    }

    /* JADX INFO: renamed from: w */
    public final void m2762w(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m21425e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: x */
    public final void m2763x(int i, int i2) {
        this.f6652e0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        d38 d38Var = this.f6607D0;
        if (d38Var != null) {
            d38Var.mo6123b(this, i, i2);
        }
        ArrayList arrayList = this.f6608E0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((d38) this.f6608E0.get(size)).mo6123b(this, i, i2);
            }
        }
        this.f6652e0--;
    }

    /* JADX INFO: renamed from: y */
    public final void m2764y() {
        if (this.f6662j0 != null) {
            return;
        }
        EdgeEffect edgeEffectMo15775a = this.f6654f0.mo15775a(this);
        this.f6662j0 = edgeEffectMo15775a;
        if (this.f6657h) {
            edgeEffectMo15775a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo15775a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2765z() {
        if (this.f6656g0 != null) {
            return;
        }
        EdgeEffect edgeEffectMo15775a = this.f6654f0.mo15775a(this);
        this.f6656g0 = edgeEffectMo15775a;
        if (this.f6657h) {
            edgeEffectMo15775a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo15775a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        y28 y28Var = this.f6613I;
        if (y28Var != null) {
            return y28Var.mo2642t(layoutParams);
        }
        C3386nv.m17633t("RecyclerView has no LayoutManager".concat(m2710C()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
