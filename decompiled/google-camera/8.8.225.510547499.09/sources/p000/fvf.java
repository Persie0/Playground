package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DeviceStateSensorOrientationMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvf {

    /* JADX INFO: renamed from: b */
    private static final nbh f23624b = nbh.m17259h("com/google/android/apps/camera/one/cameraavailability/CameraAvailabilityUtils");

    /* JADX INFO: renamed from: a */
    public mwx f23625a;

    public fvf(kme kmeVar) {
        this.f23625a = mzw.f41870a;
        kmg kmgVarMo13858e = kmeVar.mo13858e(kmq.f36557a);
        if (kmgVarMo13858e == null) {
            ((nbe) ((nbe) f23624b.m17252c()).mo17276G((char) 2502)).mo17290o("Front logical camera is null, skipping initialize.");
            return;
        }
        mwt mwtVarM17115i = mwx.m17115i();
        kmd kmdVarMo13854a = kmeVar.mo13854a(kmgVarMo13858e);
        DeviceStateSensorOrientationMap deviceStateSensorOrientationMap = (DeviceStateSensorOrientationMap) kmdVarMo13854a.mo14559l(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP);
        if (deviceStateSensorOrientationMap != null) {
            kmg kmgVarM8824a = m8824a(kmdVarMo13854a, kmeVar, deviceStateSensorOrientationMap.getSensorOrientation(0L));
            kmg kmgVarM8824a2 = m8824a(kmdVarMo13854a, kmeVar, deviceStateSensorOrientationMap.getSensorOrientation(4L));
            for (hye hyeVar : hye.values()) {
                if (hyeVar.equals(hye.CLOSED)) {
                    mwtVarM17115i.mo17110e(hyeVar, kmgVarM8824a2.f36540a);
                } else {
                    mwtVarM17115i.mo17110e(hyeVar, kmgVarM8824a.f36540a);
                }
            }
        }
        this.f23625a = mwtVarM17115i.mo17059b();
        ((nbe) ((nbe) f23624b.m17252c()).mo17276G(2501)).mo17293r("Building front camera id mapping: %s", this.f23625a);
    }

    /* JADX INFO: renamed from: a */
    private static final kmg m8824a(kmd kmdVar, kme kmeVar, int i) {
        kmc kmcVar = (kmc) kmdVar;
        kmg kmgVar = null;
        for (kmg kmgVar2 : kmcVar.f36526b) {
            if (kmeVar.mo13854a(kmgVar2).mo14553f() == i) {
                kmgVar = kmgVar2;
            }
        }
        return kmgVar == null ? kmcVar.f36525a : kmgVar;
    }
}
