package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bif extends bij {
    public bif(List list) {
        super(list);
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo2493f(bmf bmfVar, float f) {
        return Integer.valueOf(m2499l(bmfVar, f));
    }

    /* JADX INFO: renamed from: k */
    public final int m2498k() {
        return m2499l(m2491d(), m2489b());
    }

    /* JADX INFO: renamed from: l */
    public final int m2499l(bmf bmfVar, float f) {
        Object obj = bmfVar.f3759b;
        if (obj == null || bmfVar.f3760c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) bmfVar.f3760c).intValue();
        bko bkoVar = this.f3408d;
        if (bkoVar == null) {
            return bzq.m3236I(blz.m2693a(f, 0.0f, 1.0f), iIntValue, iIntValue2);
        }
        float f2 = bmfVar.f3764g;
        bmfVar.f3765h.floatValue();
        m2490c();
        return ((Integer) bkoVar.f3652a).intValue();
    }
}
