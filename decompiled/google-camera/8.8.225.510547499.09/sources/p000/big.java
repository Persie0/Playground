package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class big extends bij {
    public big(List list) {
        super(list);
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo2493f(bmf bmfVar, float f) {
        return Float.valueOf(m2501l(bmfVar, f));
    }

    /* JADX INFO: renamed from: k */
    public final float m2500k() {
        return m2501l(m2491d(), m2489b());
    }

    /* JADX INFO: renamed from: l */
    final float m2501l(bmf bmfVar, float f) {
        Object obj = bmfVar.f3759b;
        if (obj == null || bmfVar.f3760c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bko bkoVar = this.f3408d;
        if (bkoVar != null) {
            float f2 = bmfVar.f3764g;
            bmfVar.f3765h.floatValue();
            m2490c();
            return ((Float) bkoVar.f3652a).floatValue();
        }
        float fFloatValue = bmfVar.f3766i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj).floatValue();
            bmfVar.f3766i = fFloatValue;
        }
        float fFloatValue2 = bmfVar.f3767j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) bmfVar.f3760c).floatValue();
            bmfVar.f3767j = fFloatValue2;
        }
        PointF pointF = blz.f3737a;
        return fFloatValue + (f * (fFloatValue2 - fFloatValue));
    }
}
