package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C0006a4;
import p000.c41;
import p000.do7;
import p000.dta;
import p000.dw6;
import p000.fs5;
import p000.mt6;
import p000.og0;
import p000.oj1;
import p000.p48;
import p000.pb1;
import p000.sj1;

/* JADX INFO: loaded from: classes2.dex */
public class ClockFaceView extends ConstraintLayout {

    /* JADX INFO: renamed from: L */
    public final mt6 f13322L;

    /* JADX INFO: renamed from: M */
    public int f13323M;

    /* JADX INFO: renamed from: N */
    public final fs5 f13324N;

    /* JADX INFO: renamed from: O */
    public final ClockHandView f13325O;

    /* JADX INFO: renamed from: P */
    public final Rect f13326P;

    /* JADX INFO: renamed from: Q */
    public final RectF f13327Q;

    /* JADX INFO: renamed from: R */
    public final Rect f13328R;

    /* JADX INFO: renamed from: S */
    public final SparseArray f13329S;

    /* JADX INFO: renamed from: T */
    public final og0 f13330T;

    /* JADX INFO: renamed from: U */
    public final int[] f13331U;

    /* JADX INFO: renamed from: V */
    public final float[] f13332V;

    /* JADX INFO: renamed from: W */
    public final int f13333W;

    /* JADX INFO: renamed from: a0 */
    public final int f13334a0;

    /* JADX INFO: renamed from: b0 */
    public final int f13335b0;

    /* JADX INFO: renamed from: c0 */
    public final int f13336c0;

    /* JADX INFO: renamed from: d0 */
    public final String[] f13337d0;

    /* JADX INFO: renamed from: e0 */
    public float f13338e0;

    /* JADX INFO: renamed from: f0 */
    public final ColorStateList f13339f0;

