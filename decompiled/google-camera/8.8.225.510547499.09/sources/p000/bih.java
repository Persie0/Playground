package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bih extends bij {

    /* JADX INFO: renamed from: e */
    private final dsx f3413e;

    public bih(List list) {
        super(list);
        dsx dsxVar = (dsx) ((bmf) list.get(0)).f3759b;
        int iM6685I = dsxVar != null ? dsxVar.m6685I() : 0;
        this.f3413e = new dsx(new float[iM6685I], new int[iM6685I]);
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo2493f(bmf bmfVar, float f) {
        dsx dsxVar = this.f3413e;
        dsx dsxVar2 = (dsx) bmfVar.f3759b;
        dsx dsxVar3 = (dsx) bmfVar.f3760c;
        int length = ((int[]) dsxVar2.f12522b).length;
        int length2 = ((int[]) dsxVar3.f12522b).length;
        if (length != length2) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + length + " vs " + length2 + ")");
        }
        for (int i = 0; i < ((int[]) dsxVar2.f12522b).length; i++) {
            Object obj = dsxVar.f12521a;
            float f2 = ((float[]) dsxVar2.f12521a)[i];
            float f3 = ((float[]) dsxVar3.f12521a)[i];
            PointF pointF = blz.f3737a;
            ((float[]) obj)[i] = f2 + ((f3 - f2) * f);
            ((int[]) dsxVar.f12522b)[i] = bzq.m3236I(f, ((int[]) dsxVar2.f12522b)[i], ((int[]) dsxVar3.f12522b)[i]);
        }
        return this.f3413e;
    }
}
