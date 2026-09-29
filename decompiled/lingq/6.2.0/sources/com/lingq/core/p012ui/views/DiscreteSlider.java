package com.lingq.core.p012ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R$attr;
import com.google.android.material.slider.RangeSlider;
import com.lingq.core.designsystem.R$styleable;
import com.lingq.core.font.R$font;
import com.lingq.core.p012ui.R$layout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.C3386nv;
import p000.f88;
import p000.fa4;
import p000.jfa;
import p000.u91;
import p000.vg2;
import p000.vk9;
import p000.vz1;
import p000.wg2;
import p000.xg2;
import p000.y52;
import p000.z28;

/* JADX INFO: loaded from: classes2.dex */
public final class DiscreteSlider extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f24179k = 0;

    /* JADX INFO: renamed from: a */
    public final LinearLayout f24180a;

    /* JADX INFO: renamed from: b */
    public final RangeSlider f24181b;

    /* JADX INFO: renamed from: c */
    public final TextView f24182c;

    /* JADX INFO: renamed from: d */
    public int f24183d;

    /* JADX INFO: renamed from: e */
    public int f24184e;

    /* JADX INFO: renamed from: f */
    public List f24185f;

    /* JADX INFO: renamed from: g */
    public List f24186g;

    /* JADX INFO: renamed from: h */
    public String f24187h;

    /* JADX INFO: renamed from: i */
    public int f24188i;

    /* JADX INFO: renamed from: j */
    public int f24189j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public DiscreteSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Float fValueOf = Float.valueOf(0.0f);
        context.getClass();
        this.f24184e = jfa.m14431n(context, R$attr.colorOnSurface);
        ?? arrayList = EmptyList.f47638a;
        this.f24185f = arrayList;
        this.f24186g = arrayList;
        this.f24187h = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DiscreteSlider, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        this.f24183d = typedArrayObtainStyledAttributes.getInt(R$styleable.DiscreteSlider_sectionCount, 5);
        this.f24184e = typedArrayObtainStyledAttributes.getColor(R$styleable.DiscreteSlider_labelColor, this.f24184e);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(R$styleable.DiscreteSlider_labels);
        if (textArray != null) {
            arrayList = new ArrayList(textArray.length);
            for (CharSequence charSequence : textArray) {
                arrayList.add(charSequence.toString());
            }
        }
        this.f24186g = arrayList;
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(1);
        setGravity(16);
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        ((LayoutInflater) systemService).inflate(R$layout.view_discrete_slider, (ViewGroup) this, true);
        View childAt = getChildAt(0);
        childAt.getClass();
        this.f24182c = (TextView) childAt;
        View childAt2 = getChildAt(1);
        childAt2.getClass();
        RangeSlider rangeSlider = (RangeSlider) childAt2;
        this.f24181b = rangeSlider;
        rangeSlider.setValues(vz1.m23605K(fValueOf, fValueOf));
        rangeSlider.setStepSize(1.0f);
        rangeSlider.setValueFrom(0.0f);
        rangeSlider.setValueTo(this.f24183d - 1.0f);
        View childAt3 = getChildAt(2);
        childAt3.getClass();
        this.f24180a = (LinearLayout) childAt3;
        m8802a(context);
        rangeSlider.f13130H.add(new vg2(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m8802a(Context context) {
        int i = 0;
        for (String str : this.f24186g) {
            int i2 = i + 1;
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextColor(this.f24184e);
            textView.setTypeface(f88.m11597a(context, R$font.font_dm_sans));
            textView.setGravity(8388611);
            textView.setTextDirection(5);
            this.f24180a.addView(textView);
            textView.setLayoutParams(i == this.f24186g.size() + (-1) ? new LinearLayout.LayoutParams(-2, -2, 0.0f) : new LinearLayout.LayoutParams(-2, -2, 1.0f));
            i = i2;
        }
    }

    public final void setDetectDragFinished(boolean z) {
        if (z) {
            this.f24181b.f13132I.add(new xg2());
        }
    }

    public final void setDiscreteSliderListener(wg2 wg2Var) {
        wg2Var.getClass();
    }

    public final void setLabelTextColor(int i) {
        this.f24184e = i;
        this.f24180a.removeAllViews();
        Context context = getContext();
        context.getClass();
        m8802a(context);
    }

    public final void setLabels(List<String> list) {
        list.getClass();
        this.f24186g = list;
        this.f24180a.removeAllViews();
        Context context = getContext();
        context.getClass();
        m8802a(context);
    }

    public final void setRangeTextValues(List<String> list) {
        list.getClass();
        this.f24185f = list;
    }

    public final void setSectionCount(int i) {
        this.f24183d = i;
        this.f24181b.setValueTo(i - 1.0f);
    }

    public final void setSideMargins(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            C3386nv.m17635v("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            return;
        }
        z28 z28Var = (z28) layoutParams;
        ((ViewGroup.MarginLayoutParams) z28Var).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) z28Var).rightMargin = i;
        setLayoutParams(z28Var);
    }

    public final void setTitle(String str) {
        str.getClass();
        this.f24187h = str;
        this.f24182c.setText(str);
    }

    public final void setValues(List<Float> list) {
        list.getClass();
        this.f24181b.setValues(list);
        String str = (String) this.f24185f.get((int) ((Number) u91.m22589G0(list)).floatValue());
        String str2 = (String) this.f24185f.get((int) ((Number) u91.m22597O0(list)).floatValue());
        if (vk9.m23391n0(this.f24187h)) {
            if (!fa4.m11650l(str, str2)) {
                str = String.format("%s - %s", Arrays.copyOf(new Object[]{str, str2}, 2));
            }
            this.f24182c.setText(str);
        }
    }

    public /* synthetic */ DiscreteSlider(Context context, AttributeSet attributeSet, int i, y52 y52Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DiscreteSlider(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }
}
