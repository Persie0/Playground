package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.focus.FocusRingDrawable;
import p000.AbstractC3122is;
import p000.bna;
import p000.dy9;
import p000.gka;
import p000.qs5;
import p000.sq5;
import p000.ya1;
import p000.zo9;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialSwitch extends zo9 {

    /* JADX INFO: renamed from: E0 */
    public static final int f13037E0 = R$style.Widget_Material3_CompoundButton_MaterialSwitch;

    /* JADX INFO: renamed from: F0 */
    public static final int[] f13038F0 = {R$attr.state_with_icon};

    /* JADX INFO: renamed from: A0 */
    public ColorStateList f13039A0;

    /* JADX INFO: renamed from: B0 */
    public PorterDuff.Mode f13040B0;

    /* JADX INFO: renamed from: C0 */
    public int[] f13041C0;

    /* JADX INFO: renamed from: D0 */
    public int[] f13042D0;

    /* JADX INFO: renamed from: r0 */
    public Drawable f13043r0;

    /* JADX INFO: renamed from: s0 */
    public Drawable f13044s0;

    /* JADX INFO: renamed from: t0 */
    public int f13045t0;

    /* JADX INFO: renamed from: u0 */
    public Drawable f13046u0;

    /* JADX INFO: renamed from: v0 */
    public Drawable f13047v0;

    /* JADX INFO: renamed from: w0 */
    public ColorStateList f13048w0;

    /* JADX INFO: renamed from: x0 */
    public ColorStateList f13049x0;

    /* JADX INFO: renamed from: y0 */
    public PorterDuff.Mode f13050y0;

    /* JADX INFO: renamed from: z0 */
    public ColorStateList f13051z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        int i2 = f13037E0;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        this.f13045t0 = -1;
        Context context2 = getContext();
        this.f13043r0 = super.getThumbDrawable();
        this.f13048w0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f13046u0 = super.getTrackDrawable();
        this.f13051z0 = super.getTrackTintList();
        super.setTrackTintList(null);
        sq5 sq5VarM10752e = dy9.m10752e(context2, attributeSet, R$styleable.MaterialSwitch, i, i2, new int[0]);
        this.f13044s0 = sq5VarM10752e.m21568j(R$styleable.MaterialSwitch_thumbIcon);
        int i3 = R$styleable.MaterialSwitch_thumbIconSize;
        TypedArray typedArray = (TypedArray) sq5VarM10752e.f61249c;
        this.f13045t0 = typedArray.getDimensionPixelSize(i3, -1);
        this.f13049x0 = sq5VarM10752e.m21567i(R$styleable.MaterialSwitch_thumbIconTint);
        int i4 = typedArray.getInt(R$styleable.MaterialSwitch_thumbIconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f13050y0 = gka.m12724c(i4, mode);
        this.f13047v0 = sq5VarM10752e.m21568j(R$styleable.MaterialSwitch_trackDecoration);
        this.f13039A0 = sq5VarM10752e.m21567i(R$styleable.MaterialSwitch_trackDecorationTint);
        this.f13040B0 = gka.m12724c(typedArray.getInt(R$styleable.MaterialSwitch_trackDecorationTintMode, -1), mode);
        sq5VarM10752e.m21582y();
        setEnforceSwitchWidth(false);
        m6156e();
        m6157f();
    }

    /* JADX INFO: renamed from: g */
    public static void m6155g(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(ya1.m25010c(colorStateList.getColorForState(iArr, 0), f, colorStateList.getColorForState(iArr2, 0)));
    }

    /* JADX INFO: renamed from: e */
    public final void m6156e() {
        this.f13043r0 = AbstractC3122is.m14100n(this.f13043r0, this.f13048w0, getThumbTintMode());
        this.f13044s0 = AbstractC3122is.m14100n(this.f13044s0, this.f13049x0, this.f13050y0);
        m6158h();
        Drawable drawable = this.f13043r0;
        Drawable drawable2 = this.f13044s0;
        int i = this.f13045t0;
        super.setThumbDrawable(AbstractC3122is.m14097k(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: f */
    public final void m6157f() {
        this.f13046u0 = AbstractC3122is.m14100n(this.f13046u0, this.f13051z0, getTrackTintMode());
        this.f13047v0 = AbstractC3122is.m14100n(this.f13047v0, this.f13039A0, this.f13040B0);
        m6158h();
        Drawable layerDrawable = this.f13046u0;
        if (layerDrawable != null && this.f13047v0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f13046u0, this.f13047v0});
        } else if (layerDrawable == null) {
            layerDrawable = this.f13047v0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // p000.zo9
    public Drawable getThumbDrawable() {
        return this.f13043r0;
    }

    public Drawable getThumbIconDrawable() {
        return this.f13044s0;
    }

    public int getThumbIconSize() {
        return this.f13045t0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f13049x0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f13050y0;
    }

    @Override // p000.zo9
    public ColorStateList getThumbTintList() {
        return this.f13048w0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f13047v0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f13039A0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f13040B0;
    }

    @Override // p000.zo9
    public Drawable getTrackDrawable() {
        return this.f13046u0;
    }

    @Override // p000.zo9
    public ColorStateList getTrackTintList() {
        return this.f13051z0;
    }

    /* JADX INFO: renamed from: h */
    public final void m6158h() {
        if (this.f13048w0 == null && this.f13049x0 == null && this.f13051z0 == null && this.f13039A0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f13048w0;
        if (colorStateList != null) {
            m6155g(this.f13043r0, colorStateList, this.f13041C0, this.f13042D0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f13049x0;
        if (colorStateList2 != null) {
            m6155g(this.f13044s0, colorStateList2, this.f13041C0, this.f13042D0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f13051z0;
        if (colorStateList3 != null) {
            m6155g(this.f13046u0, colorStateList3, this.f13041C0, this.f13042D0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f13039A0;
        if (colorStateList4 != null) {
            m6155g(this.f13047v0, colorStateList4, this.f13041C0, this.f13042D0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        m6158h();
        super.invalidate();
    }

    @Override // p000.zo9, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f13044s0 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f13038F0);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.f13041C0 = iArr;
        this.f13042D0 = AbstractC3122is.m14106t(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // p000.zo9, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FocusRingDrawable focusRingDrawableM6145c;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f13046u0 == null || (focusRingDrawableM6145c = FocusRingDrawable.m6145c(getBackground())) == null) {
            return;
        }
        focusRingDrawableM6145c.mutate();
        focusRingDrawableM6145c.f12983J.f36921w = this.f13046u0.getBounds();
    }

    @Override // p000.zo9
    public void setThumbDrawable(Drawable drawable) {
        this.f13043r0 = drawable;
        m6156e();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f13044s0 = drawable;
        m6156e();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(bna.m3932U(getContext(), i));
    }

    public void setThumbIconSize(int i) {
        if (this.f13045t0 != i) {
            this.f13045t0 = i;
            m6156e();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f13049x0 = colorStateList;
        m6156e();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f13050y0 = mode;
        m6156e();
    }

    @Override // p000.zo9
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f13048w0 = colorStateList;
        m6156e();
    }

    @Override // p000.zo9
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m6156e();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f13047v0 = drawable;
        m6157f();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(bna.m3932U(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f13039A0 = colorStateList;
        m6157f();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f13040B0 = mode;
        m6157f();
    }

    @Override // p000.zo9
    public void setTrackDrawable(Drawable drawable) {
        this.f13046u0 = drawable;
        m6157f();
    }

    @Override // p000.zo9
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f13051z0 = colorStateList;
        m6157f();
    }

    @Override // p000.zo9
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m6157f();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context) {
        this(context, null);
    }
}
