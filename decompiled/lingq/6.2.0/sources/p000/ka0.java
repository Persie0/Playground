package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ka0 extends FrameLayout {

    /* JADX INFO: renamed from: i */
    public static final ja0 f46922i = new ja0(0);

    /* JADX INFO: renamed from: a */
    public final r39 f46923a;

    /* JADX INFO: renamed from: b */
    public int f46924b;

    /* JADX INFO: renamed from: c */
    public final float f46925c;

    /* JADX INFO: renamed from: d */
    public final float f46926d;

    /* JADX INFO: renamed from: e */
    public final int f46927e;

    /* JADX INFO: renamed from: f */
    public final int f46928f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f46929g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f46930h;

    public ka0(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(qs5.m20141b(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_elevation)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_elevation, 0));
        }
        this.f46924b = typedArrayObtainStyledAttributes.getInt(R$styleable.SnackbarLayout_animationMode, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_shapeAppearanceOverlay)) {
            this.f46923a = r39.m20281h(context2, attributeSet, 0, 0).m19627a();
        }
        this.f46925c = typedArrayObtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(pb1.m19054x(context2, typedArrayObtainStyledAttributes, R$styleable.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(gka.m12724c(typedArrayObtainStyledAttributes.getInt(R$styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.f46926d = typedArrayObtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
        this.f46927e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_android_maxWidth, -1);
        this.f46928f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(f46922i);
        setFocusable(true);
        if (getBackground() == null) {
            int iM18130T = omd.m18130T(omd.m18142c0(getContext(), xwc.m24752Y(this, R$attr.colorSurface)), getBackgroundOverlayColorAlpha(), omd.m18142c0(getContext(), xwc.m24752Y(this, R$attr.colorOnSurface)));
            r39 r39Var = this.f46923a;
            if (r39Var != null) {
                int i = la0.f49354a;
                fs5 fs5Var = new fs5(r39Var);
                fs5Var.m12076t(ColorStateList.valueOf(iM18130T));
                drawable = fs5Var;
            } else {
                Resources resources = getResources();
                int i2 = la0.f49354a;
                float dimension = resources.getDimension(R$dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM18130T);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f46929g;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    private void setBaseTransientBottomBar(la0 la0Var) {
    }

    public float getActionTextColorAlpha() {
        return this.f46926d;
    }

    public int getAnimationMode() {
        return this.f46924b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f46925c;
    }

    public int getMaxInlineActionWidth() {
        return this.f46928f;
    }

    public int getMaxWidth() {
        return this.f46927e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f46927e;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f46924b = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f46929g != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f46929g);
            drawable.setTintMode(this.f46930h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f46929g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f46930h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f46930h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f46922i);
        super.setOnClickListener(onClickListener);
    }
}
