package com.lingq.commons.p053ui.views;

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
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import p225kk.C6716m;
import va.C9700n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nR$\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016¨\u0006$"}, m13365d2 = {"Lcom/lingq/commons/ui/views/StreakCircularProgressIndicator;", "Landroid/view/View;", "Landroid/graphics/Shader;", "getInnerGradient", "", "isGradient", "Lsl/e;", "setIsGradient", "isGold", "setIsGoldGradient", "", "max", "setMaxProgress", "progress", "setProgress", "setProgressWithAnimation", "thickness", "setTrackThickness", "color", "getIndicatorColor", "()I", "setIndicatorColor", "(I)V", "indicatorColor", "getTrackColor", "setTrackColor", "trackColor", "getInnerCircleColor", "setInnerCircleColor", "innerCircleColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StreakCircularProgressIndicator extends View {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f16817l = 0;

    /* JADX INFO: renamed from: a */
    public Paint f16818a;

    /* JADX INFO: renamed from: b */
    public Paint f16819b;

    /* JADX INFO: renamed from: c */
    public Paint f16820c;

    /* JADX INFO: renamed from: d */
    public final int f16821d;

    /* JADX INFO: renamed from: e */
    public float f16822e;

    /* JADX INFO: renamed from: f */
    public RectF f16823f;

    /* JADX INFO: renamed from: g */
    public boolean f16824g;

    /* JADX INFO: renamed from: h */
    public boolean f16825h;

    /* JADX INFO: renamed from: i */
    public int f16826i;

    /* JADX INFO: renamed from: j */
    public int f16827j;

    /* JADX INFO: renamed from: k */
    public float f16828k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakCircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        this.f16818a = new Paint();
        this.f16819b = new Paint();
        this.f16820c = new Paint();
        this.f16821d = 270;
        this.f16823f = new RectF();
        this.f16825h = true;
        this.f16826i = 100;
        List<Integer> list = C6716m.f37937a;
        this.f16828k = C6716m.m13316a(8);
        Paint paint = new Paint();
        paint.setStrokeWidth(this.f16828k);
        paint.setStyle(Paint.Style.STROKE);
        Context context2 = getContext();
        C5207g.m11110e(context2, "context");
        paint.setColor(C6716m.m13333r(R.attr.greenTint, context2));
        paint.setAntiAlias(true);
        this.f16818a = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f16828k);
        Context context3 = getContext();
        C5207g.m11110e(context3, "context");
        paint2.setColor(C6716m.m13333r(R.attr.tertiaryTextColor, context3));
        paint2.setAntiAlias(true);
        this.f16820c = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        this.f16819b = paint3;
        this.f16823f = new RectF();
    }

    private final Shader getInnerGradient() {
        if (this.f16825h) {
            return new LinearGradient(getMeasuredWidth(), 0.0f, 0.0f, getMeasuredHeight(), new int[]{Color.parseColor("#FFE1AB"), Color.parseColor("#FFE5B6"), Color.parseColor("#E5CB9B"), Color.parseColor("#BDA170"), Color.parseColor("#FFE1AB")}, new float[]{0.0f, 0.23f, 0.38f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(getMeasuredWidth(), 0.0f, 0.0f, getMeasuredHeight(), new int[]{Color.parseColor("#e6e6e6"), Color.parseColor("#A3D9D9D9"), Color.parseColor("#f2f2f2"), Color.parseColor("#ffffff"), Color.parseColor("#f1f1f1"), Color.parseColor("#C3C3C3"), Color.parseColor("#7b7b7b")}, new float[]{0.0f, 0.14f, 0.29f, 0.54f, 0.62f, 0.74f, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: a */
    public final void m9376a(int i10, int i11) {
        float fMax = Math.max(this.f16818a.getStrokeWidth(), this.f16820c.getStrokeWidth()) / 2.0f;
        RectF rectF = this.f16823f;
        rectF.left = fMax;
        rectF.top = fMax;
        rectF.right = i10 - fMax;
        rectF.bottom = i11 - fMax;
    }

    /* JADX INFO: renamed from: b */
    public final void m9377b() {
        SweepGradient sweepGradient;
        Paint paint = this.f16818a;
        if (this.f16825h) {
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
        this.f16819b.setColor(-3355444);
        this.f16819b.setShader(getInnerGradient());
        invalidate();
    }

    public final int getIndicatorColor() {
        return this.f16818a.getColor();
    }

    public final int getInnerCircleColor() {
        return this.f16819b.getColor();
    }

    public final int getTrackColor() {
        return this.f16820c.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C5207g.m11111f(canvas, "canvas");
        canvas.drawArc(this.f16823f, 0.0f, 360.0f, false, this.f16820c);
        canvas.drawArc(this.f16823f, this.f16821d, this.f16822e, false, this.f16818a);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2) - this.f16828k, this.f16819b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        if (this.f16824g) {
            m9377b();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        m9376a(i10, i11);
    }

    public final void setIndicatorColor(int i10) {
        this.f16818a.setColor(i10);
        invalidate();
    }

    public final void setInnerCircleColor(int i10) {
        this.f16819b.setColor(i10);
        invalidate();
    }

    public final void setIsGoldGradient(boolean z10) {
        this.f16825h = z10;
        setIsGradient(true);
    }

    public final void setIsGradient(boolean z10) {
        this.f16824g = z10;
        if (z10) {
            m9377b();
            return;
        }
        this.f16818a.setShader(null);
        this.f16819b.setShader(null);
        invalidate();
    }

    public final void setMaxProgress(int i10) {
        this.f16826i = i10;
    }

    public final void setProgress(int i10) {
        int i11 = this.f16826i;
        this.f16827j = i10 > i11 ? i11 : i10;
        this.f16822e = (i10 / i11) * 360;
        invalidate();
    }

    public final void setProgressWithAnimation(int i10) {
        int i11 = this.f16827j;
        if (i11 != i10) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i11, i10);
            valueAnimatorOfFloat.setDuration(800L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C9700n(2, this));
            valueAnimatorOfFloat.start();
        }
    }

    public final void setTrackColor(int i10) {
        this.f16820c.setColor(i10);
        invalidate();
    }

    public final void setTrackThickness(int i10) {
        List<Integer> list = C6716m.f37937a;
        float fM13316a = C6716m.m13316a(i10);
        this.f16828k = fM13316a;
        this.f16818a.setStrokeWidth(fM13316a);
        this.f16820c.setStrokeWidth(this.f16828k);
        m9376a(getWidth(), getHeight());
        requestLayout();
        invalidate();
    }
}
