package com.lingq.core.achievements.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.lingq.core.designsystem.R$attr;
import p000.ba0;
import p000.jfa;

/* JADX INFO: loaded from: classes2.dex */
public final class StreakCircularProgressIndicator extends View {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f14284l = 0;

    /* JADX INFO: renamed from: a */
    public Paint f14285a;

    /* JADX INFO: renamed from: b */
    public Paint f14286b;

    /* JADX INFO: renamed from: c */
    public Paint f14287c;

    /* JADX INFO: renamed from: d */
    public final int f14288d;

    /* JADX INFO: renamed from: e */
    public float f14289e;

    /* JADX INFO: renamed from: f */
    public RectF f14290f;

    /* JADX INFO: renamed from: g */
    public boolean f14291g;

    /* JADX INFO: renamed from: h */
    public boolean f14292h;

    /* JADX INFO: renamed from: i */
    public int f14293i;

    /* JADX INFO: renamed from: j */
    public int f14294j;

    /* JADX INFO: renamed from: k */
    public float f14295k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakCircularProgressIndicator(Context context) {
        super(context);
        context.getClass();
        this.f14285a = new Paint();
        this.f14286b = new Paint();
        this.f14287c = new Paint();
        this.f14288d = 270;
        this.f14290f = new RectF();
        this.f14292h = true;
        this.f14293i = 100;
        Context context2 = getContext();
        context2.getClass();
        this.f14295k = jfa.m14419b(context2, 8);
        m7019b();
    }

