package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class moa {

    /* JADX INFO: renamed from: p */
    public static final Matrix f51650p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f51651a;

    /* JADX INFO: renamed from: b */
    public final Path f51652b;

    /* JADX INFO: renamed from: c */
    public final Matrix f51653c;

    /* JADX INFO: renamed from: d */
    public Paint f51654d;

    /* JADX INFO: renamed from: e */
    public Paint f51655e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f51656f;

    /* JADX INFO: renamed from: g */
    public final joa f51657g;

    /* JADX INFO: renamed from: h */
    public float f51658h;

    /* JADX INFO: renamed from: i */
    public float f51659i;

    /* JADX INFO: renamed from: j */
    public float f51660j;

    /* JADX INFO: renamed from: k */
    public float f51661k;

    /* JADX INFO: renamed from: l */
    public int f51662l;

    /* JADX INFO: renamed from: m */
    public String f51663m;

    /* JADX INFO: renamed from: n */
    public Boolean f51664n;

    /* JADX INFO: renamed from: o */
    public final C3275kv f51665o;

    public moa(moa moaVar) {
        this.f51653c = new Matrix();
        this.f51658h = 0.0f;
        this.f51659i = 0.0f;
        this.f51660j = 0.0f;
        this.f51661k = 0.0f;
        this.f51662l = 255;
        this.f51663m = null;
        this.f51664n = null;
        C3275kv c3275kv = new C3275kv(0);
        this.f51665o = c3275kv;
        this.f51657g = new joa(moaVar.f51657g, c3275kv);
        this.f51651a = new Path(moaVar.f51651a);
        this.f51652b = new Path(moaVar.f51652b);
        this.f51658h = moaVar.f51658h;
        this.f51659i = moaVar.f51659i;
        this.f51660j = moaVar.f51660j;
        this.f51661k = moaVar.f51661k;
        this.f51662l = moaVar.f51662l;
        this.f51663m = moaVar.f51663m;
        String str = moaVar.f51663m;
        if (str != null) {
            c3275kv.put(str, this);
        }
        this.f51664n = moaVar.f51664n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m16959a(joa joaVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = joaVar.f45925a;
        ArrayList arrayList = joaVar.f45926b;
        matrix2.set(matrix);
        Matrix matrix3 = joaVar.f45925a;
        matrix3.preConcat(joaVar.f45934j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            koa koaVar = (koa) arrayList.get(i5);
            if (koaVar instanceof joa) {
                m16959a((joa) koaVar, matrix3, canvas, i, i2);
            } else {
                if (koaVar instanceof loa) {
                    loa loaVar = (loa) koaVar;
                    float f2 = i / this.f51660j;
                    float f3 = i2 / this.f51661k;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.f51653c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f51651a;
                        loaVar.m16416d(path);
                        Path path2 = this.f51652b;
                        path2.reset();
                        if (loaVar.m16415c()) {
                            path2.setFillType(loaVar.f49951c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            ioa ioaVar = (ioa) loaVar;
                            float f5 = ioaVar.f44375i;
                            if (f5 != 0.0f || ioaVar.f44376j != 1.0f) {
                                float f6 = ioaVar.f44377k;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (ioaVar.f44376j + f6) % 1.0f;
                                if (this.f51656f == null) {
                                    this.f51656f = new PathMeasure();
                                }
                                this.f51656f.setPath(path, z);
                                float length = this.f51656f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                PathMeasure pathMeasure = this.f51656f;
                                if (f9 > f10) {
                                    pathMeasure.getSegment(f9, length, path, true);
                                    f = 0.0f;
                                    this.f51656f.getSegment(0.0f, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            C3047gq c3047gq = ioaVar.f44372f;
                            float f11 = 255.0f;
                            if (((Shader) c3047gq.f41172c) == null && c3047gq.f41171b == 0) {
                                f11 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.f51655e == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f51655e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.f51655e;
                                Shader shader = (Shader) c3047gq.f41172c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(ioaVar.f44374h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = c3047gq.f41171b;
                                    float f12 = ioaVar.f44374h;
                                    PorterDuff.Mode mode = poa.f56599j;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(ioaVar.f49951c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            C3047gq c3047gq2 = ioaVar.f44370d;
                            if (((Shader) c3047gq2.f41172c) != null || c3047gq2.f41171b != 0) {
                                if (this.f51654d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f51654d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f51654d;
                                Paint.Join join = ioaVar.f44379m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = ioaVar.f44378l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(ioaVar.f44380n);
                                Shader shader2 = (Shader) c3047gq2.f41172c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(ioaVar.f44373g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = c3047gq2.f41171b;
                                    float f13 = ioaVar.f44373g;
                                    PorterDuff.Mode mode2 = poa.f56599j;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(ioaVar.f44371e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f51662l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f51662l = i;
    }

    public moa() {
        this.f51653c = new Matrix();
        this.f51658h = 0.0f;
        this.f51659i = 0.0f;
        this.f51660j = 0.0f;
        this.f51661k = 0.0f;
        this.f51662l = 255;
        this.f51663m = null;
        this.f51664n = null;
        this.f51665o = new C3275kv(0);
        this.f51657g = new joa();
        this.f51651a = new Path();
        this.f51652b = new Path();
    }
}
