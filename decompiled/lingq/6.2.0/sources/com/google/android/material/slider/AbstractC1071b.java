package com.google.android.material.slider;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.focus.FocusRingDrawable;
import com.lingq.core.p012ui.views.DiscreteSlider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC0853cn;
import p000.AbstractC3184kh;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3340mm;
import p000.C3386nv;
import p000.C3479q;
import p000.RunnableC3781y2;
import p000.ata;
import p000.au9;
import p000.ba0;
import p000.ca0;
import p000.d6a;
import p000.da0;
import p000.do7;
import p000.dta;
import p000.dy9;
import p000.ea0;
import p000.ea3;
import p000.fa0;
import p000.fs5;
import p000.gka;
import p000.hc2;
import p000.hm2;
import p000.i9d;
import p000.omd;
import p000.pb1;
import p000.q39;
import p000.qs5;
import p000.r39;
import p000.r46;
import p000.to2;
import p000.us9;
import p000.ux5;
import p000.v63;
import p000.vg2;
import p000.wq1;
import p000.xg2;
import p000.xwc;
import p000.ya1;

/* JADX INFO: renamed from: com.google.android.material.slider.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1071b extends View {

    /* JADX INFO: renamed from: A1 */
    public static final int f13118A1 = R$style.Widget_MaterialComponents_Slider;

    /* JADX INFO: renamed from: B1 */
    public static final int f13119B1 = R$attr.motionDurationMedium4;

    /* JADX INFO: renamed from: C1 */
    public static final int f13120C1 = R$attr.motionDurationShort3;

    /* JADX INFO: renamed from: D1 */
    public static final int f13121D1 = R$attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: E1 */
    public static final int f13122E1 = R$attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: A0 */
    public int f13123A0;

    /* JADX INFO: renamed from: B0 */
    public final int f13124B0;

    /* JADX INFO: renamed from: C0 */
    public final int f13125C0;

    /* JADX INFO: renamed from: D0 */
    public float f13126D0;

    /* JADX INFO: renamed from: E0 */
    public float f13127E0;

    /* JADX INFO: renamed from: F0 */
    public MotionEvent f13128F0;

    /* JADX INFO: renamed from: G0 */
    public final Rect f13129G0;

    /* JADX INFO: renamed from: H */
    public final ArrayList f13130H;

    /* JADX INFO: renamed from: H0 */
    public final ArrayList f13131H0;

    /* JADX INFO: renamed from: I */
    public final ArrayList f13132I;

    /* JADX INFO: renamed from: I0 */
    public List f13133I0;

    /* JADX INFO: renamed from: J */
    public boolean f13134J;

    /* JADX INFO: renamed from: J0 */
    public boolean f13135J0;

    /* JADX INFO: renamed from: K */
    public ValueAnimator f13136K;

    /* JADX INFO: renamed from: K0 */
    public float f13137K0;

    /* JADX INFO: renamed from: L */
    public ValueAnimator f13138L;

    /* JADX INFO: renamed from: L0 */
    public float f13139L0;

    /* JADX INFO: renamed from: M */
    public final int f13140M;

    /* JADX INFO: renamed from: M0 */
    public ArrayList f13141M0;

    /* JADX INFO: renamed from: N */
    public final int f13142N;

    /* JADX INFO: renamed from: N0 */
    public int f13143N0;

    /* JADX INFO: renamed from: O */
    public final int f13144O;

    /* JADX INFO: renamed from: O0 */
    public int f13145O0;

    /* JADX INFO: renamed from: P */
    public final int f13146P;

    /* JADX INFO: renamed from: P0 */
    public float f13147P0;

    /* JADX INFO: renamed from: Q */
    public final int f13148Q;

    /* JADX INFO: renamed from: Q0 */
    public int f13149Q0;

    /* JADX INFO: renamed from: R */
    public final int f13150R;

    /* JADX INFO: renamed from: R0 */
    public float[] f13151R0;

    /* JADX INFO: renamed from: S */
    public final int f13152S;

    /* JADX INFO: renamed from: S0 */
    public int f13153S0;

    /* JADX INFO: renamed from: T */
    public final int f13154T;

    /* JADX INFO: renamed from: T0 */
    public int f13155T0;

    /* JADX INFO: renamed from: U */
    public final int f13156U;

    /* JADX INFO: renamed from: U0 */
    public int f13157U0;

    /* JADX INFO: renamed from: V */
    public final int f13158V;

    /* JADX INFO: renamed from: V0 */
    public int f13159V0;

    /* JADX INFO: renamed from: W */
    public int f13160W;

    /* JADX INFO: renamed from: W0 */
    public boolean f13161W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f13162X0;

    /* JADX INFO: renamed from: Y0 */
    public ColorStateList f13163Y0;

    /* JADX INFO: renamed from: Z0 */
    public ColorStateList f13164Z0;

    /* JADX INFO: renamed from: a */
    public final Paint f13165a;

    /* JADX INFO: renamed from: a0 */
    public final int f13166a0;

    /* JADX INFO: renamed from: a1 */
    public ColorStateList f13167a1;

    /* JADX INFO: renamed from: b */
    public final Paint f13168b;

    /* JADX INFO: renamed from: b0 */
    public int f13169b0;

    /* JADX INFO: renamed from: b1 */
    public ColorStateList f13170b1;

    /* JADX INFO: renamed from: c */
    public final Paint f13171c;

    /* JADX INFO: renamed from: c0 */
    public int f13172c0;

    /* JADX INFO: renamed from: c1 */
    public ColorStateList f13173c1;

    /* JADX INFO: renamed from: d */
    public final Paint f13174d;

    /* JADX INFO: renamed from: d0 */
    public int f13175d0;

    /* JADX INFO: renamed from: d1 */
    public final Path f13176d1;

    /* JADX INFO: renamed from: e */
    public final Paint f13177e;

    /* JADX INFO: renamed from: e0 */
    public int f13178e0;

    /* JADX INFO: renamed from: e1 */
    public final RectF f13179e1;

    /* JADX INFO: renamed from: f */
    public final Paint f13180f;

    /* JADX INFO: renamed from: f0 */
    public int f13181f0;

    /* JADX INFO: renamed from: f1 */
    public final RectF f13182f1;

    /* JADX INFO: renamed from: g */
    public final Paint f13183g;

    /* JADX INFO: renamed from: g0 */
    public int f13184g0;

    /* JADX INFO: renamed from: g1 */
    public final RectF f13185g1;

    /* JADX INFO: renamed from: h */
    public final fa0 f13186h;

    /* JADX INFO: renamed from: h0 */
    public int f13187h0;

    /* JADX INFO: renamed from: h1 */
    public final RectF f13188h1;

    /* JADX INFO: renamed from: i */
    public final AccessibilityManager f13189i;

    /* JADX INFO: renamed from: i0 */
    public int f13190i0;

    /* JADX INFO: renamed from: i1 */
    public final Rect f13191i1;

    /* JADX INFO: renamed from: j */
    public ea0 f13192j;

    /* JADX INFO: renamed from: j0 */
    public int f13193j0;

    /* JADX INFO: renamed from: j1 */
    public final RectF f13194j1;

    /* JADX INFO: renamed from: k */
    public final int f13195k;

    /* JADX INFO: renamed from: k0 */
    public int f13196k0;

    /* JADX INFO: renamed from: k1 */
    public final Rect f13197k1;

    /* JADX INFO: renamed from: l */
    public final ArrayList f13198l;

    /* JADX INFO: renamed from: l0 */
    public int f13199l0;

    /* JADX INFO: renamed from: l1 */
    public final Matrix f13200l1;

    /* JADX INFO: renamed from: m0 */
    public int f13201m0;

    /* JADX INFO: renamed from: m1 */
    public final ArrayList f13202m1;

    /* JADX INFO: renamed from: n0 */
    public int f13203n0;

    /* JADX INFO: renamed from: n1 */
    public Drawable f13204n1;

    /* JADX INFO: renamed from: o0 */
    public int f13205o0;

    /* JADX INFO: renamed from: o1 */
    public List f13206o1;

    /* JADX INFO: renamed from: p0 */
    public boolean f13207p0;

    /* JADX INFO: renamed from: p1 */
    public float f13208p1;

    /* JADX INFO: renamed from: q0 */
    public Drawable f13209q0;

    /* JADX INFO: renamed from: q1 */
    public float f13210q1;

    /* JADX INFO: renamed from: r0 */
    public boolean f13211r0;

    /* JADX INFO: renamed from: r1 */
    public ColorStateList f13212r1;

    /* JADX INFO: renamed from: s0 */
    public Drawable f13213s0;

    /* JADX INFO: renamed from: s1 */
    public ColorStateList f13214s1;

    /* JADX INFO: renamed from: t0 */
    public boolean f13215t0;

    /* JADX INFO: renamed from: t1 */
    public float f13216t1;

    /* JADX INFO: renamed from: u0 */
    public ColorStateList f13217u0;

    /* JADX INFO: renamed from: u1 */
    public int f13218u1;

    /* JADX INFO: renamed from: v0 */
    public Drawable f13219v0;

    /* JADX INFO: renamed from: v1 */
    public final int f13220v1;

    /* JADX INFO: renamed from: w0 */
    public boolean f13221w0;

    /* JADX INFO: renamed from: w1 */
    public final ca0 f13222w1;

    /* JADX INFO: renamed from: x0 */
    public Drawable f13223x0;

    /* JADX INFO: renamed from: x1 */
    public final da0 f13224x1;

    /* JADX INFO: renamed from: y0 */
    public boolean f13225y0;

    /* JADX INFO: renamed from: y1 */
    public final RunnableC3781y2 f13226y1;

    /* JADX INFO: renamed from: z0 */
    public ColorStateList f13227z0;

    /* JADX INFO: renamed from: z1 */
    public boolean f13228z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v15, types: [ca0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [da0] */
    public AbstractC1071b(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3 = f13118A1;
        super(qs5.m20141b(context, attributeSet, i, i3), attributeSet, i);
        this.f13198l = new ArrayList();
        this.f13130H = new ArrayList();
        this.f13132I = new ArrayList();
        this.f13134J = false;
        this.f13193j0 = -1;
        this.f13196k0 = -1;
        this.f13199l0 = -1;
        this.f13207p0 = false;
        this.f13211r0 = false;
        this.f13215t0 = false;
        this.f13221w0 = false;
        this.f13225y0 = false;
        this.f13129G0 = new Rect();
        this.f13131H0 = new ArrayList();
        this.f13133I0 = new ArrayList();
        this.f13135J0 = false;
        this.f13141M0 = new ArrayList();
        this.f13143N0 = -1;
        this.f13145O0 = -1;
        this.f13147P0 = 0.0f;
        this.f13149Q0 = 0;
        this.f13161W0 = false;
        this.f13176d1 = new Path();
        this.f13179e1 = new RectF();
        this.f13182f1 = new RectF();
        this.f13185g1 = new RectF();
        this.f13188h1 = new RectF();
        this.f13191i1 = new Rect();
        this.f13194j1 = new RectF();
        this.f13197k1 = new Rect();
        this.f13200l1 = new Matrix();
        this.f13202m1 = new ArrayList();
        this.f13206o1 = Collections.EMPTY_LIST;
        this.f13218u1 = 0;
        this.f13222w1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: ca0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f9779a.m6178H();
            }
        };
        this.f13224x1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: da0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f35236a.m6178H();
            }
        };
        this.f13226y1 = new RunnableC3781y2(this, 7);
        Context context2 = getContext();
        this.f13228z1 = isShown();
        this.f13165a = new Paint();
        this.f13168b = new Paint();
        Paint paint = new Paint(1);
        this.f13171c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f13174d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f13177e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f13180f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f13183g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        this.f13142N = context2.getResources().getDimensionPixelSize(R$dimen.m3_slider_focus_ring_thumb_height_decrease);
        Resources resources = context2.getResources();
        this.f13166a0 = resources.getDimensionPixelSize(R$dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_slider_track_side_padding);
        this.f13144O = dimensionPixelOffset;
        this.f13178e0 = dimensionPixelOffset;
        this.f13146P = resources.getDimensionPixelSize(R$dimen.mtrl_slider_thumb_radius);
        this.f13148Q = resources.getDimensionPixelSize(R$dimen.mtrl_slider_track_height);
        this.f13150R = resources.getDimensionPixelSize(R$dimen.mtrl_slider_tick_radius);
        this.f13152S = resources.getDimensionPixelSize(R$dimen.mtrl_slider_tick_radius);
        this.f13154T = resources.getDimensionPixelSize(R$dimen.mtrl_slider_tick_min_spacing);
        this.f13125C0 = resources.getDimensionPixelSize(R$dimen.mtrl_slider_label_padding);
        this.f13124B0 = resources.getDimensionPixelOffset(R$dimen.m3_slider_track_icon_padding);
        this.f13158V = resources.getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size);
        int[] iArr = R$styleable.Slider;
        dy9.m10748a(context2, attributeSet, i, i3);
        dy9.m10749b(context2, attributeSet, iArr, i, i3, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i3);
        setOrientation(typedArrayObtainStyledAttributes.getInt(R$styleable.Slider_android_orientation, 0));
        this.f13195k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.Slider_labelStyle, R$style.Widget_MaterialComponents_Tooltip);
        this.f13137K0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.Slider_android_valueFrom, 0.0f);
        this.f13139L0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.Slider_android_valueTo, 1.0f);
        setCentered(typedArrayObtainStyledAttributes.getBoolean(R$styleable.Slider_centered, false));
        this.f13147P0 = typedArrayObtainStyledAttributes.getFloat(R$styleable.Slider_android_stepSize, 0.0f);
        this.f13149Q0 = typedArrayObtainStyledAttributes.getInt(R$styleable.Slider_continuousModeTickCount, 0);
        this.f13156U = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R$styleable.Slider_minTouchTargetSize, xwc.m24750W(context2)));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.Slider_trackColor);
        int i4 = zHasValue ? R$styleable.Slider_trackColor : R$styleable.Slider_trackColorInactive;
        int i5 = zHasValue ? R$styleable.Slider_trackColor : R$styleable.Slider_trackColorActive;
        ColorStateList colorStateListM19054x = pb1.m19054x(context2, typedArrayObtainStyledAttributes, i4);
        setTrackInactiveTintList(colorStateListM19054x == null ? do7.m10540p(context2, R$color.material_slider_inactive_track_color) : colorStateListM19054x);
        ColorStateList colorStateListM19054x2 = pb1.m19054x(context2, typedArrayObtainStyledAttributes, i5);
        setTrackActiveTintList(colorStateListM19054x2 == null ? do7.m10540p(context2, R$color.material_slider_active_track_color) : colorStateListM19054x2);
        ColorStateList colorStateListM19054x3 = pb1.m19054x(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_thumbColor);
        setThumbTintList(colorStateListM19054x3 == null ? do7.m10540p(context2, R$color.material_slider_thumb_color) : colorStateListM19054x3);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(pb1.m19054x(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R$styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateListM19054x4 = pb1.m19054x(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_haloColor);
        setHaloTintList(colorStateListM19054x4 == null ? do7.m10540p(context2, R$color.material_slider_halo_color) : colorStateListM19054x4);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.Slider_tickVisibilityMode)) {
            i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.Slider_tickVisibilityMode, -1);
        } else {
            i2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Slider_tickVisible, true) ? 0 : 2;
        }
        this.f13153S0 = i2;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R$styleable.Slider_tickColor);
        int i6 = zHasValue2 ? R$styleable.Slider_tickColor : R$styleable.Slider_tickColorInactive;
        int i7 = zHasValue2 ? R$styleable.Slider_tickColor : R$styleable.Slider_tickColorActive;
        ColorStateList colorStateListM19054x5 = pb1.m19054x(context2, typedArrayObtainStyledAttributes, i6);
        setTickInactiveTintList(colorStateListM19054x5 == null ? do7.m10540p(context2, R$color.material_slider_inactive_tick_marks_color) : colorStateListM19054x5);
        ColorStateList colorStateListM19054x6 = pb1.m19054x(context2, typedArrayObtainStyledAttributes, i7);
        setTickActiveTintList(colorStateListM19054x6 == null ? do7.m10540p(context2, R$color.material_slider_active_tick_marks_color) : colorStateListM19054x6);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_trackStopIndicatorSize, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_trackCornerSize, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_trackInsideCornerSize, 0));
        setTrackIconActiveStart(pb1.m19013A(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_trackIconActiveStart));
        setTrackIconActiveEnd(pb1.m19013A(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_trackIconActiveEnd));
        setTrackIconActiveColor(pb1.m19054x(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_trackIconActiveColor));
        setTrackIconInactiveStart(pb1.m19013A(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_trackIconInactiveStart));
        setTrackIconInactiveEnd(pb1.m19013A(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_trackIconInactiveEnd));
        setTrackIconInactiveColor(pb1.m19054x(context2, typedArrayObtainStyledAttributes, R$styleable.Slider_trackIconInactiveColor));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_trackIconSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(R$styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_tickRadiusActive, this.f13201m0 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Slider_tickRadiusInactive, this.f13201m0 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(R$styleable.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(R$styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        setValues(Float.valueOf(this.f13137K0));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        this.f13140M = ViewConfiguration.get(context2).getScaledTouchSlop();
        fa0 fa0Var = new fa0(this);
        this.f13186h = fa0Var;
        dta.m10640k(this, fa0Var);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f13189i = accessibilityManager;
        this.f13220v1 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
    }

    /* JADX INFO: renamed from: A */
    public final void m6171A(int i, int i2, Integer num) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f13202m1;
            if (i3 >= arrayList.size()) {
                m6187Q(false);
                return;
            }
            if (num == null || i3 == num.intValue()) {
                fs5 fs5Var = (fs5) arrayList.get(i3);
                to2 to2Var = new to2();
                to2 to2Var2 = new to2();
                to2 to2Var3 = new to2();
                to2 to2Var4 = new to2();
                float f = i / 2.0f;
                i9d i9dVarM15216j = AbstractC3184kh.m15216j(0);
                C3479q c3479q = new C3479q(f);
                C3479q c3479q2 = new C3479q(f);
                C3479q c3479q3 = new C3479q(f);
                C3479q c3479q4 = new C3479q(f);
                r39 r39Var = new r39();
                r39Var.f58562a = i9dVarM15216j;
                r39Var.f58563b = i9dVarM15216j;
                r39Var.f58564c = i9dVarM15216j;
                r39Var.f58565d = i9dVarM15216j;
                r39Var.f58566e = c3479q;
                r39Var.f58567f = c3479q2;
                r39Var.f58568g = c3479q3;
                r39Var.f58569h = c3479q4;
                r39Var.f58570i = to2Var;
                r39Var.f58571j = to2Var2;
                r39Var.f58572k = to2Var3;
                r39Var.f58573l = to2Var4;
                fs5Var.setShapeAppearanceModel(r39Var);
                ((fs5) arrayList.get(i3)).setBounds(0, 0, i, i2 >= 0 ? i2 : this.f13184g0);
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00be  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX INFO: renamed from: B */
    public final void m6172B(d6a d6aVar, float f) {
        int iM6212v;
        int intrinsicWidth;
        int iM6194d;
        int intrinsicHeight;
        int iM6194d2;
        Rect rect;
        ViewGroup viewGroupM12723b;
        ViewOverlay overlay;
        String str = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
        if (!TextUtils.equals(d6aVar.f35048c0, str)) {
            d6aVar.f35048c0 = str;
            d6aVar.f35051f0.f7527e = true;
            d6aVar.invalidateSelf();
        }
        boolean zM6210t = m6210t();
        int i = this.f13178e0;
        int i2 = this.f13125C0;
        if (zM6210t) {
            iM6212v = (i + ((int) (m6212v(f) * this.f13159V0))) - (d6aVar.getIntrinsicHeight() / 2);
            intrinsicWidth = d6aVar.getIntrinsicHeight() + iM6212v;
            if (m6209s()) {
                iM6194d = m6194d() - ((this.f13184g0 / 2) + i2);
                intrinsicHeight = d6aVar.getIntrinsicWidth();
            } else {
                iM6194d2 = (this.f13184g0 / 2) + i2 + m6194d();
                iM6194d = d6aVar.getIntrinsicWidth() + iM6194d2;
            }
            rect = this.f13191i1;
            rect.set(iM6212v, iM6194d2, intrinsicWidth, iM6194d);
            if (m6210t()) {
                RectF rectF = new RectF(rect);
                this.f13200l1.mapRect(rectF);
                rectF.round(rect);
            }
            hc2.m13192b(gka.m12723b(this), this, rect);
            d6aVar.setBounds(rect);
            viewGroupM12723b = gka.m12723b(this);
            if (viewGroupM12723b == null) {
                overlay = null;
            } else {
                overlay = viewGroupM12723b.getOverlay();
            }
            if (overlay == null) {
                return;
            }
            overlay.add(d6aVar);
        }
        iM6212v = (i + ((int) (m6212v(f) * this.f13159V0))) - (d6aVar.getIntrinsicWidth() / 2);
        intrinsicWidth = d6aVar.getIntrinsicWidth() + iM6212v;
        iM6194d = m6194d() - ((this.f13184g0 / 2) + i2);
        intrinsicHeight = d6aVar.getIntrinsicHeight();
        iM6194d2 = iM6194d - intrinsicHeight;
        rect = this.f13191i1;
        rect.set(iM6212v, iM6194d2, intrinsicWidth, iM6194d);
        if (m6210t()) {
            RectF rectF2 = new RectF(rect);
            this.f13200l1.mapRect(rectF2);
            rectF2.round(rect);
        }
        hc2.m13192b(gka.m12723b(this), this, rect);
        d6aVar.setBounds(rect);
        viewGroupM12723b = gka.m12723b(this);
        if (viewGroupM12723b == null) {
            overlay = null;
        } else {
            overlay = viewGroupM12723b.getOverlay();
        }
        if (overlay == null) {
            return;
        }
        overlay.add(d6aVar);
    }

    /* JADX INFO: renamed from: C */
    public final void m6173C(ArrayList arrayList) {
        ViewGroup viewGroupM12723b;
        int resourceId;
        ViewGroup viewGroupM12723b2;
        if (arrayList.isEmpty()) {
            C3386nv.m17626m("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.f13141M0.size() == arrayList.size() && this.f13141M0.equals(arrayList)) {
            return;
        }
        this.f13141M0 = arrayList;
        this.f13162X0 = true;
        ArrayList arrayList2 = this.f13202m1;
        if (arrayList2.size() != this.f13141M0.size()) {
            arrayList2.clear();
            for (int i = 0; i < this.f13141M0.size(); i++) {
                fs5 fs5Var = new fs5();
                fs5Var.m12079w();
                fs5Var.m12076t(getThumbTintList());
                to2 to2Var = new to2();
                to2 to2Var2 = new to2();
                to2 to2Var3 = new to2();
                to2 to2Var4 = new to2();
                float f = this.f13181f0 / 2.0f;
                i9d i9dVarM15216j = AbstractC3184kh.m15216j(0);
                C3479q c3479q = new C3479q(f);
                C3479q c3479q2 = new C3479q(f);
                C3479q c3479q3 = new C3479q(f);
                C3479q c3479q4 = new C3479q(f);
                r39 r39Var = new r39();
                r39Var.f58562a = i9dVarM15216j;
                r39Var.f58563b = i9dVarM15216j;
                r39Var.f58564c = i9dVarM15216j;
                r39Var.f58565d = i9dVarM15216j;
                r39Var.f58566e = c3479q;
                r39Var.f58567f = c3479q2;
                r39Var.f58568g = c3479q3;
                r39Var.f58569h = c3479q4;
                r39Var.f58570i = to2Var;
                r39Var.f58571j = to2Var2;
                r39Var.f58572k = to2Var3;
                r39Var.f58573l = to2Var4;
                fs5Var.setShapeAppearanceModel(r39Var);
                fs5Var.setBounds(0, 0, this.f13181f0, this.f13184g0);
                fs5Var.m12075s(getThumbElevation());
                fs5Var.m12053A(getThumbStrokeWidth());
                fs5Var.m12082z(getThumbStrokeColor());
                fs5Var.setState(getDrawableState());
                arrayList2.add(fs5Var);
            }
        }
        this.f13145O0 = 0;
        m6177G();
        ArrayList arrayList3 = this.f13198l;
        if (arrayList3.size() > this.f13141M0.size()) {
            List<d6a> listSubList = arrayList3.subList(this.f13141M0.size(), arrayList3.size());
            for (d6a d6aVar : listSubList) {
                if (isAttachedToWindow() && (viewGroupM12723b2 = gka.m12723b(this)) != null) {
                    viewGroupM12723b2.getOverlay().remove(d6aVar);
                    viewGroupM12723b2.removeOnLayoutChangeListener(d6aVar.f35052g0);
                }
            }
            listSubList.clear();
        }
        while (arrayList3.size() < this.f13141M0.size()) {
            Context context = getContext();
            int i2 = this.f13195k;
            d6a d6aVar2 = new d6a(context, i2);
            TypedArray typedArrayM10751d = dy9.m10751d(d6aVar2.f35049d0, null, R$styleable.Tooltip, 0, i2, new int[0]);
            Context context2 = d6aVar2.f35049d0;
            d6aVar2.f35059n0 = context2.getResources().getDimensionPixelSize(R$dimen.mtrl_tooltip_arrowSize);
            boolean z = typedArrayM10751d.getBoolean(R$styleable.Tooltip_showMarker, true);
            d6aVar2.f35058m0 = z;
            if (z) {
                q39 q39VarM20285l = d6aVar2.m12067k().m20285l();
                q39VarM20285l.f57206k = d6aVar2.m10132G();
                d6aVar2.setShapeAppearanceModel(q39VarM20285l.m19627a());
            } else {
                d6aVar2.f35059n0 = 0;
            }
            CharSequence text = typedArrayM10751d.getText(R$styleable.Tooltip_android_text);
            boolean zEquals = TextUtils.equals(d6aVar2.f35048c0, text);
            au9 au9Var = d6aVar2.f35051f0;
            if (!zEquals) {
                d6aVar2.f35048c0 = text;
                au9Var.f7527e = true;
                d6aVar2.invalidateSelf();
            }
            int i3 = R$styleable.Tooltip_android_textAppearance;
            us9 us9Var = (!typedArrayM10751d.hasValue(i3) || (resourceId = typedArrayM10751d.getResourceId(i3, 0)) == 0) ? null : new us9(context2, resourceId);
            if (us9Var != null && typedArrayM10751d.hasValue(R$styleable.Tooltip_android_textColor)) {
                us9Var.f64308k = pb1.m19054x(context2, typedArrayM10751d, R$styleable.Tooltip_android_textColor);
            }
            au9Var.m3068c(us9Var, context2);
            d6aVar2.m12076t(ColorStateList.valueOf(typedArrayM10751d.getColor(R$styleable.Tooltip_backgroundTint, ya1.m25014g(ya1.m25016i(omd.m18142c0(context2, xwc.m24751X(R$attr.colorOnBackground, context2, d6a.class.getCanonicalName())), 153), ya1.m25016i(omd.m18142c0(context2, xwc.m24751X(R.attr.colorBackground, context2, d6a.class.getCanonicalName())), 229)))));
            d6aVar2.m12081y(ColorStateList.valueOf(omd.m18142c0(context2, xwc.m24751X(R$attr.colorSurface, context2, d6a.class.getCanonicalName()))));
            d6aVar2.f35054i0 = typedArrayM10751d.getDimensionPixelSize(R$styleable.Tooltip_android_padding, 0);
            d6aVar2.f35055j0 = typedArrayM10751d.getDimensionPixelSize(R$styleable.Tooltip_android_minWidth, 0);
            d6aVar2.f35056k0 = typedArrayM10751d.getDimensionPixelSize(R$styleable.Tooltip_android_minHeight, 0);
            d6aVar2.f35057l0 = typedArrayM10751d.getDimensionPixelSize(R$styleable.Tooltip_android_layout_margin, 0);
            typedArrayM10751d.recycle();
            arrayList3.add(d6aVar2);
            if (isAttachedToWindow() && (viewGroupM12723b = gka.m12723b(this)) != null) {
                int[] iArr = new int[2];
                viewGroupM12723b.getLocationOnScreen(iArr);
                d6aVar2.f35060o0 = iArr[0];
                viewGroupM12723b.getWindowVisibleDisplayFrame(d6aVar2.f35053h0);
                viewGroupM12723b.addOnLayoutChangeListener(d6aVar2.f35052g0);
            }
        }
        int i4 = arrayList3.size() == 1 ? 0 : 1;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ((d6a) it.next()).m12053A(i4);
        }
        for (vg2 vg2Var : this.f13130H) {
            Iterator it2 = this.f13141M0.iterator();
            while (it2.hasNext()) {
                ((Float) it2.next()).getClass();
                vg2Var.m23267a(this, false);
            }
        }
        postInvalidate();
    }

    /* JADX INFO: renamed from: D */
    public final boolean m6174D(int i, float f) {
        ViewParent parent;
        this.f13145O0 = i;
        if (Math.abs(f - ((Float) this.f13141M0.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f13218u1 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - this.f13178e0) / this.f13159V0;
                float f3 = this.f13137K0;
                minSeparation = AbstractC3393o1.m17726a(f3, this.f13139L0, f2, f3);
            }
        }
        if (m6209s() || m6210t()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.f13141M0.set(i, Float.valueOf(AbstractC3584sr.m21644w(f, i3 < 0 ? this.f13137K0 : minSeparation + ((Float) this.f13141M0.get(i3)).floatValue(), i2 >= this.f13141M0.size() ? this.f13139L0 : ((Float) this.f13141M0.get(i2)).floatValue() - minSeparation)));
        for (vg2 vg2Var : this.f13130H) {
            ((Float) this.f13141M0.get(i)).getClass();
            vg2Var.m23267a(this, true);
        }
        AccessibilityManager accessibilityManager = this.f13189i;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.f13192j;
            if (runnable == null) {
                this.f13192j = new ea0(this);
            } else {
                removeCallbacks(runnable);
            }
            ea0 ea0Var = this.f13192j;
            ea0Var.f36896b = i;
            postDelayed(ea0Var, 200L);
            fa0 fa0Var = this.f13186h;
            View view = fa0Var.f68898i;
            if (i != Integer.MIN_VALUE && fa0Var.f68897h.isEnabled() && (parent = view.getParent()) != null) {
                AccessibilityEvent accessibilityEventM24717k = fa0Var.m24717k(i, 2048);
                accessibilityEventM24717k.setContentChangeTypes(0);
                parent.requestSendAccessibilityEvent(view, accessibilityEventM24717k);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final void m6175E() {
        double dRound;
        float f = this.f13216t1;
        float f2 = this.f13147P0;
        if (f2 > 0.0f) {
            int i = (int) ((this.f13139L0 - this.f13137K0) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (m6209s() || m6210t()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.f13139L0;
        float f4 = this.f13137K0;
        m6174D(this.f13143N0, (float) ((dRound * ((double) (f3 - f4))) + ((double) f4)));
    }

    /* JADX INFO: renamed from: F */
    public final void m6176F(int i, Rect rect) {
        int iM6212v = this.f13178e0 + ((int) (m6212v(getValues().get(i).floatValue()) * this.f13159V0));
        int iM6194d = m6194d();
        int iMax = Math.max(this.f13156U, this.f13158V) / 2;
        int iMax2 = Math.max(this.f13181f0 / 2, iMax);
        int iMax3 = Math.max(this.f13184g0 / 2, iMax);
        RectF rectF = new RectF(iM6212v - iMax2, iM6194d - iMax3, iM6212v + iMax2, iM6194d + iMax3);
        if (m6210t()) {
            this.f13200l1.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    /* JADX INFO: renamed from: G */
    public final void m6177G() {
        float f;
        float f2;
        float f3;
        float f4;
        RippleDrawable rippleDrawableM6204n;
        float fM6212v = (m6212v(((Float) this.f13141M0.get(this.f13145O0)).floatValue()) * this.f13159V0) + this.f13178e0;
        int iM6194d = m6194d();
        if (m6204n() != null && getMeasuredWidth() > 0 && (rippleDrawableM6204n = m6204n()) != null) {
            int i = this.f13187h0;
            float f5 = i;
            float[] fArr = {fM6212v - f5, iM6194d - i, f5 + fM6212v, i + iM6194d};
            if (m6210t()) {
                this.f13200l1.mapPoints(fArr);
            }
            rippleDrawableM6204n.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
        float f6 = iM6194d;
        FocusRingDrawable focusRingDrawableM6145c = FocusRingDrawable.m6145c(getBackground());
        if (focusRingDrawableM6145c != null) {
            float dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.m3_slider_focus_ring_padding);
            float f7 = (dimensionPixelOffset * 2.0f) + (this.f13181f0 / 2.0f);
            float f8 = (this.f13184g0 / 2.0f) + dimensionPixelOffset;
            if (m6210t()) {
                f = f6 - f8;
                float f9 = f6 + f8;
                f2 = fM6212v - f7;
                f3 = fM6212v + f7;
                f4 = f9;
            } else {
                f = fM6212v - f7;
                f4 = fM6212v + f7;
                f2 = f6 - f8;
                f3 = f6 + f8;
            }
            focusRingDrawableM6145c.mutate();
            int i2 = (int) f;
            int i3 = (int) f2;
            int i4 = (int) f4;
            int i5 = (int) f3;
            ea3 ea3Var = focusRingDrawableM6145c.f12983J;
            if (ea3Var.f36921w == null) {
                ea3Var.f36921w = new Rect();
            }
            focusRingDrawableM6145c.f12983J.f36921w.set(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m6178H() {
        float f;
        boolean zM6210t = m6210t();
        boolean zM6209s = m6209s();
        float f2 = 0.5f;
        if (zM6210t && zM6209s) {
            f = 0.5f;
            f2 = -0.2f;
        } else {
            f = 1.2f;
            if (zM6210t) {
                f2 = 1.2f;
                f = 0.5f;
            }
        }
        for (d6a d6aVar : this.f13198l) {
            d6aVar.f35063r0 = f2;
            d6aVar.f35064s0 = f;
            d6aVar.invalidateSelf();
        }
        int i = this.f13172c0;
        if (i == 0 || i == 1) {
            if (this.f13143N0 == -1 || !isEnabled()) {
                m6202l();
                return;
            } else {
                m6201k(false);
                return;
            }
        }
        if (i == 2) {
            m6202l();
            return;
        }
        if (i != 3) {
            v63.m23130h(this.f13172c0, "Unexpected labelBehavior: ");
            return;
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            gka.m12723b(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.f13228z1) {
                m6201k(true);
                return;
            }
        }
        m6202l();
    }

    /* JADX INFO: renamed from: I */
    public final void m6179I() {
        if (this.f13190i0 > 0 && this.f13204n1 == null && this.f13206o1.isEmpty()) {
            int i = this.f13181f0;
            this.f13193j0 = i;
            this.f13199l0 = this.f13184g0;
            this.f13196k0 = this.f13190i0;
            int iRound = Math.round(i * 0.5f);
            FocusRingDrawable focusRingDrawableM6145c = FocusRingDrawable.m6145c(getBackground());
            m6171A(iRound, (focusRingDrawableM6145c == null || !focusRingDrawableM6145c.f12983J.f36901c) ? -1 : this.f13184g0 - this.f13142N, Integer.valueOf(this.f13143N0));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m6180J() {
        int iMin;
        m6188R();
        float f = this.f13147P0;
        if (f <= 0.0f) {
            m6181K(this.f13149Q0);
            return;
        }
        int i = this.f13153S0;
        if (i != 0) {
            iMin = 0;
            if (i == 1) {
                int i2 = (int) (((this.f13139L0 - this.f13137K0) / f) + 1.0f);
                if (i2 <= (this.f13159V0 / this.f13154T) + 1) {
                    iMin = i2;
                }
            } else if (i != 2) {
                hm2.m13331a(this.f13153S0, "Unexpected tickVisibilityMode: ");
                return;
            }
        } else {
            iMin = Math.min((int) (((this.f13139L0 - this.f13137K0) / f) + 1.0f), (this.f13159V0 / this.f13154T) + 1);
        }
        m6181K(iMin);
    }

    /* JADX INFO: renamed from: K */
    public final void m6181K(int i) {
        if (i == 0) {
            this.f13151R0 = null;
            return;
        }
        float[] fArr = this.f13151R0;
        if (fArr == null || fArr.length != i * 2) {
            this.f13151R0 = new float[i * 2];
        }
        float f = this.f13159V0 / (i - 1);
        float fM6194d = m6194d();
        for (int i2 = 0; i2 < i * 2; i2 += 2) {
            float[] fArr2 = this.f13151R0;
            fArr2[i2] = ((i2 / 2.0f) * f) + this.f13178e0;
            fArr2[i2 + 1] = fM6194d;
        }
        if (m6210t()) {
            this.f13200l1.mapPoints(this.f13151R0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX INFO: renamed from: L */
    public final void m6182L(Canvas canvas, Paint paint, RectF rectF, float f, BaseSlider$FullCornerDirection baseSlider$FullCornerDirection) {
        float fMax;
        if (rectF.isEmpty()) {
            return;
        }
        if (this.f13141M0.isEmpty() || this.f13190i0 <= 0) {
            fMax = f;
        } else {
            float fM6190T = m6190T(((Float) this.f13141M0.get((m6209s() || m6210t()) ? this.f13141M0.size() - 1 : 0)).floatValue()) - this.f13178e0;
            if (fM6190T < f) {
                fMax = Math.max(fM6190T, this.f13205o0);
            } else {
                fMax = f;
            }
        }
        if (!this.f13141M0.isEmpty() && this.f13190i0 > 0) {
            float fM6190T2 = m6190T(((Float) this.f13141M0.get((m6209s() || m6210t()) ? 0 : this.f13141M0.size() - 1)).floatValue()) - this.f13178e0;
            float f2 = this.f13159V0;
            if (fM6190T2 > f2 - f) {
                f = Math.max(f2 - fM6190T2, this.f13205o0);
            }
        }
        int iOrdinal = baseSlider$FullCornerDirection.ordinal();
        if (iOrdinal == 1) {
            f = this.f13205o0;
        } else if (iOrdinal == 2) {
            fMax = this.f13205o0;
        } else if (iOrdinal == 3) {
            fMax = this.f13205o0;
            f = fMax;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (this.f13190i0 > 0) {
            paint.setAntiAlias(true);
        }
        RectF rectF2 = new RectF(rectF);
        boolean zM6210t = m6210t();
        Matrix matrix = this.f13200l1;
        if (zM6210t) {
            matrix.mapRect(rectF2);
        }
        Path path = this.f13176d1;
        path.reset();
        if (rectF.width() >= fMax + f) {
            path.addRoundRect(rectF2, m6210t() ? new float[]{fMax, fMax, fMax, fMax, f, f, f, f} : new float[]{fMax, fMax, f, f, f, f, fMax, fMax}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(fMax, f);
        float fMax2 = Math.max(fMax, f);
        canvas.save();
        path.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        int iOrdinal2 = baseSlider$FullCornerDirection.ordinal();
        RectF rectF3 = this.f13188h1;
        if (iOrdinal2 == 1) {
            float f3 = rectF.left;
            rectF3.set(f3, rectF.top, (2.0f * fMax2) + f3, rectF.bottom);
        } else if (iOrdinal2 != 2) {
            rectF3.set(rectF.centerX() - fMax2, rectF.top, rectF.centerX() + fMax2, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF3.set(f4 - (2.0f * fMax2), rectF.top, f4, rectF.bottom);
        }
        if (m6210t()) {
            matrix.mapRect(rectF3);
        }
        canvas.drawRoundRect(rectF3, fMax2, fMax2, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: M */
    public final void m6183M() {
        Drawable drawable = this.f13213s0;
        if (drawable != null) {
            if (!this.f13215t0 && this.f13217u0 != null) {
                this.f13213s0 = drawable.mutate();
                this.f13215t0 = true;
            }
            if (this.f13215t0) {
                this.f13213s0.setTintList(this.f13217u0);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m6184N() {
        Drawable drawable = this.f13209q0;
        if (drawable != null) {
            if (!this.f13211r0 && this.f13217u0 != null) {
                this.f13209q0 = drawable.mutate();
                this.f13211r0 = true;
            }
            if (this.f13211r0) {
                this.f13209q0.setTintList(this.f13217u0);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m6185O() {
        Drawable drawable = this.f13223x0;
        if (drawable != null) {
            if (!this.f13225y0 && this.f13227z0 != null) {
                this.f13223x0 = drawable.mutate();
                this.f13225y0 = true;
            }
            if (this.f13225y0) {
                this.f13223x0.setTintList(this.f13227z0);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m6186P() {
        Drawable drawable = this.f13219v0;
        if (drawable != null) {
            if (!this.f13221w0 && this.f13227z0 != null) {
                this.f13219v0 = drawable.mutate();
                this.f13221w0 = true;
            }
            if (this.f13221w0) {
                this.f13219v0.setTintList(this.f13227z0);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m6187Q(boolean z) {
        int paddingTop;
        int paddingBottom;
        boolean z2;
        if (m6210t()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingBottom + paddingTop;
        int iMax = Math.max(this.f13166a0, Math.max(this.f13175d0 + i, this.f13184g0 + i));
        boolean z3 = true;
        if (iMax == this.f13169b0) {
            z2 = false;
        } else {
            this.f13169b0 = iMax;
            z2 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.f13181f0 / 2) - this.f13146P, 0), Math.max((this.f13175d0 - this.f13148Q) / 2, 0)), Math.max(Math.max(this.f13155T0 - this.f13150R, 0), Math.max(this.f13157U0 - this.f13152S, 0))) + this.f13144O;
        if (this.f13178e0 == iMax2) {
            z3 = false;
        } else {
            this.f13178e0 = iMax2;
            if (isLaidOut()) {
                this.f13159V0 = Math.max((m6210t() ? getHeight() : getWidth()) - (this.f13178e0 * 2), 0);
                m6180J();
            }
        }
        if (m6210t()) {
            float fM6194d = m6194d();
            Matrix matrix = this.f13200l1;
            matrix.reset();
            matrix.setRotate(90.0f, fM6194d, fM6194d);
        }
        if (z2 || z) {
            requestLayout();
        } else if (z3) {
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m6188R() {
        if (this.f13162X0) {
            float f = this.f13137K0;
            float f2 = this.f13139L0;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + f + ") must be smaller than valueTo(" + f2 + ")");
            }
            for (Float f3 : this.f13141M0) {
                if (f3.floatValue() < this.f13137K0 || f3.floatValue() > this.f13139L0) {
                    float f4 = this.f13137K0;
                    float f5 = this.f13139L0;
                    StringBuilder sb = new StringBuilder("Slider value(");
                    sb.append(f3);
                    sb.append(") must be greater or equal to valueFrom(");
                    sb.append(f4);
                    sb.append("), and lower or equal to valueTo(");
                    C3386nv.m17633t(wq1.m24121q(sb, f5, ")"));
                    return;
                }
                if (this.f13147P0 > 0.0f && !m6189S(f3.floatValue())) {
                    float f6 = this.f13137K0;
                    float f7 = this.f13147P0;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f6 + ") plus a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            if (this.f13147P0 > 0.0f && !m6189S(this.f13139L0)) {
                float f8 = this.f13147P0;
                float f9 = this.f13137K0;
                float f10 = this.f13139L0;
                StringBuilder sb2 = new StringBuilder("The stepSize(");
                sb2.append(f8);
                sb2.append(") must be 0, or a factor of the valueFrom(");
                sb2.append(f9);
                sb2.append(")-valueTo(");
                C3386nv.m17633t(wq1.m24121q(sb2, f10, ") range"));
                return;
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f11 = this.f13147P0;
            if (f11 > 0.0f && minSeparation > 0.0f) {
                if (this.f13218u1 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + f11 + ")");
                }
                if (minSeparation < f11 || !m6206p(minSeparation)) {
                    float f12 = this.f13147P0;
                    StringBuilder sb3 = new StringBuilder("minSeparation(");
                    sb3.append(minSeparation);
                    sb3.append(") must be greater or equal and a multiple of stepSize(");
                    sb3.append(f12);
                    sb3.append(") when using stepSize(");
                    C3386nv.m17633t(wq1.m24121q(sb3, f12, ")"));
                    return;
                }
            }
            float f13 = this.f13147P0;
            if (f13 != 0.0f) {
                if (((int) f13) != f13) {
                    Log.w("b", "Floating point value used for stepSize(" + f13 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f14 = this.f13137K0;
                if (((int) f14) != f14) {
                    Log.w("b", "Floating point value used for valueFrom(" + f14 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f15 = this.f13139L0;
                if (((int) f15) != f15) {
                    Log.w("b", "Floating point value used for valueTo(" + f15 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.f13162X0 = false;
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m6189S(float f) {
        return m6206p(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.f13137K0)), MathContext.DECIMAL64).doubleValue());
    }

    /* JADX INFO: renamed from: T */
    public final float m6190T(float f) {
        return (m6212v(f) * this.f13159V0) + this.f13178e0;
    }

    /* JADX INFO: renamed from: a */
    public final void m6191a(int i, Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, this.f13184g0);
        } else {
            float fMax = Math.max(i, this.f13184g0) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6192b(Canvas canvas, RectF rectF, Drawable drawable, boolean z) {
        if (drawable != null) {
            int i = this.f13123A0;
            float f = rectF.right - rectF.left;
            int i2 = this.f13124B0;
            float f2 = (i2 * 2) + i;
            RectF rectF2 = this.f13194j1;
            if (f >= f2) {
                float f3 = z ^ (m6209s() || m6210t()) ? rectF.left + i2 : (rectF.right - i2) - i;
                float f4 = i;
                float fM6194d = m6194d() - (f4 / 2.0f);
                rectF2.set(f3, fM6194d, f3 + f4, f4 + fM6194d);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (m6210t()) {
                this.f13200l1.mapRect(rectF2);
            }
            Rect rect = this.f13197k1;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m6193c(int i) {
        if (!this.f13135J0 || i != this.f13143N0 || this.f13204n1 != null || !this.f13206o1.isEmpty()) {
            return this.f13190i0;
        }
        return this.f13190i0 - ((this.f13181f0 - Math.round(this.f13181f0 * 0.5f)) / 2);
    }

    /* JADX INFO: renamed from: d */
    public final int m6194d() {
        int i = this.f13169b0 / 2;
        int i2 = this.f13172c0;
        int intrinsicHeight = 0;
        if (i2 == 1 || i2 == 3) {
            ArrayList arrayList = this.f13198l;
            if (!arrayList.isEmpty()) {
                intrinsicHeight = ((d6a) arrayList.get(0)).getIntrinsicHeight();
            }
        }
        return i + intrinsicHeight;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f13186h.m24719m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f13165a.setColor(m6205o(this.f13173c1));
        this.f13168b.setColor(m6205o(this.f13170b1));
        this.f13177e.setColor(m6205o(this.f13167a1));
        this.f13180f.setColor(m6205o(this.f13164Z0));
        this.f13183g.setColor(m6205o(this.f13167a1));
        for (d6a d6aVar : this.f13198l) {
            if (d6aVar.isStateful()) {
                d6aVar.setState(getDrawableState());
            }
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13202m1;
            if (i >= arrayList.size()) {
                int iM6205o = m6205o(this.f13163Y0);
                Paint paint = this.f13174d;
                paint.setColor(iM6205o);
                paint.setAlpha(63);
                return;
            }
            if (((fs5) arrayList.get(i)).isStateful()) {
                ((fs5) arrayList.get(i)).setState(getDrawableState());
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final ValueAnimator m6195e(boolean z) {
        int iM20364G;
        TimeInterpolator timeInterpolatorM20365H;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.f13138L : this.f13136K;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        int i = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iM20364G = r46.m20364G(getContext(), f13119B1, 83);
            timeInterpolatorM20365H = r46.m20365H(getContext(), f13121D1, AbstractC0853cn.f10300e);
        } else {
            iM20364G = r46.m20364G(getContext(), f13120C1, 117);
            timeInterpolatorM20365H = r46.m20365H(getContext(), f13122E1, AbstractC0853cn.f10298c);
        }
        valueAnimatorOfFloat.setDuration(iM20364G);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorM20365H);
        valueAnimatorOfFloat.addUpdateListener(new ba0(this, i));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: f */
    public final void m6196f(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF, BaseSlider$FullCornerDirection baseSlider$FullCornerDirection, int i) {
        if (f2 - f > getTrackCornerSize() - i) {
            rectF.set(f, f3, f2, f4);
        } else {
            rectF.setEmpty();
        }
        m6182L(canvas, this.f13165a, rectF, getTrackCornerSize(), baseSlider$FullCornerDirection);
    }

    /* JADX INFO: renamed from: g */
    public final void m6197g(Canvas canvas, float f, float f2) {
        for (int i = 0; i < this.f13141M0.size(); i++) {
            float fM6190T = m6190T(((Float) this.f13141M0.get(i)).floatValue());
            float fM6193c = (this.f13181f0 / 2.0f) + m6193c(i);
            if (f >= fM6190T - fM6193c && f <= fM6190T + fM6193c) {
                return;
            }
        }
        boolean zM6210t = m6210t();
        Paint paint = this.f13183g;
        if (zM6210t) {
            canvas.drawPoint(f2, f, paint);
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f13186h.f68900k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract float getThumbElevation();

    public abstract int getThumbRadius();

    public abstract ColorStateList getThumbStrokeColor();

    public abstract float getThumbStrokeWidth();

    public abstract ColorStateList getThumbTintList();

    public abstract int getTrackCornerSize();

    public abstract float getValueFrom();

    public abstract float getValueTo();

    public List<Float> getValues() {
        return new ArrayList(this.f13141M0);
    }

    /* JADX INFO: renamed from: h */
    public final void m6198h(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        if (m6210t()) {
            canvas.concat(this.f13200l1);
        }
        canvas.translate((this.f13178e0 + ((int) (m6212v(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX INFO: renamed from: i */
    public final void m6199i(int i, int i2, Canvas canvas, Paint paint) {
        while (i < i2) {
            boolean zM6210t = m6210t();
            float[] fArr = this.f13151R0;
            float f = zM6210t ? fArr[i + 1] : fArr[i];
            int i3 = 0;
            while (true) {
                if (i3 >= this.f13141M0.size()) {
                    if (!this.f13207p0) {
                        float[] fArr2 = this.f13151R0;
                        canvas.drawPoint(fArr2[i], fArr2[i + 1], paint);
                        break;
                        break;
                    }
                    float f2 = ((this.f13178e0 * 2) + this.f13159V0) / 2.0f;
                    float f3 = this.f13190i0;
                    if (f >= f2 - f3 && f <= f2 + f3) {
                        break;
                    }
                    float[] fArr3 = this.f13151R0;
                    canvas.drawPoint(fArr3[i], fArr3[i + 1], paint);
                    break;
                }
                float fM6190T = m6190T(((Float) this.f13141M0.get(i3)).floatValue());
                float fM6193c = (this.f13181f0 / 2.0f) + m6193c(i3);
                if (f >= fM6190T - fM6193c && f <= fM6190T + fM6193c) {
                    break;
                } else {
                    i3++;
                }
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6200j(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.f13209q0 == null && this.f13213s0 == null && this.f13219v0 == null && this.f13223x0 == null) {
            return;
        }
        if (this.f13141M0.size() > 1) {
            Log.w("b", "Track icons can only be used when only 1 thumb is present.");
        }
        m6192b(canvas, rectF, this.f13209q0, true);
        m6192b(canvas, rectF2, this.f13219v0, true);
        m6192b(canvas, rectF, this.f13213s0, false);
        m6192b(canvas, rectF2, this.f13223x0, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m6201k(boolean z) {
        if (!this.f13134J) {
            this.f13134J = true;
            ValueAnimator valueAnimatorM6195e = m6195e(true);
            this.f13136K = valueAnimatorM6195e;
            this.f13138L = null;
            valueAnimatorM6195e.start();
        }
        ArrayList arrayList = this.f13198l;
        Iterator it = arrayList.iterator();
        if (z) {
            for (int i = 0; i < this.f13141M0.size() && it.hasNext(); i++) {
                if (i != this.f13145O0) {
                    m6172B((d6a) it.next(), ((Float) this.f13141M0.get(i)).floatValue());
                }
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f13141M0.size())));
        }
        m6172B((d6a) it.next(), ((Float) this.f13141M0.get(this.f13145O0)).floatValue());
    }

    /* JADX INFO: renamed from: l */
    public final void m6202l() {
        if (this.f13134J) {
            this.f13134J = false;
            ValueAnimator valueAnimatorM6195e = m6195e(false);
            this.f13138L = valueAnimatorM6195e;
            this.f13136K = null;
            valueAnimatorM6195e.addListener(new C3340mm(this, 1));
            this.f13138L.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public final float[] m6203m() {
        float fFloatValue = ((Float) this.f13141M0.get(0)).floatValue();
        float fFloatValue2 = ((Float) AbstractC3393o1.m17731f(1, this.f13141M0)).floatValue();
        if (this.f13141M0.size() == 1) {
            fFloatValue = this.f13137K0;
        }
        float fM6212v = m6212v(fFloatValue);
        float fM6212v2 = m6212v(fFloatValue2);
        if (this.f13207p0) {
            float fMin = Math.min(0.5f, fM6212v2);
            fM6212v2 = Math.max(0.5f, fM6212v2);
            fM6212v = fMin;
        }
        return (this.f13207p0 || !(m6209s() || m6210t())) ? new float[]{fM6212v, fM6212v2} : new float[]{fM6212v2, fM6212v};
    }

    /* JADX INFO: renamed from: n */
    public final RippleDrawable m6204n() {
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            return (RippleDrawable) background;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final int m6205o(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13228z1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.f13222w1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f13224x1);
        for (d6a d6aVar : this.f13198l) {
            ViewGroup viewGroupM12723b = gka.m12723b(this);
            if (viewGroupM12723b == null) {
                d6aVar.getClass();
            } else {
                d6aVar.getClass();
                int[] iArr = new int[2];
                viewGroupM12723b.getLocationOnScreen(iArr);
                d6aVar.f35060o0 = iArr[0];
                viewGroupM12723b.getWindowVisibleDisplayFrame(d6aVar.f35053h0);
                viewGroupM12723b.addOnLayoutChangeListener(d6aVar.f35052g0);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ea0 ea0Var = this.f13192j;
        if (ea0Var != null) {
            removeCallbacks(ea0Var);
        }
        this.f13134J = false;
        for (d6a d6aVar : this.f13198l) {
            ViewGroup viewGroupM12723b = gka.m12723b(this);
            if (viewGroupM12723b != null) {
                viewGroupM12723b.getOverlay().remove(d6aVar);
                viewGroupM12723b.removeOnLayoutChangeListener(d6aVar.f35052g0);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f13222w1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f13224x1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a7  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iM6193c;
        int iM6193c2;
        BaseSlider$FullCornerDirection baseSlider$FullCornerDirection;
        int i;
        int iM6193c3;
        float f;
        float f2;
        int i2;
        AbstractC1071b abstractC1071b = this;
        if (abstractC1071b.f13162X0) {
            abstractC1071b.m6188R();
            abstractC1071b.m6180J();
        }
        super.onDraw(canvas);
        int iM6194d = abstractC1071b.m6194d();
        int i3 = abstractC1071b.f13159V0;
        float[] fArrM6203m = abstractC1071b.m6203m();
        float f3 = iM6194d;
        float f4 = abstractC1071b.f13175d0 / 2.0f;
        float f5 = f3 - f4;
        float f6 = f4 + f3;
        float f7 = 0.5f;
        int i4 = 0;
        if (abstractC1071b.f13207p0 && fArrM6203m[0] == 0.5f) {
            iM6193c = abstractC1071b.f13190i0;
        } else {
            iM6193c = abstractC1071b.m6193c((abstractC1071b.m6209s() || abstractC1071b.m6210t()) ? abstractC1071b.f13141M0.size() - 1 : 0);
        }
        int i5 = iM6193c;
        float trackCornerSize = abstractC1071b.f13178e0 - abstractC1071b.getTrackCornerSize();
        float f8 = i3;
        float f9 = ((fArrM6203m[0] * f8) + abstractC1071b.f13178e0) - i5;
        BaseSlider$FullCornerDirection baseSlider$FullCornerDirection2 = BaseSlider$FullCornerDirection.LEFT;
        RectF rectF = abstractC1071b.f13182f1;
        abstractC1071b.m6196f(trackCornerSize, f9, f5, f6, canvas, rectF, baseSlider$FullCornerDirection2, i5);
        if (abstractC1071b.f13207p0 && fArrM6203m[1] == 0.5f) {
            iM6193c2 = abstractC1071b.f13190i0;
        } else {
            iM6193c2 = abstractC1071b.m6193c((abstractC1071b.m6209s() || abstractC1071b.m6210t()) ? 0 : abstractC1071b.f13141M0.size() - 1);
        }
        int i6 = iM6193c2;
        int i7 = abstractC1071b.f13178e0;
        float f10 = (fArrM6203m[1] * f8) + i7 + i6;
        int trackCornerSize2 = abstractC1071b.getTrackCornerSize();
        BaseSlider$FullCornerDirection baseSlider$FullCornerDirection3 = BaseSlider$FullCornerDirection.RIGHT;
        RectF rectF2 = abstractC1071b.f13185g1;
        abstractC1071b.m6196f(f10, trackCornerSize2 + i7 + i3, f5, f6, canvas, rectF2, baseSlider$FullCornerDirection3, i6);
        int i8 = abstractC1071b.f13159V0;
        float[] fArrM6203m2 = abstractC1071b.m6203m();
        float f11 = abstractC1071b.f13178e0;
        float f12 = i8;
        float f13 = (fArrM6203m2[1] * f12) + f11;
        float fM6193c = (fArrM6203m2[0] * f12) + f11;
        int i9 = 2;
        float fM6190T = f13;
        RectF rectF3 = abstractC1071b.f13179e1;
        if (fM6193c >= f13) {
            rectF3.setEmpty();
        } else {
            BaseSlider$FullCornerDirection baseSlider$FullCornerDirection4 = BaseSlider$FullCornerDirection.NONE;
            if (abstractC1071b.f13141M0.size() != 1 || abstractC1071b.f13207p0) {
                baseSlider$FullCornerDirection = baseSlider$FullCornerDirection4;
            } else {
                if (!abstractC1071b.m6209s() && !abstractC1071b.m6210t()) {
                    baseSlider$FullCornerDirection3 = baseSlider$FullCornerDirection2;
                }
                baseSlider$FullCornerDirection = baseSlider$FullCornerDirection3;
            }
            int i10 = 0;
            while (i10 < abstractC1071b.f13141M0.size()) {
                if (abstractC1071b.f13141M0.size() > 1) {
                    fM6190T = i10 > 0 ? abstractC1071b.m6190T(((Float) abstractC1071b.f13141M0.get(i10 - 1)).floatValue()) : fM6193c;
                    float fM6190T2 = abstractC1071b.m6190T(((Float) abstractC1071b.f13141M0.get(i10)).floatValue());
                    if (abstractC1071b.m6209s() || abstractC1071b.m6210t()) {
                        fM6193c = fM6190T2;
                    } else {
                        fM6193c = fM6190T;
                        fM6190T = fM6190T2;
                    }
                }
                int trackCornerSize3 = abstractC1071b.getTrackCornerSize();
                float f14 = f7;
                int iOrdinal = baseSlider$FullCornerDirection.ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal != i9) {
                        i = i9;
                        if (iOrdinal == 3) {
                            if (i10 > 0) {
                                fM6193c += abstractC1071b.m6193c(i10 - 1);
                                iM6193c3 = abstractC1071b.m6193c(i10);
                            } else if (fArrM6203m2[1] == f14) {
                                fM6193c += abstractC1071b.m6193c(i10);
                            } else if (fArrM6203m2[0] == f14) {
                                iM6193c3 = abstractC1071b.m6193c(i10);
                            }
                        }
                    } else {
                        i = i9;
                        fM6193c += abstractC1071b.m6193c(i10);
                        fM6190T += trackCornerSize3;
                    }
                    f = fM6190T;
                    f2 = fM6193c;
                    if (f2 >= f) {
                        rectF3.setEmpty();
                    } else {
                        float f15 = abstractC1071b.f13175d0 / 2.0f;
                        rectF3.set(f2, f3 - f15, f, f15 + f3);
                        abstractC1071b.m6182L(canvas, abstractC1071b.f13168b, rectF3, trackCornerSize3, baseSlider$FullCornerDirection);
                    }
                    i10++;
                    fM6190T = f;
                    fM6193c = f2;
                    f7 = f14;
                    i9 = i;
                } else {
                    i = i9;
                    fM6193c -= trackCornerSize3;
                    iM6193c3 = abstractC1071b.m6193c(i10);
                }
                fM6190T -= iM6193c3;
                f = fM6190T;
                f2 = fM6193c;
                if (f2 >= f) {
                    rectF3.setEmpty();
                } else {
                    float f16 = abstractC1071b.f13175d0 / 2.0f;
                    rectF3.set(f2, f3 - f16, f, f16 + f3);
                    abstractC1071b.m6182L(canvas, abstractC1071b.f13168b, rectF3, trackCornerSize3, baseSlider$FullCornerDirection);
                }
                i10++;
                fM6190T = f;
                fM6193c = f2;
                f7 = f14;
                i9 = i;
            }
        }
        Canvas canvas2 = canvas;
        int i11 = i9;
        if (abstractC1071b.m6209s() || abstractC1071b.m6210t()) {
            abstractC1071b.m6200j(canvas2, rectF3, rectF);
        } else {
            abstractC1071b.m6200j(canvas2, rectF3, rectF2);
        }
        float[] fArr = abstractC1071b.f13151R0;
        if (fArr != null && fArr.length != 0) {
            float[] fArrM6203m3 = abstractC1071b.m6203m();
            int iCeil = (int) Math.ceil(((abstractC1071b.f13151R0.length / 2.0f) - 1.0f) * fArrM6203m3[0]);
            int iFloor = (int) Math.floor(((abstractC1071b.f13151R0.length / 2.0f) - 1.0f) * fArrM6203m3[1]);
            Paint paint = abstractC1071b.f13177e;
            if (iCeil > 0) {
                abstractC1071b.m6199i(0, iCeil * 2, canvas2, paint);
            }
            if (iCeil <= iFloor) {
                abstractC1071b.m6199i(iCeil * 2, (iFloor + 1) * 2, canvas2, abstractC1071b.f13180f);
            }
            int i12 = (iFloor + 1) * 2;
            float[] fArr2 = abstractC1071b.f13151R0;
            if (i12 < fArr2.length) {
                abstractC1071b.m6199i(i12, fArr2.length, canvas2, paint);
            }
        }
        if (abstractC1071b.f13201m0 > 0 && !abstractC1071b.f13141M0.isEmpty()) {
            float fFloatValue = ((Float) AbstractC3393o1.m17731f(1, abstractC1071b.f13141M0)).floatValue();
            float f17 = abstractC1071b.f13139L0;
            if (fFloatValue < f17) {
                abstractC1071b.m6197g(canvas2, abstractC1071b.m6190T(f17), f3);
            }
            if (abstractC1071b.f13207p0 || (abstractC1071b.f13141M0.size() > 1 && ((Float) abstractC1071b.f13141M0.get(0)).floatValue() > abstractC1071b.f13137K0)) {
                abstractC1071b.m6197g(canvas2, abstractC1071b.m6190T(abstractC1071b.f13137K0), f3);
            }
        }
        if ((abstractC1071b.f13135J0 || abstractC1071b.isFocused()) && abstractC1071b.isEnabled()) {
            int i13 = abstractC1071b.f13159V0;
            if (abstractC1071b.m6204n() == null) {
                float fM6212v = (abstractC1071b.m6212v(((Float) abstractC1071b.f13141M0.get(abstractC1071b.f13145O0)).floatValue()) * i13) + abstractC1071b.f13178e0;
                float[] fArr3 = new float[i11];
                fArr3[0] = fM6212v;
                fArr3[1] = f3;
                if (abstractC1071b.m6210t()) {
                    abstractC1071b.f13200l1.mapPoints(fArr3);
                }
                canvas2.drawCircle(fArr3[0], fArr3[1], abstractC1071b.f13187h0, abstractC1071b.f13174d);
            }
        }
        abstractC1071b.m6178H();
        int i14 = abstractC1071b.f13159V0;
        while (i4 < abstractC1071b.f13141M0.size()) {
            float fFloatValue2 = ((Float) abstractC1071b.f13141M0.get(i4)).floatValue();
            Drawable drawable = abstractC1071b.f13204n1;
            if (drawable != null) {
                i2 = iM6194d;
                abstractC1071b.m6198h(canvas2, i14, i2, fFloatValue2, drawable);
            } else {
                i2 = iM6194d;
                if (i4 < abstractC1071b.f13206o1.size()) {
                    abstractC1071b.m6198h(canvas, i14, i2, fFloatValue2, (Drawable) abstractC1071b.f13206o1.get(i4));
                } else {
                    if (!abstractC1071b.isEnabled()) {
                        canvas.drawCircle((abstractC1071b.m6212v(fFloatValue2) * i14) + abstractC1071b.f13178e0, f3, abstractC1071b.getThumbRadius(), abstractC1071b.f13171c);
                    }
                    abstractC1071b.m6198h(canvas, i14, i2, fFloatValue2, (Drawable) abstractC1071b.f13202m1.get(i4));
                }
            }
            i4++;
            abstractC1071b = this;
            canvas2 = canvas;
            iM6194d = i2;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        fa0 fa0Var = this.f13186h;
        if (!z) {
            m6215z();
            this.f13143N0 = -1;
            fa0Var.m24716j(this.f13145O0);
            return;
        }
        if (this.f13143N0 == -1) {
            int i2 = Integer.MAX_VALUE;
            if (i == 1) {
                m6211u(Integer.MAX_VALUE);
            } else if (i == 2) {
                m6211u(Integer.MIN_VALUE);
            } else if (i == 17) {
                m6211u((m6209s() || m6210t()) ? -2147483647 : Integer.MAX_VALUE);
            } else if (i == 66) {
                if (!m6209s() && !m6210t()) {
                    i2 = Integer.MIN_VALUE;
                }
                m6211u(i2);
            }
            this.f13143N0 = this.f13145O0;
        }
        m6215z();
        m6179I();
        fa0Var.m24722v(this.f13145O0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Float fValueOf;
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f13143N0 = this.f13145O0;
        boolean zIsLongPress = this.f13161W0 | keyEvent.isLongPress();
        this.f13161W0 = zIsLongPress;
        float fRound = this.f13147P0;
        if (zIsLongPress) {
            if (fRound == 0.0f) {
                fRound = 1.0f;
            }
            float f = (this.f13139L0 - this.f13137K0) / fRound;
            if (f > 20.0f) {
                fRound *= Math.round(f / 20.0f);
            }
        } else if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if (i == 21) {
            if (!m6209s()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 22) {
            if (m6209s()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i != 69) {
            fValueOf = (i == 70 || i == 81) ? Float.valueOf(fRound) : null;
        } else {
            fValueOf = Float.valueOf(-fRound);
        }
        if (fValueOf != null) {
            if (m6174D(this.f13143N0, fValueOf.floatValue() + ((Float) this.f13141M0.get(this.f13143N0)).floatValue())) {
                m6177G();
                postInvalidate();
            }
            return true;
        }
        if (i != 61) {
            return super.onKeyDown(i, keyEvent);
        }
        m6215z();
        if (keyEvent.hasNoModifiers()) {
            return m6211u(1);
        }
        if (keyEvent.isShiftPressed()) {
            return m6211u(-1);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f13161W0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.f13129G0;
        rect.left = 0;
        rect.top = 0;
        rect.right = i3 - i;
        rect.bottom = i4 - i2;
        ArrayList arrayList = this.f13131H0;
        if (!arrayList.contains(rect)) {
            arrayList.add(rect);
        }
        WeakHashMap weakHashMap = dta.f36217a;
        ata.m3036c(this, arrayList);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f13172c0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f13169b0 + ((i3 == 1 || i3 == 3) ? ((d6a) this.f13198l.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (m6210t()) {
            super.onMeasure(iMakeMeasureSpec, i2);
        } else {
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        BaseSlider$SliderState baseSlider$SliderState = (BaseSlider$SliderState) parcelable;
        super.onRestoreInstanceState(baseSlider$SliderState.getSuperState());
        this.f13137K0 = baseSlider$SliderState.f13109a;
        this.f13139L0 = baseSlider$SliderState.f13110b;
        m6173C(baseSlider$SliderState.f13111c);
        this.f13147P0 = baseSlider$SliderState.f13112d;
        if (baseSlider$SliderState.f13113e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        BaseSlider$SliderState baseSlider$SliderState = new BaseSlider$SliderState(super.onSaveInstanceState());
        baseSlider$SliderState.f13109a = this.f13137K0;
        baseSlider$SliderState.f13110b = this.f13139L0;
        baseSlider$SliderState.f13111c = new ArrayList(this.f13141M0);
        baseSlider$SliderState.f13112d = this.f13147P0;
        baseSlider$SliderState.f13113e = hasFocus();
        return baseSlider$SliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (m6210t()) {
            i = i2;
        }
        this.f13159V0 = Math.max(i - (this.f13178e0 * 2), 0);
        m6180J();
        m6177G();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            float y = m6210t() ? motionEvent.getY() : motionEvent.getX();
            float x = m6210t() ? motionEvent.getX() : motionEvent.getY();
            float f = (y - this.f13178e0) / this.f13159V0;
            this.f13216t1 = f;
            float fMax = Math.max(0.0f, f);
            this.f13216t1 = fMax;
            this.f13216t1 = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i = this.f13140M;
                if (actionMasked == 1) {
                    this.f13135J0 = false;
                    MotionEvent motionEvent2 = this.f13128F0;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        float f2 = i;
                        if (Math.abs(this.f13128F0.getX() - motionEvent.getX()) <= f2 && Math.abs(this.f13128F0.getY() - motionEvent.getY()) <= f2 && mo6170y()) {
                            m6213w();
                        }
                    }
                    if (this.f13143N0 != -1) {
                        m6175E();
                        m6177G();
                        m6215z();
                        this.f13143N0 = -1;
                        m6214x();
                    }
                    invalidate();
                } else if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.f13135J0 = false;
                        if (this.f13143N0 != -1 && !this.f13133I0.isEmpty()) {
                            for (int i2 = 0; i2 < this.f13141M0.size(); i2++) {
                                if (i2 == this.f13143N0) {
                                    m6174D(i2, ((Float) this.f13133I0.get(i2)).floatValue());
                                    break;
                                }
                            }
                        }
                        m6177G();
                        m6215z();
                        this.f13143N0 = -1;
                        m6214x();
                        invalidate();
                    }
                } else if (this.f13135J0) {
                    m6175E();
                    m6177G();
                    invalidate();
                } else if ((m6210t() || !m6208r(motionEvent) || Math.abs(y - this.f13126D0) >= i) && (!m6210t() || !m6207q(motionEvent) || Math.abs(x - this.f13127E0) >= i * 0.8f)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (mo6170y()) {
                        this.f13135J0 = true;
                        m6179I();
                        m6213w();
                        m6175E();
                        m6177G();
                        invalidate();
                    }
                }
            } else {
                this.f13126D0 = y;
                this.f13127E0 = x;
                this.f13133I0.clear();
                this.f13133I0 = getValues();
                if ((m6210t() || !m6208r(motionEvent)) && (!m6210t() || !m6207q(motionEvent))) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (mo6170y()) {
                        requestFocus();
                        this.f13135J0 = true;
                        m6179I();
                        m6213w();
                        m6175E();
                        m6177G();
                        invalidate();
                    }
                }
            }
            setPressed(this.f13135J0);
            this.f13128F0 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.f13228z1 = z;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup viewGroupM12723b = gka.m12723b(this);
            ViewOverlay overlay = viewGroupM12723b == null ? null : viewGroupM12723b.getOverlay();
            if (overlay == null) {
                return;
            }
            Iterator it = this.f13198l.iterator();
            while (it.hasNext()) {
                overlay.remove((d6a) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m6206p(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.f13147P0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m6207q(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m6208r(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m6209s() {
        return getLayoutDirection() == 1;
    }

    public void setActiveThumbIndex(int i) {
        this.f13143N0 = i;
    }

    public void setCentered(boolean z) {
        if (this.f13207p0 == z) {
            return;
        }
        this.f13207p0 = z;
        float f = this.f13137K0;
        if (z) {
            setValues(Float.valueOf((f + this.f13139L0) / 2.0f));
        } else {
            setValues(Float.valueOf(f));
        }
        m6187Q(true);
    }

    public void setContinuousModeTickCount(int i) {
        if (i < 0) {
            C3386nv.m17626m(ux5.m22989l("The continuousModeTickCount(", i, ") must be greater than or equal to 0"));
        } else if (this.f13149Q0 != i) {
            this.f13149Q0 = i;
            this.f13162X0 = true;
            postInvalidate();
        }
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f13204n1 = null;
        this.f13206o1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f13206o1;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            m6191a(this.f13181f0, drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f13141M0.size()) {
            C3386nv.m17626m("index out of range");
            return;
        }
        this.f13145O0 = i;
        this.f13186h.m24722v(i);
        postInvalidate();
    }

    public abstract void setHaloRadius(int i);

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f13163Y0)) {
            return;
        }
        this.f13163Y0 = colorStateList;
        RippleDrawable rippleDrawableM6204n = m6204n();
        if (m6204n() != null && rippleDrawableM6204n != null) {
            rippleDrawableM6204n.setColor(colorStateList);
            return;
        }
        int iM6205o = m6205o(colorStateList);
        Paint paint = this.f13174d;
        paint.setColor(iM6205o);
        paint.setAlpha(63);
        invalidate();
    }

    public abstract void setLabelBehavior(int i);

    public abstract void setOrientation(int i);

    public void setSeparationUnit(int i) {
        this.f13218u1 = i;
        this.f13162X0 = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.f13147P0 != f) {
                this.f13147P0 = f;
                this.f13162X0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        float f2 = this.f13137K0;
        float f3 = this.f13139L0;
        StringBuilder sb = new StringBuilder("The stepSize(");
        sb.append(f);
        sb.append(") must be 0, or a factor of the valueFrom(");
        sb.append(f2);
        sb.append(")-valueTo(");
        C3386nv.m17626m(wq1.m24121q(sb, f3, ") range"));
    }

    public void setThumbElevation(float f) {
        if (f == this.f13208p1) {
            return;
        }
        this.f13208p1 = f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13202m1;
            if (i >= arrayList.size()) {
                return;
            }
            ((fs5) arrayList.get(i)).m12075s(this.f13208p1);
            i++;
        }
    }

    public void setThumbHeight(int i) {
        if (i == this.f13184g0) {
            return;
        }
        this.f13184g0 = i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f13202m1;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((fs5) arrayList.get(i2)).setBounds(0, 0, this.f13181f0, this.f13184g0);
            i2++;
        }
        Drawable drawable = this.f13204n1;
        if (drawable != null) {
            m6191a(this.f13181f0, drawable);
        }
        Iterator it = this.f13206o1.iterator();
        while (it.hasNext()) {
            m6191a(this.f13181f0, (Drawable) it.next());
        }
        m6187Q(false);
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        if (colorStateList == this.f13212r1) {
            return;
        }
        this.f13212r1 = colorStateList;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13202m1;
            if (i >= arrayList.size()) {
                postInvalidate();
                return;
            } else {
                ((fs5) arrayList.get(i)).m12081y(colorStateList);
                i++;
            }
        }
    }

    public void setThumbStrokeWidth(float f) {
        if (f == this.f13210q1) {
            return;
        }
        this.f13210q1 = f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13202m1;
            if (i >= arrayList.size()) {
                postInvalidate();
                return;
            } else {
                ((fs5) arrayList.get(i)).m12053A(f);
                i++;
            }
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f13214s1)) {
            return;
        }
        this.f13214s1 = colorStateList;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13202m1;
            if (i >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((fs5) arrayList.get(i)).m12076t(this.f13214s1);
                i++;
            }
        }
    }

    public abstract void setThumbTrackGapSize(int i);

    public void setThumbWidth(int i) {
        if (i == this.f13181f0) {
            return;
        }
        this.f13181f0 = i;
        Drawable drawable = this.f13204n1;
        if (drawable != null) {
            m6191a(i, drawable);
        }
        for (int i2 = 0; i2 < this.f13206o1.size(); i2++) {
            m6191a(i, (Drawable) this.f13206o1.get(i2));
        }
        m6171A(i, -1, null);
    }

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackCornerSize(int i);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackIconActiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconActiveEnd(Drawable drawable);

    public abstract void setTrackIconActiveStart(Drawable drawable);

    public abstract void setTrackIconInactiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconInactiveEnd(Drawable drawable);

    public abstract void setTrackIconInactiveStart(Drawable drawable);

    public abstract void setTrackIconSize(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        m6173C(arrayList);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m6210t() {
        return this.f13160W == 1;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m6211u(int i) {
        int i2 = this.f13145O0;
        long j = ((long) i2) + ((long) i);
        long size = this.f13141M0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.f13145O0 = i3;
        if (i3 == i2) {
            return false;
        }
        this.f13143N0 = i3;
        m6179I();
        m6177G();
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final float m6212v(float f) {
        float f2 = this.f13137K0;
        float f3 = (f - f2) / (this.f13139L0 - f2);
        return (m6209s() || m6210t()) ? 1.0f - f3 : f3;
    }

    /* JADX INFO: renamed from: w */
    public final void m6213w() {
        Iterator it = this.f13132I.iterator();
        while (it.hasNext()) {
            ((xg2) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m6214x() {
        Iterator it = this.f13132I.iterator();
        while (it.hasNext()) {
            ((xg2) it.next()).getClass();
            int i = DiscreteSlider.f24179k;
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean mo6170y() {
        if (this.f13143N0 != -1) {
            return true;
        }
        float f = this.f13216t1;
        if (m6209s() || m6210t()) {
            f = 1.0f - f;
        }
        float f2 = this.f13139L0;
        float f3 = this.f13137K0;
        float fM17726a = AbstractC3393o1.m17726a(f2, f3, f, f3);
        float fM6190T = m6190T(fM17726a);
        this.f13143N0 = 0;
        float fAbs = Math.abs(((Float) this.f13141M0.get(0)).floatValue() - fM17726a);
        for (int i = 1; i < this.f13141M0.size(); i++) {
            float fAbs2 = Math.abs(((Float) this.f13141M0.get(i)).floatValue() - fM17726a);
            float fM6190T2 = m6190T(((Float) this.f13141M0.get(i)).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z = m6209s() || m6210t() ? fM6190T2 - fM6190T > 0.0f : fM6190T2 - fM6190T < 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f13143N0 = i;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fM6190T2 - fM6190T) < this.f13140M) {
                        this.f13143N0 = -1;
                        return false;
                    }
                    if (z) {
                        this.f13143N0 = i;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f13143N0 != -1;
    }

    /* JADX INFO: renamed from: z */
    public final void m6215z() {
        int i;
        if (this.f13190i0 <= 0 || (i = this.f13193j0) == -1 || this.f13196k0 == -1) {
            return;
        }
        m6171A(i, this.f13199l0, Integer.valueOf(this.f13143N0));
    }

    public void setValues(List<Float> list) {
        m6173C(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }
}
