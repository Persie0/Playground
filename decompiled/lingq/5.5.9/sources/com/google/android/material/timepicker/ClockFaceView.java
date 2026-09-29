package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.linguist.R;
import java.util.Arrays;
import p072dd.C5150c;
import p153hc.C6031a;
import p254m2.C7472a;
import p471x2.C10029b0;
import p497y2.C10284f;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends C3099c implements ClockHandView.InterfaceC3095a {

    /* JADX INFO: renamed from: O */
    public final ClockHandView f15821O;

    /* JADX INFO: renamed from: P */
    public final Rect f15822P;

    /* JADX INFO: renamed from: Q */
    public final RectF f15823Q;

    /* JADX INFO: renamed from: R */
    public final Rect f15824R;

    /* JADX INFO: renamed from: S */
    public final SparseArray<TextView> f15825S;

    /* JADX INFO: renamed from: T */
    public final C3098b f15826T;

    /* JADX INFO: renamed from: U */
    public final int[] f15827U;

    /* JADX INFO: renamed from: V */
    public final float[] f15828V;

    /* JADX INFO: renamed from: W */
    public final int f15829W;

    /* JADX INFO: renamed from: a0 */
    public final int f15830a0;

    /* JADX INFO: renamed from: b0 */
    public final int f15831b0;

    /* JADX INFO: renamed from: c0 */
    public final int f15832c0;

    /* JADX INFO: renamed from: d0 */
    public String[] f15833d0;

    /* JADX INFO: renamed from: e0 */
    public float f15834e0;

    /* JADX INFO: renamed from: f0 */
    public final ColorStateList f15835f0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f15822P = new Rect();
        this.f15823Q = new RectF();
        this.f15824R = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f15825S = sparseArray;
        this.f15828V = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6031a.f35660j, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM10925a = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 1);
        this.f15835f0 = colorStateListM10925a;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f15821O = clockHandView;
        this.f15829W = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM10925a.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM10925a.getDefaultColor());
        this.f15827U = new int[]{colorForState, colorForState, colorStateListM10925a.getDefaultColor()};
        clockHandView.f15839c.add(this);
        int defaultColor = C7472a.m14842b(R.color.material_timepicker_clockface, context).getDefaultColor();
        ColorStateList colorStateListM10925a2 = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 0);
        if (colorStateListM10925a2 != null) {
            defaultColor = colorStateListM10925a2.getDefaultColor();
        }
        setBackgroundColor(defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC3097a(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f15826T = new C3098b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f15833d0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < Math.max(this.f15833d0.length, size); i10++) {
            TextView textView = sparseArray.get(i10);
            if (i10 >= this.f15833d0.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f15833d0[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z10 = i11 > 1 ? true : z10;
                C10029b0.m18658n(textView, this.f15826T);
                textView.setTextColor(this.f15835f0);
            }
        }
        ClockHandView clockHandView2 = this.f15821O;
        if (clockHandView2.f15838b && !z10) {
            clockHandView2.f15836H = 1;
        }
        clockHandView2.f15838b = z10;
        clockHandView2.invalidate();
        this.f15830a0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f15831b0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f15832c0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC3095a
    /* JADX INFO: renamed from: b */
    public final void mo8927b(float f3) {
        if (Math.abs(this.f15834e0 - f3) > 0.001f) {
            this.f15834e0 = f3;
            m8929t();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C10284f.b.m19274a(1, this.f15833d0.length, 1).f51759a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m8929t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f15832c0 / Math.max(Math.max(this.f15830a0 / displayMetrics.heightPixels, this.f15831b0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.C3099c
    /* JADX INFO: renamed from: s */
    public final void mo8928s() {
        super.mo8928s();
        int i10 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f15825S;
            if (i10 >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i10).setVisibility(0);
            i10++;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m8929t() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f15821O.f15843g;
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f15825S;
            int size = sparseArray.size();
            rectF = this.f15823Q;
            rect = this.f15822P;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f3) {
                    textView = textView2;
                    f3 = fHeight;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f15824R;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f15827U, this.f15828V, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }
}
