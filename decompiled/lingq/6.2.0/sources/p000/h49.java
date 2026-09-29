package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class h49 extends j49 {

    /* JADX INFO: renamed from: h */
    public static final RectF f41786h = new RectF();

    /* JADX INFO: renamed from: b */
    public final float f41787b;

    /* JADX INFO: renamed from: c */
    public final float f41788c;

    /* JADX INFO: renamed from: d */
    public final float f41789d;

    /* JADX INFO: renamed from: e */
    public final float f41790e;

    /* JADX INFO: renamed from: f */
    public float f41791f;

    /* JADX INFO: renamed from: g */
    public float f41792g;

    public h49(float f, float f2, float f3, float f4) {
        this.f41787b = f;
        this.f41788c = f2;
        this.f41789d = f3;
        this.f41790e = f4;
    }

    /* JADX INFO: renamed from: b */
    public static void m13044b(h49 h49Var, float f) {
        h49Var.f41791f = f;
    }

    /* JADX INFO: renamed from: c */
    public static void m13045c(h49 h49Var, float f) {
        h49Var.f41792g = f;
    }

    @Override // p000.j49
    /* JADX INFO: renamed from: a */
    public final void mo13046a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f45047a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f41789d;
        float f2 = this.f41790e;
        RectF rectF = f41786h;
        rectF.set(this.f41787b, this.f41788c, f, f2);
        path.arcTo(rectF, this.f41791f, this.f41792g, false);
        path.transform(matrix);
    }
}
