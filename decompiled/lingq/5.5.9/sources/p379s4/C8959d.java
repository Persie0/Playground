package p379s4;

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
import androidx.activity.result.C0204c;
import p378s3.C8953b;

/* JADX INFO: renamed from: s4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8959d extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g */
    public static final LinearInterpolator f46928g = new LinearInterpolator();

    /* JADX INFO: renamed from: h */
    public static final C8953b f46929h = new C8953b();

    /* JADX INFO: renamed from: i */
    public static final int[] f46930i = {-16777216};

    /* JADX INFO: renamed from: a */
    public final a f46931a;

    /* JADX INFO: renamed from: b */
    public float f46932b;

    /* JADX INFO: renamed from: c */
    public final Resources f46933c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f46934d;

    /* JADX INFO: renamed from: e */
    public float f46935e;

    /* JADX INFO: renamed from: f */
    public boolean f46936f;

    /* JADX INFO: renamed from: s4.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final RectF f46937a = new RectF();

        /* JADX INFO: renamed from: b */
        public final Paint f46938b;

        /* JADX INFO: renamed from: c */
        public final Paint f46939c;

        /* JADX INFO: renamed from: d */
        public final Paint f46940d;

        /* JADX INFO: renamed from: e */
        public float f46941e;

        /* JADX INFO: renamed from: f */
        public float f46942f;

        /* JADX INFO: renamed from: g */
        public float f46943g;

        /* JADX INFO: renamed from: h */
        public float f46944h;

        /* JADX INFO: renamed from: i */
        public int[] f46945i;

        /* JADX INFO: renamed from: j */
        public int f46946j;

        /* JADX INFO: renamed from: k */
        public float f46947k;

        /* JADX INFO: renamed from: l */
        public float f46948l;

        /* JADX INFO: renamed from: m */
        public float f46949m;

        /* JADX INFO: renamed from: n */
        public boolean f46950n;

        /* JADX INFO: renamed from: o */
        public Path f46951o;

        /* JADX INFO: renamed from: p */
        public float f46952p;

        /* JADX INFO: renamed from: q */
        public float f46953q;

        /* JADX INFO: renamed from: r */
        public int f46954r;

        /* JADX INFO: renamed from: s */
        public int f46955s;

        /* JADX INFO: renamed from: t */
        public int f46956t;

        /* JADX INFO: renamed from: u */
        public int f46957u;

        public a() {
            Paint paint = new Paint();
            this.f46938b = paint;
            Paint paint2 = new Paint();
            this.f46939c = paint2;
            Paint paint3 = new Paint();
            this.f46940d = paint3;
            this.f46941e = 0.0f;
            this.f46942f = 0.0f;
            this.f46943g = 0.0f;
            this.f46944h = 5.0f;
            this.f46952p = 1.0f;
            this.f46956t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m17187a(int i10) {
            this.f46946j = i10;
            this.f46957u = this.f46945i[i10];
        }
    }

    public C8959d(Context context) {
        context.getClass();
        this.f46933c = context.getResources();
        a aVar = new a();
        this.f46931a = aVar;
        aVar.f46945i = f46930i;
        aVar.m17187a(0);
        aVar.f46944h = 2.5f;
        aVar.f46938b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C8957b(this, aVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f46928g);
        valueAnimatorOfFloat.addListener(new C8958c(this, aVar));
        this.f46934d = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: d */
    public static void m17183d(float f3, a aVar) {
        if (f3 <= 0.75f) {
            aVar.f46957u = aVar.f46945i[aVar.f46946j];
            return;
        }
        float f10 = (f3 - 0.75f) / 0.25f;
        int[] iArr = aVar.f46945i;
        int i10 = aVar.f46946j;
        int i11 = iArr[i10];
        int i12 = iArr[(i10 + 1) % iArr.length];
        int i13 = (i11 >> 24) & 255;
        int i14 = (i11 >> 16) & 255;
        int i15 = (i11 >> 8) & 255;
        int i16 = i11 & 255;
        aVar.f46957u = ((i13 + ((int) ((((i12 >> 24) & 255) - i13) * f10))) << 24) | ((i14 + ((int) ((((i12 >> 16) & 255) - i14) * f10))) << 16) | ((i15 + ((int) ((((i12 >> 8) & 255) - i15) * f10))) << 8) | (i16 + ((int) (f10 * ((i12 & 255) - i16))));
    }

    /* JADX INFO: renamed from: a */
    public final void m17184a(float f3, a aVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f46936f) {
            m17183d(f3, aVar);
            float fFloor = (float) (Math.floor(aVar.f46949m / 0.8f) + 1.0d);
            float f10 = aVar.f46947k;
            float f11 = aVar.f46948l;
            aVar.f46941e = (((f11 - 0.01f) - f10) * f3) + f10;
            aVar.f46942f = f11;
            float f12 = aVar.f46949m;
            aVar.f46943g = C0204c.m845d(fFloor, f12, f3, f12);
            return;
        }
        if (f3 != 1.0f || z10) {
            float f13 = aVar.f46949m;
            C8953b c8953b = f46929h;
            if (f3 < 0.5f) {
                interpolation = aVar.f46947k;
                interpolation2 = (c8953b.getInterpolation(f3 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f14 = aVar.f46947k + 0.79f;
                interpolation = f14 - (((1.0f - c8953b.getInterpolation((f3 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f14;
            }
            float f15 = (0.20999998f * f3) + f13;
            float f16 = (f3 + this.f46935e) * 216.0f;
            aVar.f46941e = interpolation;
            aVar.f46942f = interpolation2;
            aVar.f46943g = f15;
            this.f46932b = f16;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17185b(float f3, float f10, float f11, float f12) {
        float f13 = this.f46933c.getDisplayMetrics().density;
        float f14 = f10 * f13;
        a aVar = this.f46931a;
        aVar.f46944h = f14;
        aVar.f46938b.setStrokeWidth(f14);
        aVar.f46953q = f3 * f13;
        aVar.m17187a(0);
        aVar.f46954r = (int) (f11 * f13);
        aVar.f46955s = (int) (f12 * f13);
    }

    /* JADX INFO: renamed from: c */
    public final void m17186c(int i10) {
        if (i10 == 0) {
            m17185b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m17185b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f46932b, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f46931a;
        RectF rectF = aVar.f46937a;
        float f3 = aVar.f46953q;
        float fMin = (aVar.f46944h / 2.0f) + f3;
        if (f3 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f46954r * aVar.f46952p) / 2.0f, aVar.f46944h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f10 = aVar.f46941e;
        float f11 = aVar.f46943g;
        float f12 = (f10 + f11) * 360.0f;
        float f13 = ((aVar.f46942f + f11) * 360.0f) - f12;
        Paint paint = aVar.f46938b;
        paint.setColor(aVar.f46957u);
        paint.setAlpha(aVar.f46956t);
        float f14 = aVar.f46944h / 2.0f;
        rectF.inset(f14, f14);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f46940d);
        float f15 = -f14;
        rectF.inset(f15, f15);
        canvas.drawArc(rectF, f12, f13, false, paint);
        if (aVar.f46950n) {
            Path path = aVar.f46951o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f46951o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f16 = (aVar.f46954r * aVar.f46952p) / 2.0f;
            aVar.f46951o.moveTo(0.0f, 0.0f);
            aVar.f46951o.lineTo(aVar.f46954r * aVar.f46952p, 0.0f);
            Path path3 = aVar.f46951o;
            float f17 = aVar.f46954r;
            float f18 = aVar.f46952p;
            path3.lineTo((f17 * f18) / 2.0f, aVar.f46955s * f18);
            aVar.f46951o.offset((rectF.centerX() + fMin2) - f16, (aVar.f46944h / 2.0f) + rectF.centerY());
            aVar.f46951o.close();
            Paint paint2 = aVar.f46939c;
            paint2.setColor(aVar.f46957u);
            paint2.setAlpha(aVar.f46956t);
            canvas.save();
            canvas.rotate(f12 + f13, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f46951o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f46931a.f46956t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f46934d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f46931a.f46956t = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46931a.f46938b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f46934d.cancel();
        a aVar = this.f46931a;
        float f3 = aVar.f46941e;
        aVar.f46947k = f3;
        float f10 = aVar.f46942f;
        aVar.f46948l = f10;
        aVar.f46949m = aVar.f46943g;
        if (f10 != f3) {
            this.f46936f = true;
            this.f46934d.setDuration(666L);
            this.f46934d.start();
            return;
        }
        aVar.m17187a(0);
        aVar.f46947k = 0.0f;
        aVar.f46948l = 0.0f;
        aVar.f46949m = 0.0f;
        aVar.f46941e = 0.0f;
        aVar.f46942f = 0.0f;
        aVar.f46943g = 0.0f;
        this.f46934d.setDuration(1332L);
        this.f46934d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f46934d.cancel();
        this.f46932b = 0.0f;
        a aVar = this.f46931a;
        if (aVar.f46950n) {
            aVar.f46950n = false;
        }
        aVar.m17187a(0);
        aVar.f46947k = 0.0f;
        aVar.f46948l = 0.0f;
        aVar.f46949m = 0.0f;
        aVar.f46941e = 0.0f;
        aVar.f46942f = 0.0f;
        aVar.f46943g = 0.0f;
        invalidateSelf();
    }
}
