package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cuc extends kfv {

    /* JADX INFO: renamed from: a */
    private final cwi f9592a;

    public cuc(jyx jyxVar) {
        this.f9592a = new cwi(jyxVar);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        cwi cwiVar = this.f9592a;
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION);
        if (l != null) {
            if (cwh.FPS_30.m5679a(l.longValue())) {
                cwh cwhVar = cwiVar.f9878b;
                cwh cwhVar2 = cwh.FPS_30;
                if (cwhVar != cwhVar2) {
                    cwiVar.f9878b = cwhVar2;
                    cwiVar.f9877a.mo13758q(cwiVar.f9878b.f9874c);
                    return;
                }
            }
            if (cwh.f9872b.m5679a(l.longValue())) {
                cwh cwhVar3 = cwiVar.f9878b;
                cwh cwhVar4 = cwh.f9872b;
                if (cwhVar3 != cwhVar4) {
                    cwiVar.f9878b = cwhVar4;
                    cwiVar.f9877a.mo13758q(cwiVar.f9878b.f9874c);
                }
            }
        }
    }
}
