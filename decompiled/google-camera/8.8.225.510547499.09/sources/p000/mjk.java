package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjk extends mjx {

    /* JADX INFO: renamed from: c */
    private int f40747c;

    /* JADX INFO: renamed from: d */
    private float f40748d;

    /* JADX INFO: renamed from: e */
    private float f40749e;

    /* JADX INFO: renamed from: f */
    private float f40750f;

    public mjk(mjq mjqVar) {
        super(mjqVar);
        this.f40747c = 1;
    }

    /* JADX INFO: renamed from: g */
    private final int m16452g() {
        mjq mjqVar = (mjq) this.f40788a;
        int i = mjqVar.f40766g;
        int i2 = mjqVar.f40767h;
        return i + i2 + i2;
    }

    /* JADX INFO: renamed from: h */
    private final void m16453h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f40750f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    @Override // p000.mjx
    /* JADX INFO: renamed from: a */
    public final int mo16454a() {
        return m16452g();
    }

    @Override // p000.mjx
    /* JADX INFO: renamed from: b */
    public final int mo16455b() {
        return m16452g();
    }

    @Override // p000.mjx
    /* JADX INFO: renamed from: c */
    public final void mo16456c(Canvas canvas, Rect rect, float f) {
        float fWidth = rect.width();
        float fM16452g = m16452g();
        float fHeight = rect.height();
        float fM16452g2 = m16452g();
        mjq mjqVar = (mjq) this.f40788a;
        float f2 = (mjqVar.f40766g / 2.0f) + mjqVar.f40767h;
        float f3 = fWidth / fM16452g;
        float f4 = fHeight / fM16452g2;
        canvas.translate((f2 * f3) + rect.left, (f2 * f4) + rect.top);
        canvas.scale(f3, f4);
        canvas.rotate(-90.0f);
        float f5 = -f2;
        canvas.clipRect(f5, f5, f2, f2);
        mjq mjqVar2 = (mjq) this.f40788a;
        this.f40747c = mjqVar2.f40768i == 0 ? 1 : -1;
        int i = mjqVar2.f40741a;
        this.f40748d = i * f;
        this.f40749e = mjqVar2.f40742b * f;
        this.f40750f = (mjqVar2.f40766g - i) / 2.0f;
        if ((this.f40789b.m16472g() && ((mjq) this.f40788a).f40745e == 2) || (this.f40789b.m16471f() && ((mjq) this.f40788a).f40746f == 1)) {
            this.f40750f += ((1.0f - f) * ((mjq) this.f40788a).f40741a) / 2.0f;
        } else if ((this.f40789b.m16472g() && ((mjq) this.f40788a).f40745e == 1) || (this.f40789b.m16471f() && ((mjq) this.f40788a).f40746f == 2)) {
            this.f40750f -= ((1.0f - f) * ((mjq) this.f40788a).f40741a) / 2.0f;
        }
    }

    @Override // p000.mjx
    /* JADX INFO: renamed from: d */
    public final void mo16457d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f40748d);
        float f3 = f * 360.0f;
        float f4 = this.f40747c;
        float f5 = f2 >= f ? (f2 - f) * 360.0f * f4 : ((1.0f + f2) - f) * 360.0f * f4;
        float f6 = f3 * f4;
        float f7 = this.f40750f;
        float f8 = -f7;
        canvas.drawArc(new RectF(f8, f8, f7, f7), f6, f5, false, paint);
        if (this.f40749e <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        m16453h(canvas, paint, this.f40748d, this.f40749e, f6);
        m16453h(canvas, paint, this.f40748d, this.f40749e, f6 + f5);
    }

    @Override // p000.mjx
    /* JADX INFO: renamed from: e */
    public final void mo16458e(Canvas canvas, Paint paint) {
        int iM15023p = kxk.m15023p(((mjq) this.f40788a).f40744d, this.f40789b.f40786i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iM15023p);
        paint.setStrokeWidth(this.f40748d);
        float f = this.f40750f;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }
}
