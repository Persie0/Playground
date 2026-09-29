package com.google.android.material.slider;

import ae.C0062b;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
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
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.activity.result.C0204c;
import com.google.android.material.slider.BaseSlider;
import com.linguist.R;
import dm.C5206f;
import gd.C5768g;
import gd.C5772k;
import id.C6318c;
import id.InterfaceC6316a;
import id.InterfaceC6317b;
import id.InterfaceC6319d;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import md.C7542a;
import p072dd.C5150c;
import p072dd.C5151d;
import p084e3.AbstractC5363a;
import p153hc.C6031a;
import p177ic.C6308a;
import p254m2.C7472a;
import p277nd.C7739a;
import p312p2.C8169a;
import p329q2.C8488a;
import p387t0.C9166r;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.C10284f;
import p507yc.C10336c;
import p507yc.C10341h;
import p507yc.C10344k;
import p507yc.C10347n;
import p531zc.C10477a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends InterfaceC6316a<S>, T extends InterfaceC6317b<S>> extends View {

    /* JADX INFO: renamed from: A0 */
    public List<Drawable> f15468A0;

    /* JADX INFO: renamed from: B0 */
    public float f15469B0;

    /* JADX INFO: renamed from: C0 */
    public int f15470C0;

    /* JADX INFO: renamed from: H */
    public final ArrayList f15471H;

    /* JADX INFO: renamed from: I */
    public boolean f15472I;

    /* JADX INFO: renamed from: J */
    public ValueAnimator f15473J;

    /* JADX INFO: renamed from: K */
    public ValueAnimator f15474K;

    /* JADX INFO: renamed from: L */
    public final int f15475L;

    /* JADX INFO: renamed from: M */
    public int f15476M;

    /* JADX INFO: renamed from: N */
    public int f15477N;

    /* JADX INFO: renamed from: O */
    public int f15478O;

    /* JADX INFO: renamed from: P */
    public int f15479P;

    /* JADX INFO: renamed from: Q */
    public int f15480Q;

    /* JADX INFO: renamed from: R */
    public int f15481R;

    /* JADX INFO: renamed from: S */
    public int f15482S;

    /* JADX INFO: renamed from: T */
    public int f15483T;

    /* JADX INFO: renamed from: U */
    public int f15484U;

    /* JADX INFO: renamed from: V */
    public int f15485V;

    /* JADX INFO: renamed from: W */
    public int f15486W;

    /* JADX INFO: renamed from: a */
    public final Paint f15487a;

    /* JADX INFO: renamed from: a0 */
    public int f15488a0;

    /* JADX INFO: renamed from: b */
    public final Paint f15489b;

    /* JADX INFO: renamed from: b0 */
    public int f15490b0;

    /* JADX INFO: renamed from: c */
    public final Paint f15491c;

    /* JADX INFO: renamed from: c0 */
    public int f15492c0;

    /* JADX INFO: renamed from: d */
    public final Paint f15493d;

    /* JADX INFO: renamed from: d0 */
    public float f15494d0;

    /* JADX INFO: renamed from: e */
    public final Paint f15495e;

    /* JADX INFO: renamed from: e0 */
    public MotionEvent f15496e0;

    /* JADX INFO: renamed from: f */
    public final Paint f15497f;

    /* JADX INFO: renamed from: f0 */
    public boolean f15498f0;

    /* JADX INFO: renamed from: g */
    public final C3055c f15499g;

    /* JADX INFO: renamed from: g0 */
    public float f15500g0;

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f15501h;

    /* JADX INFO: renamed from: h0 */
    public float f15502h0;

    /* JADX INFO: renamed from: i */
    public BaseSlider<S, L, T>.RunnableC3054b f15503i;

    /* JADX INFO: renamed from: i0 */
    public ArrayList<Float> f15504i0;

    /* JADX INFO: renamed from: j */
    public int f15505j;

    /* JADX INFO: renamed from: j0 */
    public int f15506j0;

    /* JADX INFO: renamed from: k */
    public final ArrayList f15507k;

    /* JADX INFO: renamed from: k0 */
    public int f15508k0;

    /* JADX INFO: renamed from: l */
    public final ArrayList f15509l;

    /* JADX INFO: renamed from: l0 */
    public float f15510l0;

    /* JADX INFO: renamed from: m0 */
    public float[] f15511m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f15512n0;

    /* JADX INFO: renamed from: o0 */
    public int f15513o0;

    /* JADX INFO: renamed from: p0 */
    public int f15514p0;

    /* JADX INFO: renamed from: q0 */
    public int f15515q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f15516r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f15517s0;

    /* JADX INFO: renamed from: t0 */
    public ColorStateList f15518t0;

    /* JADX INFO: renamed from: u0 */
    public ColorStateList f15519u0;

    /* JADX INFO: renamed from: v0 */
    public ColorStateList f15520v0;

    /* JADX INFO: renamed from: w0 */
    public ColorStateList f15521w0;

    /* JADX INFO: renamed from: x0 */
    public ColorStateList f15522x0;

    /* JADX INFO: renamed from: y0 */
    public final C5768g f15523y0;

    /* JADX INFO: renamed from: z0 */
    public Drawable f15524z0;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C3052a();

        /* JADX INFO: renamed from: a */
        public float f15525a;

        /* JADX INFO: renamed from: b */
        public float f15526b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Float> f15527c;

        /* JADX INFO: renamed from: d */
        public float f15528d;

        /* JADX INFO: renamed from: e */
        public boolean f15529e;

        /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
        public class C3052a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            public final SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SliderState[] newArray(int i10) {
                return new SliderState[i10];
            }
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f15525a = parcel.readFloat();
            this.f15526b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f15527c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f15528d = parcel.readFloat();
            this.f15529e = parcel.createBooleanArray()[0];
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f15525a);
            parcel.writeFloat(this.f15526b);
            parcel.writeList(this.f15527c);
            parcel.writeFloat(this.f15528d);
            parcel.writeBooleanArray(new boolean[]{this.f15529e});
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$a */
    public class C3053a implements ValueAnimator.AnimatorUpdateListener {
        public C3053a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseSlider baseSlider = BaseSlider.this;
            for (C7739a c7739a : baseSlider.f15507k) {
                c7739a.f42373g0 = 1.2f;
                c7739a.f42371e0 = fFloatValue;
                c7739a.f42372f0 = fFloatValue;
                c7739a.f42374h0 = C6308a.m12936a(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                c7739a.invalidateSelf();
            }
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18674k(baseSlider);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$b */
    public class RunnableC3054b implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f15531a = -1;

        public RunnableC3054b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.f15499g.m11512x(this.f15531a, 4);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.slider.BaseSlider$c */
    public static class C3055c extends AbstractC5363a {

        /* JADX INFO: renamed from: q */
        public final BaseSlider<?, ?, ?> f15533q;

        /* JADX INFO: renamed from: r */
        public final Rect f15534r;

        public C3055c(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f15534r = new Rect();
            this.f15533q = baseSlider;
        }

        @Override // p084e3.AbstractC5363a
        /* JADX INFO: renamed from: n */
        public final int mo8680n(float f3, float f10) {
            int i10 = 0;
            while (true) {
                BaseSlider<?, ?, ?> baseSlider = this.f15533q;
                if (i10 >= baseSlider.getValues().size()) {
                    return -1;
                }
                Rect rect = this.f15534r;
                baseSlider.m8829q(i10, rect);
                if (rect.contains((int) f3, (int) f10)) {
                    return i10;
                }
                i10++;
            }
        }

        @Override // p084e3.AbstractC5363a
        /* JADX INFO: renamed from: o */
        public final void mo8681o(ArrayList arrayList) {
            for (int i10 = 0; i10 < this.f15533q.getValues().size(); i10++) {
                arrayList.add(Integer.valueOf(i10));
            }
        }

        @Override // p084e3.AbstractC5363a
        /* JADX INFO: renamed from: s */
        public final boolean mo8682s(int i10, int i11, Bundle bundle) {
            BaseSlider<?, ?, ?> baseSlider = this.f15533q;
            if (!baseSlider.isEnabled()) {
                return false;
            }
            if (i11 != 4096 && i11 != 8192) {
                if (i11 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && baseSlider.m8828p(i10, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    baseSlider.m8830r();
                    baseSlider.postInvalidate();
                    m11508p(i10);
                    return true;
                }
                return false;
            }
            float fRound = baseSlider.f15510l0;
            if (fRound == 0.0f) {
                fRound = 1.0f;
            }
            float f3 = (baseSlider.f15502h0 - baseSlider.f15500g0) / fRound;
            float f10 = 20;
            if (f3 > f10) {
                fRound *= Math.round(f3 / f10);
            }
            if (i11 == 8192) {
                fRound = -fRound;
            }
            if (baseSlider.m8820h()) {
                fRound = -fRound;
            }
            float fFloatValue = baseSlider.getValues().get(i10).floatValue() + fRound;
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (fFloatValue < valueFrom) {
                fFloatValue = valueFrom;
            } else if (fFloatValue > valueTo) {
                fFloatValue = valueTo;
            }
            if (!baseSlider.m8828p(i10, fFloatValue)) {
                return false;
            }
            baseSlider.m8830r();
            baseSlider.postInvalidate();
            m11508p(i10);
            return true;
        }

        @Override // p084e3.AbstractC5363a
        /* JADX INFO: renamed from: u */
        public final void mo8684u(int i10, C10284f c10284f) {
            String string;
            c10284f.m19257b(C10284f.a.f51754q);
            BaseSlider<?, ?, ?> baseSlider = this.f15533q;
            List<Float> values = baseSlider.getValues();
            float fFloatValue = values.get(i10).floatValue();
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (baseSlider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    c10284f.m19256a(8192);
                }
                if (fFloatValue < valueTo) {
                    c10284f.m19256a(4096);
                }
            }
            AccessibilityNodeInfo.RangeInfo rangeInfoObtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue);
            AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
            accessibilityNodeInfo.setRangeInfo(rangeInfoObtain);
            c10284f.m19264i(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (baseSlider.getContentDescription() != null) {
                sb2.append(baseSlider.getContentDescription());
                sb2.append(",");
            }
            String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", Float.valueOf(fFloatValue));
            String string2 = baseSlider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                if (i10 == baseSlider.getValues().size() - 1) {
                    string = baseSlider.getContext().getString(R.string.material_slider_range_end);
                } else {
                    string = i10 == 0 ? baseSlider.getContext().getString(R.string.material_slider_range_start) : "";
                }
                string2 = string;
            }
            sb2.append(String.format(Locale.US, "%s, %s", string2, str));
            c10284f.m19267l(sb2.toString());
            Rect rect = this.f15534r;
            baseSlider.m8829q(i10, rect);
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i10) {
        super(C7542a.m15048a(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider), attributeSet, R.attr.sliderStyle);
        this.f15507k = new ArrayList();
        this.f15509l = new ArrayList();
        this.f15471H = new ArrayList();
        this.f15472I = false;
        this.f15498f0 = false;
        this.f15504i0 = new ArrayList<>();
        this.f15506j0 = -1;
        this.f15508k0 = -1;
        this.f15510l0 = 0.0f;
        this.f15512n0 = true;
        this.f15516r0 = false;
        C5768g c5768g = new C5768g();
        this.f15523y0 = c5768g;
        this.f15468A0 = Collections.emptyList();
        this.f15470C0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f15487a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f15489b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f15491c = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f15493d = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f15495e = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f15497f = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.f15482S = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f15476M = dimensionPixelOffset;
        this.f15486W = dimensionPixelOffset;
        this.f15477N = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f15478O = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f15479P = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f15480Q = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f15492c0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        TypedArray typedArrayM19357d = C10344k.m19357d(context2, attributeSet, C6031a.f35642K, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        this.f15505j = typedArrayM19357d.getResourceId(8, R.style.Widget_MaterialComponents_Tooltip);
        this.f15500g0 = typedArrayM19357d.getFloat(3, 0.0f);
        this.f15502h0 = typedArrayM19357d.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.f15500g0));
        this.f15510l0 = typedArrayM19357d.getFloat(2, 0.0f);
        this.f15481R = (int) Math.ceil(typedArrayM19357d.getDimension(9, (float) Math.ceil(C10347n.m19362b(48, getContext()))));
        int i11 = 21;
        boolean zHasValue = typedArrayM19357d.hasValue(21);
        int i12 = zHasValue ? 21 : 23;
        if (!zHasValue) {
            i11 = 22;
        }
        ColorStateList colorStateListM10925a = C5150c.m10925a(context2, typedArrayM19357d, i12);
        setTrackInactiveTintList(colorStateListM10925a == null ? C7472a.m14842b(R.color.material_slider_inactive_track_color, context2) : colorStateListM10925a);
        ColorStateList colorStateListM10925a2 = C5150c.m10925a(context2, typedArrayM19357d, i11);
        setTrackActiveTintList(colorStateListM10925a2 == null ? C7472a.m14842b(R.color.material_slider_active_track_color, context2) : colorStateListM10925a2);
        c5768g.m12141m(C5150c.m10925a(context2, typedArrayM19357d, 10));
        if (typedArrayM19357d.hasValue(13)) {
            setThumbStrokeColor(C5150c.m10925a(context2, typedArrayM19357d, 13));
        }
        setThumbStrokeWidth(typedArrayM19357d.getDimension(14, 0.0f));
        ColorStateList colorStateListM10925a3 = C5150c.m10925a(context2, typedArrayM19357d, 5);
        if (colorStateListM10925a3 == null) {
            colorStateListM10925a3 = C7472a.m14842b(R.color.material_slider_halo_color, context2);
        }
        setHaloTintList(colorStateListM10925a3);
        this.f15512n0 = typedArrayM19357d.getBoolean(20, true);
        int i13 = 15;
        boolean zHasValue2 = typedArrayM19357d.hasValue(15);
        int i14 = zHasValue2 ? 15 : 17;
        i13 = zHasValue2 ? i13 : 16;
        ColorStateList colorStateListM10925a4 = C5150c.m10925a(context2, typedArrayM19357d, i14);
        setTickInactiveTintList(colorStateListM10925a4 == null ? C7472a.m14842b(R.color.material_slider_inactive_tick_marks_color, context2) : colorStateListM10925a4);
        ColorStateList colorStateListM10925a5 = C5150c.m10925a(context2, typedArrayM19357d, i13);
        setTickActiveTintList(colorStateListM10925a5 == null ? C7472a.m14842b(R.color.material_slider_active_tick_marks_color, context2) : colorStateListM10925a5);
        setThumbRadius(typedArrayM19357d.getDimensionPixelSize(12, 0));
        setHaloRadius(typedArrayM19357d.getDimensionPixelSize(6, 0));
        setThumbElevation(typedArrayM19357d.getDimension(11, 0.0f));
        setTrackHeight(typedArrayM19357d.getDimensionPixelSize(24, 0));
        setTickActiveRadius(typedArrayM19357d.getDimensionPixelSize(18, 0));
        setTickInactiveRadius(typedArrayM19357d.getDimensionPixelSize(19, 0));
        setLabelBehavior(typedArrayM19357d.getInt(7, 0));
        if (!typedArrayM19357d.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayM19357d.recycle();
        setFocusable(true);
        setClickable(true);
        c5768g.m12144p();
        this.f15475L = ViewConfiguration.get(context2).getScaledTouchSlop();
        C3055c c3055c = new C3055c(this);
        this.f15499g = c3055c;
        C10029b0.m18658n(this, c3055c);
        this.f15501h = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f15504i0.size() == 1) {
            fFloatValue2 = this.f15500g0;
        }
        float fM8824l = m8824l(fFloatValue2);
        float fM8824l2 = m8824l(fFloatValue);
        return m8820h() ? new float[]{fM8824l2, fM8824l} : new float[]{fM8824l, fM8824l2};
    }

    private float getValueOfTouchPosition() {
        double dRound;
        float f3 = this.f15469B0;
        float f10 = this.f15510l0;
        if (f10 > 0.0f) {
            int i10 = (int) ((this.f15502h0 - this.f15500g0) / f10);
            dRound = ((double) Math.round(f3 * i10)) / ((double) i10);
        } else {
            dRound = f3;
        }
        if (m8820h()) {
            dRound = 1.0d - dRound;
        }
        float f11 = this.f15502h0;
        float f12 = this.f15500g0;
        return (float) ((dRound * ((double) (f11 - f12))) + ((double) f12));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f3 = this.f15469B0;
        if (m8820h()) {
            f3 = 1.0f - f3;
        }
        float f10 = this.f15502h0;
        float f11 = this.f15500g0;
        return C0204c.m845d(f10, f11, f3, f11);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        int resourceId;
        C9166r c9166rM19364d;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f15504i0.size() == arrayList.size() && this.f15504i0.equals(arrayList)) {
            return;
        }
        this.f15504i0 = arrayList;
        this.f15517s0 = true;
        this.f15508k0 = 0;
        m8830r();
        ArrayList<C7739a> arrayList2 = this.f15507k;
        if (arrayList2.size() > this.f15504i0.size()) {
            List<C7739a> listSubList = arrayList2.subList(this.f15504i0.size(), arrayList2.size());
            for (C7739a c7739a : listSubList) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (C10029b0.g.m18698b(this) && (c9166rM19364d = C10347n.m19364d(this)) != null) {
                    ((ViewOverlay) c9166rM19364d.f47694a).remove(c7739a);
                    ViewGroup viewGroupM19363c = C10347n.m19363c(this);
                    if (viewGroupM19363c == null) {
                        c7739a.getClass();
                    } else {
                        viewGroupM19363c.removeOnLayoutChangeListener(c7739a.f42363W);
                    }
                }
            }
            listSubList.clear();
        }
        loop1: while (true) {
            while (true) {
                if (arrayList2.size() >= this.f15504i0.size()) {
                    break loop1;
                }
                Context context = getContext();
                int i10 = this.f15505j;
                C7739a c7739a2 = new C7739a(context, i10);
                TypedArray typedArrayM19357d = C10344k.m19357d(c7739a2.f42360T, null, C6031a.f35650S, 0, i10, new int[0]);
                Context context2 = c7739a2.f42360T;
                c7739a2.f42369c0 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
                C5772k c5772k = c7739a2.f34857a.f34870a;
                c5772k.getClass();
                C5772k.a aVar = new C5772k.a(c5772k);
                aVar.f34917k = c7739a2.m15334v();
                c7739a2.setShapeAppearanceModel(new C5772k(aVar));
                CharSequence text = typedArrayM19357d.getText(6);
                boolean zEquals = TextUtils.equals(c7739a2.f42359S, text);
                C10341h c10341h = c7739a2.f42362V;
                if (!zEquals) {
                    c7739a2.f42359S = text;
                    c10341h.f52042d = true;
                    c7739a2.invalidateSelf();
                }
                C5151d c5151d = (!typedArrayM19357d.hasValue(0) || (resourceId = typedArrayM19357d.getResourceId(0, 0)) == 0) ? null : new C5151d(context2, resourceId);
                if (c5151d != null && typedArrayM19357d.hasValue(1)) {
                    c5151d.f33136j = C5150c.m10925a(context2, typedArrayM19357d, 1);
                }
                c10341h.m19353b(c5151d, context2);
                c7739a2.m12141m(ColorStateList.valueOf(typedArrayM19357d.getColor(7, C8169a.m16215g(C8169a.m16216h(C0062b.m337c1(context2, R.attr.colorOnBackground, C7739a.class.getCanonicalName()), 153), C8169a.m16216h(C0062b.m337c1(context2, android.R.attr.colorBackground, C7739a.class.getCanonicalName()), 229)))));
                c7739a2.m12145q(ColorStateList.valueOf(C0062b.m337c1(context2, R.attr.colorSurface, C7739a.class.getCanonicalName())));
                c7739a2.f42365Y = typedArrayM19357d.getDimensionPixelSize(2, 0);
                c7739a2.f42366Z = typedArrayM19357d.getDimensionPixelSize(4, 0);
                c7739a2.f42367a0 = typedArrayM19357d.getDimensionPixelSize(5, 0);
                c7739a2.f42368b0 = typedArrayM19357d.getDimensionPixelSize(3, 0);
                typedArrayM19357d.recycle();
                arrayList2.add(c7739a2);
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                if (C10029b0.g.m18698b(this)) {
                    ViewGroup viewGroupM19363c2 = C10347n.m19363c(this);
                    if (viewGroupM19363c2 != null) {
                        int[] iArr = new int[2];
                        viewGroupM19363c2.getLocationOnScreen(iArr);
                        c7739a2.f42370d0 = iArr[0];
                        viewGroupM19363c2.getWindowVisibleDisplayFrame(c7739a2.f42364X);
                        viewGroupM19363c2.addOnLayoutChangeListener(c7739a2.f42363W);
                    }
                }
            }
        }
        int i11 = arrayList2.size() == 1 ? 0 : 1;
        for (C7739a c7739a3 : arrayList2) {
            c7739a3.f34857a.f34880k = i11;
            c7739a3.invalidateSelf();
        }
        for (InterfaceC6316a interfaceC6316a : this.f15509l) {
            Iterator<Float> it = this.f15504i0.iterator();
            while (it.hasNext()) {
                interfaceC6316a.mo12944a(this, it.next().floatValue(), false);
            }
        }
        postInvalidate();
    }

    /* JADX INFO: renamed from: a */
    public final void m8813a(Drawable drawable) {
        int i10 = this.f15488a0 * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i10, i10);
        } else {
            float fMax = i10 / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m8814b() {
        int intrinsicHeight;
        int i10 = this.f15483T / 2;
        int i11 = this.f15484U;
        if (i11 != 1) {
            intrinsicHeight = i11 == 3 ? ((C7739a) this.f15507k.get(0)).getIntrinsicHeight() : 0;
        }
        return i10 + intrinsicHeight;
    }

    /* JADX INFO: renamed from: c */
    public final ValueAnimator m8815c(boolean z10) {
        int iM19428c;
        TimeInterpolator timeInterpolatorM19429d;
        float fFloatValue = z10 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z10 ? this.f15474K : this.f15473J;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z10 ? 1.0f : 0.0f);
        if (z10) {
            iM19428c = C10477a.m19428c(R.attr.motionDurationMedium4, getContext(), 83);
            timeInterpolatorM19429d = C10477a.m19429d(getContext(), R.attr.motionEasingEmphasizedInterpolator, C6308a.f36527e);
        } else {
            iM19428c = C10477a.m19428c(R.attr.motionDurationShort3, getContext(), 117);
            timeInterpolatorM19429d = C10477a.m19429d(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, C6308a.f36525c);
        }
        valueAnimatorOfFloat.setDuration(iM19428c);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorM19429d);
        valueAnimatorOfFloat.addUpdateListener(new C3053a());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: d */
    public final void m8816d(Canvas canvas, int i10, int i11, float f3, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f15486W + ((int) (m8824l(f3) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f15499g.m11507m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f15487a.setColor(m8817e(this.f15522x0));
        this.f15489b.setColor(m8817e(this.f15521w0));
        this.f15495e.setColor(m8817e(this.f15520v0));
        this.f15497f.setColor(m8817e(this.f15519u0));
        for (C7739a c7739a : this.f15507k) {
            if (c7739a.isStateful()) {
                c7739a.setState(getDrawableState());
            }
        }
        C5768g c5768g = this.f15523y0;
        if (c5768g.isStateful()) {
            c5768g.setState(getDrawableState());
        }
        Paint paint = this.f15493d;
        paint.setColor(m8817e(this.f15518t0));
        paint.setAlpha(63);
    }

    /* JADX INFO: renamed from: e */
    public final int m8817e(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8818f(float f3) {
        double dDoubleValue = new BigDecimal(Float.toString(f3)).divide(new BigDecimal(Float.toString(this.f15510l0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8819g(MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = false;
        if (!(motionEvent.getToolType(0) == 3)) {
            ViewParent parent = getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z10 = false;
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    z10 = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (z10) {
                z11 = true;
            }
        }
        return z11;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f15499g.f33700k;
    }

    public int getActiveThumbIndex() {
        return this.f15506j0;
    }

    public int getFocusedThumbIndex() {
        return this.f15508k0;
    }

    public int getHaloRadius() {
        return this.f15490b0;
    }

    public ColorStateList getHaloTintList() {
        return this.f15518t0;
    }

    public int getLabelBehavior() {
        return this.f15484U;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f15510l0;
    }

    public float getThumbElevation() {
        return this.f15523y0.f34857a.f34883n;
    }

    public int getThumbRadius() {
        return this.f15488a0;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f15523y0.f34857a.f34873d;
    }

    public float getThumbStrokeWidth() {
        return this.f15523y0.f34857a.f34880k;
    }

    public ColorStateList getThumbTintList() {
        return this.f15523y0.f34857a.f34872c;
    }

    public int getTickActiveRadius() {
        return this.f15513o0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f15519u0;
    }

    public int getTickInactiveRadius() {
        return this.f15514p0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f15520v0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ColorStateList getTickTintList() {
        if (this.f15520v0.equals(this.f15519u0)) {
            return this.f15519u0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f15521w0;
    }

    public int getTrackHeight() {
        return this.f15485V;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f15522x0;
    }

    public int getTrackSidePadding() {
        return this.f15486W;
    }

    public ColorStateList getTrackTintList() {
        if (this.f15522x0.equals(this.f15521w0)) {
            return this.f15521w0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f15515q0;
    }

    public float getValueFrom() {
        return this.f15500g0;
    }

    public float getValueTo() {
        return this.f15502h0;
    }

    public List<Float> getValues() {
        return new ArrayList(this.f15504i0);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8820h() {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        return C10029b0.e.m18686d(this) == 1;
    }

    /* JADX INFO: renamed from: i */
    public final void m8821i() {
        if (this.f15510l0 <= 0.0f) {
            return;
        }
        m8832t();
        int iMin = Math.min((int) (((this.f15502h0 - this.f15500g0) / this.f15510l0) + 1.0f), (this.f15515q0 / (this.f15485V * 2)) + 1);
        float[] fArr = this.f15511m0;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f15511m0 = new float[iMin * 2];
        }
        float f3 = this.f15515q0 / (iMin - 1);
        for (int i10 = 0; i10 < iMin * 2; i10 += 2) {
            float[] fArr2 = this.f15511m0;
            fArr2[i10] = ((i10 / 2.0f) * f3) + this.f15486W;
            fArr2[i10 + 1] = m8814b();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8822j(int i10) {
        int i11 = this.f15508k0;
        long j10 = ((long) i11) + ((long) i10);
        long size = this.f15504i0.size() - 1;
        if (j10 < 0) {
            j10 = 0;
        } else if (j10 > size) {
            j10 = size;
        }
        int i12 = (int) j10;
        this.f15508k0 = i12;
        if (i12 == i11) {
            return false;
        }
        if (this.f15506j0 != -1) {
            this.f15506j0 = i12;
        }
        m8830r();
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m8823k(int i10) {
        if (m8820h()) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = -i10;
            }
        }
        m8822j(i10);
    }

    /* JADX INFO: renamed from: l */
    public final float m8824l(float f3) {
        float f10 = this.f15500g0;
        float f11 = (f3 - f10) / (this.f15502h0 - f10);
        return m8820h() ? 1.0f - f11 : f11;
    }

    /* JADX INFO: renamed from: m */
    public final void m8825m() {
        Iterator it = this.f15471H.iterator();
        while (it.hasNext()) {
            ((InterfaceC6317b) it.next()).mo9383a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0096  */
    /* JADX INFO: renamed from: n */
    public boolean mo8826n() {
        boolean z10;
        if (this.f15506j0 != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fM8824l = (m8824l(valueOfTouchPositionAbsolute) * this.f15515q0) + this.f15486W;
        this.f15506j0 = 0;
        float fAbs = Math.abs(this.f15504i0.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i10 = 1; i10 < this.f15504i0.size(); i10++) {
            float fAbs2 = Math.abs(this.f15504i0.get(i10).floatValue() - valueOfTouchPositionAbsolute);
            float fM8824l2 = (m8824l(this.f15504i0.get(i10).floatValue()) * this.f15515q0) + this.f15486W;
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            if (m8820h()) {
                if (fM8824l2 - fM8824l > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (fM8824l2 - fM8824l < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f15506j0 = i10;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fM8824l2 - fM8824l) < this.f15475L) {
                        this.f15506j0 = -1;
                        return false;
                    }
                    if (z10) {
                        this.f15506j0 = i10;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f15506j0 != -1;
    }

    /* JADX INFO: renamed from: o */
    public final void m8827o(C7739a c7739a, float f3) {
        String str = String.format(((float) ((int) f3)) == f3 ? "%.0f" : "%.2f", Float.valueOf(f3));
        if (!TextUtils.equals(c7739a.f42359S, str)) {
            c7739a.f42359S = str;
            c7739a.f42362V.f52042d = true;
            c7739a.invalidateSelf();
        }
        int iM8824l = (this.f15486W + ((int) (m8824l(f3) * this.f15515q0))) - (c7739a.getIntrinsicWidth() / 2);
        int iM8814b = m8814b() - (this.f15492c0 + this.f15488a0);
        c7739a.setBounds(iM8824l, iM8814b - c7739a.getIntrinsicHeight(), c7739a.getIntrinsicWidth() + iM8824l, iM8814b);
        Rect rect = new Rect(c7739a.getBounds());
        C10336c.m19350b(C10347n.m19363c(this), this, rect);
        c7739a.setBounds(rect);
        ((ViewOverlay) C10347n.m19364d(this).f47694a).add(c7739a);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (C7739a c7739a : this.f15507k) {
            ViewGroup viewGroupM19363c = C10347n.m19363c(this);
            if (viewGroupM19363c == null) {
                c7739a.getClass();
            } else {
                c7739a.getClass();
                int[] iArr = new int[2];
                viewGroupM19363c.getLocationOnScreen(iArr);
                c7739a.f42370d0 = iArr[0];
                viewGroupM19363c.getWindowVisibleDisplayFrame(c7739a.f42364X);
                viewGroupM19363c.addOnLayoutChangeListener(c7739a.f42363W);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        BaseSlider<S, L, T>.RunnableC3054b runnableC3054b = this.f15503i;
        if (runnableC3054b != null) {
            removeCallbacks(runnableC3054b);
        }
        this.f15472I = false;
        for (C7739a c7739a : this.f15507k) {
            C9166r c9166rM19364d = C10347n.m19364d(this);
            if (c9166rM19364d != null) {
                ((ViewOverlay) c9166rM19364d.f47694a).remove(c7739a);
                ViewGroup viewGroupM19363c = C10347n.m19363c(this);
                if (viewGroupM19363c == null) {
                    c7739a.getClass();
                } else {
                    viewGroupM19363c.removeOnLayoutChangeListener(c7739a.f42363W);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x017a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0181  */
    /* JADX WARN: Code duplicated, block: B:48:0x0186  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0220  */
    /* JADX WARN: Code duplicated, block: B:67:0x0224  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList;
        Iterator it;
        int i10;
        if (this.f15517s0) {
            m8832t();
            m8821i();
        }
        super.onDraw(canvas);
        int iM8814b = m8814b();
        int i11 = this.f15515q0;
        float[] activeRange = getActiveRange();
        int i12 = this.f15486W;
        float f3 = i11;
        float f10 = i12 + (activeRange[1] * f3);
        float f11 = i12 + i11;
        Paint paint = this.f15487a;
        if (f10 < f11) {
            float f12 = iM8814b;
            canvas.drawLine(f10, f12, f11, f12, paint);
        }
        float f13 = this.f15486W;
        float f14 = (activeRange[0] * f3) + f13;
        if (f14 > f13) {
            float f15 = iM8814b;
            canvas.drawLine(f13, f15, f14, f15, paint);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.f15500g0) {
            int i13 = this.f15515q0;
            float[] activeRange2 = getActiveRange();
            float f16 = this.f15486W;
            float f17 = i13;
            float f18 = iM8814b;
            canvas.drawLine((activeRange2[0] * f17) + f16, f18, (activeRange2[1] * f17) + f16, f18, this.f15489b);
        }
        if (this.f15512n0 && this.f15510l0 > 0.0f) {
            float[] activeRange3 = getActiveRange();
            int iRound = Math.round(activeRange3[0] * ((this.f15511m0.length / 2) - 1));
            int iRound2 = Math.round(activeRange3[1] * ((this.f15511m0.length / 2) - 1));
            float[] fArr = this.f15511m0;
            int i14 = iRound * 2;
            Paint paint2 = this.f15495e;
            canvas.drawPoints(fArr, 0, i14, paint2);
            int i15 = iRound2 * 2;
            canvas.drawPoints(this.f15511m0, i14, i15 - i14, this.f15497f);
            float[] fArr2 = this.f15511m0;
            canvas.drawPoints(fArr2, i15, fArr2.length - i15, paint2);
        }
        if (this.f15498f0 || isFocused()) {
            if (isEnabled()) {
                int i16 = this.f15515q0;
                if (!(getBackground() instanceof RippleDrawable)) {
                    int iM8824l = (int) ((m8824l(this.f15504i0.get(this.f15508k0).floatValue()) * i16) + this.f15486W);
                    if (Build.VERSION.SDK_INT < 28) {
                        int i17 = this.f15490b0;
                        canvas.clipRect(iM8824l - i17, iM8814b - i17, iM8824l + i17, i17 + iM8814b, Region.Op.UNION);
                    }
                    canvas.drawCircle(iM8824l, iM8814b, this.f15490b0, this.f15493d);
                }
            }
        }
        if (this.f15506j0 == -1) {
            if (this.f15484U == 3) {
                if (isEnabled()) {
                    if (this.f15484U != 2) {
                        if (!this.f15472I) {
                            this.f15472I = true;
                            ValueAnimator valueAnimatorM8815c = m8815c(true);
                            this.f15473J = valueAnimatorM8815c;
                            this.f15474K = null;
                            valueAnimatorM8815c.start();
                        }
                        arrayList = this.f15507k;
                        it = arrayList.iterator();
                        for (i10 = 0; i10 < this.f15504i0.size(); i10++) {
                            if (i10 == this.f15508k0) {
                                m8827o((C7739a) it.next(), this.f15504i0.get(i10).floatValue());
                            }
                        }
                        if (it.hasNext()) {
                            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f15504i0.size())));
                        }
                        m8827o((C7739a) it.next(), this.f15504i0.get(this.f15508k0).floatValue());
                    }
                } else if (this.f15472I) {
                    this.f15472I = false;
                    ValueAnimator valueAnimatorM8815c2 = m8815c(false);
                    this.f15474K = valueAnimatorM8815c2;
                    this.f15473J = null;
                    valueAnimatorM8815c2.addListener(new C6318c(this));
                    this.f15474K.start();
                }
            } else if (this.f15472I) {
                this.f15472I = false;
                ValueAnimator valueAnimatorM8815c3 = m8815c(false);
                this.f15474K = valueAnimatorM8815c3;
                this.f15473J = null;
                valueAnimatorM8815c3.addListener(new C6318c(this));
                this.f15474K.start();
            }
        } else if (isEnabled()) {
            if (this.f15484U != 2) {
                if (!this.f15472I) {
                    this.f15472I = true;
                    ValueAnimator valueAnimatorM8815c4 = m8815c(true);
                    this.f15473J = valueAnimatorM8815c4;
                    this.f15474K = null;
                    valueAnimatorM8815c4.start();
                }
                arrayList = this.f15507k;
                it = arrayList.iterator();
                while (i10 < this.f15504i0.size() && it.hasNext()) {
                    if (i10 == this.f15508k0) {
                        m8827o((C7739a) it.next(), this.f15504i0.get(i10).floatValue());
                    }
                }
                if (it.hasNext()) {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f15504i0.size())));
                }
                m8827o((C7739a) it.next(), this.f15504i0.get(this.f15508k0).floatValue());
            }
        } else if (this.f15472I) {
            this.f15472I = false;
            ValueAnimator valueAnimatorM8815c5 = m8815c(false);
            this.f15474K = valueAnimatorM8815c5;
            this.f15473J = null;
            valueAnimatorM8815c5.addListener(new C6318c(this));
            this.f15474K.start();
        }
        int i18 = this.f15515q0;
        for (int i19 = 0; i19 < this.f15504i0.size(); i19++) {
            float fFloatValue = this.f15504i0.get(i19).floatValue();
            Drawable drawable = this.f15524z0;
            if (drawable != null) {
                m8816d(canvas, i18, iM8814b, fFloatValue, drawable);
            } else if (i19 < this.f15468A0.size()) {
                m8816d(canvas, i18, iM8814b, fFloatValue, this.f15468A0.get(i19));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle((m8824l(fFloatValue) * i18) + this.f15486W, iM8814b, this.f15488a0, this.f15491c);
                }
                m8816d(canvas, i18, iM8814b, fFloatValue, this.f15523y0);
            }
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        C3055c c3055c = this.f15499g;
        if (!z10) {
            this.f15506j0 = -1;
            c3055c.m11504j(this.f15508k0);
            return;
        }
        if (i10 == 1) {
            m8822j(Integer.MAX_VALUE);
        } else if (i10 == 2) {
            m8822j(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            m8823k(Integer.MAX_VALUE);
        } else if (i10 == 66) {
            m8823k(Integer.MIN_VALUE);
        }
        c3055c.m11511w(this.f15508k0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.f15504i0.size() == 1) {
            this.f15506j0 = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        if (this.f15506j0 == -1) {
            if (i10 != 61) {
                if (i10 == 66) {
                    this.f15506j0 = this.f15508k0;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i10 == 81) {
                    m8822j(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i10 == 69) {
                    m8822j(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i10 != 70) {
                    switch (i10) {
                        case 21:
                            m8823k(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 22:
                            m8823k(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 23:
                            this.f15506j0 = this.f15508k0;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    m8822j(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(m8822j(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(m8822j(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i10, keyEvent);
        }
        boolean zIsLongPress = this.f15516r0 | keyEvent.isLongPress();
        this.f15516r0 = zIsLongPress;
        float fRound = 1.0f;
        if (zIsLongPress) {
            float f3 = this.f15510l0;
            fRound = f3 != 0.0f ? f3 : 1.0f;
            float f10 = (this.f15502h0 - this.f15500g0) / fRound;
            float f11 = 20;
            if (f10 > f11) {
                fRound *= Math.round(f10 / f11);
            }
        } else {
            float f12 = this.f15510l0;
            if (f12 != 0.0f) {
                fRound = f12;
            }
        }
        if (i10 == 21) {
            if (!m8820h()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i10 == 22) {
            if (m8820h()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i10 == 69) {
            fValueOf = Float.valueOf(-fRound);
        } else if (i10 == 70 || i10 == 81) {
            fValueOf = Float.valueOf(fRound);
        }
        if (fValueOf != null) {
            if (m8828p(this.f15506j0, fValueOf.floatValue() + this.f15504i0.get(this.f15506j0).floatValue())) {
                m8830r();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m8822j(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m8822j(-1);
                }
                return false;
            }
            if (i10 != 66) {
                return super.onKeyDown(i10, keyEvent);
            }
        }
        this.f15506j0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.f15516r0 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f15483T;
        int i13 = this.f15484U;
        int intrinsicHeight = 0;
        if (i13 == 1) {
            intrinsicHeight = ((C7739a) this.f15507k.get(0)).getIntrinsicHeight();
        } else {
            if (i13 == 3) {
                intrinsicHeight = ((C7739a) this.f15507k.get(0)).getIntrinsicHeight();
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12 + intrinsicHeight, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f15500g0 = sliderState.f15525a;
        this.f15502h0 = sliderState.f15526b;
        setValuesInternal(sliderState.f15527c);
        this.f15510l0 = sliderState.f15528d;
        if (sliderState.f15529e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f15525a = this.f15500g0;
        sliderState.f15526b = this.f15502h0;
        sliderState.f15527c = new ArrayList<>(this.f15504i0);
        sliderState.f15528d = this.f15510l0;
        sliderState.f15529e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f15515q0 = Math.max(i10 - (this.f15486W * 2), 0);
        m8821i();
        m8830r();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0104 A[LOOP:0: B:41:0x00fe->B:43:0x0104, LOOP_END] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        Iterator it;
        float f3;
        if (!isEnabled()) {
            return false;
        }
        float x10 = motionEvent.getX();
        float f10 = (x10 - this.f15486W) / this.f15515q0;
        this.f15469B0 = f10;
        float fMax = Math.max(0.0f, f10);
        this.f15469B0 = fMax;
        this.f15469B0 = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i10 = this.f15475L;
            if (actionMasked == 1) {
                this.f15498f0 = false;
                motionEvent2 = this.f15496e0;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                    f3 = i10;
                    if (Math.abs(this.f15496e0.getX() - motionEvent.getX()) <= f3 && Math.abs(this.f15496e0.getY() - motionEvent.getY()) <= f3 && mo8826n()) {
                        m8825m();
                    }
                }
                if (this.f15506j0 != -1) {
                    m8828p(this.f15506j0, getValueOfTouchPosition());
                    m8830r();
                    this.f15506j0 = -1;
                    it = this.f15471H.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC6317b) it.next()).mo9384b(this);
                    }
                }
                invalidate();
            } else if (actionMasked == 2) {
                if (!this.f15498f0) {
                    if (m8819g(motionEvent) && Math.abs(x10 - this.f15494d0) < i10) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m8825m();
                }
                if (mo8826n()) {
                    this.f15498f0 = true;
                    m8828p(this.f15506j0, getValueOfTouchPosition());
                    m8830r();
                    invalidate();
                }
            } else if (actionMasked == 3) {
                this.f15498f0 = false;
                motionEvent2 = this.f15496e0;
                if (motionEvent2 != null) {
                    f3 = i10;
                    if (Math.abs(this.f15496e0.getX() - motionEvent.getX()) <= f3) {
                        m8825m();
                    }
                }
                if (this.f15506j0 != -1) {
                    m8828p(this.f15506j0, getValueOfTouchPosition());
                    m8830r();
                    this.f15506j0 = -1;
                    it = this.f15471H.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC6317b) it.next()).mo9384b(this);
                    }
                }
                invalidate();
            }
        } else {
            this.f15494d0 = x10;
            if (!m8819g(motionEvent)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo8826n()) {
                    requestFocus();
                    this.f15498f0 = true;
                    m8828p(this.f15506j0, getValueOfTouchPosition());
                    m8830r();
                    invalidate();
                    m8825m();
                }
            }
        }
        setPressed(this.f15498f0);
        this.f15496e0 = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        C9166r c9166rM19364d;
        super.onVisibilityChanged(view, i10);
        if (i10 != 0 && (c9166rM19364d = C10347n.m19364d(this)) != null) {
            Iterator it = this.f15507k.iterator();
            while (it.hasNext()) {
                ((ViewOverlay) c9166rM19364d.f47694a).remove((C7739a) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8828p(int i10, float f3) {
        this.f15508k0 = i10;
        if (Math.abs(f3 - this.f15504i0.get(i10).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f15470C0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f10 = (minSeparation - this.f15486W) / this.f15515q0;
                float f11 = this.f15500g0;
                minSeparation = C0204c.m845d(f11, this.f15502h0, f10, f11);
            }
        }
        if (m8820h()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        float fFloatValue = i11 >= this.f15504i0.size() ? this.f15502h0 : this.f15504i0.get(i11).floatValue() - minSeparation;
        int i12 = i10 - 1;
        float fFloatValue2 = i12 < 0 ? this.f15500g0 : minSeparation + this.f15504i0.get(i12).floatValue();
        if (f3 < fFloatValue2) {
            f3 = fFloatValue2;
        } else if (f3 > fFloatValue) {
            f3 = fFloatValue;
        }
        this.f15504i0.set(i10, Float.valueOf(f3));
        Iterator it = this.f15509l.iterator();
        while (it.hasNext()) {
            ((InterfaceC6316a) it.next()).mo12944a(this, this.f15504i0.get(i10).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f15501h;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            BaseSlider<S, L, T>.RunnableC3054b runnableC3054b = this.f15503i;
            if (runnableC3054b == null) {
                this.f15503i = new RunnableC3054b();
            } else {
                removeCallbacks(runnableC3054b);
            }
            BaseSlider<S, L, T>.RunnableC3054b runnableC3054b2 = this.f15503i;
            runnableC3054b2.f15531a = i10;
            postDelayed(runnableC3054b2, 200L);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m8829q(int i10, Rect rect) {
        int iM8824l = this.f15486W + ((int) (m8824l(getValues().get(i10).floatValue()) * this.f15515q0));
        int iM8814b = m8814b();
        int i11 = this.f15488a0;
        int i12 = this.f15481R;
        if (i11 <= i12) {
            i11 = i12;
        }
        int i13 = i11 / 2;
        rect.set(iM8824l - i13, iM8814b - i13, iM8824l + i13, iM8814b + i13);
    }

    /* JADX INFO: renamed from: r */
    public final void m8830r() {
        if ((!(getBackground() instanceof RippleDrawable)) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iM8824l = (int) ((m8824l(this.f15504i0.get(this.f15508k0).floatValue()) * this.f15515q0) + this.f15486W);
            int iM8814b = m8814b();
            int i10 = this.f15490b0;
            C8488a.b.m16568f(background, iM8824l - i10, iM8814b - i10, iM8824l + i10, iM8814b + i10);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m8831s() {
        boolean z10;
        int iMax = Math.max(this.f15482S, Math.max(this.f15485V + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.f15488a0 * 2)));
        boolean z11 = false;
        if (iMax == this.f15483T) {
            z10 = false;
        } else {
            this.f15483T = iMax;
            z10 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max(this.f15488a0 - this.f15477N, 0), Math.max((this.f15485V - this.f15478O) / 2, 0)), Math.max(Math.max(this.f15513o0 - this.f15479P, 0), Math.max(this.f15514p0 - this.f15480Q, 0))) + this.f15476M;
        if (this.f15486W != iMax2) {
            this.f15486W = iMax2;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.g.m18699c(this)) {
                this.f15515q0 = Math.max(getWidth() - (this.f15486W * 2), 0);
                m8821i();
            }
            z11 = true;
        }
        if (z10) {
            requestLayout();
        } else if (z11) {
            postInvalidate();
        }
    }

    public void setActiveThumbIndex(int i10) {
        this.f15506j0 = i10;
    }

    public void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m8813a(drawableNewDrawable);
        this.f15524z0 = drawableNewDrawable;
        this.f15468A0.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f15524z0 = null;
        this.f15468A0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List<Drawable> list = this.f15468A0;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            m8813a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.f15504i0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f15508k0 = i10;
        this.f15499g.m11511w(i10);
        postInvalidate();
    }

    public void setHaloRadius(int i10) {
        if (i10 == this.f15490b0) {
            return;
        }
        this.f15490b0 = i10;
        Drawable background = getBackground();
        if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            ((RippleDrawable) background).setRadius(this.f15490b0);
        }
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f15518t0)) {
            return;
        }
        this.f15518t0 = colorStateList;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        Paint paint = this.f15493d;
        paint.setColor(m8817e(colorStateList));
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.f15484U != i10) {
            this.f15484U = i10;
            requestLayout();
        }
    }

    public void setLabelFormatter(InterfaceC6319d interfaceC6319d) {
    }

    public void setSeparationUnit(int i10) {
        this.f15470C0 = i10;
        this.f15517s0 = true;
        postInvalidate();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setStepSize(float f3) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f3), Float.valueOf(this.f15500g0), Float.valueOf(this.f15502h0)));
        }
        if (this.f15510l0 != f3) {
            this.f15510l0 = f3;
            this.f15517s0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f3) {
        this.f15523y0.m12140l(f3);
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbRadius(int i10) {
        if (i10 == this.f15488a0) {
            return;
        }
        this.f15488a0 = i10;
        C5768g c5768g = this.f15523y0;
        C5772k.a aVar = new C5772k.a();
        float f3 = this.f15488a0;
        C5206f c5206fM257D0 = C0062b.m257D0(0);
        aVar.f34907a = c5206fM257D0;
        float fM12154b = C5772k.a.m12154b(c5206fM257D0);
        if (fM12154b != -1.0f) {
            aVar.m12159f(fM12154b);
        }
        aVar.f34908b = c5206fM257D0;
        float fM12154b2 = C5772k.a.m12154b(c5206fM257D0);
        if (fM12154b2 != -1.0f) {
            aVar.m12160g(fM12154b2);
        }
        aVar.f34909c = c5206fM257D0;
        float fM12154b3 = C5772k.a.m12154b(c5206fM257D0);
        if (fM12154b3 != -1.0f) {
            aVar.m12158e(fM12154b3);
        }
        aVar.f34910d = c5206fM257D0;
        float fM12154b4 = C5772k.a.m12154b(c5206fM257D0);
        if (fM12154b4 != -1.0f) {
            aVar.m12157d(fM12154b4);
        }
        aVar.m12156c(f3);
        c5768g.setShapeAppearanceModel(new C5772k(aVar));
        int i11 = this.f15488a0 * 2;
        c5768g.setBounds(0, 0, i11, i11);
        Drawable drawable = this.f15524z0;
        if (drawable != null) {
            m8813a(drawable);
        }
        Iterator<Drawable> it = this.f15468A0.iterator();
        while (it.hasNext()) {
            m8813a(it.next());
        }
        m8831s();
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f15523y0.m12145q(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(C7472a.m14842b(i10, getContext()));
        }
    }

    public void setThumbStrokeWidth(float f3) {
        C5768g c5768g = this.f15523y0;
        c5768g.f34857a.f34880k = f3;
        c5768g.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        C5768g c5768g = this.f15523y0;
        if (colorStateList.equals(c5768g.f34857a.f34872c)) {
            return;
        }
        c5768g.m12141m(colorStateList);
        invalidate();
    }

    public void setTickActiveRadius(int i10) {
        if (this.f15513o0 != i10) {
            this.f15513o0 = i10;
            this.f15497f.setStrokeWidth(i10 * 2);
            m8831s();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f15519u0)) {
            return;
        }
        this.f15519u0 = colorStateList;
        this.f15497f.setColor(m8817e(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i10) {
        if (this.f15514p0 != i10) {
            this.f15514p0 = i10;
            this.f15495e.setStrokeWidth(i10 * 2);
            m8831s();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f15520v0)) {
            return;
        }
        this.f15520v0 = colorStateList;
        this.f15495e.setColor(m8817e(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.f15512n0 != z10) {
            this.f15512n0 = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f15521w0)) {
            return;
        }
        this.f15521w0 = colorStateList;
        this.f15489b.setColor(m8817e(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i10) {
        if (this.f15485V != i10) {
            this.f15485V = i10;
            this.f15487a.setStrokeWidth(i10);
            this.f15489b.setStrokeWidth(this.f15485V);
            m8831s();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f15522x0)) {
            return;
        }
        this.f15522x0 = colorStateList;
        this.f15487a.setColor(m8817e(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f3) {
        this.f15500g0 = f3;
        this.f15517s0 = true;
        postInvalidate();
    }

    public void setValueTo(float f3) {
        this.f15502h0 = f3;
        this.f15517s0 = true;
        postInvalidate();
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 5 */
    /* JADX INFO: renamed from: t */
    public final void m8832t() {
        if (this.f15517s0) {
            float f3 = this.f15500g0;
            float f10 = this.f15502h0;
            if (f3 >= f10) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f15500g0), Float.valueOf(this.f15502h0)));
            }
            if (f10 <= f3) {
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f15502h0), Float.valueOf(this.f15500g0)));
            }
            if (this.f15510l0 > 0.0f && !m8818f(f10 - f3)) {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f15510l0), Float.valueOf(this.f15500g0), Float.valueOf(this.f15502h0)));
            }
            for (Float f11 : this.f15504i0) {
                if (f11.floatValue() < this.f15500g0 || f11.floatValue() > this.f15502h0) {
                    throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f11, Float.valueOf(this.f15500g0), Float.valueOf(this.f15502h0)));
                }
                if (this.f15510l0 > 0.0f && !m8818f(f11.floatValue() - this.f15500g0)) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f11, Float.valueOf(this.f15500g0), Float.valueOf(this.f15510l0), Float.valueOf(this.f15510l0)));
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
            }
            float f12 = this.f15510l0;
            if (f12 > 0.0f && minSeparation > 0.0f) {
                if (this.f15470C0 != 1) {
                    throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f15510l0)));
                }
                if (minSeparation < f12 || !m8818f(minSeparation)) {
                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f15510l0), Float.valueOf(this.f15510l0)));
                }
            }
            float f13 = this.f15510l0;
            if (f13 != 0.0f) {
                if (((int) f13) != f13) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f13)));
                }
                float f14 = this.f15500g0;
                if (((int) f14) != f14) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f14)));
                }
                float f15 = this.f15502h0;
                if (((int) f15) != f15) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f15)));
                }
            }
            this.f15517s0 = false;
        }
    }
}
