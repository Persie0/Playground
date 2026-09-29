package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class i57 extends kj4 {

    /* JADX INFO: renamed from: q */
    public Path f43546q;

    /* JADX INFO: renamed from: r */
    public final kj4 f43547r;

    public i57(gl5 gl5Var, kj4 kj4Var) {
        super(gl5Var, (PointF) kj4Var.f47378b, (PointF) kj4Var.f47379c, kj4Var.f47380d, kj4Var.f47381e, kj4Var.f47382f, kj4Var.f47383g, kj4Var.f47384h);
        this.f43547r = kj4Var;
        m13667d();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: d */
    public final void m13667d() {
        boolean z;
        Object obj;
        Object obj2 = this.f47379c;
        Object obj3 = this.f47378b;
        if (obj2 == null || obj3 == null) {
            z = false;
        } else {
            PointF pointF = (PointF) obj2;
            if (((PointF) obj3).equals(pointF.x, pointF.y)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (obj3 == null || (obj = this.f47379c) == null || z) {
            return;
        }
        PointF pointF2 = (PointF) obj3;
        PointF pointF3 = (PointF) obj;
        kj4 kj4Var = this.f43547r;
        PointF pointF4 = kj4Var.f47391o;
        PointF pointF5 = kj4Var.f47392p;
        Matrix matrix = fna.f39347a;
        Path path = new Path();
        path.moveTo(pointF2.x, pointF2.y);
        if (pointF4 == null || pointF5 == null || (pointF4.length() == 0.0f && pointF5.length() == 0.0f)) {
            path.lineTo(pointF3.x, pointF3.y);
        } else {
            float f = pointF4.x + pointF2.x;
            float f2 = pointF2.y + pointF4.y;
            float f3 = pointF3.x;
            float f4 = f3 + pointF5.x;
            float f5 = pointF3.y;
            path.cubicTo(f, f2, f4, f5 + pointF5.y, f3, f5);
        }
        this.f43546q = path;
    }
}
