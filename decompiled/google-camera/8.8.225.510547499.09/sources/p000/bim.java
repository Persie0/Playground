package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bim extends bij {

    /* JADX INFO: renamed from: e */
    private final PointF f3420e;

    public bim(List list) {
        super(list);
        this.f3420e = new PointF();
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo2493f(bmf bmfVar, float f) {
        return mo2497j(bmfVar, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000.bie
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF mo2497j(bmf bmfVar, float f, float f2) {
        Object obj;
        Object obj2 = bmfVar.f3759b;
        if (obj2 == null || (obj = bmfVar.f3760c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        bko bkoVar = this.f3408d;
        if (bkoVar == null) {
            this.f3420e.set(pointF.x + (f * (pointF2.x - pointF.x)), pointF.y + (f2 * (pointF2.y - pointF.y)));
            return this.f3420e;
        }
        float f3 = bmfVar.f3764g;
        bmfVar.f3765h.floatValue();
        m2490c();
        return (PointF) bkoVar.f3652a;
    }
}
