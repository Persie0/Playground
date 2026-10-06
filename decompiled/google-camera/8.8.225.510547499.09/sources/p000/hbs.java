package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hbs {

    /* JADX INFO: renamed from: a */
    public static final nbh f27164a = nbh.m17259h("com/google/android/apps/camera/sideline/SidelineCameraAvailabilityChecker");

    /* JADX INFO: renamed from: b */
    public final CameraManager f27165b;

    /* JADX INFO: renamed from: c */
    public final Executor f27166c;

    /* JADX INFO: renamed from: d */
    private final ScheduledExecutorService f27167d;

    public hbs(CameraManager cameraManager, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f27165b = cameraManager;
        this.f27166c = executor;
        this.f27167d = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final nps m10092a() {
        try {
            String[] cameraIdList = this.f27165b.getCameraIdList();
            if (cameraIdList == null || cameraIdList.length == 0) {
                return kxk.m14965K(true);
            }
            hbr hbrVar = new hbr(cameraIdList, this.f27167d);
            nps npsVarM19342b = C0930qh.m19342b(new kuf(this, hbrVar, 1));
            npsVarM19342b.mo2282d(new gqn(this, hbrVar, 16), this.f27166c);
            return nnj.m17523i(kxk.m14972R(npsVarM19342b, 60000L, TimeUnit.MILLISECONDS, this.f27167d), TimeoutException.class, new fod(17), this.f27166c);
        } catch (CameraAccessException e) {
            return kxk.m14965K(true);
        }
    }
}
