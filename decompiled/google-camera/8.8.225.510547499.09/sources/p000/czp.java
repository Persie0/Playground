package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czp {

    /* JADX INFO: renamed from: d */
    private static final nbh f10123d = nbh.m17259h("com/google/android/apps/camera/camcorder/topshot/FrameServerQualityScoreProcessor");

    /* JADX INFO: renamed from: a */
    public final jvb f10124a;

    /* JADX INFO: renamed from: b */
    public final Object f10125b = new Object();

    /* JADX INFO: renamed from: c */
    public ExecutorService f10126c;

    /* JADX INFO: renamed from: e */
    private final kfk f10127e;

    /* JADX INFO: renamed from: f */
    private final cem f10128f;

    /* JADX INFO: renamed from: g */
    private final kgi f10129g;

    /* JADX INFO: renamed from: h */
    private final gtc f10130h;

    /* JADX INFO: renamed from: i */
    private final gtl f10131i;

    /* JADX INFO: renamed from: j */
    private final imu f10132j;

    public czp(kfk kfkVar, cem cemVar, kgi kgiVar, gtc gtcVar, gtl gtlVar, imu imuVar, jvb jvbVar) {
        this.f10127e = kfkVar;
        this.f10128f = cemVar;
        this.f10129g = kgiVar;
        this.f10130h = gtcVar;
        this.f10131i = gtlVar;
        this.f10132j = imuVar;
        this.f10124a = jvbVar;
    }

    /* JADX INFO: renamed from: a */
    final synchronized kba m5740a() {
        kfc kfcVarMo14131r;
        kgg kggVarMo14137b = this.f10127e.mo14116c().mo14137b(this.f10129g);
        kfcVarMo14131r = this.f10127e.mo14131r(this.f10127e.mo14132s(kggVarMo14137b), 2);
        kfcVarMo14131r.mo9411k(new ctr(this, kggVarMo14137b, 2));
        return new cft(kfcVarMo14131r, 18);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX INFO: renamed from: b */
    public final synchronized void m5741b(key keyVar, kgg kggVar) {
        String str;
        kpl kplVar;
        kpl kplVar2;
        try {
            kpw kpwVarMo7043d = keyVar.mo7043d(kggVar);
            try {
                kpp kppVarMo7042c = keyVar.mo7042c();
                if (kpwVarMo7043d == null) {
                    ((nbe) ((nbe) f10123d.m17252c()).mo17276G(785)).mo17293r("Image from frame %s null", keyVar);
                } else if (kppVarMo7042c == null) {
                    ((nbe) ((nbe) f10123d.m17252c()).mo17276G(784)).mo17293r("Result from frame %s null", keyVar);
                    kpwVarMo7043d.close();
                } else {
                    kay kayVarM3566d = this.f10128f.m3566d();
                    String str2 = (String) kppVarMo7042c.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                    Rect rect = null;
                    if (str2 != null) {
                        Map mapMo9520g = kppVarMo7042c.mo9520g();
                        if (mapMo9520g.isEmpty()) {
                            str = str2;
                            kplVar = kppVarMo7042c;
                        } else {
                            if (mapMo9520g.containsKey(str2)) {
                                kplVar2 = (kpl) mapMo9520g.get(str2);
                            } else {
                                Map.Entry entry = (Map.Entry) ((mwx) mapMo9520g).entrySet().iterator().next();
                                str2 = (String) entry.getKey();
                                kplVar2 = (kpl) entry.getValue();
                            }
                            rect = (Rect) kplVar2.mo9517d(CaptureResult.SCALER_CROP_REGION);
                            str = str2;
                            kplVar = kplVar2;
                        }
                    } else {
                        str = str2;
                        kplVar = kppVarMo7042c;
                    }
                    Rect rect2 = (Rect) this.f10132j.m11486a(str).mo14559l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    this.f10131i.m9762f(this.f10130h.m9732a(kpwVarMo7043d, new gsr(kplVar, kayVarM3566d.f35503e, rect2, str, rect == null ? rect2 : rect)));
                    kpwVarMo7043d.close();
                }
                keyVar.close();
            } catch (Throwable th) {
                if (kpwVarMo7043d != null) {
                    try {
                        kpwVarMo7043d.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception e) {
                        }
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            keyVar.close();
            throw th3;
        }
    }
}
