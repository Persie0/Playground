package p000;

import android.hardware.camera2.CaptureResult;
import java.util.Map;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class glw extends kfv {

    /* JADX INFO: renamed from: a */
    private final kme f25563a;

    /* JADX INFO: renamed from: b */
    private final kmd f25564b;

    /* JADX INFO: renamed from: c */
    private final imu f25565c;

    /* JADX INFO: renamed from: d */
    private final glu f25566d;

    public glw(kme kmeVar, kmd kmdVar, imu imuVar, glu gluVar) {
        this.f25563a = kmeVar;
        this.f25564b = kmdVar;
        this.f25565c = imuVar;
        this.f25566d = gluVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final synchronized void mo3408bu(kpp kppVar) {
        int length;
        float f;
        kmg kmgVarMo13857d;
        if (ivu.f32373a == null) {
            return;
        }
        float[] fArr = (float[]) kppVar.mo9517d(ivu.f32373a);
        if (fArr != null && (length = fArr.length) >= 13) {
            float f2 = fArr[11];
            float f3 = fArr[12];
            if (length > 16) {
                f = fArr[16];
            } else {
                f = length > 15 ? fArr[15] : 0.0f;
            }
            kmd kmdVarM11486a = this.f25564b;
            Map mapMo9520g = kppVar.mo9520g();
            if (((mzw) mapMo9520g).f41872c == 1) {
                String strMo9518e = ((kpl) Collection$EL.stream(((mwx) mapMo9520g).values()).findFirst().get()).mo9518e();
                if (strMo9518e != null && (kmgVarMo13857d = this.f25563a.mo13857d(strMo9518e)) != null) {
                    kmdVarM11486a = this.f25563a.mo13854a(kmgVarMo13857d);
                }
            } else {
                kmdVarM11486a = this.f25565c.m11486a((String) kppVar.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID));
            }
            this.f25566d.m9466j(kmdVarM11486a, f2, f3, f);
        }
    }
}
