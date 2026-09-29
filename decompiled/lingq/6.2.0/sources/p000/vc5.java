package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class vc5 extends dm2 {

    /* JADX INFO: renamed from: f */
    public float f65183f;

    /* JADX INFO: renamed from: g */
    public float f65184g;

    /* JADX INFO: renamed from: h */
    public float f65185h;

    /* JADX INFO: renamed from: i */
    public float f65186i;

    /* JADX INFO: renamed from: j */
    public float f65187j;

    /* JADX INFO: renamed from: k */
    public float f65188k;

    /* JADX INFO: renamed from: l */
    public int f65189l;

    /* JADX INFO: renamed from: m */
    public boolean f65190m;

    /* JADX INFO: renamed from: n */
    public float f65191n;

    /* JADX INFO: renamed from: o */
    public Pair f65192o;

    @Override // p000.dm2
    /* JADX INFO: renamed from: a */
    public final void mo10465a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.f65183f != rect.width()) {
            this.f65183f = rect.width();
            mo10471g();
        }
        float fMo10469e = mo10469e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - fMo10469e) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        ed5 ed5Var = (ed5) this.f35817a;
        if (ed5Var.f37059s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.f65183f / 2.0f;
        float f3 = fMo10469e / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        int i = ed5Var.f67944a;
        this.f65184g = i * f;
        this.f65185h = Math.min(i / 2, ed5Var.m24411a()) * f;
        this.f65187j = ed5Var.f67955l * f;
        this.f65186i = Math.min(ed5Var.f67944a / 2.0f, ed5Var.m11064e()) * f;
        if (z || z2) {
            if ((z && ed5Var.f67950g == 2) || (z2 && ed5Var.f67951h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && ed5Var.f67951h != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * ed5Var.f67944a) / 2.0f);
            }
        }
        if (z2 && ed5Var.f67951h == 3) {
            this.f65191n = f;
        } else {
            this.f65191n = 1.0f;
        }
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: b */
    public final void mo10466b(int i, int i2, Canvas canvas, Paint paint) {
        int iM18163s = omd.m18163s(i, i2);
        this.f65190m = false;
        ed5 ed5Var = (ed5) this.f35817a;
        int iMin = Math.min(ed5Var.f37060t, ed5Var.f67944a);
        if (iMin <= 0 || iM18163s == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iM18163s);
        Integer num = ed5Var.f37061u;
        float f = iMin;
        m23228j(canvas, paint, new cm2(new float[]{(this.f65183f / 2.0f) - (num != null ? (ed5Var.f37060t / 2.0f) + num.floatValue() : this.f65184g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f}), f, f, (this.f65185h * f) / this.f65184g, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: c */
    public final void mo10467c(Canvas canvas, Paint paint, bm2 bm2Var, int i) {
        int iM18163s = omd.m18163s(bm2Var.f8673c, i);
        this.f65190m = bm2Var.f8678h;
        float f = bm2Var.f8671a;
        float f2 = bm2Var.f8672b;
        int i2 = bm2Var.f8674d;
        m23227i(canvas, paint, f, f2, iM18163s, i2, i2, bm2Var.f8675e, bm2Var.f8676f, true);
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: d */
    public final void mo10468d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iM18163s = omd.m18163s(i, i2);
        this.f65190m = false;
        m23227i(canvas, paint, f, f2, iM18163s, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: e */
    public final int mo10469e() {
        x90 x90Var = this.f35817a;
        return (((ed5) x90Var).f67955l * 2) + ((ed5) x90Var).f67944a;
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: f */
    public final int mo10470f() {
        return -1;
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: g */
    public final void mo10471g() {
        Path path = this.f35818b;
        path.rewind();
        ed5 ed5Var = (ed5) this.f35817a;
        if (ed5Var.m24412b(this.f65190m)) {
            int i = this.f65190m ? ed5Var.f67953j : ed5Var.f67954k;
            float f = this.f65183f;
            int i2 = (int) (f / i);
            this.f65188k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, 0.0f, f4, 0.0f);
            }
            Matrix matrix = this.f35821e;
            matrix.reset();
            matrix.setScale(this.f65188k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f65183f, 0.0f);
        }
        this.f35820d.setPath(path, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m23227i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float fM21522b;
        float fM21522b2;
        ed5 ed5Var;
        int i4;
        float f5;
        Canvas canvas2;
        Pair pair = this.f65192o;
        float fM21644w = AbstractC3584sr.m21644w(f, 0.0f, 1.0f);
        float fM21644w2 = AbstractC3584sr.m21644w(f2, 0.0f, 1.0f);
        float fM21522b3 = sob.m21522b(1.0f - this.f65191n, 1.0f, fM21644w);
        float fM21522b4 = sob.m21522b(1.0f - this.f65191n, 1.0f, fM21644w2);
        int iM21644w = (int) ((AbstractC3584sr.m21644w(fM21522b3, 0.0f, 0.01f) * i2) / 0.01f);
        int iM21644w2 = (int) (((1.0f - AbstractC3584sr.m21644w(fM21522b4, 0.99f, 1.0f)) * i3) / 0.01f);
        float f6 = this.f65183f;
        int i5 = (int) ((fM21522b3 * f6) + iM21644w);
        int i6 = (int) ((fM21522b4 * f6) - iM21644w2);
        float f7 = this.f65185h;
        float f8 = this.f65186i;
        if (f7 != f8) {
            float fMax = Math.max(f7, f8);
            float f9 = this.f65183f;
            float f10 = fMax / f9;
            fM21522b = sob.m21522b(this.f65185h, this.f65186i, AbstractC3584sr.m21644w(i5 / f9, 0.0f, f10) / f10);
            float f11 = this.f65185h;
            float f12 = this.f65186i;
            float f13 = this.f65183f;
            fM21522b2 = sob.m21522b(f11, f12, AbstractC3584sr.m21644w((f13 - i6) / f13, 0.0f, f10) / f10);
        } else {
            fM21522b = f7;
            fM21522b2 = fM21522b;
        }
        float f14 = (-this.f65183f) / 2.0f;
        ed5 ed5Var2 = (ed5) this.f35817a;
        boolean z2 = ed5Var2.m24412b(this.f65190m) && z && f3 > 0.0f;
        if (i5 <= i6) {
            float f15 = i5 + fM21522b;
            float f16 = i6 - fM21522b2;
            float f17 = fM21522b * 2.0f;
            float f18 = fM21522b2 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f65184g);
            ((cm2) pair.first).m4851b();
            ((cm2) pair.second).m4851b();
            ((cm2) pair.first).m4854e(f15 + f14);
            ((cm2) pair.second).m4854e(f16 + f14);
            if (i5 == 0 && f16 + fM21522b2 < f15 + fM21522b) {
                cm2 cm2Var = (cm2) pair.first;
                float f19 = this.f65184g;
                m23228j(canvas, paint, cm2Var, f17, f19, fM21522b, (cm2) pair.second, f18, f19, fM21522b2, true);
                return;
            }
            if (f15 - fM21522b > f16 - fM21522b2) {
                cm2 cm2Var2 = (cm2) pair.second;
                float f20 = this.f65184g;
                m23228j(canvas, paint, cm2Var2, f18, f20, fM21522b2, (cm2) pair.first, f17, f20, fM21522b, false);
                return;
            }
            float f21 = fM21522b2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(ed5Var2.mo11062c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                float f22 = this.f65183f;
                float f23 = f15 / f22;
                float f24 = f16 / f22;
                if (this.f65190m) {
                    ed5Var = ed5Var2;
                    i4 = ed5Var.f67953j;
                } else {
                    ed5Var = ed5Var2;
                    i4 = ed5Var.f67954k;
                }
                if (i4 != this.f65189l) {
                    this.f65189l = i4;
                    mo10471g();
                }
                Path path = this.f35819c;
                path.rewind();
                float f25 = (-this.f65183f) / 2.0f;
                boolean zM24412b = ed5Var.m24412b(this.f65190m);
                if (zM24412b) {
                    float f26 = this.f65183f;
                    f5 = 1.0f;
                    float f27 = this.f65188k;
                    float f28 = f26 / f27;
                    float f29 = f4 / f28;
                    float f30 = f28 / (f28 + 1.0f);
                    f23 = (f23 + f29) * f30;
                    f24 = (f24 + f29) * f30;
                    f25 -= f27 * f4;
                } else {
                    f5 = 1.0f;
                }
                PathMeasure pathMeasure = this.f35820d;
                float length = pathMeasure.getLength() * f23;
                float length2 = pathMeasure.getLength() * f24;
                pathMeasure.getSegment(length, length2, path, true);
                cm2 cm2Var3 = (cm2) pair.first;
                cm2Var3.m4851b();
                pathMeasure.getPosTan(length, cm2Var3.f10263a, cm2Var3.f10264b);
                cm2 cm2Var4 = (cm2) pair.second;
                cm2Var4.m4851b();
                pathMeasure.getPosTan(length2, cm2Var4.f10263a, cm2Var4.f10264b);
                Matrix matrix = this.f35821e;
                matrix.reset();
                matrix.setTranslate(f25, 0.0f);
                cm2Var3.m4854e(f25);
                cm2Var4.m4854e(f25);
                if (zM24412b) {
                    float f31 = this.f65187j * f3;
                    matrix.postScale(f5, f31);
                    cm2Var3.m4853d(f31);
                    cm2Var4.m4853d(f31);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((cm2) pair.first).f10263a;
                float f32 = fArr[0];
                float f33 = fArr[1];
                float[] fArr2 = ((cm2) pair.second).f10263a;
                canvas.drawLine(f32, f33, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                ed5Var = ed5Var2;
            }
            if (ed5Var.mo11062c()) {
                return;
            }
            if (f15 > 0.0f && fM21522b > 0.0f) {
                m23228j(canvas2, paint, (cm2) pair.first, f17, this.f65184g, fM21522b, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f16 >= this.f65183f || f21 <= 0.0f) {
                return;
            }
            m23228j(canvas, paint, (cm2) pair.second, f18, this.f65184g, f21, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m23228j(Canvas canvas, Paint paint, cm2 cm2Var, float f, float f2, float f3, cm2 cm2Var2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float fMin = Math.min(f2, this.f65184g);
        float f9 = (-f) / 2.0f;
        float f10 = (-fMin) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = fMin / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (cm2Var2 != null) {
            float[] fArr = cm2Var2.f10264b;
            float[] fArr2 = cm2Var2.f10263a;
            float fMin2 = Math.min(f5, this.f65184g);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.f65184g);
            RectF rectF2 = new RectF();
            if (z) {
                float f13 = (fArr2[0] - fMin3) - (cm2Var.f10263a[0] - f3);
                if (f13 > 0.0f) {
                    cm2Var2.m4854e((-f13) / 2.0f);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f10, f11, f12);
            } else {
                float f14 = (fArr2[0] + fMin3) - (cm2Var.f10263a[0] + f3);
                if (f14 < 0.0f) {
                    cm2Var2.m4854e((-f14) / 2.0f);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, 0.0f, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-fMin2) / 2.0f, f8 / 2.0f, fMin2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(dm2.m10464h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-dm2.m10464h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = cm2Var.f10263a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(dm2.m10464h(cm2Var.f10264b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = cm2Var.f10263a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(dm2.m10464h(cm2Var.f10264b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }
}
