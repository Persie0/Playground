package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bii extends bij {
    public bii(List list) {
        super(list);
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo2493f(bmf bmfVar, float f) {
        return Integer.valueOf(m2502k(bmfVar, f));
    }

    /* JADX INFO: renamed from: k */
    public final int m2502k(bmf bmfVar, float f) {
        Object obj = bmfVar.f3759b;
        if (obj == null || bmfVar.f3760c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        bko bkoVar = this.f3408d;
        if (bkoVar != null) {
            float f2 = bmfVar.f3764g;
            bmfVar.f3765h.floatValue();
            m2490c();
            return ((Integer) bkoVar.f3652a).intValue();
        }
        int iIntValue = bmfVar.f3768k;
        if (iIntValue == 784923401) {
            iIntValue = ((Integer) obj).intValue();
            bmfVar.f3768k = iIntValue;
        }
        int iIntValue2 = bmfVar.f3769l;
        if (iIntValue2 == 784923401) {
            iIntValue2 = ((Integer) bmfVar.f3760c).intValue();
            bmfVar.f3769l = iIntValue2;
        }
        PointF pointF = blz.f3737a;
        return (int) (iIntValue + (f * (iIntValue2 - iIntValue)));
    }
}
