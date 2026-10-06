package p000;

import android.graphics.PointF;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdg extends iqc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nps f27315a;

    public hdg(nps npsVar) {
        this.f27315a = npsVar;
    }

    @Override // p000.iqd
    /* JADX INFO: renamed from: a */
    public final boolean mo3470a(PointF pointF) {
        hdk hdkVar = (hdk) jvh.m13560h(this.f27315a);
        if (hdkVar == null) {
            return false;
        }
        jvd.m13538a();
        float[] fArr = {pointF.x, pointF.y};
        hdkVar.f27336l.mapPoints(fArr);
        hdkVar.m10122h(new hdb(fArr, 2));
        hdkVar.f27346v = Math.max(hdkVar.f27346v, SystemClock.elapsedRealtime() + 1000);
        return false;
    }
}
