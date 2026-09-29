package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public final class cs5 extends C3270kq {

    /* JADX INFO: renamed from: g */
    public static final int f34486g = R$style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* JADX INFO: renamed from: h */
    public static final int[][] f34487h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f34488e;

    /* JADX INFO: renamed from: f */
    public boolean f34489f;

    /* JADX WARN: Illegal instructions before constructor call */
    public cs5(Context context, AttributeSet attributeSet) {
        int i = R$attr.radioButtonStyle;
        int i2 = f34486g;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayM10751d = dy9.m10751d(context2, attributeSet, R$styleable.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayM10751d.hasValue(R$styleable.MaterialRadioButton_buttonTint)) {
            setButtonTintList(pb1.m19054x(context2, typedArrayM10751d, R$styleable.MaterialRadioButton_buttonTint));
        }
        if (typedArrayM10751d.hasValue(R$styleable.MaterialRadioButton_rippleColor)) {
            setRippleColor(pb1.m19054x(context2, typedArrayM10751d, R$styleable.MaterialRadioButton_rippleColor));
        }
        this.f34489f = typedArrayM10751d.getBoolean(R$styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayM10751d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f34488e == null) {
            int iM18142c0 = omd.m18142c0(getContext(), xwc.m24752Y(this, R$attr.colorControlActivated));
            int iM18142c1 = omd.m18142c0(getContext(), xwc.m24752Y(this, com.google.android.material.R$attr.colorOnSurface));
            int iM18142c2 = omd.m18142c0(getContext(), xwc.m24752Y(this, com.google.android.material.R$attr.colorSurface));
            this.f34488e = new ColorStateList(f34487h, new int[]{omd.m18130T(iM18142c2, 1.0f, iM18142c0), omd.m18130T(iM18142c2, 0.54f, iM18142c1), omd.m18130T(iM18142c2, 0.38f, iM18142c1), omd.m18130T(iM18142c2, 0.38f, iM18142c1)});
        }
        return this.f34488e;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34489f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f34489f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
