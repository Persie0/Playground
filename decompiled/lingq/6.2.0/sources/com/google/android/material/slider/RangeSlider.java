package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import java.util.List;
import p000.C3386nv;
import p000.bl4;
import p000.bna;
import p000.do7;
import p000.dy9;

/* JADX INFO: loaded from: classes2.dex */
public class RangeSlider extends AbstractC1071b {

    /* JADX INFO: renamed from: F1 */
    public float f13114F1;

    /* JADX INFO: renamed from: G1 */
    public int f13115G1;

    public RangeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayM10751d = dy9.m10751d(context, attributeSet, R$styleable.RangeSlider, i, AbstractC1071b.f13118A1, new int[0]);
        if (typedArrayM10751d.hasValue(R$styleable.RangeSlider_values)) {
            TypedArray typedArrayObtainTypedArray = typedArrayM10751d.getResources().obtainTypedArray(typedArrayM10751d.getResourceId(R$styleable.RangeSlider_values, 0));
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                arrayList.add(Float.valueOf(typedArrayObtainTypedArray.getFloat(i2, -1.0f)));
            }
            setValues(arrayList);
        }
        this.f13114F1 = typedArrayM10751d.getDimension(R$styleable.RangeSlider_minSeparation, 0.0f);
        typedArrayM10751d.recycle();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f13143N0;
    }

    public int getContinuousModeTickCount() {
        return this.f13149Q0;
    }

    public int getFocusedThumbIndex() {
        return this.f13145O0;
    }

    public int getHaloRadius() {
        return this.f13187h0;
    }

    public ColorStateList getHaloTintList() {
        return this.f13163Y0;
    }

    public int getLabelBehavior() {
        return this.f13172c0;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public float getMinSeparation() {
        return this.f13114F1;
    }

    public float getStepSize() {
        return this.f13147P0;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public float getThumbElevation() {
        return this.f13208p1;
    }

    public int getThumbHeight() {
        return this.f13184g0;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public int getThumbRadius() {
        return this.f13181f0 / 2;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public ColorStateList getThumbStrokeColor() {
        return this.f13212r1;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public float getThumbStrokeWidth() {
        return this.f13210q1;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public ColorStateList getThumbTintList() {
        return this.f13214s1;
    }

    public int getThumbTrackGapSize() {
        return this.f13190i0;
    }

    public int getThumbWidth() {
        return this.f13181f0;
    }

    public int getTickActiveRadius() {
        return this.f13155T0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f13164Z0;
    }

    public int getTickInactiveRadius() {
        return this.f13157U0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f13167a1;
    }

    public ColorStateList getTickTintList() {
        if (this.f13167a1.equals(this.f13164Z0)) {
            return this.f13164Z0;
        }
        C3386nv.m17633t("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        return null;
    }

    public int getTickVisibilityMode() {
        return this.f13153S0;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f13170b1;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public int getTrackCornerSize() {
        int i = this.f13203n0;
        return i == -1 ? this.f13175d0 / 2 : i;
    }

    public int getTrackHeight() {
        return this.f13175d0;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.f13217u0;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.f13213s0;
    }

    public Drawable getTrackIconActiveStart() {
        return this.f13209q0;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.f13227z0;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.f13223x0;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.f13219v0;
    }

    public int getTrackIconSize() {
        return this.f13123A0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f13173c1;
    }

    public int getTrackInsideCornerSize() {
        return this.f13205o0;
    }

    public int getTrackSidePadding() {
        return this.f13178e0;
    }

    public int getTrackStopIndicatorSize() {
        return this.f13201m0;
    }

    public ColorStateList getTrackTintList() {
        if (this.f13173c1.equals(this.f13170b1)) {
            return this.f13170b1;
        }
        C3386nv.m17633t("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        return null;
    }

    public int getTrackWidth() {
        return this.f13159V0;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public float getValueFrom() {
        return this.f13137K0;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public float getValueTo() {
        return this.f13139L0;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public List<Float> getValues() {
        return super.getValues();
    }

    @Override // com.google.android.material.slider.AbstractC1071b, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.f13114F1 = rangeSliderState.f13116a;
        int i = rangeSliderState.f13117b;
        this.f13115G1 = i;
        setSeparationUnit(i);
    }

    @Override // com.google.android.material.slider.AbstractC1071b, android.view.View
    public final Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        rangeSliderState.f13116a = this.f13114F1;
        rangeSliderState.f13117b = this.f13115G1;
        return rangeSliderState;
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setCentered(boolean z) {
        super.setCentered(z);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setContinuousModeTickCount(int i) {
        super.setContinuousModeTickCount(i);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m6191a(this.f13181f0, drawableNewDrawable);
        this.f13204n1 = drawableNewDrawable;
        this.f13206o1.clear();
        postInvalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setCustomThumbDrawablesForValues(int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
    }

    @Override // com.google.android.material.slider.AbstractC1071b, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setHaloRadius(int i) {
        if (i == this.f13187h0) {
            return;
        }
        this.f13187h0 = i;
        RippleDrawable rippleDrawableM6204n = m6204n();
        if (m6204n() == null || rippleDrawableM6204n == null) {
            postInvalidate();
        } else {
            rippleDrawableM6204n.setRadius(this.f13187h0);
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setLabelBehavior(int i) {
        if (this.f13172c0 != i) {
            this.f13172c0 = i;
            m6187Q(true);
        }
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(bl4 bl4Var) {
    }

    public void setMinSeparation(float f) {
        this.f13114F1 = f;
        this.f13115G1 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.f13114F1 = f;
        this.f13115G1 = 1;
        setSeparationUnit(1);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setOrientation(int i) {
        if (this.f13160W == i) {
            return;
        }
        this.f13160W = i;
        m6187Q(true);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setThumbHeight(int i) {
        super.setThumbHeight(i);
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(do7.m10540p(getContext(), i));
        }
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setThumbTintList(ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setThumbTrackGapSize(int i) {
        if (this.f13190i0 == i) {
            return;
        }
        this.f13190i0 = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public /* bridge */ /* synthetic */ void setThumbWidth(int i) {
        super.setThumbWidth(i);
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTickActiveRadius(int i) {
        if (this.f13155T0 != i) {
            this.f13155T0 = i;
            this.f13180f.setStrokeWidth(i * 2);
            m6187Q(false);
        }
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f13164Z0)) {
            return;
        }
        this.f13164Z0 = colorStateList;
        this.f13180f.setColor(m6205o(colorStateList));
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTickInactiveRadius(int i) {
        if (this.f13157U0 != i) {
            this.f13157U0 = i;
            this.f13177e.setStrokeWidth(i * 2);
            m6187Q(false);
        }
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f13167a1)) {
            return;
        }
        this.f13167a1 = colorStateList;
        this.f13177e.setColor(m6205o(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i) {
        if (this.f13153S0 != i) {
            this.f13153S0 = i;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z) {
        setTickVisibilityMode(z ? 0 : 2);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f13170b1)) {
            return;
        }
        this.f13170b1 = colorStateList;
        this.f13168b.setColor(m6205o(colorStateList));
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackCornerSize(int i) {
        if (this.f13203n0 == i) {
            return;
        }
        this.f13203n0 = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackHeight(int i) {
        if (this.f13175d0 != i) {
            this.f13175d0 = i;
            this.f13165a.setStrokeWidth(i);
            this.f13168b.setStrokeWidth(this.f13175d0);
            m6187Q(false);
        }
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f13217u0) {
            return;
        }
        this.f13217u0 = colorStateList;
        m6184N();
        m6183M();
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.f13213s0) {
            return;
        }
        this.f13213s0 = drawable;
        this.f13215t0 = false;
        m6183M();
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.f13209q0) {
            return;
        }
        this.f13209q0 = drawable;
        this.f13211r0 = false;
        m6184N();
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f13227z0) {
            return;
        }
        this.f13227z0 = colorStateList;
        m6186P();
        m6185O();
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.f13223x0) {
            return;
        }
        this.f13223x0 = drawable;
        this.f13225y0 = false;
        m6185O();
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.f13219v0) {
            return;
        }
        this.f13219v0 = drawable;
        this.f13221w0 = false;
        m6186P();
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackIconSize(int i) {
        if (this.f13123A0 == i) {
            return;
        }
        this.f13123A0 = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f13173c1)) {
            return;
        }
        this.f13173c1 = colorStateList;
        this.f13165a.setColor(m6205o(colorStateList));
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackInsideCornerSize(int i) {
        if (this.f13205o0 == i) {
            return;
        }
        this.f13205o0 = i;
        invalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setTrackStopIndicatorSize(int i) {
        if (this.f13201m0 == i) {
            return;
        }
        this.f13201m0 = i;
        this.f13183g.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f13137K0 = f;
        this.f13162X0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f13139L0 = f;
        this.f13162X0 = true;
        postInvalidate();
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setValues(Float... fArr) {
        super.setValues(fArr);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // com.google.android.material.slider.AbstractC1071b
    public void setValues(List<Float> list) {
        super.setValues(list);
    }

    public void setTrackIconActiveEnd(int i) {
        setTrackIconActiveEnd(i != 0 ? bna.m3932U(getContext(), i) : null);
    }

    public void setTrackIconActiveStart(int i) {
        setTrackIconActiveStart(i != 0 ? bna.m3932U(getContext(), i) : null);
    }

    public void setTrackIconInactiveEnd(int i) {
        setTrackIconInactiveEnd(i != 0 ? bna.m3932U(getContext(), i) : null);
    }

    public void setTrackIconInactiveStart(int i) {
        setTrackIconInactiveStart(i != 0 ? bna.m3932U(getContext(), i) : null);
    }

    public static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new C1072c();

        /* JADX INFO: renamed from: a */
        public float f13116a;

        /* JADX INFO: renamed from: b */
        public int f13117b;

        public RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.f13116a = parcel.readFloat();
            this.f13117b = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f13116a);
            parcel.writeInt(this.f13117b);
        }

        public RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public RangeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.sliderStyle);
    }

    public RangeSlider(Context context) {
        this(context, null);
    }
}
