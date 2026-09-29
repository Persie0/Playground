package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.linguist.R;
import gd.C5768g;
import gd.C5772k;
import gd.C5773l;
import gd.InterfaceC5776o;
import md.C7542a;
import p072dd.C5150c;
import p153hc.C6031a;
import p254m2.C7472a;

/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements InterfaceC5776o {

    /* JADX INFO: renamed from: H */
    public float f15307H;

    /* JADX INFO: renamed from: I */
    public final Path f15308I;

    /* JADX INFO: renamed from: J */
    public final int f15309J;

    /* JADX INFO: renamed from: K */
    public final int f15310K;

    /* JADX INFO: renamed from: L */
    public final int f15311L;

    /* JADX INFO: renamed from: M */
    public final int f15312M;

    /* JADX INFO: renamed from: N */
    public final int f15313N;

    /* JADX INFO: renamed from: O */
    public final int f15314O;

    /* JADX INFO: renamed from: P */
    public boolean f15315P;

    /* JADX INFO: renamed from: d */
    public final C5773l f15316d;

    /* JADX INFO: renamed from: e */
    public final RectF f15317e;

    /* JADX INFO: renamed from: f */
    public final RectF f15318f;

    /* JADX INFO: renamed from: g */
    public final Paint f15319g;

    /* JADX INFO: renamed from: h */
    public final Paint f15320h;

    /* JADX INFO: renamed from: i */
    public final Path f15321i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f15322j;

    /* JADX INFO: renamed from: k */
    public C5768g f15323k;

    /* JADX INFO: renamed from: l */
    public C5772k f15324l;

    /* JADX INFO: renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    @TargetApi(21)
    public class C3036a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final Rect f15325a = new Rect();

        public C3036a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.f15324l == null) {
                return;
            }
            if (shapeableImageView.f15323k == null) {
                shapeableImageView.f15323k = new C5768g(shapeableImageView.f15324l);
            }
            RectF rectF = shapeableImageView.f15317e;
            Rect rect = this.f15325a;
            rectF.round(rect);
            shapeableImageView.f15323k.setBounds(rect);
            shapeableImageView.f15323k.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f15316d = C5773l.a.f34931a;
        this.f15321i = new Path();
        this.f15315P = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f15320h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f15317e = new RectF();
        this.f15318f = new RectF();
        this.f15308I = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C6031a.f35640I, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f15322j = C5150c.m10925a(context2, typedArrayObtainStyledAttributes, 9);
        this.f15307H = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f15309J = dimensionPixelSize;
        this.f15310K = dimensionPixelSize;
        this.f15311L = dimensionPixelSize;
        this.f15312M = dimensionPixelSize;
        this.f15309J = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f15310K = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f15311L = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f15312M = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f15313N = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f15314O = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f15319g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f15324l = C5772k.m12150b(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).m12155a();
        setOutlineProvider(new C3036a());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8792c() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m8793d(int i10, int i11) {
        RectF rectF = this.f15317e;
        rectF.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        C5772k c5772k = this.f15324l;
        Path path = this.f15321i;
        this.f15316d.m12161a(c5772k, 1.0f, rectF, null, path);
        Path path2 = this.f15308I;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f15318f;
        rectF2.set(0.0f, 0.0f, i10, i11);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f15312M;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f15314O;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return m8792c() ? this.f15309J : this.f15311L;
    }

    public int getContentPaddingLeft() {
        int i10 = this.f15314O;
        int i11 = this.f15313N;
        if ((i11 == Integer.MIN_VALUE && i10 == Integer.MIN_VALUE) ? false : true) {
            if (m8792c() && i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (!m8792c() && i11 != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.f15309J;
    }

    public int getContentPaddingRight() {
        int i10 = this.f15314O;
        int i11 = this.f15313N;
        if ((i11 == Integer.MIN_VALUE && i10 == Integer.MIN_VALUE) ? false : true) {
            if (m8792c() && i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (!m8792c() && i10 != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f15311L;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f15313N;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return m8792c() ? this.f15311L : this.f15309J;
    }

    public int getContentPaddingTop() {
        return this.f15310K;
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

    public C5772k getShapeAppearanceModel() {
        return this.f15324l;
    }

    public ColorStateList getStrokeColor() {
        return this.f15322j;
    }

    public float getStrokeWidth() {
        return this.f15307H;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f15308I, this.f15320h);
        if (this.f15322j == null) {
            return;
        }
        Paint paint = this.f15319g;
        paint.setStrokeWidth(this.f15307H);
        int colorForState = this.f15322j.getColorForState(getDrawableState(), this.f15322j.getDefaultColor());
        if (this.f15307H <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f15321i, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f15315P && isLayoutDirectionResolved()) {
            boolean z10 = true;
            this.f15315P = true;
            if (!isPaddingRelative()) {
                if (this.f15313N == Integer.MIN_VALUE && this.f15314O == Integer.MIN_VALUE) {
                    z10 = false;
                }
                if (!z10) {
                    setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                    return;
                }
            }
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m8793d(i10, i11);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    @Override // gd.InterfaceC5776o
    public void setShapeAppearanceModel(C5772k c5772k) {
        this.f15324l = c5772k;
        C5768g c5768g = this.f15323k;
        if (c5768g != null) {
            c5768g.setShapeAppearanceModel(c5772k);
        }
        m8793d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f15322j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(C7472a.m14842b(i10, getContext()));
    }

    public void setStrokeWidth(float f3) {
        if (this.f15307H != f3) {
            this.f15307H = f3;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }
}
