package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import p000.dy9;
import p000.fs5;
import p000.pb1;
import p000.qs5;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: f */
    public static final int f12947f = R$style.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: a */
    public final fs5 f12948a;

    /* JADX INFO: renamed from: b */
    public int f12949b;

    /* JADX INFO: renamed from: c */
    public int f12950c;

    /* JADX INFO: renamed from: d */
    public int f12951d;

    /* JADX INFO: renamed from: e */
    public int f12952e;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12947f;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f12948a = new fs5();
        TypedArray typedArrayM10751d = dy9.m10751d(context2, attributeSet, R$styleable.MaterialDivider, i, i2, new int[0]);
        this.f12949b = typedArrayM10751d.getDimensionPixelSize(R$styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R$dimen.material_divider_thickness));
        this.f12951d = typedArrayM10751d.getDimensionPixelOffset(R$styleable.MaterialDivider_dividerInsetStart, 0);
        this.f12952e = typedArrayM10751d.getDimensionPixelOffset(R$styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(pb1.m19054x(context2, typedArrayM10751d, R$styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayM10751d.recycle();
    }

    public int getDividerColor() {
        return this.f12950c;
    }

    public int getDividerInsetEnd() {
        return this.f12952e;
    }

    public int getDividerInsetStart() {
        return this.f12951d;
    }

    public int getDividerThickness() {
        return this.f12949b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.f12952e : this.f12951d;
        if (z) {
            width = getWidth();
            i = this.f12951d;
        } else {
            width = getWidth();
            i = this.f12952e;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        fs5 fs5Var = this.f12948a;
        fs5Var.setBounds(i2, 0, i3, bottom);
        fs5Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f12949b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f12950c != i) {
            this.f12950c = i;
            this.f12948a.m12076t(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.f12952e = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f12951d = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f12949b != i) {
            this.f12949b = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialDividerStyle);
    }

    public MaterialDivider(Context context) {
        this(context, null);
    }
}
