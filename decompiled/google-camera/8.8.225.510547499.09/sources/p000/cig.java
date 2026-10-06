package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cig implements cid {

    /* JADX INFO: renamed from: a */
    private final oju f5788a;

    /* JADX INFO: renamed from: b */
    private final oju f5789b;

    public cig(oju ojuVar, oju ojuVar2) {
        this.f5788a = ojuVar2;
        this.f5789b = ojuVar;
    }

    @Override // p000.cid
    /* JADX INFO: renamed from: a */
    public final void mo3797a(Throwable th) {
        ihk ihkVar = (ihk) this.f5788a.get();
        int iM11344l = ihkVar != null ? ihkVar.m11344l() : 0;
        if (th instanceof kmm) {
            fcp fcpVar = (fcp) this.f5789b.get();
            int i = mws.f41739d;
            mws mwsVar = mzr.f41857a;
            fcpVar.mo8147V(12, null, th, -1, -1, iM11344l, mwsVar, mwsVar, kcl.CAMERAS_NOT_ENUMERATED, false);
            return;
        }
        if (!(th instanceof kml)) {
            ((fcp) this.f5789b.get()).mo8129D(th, iM11344l);
            return;
        }
        kml kmlVar = (kml) th;
        ArrayList arrayList = new ArrayList();
        fcp fcpVar2 = (fcp) this.f5789b.get();
        Throwable cause = th.getCause();
        int i2 = mws.f41739d;
        fcpVar2.mo8147V(11, null, cause, -1, -1, iM11344l, mzr.f41857a, arrayList, kcl.m13979a(kmlVar.f36546a), false);
    }
}
