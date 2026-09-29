package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class p21 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g */
    public static final LinearInterpolator f55471g = new LinearInterpolator();

    /* JADX INFO: renamed from: h */
    public static final qz2 f55472h = new qz2(1);

    /* JADX INFO: renamed from: i */
    public static final int[] f55473i = {-16777216};

    /* JADX INFO: renamed from: a */
    public final o21 f55474a;

    /* JADX INFO: renamed from: b */
    public float f55475b;

    /* JADX INFO: renamed from: c */
    public final Resources f55476c;

    /* JADX INFO: renamed from: d */
    public final ValueAnimator f55477d;

    /* JADX INFO: renamed from: e */
    public float f55478e;

    /* JADX INFO: renamed from: f */
    public boolean f55479f;

    public p21(Context context) {
        context.getClass();
        this.f55476c = context.getResources();
        o21 o21Var = new o21();
        this.f55474a = o21Var;
        o21Var.f53635i = f55473i;
        o21Var.m17769a(0);
        o21Var.f53634h = 2.5f;
        o21Var.f53628b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new m21(this, o21Var));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f55471g);
        valueAnimatorOfFloat.addListener(new n21(this, o21Var));
        this.f55477d = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: d */
    public static void m18858d(float f, o21 o21Var) {
        if (f <= 0.75f) {
            o21Var.f53647u = o21Var.f53635i[o21Var.f53636j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = o21Var.f53635i;
        int i = o21Var.f53636j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        o21Var.f53647u = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
    }

    /* JADX INFO: renamed from: a */
    public final void m18859a(float f, o21 o21Var, boolean z) {
        float interpolation;
        if (this.f55479f) {
            m18858d(f, o21Var);
            float fFloor = (float) (Math.floor(o21Var.f53639m / 0.8f) + 1.0d);
            float f2 = o21Var.f53637k;
            float f3 = o21Var.f53638l;
            o21Var.f53631e = (((f3 - 0.01f) - f2) * f) + f2;
            o21Var.f53632f = f3;
            float f4 = o21Var.f53639m;
            o21Var.f53633g = AbstractC3393o1.m17726a(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = o21Var.f53639m;
            float interpolation2 = o21Var.f53637k;
            qz2 qz2Var = f55472h;
            if (f < 0.5f) {
                interpolation = (qz2Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f6 = interpolation2 + 0.79f;
                interpolation2 = f6 - (((1.0f - qz2Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f55478e) * 216.0f;
            o21Var.f53631e = interpolation2;
            o21Var.f53632f = interpolation;
            o21Var.f53633g = f7;
            this.f55475b = f8;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18860b(float f, float f2, float f3, float f4) {
        float f5 = this.f55476c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        o21 o21Var = this.f55474a;
        o21Var.f53634h = f6;
        o21Var.f53628b.setStrokeWidth(f6);
        o21Var.f53643q = f * f5;
        o21Var.m17769a(0);
        o21Var.f53644r = (int) (f3 * f5);
        o21Var.f53645s = (int) (f4 * f5);
    }

    /* JADX INFO: renamed from: c */
    public final void m18861c(int i) {
        if (i == 0) {
            m18860b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m18860b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f55475b, bounds.exactCenterX(), bounds.exactCenterY());
        o21 o21Var = this.f55474a;
        Paint paint = o21Var.f53628b;
        RectF rectF = o21Var.f53627a;
        float f = o21Var.f53643q;
        float fMin = (o21Var.f53634h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((o21Var.f53644r * o21Var.f53642p) / 2.0f, o21Var.f53634h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = o21Var.f53631e;
        float f3 = o21Var.f53633g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((o21Var.f53632f + f3) * 360.0f) - f4;
        paint.setColor(o21Var.f53647u);
        paint.setAlpha(o21Var.f53646t);
        float f6 = o21Var.f53634h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, o21Var.f53630d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = o21Var.f53629c;
        if (o21Var.f53640n) {
            Path path = o21Var.f53641o;
            if (path == null) {
                Path path2 = new Path();
                o21Var.f53641o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (o21Var.f53644r * o21Var.f53642p) / 2.0f;
            o21Var.f53641o.moveTo(0.0f, 0.0f);
            o21Var.f53641o.lineTo(o21Var.f53644r * o21Var.f53642p, 0.0f);
            Path path3 = o21Var.f53641o;
            float f9 = o21Var.f53644r;
            float f10 = o21Var.f53642p;
            path3.lineTo((f9 * f10) / 2.0f, o21Var.f53645s * f10);
            o21Var.f53641o.offset((rectF.centerX() + fMin2) - f8, (o21Var.f53634h / 2.0f) + rectF.centerY());
            o21Var.f53641o.close();
            paint2.setColor(o21Var.f53647u);
            paint2.setAlpha(o21Var.f53646t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(o21Var.f53641o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f55474a.f53646t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f55477d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55474a.f53646t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55474a.f53628b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.f55477d;
        valueAnimator.cancel();
        o21 o21Var = this.f55474a;
        float f = o21Var.f53631e;
        o21Var.f53637k = f;
        float f2 = o21Var.f53632f;
        o21Var.f53638l = f2;
        o21Var.f53639m = o21Var.f53633g;
        if (f2 != f) {
            this.f55479f = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        o21Var.m17769a(0);
        o21Var.f53637k = 0.0f;
        o21Var.f53638l = 0.0f;
        o21Var.f53639m = 0.0f;
        o21Var.f53631e = 0.0f;
        o21Var.f53632f = 0.0f;
        o21Var.f53633g = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f55477d.cancel();
        this.f55475b = 0.0f;
        o21 o21Var = this.f55474a;
        if (o21Var.f53640n) {
            o21Var.f53640n = false;
        }
        o21Var.m17769a(0);
        o21Var.f53637k = 0.0f;
        o21Var.f53638l = 0.0f;
        o21Var.f53639m = 0.0f;
        o21Var.f53631e = 0.0f;
        o21Var.f53632f = 0.0f;
        o21Var.f53633g = 0.0f;
        invalidateSelf();
    }
}
