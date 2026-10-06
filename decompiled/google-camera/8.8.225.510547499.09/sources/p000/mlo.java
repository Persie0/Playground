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
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mlo extends FrameLayout {

    /* JADX INFO: renamed from: b */
    private static final View.OnTouchListener f40990b = new mln();

    /* JADX INFO: renamed from: a */
    mlc f40991a;

    /* JADX INFO: renamed from: c */
    private final float f40992c;

    /* JADX INFO: renamed from: d */
    private final int f40993d;

    /* JADX INFO: renamed from: e */
    private ColorStateList f40994e;

    /* JADX INFO: renamed from: f */
    private PorterDuff.Mode f40995f;

    protected mlo(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aff.m467c(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f40993d > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.f40993d;
            if (measuredWidth > i3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f40994e != null) {
            drawable = drawable.mutate();
            acv.m238g(drawable, this.f40994e);
            acv.m239h(drawable, this.f40995f);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.f40994e = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            acv.m238g(drawableMutate, colorStateList);
            acv.m239h(drawableMutate, this.f40995f);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f40995f = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            acv.m239h(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f40990b);
        super.setOnClickListener(onClickListener);
    }

    protected mlo(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(mmp.m16632a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, mlq.f40997a);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            afh.m481l(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f40991a = mlc.m16590a(context2, attributeSet, 0, 0).m16589a();
        }
        float f = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        this.f40992c = f;
        setBackgroundTintList(mkv.m16540d(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(lij.m15400H(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f40993d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f40990b);
        setFocusable(true);
        if (getBackground() == null) {
            int iM15026s = kxk.m15026s(kxk.m15024q(this, C0100R.attr.colorSurface), kxk.m15024q(this, C0100R.attr.colorOnSurface), f);
            mlc mlcVar = this.f40991a;
            if (mlcVar != null) {
                int i = mlp.f40996a;
                mkx mkxVar = new mkx(mlcVar);
                mkxVar.m16579i(ColorStateList.valueOf(iM15026s));
                drawable = mkxVar;
            } else {
                Resources resources = getResources();
                int i2 = mlp.f40996a;
                float dimension = resources.getDimension(C0100R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM15026s);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f40994e;
            if (colorStateList != null) {
                acv.m238g(drawable, colorStateList);
            }
            afb.m432m(this, drawable);
        }
    }
}
