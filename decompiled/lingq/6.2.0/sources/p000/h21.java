package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h21 extends dm2 {

    /* JADX INFO: renamed from: f */
    public float f41679f;

    /* JADX INFO: renamed from: g */
    public float f41680g;

    /* JADX INFO: renamed from: h */
    public float f41681h;

    /* JADX INFO: renamed from: i */
    public float f41682i;

    /* JADX INFO: renamed from: j */
    public float f41683j;

    /* JADX INFO: renamed from: k */
    public float f41684k;

    /* JADX INFO: renamed from: l */
    public int f41685l;

    /* JADX INFO: renamed from: m */
    public float f41686m;

    /* JADX INFO: renamed from: n */
    public boolean f41687n;

    /* JADX INFO: renamed from: o */
    public float f41688o;

    /* JADX INFO: renamed from: p */
    public final RectF f41689p;

    /* JADX INFO: renamed from: q */
    public final Pair f41690q;

    public h21(q21 q21Var) {
        super(q21Var);
        this.f41689p = new RectF();
        this.f41690q = new Pair(new cm2(), new cm2());
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: a */
    public final void mo10465a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float fWidth = rect.width() / m13001k();
        float fHeight = rect.height() / m13001k();
        q21 q21Var = (q21) this.f35817a;
        float f2 = (q21Var.f57151r / 2.0f) + q21Var.f57152s;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (q21Var.f57153t != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        int i = q21Var.f67944a;
        this.f41679f = i * f;
        this.f41680g = Math.min(i / 2, q21Var.m24411a()) * f;
        this.f41681h = q21Var.f67955l * f;
        int i2 = q21Var.f57151r;
        int i3 = q21Var.f67944a;
        float f4 = (i2 - i3) / 2.0f;
        this.f41682i = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * i3) / 2.0f;
            if ((z && q21Var.f67950g == 2) || (z2 && q21Var.f67951h == 1)) {
                this.f41682i = f4 + f5;
            } else if ((z && q21Var.f67950g == 1) || (z2 && q21Var.f67951h == 2)) {
                this.f41682i = f4 - f5;
            }
        }
        if (z2 && q21Var.f67951h == 3) {
            this.f41688o = f;
        } else {
            this.f41688o = 1.0f;
        }
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: b */
    public final void mo10466b(int i, int i2, Canvas canvas, Paint paint) {
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: c */
    public final void mo10467c(Canvas canvas, Paint paint, bm2 bm2Var, int i) {
        int iM18163s = omd.m18163s(bm2Var.f8673c, i);
        canvas.save();
        canvas.rotate(bm2Var.f8677g);
        this.f41687n = bm2Var.f8678h;
        float f = bm2Var.f8671a;
        float f2 = bm2Var.f8672b;
        int i2 = bm2Var.f8674d;
        m12999i(canvas, paint, f, f2, iM18163s, i2, i2, bm2Var.f8675e, bm2Var.f8676f, true);
        canvas.restore();
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: d */
    public final void mo10468d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iM18163s = omd.m18163s(i, i2);
        this.f41687n = false;
        m12999i(canvas, paint, f, f2, iM18163s, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: e */
    public final int mo10469e() {
        return m13001k();
    }

    @Override // p000.dm2
    /* JADX INFO: renamed from: f */
    public final int mo10470f() {
        return m13001k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.dm2
    /* JADX INFO: renamed from: g */
    public final void mo10471g() {
        int i;
        Path path = this.f35818b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i3++;
        }
        Matrix matrix = this.f35821e;
        matrix.reset();
        float f = this.f41682i;
        matrix.setScale(f, f);
        path.transform(matrix);
        q21 q21Var = (q21) this.f35817a;
        boolean zM24412b = q21Var.m24412b(this.f41687n);
        PathMeasure pathMeasure = this.f35820d;
        if (zM24412b) {
            pathMeasure.setPath(path, false);
            float f2 = this.f41684k;
            path.rewind();
            float length = pathMeasure.getLength();
            float f3 = 2.0f;
            int iMax = Math.max(3, (int) ((length / (this.f41687n ? q21Var.f67953j : q21Var.f67954k)) / 2.0f)) * 2;
            this.f41683j = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < iMax; i4++) {
                cm2 cm2Var = new cm2();
                float f4 = i4;
                pathMeasure.getPosTan(this.f41683j * f4, cm2Var.f10263a, cm2Var.f10264b);
                cm2 cm2Var2 = new cm2();
                float f5 = this.f41683j;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), cm2Var2.f10263a, cm2Var2.f10264b);
                arrayList.add(cm2Var);
                cm2Var2.m4850a(f2 * 2.0f);
                arrayList.add(cm2Var2);
            }
            arrayList.add((cm2) arrayList.get(0));
            cm2 cm2Var3 = (cm2) arrayList.get(0);
            float[] fArr = cm2Var3.f10263a;
            char c = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i5 = 1;
            while (i5 < arrayList.size()) {
                cm2 cm2Var4 = (cm2) arrayList.get(i5);
                float f6 = (this.f41683j / f3) * 0.48f;
                float[] fArr2 = cm2Var3.f10263a;
                float[] fArr3 = cm2Var3.f10264b;
                float[] fArr4 = new float[i];
                float[] fArr5 = new float[i];
                System.arraycopy(fArr2, i2, fArr4, i2, i);
                System.arraycopy(fArr3, i2, fArr5, i2, i);
                new Matrix();
                float[] fArr6 = cm2Var4.f10263a;
                float[] fArr7 = cm2Var4.f10264b;
                float[] fArr8 = new float[i];
                float[] fArr9 = new float[i];
                System.arraycopy(fArr6, i2, fArr8, i2, i);
                System.arraycopy(fArr7, i2, fArr9, i2, i);
                new Matrix();
                char c2 = c;
                float fAtan2 = (float) Math.atan2(fArr5[c], fArr5[i2]);
                double d = fArr4[i2];
                double d2 = f6;
                int i6 = i2;
                double d3 = fAtan2;
                fArr4[i6] = (float) ((Math.cos(d3) * d2) + d);
                fArr4[c2] = (float) ((Math.sin(d3) * d2) + ((double) fArr4[c2]));
                double d4 = -f6;
                double dAtan2 = (float) Math.atan2(fArr9[c2], fArr9[i6]);
                fArr8[i6] = (float) ((Math.cos(dAtan2) * d4) + ((double) fArr8[i6]));
                float fSin = (float) ((Math.sin(dAtan2) * d4) + ((double) fArr8[c2]));
                fArr8[c2] = fSin;
                float f7 = fArr4[i6];
                float f8 = fArr4[c2];
                float f9 = fArr8[i6];
                float[] fArr10 = cm2Var4.f10263a;
                path.cubicTo(f7, f8, f9, fSin, fArr10[i6], fArr10[c2]);
                i5++;
                cm2Var3 = cm2Var4;
                c = c2;
                i2 = i6;
                pathMeasure = pathMeasure;
                i = 2;
                f3 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i2);
    }

    /* JADX INFO: renamed from: i */
    public final void m12999i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        Canvas canvas2;
        float f6 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f7 = f % 1.0f;
        if (f7 < 0.0f) {
            f7 += 1.0f;
        }
        if (this.f41688o < 1.0f) {
            float f8 = f7 + f6;
            if (f8 > 1.0f) {
                m12999i(canvas, paint, f7, 1.0f, i, i2, 0, f3, f4, z);
                m12999i(canvas, paint, 1.0f, f8, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f41680g / this.f41682i);
        float f9 = f6 - 0.99f;
        if (f9 >= 0.0f) {
            float f10 = ((f9 * degrees) / 180.0f) / 0.01f;
            f6 += f10;
            if (!z) {
                f7 -= f10 / 2.0f;
            }
        }
        float fM21522b = sob.m21522b(1.0f - this.f41688o, 1.0f, f7);
        float fM21522b2 = sob.m21522b(0.0f, this.f41688o, f6);
        float degrees2 = (float) Math.toDegrees(i2 / this.f41682i);
        float degrees3 = ((fM21522b2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.f41682i));
        float f11 = (fM21522b * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        q21 q21Var = (q21) this.f35817a;
        boolean z2 = q21Var.m24412b(this.f41687n) && z && f3 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f41679f);
        float f12 = this.f41680g * 2.0f;
        float f13 = degrees * 2.0f;
        PathMeasure pathMeasure = this.f35820d;
        if (degrees3 < f13) {
            float f14 = degrees3 / f13;
            float f15 = (degrees * f14) + f11;
            cm2 cm2Var = new cm2();
            if (z2) {
                float length = (pathMeasure.getLength() * (f15 / 360.0f)) / 2.0f;
                float f16 = this.f41681h * f3;
                float f17 = this.f41682i;
                if (f17 != this.f41686m || f16 != this.f41684k) {
                    this.f41684k = f16;
                    this.f41686m = f17;
                    mo10471g();
                }
                pathMeasure.getPosTan(length, cm2Var.f10263a, cm2Var.f10264b);
            } else {
                cm2Var.m4852c(f15 + 90.0f);
                cm2Var.m4850a(-this.f41682i);
            }
            paint.setStyle(Paint.Style.FILL);
            m13000j(canvas, paint, cm2Var, f12, this.f41679f, f14);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(q21Var.mo11062c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f18 = f11 + degrees;
        float f19 = degrees3 - f13;
        Pair pair = this.f41690q;
        ((cm2) pair.first).m4851b();
        ((cm2) pair.second).m4851b();
        if (z2) {
            float f20 = f18 / 360.0f;
            float f21 = f19 / 360.0f;
            float f22 = this.f41681h * f3;
            int i4 = this.f41687n ? q21Var.f67953j : q21Var.f67954k;
            float f23 = this.f41682i;
            if (f23 != this.f41686m || f22 != this.f41684k || i4 != this.f41685l) {
                this.f41684k = f22;
                this.f41685l = i4;
                this.f41686m = f23;
                mo10471g();
            }
            Path path = this.f35819c;
            path.rewind();
            float fM21644w = AbstractC3584sr.m21644w(f21, 0.0f, 1.0f);
            if (q21Var.m24412b(this.f41687n)) {
                float f24 = f4 / ((float) ((((double) this.f41682i) * 6.283185307179586d) / ((double) this.f41683j)));
                f20 += f24;
                f5 = 0.0f - (f24 * 360.0f);
            } else {
                f5 = 0.0f;
            }
            float f25 = f20 % 1.0f;
            float length2 = (pathMeasure.getLength() * f25) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f25 + fM21644w)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            cm2 cm2Var2 = (cm2) pair.first;
            cm2Var2.m4851b();
            pathMeasure.getPosTan(length2, cm2Var2.f10263a, cm2Var2.f10264b);
            cm2 cm2Var3 = (cm2) pair.second;
            cm2Var3.m4851b();
            pathMeasure.getPosTan(length3, cm2Var3.f10263a, cm2Var3.f10264b);
            Matrix matrix = this.f35821e;
            matrix.reset();
            matrix.setRotate(f5);
            cm2Var2.m4852c(f5);
            cm2Var3.m4852c(f5);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((cm2) pair.first).m4852c(f18 + 90.0f);
            ((cm2) pair.first).m4850a(-this.f41682i);
            ((cm2) pair.second).m4852c(f18 + f19 + 90.0f);
            ((cm2) pair.second).m4850a(-this.f41682i);
            float f26 = this.f41682i;
            float f27 = -f26;
            RectF rectF = this.f41689p;
            rectF.set(f27, f27, f26, f26);
            canvas.drawArc(rectF, f18, f19, false, paint);
            canvas2 = canvas;
        }
        if (q21Var.mo11062c() || this.f41680g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        m13000j(canvas2, paint, (cm2) pair.first, f12, this.f41679f, 1.0f);
        m13000j(canvas, paint, (cm2) pair.second, f12, this.f41679f, 1.0f);
    }

    /* JADX INFO: renamed from: j */
    public final void m13000j(Canvas canvas, Paint paint, cm2 cm2Var, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.f41679f);
        float f4 = f / 2.0f;
        float fMin2 = Math.min(f4, (this.f41680g * fMin) / this.f41679f);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f4, fMin / 2.0f);
        canvas.save();
        float[] fArr = cm2Var.f10263a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(dm2.m10464h(cm2Var.f10264b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: k */
    public final int m13001k() {
        x90 x90Var = this.f35817a;
        return (((q21) x90Var).f57152s * 2) + ((q21) x90Var).f57151r;
    }
}
