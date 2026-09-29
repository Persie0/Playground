package bd;

import ae.C0062b;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: bd.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1371o extends AbstractC1369m<C1377u> {

    /* JADX INFO: renamed from: c */
    public float f8261c;

    /* JADX INFO: renamed from: d */
    public float f8262d;

    /* JADX INFO: renamed from: e */
    public float f8263e;

    /* JADX INFO: renamed from: f */
    public Path f8264f;

    public C1371o(C1377u c1377u) {
        super(c1377u);
        this.f8261c = 300.0f;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0085  */
    @Override // bd.AbstractC1369m
    /* JADX INFO: renamed from: a */
    public final void mo4939a(Canvas canvas, Rect rect, float f3) {
        this.f8261c = rect.width();
        S s10 = this.f8257a;
        float f10 = ((C1377u) s10).f8210a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - ((C1377u) s10).f8210a) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((C1377u) s10).f8288i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if (this.f8258b.m4958d() && ((C1377u) s10).f8214e == 1) {
            canvas.scale(1.0f, -1.0f);
        } else if (this.f8258b.m4957c() && ((C1377u) s10).f8215f == 2) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f8258b.m4958d() || this.f8258b.m4957c()) {
            canvas.translate(0.0f, ((f3 - 1.0f) * ((C1377u) s10).f8210a) / 2.0f);
        }
        float f11 = this.f8261c;
        canvas.clipRect((-f11) / 2.0f, (-f10) / 2.0f, f11 / 2.0f, f10 / 2.0f);
        this.f8262d = ((C1377u) s10).f8210a * f3;
        this.f8263e = ((C1377u) s10).f8211b * f3;
    }

    @Override // bd.AbstractC1369m
    /* JADX INFO: renamed from: b */
    public final void mo4940b(Canvas canvas, Paint paint, float f3, float f10, int i10) {
        if (f3 == f10) {
            return;
        }
        float f11 = this.f8261c;
        float f12 = (-f11) / 2.0f;
        float f13 = ((f3 * f11) + f12) - (this.f8263e * 2.0f);
        float f14 = (f10 * f11) + f12;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        canvas.save();
        canvas.clipPath(this.f8264f);
        float f15 = this.f8262d;
        RectF rectF = new RectF(f13, (-f15) / 2.0f, f14, f15 / 2.0f);
        float f16 = this.f8263e;
        canvas.drawRoundRect(rectF, f16, f16, paint);
        canvas.restore();
    }

    @Override // bd.AbstractC1369m
    /* JADX INFO: renamed from: c */
    public final void mo4941c(Canvas canvas, Paint paint) {
        int iM413x0 = C0062b.m413x0(((C1377u) this.f8257a).f8213d, this.f8258b.f8256j);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iM413x0);
        Path path = new Path();
        this.f8264f = path;
        float f3 = this.f8261c;
        float f10 = this.f8262d;
        RectF rectF = new RectF((-f3) / 2.0f, (-f10) / 2.0f, f3 / 2.0f, f10 / 2.0f);
        float f11 = this.f8263e;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CCW);
        canvas.drawPath(this.f8264f, paint);
    }

    @Override // bd.AbstractC1369m
    /* JADX INFO: renamed from: d */
    public final int mo4942d() {
        return ((C1377u) this.f8257a).f8210a;
    }

    @Override // bd.AbstractC1369m
    /* JADX INFO: renamed from: e */
    public final int mo4943e() {
        return -1;
    }
}
