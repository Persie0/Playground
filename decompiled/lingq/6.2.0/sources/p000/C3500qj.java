package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.p002ui.graphics.Path$Direction;

/* JADX INFO: renamed from: qj */
/* JADX INFO: loaded from: classes.dex */
public final class C3500qj {

    /* JADX INFO: renamed from: a */
    public final Path f57839a;

    /* JADX INFO: renamed from: b */
    public RectF f57840b;

    /* JADX INFO: renamed from: c */
    public float[] f57841c;

    /* JADX INFO: renamed from: d */
    public Matrix f57842d;

    public C3500qj(Path path) {
        this.f57839a = path;
    }

    /* JADX INFO: renamed from: a */
    public static void m19984a(C3500qj c3500qj, C3500qj c3500qj2) {
        Path path = c3500qj.f57839a;
        if (c3500qj2 instanceof C3500qj) {
            path.addPath(c3500qj2.f57839a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            C3386nv.m17636w("Unable to obtain android.graphics.Path");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m19985b(C3500qj c3500qj, e28 e28Var) {
        Path.Direction direction;
        Path$Direction path$Direction = Path$Direction.CounterClockwise;
        c3500qj.getClass();
        float f = e28Var.f36620a;
        float f2 = e28Var.f36623d;
        float f3 = e28Var.f36622c;
        float f4 = e28Var.f36621b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            AbstractC3650uj.m22758b("Invalid rectangle, make sure no value is NaN");
        }
        if (c3500qj.f57840b == null) {
            c3500qj.f57840b = new RectF();
        }
        RectF rectF = c3500qj.f57840b;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = c3500qj.f57839a;
        RectF rectF2 = c3500qj.f57840b;
        rectF2.getClass();
        int i = AbstractC3613tj.f62362a[path$Direction.ordinal()];
        if (i == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i != 2) {
                gm5.m12750e();
                return;
            }
            direction = Path.Direction.CW;
        }
        path.addRect(rectF2, direction);
    }

    /* JADX INFO: renamed from: c */
    public static void m19986c(C3500qj c3500qj, mi8 mi8Var) {
        Path.Direction direction;
        Path$Direction path$Direction = Path$Direction.CounterClockwise;
        if (c3500qj.f57840b == null) {
            c3500qj.f57840b = new RectF();
        }
        RectF rectF = c3500qj.f57840b;
        rectF.getClass();
        float f = mi8Var.f51360a;
        long j = mi8Var.f51367h;
        long j2 = mi8Var.f51366g;
        long j3 = mi8Var.f51365f;
        long j4 = mi8Var.f51364e;
        rectF.set(f, mi8Var.f51361b, mi8Var.f51362c, mi8Var.f51363d);
        if (c3500qj.f57841c == null) {
            c3500qj.f57841c = new float[8];
        }
        float[] fArr = c3500qj.f57841c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c3500qj.f57839a;
        RectF rectF2 = c3500qj.f57840b;
        rectF2.getClass();
        float[] fArr2 = c3500qj.f57841c;
        fArr2.getClass();
        int i = AbstractC3613tj.f62362a[path$Direction.ordinal()];
        if (i == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i != 2) {
                gm5.m12750e();
                return;
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }

    /* JADX INFO: renamed from: d */
    public final e28 m19987d() {
        if (this.f57840b == null) {
            this.f57840b = new RectF();
        }
        RectF rectF = this.f57840b;
        rectF.getClass();
        this.f57839a.computeBounds(rectF, true);
        return new e28(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: e */
    public final void m19988e(float f, float f2) {
        this.f57839a.lineTo(f, f2);
    }

    /* JADX INFO: renamed from: f */
    public final void m19989f(float f, float f2) {
        this.f57839a.moveTo(f, f2);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19990g(C3500qj c3500qj, C3500qj c3500qj2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(c3500qj instanceof C3500qj)) {
            C3386nv.m17636w("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = c3500qj.f57839a;
        if (c3500qj2 instanceof C3500qj) {
            return this.f57839a.op(path, c3500qj2.f57839a, op);
        }
        C3386nv.m17636w("Unable to obtain android.graphics.Path");
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m19991h() {
        this.f57839a.reset();
    }

    /* JADX INFO: renamed from: i */
    public final void m19992i() {
        this.f57839a.rewind();
    }

    /* JADX INFO: renamed from: j */
    public final void m19993j(int i) {
        this.f57839a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    /* JADX INFO: renamed from: k */
    public final void m19994k(long j) {
        Matrix matrix = this.f57842d;
        if (matrix == null) {
            this.f57842d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.f57842d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.f57842d;
        matrix3.getClass();
        this.f57839a.transform(matrix3);
    }
}
