package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gaj extends kfv {

    /* JADX INFO: renamed from: a */
    private final kbg f24028a;

    public gaj(kbg kbgVar) {
        this.f24028a = kbgVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        Face[] faceArr = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) kppVar.mo9517d(CaptureResult.SCALER_CROP_REGION);
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION);
        if (faceArr == null || rect == null || l == null) {
            return;
        }
        this.f24028a.mo3415bf(new igp(faceArr, rect, l.longValue()));
    }
}
