package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC3184kh;
import p000.C3009fp;
import p000.C3386nv;
import p000.C3487q7;
import p000.RunnableC0002a0;
import p000.RunnableC0806bd;
import p000.RunnableC2971eo;
import p000.bna;
import p000.ck6;
import p000.do7;
import p000.dy9;
import p000.fs5;
import p000.gka;
import p000.ih9;
import p000.kh9;
import p000.l90;
import p000.or5;
import p000.p39;
import p000.pb1;
import p000.pr5;
import p000.qr5;
import p000.qs5;
import p000.r39;
import p000.r46;
import p000.sr5;
import p000.t49;
import p000.wq1;
import p000.yf9;
import p000.zf9;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C3009fp implements Checkable, t49 {

    /* JADX INFO: renamed from: l0 */
    public static final int[] f12752l0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: m0 */
    public static final int[] f12753m0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: n0 */
    public static final int f12754n0 = R$style.Widget_MaterialComponents_Button;

    /* JADX INFO: renamed from: o0 */
    public static final int f12755o0 = R$attr.materialSizeOverlay;

    /* JADX INFO: renamed from: p0 */
    public static final pr5 f12756p0 = new pr5(14);

    /* JADX INFO: renamed from: H */
    public boolean f12757H;

    /* JADX INFO: renamed from: I */
    public String f12758I;

    /* JADX INFO: renamed from: J */
    public int f12759J;

    /* JADX INFO: renamed from: K */
    public int f12760K;

    /* JADX INFO: renamed from: L */
    public int f12761L;

    /* JADX INFO: renamed from: M */
    public int f12762M;

    /* JADX INFO: renamed from: N */
    public int f12763N;

    /* JADX INFO: renamed from: O */
    public int f12764O;

    /* JADX INFO: renamed from: P */
    public boolean f12765P;

    /* JADX INFO: renamed from: Q */
    public boolean f12766Q;

    /* JADX INFO: renamed from: R */
    public int f12767R;

    /* JADX INFO: renamed from: S */
    public int f12768S;

    /* JADX INFO: renamed from: T */
    public int f12769T;

    /* JADX INFO: renamed from: U */
    public float f12770U;

    /* JADX INFO: renamed from: V */
    public int f12771V;

    /* JADX INFO: renamed from: W */
    public int f12772W;

    /* JADX INFO: renamed from: a0 */
    public LinearLayout.LayoutParams f12773a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f12774b0;

    /* JADX INFO: renamed from: c0 */
    public int f12775c0;

    /* JADX INFO: renamed from: d */
    public final sr5 f12776d;

    /* JADX INFO: renamed from: d0 */
    public boolean f12777d0;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f12778e;

    /* JADX INFO: renamed from: e0 */
    public int f12779e0;

    /* JADX INFO: renamed from: f */
    public qr5 f12780f;

    /* JADX INFO: renamed from: f0 */
    public kh9 f12781f0;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f12782g;

    /* JADX INFO: renamed from: g0 */
    public int f12783g0;

    /* JADX INFO: renamed from: h */
    public ColorStateList f12784h;

    /* JADX INFO: renamed from: h0 */
    public WidthChangeDirection f12785h0;

    /* JADX INFO: renamed from: i */
    public Drawable f12786i;

    /* JADX INFO: renamed from: i0 */
    public float f12787i0;

    /* JADX INFO: renamed from: j */
    public PorterDuff.Mode f12788j;

    /* JADX INFO: renamed from: j0 */
    public float f12789j0;

    /* JADX INFO: renamed from: k */
    public ColorStateList f12790k;

    /* JADX INFO: renamed from: k0 */
    public yf9 f12791k0;

    /* JADX INFO: renamed from: l */
    public Drawable f12792l;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1050a();

        /* JADX INFO: renamed from: c */
        public boolean f12793c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f12793c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12793c ? 1 : 0);
        }
    }

    public enum WidthChangeDirection {
        NONE,
        START,
        END,
        BOTH
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int[] iArr = {f12755o0};
        int i2 = f12754n0;
        super(qs5.m20140a(i, i2, context, attributeSet, iArr), attributeSet, i);
        this.f12778e = new LinkedHashSet();
        this.f12765P = false;
        this.f12766Q = false;
        this.f12769T = Integer.MIN_VALUE;
        this.f12770U = -2.1474836E9f;
        this.f12771V = Integer.MIN_VALUE;
        this.f12772W = Integer.MIN_VALUE;
        this.f12779e0 = Integer.MIN_VALUE;
        this.f12785h0 = WidthChangeDirection.BOTH;
        Context context2 = getContext();
        TypedArray typedArrayM10751d = dy9.m10751d(context2, attributeSet, R$styleable.MaterialButton, i, i2, new int[0]);
        this.f12762M = typedArrayM10751d.getDimensionPixelSize(R$styleable.MaterialButton_iconPadding, 0);
        int i3 = typedArrayM10751d.getInt(R$styleable.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f12782g = gka.m12724c(i3, mode);
        this.f12784h = pb1.m19054x(getContext(), typedArrayM10751d, R$styleable.MaterialButton_iconTint);
        this.f12786i = pb1.m19013A(getContext(), typedArrayM10751d, R$styleable.MaterialButton_icon);
        this.f12767R = typedArrayM10751d.getInteger(R$styleable.MaterialButton_iconGravity, 1);
        this.f12759J = typedArrayM10751d.getDimensionPixelSize(R$styleable.MaterialButton_iconSize, 0);
        this.f12788j = gka.m12724c(typedArrayM10751d.getInt(R$styleable.MaterialButton_secondaryIconTintMode, -1), mode);
        this.f12790k = typedArrayM10751d.hasValue(R$styleable.MaterialButton_secondaryIconTint) ? pb1.m19054x(getContext(), typedArrayM10751d, R$styleable.MaterialButton_secondaryIconTint) : this.f12784h;
        this.f12768S = typedArrayM10751d.getInteger(R$styleable.MaterialButton_secondaryIconGravity, 3);
        Drawable drawableM19013A = pb1.m19013A(getContext(), typedArrayM10751d, R$styleable.MaterialButton_secondaryIcon);
        this.f12792l = drawableM19013A;
        this.f12757H = drawableM19013A == null;
        p39 p39VarM13916h = ih9.m13916h(context2, typedArrayM10751d, R$styleable.MaterialButton_shapeAppearance);
        p39VarM13916h = p39VarM13916h == null ? r39.m20281h(context2, attributeSet, i, i2).m19627a() : p39VarM13916h;
        boolean z = typedArrayM10751d.getBoolean(R$styleable.MaterialButton_opticalCenterEnabled, false);
        sr5 sr5Var = new sr5(this, p39VarM13916h);
        this.f12776d = sr5Var;
        sr5Var.f61300e = typedArrayM10751d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetLeft, 0);
        sr5Var.f61301f = typedArrayM10751d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetRight, 0);
        sr5Var.f61302g = typedArrayM10751d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetTop, 0);
        sr5Var.f61303h = typedArrayM10751d.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetBottom, 0);
        if (typedArrayM10751d.hasValue(R$styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArrayM10751d.getDimensionPixelSize(R$styleable.MaterialButton_cornerRadius, -1);
            sr5Var.f61304i = dimensionPixelSize;
            sr5Var.f61297b = sr5Var.f61297b.mo13917a(dimensionPixelSize);
            sr5Var.m21672d();
            sr5Var.f61313r = true;
        }
        sr5Var.f61305j = typedArrayM10751d.getDimensionPixelSize(R$styleable.MaterialButton_strokeWidth, 0);
        sr5Var.f61306k = gka.m12724c(typedArrayM10751d.getInt(R$styleable.MaterialButton_backgroundTintMode, -1), mode);
        sr5Var.f61307l = pb1.m19054x(getContext(), typedArrayM10751d, R$styleable.MaterialButton_backgroundTint);
        sr5Var.f61308m = pb1.m19054x(getContext(), typedArrayM10751d, R$styleable.MaterialButton_strokeColor);
        sr5Var.f61309n = pb1.m19054x(getContext(), typedArrayM10751d, R$styleable.MaterialButton_rippleColor);
        sr5Var.f61314s = typedArrayM10751d.getBoolean(R$styleable.MaterialButton_android_checkable, false);
        sr5Var.f61317v = typedArrayM10751d.getDimensionPixelSize(R$styleable.MaterialButton_elevation, 0);
        sr5Var.f61315t = typedArrayM10751d.getBoolean(R$styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM10751d.hasValue(R$styleable.MaterialButton_android_background)) {
            sr5Var.f61312q = true;
            setSupportBackgroundTintList(sr5Var.f61307l);
            setSupportBackgroundTintMode(sr5Var.f61306k);
        } else {
            sr5Var.m21671c();
        }
        setPaddingRelative(paddingStart + sr5Var.f61300e, paddingTop + sr5Var.f61302g, paddingEnd + sr5Var.f61301f, paddingBottom + sr5Var.f61303h);
        setCheckedInternal(typedArrayM10751d.getBoolean(R$styleable.MaterialButton_android_checked, false));
        if (p39VarM13916h instanceof ih9) {
            sr5Var.f61298c = r46.m20366I(getContext(), R$attr.motionSpringFastSpatial, R$style.Motion_Material3_Spring_Standard_Fast_Spatial);
            if (sr5Var.f61297b instanceof ih9) {
                sr5Var.m21672d();
            }
        }
        setOpticalCenterEnabled(z);
        typedArrayM10751d.recycle();
        setCompoundDrawablePadding(this.f12762M);
        m6070t(this.f12786i != null);
        m6073w(this.f12792l != null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6051a(MaterialButton materialButton) {
        materialButton.f12775c0 = materialButton.getOpticalCenterShift();
        materialButton.m6072v();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f12787i0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        fs5 fs5VarM21669a;
        if (this.f12774b0 && this.f12777d0 && (fs5VarM21669a = this.f12776d.m21669a(false)) != null) {
            return (int) (fs5VarM21669a.m12066j() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        if (!m6060j() || this.f12765P == z) {
            return;
        }
        this.f12765P = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).m6076n(this, this.f12765P);
        }
        if (this.f12766Q) {
            return;
        }
        this.f12766Q = true;
        Iterator it = this.f12778e.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        this.f12766Q = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.f12787i0 != f) {
            this.f12787i0 = f;
            m6072v();
            invalidate();
            if (getParent() instanceof AbstractC1051b) {
                ((AbstractC1051b) getParent()).m6087j(this, (int) this.f12787i0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6054d() {
        if (m6062l() && m6065o()) {
            return true;
        }
        if (m6061k() && m6064n()) {
            return true;
        }
        return m6063m() && m6066p();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6055e(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    /* JADX INFO: renamed from: f */
    public final int m6056f(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.f12786i;
        if (drawable != null) {
            intrinsicWidth = this.f12759J;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.f12792l;
        if (drawable2 != null) {
            intrinsicWidth2 = this.f12759J;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.f12762M) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    /* JADX INFO: renamed from: g */
    public final int m6057g(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.f12762M) - getPaddingBottom()) / 2);
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f12758I)) {
            return (m6060j() ? CompoundButton.class : Button.class).getName();
        }
        return this.f12758I;
    }

    public int getAllowedWidthDecrease() {
        return this.f12779e0;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m6067q()) {
            return this.f12776d.f61304i;
        }
        return 0;
    }

    public zf9 getCornerSpringForce() {
        return this.f12776d.f61298c;
    }

    public Drawable getIcon() {
        return this.f12786i;
    }

    public int getIconGravity() {
        return this.f12767R;
    }

    public int getIconPadding() {
        return this.f12762M;
    }

    public int getIconSize() {
        return this.f12759J;
    }

    public ColorStateList getIconTint() {
        return this.f12784h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f12782g;
    }

    public int getInsetBottom() {
        return this.f12776d.f61303h;
    }

    public int getInsetLeft() {
        return this.f12776d.f61300e;
    }

    public int getInsetRight() {
        return this.f12776d.f61301f;
    }

    public int getInsetTop() {
        return this.f12776d.f61302g;
    }

    public ColorStateList getRippleColor() {
        if (m6067q()) {
            return this.f12776d.f61309n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.f12792l;
    }

    public int getSecondaryIconGravity() {
        return this.f12768S;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.f12790k;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.f12788j;
    }

    public p39 getShapeAppearance() {
        if (m6067q()) {
            return this.f12776d.f61297b;
        }
        C3386nv.m17633t("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public r39 getShapeAppearanceModel() {
        if (m6067q()) {
            return this.f12776d.f61297b.mo13920d();
        }
        C3386nv.m17633t("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m6067q()) {
            return this.f12776d.f61308m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m6067q()) {
            return this.f12776d.f61305j;
        }
        return 0;
    }

    @Override // p000.C3009fp
    public ColorStateList getSupportBackgroundTintList() {
        return m6067q() ? this.f12776d.f61307l : super.getSupportBackgroundTintList();
    }

    @Override // p000.C3009fp
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m6067q() ? this.f12776d.f61306k : super.getSupportBackgroundTintMode();
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m6058h(int i) {
        if (i == 0) {
            if (this.f12792l == null || !m6065o()) {
                return null;
            }
            return this.f12792l;
        }
        if (i == 1) {
            if (this.f12792l == null || !m6066p()) {
                return null;
            }
            return this.f12792l;
        }
        if (i == 2 && this.f12792l != null && m6064n()) {
            return this.f12792l;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final Drawable m6059i(int i) {
        if (i == 0) {
            if (this.f12786i == null || !m6062l()) {
                return null;
            }
            return this.f12786i;
        }
        if (i == 1) {
            if (this.f12786i == null || !m6061k()) {
                return null;
            }
            return this.f12786i;
        }
        if (i == 2 && this.f12786i != null && m6061k()) {
            return this.f12786i;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f12765P;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6060j() {
        sr5 sr5Var = this.f12776d;
        return sr5Var != null && sr5Var.f61314s;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m6061k() {
        int i = this.f12767R;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m6062l() {
        int i = this.f12767R;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6063m() {
        int i = this.f12767R;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6064n() {
        int i = this.f12768S;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m6065o() {
        int i = this.f12768S;
        return i == 1 || i == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m6067q()) {
            AbstractC3184kh.m15200G(this, this.f12776d.m21669a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m6060j()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12752l0);
        }
        if (this.f12765P) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12753m0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000.C3009fp, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f12765P);
    }

    @Override // p000.C3009fp, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m6060j());
        accessibilityNodeInfo.setChecked(this.f12765P);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000.C3009fp, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        m6071u(getMeasuredWidth(), getMeasuredHeight());
        m6074x(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.f12769T != i6) {
            this.f12769T = i6;
            this.f12770U = -2.1474836E9f;
        }
        if (this.f12770U == -2.1474836E9f) {
            this.f12770U = getMeasuredWidth();
            if (this.f12773a0 == null && (getParent() instanceof AbstractC1051b) && ((AbstractC1051b) getParent()).getButtonSizeChange() != null) {
                this.f12773a0 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f12773a0);
                layoutParams.width = (int) this.f12770U;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.f12779e0 == Integer.MIN_VALUE) {
            if (this.f12786i == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f12759J;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f12786i.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.f12779e0 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.f12771V == Integer.MIN_VALUE) {
            this.f12771V = getPaddingStart();
        }
        if (this.f12772W == Integer.MIN_VALUE) {
            this.f12772W = getPaddingEnd();
        }
        if ((getParent() instanceof AbstractC1051b) && ((AbstractC1051b) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.f12777d0 = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5563a);
        setChecked(savedState.f12793c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12793c = this.f12765P;
        return savedState;
    }

    @Override // p000.C3009fp, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m6071u(getMeasuredWidth(), getMeasuredHeight());
        m6074x(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX INFO: renamed from: p */
    public final boolean m6066p() {
        int i = this.f12768S;
        return i == 16 || i == 32;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.f12776d.f61315t) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m6067q() {
        sr5 sr5Var = this.f12776d;
        return (sr5Var == null || sr5Var.f61312q) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public final void m6068r(boolean z) {
        int i;
        if (this.f12781f0 == null) {
            return;
        }
        if (this.f12791k0 == null) {
            yf9 yf9Var = new yf9(this, f12756p0);
            this.f12791k0 = yf9Var;
            yf9Var.f69795m = r46.m20366I(getContext(), R$attr.motionSpringFastSpatial, R$style.Motion_Material3_Spring_Standard_Fast_Spatial);
        }
        if (this.f12777d0) {
            int iOrdinal = this.f12785h0.ordinal();
            if (iOrdinal == 1 || iOrdinal == 2) {
                i = this.f12783g0 / 2;
            } else {
                i = iOrdinal != 3 ? 0 : this.f12783g0;
            }
            this.f12791k0.m25117a(Math.min(i, ((l90) this.f12781f0.m15241a(getDrawableState()).f45552b).m16030f(getWidth())));
            if (z) {
                this.f12791k0.m25120e();
            }
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f12786i != null) {
            if (this.f12786i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m6069s(Runnable runnable) {
        yf9 yf9Var = this.f12791k0;
        if (yf9Var == null || !yf9Var.f69788f) {
            return false;
        }
        post(new RunnableC0806bd(26, this, runnable));
        return true;
    }

    public void setA11yClassName(String str) {
        this.f12758I = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m6067q()) {
            super.setBackgroundColor(i);
            return;
        }
        sr5 sr5Var = this.f12776d;
        if (sr5Var.m21669a(false) != null) {
            sr5Var.m21669a(false).setTint(i);
        }
    }

    @Override // p000.C3009fp, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m6067q()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        sr5 sr5Var = this.f12776d;
        sr5Var.f61312q = true;
        MaterialButton materialButton = sr5Var.f61296a;
        materialButton.setSupportBackgroundTintList(sr5Var.f61307l);
        materialButton.setSupportBackgroundTintMode(sr5Var.f61306k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.C3009fp, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? bna.m3932U(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m6067q()) {
            this.f12776d.f61314s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.f12770U = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (m6067q()) {
            sr5 sr5Var = this.f12776d;
            if (sr5Var.f61313r && sr5Var.f61304i == i) {
                return;
            }
            sr5Var.f61304i = i;
            sr5Var.f61313r = true;
            sr5Var.f61297b = sr5Var.f61297b.mo13917a(i);
            sr5Var.m21672d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m6067q()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(zf9 zf9Var) {
        sr5 sr5Var = this.f12776d;
        sr5Var.f61298c = zf9Var;
        if (sr5Var.f61297b instanceof ih9) {
            sr5Var.m21672d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.f12789j0 = Math.min(i, this.f12779e0);
        m6072v();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m6067q()) {
            this.f12776d.m21669a(false).m12075s(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f12786i == drawable || m6069s(new or5(this, drawable, 1))) {
            return;
        }
        this.f12770U = -2.1474836E9f;
        this.f12786i = drawable;
        m6070t(true);
        m6071u(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.f12767R != i) {
            if (this.f12786i != null && this.f12792l != null && m6054d()) {
                C3386nv.m17626m("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.f12767R = i;
                m6071u(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.f12762M != i) {
            this.f12762M = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? bna.m3932U(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            C3386nv.m17626m("iconSize cannot be less than 0");
            return;
        }
        if (this.f12759J == i || m6069s(new RunnableC2971eo(this, i, 3))) {
            return;
        }
        this.f12770U = -2.1474836E9f;
        this.f12759J = i;
        m6070t(true);
        m6073w(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f12784h != colorStateList) {
            this.f12784h = colorStateList;
            m6070t(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f12782g != mode) {
            this.f12782g = mode;
            m6070t(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(do7.m10540p(getContext(), i));
    }

    public void setInsetBottom(int i) {
        sr5 sr5Var = this.f12776d;
        sr5Var.m21670b(sr5Var.f61300e, sr5Var.f61302g, sr5Var.f61301f, i);
    }

    public void setInsetLeft(int i) {
        sr5 sr5Var = this.f12776d;
        sr5Var.m21670b(i, sr5Var.f61302g, sr5Var.f61301f, sr5Var.f61303h);
    }

    public void setInsetRight(int i) {
        sr5 sr5Var = this.f12776d;
        sr5Var.m21670b(sr5Var.f61300e, sr5Var.f61302g, i, sr5Var.f61303h);
    }

    public void setInsetTop(int i) {
        sr5 sr5Var = this.f12776d;
        sr5Var.m21670b(sr5Var.f61300e, i, sr5Var.f61301f, sr5Var.f61303h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(qr5 qr5Var) {
        this.f12780f = qr5Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.f12774b0 != z) {
            this.f12774b0 = z;
            sr5 sr5Var = this.f12776d;
            if (z) {
                C3487q7 c3487q7 = new C3487q7(this, 16);
                sr5Var.f61299d = c3487q7;
                fs5 fs5VarM21669a = sr5Var.m21669a(false);
                if (fs5VarM21669a != null) {
                    fs5VarM21669a.f39576Z = c3487q7;
                }
            } else {
                sr5Var.f61299d = null;
                fs5 fs5VarM21669a2 = sr5Var.m21669a(false);
                if (fs5VarM21669a2 != null) {
                    fs5VarM21669a2.f39576Z = null;
                }
            }
            post(new RunnableC0002a0(this, 13));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        qr5 qr5Var = this.f12780f;
        if (qr5Var != null) {
            ((ck6) qr5Var).m4791B();
        }
        super.setPressed(z);
        m6068r(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m6067q()) {
            sr5 sr5Var = this.f12776d;
            MaterialButton materialButton = sr5Var.f61296a;
            if (sr5Var.f61309n != colorStateList) {
                sr5Var.f61309n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(do7.m10516C(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m6067q()) {
            setRippleColor(do7.m10540p(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.f12792l == drawable || m6069s(new or5(this, drawable, 0))) {
            return;
        }
        this.f12770U = -2.1474836E9f;
        this.f12792l = drawable;
        this.f12757H = false;
        m6073w(true);
        m6074x(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.f12768S != i) {
            if (this.f12792l != null && this.f12786i != null && m6054d()) {
                C3386nv.m17626m("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.f12768S = i;
                m6074x(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? bna.m3932U(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.f12790k != colorStateList) {
            this.f12790k = colorStateList;
            m6073w(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.f12788j != mode) {
            this.f12788j = mode;
            m6073w(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(do7.m10540p(getContext(), i));
    }

    public void setShapeAppearance(p39 p39Var) {
        if (!m6067q()) {
            C3386nv.m17633t("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        sr5 sr5Var = this.f12776d;
        if (sr5Var.f61298c == null && p39Var.mo13922f()) {
            sr5Var.f61298c = r46.m20366I(getContext(), R$attr.motionSpringFastSpatial, R$style.Motion_Material3_Spring_Standard_Fast_Spatial);
            if (sr5Var.f61297b instanceof ih9) {
                sr5Var.m21672d();
            }
        }
        sr5Var.f61297b = p39Var;
        sr5Var.m21672d();
    }

    @Override // p000.t49
    public void setShapeAppearanceModel(r39 r39Var) {
        if (!m6067q()) {
            C3386nv.m17633t("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        sr5 sr5Var = this.f12776d;
        sr5Var.f61297b = r39Var;
        sr5Var.m21672d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m6067q()) {
            sr5 sr5Var = this.f12776d;
            sr5Var.f61311p = z;
            sr5Var.m21673e();
        }
    }

    public void setSizeChange(kh9 kh9Var) {
        if (this.f12781f0 != kh9Var) {
            this.f12781f0 = kh9Var;
            m6068r(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m6067q()) {
            sr5 sr5Var = this.f12776d;
            if (sr5Var.f61308m != colorStateList) {
                sr5Var.f61308m = colorStateList;
                sr5Var.m21673e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m6067q()) {
            setStrokeColor(do7.m10540p(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m6067q()) {
            sr5 sr5Var = this.f12776d;
            if (sr5Var.f61305j != i) {
                sr5Var.f61305j = i;
                sr5Var.m21673e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m6067q()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000.C3009fp
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m6067q()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        sr5 sr5Var = this.f12776d;
        if (sr5Var.f61307l != colorStateList) {
            sr5Var.f61307l = colorStateList;
            if (sr5Var.m21669a(false) != null) {
                sr5Var.m21669a(false).setTintList(sr5Var.f61307l);
            }
        }
    }

    @Override // p000.C3009fp
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m6067q()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        sr5 sr5Var = this.f12776d;
        if (sr5Var.f61306k != mode) {
            sr5Var.f61306k = mode;
            if (sr5Var.m21669a(false) == null || sr5Var.f61306k == null) {
                return;
            }
            sr5Var.m21669a(false).setTintMode(sr5Var.f61306k);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f12770U = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m6071u(getMeasuredWidth(), getMeasuredHeight());
        m6074x(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // p000.C3009fp, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.f12770U = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.f12770U = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f12776d.f61315t = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f12770U = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(WidthChangeDirection widthChangeDirection) {
        if (this.f12785h0 != widthChangeDirection) {
            this.f12785h0 = widthChangeDirection;
            m6068r(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.f12783g0 != i) {
            this.f12783g0 = i;
            m6068r(true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m6070t(boolean z) {
        Drawable drawable = this.f12786i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f12786i = drawableMutate;
            drawableMutate.setTintList(this.f12784h);
            PorterDuff.Mode mode = this.f12782g;
            if (mode != null) {
                this.f12786i.setTintMode(mode);
            }
            int intrinsicWidth = this.f12759J;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f12786i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f12759J;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f12786i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f12786i;
            int i = this.f12760K;
            int i2 = this.f12761L;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f12786i.setVisible(true, z);
        }
        if (this.f12786i != null && this.f12792l != null && m6054d()) {
            C3386nv.m17626m("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.f12786i == null && this.f12792l != null && m6054d()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m6062l() && compoundDrawablesRelative[0] != this.f12786i) || (m6061k() && compoundDrawablesRelative[2] != this.f12786i) || (m6063m() && compoundDrawablesRelative[1] != this.f12786i);
        if (z || z2) {
            if (m6062l()) {
                setCompoundDrawablesRelative(this.f12786i, m6058h(1), m6058h(2), null);
            } else if (m6061k()) {
                setCompoundDrawablesRelative(m6058h(0), m6058h(1), this.f12786i, null);
            } else if (m6063m()) {
                setCompoundDrawablesRelative(m6058h(0), this.f12786i, m6058h(2), null);
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f12765P);
    }

    /* JADX INFO: renamed from: u */
    public final void m6071u(int i, int i2) {
        if (this.f12786i == null || getLayout() == null) {
            return;
        }
        if (m6062l() || m6061k()) {
            this.f12761L = 0;
            if (m6055e(this.f12767R)) {
                this.f12760K = 0;
                m6070t(false);
                return;
            }
            int iM6056f = m6056f(i, this.f12767R);
            if (this.f12760K != iM6056f) {
                this.f12760K = iM6056f;
                m6070t(false);
                return;
            }
            return;
        }
        if (m6063m()) {
            this.f12760K = 0;
            if (this.f12767R == 16) {
                this.f12761L = 0;
                m6070t(false);
                return;
            }
            int intrinsicHeight = this.f12759J;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f12786i.getIntrinsicHeight();
            }
            int iM6057g = m6057g(i2, intrinsicHeight);
            if (this.f12761L != iM6057g) {
                this.f12761L = iM6057g;
                m6070t(false);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m6072v() {
        int i = (int) (this.f12787i0 - this.f12789j0);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.f12775c0;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.f12770U + i);
        }
        setPaddingRelative(this.f12771V + i3, getPaddingTop(), (this.f12772W + i) - i3, getPaddingBottom());
    }

    /* JADX INFO: renamed from: w */
    public final void m6073w(boolean z) {
        Drawable drawable = this.f12792l;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f12792l = drawableMutate;
            drawableMutate.setTintList(this.f12790k);
            PorterDuff.Mode mode = this.f12788j;
            if (mode != null) {
                this.f12792l.setTintMode(mode);
            }
            int intrinsicWidth = this.f12759J;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f12792l.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f12759J;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f12792l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f12792l;
            int i = this.f12763N;
            int i2 = this.f12764O;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f12792l.setVisible(true, z);
        }
        if (this.f12792l != null && this.f12786i != null && m6054d()) {
            C3386nv.m17626m("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.f12792l == null) {
            if (this.f12757H) {
                return;
            }
            if (this.f12786i != null && m6054d()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m6065o() && compoundDrawablesRelative[0] != this.f12792l) || (m6064n() && compoundDrawablesRelative[2] != this.f12792l) || (m6066p() && compoundDrawablesRelative[1] != this.f12792l);
        if (z || z2) {
            if (m6065o()) {
                setCompoundDrawablesRelative(this.f12792l, m6059i(1), m6059i(2), null);
            } else if (m6064n()) {
                setCompoundDrawablesRelative(m6059i(0), m6059i(1), this.f12792l, null);
            } else if (m6066p()) {
                setCompoundDrawablesRelative(m6059i(0), this.f12792l, m6059i(2), null);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m6074x(int i, int i2) {
        if (this.f12792l == null || getLayout() == null) {
            return;
        }
        if (m6065o() || m6064n()) {
            this.f12764O = 0;
            if (m6055e(this.f12768S)) {
                this.f12763N = 0;
                m6073w(false);
                return;
            }
            int iM6056f = m6056f(i, this.f12768S);
            if (this.f12763N != iM6056f) {
                this.f12763N = iM6056f;
                m6073w(false);
                return;
            }
            return;
        }
        if (m6066p()) {
            this.f12763N = 0;
            if (this.f12768S == 16) {
                this.f12764O = 0;
                m6073w(false);
                return;
            }
            int intrinsicHeight = this.f12759J;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f12792l.getIntrinsicHeight();
            }
            int iM6057g = m6057g(i2, intrinsicHeight);
            if (this.f12764O != iM6057g) {
                this.f12764O = iM6057g;
                m6073w(false);
            }
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