    private final Shader getInnerGradient() {
        if (this.f14292h) {
            return new LinearGradient(getMeasuredWidth(), 0.0f, 0.0f, getMeasuredHeight(), new int[]{Color.parseColor("#FFE1AB"), Color.parseColor("#FFE5B6"), Color.parseColor("#E5CB9B"), Color.parseColor("#BDA170"), Color.parseColor("#FFE1AB")}, new float[]{0.0f, 0.23f, 0.38f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(getMeasuredWidth(), 0.0f, 0.0f, getMeasuredHeight(), new int[]{Color.parseColor("#e6e6e6"), Color.parseColor("#A3D9D9D9"), Color.parseColor("#f2f2f2"), Color.parseColor("#ffffff"), Color.parseColor("#f1f1f1"), Color.parseColor("#C3C3C3"), Color.parseColor("#7b7b7b")}, new float[]{0.0f, 0.14f, 0.29f, 0.54f, 0.62f, 0.74f, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: a */
    public final void m7018a(int i, int i2) {
        float fMax = Math.max(this.f14285a.getStrokeWidth(), this.f14287c.getStrokeWidth()) / 2.0f;
        RectF rectF = this.f14290f;
        rectF.left = fMax;
        rectF.top = fMax;
        rectF.right = i - fMax;
        rectF.bottom = i2 - fMax;
    }

    /* JADX INFO: renamed from: b */
    public final void m7019b() {
        Paint paint = new Paint();
        paint.setStrokeWidth(this.f14295k);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Context context = getContext();
        context.getClass();
        paint.setColor(jfa.m14431n(context, R$attr.greenTint));
        paint.setAntiAlias(true);
        this.f14285a = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.f14295k);
        Context context2 = getContext();
        context2.getClass();
        paint2.setColor(jfa.m14431n(context2, com.google.android.material.R$attr.colorSurfaceContainerLow));
        paint2.setAntiAlias(true);
        this.f14287c = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        this.f14286b = paint3;
        this.f14290f = new RectF();
    }

    /* JADX INFO: renamed from: c */
    public final void m7020c() {
        SweepGradient sweepGradient;
        Paint paint = this.f14285a;
        if (this.f14292h) {
            sweepGradient = new SweepGradient(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, new int[]{Color.parseColor("#BCA06E"), Color.parseColor("#FEE6BA"), Color.parseColor("#BDA170"), Color.parseColor("#FFE1AB"), Color.parseColor("#BB9F6D"), Color.parseColor("#FFE5B6"), Color.parseColor("#BDA170"), Color.parseColor("#FFDDA1"), Color.parseColor("#BCA06E")}, new float[]{0.0f, 0.1f, 0.26f, 0.42f, 0.54f, 0.63f, 0.75f, 0.86f, 1.2f});
            Matrix matrix = new Matrix();
            matrix.preRotate(270.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            sweepGradient.setLocalMatrix(matrix);
        } else {
            sweepGradient = new SweepGradient(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, new int[]{Color.parseColor("#e6e6e6"), Color.parseColor("#bebebe"), Color.parseColor("#d9d9d9"), Color.parseColor("#f2f2f2"), Color.parseColor("#c4c4c4"), Color.parseColor("#a9a9a9"), Color.parseColor("#f1f1f1"), Color.parseColor("#ffffff"), Color.parseColor("#c3c3c3"), Color.parseColor("#f9f9f9"), Color.parseColor("#e6e6e6")}, new float[]{0.0f, 0.17f, 0.29f, 0.4f, 0.47f, 0.54f, 0.66f, 0.7f, 0.83f, 0.94f, 1.0f});
            Matrix matrix2 = new Matrix();
            matrix2.preRotate(270.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            sweepGradient.setLocalMatrix(matrix2);
        }
        paint.setShader(sweepGradient);
        this.f14286b.setColor(-3355444);
        this.f14286b.setShader(getInnerGradient());
        invalidate();
    }

    public final int getIndicatorColor() {
        return this.f14285a.getColor();
    }

    public final int getInnerCircleColor() {
        return this.f14286b.getColor();
    }

    public final int getTrackColor() {
        return this.f14287c.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        canvas.drawArc(this.f14290f, 0.0f, 360.0f, false, this.f14287c);
        canvas.drawArc(this.f14290f, this.f14288d, this.f14289e, false, this.f14285a);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2) - this.f14295k, this.f14286b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.f14291g) {
            m7020c();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        m7018a(i, i2);
    }

    public final void setIndicatorColor(int i) {
        this.f14285a.setColor(i);
        invalidate();
    }

    public final void setInnerCircleColor(int i) {
        this.f14286b.setColor(i);
        invalidate();
    }

    public final void setIsGoldGradient(boolean z) {
        this.f14292h = z;
        setIsGradient(true);
    }

    public final void setIsGradient(boolean z) {
        this.f14291g = z;
        if (z) {
            m7020c();
            return;
        }
        this.f14285a.setShader(null);
        this.f14286b.setShader(null);
        invalidate();
    }

    public final void setMaxProgress(int i) {
        this.f14293i = i;
    }

    public final void setProgress(int i) {
        int i2 = this.f14293i;
        this.f14294j = i > i2 ? i2 : i;
        this.f14289e = (i / i2) * 360.0f;
        invalidate();
    }

    public final void setProgressWithAnimation(int i) {
        int i2 = this.f14294j;
        if (i2 != i) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i2, i);
            valueAnimatorOfFloat.setDuration(800L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ba0(this, 6));
            valueAnimatorOfFloat.start();
        }
    }

    public final void setTrackColor(int i) {
        this.f14287c.setColor(i);
        invalidate();
    }

    public final void setTrackThickness(int i) {
        Context context = getContext();
        context.getClass();
        float fM14419b = jfa.m14419b(context, i);
        this.f14295k = fM14419b;
        this.f14285a.setStrokeWidth(fM14419b);
        this.f14287c.setStrokeWidth(this.f14295k);
        m7018a(getWidth(), getHeight());
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakCircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f14285a = new Paint();
        this.f14286b = new Paint();
        this.f14287c = new Paint();
        this.f14288d = 270;
        this.f14290f = new RectF();
        this.f14292h = true;
        this.f14293i = 100;
        Context context2 = getContext();
        context2.getClass();
        this.f14295k = jfa.m14419b(context2, 8);
        m7019b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakCircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.f14285a = new Paint();
        this.f14286b = new Paint();
        this.f14287c = new Paint();
        this.f14288d = 270;
        this.f14290f = new RectF();
        this.f14292h = true;
        this.f14293i = 100;
        Context context2 = getContext();
        context2.getClass();
        this.f14295k = jfa.m14419b(context2, 8);
        m7019b();
    }
}
