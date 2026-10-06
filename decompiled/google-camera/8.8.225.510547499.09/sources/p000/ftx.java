package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftx implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f23560a;

    public ftx(int i) {
        this.f23560a = i;
    }

    /* JADX INFO: renamed from: a */
    public static Executor m8795a() {
        ExecutorService executorServiceM13824l = jzn.m13824l("DynamicSensorOrientationExecutor");
        executorServiceM13824l.getClass();
        return executorServiceM13824l;
    }

    /* JADX INFO: renamed from: b */
    public static ExecutorService m8796b() {
        ExecutorService executorServiceM13821i = jzn.m13821i("CameraEx");
        executorServiceM13821i.getClass();
        return executorServiceM13821i;
    }

    /* JADX INFO: renamed from: c */
    public static final fys m8797c() {
        return new fys();
    }

    /* JADX INFO: renamed from: d */
    public static ftx m8798d(oju ojuVar) {
        return new ftx(17);
    }

    /* JADX INFO: renamed from: e */
    public static ggi m8799e() {
        return new ggi();
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f23560a) {
            case 0:
                return new jwf(ftv.IDLE);
            case 1:
                return new ftt();
            case 2:
                return m8795a();
            case 3:
                return new jwf(90);
            case 4:
                return new drj();
            case 5:
                return new bkn((short[]) null, (byte[]) null);
            case 6:
                MeteringRectangle[] meteringRectangleArr = fuv.f23610a;
                return new jwf(fuu.f23609a);
            case 7:
                return new gtd((byte[]) null);
            case 8:
                return new fuz();
            case 9:
                return m8799e();
            case 10:
                return m8796b();
            case 11:
                return jwr.m13637g(1);
            case 12:
                return fxo.m8928b(CaptureRequest.JPEG_QUALITY, (byte) 95);
            case 13:
                return fxo.m8928b(CaptureRequest.NOISE_REDUCTION_MODE, 1);
            case 14:
                return fxo.m8928b(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            case 15:
                return new fwo();
            case 16:
                return new fxe();
            case 17:
                return m8797c();
            case 18:
                return new gaa();
            case 19:
                return new jvb();
            default:
                return nqf.m17621g();
        }
    }
}
