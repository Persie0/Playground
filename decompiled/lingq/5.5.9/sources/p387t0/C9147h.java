package p387t0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import dm.C5207g;
import p338qd.C8584v;

/* JADX INFO: renamed from: t0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9147h implements InterfaceC9136b0 {

    /* JADX INFO: renamed from: a */
    public final Paint f47651a;

    /* JADX INFO: renamed from: b */
    public int f47652b;

    /* JADX INFO: renamed from: c */
    public Shader f47653c;

    /* JADX INFO: renamed from: d */
    public C9170v f47654d;

    public C9147h(Paint paint) {
        C5207g.m11111f(paint, "internalPaint");
        this.f47651a = paint;
        this.f47652b = 3;
    }

    @Override // p387t0.InterfaceC9136b0
    /* JADX INFO: renamed from: a */
    public final Paint mo17402a() {
        return this.f47651a;
    }

    /* JADX INFO: renamed from: b */
    public final float m17440b() {
        Paint paint = this.f47651a;
        C5207g.m11111f(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    /* JADX INFO: renamed from: c */
    public final long m17441c() {
        Paint paint = this.f47651a;
        C5207g.m11111f(paint, "<this>");
        return C8584v.m16783h(paint.getColor());
    }

    /* JADX INFO: renamed from: d */
    public final void m17442d(float f3) {
        Paint paint = this.f47651a;
        C5207g.m11111f(paint, "<this>");
        paint.setAlpha((int) Math.rint(f3 * 255.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m17443e(int i10) {
        if (!(this.f47652b == i10)) {
            this.f47652b = i10;
            Paint paint = this.f47651a;
            C5207g.m11111f(paint, "$this$setNativeBlendMode");
            if (Build.VERSION.SDK_INT >= 29) {
                C9164p0.f47693a.m17482a(paint, i10);
                return;
            }
            paint.setXfermode(new PorterDuffXfermode(C9137c.m17404b(i10)));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m17444f(long j10) {
        Paint paint = this.f47651a;
        C5207g.m11111f(paint, "$this$setNativeColor");
        paint.setColor(C8584v.m16780C(j10));
    }

    /* JADX INFO: renamed from: g */
    public final void m17445g(C9170v c9170v) {
        this.f47654d = c9170v;
        Paint paint = this.f47651a;
        C5207g.m11111f(paint, "<this>");
        paint.setColorFilter(c9170v != null ? c9170v.f47706a : null);
    }

    /* JADX INFO: renamed from: h */
    public final void m17446h(Shader shader) {
        this.f47653c = shader;
        Paint paint = this.f47651a;
        C5207g.m11111f(paint, "<this>");
        paint.setShader(shader);
    }

    /* JADX INFO: renamed from: i */
    public final void m17447i(int i10) {
        Paint.Cap cap;
        Paint paint = this.f47651a;
        C5207g.m11111f(paint, "$this$setNativeStrokeCap");
        if (i10 == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            if (i10 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
        }
        paint.setStrokeCap(cap);
    }

    /* JADX INFO: renamed from: j */
    public final void m17448j(int i10) {
        Paint.Join join;
        Paint paint = this.f47651a;
        C5207g.m11111f(paint, "$this$setNativeStrokeJoin");
        boolean z10 = false;
        if (i10 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (i10 == 2) {
                join = Paint.Join.BEVEL;
            } else {
                if (i10 == 1) {
                    z10 = true;
                }
                join = z10 ? Paint.Join.ROUND : Paint.Join.MITER;
            }
        }
        paint.setStrokeJoin(join);
    }

    /* JADX INFO: renamed from: k */
    public final void m17449k(int i10) {
        Paint paint = this.f47651a;
        C5207g.m11111f(paint, "$this$setNativeStyle");
        paint.setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
