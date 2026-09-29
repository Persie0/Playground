package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.cardview.R$attr;
import androidx.cardview.R$color;
import androidx.cardview.R$style;
import androidx.cardview.R$styleable;
import p000.C3156jq;
import p000.l5d;
import p000.ni8;

/* JADX INFO: loaded from: classes2.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int[] f1228f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: a */
    public boolean f1229a;

    /* JADX INFO: renamed from: b */
    public boolean f1230b;

    /* JADX INFO: renamed from: c */
    public final Rect f1231c;

    /* JADX INFO: renamed from: d */
    public final Rect f1232d;

    /* JADX INFO: renamed from: e */
    public final C3156jq f1233e;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f1231c = rect;
        this.f1232d = new Rect();
        C3156jq c3156jq = new C3156jq((Object) this, false);
        this.f1233e = c3156jq;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CardView, i, R$style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1228f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(R$color.cardview_light_background) : getResources().getColor(R$color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardMaxElevation, 0.0f);
        this.f1229a = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardView_cardUseCompatPadding, false);
        this.f1230b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        ni8 ni8Var = new ni8(colorStateListValueOf, dimension);
        c3156jq.f45990a = ni8Var;
        setBackgroundDrawable(ni8Var);
        setClipToOutline(true);
        setElevation(dimension2);
        l5d.m15821b(c3156jq, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((ni8) this.f1233e.f45990a).f52770h;
    }

    public float getCardElevation() {
        return ((CardView) this.f1233e.f45991b).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1231c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1231c.left;
    }

    public int getContentPaddingRight() {
        return this.f1231c.right;
    }

    public int getContentPaddingTop() {
        return this.f1231c.top;
    }

    public float getMaxCardElevation() {
        return ((ni8) this.f1233e.f45990a).f52767e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1230b;
    }

    public float getRadius() {
        return ((ni8) this.f1233e.f45990a).f52763a;
    }

    public boolean getUseCompatPadding() {
        return this.f1229a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ni8 ni8Var = (ni8) this.f1233e.f45990a;
        if (colorStateListValueOf == null) {
            ni8Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        ni8Var.f52770h = colorStateListValueOf;
        ni8Var.f52764b.setColor(colorStateListValueOf.getColorForState(ni8Var.getState(), ni8Var.f52770h.getDefaultColor()));
        ni8Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.f1233e.f45991b).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        l5d.m15821b(this.f1233e, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1230b) {
            this.f1230b = z;
            C3156jq c3156jq = this.f1233e;
            l5d.m15821b(c3156jq, ((ni8) c3156jq.f45990a).f52767e);
        }
    }

    public void setRadius(float f) {
        ni8 ni8Var = (ni8) this.f1233e.f45990a;
        if (f == ni8Var.f52763a) {
            return;
        }
        ni8Var.f52763a = f;
        ni8Var.m17443b(null);
        ni8Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1229a != z) {
            this.f1229a = z;
            C3156jq c3156jq = this.f1233e;
            l5d.m15821b(c3156jq, ((ni8) c3156jq.f45990a).f52767e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ni8 ni8Var = (ni8) this.f1233e.f45990a;
        if (colorStateList == null) {
            ni8Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        ni8Var.f52770h = colorStateList;
        ni8Var.f52764b.setColor(colorStateList.getColorForState(ni8Var.getState(), ni8Var.f52770h.getDefaultColor()));
        ni8Var.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
