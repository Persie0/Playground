package com.google.android.material.card;

import ae.C0062b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import gd.C5768g;
import gd.C5772k;
import gd.InterfaceC5776o;
import md.C7542a;
import p072dd.C5150c;
import p093ed.C5397a;
import p104f.C5452a;
import p153hc.C6031a;
import p254m2.C7472a;
import p296oc.C8034b;
import p329q2.C8488a;
import p507yc.C10344k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC5776o {

    /* JADX INFO: renamed from: h */
    public final C8034b f14943h;

    /* JADX INFO: renamed from: i */
    public final boolean f14944i;

    /* JADX INFO: renamed from: j */
    public boolean f14945j;

    /* JADX INFO: renamed from: k */
    public boolean f14946k;

    /* JADX INFO: renamed from: l */
    public static final int[] f14942l = {R.attr.state_checkable};

    /* JADX INFO: renamed from: H */
    public static final int[] f14940H = {R.attr.state_checked};

    /* JADX INFO: renamed from: I */
    public static final int[] f14941I = {com.linguist.R.attr.state_dragged};

    /* JADX INFO: renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface InterfaceC2975a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, com.linguist.R.attr.materialCardViewStyle, com.linguist.R.style.Widget_MaterialComponents_CardView), attributeSet, com.linguist.R.attr.materialCardViewStyle);
        this.f14945j = false;
        this.f14946k = false;
        this.f14944i = true;
        TypedArray typedArrayM19357d = C10344k.m19357d(getContext(), attributeSet, C6031a.f35672v, com.linguist.R.attr.materialCardViewStyle, com.linguist.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C8034b c8034b = new C8034b(this, attributeSet);
        this.f14943h = c8034b;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C5768g c5768g = c8034b.f43667c;
        c5768g.m12141m(cardBackgroundColor);
        c8034b.f43666b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c8034b.m15912j();
        MaterialCardView materialCardView = c8034b.f43665a;
        ColorStateList colorStateListM10925a = C5150c.m10925a(materialCardView.getContext(), typedArrayM19357d, 11);
        c8034b.f43678n = colorStateListM10925a;
        if (colorStateListM10925a == null) {
            c8034b.f43678n = ColorStateList.valueOf(-1);
        }
        c8034b.f43672h = typedArrayM19357d.getDimensionPixelSize(12, 0);
        boolean z10 = typedArrayM19357d.getBoolean(0, false);
        c8034b.f43683s = z10;
        materialCardView.setLongClickable(z10);
        c8034b.f43676l = C5150c.m10925a(materialCardView.getContext(), typedArrayM19357d, 6);
        c8034b.m15909g(C5150c.m10928d(materialCardView.getContext(), typedArrayM19357d, 2));
        c8034b.f43670f = typedArrayM19357d.getDimensionPixelSize(5, 0);
        c8034b.f43669e = typedArrayM19357d.getDimensionPixelSize(4, 0);
        c8034b.f43671g = typedArrayM19357d.getInteger(3, 8388661);
        ColorStateList colorStateListM10925a2 = C5150c.m10925a(materialCardView.getContext(), typedArrayM19357d, 7);
        c8034b.f43675k = colorStateListM10925a2;
        if (colorStateListM10925a2 == null) {
            c8034b.f43675k = ColorStateList.valueOf(C0062b.m340d1(materialCardView, com.linguist.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListM10925a3 = C5150c.m10925a(materialCardView.getContext(), typedArrayM19357d, 1);
        C5768g c5768g2 = c8034b.f43668d;
        c5768g2.m12141m(colorStateListM10925a3 == null ? ColorStateList.valueOf(0) : colorStateListM10925a3);
        int[] iArr = C5397a.f33812a;
        RippleDrawable rippleDrawable = c8034b.f43679o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c8034b.f43675k);
        }
        c5768g.m12140l(materialCardView.getCardElevation());
        float f3 = c8034b.f43672h;
        ColorStateList colorStateList = c8034b.f43678n;
        c5768g2.f34857a.f34880k = f3;
        c5768g2.invalidateSelf();
        c5768g2.m12145q(colorStateList);
        materialCardView.setBackgroundInternal(c8034b.m15906d(c5768g));
        Drawable drawableM15905c = materialCardView.isClickable() ? c8034b.m15905c() : c5768g2;
        c8034b.f43673i = drawableM15905c;
        materialCardView.setForeground(c8034b.m15906d(drawableM15905c));
        typedArrayM19357d.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f14943h.f43667c.getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: d */
    public final void m8641d() {
        C8034b c8034b;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (c8034b = this.f14943h).f43679o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i10 = bounds.bottom;
        c8034b.f43679o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
        c8034b.f43679o.setBounds(bounds.left, bounds.top, bounds.right, i10);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f14943h.f43667c.f34857a.f34872c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f14943h.f43668d.f34857a.f34872c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f14943h.f43674j;
    }

    public int getCheckedIconGravity() {
        return this.f14943h.f43671g;
    }

    public int getCheckedIconMargin() {
        return this.f14943h.f43669e;
    }

    public int getCheckedIconSize() {
        return this.f14943h.f43670f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f14943h.f43676l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f14943h.f43666b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f14943h.f43666b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f14943h.f43666b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f14943h.f43666b.top;
    }

    public float getProgress() {
        return this.f14943h.f43667c.f34857a.f34879j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f14943h.f43667c.m12137i();
    }

    public ColorStateList getRippleColor() {
        return this.f14943h.f43675k;
    }

    public C5772k getShapeAppearanceModel() {
        return this.f14943h.f43677m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f14943h.f43678n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f14943h.f43678n;
    }

    public int getStrokeWidth() {
        return this.f14943h.f43672h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f14945j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0062b.m338c2(this, this.f14943h.f43667c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        C8034b c8034b = this.f14943h;
        if (c8034b != null && c8034b.f43683s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14942l);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14940H);
        }
        if (this.f14946k) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14941I);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C8034b c8034b = this.f14943h;
        accessibilityNodeInfo.setCheckable(c8034b != null && c8034b.f43683s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f14943h.m15907e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f14944i) {
            C8034b c8034b = this.f14943h;
            if (!c8034b.f43682r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c8034b.f43682r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f14943h.f43667c.m12141m(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f14943h.f43667c.m12141m(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f3) {
        super.setCardElevation(f3);
        C8034b c8034b = this.f14943h;
        c8034b.f43667c.m12140l(c8034b.f43665a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C5768g c5768g = this.f14943h.f43668d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c5768g.m12141m(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f14943h.f43683s = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f14945j != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f14943h.m15909g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        C8034b c8034b = this.f14943h;
        if (c8034b.f43671g != i10) {
            c8034b.f43671g = i10;
            MaterialCardView materialCardView = c8034b.f43665a;
            c8034b.m15907e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f14943h.f43669e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f14943h.f43669e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f14943h.m15909g(C5452a.m11672a(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f14943h.f43670f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f14943h.f43670f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C8034b c8034b = this.f14943h;
        c8034b.f43676l = colorStateList;
        Drawable drawable = c8034b.f43674j;
        if (drawable != null) {
            C8488a.b.m16570h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        C8034b c8034b = this.f14943h;
        if (c8034b != null) {
            Drawable drawable = c8034b.f43673i;
            MaterialCardView materialCardView = c8034b.f43665a;
            Drawable drawableM15905c = materialCardView.isClickable() ? c8034b.m15905c() : c8034b.f43668d;
            c8034b.f43673i = drawableM15905c;
            if (drawable != drawableM15905c) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableM15905c);
                } else {
                    materialCardView.setForeground(c8034b.m15906d(drawableM15905c));
                }
            }
        }
    }

    public void setDragged(boolean z10) {
        if (this.f14946k != z10) {
            this.f14946k = z10;
            refreshDrawableState();
            m8641d();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f3) {
        super.setMaxCardElevation(f3);
        this.f14943h.m15913k();
    }

    public void setOnCheckedChangeListener(InterfaceC2975a interfaceC2975a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        C8034b c8034b = this.f14943h;
        c8034b.m15913k();
        c8034b.m15912j();
    }

    public void setProgress(float f3) {
        C8034b c8034b = this.f14943h;
        c8034b.f43667c.m12142n(f3);
        C5768g c5768g = c8034b.f43668d;
        if (c5768g != null) {
            c5768g.m12142n(f3);
        }
        C5768g c5768g2 = c8034b.f43681q;
        if (c5768g2 != null) {
            c5768g2.m12142n(f3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f3) {
        super.setRadius(f3);
        C8034b c8034b = this.f14943h;
        c8034b.m15910h(c8034b.f43677m.m12153e(f3));
        c8034b.f43673i.invalidateSelf();
        if (c8034b.m15911i()) {
            c8034b.m15912j();
        } else {
            if (c8034b.f43665a.getPreventCornerOverlap() && !c8034b.f43667c.m12139k()) {
                c8034b.m15912j();
            }
        }
        if (c8034b.m15911i()) {
            c8034b.m15913k();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C8034b c8034b = this.f14943h;
        c8034b.f43675k = colorStateList;
        int[] iArr = C5397a.f33812a;
        RippleDrawable rippleDrawable = c8034b.f43679o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        ColorStateList colorStateListM14842b = C7472a.m14842b(i10, getContext());
        C8034b c8034b = this.f14943h;
        c8034b.f43675k = colorStateListM14842b;
        int[] iArr = C5397a.f33812a;
        RippleDrawable rippleDrawable = c8034b.f43679o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM14842b);
        }
    }

    @Override // gd.InterfaceC5776o
    public void setShapeAppearanceModel(C5772k c5772k) {
        setClipToOutline(c5772k.m12152d(getBoundsAsRectF()));
        this.f14943h.m15910h(c5772k);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C8034b c8034b = this.f14943h;
        if (c8034b.f43678n != colorStateList) {
            c8034b.f43678n = colorStateList;
            C5768g c5768g = c8034b.f43668d;
            c5768g.f34857a.f34880k = c8034b.f43672h;
            c5768g.invalidateSelf();
            c5768g.m12145q(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        C8034b c8034b = this.f14943h;
        if (i10 != c8034b.f43672h) {
            c8034b.f43672h = i10;
            C5768g c5768g = c8034b.f43668d;
            ColorStateList colorStateList = c8034b.f43678n;
            c5768g.f34857a.f34880k = i10;
            c5768g.invalidateSelf();
            c5768g.m12145q(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        C8034b c8034b = this.f14943h;
        c8034b.m15913k();
        c8034b.m15912j();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C8034b c8034b = this.f14943h;
        if ((c8034b != null && c8034b.f43683s) && isEnabled()) {
            this.f14945j = !this.f14945j;
            refreshDrawableState();
            m8641d();
            c8034b.m15908f(this.f14945j, true);
        }
    }
}
