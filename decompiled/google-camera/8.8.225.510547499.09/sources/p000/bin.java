package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bin extends bij {

    /* JADX INFO: renamed from: e */
    private final bmg f3421e;

    public bin(List list) {
        super(list);
        this.f3421e = new bmg();
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo2493f(bmf bmfVar, float f) {
        Object obj;
        Object obj2 = bmfVar.f3759b;
        if (obj2 == null || (obj = bmfVar.f3760c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bmg bmgVar = (bmg) obj2;
        bmg bmgVar2 = (bmg) obj;
        bko bkoVar = this.f3408d;
        if (bkoVar != null) {
            float f2 = bmfVar.f3764g;
            bmfVar.f3765h.floatValue();
            m2490c();
            return (bmg) bkoVar.f3652a;
        }
        bmg bmgVar3 = this.f3421e;
        float f3 = bmgVar.f3774a;
        float f4 = bmgVar2.f3774a;
        PointF pointF = blz.f3737a;
        float f5 = bmgVar.f3775b;
        float f6 = f5 + (f * (bmgVar2.f3775b - f5));
        bmgVar3.f3774a = f3 + ((f4 - f3) * f);
        bmgVar3.f3775b = f6;
        return this.f3421e;
    }
}
