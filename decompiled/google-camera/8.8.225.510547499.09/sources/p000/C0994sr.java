package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: sr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0994sr {
    public C0994sr(C1152yn c1152yn) {
        new WeakReference(c1152yn);
        C1141yc.m19615o(c1152yn.f48195K);
        C1141yc.m19615o(c1152yn.f48196L);
        C1141yc.m19615o(c1152yn.f48197M);
        C1141yc.m19615o(c1152yn.f48198N);
        C1141yc.m19615o(c1152yn.f48199O);
    }

    /* JADX INFO: renamed from: a */
    public static final int m19416a(OutputConfiguration outputConfiguration) {
        outputConfiguration.getClass();
        return outputConfiguration.getSurfaceGroupId();
    }

    /* JADX INFO: renamed from: b */
    public static final void m19417b(CameraDevice cameraDevice, List list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        cameraDevice.getClass();
        list.getClass();
        stateCallback.getClass();
        cameraDevice.createCaptureSessionByOutputConfigurations(list, stateCallback, handler);
    }

    /* JADX INFO: renamed from: c */
    public static final void m19418c(CameraDevice cameraDevice, InputConfiguration inputConfiguration, List list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        cameraDevice.getClass();
        inputConfiguration.getClass();
        list.getClass();
        stateCallback.getClass();
        cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, list, stateCallback, handler);
    }
}