    /* JADX INFO: renamed from: g0 */
    public dw6 f13340g0;

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.material_radial_view_group, this);
        fs5 fs5Var = new fs5();
        this.f13324N = fs5Var;
        fs5Var.setShapeAppearanceModel(fs5Var.f39578b.f36160a.mo13921e(new p48(0.5f)));
        this.f13324N.m12076t(ColorStateList.valueOf(-1));
        setBackground(this.f13324N);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadialViewGroup, i, 0);
        this.f13323M = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f13322L = new mt6(this, 4);
        typedArrayObtainStyledAttributes.recycle();
        this.f13326P = new Rect();
        this.f13327Q = new RectF();
        this.f13328R = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f13329S = sparseArray;
        int i2 = 3;
        this.f13332V = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.ClockFaceView, i, R$style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM19054x = pb1.m19054x(context, typedArrayObtainStyledAttributes2, R$styleable.ClockFaceView_clockNumberTextColor);
        this.f13339f0 = colorStateListM19054x;
        LayoutInflater.from(context).inflate(R$layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R$id.material_clock_hand);
        this.f13325O = clockHandView;
        this.f13333W = resources.getDimensionPixelSize(R$dimen.material_clock_hand_padding);
        int colorForState = colorStateListM19054x.getColorForState(new int[]{R.attr.state_selected}, colorStateListM19054x.getDefaultColor());
        this.f13331U = new int[]{colorForState, colorForState, colorStateListM19054x.getDefaultColor()};
        clockHandView.f13345c.add(this);
        int defaultColor = do7.m10540p(context, R$color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM19054x2 = pb1.m19054x(context, typedArrayObtainStyledAttributes2, R$styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListM19054x2 != null ? colorStateListM19054x2.getDefaultColor() : defaultColor);
        typedArrayObtainStyledAttributes2.recycle();
        setOutlineProvider(new c41(0));
        setFocusable(true);
        setClipToOutline(true);
        this.f13330T = new og0(this, i2);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f13337d0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i3 = 0; i3 < Math.max(this.f13337d0.length, size); i3++) {
            TextView textView = (TextView) sparseArray.get(i3);
            if (i3 >= this.f13337d0.length) {
                removeView(textView);
                sparseArray.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R$layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i3, textView);
                    addView(textView);
                }
                textView.setText(this.f13337d0[i3]);
                textView.setTag(R$id.material_value_index, Integer.valueOf(i3));
                int i4 = (i3 / 12) + 1;
                textView.setTag(R$id.material_clock_level, Integer.valueOf(i4));
                z = i4 > 1 ? true : z;
                dta.m10640k(textView, this.f13330T);
                textView.setTextColor(this.f13339f0);
            }
        }
        ClockHandView clockHandView2 = this.f13325O;
        if (clockHandView2.f13344b && !z) {
            clockHandView2.f13342H = 1;
        }
        clockHandView2.f13344b = z;
        clockHandView2.invalidate();
        this.f13334a0 = resources.getDimensionPixelSize(R$dimen.material_time_picker_minimum_screen_height);
        this.f13335b0 = resources.getDimensionPixelSize(R$dimen.material_time_picker_minimum_screen_width);
        this.f13336c0 = resources.getDimensionPixelSize(R$dimen.material_clock_size);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            mt6 mt6Var = this.f13322L;
            handler.removeCallbacks(mt6Var);
            handler.post(mt6Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6250o() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f13325O.f13349g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f13329S;
            int size = sparseArray.size();
            rect = this.f13326P;
            rectF = this.f13327Q;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f13328R;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f13331U, this.f13332V, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m6251p();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0006a4.m94b(1, this.f13337d0.length, 1).f193a);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int iIntValue;
        int length;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f13329S;
            if (i2 >= sparseArray.size()) {
                iIntValue = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i2);
            if (textView.isSelected()) {
                iIntValue = ((Integer) textView.getTag(R$id.material_value_index)).intValue();
                break;
            }
            i2++;
        }
        if (!isShown() || iIntValue == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            String[] strArr = this.f13337d0;
            switch (i) {
                case 19:
                case 22:
                    length = (iIntValue + 1) % strArr.length;
                    break;
                case 20:
                case 21:
                    length = ((iIntValue - 1) + strArr.length) % strArr.length;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
            if (length == iIntValue) {
                return super.onKeyDown(i, keyEvent);
            }
            int i3 = (length / 12) + 1;
            ClockHandView clockHandView = this.f13325O;
            if (i3 != clockHandView.f13342H) {
                clockHandView.f13342H = i3;
                clockHandView.invalidate();
            }
            clockHandView.m6252a((length % 12) * 30.0f);
            m6250o();
            return true;
        }
        dw6 dw6Var = this.f13340g0;
        if (dw6Var != null) {
            ((TimePickerView) dw6Var.f36323b).f13356L.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m6250o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f13336c0 / Math.max(Math.max(this.f13334a0 / displayMetrics.heightPixels, this.f13335b0 / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i2));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        ClockHandView clockHandView = this.f13325O;
        int i3 = ((iMax / 2) - clockHandView.f13346d) - this.f13333W;
        int i4 = this.f13323M;
        if (i3 != i4 && i3 != i4) {
            this.f13323M = i3;
            m6251p();
            clockHandView.f13354l = this.f13323M;
            clockHandView.invalidate();
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            mt6 mt6Var = this.f13322L;
            handler.removeCallbacks(mt6Var);
            handler.post(mt6Var);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m6251p() {
        sj1 sj1Var = new sj1();
        sj1Var.m21410e(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R$id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R$id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iRound = this.f13323M;
            if (iIntValue == 2) {
                iRound = Math.round(iRound * 0.66f);
            }
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                int i3 = R$id.circle_center;
                oj1 oj1Var = sj1Var.m21411h(id).f52823e;
                oj1Var.f54390A = i3;
                oj1Var.f54391B = iRound;
                oj1Var.f54392C = size;
                size += 360.0f / list.size();
            }
        }
        sj1Var.m21408b(this);
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f13329S;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f13324N.m12076t(ColorStateList.valueOf(i));
    }

    public ClockFaceView(Context context) {
        this(context, null);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialClockStyle);
    }
}
