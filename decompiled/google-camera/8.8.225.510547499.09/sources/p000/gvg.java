package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvg implements gvh {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f26491a;

    public gvg(int i) {
        this.f26491a = i;
    }

    @Override // p000.gvh
    /* JADX INFO: renamed from: a */
    public final float mo9790a(kpp kppVar) {
        switch (this.f26491a) {
            case 0:
                Integer num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    return Float.NaN;
                }
                return (num.intValue() == 4 || num.intValue() == 2) ? 1.0f : 0.0f;
            case 1:
                Integer num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE);
                if (num2 == null) {
                    return Float.NaN;
                }
                return (num2.intValue() == 2 || num2.intValue() == 3) ? 1.0f : 0.0f;
            case 2:
                Integer num3 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE);
                if (num3 == null) {
                    return Float.NaN;
                }
                return (num3.intValue() == 2 || num3.intValue() == 3) ? 1.0f : 0.0f;
            case 3:
                Face[] faceArr = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
                if (faceArr != null) {
                    return faceArr.length;
                }
                return Float.NaN;
            default:
                Integer num4 = (Integer) kppVar.mo9517d(CaptureResult.LENS_STATE);
                return (num4 == null || num4.intValue() == 0) ? 1.0f : 0.0f;
        }
    }
}
