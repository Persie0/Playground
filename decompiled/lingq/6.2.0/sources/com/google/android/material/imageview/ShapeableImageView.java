package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import p000.do7;
import p000.fs5;
import p000.pb1;
import p000.qs5;
import p000.r39;
import p000.s39;
import p000.t49;
import p000.u49;
import p000.wv5;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements t49 {

    /* JADX INFO: renamed from: Q */
    public static final int f12996Q = R$style.Widget_MaterialComponents_ShapeableImageView;

    /* JADX INFO: renamed from: H */
    public float f12997H;

    /* JADX INFO: renamed from: I */
    public final Path f12998I;

    /* JADX INFO: renamed from: J */
    public final int f12999J;

    /* JADX INFO: renamed from: K */
    public final int f13000K;

    /* JADX INFO: renamed from: L */
    public final int f13001L;

    /* JADX INFO: renamed from: M */
    public final int f13002M;

    /* JADX INFO: renamed from: N */
    public final int f13003N;

    /* JADX INFO: renamed from: O */
    public final int f13004O;

    /* JADX INFO: renamed from: P */
    public boolean f13005P;

    /* JADX INFO: renamed from: d */
    public final wv5 f13006d;

    /* JADX INFO: renamed from: e */
    public final RectF f13007e;

    /* JADX INFO: renamed from: f */
    public final RectF f13008f;

    /* JADX INFO: renamed from: g */
    public final Paint f13009g;

    /* JADX INFO: renamed from: h */
    public final Paint f13010h;

    /* JADX INFO: renamed from: i */
    public final Path f13011i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f13012j;

    /* JADX INFO: renamed from: k */
    public fs5 f13013k;

    /* JADX INFO: renamed from: l */
    public r39 f13014l;

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12996Q;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        this.f13006d = s39.f60243a;
        this.f13011i = new Path();
        this.f13005P = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f13010h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f13007e = new RectF();
        this.f13008f = new RectF();
        this.f12998I = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.ShapeableImageView, i, i2);
        setLayerType(2, null);
        this.f13012j = pb1.m19054x(context2, typedArrayObtainStyledAttributes, R$styleable.ShapeableImageView_strokeColor);
        this.f12997H = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPadding, 0);
        this.f12999J = dimensionPixelSize;
        this.f13000K = dimensionPixelSize;
        this.f13001L = dimensionPixelSize;
        this.f13002M = dimensionPixelSize;
        this.f12999J = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.f13000K = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.f13001L = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.f13002M = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.f13003N = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.f13004O = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f13009g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f13014l = r39.m20281h(context2, attributeSet, i, i2).m19627a();
        setOutlineProvider(new u49(this));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6153c() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m6154d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.f13007e;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        r39 r39Var = this.f13014l;
        wv5 wv5Var = this.f13006d;
        Path path = this.f13011i;
        wv5Var.m24165b(r39Var, null, 1.0f, rectF, null, path);
        Path path2 = this.f12998I;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f13008f;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f13002M;
    }

    public final int getContentPaddingEnd() {
        int i = this.f13004O;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m6153c() ? this.f12999J : this.f13001L;
    }

    public int getContentPaddingLeft() {
        int i = this.f13004O;
        int i2 = this.f13003N;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (m6153c() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!m6153c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f12999J;
    }

    public int getContentPaddingRight() {
        int i = this.f13004O;
        int i2 = this.f13003N;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (m6153c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m6153c() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f13001L;
    }

    public final int getContentPaddingStart() {
        int i = this.f13003N;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m6153c() ? this.f13001L : this.f12999J;
    }

    public int getContentPaddingTop() {
        return this.f13000K;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public r39 getShapeAppearanceModel() {
        return this.f13014l;
    }

    public ColorStateList getStrokeColor() {
        return this.f13012j;
    }

    public float getStrokeWidth() {
        return this.f12997H;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f12998I, this.f13010h);
        if (this.f13012j == null) {
            return;
        }
        float f = this.f12997H;
        Paint paint = this.f13009g;
        paint.setStrokeWidth(f);
        int colorForState = this.f13012j.getColorForState(getDrawableState(), this.f13012j.getDefaultColor());
        if (this.f12997H <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f13011i, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f13005P && isLayoutDirectionResolved()) {
            this.f13005P = true;
            if (!isPaddingRelative() && this.f13003N == Integer.MIN_VALUE && this.f13004O == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m6154d(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // p000.t49
    public void setShapeAppearanceModel(r39 r39Var) {
        this.f13014l = r39Var;
        fs5 fs5Var = this.f13013k;
        if (fs5Var != null) {
            fs5Var.setShapeAppearanceModel(r39Var);
        }
        m6154d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f13012j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(do7.m10540p(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f12997H != f) {
            this.f12997H = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
