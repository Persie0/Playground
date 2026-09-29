package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import p000.AbstractC3184kh;
import p000.bna;
import p000.do7;
import p000.dy9;
import p000.fs5;
import p000.ih9;
import p000.omd;
import p000.pb1;
import p000.qs5;
import p000.r39;
import p000.r46;
import p000.t49;
import p000.wr5;
import p000.xwc;
import p000.yr5;
import p000.zf9;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, t49 {

    /* JADX INFO: renamed from: g */
    public final yr5 f12819g;

    /* JADX INFO: renamed from: h */
    public final boolean f12820h;

    /* JADX INFO: renamed from: i */
    public boolean f12821i;

    /* JADX INFO: renamed from: j */
    public boolean f12822j;

    /* JADX INFO: renamed from: k */
    public static final int[] f12817k = {R.attr.state_checkable};

    /* JADX INFO: renamed from: l */
    public static final int[] f12818l = {R.attr.state_checked};

    /* JADX INFO: renamed from: H */
    public static final int[] f12814H = {R$attr.state_dragged};

    /* JADX INFO: renamed from: I */
    public static final int[] f12815I = {R.attr.state_hovered};

    /* JADX INFO: renamed from: J */
    public static final int f12816J = R$style.Widget_MaterialComponents_CardView;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        ih9 ih9VarM13916h;
        int i2 = f12816J;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        this.f12821i = false;
        this.f12822j = false;
        this.f12820h = true;
        TypedArray typedArrayM10751d = dy9.m10751d(getContext(), attributeSet, R$styleable.MaterialCardView, i, i2, new int[0]);
        yr5 yr5Var = new yr5(this, attributeSet, i);
        this.f12819g = yr5Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        fs5 fs5Var = yr5Var.f70327c;
        fs5Var.m12076t(cardBackgroundColor);
        yr5Var.f70326b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        yr5Var.m25303l();
        MaterialCardView materialCardView = yr5Var.f70325a;
        ColorStateList colorStateListM19054x = pb1.m19054x(materialCardView.getContext(), typedArrayM10751d, R$styleable.MaterialCardView_strokeColor);
        yr5Var.f70339o = colorStateListM19054x;
        if (colorStateListM19054x == null) {
            yr5Var.f70339o = ColorStateList.valueOf(-1);
        }
        yr5Var.f70333i = typedArrayM10751d.getDimensionPixelSize(R$styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArrayM10751d.getBoolean(R$styleable.MaterialCardView_android_checkable, false);
        yr5Var.f70344t = z;
        materialCardView.setLongClickable(z);
        yr5Var.f70337m = pb1.m19054x(materialCardView.getContext(), typedArrayM10751d, R$styleable.MaterialCardView_checkedIconTint);
        yr5Var.m25298g(pb1.m19013A(materialCardView.getContext(), typedArrayM10751d, R$styleable.MaterialCardView_checkedIcon));
        yr5Var.f70331g = typedArrayM10751d.getDimensionPixelSize(R$styleable.MaterialCardView_checkedIconSize, 0);
        yr5Var.f70330f = typedArrayM10751d.getDimensionPixelSize(R$styleable.MaterialCardView_checkedIconMargin, 0);
        yr5Var.f70332h = typedArrayM10751d.getInteger(R$styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListM19054x2 = pb1.m19054x(materialCardView.getContext(), typedArrayM10751d, R$styleable.MaterialCardView_rippleColor);
        yr5Var.f70336l = colorStateListM19054x2;
        if (colorStateListM19054x2 == null) {
            yr5Var.f70336l = ColorStateList.valueOf(omd.m18142c0(materialCardView.getContext(), xwc.m24752Y(materialCardView, androidx.appcompat.R$attr.colorControlHighlight)));
        }
        ColorStateList colorStateListM19054x3 = pb1.m19054x(materialCardView.getContext(), typedArrayM10751d, R$styleable.MaterialCardView_cardForegroundColor);
        colorStateListM19054x3 = colorStateListM19054x3 == null ? ColorStateList.valueOf(0) : colorStateListM19054x3;
        fs5 fs5Var2 = yr5Var.f70328d;
        fs5Var2.m12076t(colorStateListM19054x3);
        RippleDrawable rippleDrawable = yr5Var.f70340p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(yr5Var.f70336l);
        }
        fs5Var.m12075s(materialCardView.getCardElevation());
        float f = yr5Var.f70333i;
        ColorStateList colorStateList = yr5Var.f70339o;
        fs5Var2.m12053A(f);
        fs5Var2.m12081y(colorStateList);
        materialCardView.setBackgroundInternal(yr5Var.m25295d(fs5Var));
        Drawable drawableM25294c = yr5Var.m25301j() ? yr5Var.m25294c() : fs5Var2;
        yr5Var.f70334j = drawableM25294c;
        materialCardView.setForeground(yr5Var.m25295d(drawableM25294c));
        if (yr5Var.f70329e == -1.0f && (ih9VarM13916h = ih9.m13916h(materialCardView.getContext(), typedArrayM10751d, R$styleable.MaterialCardView_shapeAppearance)) != null) {
            zf9 zf9VarM20366I = r46.m20366I(materialCardView.getContext(), R$attr.motionSpringFastSpatial, R$style.Motion_Material3_Spring_Standard_Fast_Spatial);
            fs5Var.m12074r(zf9VarM20366I);
            fs5Var2.m12074r(zf9VarM20366I);
            fs5 fs5Var3 = yr5Var.f70342r;
            if (fs5Var3 != null) {
                fs5Var3.m12074r(zf9VarM20366I);
            }
            yr5Var.m25299h(ih9VarM13916h);
        }
        typedArrayM10751d.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f12819g.f70327c.getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: b */
    public final void m6090b() {
        yr5 yr5Var = this.f12819g;
        RippleDrawable rippleDrawable = yr5Var.f70340p;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            yr5Var.f70340p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            yr5Var.f70340p.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f12819g.f70327c.f39578b.f36162c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f12819g.f70328d.f39578b.f36162c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f12819g.f70335k;
    }

    public int getCheckedIconGravity() {
        return this.f12819g.f70332h;
    }

    public int getCheckedIconMargin() {
        return this.f12819g.f70330f;
    }

    public int getCheckedIconSize() {
        return this.f12819g.f70331g;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f12819g.f70337m;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f12819g.f70326b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f12819g.f70326b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f12819g.f70326b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f12819g.f70326b.top;
    }

    public float getProgress() {
        return this.f12819g.f70327c.f39578b.f36169j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f12819g.f70327c.m12069m();
    }

    public ColorStateList getRippleColor() {
        return this.f12819g.f70336l;
    }

    public r39 getShapeAppearanceModel() {
        return this.f12819g.f70338n.mo13920d();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f12819g.f70339o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f12819g.f70339o;
    }

    public int getStrokeWidth() {
        return this.f12819g.f70333i;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f12821i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yr5 yr5Var = this.f12819g;
        yr5Var.m25302k();
        AbstractC3184kh.m15200G(this, yr5Var.f70327c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 8);
        yr5 yr5Var = this.f12819g;
        if (yr5Var != null && yr5Var.f70344t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12817k);
        }
        if (this.f12821i) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12818l);
        }
        if (this.f12822j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12814H);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, f12815I);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f12821i);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        yr5 yr5Var = this.f12819g;
        accessibilityNodeInfo.setCheckable(yr5Var != null && yr5Var.f70344t);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f12821i);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12819g.m25296e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f12820h) {
            yr5 yr5Var = this.f12819g;
            if (!yr5Var.f70343s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                yr5Var.f70343s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f12819g.f70327c.m12076t(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        yr5 yr5Var = this.f12819g;
        yr5Var.f70327c.m12075s(yr5Var.f70325a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        fs5 fs5Var = this.f12819g.f70328d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        fs5Var.m12076t(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f12819g.f70344t = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f12821i != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f12819g.m25298g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        yr5 yr5Var = this.f12819g;
        if (yr5Var.f70332h != i) {
            yr5Var.f70332h = i;
            MaterialCardView materialCardView = yr5Var.f70325a;
            yr5Var.m25296e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f12819g.f70330f = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f12819g.f70330f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f12819g.m25298g(bna.m3932U(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f12819g.f70331g = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f12819g.f70331g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        yr5 yr5Var = this.f12819g;
        yr5Var.f70337m = colorStateList;
        Drawable drawable = yr5Var.f70335k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        yr5 yr5Var = this.f12819g;
        if (yr5Var != null) {
            yr5Var.m25302k();
        }
    }

    public void setDragged(boolean z) {
        if (this.f12822j != z) {
            this.f12822j = z;
            refreshDrawableState();
            m6090b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f12819g.m25304m();
    }

    public void setOnCheckedChangeListener(wr5 wr5Var) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        yr5 yr5Var = this.f12819g;
        yr5Var.m25304m();
        yr5Var.m25303l();
    }

    public void setProgress(float f) {
        yr5 yr5Var = this.f12819g;
        yr5Var.f70327c.m12077u(f);
        fs5 fs5Var = yr5Var.f70328d;
        if (fs5Var != null) {
            fs5Var.m12077u(f);
        }
        fs5 fs5Var2 = yr5Var.f70342r;
        if (fs5Var2 != null) {
            fs5Var2.m12077u(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        yr5 yr5Var = this.f12819g;
        yr5Var.f70329e = f;
        yr5Var.m25299h(yr5Var.f70338n.mo13920d().mo13917a(f));
        yr5Var.f70334j.invalidateSelf();
        if (yr5Var.m25300i() || (yr5Var.f70325a.getPreventCornerOverlap() && !yr5Var.f70327c.m12073q())) {
            yr5Var.m25303l();
        }
        if (yr5Var.m25300i()) {
            yr5Var.m25304m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        yr5 yr5Var = this.f12819g;
        yr5Var.f70336l = colorStateList;
        RippleDrawable rippleDrawable = yr5Var.f70340p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListM10540p = do7.m10540p(getContext(), i);
        yr5 yr5Var = this.f12819g;
        yr5Var.f70336l = colorStateListM10540p;
        RippleDrawable rippleDrawable = yr5Var.f70340p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM10540p);
        }
    }

    @Override // p000.t49
    public void setShapeAppearanceModel(r39 r39Var) {
        setClipToOutline(r39Var.m20284k(getBoundsAsRectF()));
        this.f12819g.m25299h(r39Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        yr5 yr5Var = this.f12819g;
        if (yr5Var.f70339o != colorStateList) {
            yr5Var.f70339o = colorStateList;
            fs5 fs5Var = yr5Var.f70328d;
            fs5Var.m12053A(yr5Var.f70333i);
            fs5Var.m12081y(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        yr5 yr5Var = this.f12819g;
        if (i != yr5Var.f70333i) {
            yr5Var.f70333i = i;
            fs5 fs5Var = yr5Var.f70328d;
            ColorStateList colorStateList = yr5Var.f70339o;
            fs5Var.m12053A(i);
            fs5Var.m12081y(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        yr5 yr5Var = this.f12819g;
        yr5Var.m25304m();
        yr5Var.m25303l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        yr5 yr5Var = this.f12819g;
        if (yr5Var != null && yr5Var.f70344t && isEnabled()) {
            this.f12821i = !this.f12821i;
            refreshDrawableState();
            m6090b();
            yr5Var.m25297f(this.f12821i, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f12819g.f70327c.m12076t(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
