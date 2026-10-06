package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.view.Surface;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: st */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0996st {
    /* JADX INFO: renamed from: a */
    public static final int m19428a(OutputConfiguration outputConfiguration) {
        outputConfiguration.getClass();
        return outputConfiguration.getMaxSharedSurfaceCount();
    }

    /* JADX INFO: renamed from: b */
    public static final SessionConfiguration m19429b(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        list.getClass();
        executor.getClass();
        stateCallback.getClass();
        return new SessionConfiguration(i, list, executor, stateCallback);
    }

    /* JADX INFO: renamed from: c */
    public static final List m19430c(CameraCharacteristics cameraCharacteristics) {
        cameraCharacteristics.getClass();
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }

    /* JADX INFO: renamed from: d */
    public static final List m19431d(CameraCharacteristics cameraCharacteristics) {
        cameraCharacteristics.getClass();
        return cameraCharacteristics.getAvailableSessionKeys();
    }

    /* JADX INFO: renamed from: e */
    public static final Map m19432e(TotalCaptureResult totalCaptureResult) {
        totalCaptureResult.getClass();
        return totalCaptureResult.getPhysicalCameraResults();
    }

    /* JADX INFO: renamed from: f */
    public static final Set m19433f(CameraCharacteristics cameraCharacteristics) {
        cameraCharacteristics.getClass();
        Set<String> physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
        physicalCameraIds.getClass();
        return physicalCameraIds;
    }

    /* JADX INFO: renamed from: g */
    public static final void m19434g(CameraDevice cameraDevice, SessionConfiguration sessionConfiguration) throws CameraAccessException {
        cameraDevice.getClass();
        sessionConfiguration.getClass();
        cameraDevice.createCaptureSession(sessionConfiguration);
    }

    /* JADX INFO: renamed from: h */
    public static final void m19435h(CameraManager cameraManager, String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException {
        cameraManager.getClass();
        str.getClass();
        executor.getClass();
        stateCallback.getClass();
        cameraManager.openCamera(str, executor, stateCallback);
    }

    /* JADX INFO: renamed from: i */
    public static final void m19436i(CameraManager cameraManager, Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        cameraManager.getClass();
        executor.getClass();
        availabilityCallback.getClass();
        cameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    /* JADX INFO: renamed from: j */
    public static final void m19437j(OutputConfiguration outputConfiguration, Surface surface) {
        outputConfiguration.getClass();
        surface.getClass();
        outputConfiguration.removeSurface(surface);
    }

    /* JADX INFO: renamed from: k */
    public static final void m19438k(SessionConfiguration sessionConfiguration, InputConfiguration inputConfiguration) {
        sessionConfiguration.getClass();
        inputConfiguration.getClass();
        sessionConfiguration.setInputConfiguration(inputConfiguration);
    }

    /* JADX INFO: renamed from: l */
    public static final void m19439l(OutputConfiguration outputConfiguration, String str) {
        outputConfiguration.getClass();
        outputConfiguration.setPhysicalCameraId(str);
    }

    /* JADX INFO: renamed from: m */
    public static final void m19440m(SessionConfiguration sessionConfiguration, CaptureRequest captureRequest) {
        sessionConfiguration.getClass();
        captureRequest.getClass();
        sessionConfiguration.setSessionParameters(captureRequest);
    }
}
