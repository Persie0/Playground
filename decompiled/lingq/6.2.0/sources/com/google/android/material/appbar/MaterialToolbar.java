package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import p000.AbstractC3122is;
import p000.AbstractC3184kh;
import p000.dy9;
import p000.fs5;
import p000.gxc;
import p000.qs5;
import p000.r39;
import p000.yd7;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: u0 */
    public static final int f12600u0 = R$style.Widget_MaterialComponents_Toolbar;

    /* JADX INFO: renamed from: v0 */
    public static final ImageView.ScaleType[] f12601v0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: p0 */
    public Integer f12602p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f12603q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f12604r0;

    /* JADX INFO: renamed from: s0 */
    public ImageView.ScaleType f12605s0;

    /* JADX INFO: renamed from: t0 */
    public Boolean f12606t0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12600u0;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayM10751d = dy9.m10751d(context2, attributeSet, R$styleable.MaterialToolbar, i, i2, new int[0]);
        if (typedArrayM10751d.hasValue(R$styleable.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayM10751d.getColor(R$styleable.MaterialToolbar_navigationIconTint, -1));
        }
        this.f12603q0 = typedArrayM10751d.getBoolean(R$styleable.MaterialToolbar_titleCentered, false);
        this.f12604r0 = typedArrayM10751d.getBoolean(R$styleable.MaterialToolbar_subtitleCentered, false);
        int i3 = typedArrayM10751d.getInt(R$styleable.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f12601v0;
            if (i3 < scaleTypeArr.length) {
                this.f12605s0 = scaleTypeArr[i3];
            }
        }
        if (typedArrayM10751d.hasValue(R$styleable.MaterialToolbar_logoAdjustViewBounds)) {
            this.f12606t0 = Boolean.valueOf(typedArrayM10751d.getBoolean(R$styleable.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayM10751d.recycle();
        r39 r39VarM19627a = r39.m20281h(context2, attributeSet, i, i2).m19627a();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC3122is.m14107u(background);
        if (colorStateListValueOf != null) {
            fs5 fs5Var = new fs5(r39VarM19627a);
            fs5Var.m12076t(colorStateListValueOf);
            fs5Var.m12072p(context2);
            fs5Var.m12075s(getElevation());
            setBackground(fs5Var);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f12605s0;
    }

    public Integer getNavigationIconTint() {
        return this.f12602p0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof fs5) {
            AbstractC3184kh.m15200G(this, (fs5) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ImageView imageView2 = null;
        if (this.f12603q0 || this.f12604r0) {
            ArrayList arrayListM12969a = gxc.m12969a(this, getTitle());
            boolean zIsEmpty = arrayListM12969a.isEmpty();
            yd7 yd7Var = gxc.f41511a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListM12969a, yd7Var);
            ArrayList arrayListM12969a2 = gxc.m12969a(this, getSubtitle());
            TextView textView2 = arrayListM12969a2.isEmpty() ? null : (TextView) Collections.max(arrayListM12969a2, yd7Var);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f12603q0 && textView != null) {
                    m6009u(textView, pair);
                }
                if (this.f12604r0 && textView2 != null) {
                    m6009u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f12606t0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f12605s0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof fs5) {
            ((fs5) background).m12075s(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f12606t0;
        if (bool == null || bool.booleanValue() != z) {
            this.f12606t0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f12605s0 != scaleType) {
            this.f12605s0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f12602p0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f12602p0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f12602p0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f12604r0 != z) {
            this.f12604r0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f12603q0 != z) {
            this.f12603q0 = z;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m6009u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    public MaterialToolbar(Context context) {
        this(context, null);
    }
}
