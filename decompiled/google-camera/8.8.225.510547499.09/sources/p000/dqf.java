package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqf implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f12297a;

    public dqf(int i) {
        this.f12297a = i;
    }

    /* JADX INFO: renamed from: a */
    public static kth m6589a() {
        return new kth();
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f12297a) {
            case 0:
                return new jvi(jzn.m13821i("FaceBeau"));
            case 1:
                return new jwf(dot.SINGLE);
            case 2:
                return dnr.m6443b();
            case 3:
                return new jvi(jzn.m13824l("GpuFaceBeau"));
            case 4:
                ExecutorService executorServiceM13824l = jzn.m13824l("VsprAtvClbck");
                executorServiceM13824l.getClass();
                return executorServiceM13824l;
            case 5:
                return new jvi(jzn.m13821i("FaceDeblur"));
            case 6:
                return dnr.m6445d();
            case 7:
                drw drwVar = drw.ALL;
                drwVar.getClass();
                return drwVar;
            case 8:
                return dyv.m6943f();
            case 9:
                return new jvi(jzn.m13824l("GpuFaceObfus"));
            case 10:
                return m6589a();
            case 11:
                return dtj.m6731b("feature.acmi.camera.ae-stability");
            case 12:
                return dtj.m6731b("feature.acmi.camera.af-stability");
            case 13:
                return dtj.m6731b("feature.acmi.camera.awb-stability");
            case 14:
                return dtj.m6731b("feature.acmi.camera.face-count");
            case 15:
                return dtj.m6731b("feature.acmi.camera.lens-stability");
            case 16:
                return dtj.m6731b("feature.acmi.imu.frame-gyro");
            case 17:
                return dtj.m6731b("feature.acmi.imu.sensor-accelerometer");
            case 18:
                return dtj.m6731b("feature.acmi.image.aesthetic");
            case 19:
                return dtj.m6731b("feature.acmi.image.face-familiarity");
            default:
                return dtj.m6731b(EArqVBjecl.xenBHRcAn);
        }
    }
}
