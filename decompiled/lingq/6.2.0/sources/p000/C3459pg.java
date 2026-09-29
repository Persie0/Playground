package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: renamed from: pg */
/* JADX INFO: loaded from: classes.dex */
public final class C3459pg implements ym0 {

    /* JADX INFO: renamed from: a */
    public Canvas f56079a = AbstractC3497qg.f57736a;

    /* JADX INFO: renamed from: b */
    public Rect f56080b;

    /* JADX INFO: renamed from: c */
    public Rect f56081c;

    @Override // p000.ym0
    /* JADX INFO: renamed from: a */
    public final void mo17009a(C3500qj c3500qj, u8a u8aVar) {
        Canvas canvas = this.f56079a;
        if (c3500qj instanceof C3500qj) {
            canvas.drawPath(c3500qj.f57839a, eh0.m11144y(u8aVar));
        } else {
            C3386nv.m17636w("Unable to obtain android.graphics.Path");
        }
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: b */
    public final void mo17010b(float f, float f2) {
        this.f56079a.scale(f, f2);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: c */
    public final void mo17011c(float f) {
        this.f56079a.rotate(f);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: d */
    public final void mo17012d(float f, float f2, float f3, float f4, float f5, float f6, u8a u8aVar) {
        this.f56079a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) u8aVar.f63594c);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: e */
    public final void mo17013e(float f, float f2, float f3, float f4, float f5, float f6, u8a u8aVar) {
        this.f56079a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) u8aVar.f63594c);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: f */
    public final void mo17014f(float f, float f2, float f3, float f4, u8a u8aVar) {
        this.f56079a.drawRect(f, f2, f3, f4, eh0.m11144y(u8aVar));
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: g */
    public final void mo17015g(e28 e28Var, u8a u8aVar) {
        this.f56079a.saveLayer(e28Var.f36620a, e28Var.f36621b, e28Var.f36622c, e28Var.f36623d, (Paint) u8aVar.f63594c, 31);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: h */
    public final void mo17016h() {
        this.f56079a.save();
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: i */
    public final void mo17017i() {
        this.f56079a.disableZ();
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: j */
    public final void mo17018j(float[] fArr) {
        if (AbstractC3695vr.m23514y(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC3352my.m17107Z(matrix, fArr);
        this.f56079a.concat(matrix);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: k */
    public final void mo17019k(C3185ki c3185ki, long j, u8a u8aVar) {
        this.f56079a.drawBitmap(AbstractC3122is.m14093g(c3185ki), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), eh0.m11144y(u8aVar));
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: l */
    public final void mo17020l(C3500qj c3500qj) {
        Canvas canvas = this.f56079a;
        if (c3500qj instanceof C3500qj) {
            canvas.clipPath(c3500qj.f57839a, Region.Op.INTERSECT);
        } else {
            C3386nv.m17636w("Unable to obtain android.graphics.Path");
        }
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: m */
    public final void mo17021m(float f, long j, u8a u8aVar) {
        this.f56079a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) u8aVar.f63594c);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: n */
    public final void mo17022n(float f, float f2, float f3, float f4, int i) {
        this.f56079a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: o */
    public final void mo17023o(float f, float f2) {
        this.f56079a.translate(f, f2);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: p */
    public final void mo17024p() {
        this.f56079a.restore();
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: r */
    public final void mo17025r(C3185ki c3185ki, long j, long j2, long j3, u8a u8aVar) {
        if (this.f56080b == null) {
            this.f56080b = new Rect();
            this.f56081c = new Rect();
        }
        Canvas canvas = this.f56079a;
        Bitmap bitmapM14093g = AbstractC3122is.m14093g(c3185ki);
        Rect rect = this.f56080b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.f56081c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapM14093g, rect, rect2, (Paint) u8aVar.f63594c);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: s */
    public final void mo17026s(long j, long j2, u8a u8aVar) {
        this.f56079a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) u8aVar.f63594c);
    }

    @Override // p000.ym0
    /* JADX INFO: renamed from: t */
    public final void mo17027t() {
        this.f56079a.enableZ();
    }
}
