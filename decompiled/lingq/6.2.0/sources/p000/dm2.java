package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class dm2 {

    /* JADX INFO: renamed from: a */
    public final x90 f35817a;

    /* JADX INFO: renamed from: b */
    public final Path f35818b;

    /* JADX INFO: renamed from: c */
    public final Path f35819c;

    /* JADX INFO: renamed from: d */
    public final PathMeasure f35820d;

    /* JADX INFO: renamed from: e */
    public final Matrix f35821e;

    public dm2(x90 x90Var) {
        Path path = new Path();
        this.f35818b = path;
        this.f35819c = new Path();
        this.f35820d = new PathMeasure(path, false);
        this.f35817a = x90Var;
        this.f35821e = new Matrix();
    }

    /* JADX INFO: renamed from: h */
    public static float m10464h(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo10465a(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    /* JADX INFO: renamed from: b */
    public abstract void mo10466b(int i, int i2, Canvas canvas, Paint paint);

    /* JADX INFO: renamed from: c */
    public abstract void mo10467c(Canvas canvas, Paint paint, bm2 bm2Var, int i);

    /* JADX INFO: renamed from: d */
    public abstract void mo10468d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    /* JADX INFO: renamed from: e */
    public abstract int mo10469e();

    /* JADX INFO: renamed from: f */
    public abstract int mo10470f();

    /* JADX INFO: renamed from: g */
    public abstract void mo10471g();
}
