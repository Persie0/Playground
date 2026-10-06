package p000;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dnk extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicBoolean f12099a;

    public dnk(AtomicBoolean atomicBoolean) {
        this.f12099a = atomicBoolean;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        this.f12099a.set(true);
    }
}
