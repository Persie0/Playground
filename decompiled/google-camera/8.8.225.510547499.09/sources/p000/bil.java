package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bil extends bij {

    /* JADX INFO: renamed from: e */
    private final PointF f3416e;

    /* JADX INFO: renamed from: f */
    private final float[] f3417f;

    /* JADX INFO: renamed from: g */
    private final PathMeasure f3418g;

    /* JADX INFO: renamed from: h */
    private bik f3419h;

    public bil(List list) {
        super(list);
        this.f3416e = new PointF();
        this.f3417f = new float[2];
        this.f3418g = new PathMeasure();
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo2493f(bmf bmfVar, float f) {
        bik bikVar = (bik) bmfVar;
        Path path = bikVar.f3414a;
        if (path == null) {
            return (PointF) bmfVar.f3759b;
        }
        bko bkoVar = this.f3408d;
        if (bkoVar != null) {
            float f2 = bikVar.f3764g;
            bikVar.f3765h.floatValue();
            m2490c();
            return (PointF) bkoVar.f3652a;
        }
        if (this.f3419h != bikVar) {
            this.f3418g.setPath(path, false);
            this.f3419h = bikVar;
        }
        PathMeasure pathMeasure = this.f3418g;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f3417f, null);
        PointF pointF = this.f3416e;
        float[] fArr = this.f3417f;
        pointF.set(fArr[0], fArr[1]);
        return this.f3416e;
    }
}
