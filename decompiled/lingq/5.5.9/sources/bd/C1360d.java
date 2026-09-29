package bd;

import ae.C0062b;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: bd.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1360d extends AbstractC1369m<C1364h> {

    /* JADX INFO: renamed from: c */
    public int f8216c;

    /* JADX INFO: renamed from: d */
    public float f8217d;

    /* JADX INFO: renamed from: e */
    public float f8218e;

    /* JADX INFO: renamed from: f */
    public float f8219f;

    public C1360d(C1364h c1364h) {
        super(c1364h);
        this.f8216c = 1;
    }

    @Override // bd.AbstractC1369m
    /* JADX INFO: renamed from: a */
    public final void mo4939a(Canvas canvas, Rect rect, float f3) {
        float fWidth = rect.width() / m4944f();
        float fHeight = rect.height() / m4944f();
        S s10 = this.f8257a;
        float f10 = (((C1364h) s10).f8235g / 2.0f) + ((C1364h) s10).f8236h;
        canvas.translate((f10 * fWidth) + rect.left, (f10 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f11 = -f10;
        canvas.clipRect(f11, f11, f10, f10);
        this.f8216c = ((C1364h) s10).f8237i == 0 ? 1 : -1;
        this.f8217d = ((C1364h) s10).f8210a * f3;
        this.f8218e = ((C1364h) s10).f8211b * f3;
        this.f8219f = (((C1364h) s10).f8235g - ((C1364h) s10).f8210a) / 2.0f;
        if ((!this.f8258b.m4958d() || ((C1364h) s10).f8214e != 2) && (!this.f8258b.m4957c() || ((C1364h) s10).f8215f != 1)) {
            if ((!this.f8258b.m4958d() || ((C1364h) s10).f8214e != 1) && (!this.f8258b.m4957c() || ((C1364h) s10).f8215f != 2)) {
                return;
            }
            this.f8219f -= ((1.0f - f3) * ((C1364h) s10).f8210a) / 2.0f;
            return;
        }
        this.f8219f = (((1.0f - f3) * ((C1364h) s10).f8210a) / 2.0f) + this.f8219f;
    }

    @Override // bd.AbstractC1369m
    /* JADX INFO: renamed from: b */
    public final void mo4940b(Canvas canvas, Paint paint, float f3, float f10, int i10) {
        if (f3 == f10) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f8217d);
        float f11 = this.f8216c;
        float f12 = f3 * 360.0f * f11;
        if (f10 < f3) {
            f10 += 1.0f;
        }
        float f13 = (f10 - f3) * 360.0f * f11;
        float f14 = this.f8219f;
        float f15 = -f14;
        canvas.drawArc(new RectF(f15, f15, f14, f14), f12, f13, false, paint);
        if (this.f8218e > 0.0f && Math.abs(f13) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            float f16 = this.f8217d;
            float f17 = this.f8218e;
            canvas.save();
            canvas.rotate(f12);
            float f18 = this.f8219f;
            float f19 = f16 / 2.0f;
            canvas.drawRoundRect(new RectF(f18 - f19, f17, f18 + f19, -f17), f17, f17, paint);
            canvas.restore();
            float f20 = this.f8217d;
            float f21 = this.f8218e;
            canvas.save();
            canvas.rotate(f12 + f13);
            float f22 = this.f8219f;
            float f23 = f20 / 2.0f;
            canvas.drawRoundRect(new RectF(f22 - f23, f21, f22 + f23, -f21), f21, f21, paint);
            canvas.restore();
        }
    }

    @Override // bd.AbstractC1369m
    /* JADX INFO: renamed from: c */
    public final void mo4941c(Canvas canvas, Paint paint) {
        int iM413x0 = C0062b.m413x0(((C1364h) this.f8257a).f8213d, this.f8258b.f8256j);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iM413x0);
        paint.setStrokeWidth(this.f8217d);
        float f3 = this.f8219f;
        canvas.drawArc(new RectF(-f3, -f3, f3, f3), 0.0f, 360.0f, false, paint);
    }

    @Override // bd.AbstractC1369m
    /* JADX INFO: renamed from: d */
    public final int mo4942d() {
        return m4944f();
    }

    @Override // bd.AbstractC1369m
    /* JADX INFO: renamed from: e */
    public final int mo4943e() {
        return m4944f();
    }

    /* JADX INFO: renamed from: f */
    public final int m4944f() {
        S s10 = this.f8257a;
        return (((C1364h) s10).f8236h * 2) + ((C1364h) s10).f8235g;
    }
}
