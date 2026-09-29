package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j57 extends lj4 {

    /* JADX INFO: renamed from: i */
    public final PointF f45091i;

    /* JADX INFO: renamed from: j */
    public final float[] f45092j;

    /* JADX INFO: renamed from: k */
    public final float[] f45093k;

    /* JADX INFO: renamed from: l */
    public final PathMeasure f45094l;

    /* JADX INFO: renamed from: m */
    public i57 f45095m;

    public j57(ArrayList arrayList) {
        super(arrayList);
        this.f45091i = new PointF();
        this.f45092j = new float[2];
        this.f45093k = new float[2];
        this.f45094l = new PathMeasure();
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: g */
    public final Object mo3293g(kj4 kj4Var, float f) {
        float f2;
        i57 i57Var = (i57) kj4Var;
        Path path = i57Var.f43546q;
        p33 p33Var = this.f50800e;
        if (p33Var == null || kj4Var.f47384h == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) p33Var.m18870N(i57Var.f47383g, i57Var.f47384h.floatValue(), (PointF) i57Var.f47378b, (PointF) i57Var.f47379c, m16691e(), f2, this.f50799d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) kj4Var.f47378b;
        }
        i57 i57Var2 = this.f45095m;
        PathMeasure pathMeasure = this.f45094l;
        if (i57Var2 != i57Var) {
            pathMeasure.setPath(path, false);
            this.f45095m = i57Var;
        }
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.f45092j;
        float[] fArr2 = this.f45093k;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        float f4 = fArr[0];
        float f5 = fArr[1];
        PointF pointF2 = this.f45091i;
        pointF2.set(f4, f5);
        if (f3 < 0.0f) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 > length) {
            float f6 = f3 - length;
            pointF2.offset(fArr2[0] * f6, fArr2[1] * f6);
        }
        return pointF2;
    }
}
