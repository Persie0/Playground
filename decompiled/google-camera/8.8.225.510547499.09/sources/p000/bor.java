package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bor {

    /* JADX INFO: renamed from: a */
    public final Map f4024a;

    /* JADX INFO: renamed from: b */
    public long f4025b;

    public bor() {
        this.f4024a = new HashMap();
        this.f4025b = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final CaptureRequest m2820a(CameraDevice cameraDevice, int i, Surface... surfaceArr) throws CameraAccessException {
        if (cameraDevice == null) {
            throw new NullPointerException("Tried to create request using null CameraDevice");
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        for (CaptureRequest.Key key : this.f4024a.keySet()) {
            Object objM2821b = m2821b(key);
            if (objM2821b != null) {
                builderCreateCaptureRequest.set(key, objM2821b);
            }
        }
        for (int i2 = 0; i2 <= 0; i2++) {
            Surface surface = surfaceArr[i2];
            if (surface == null) {
                throw new NullPointerException("Tried to add null Surface as request target");
            }
            builderCreateCaptureRequest.addTarget(surface);
        }
        return builderCreateCaptureRequest.build();
    }

    /* JADX INFO: renamed from: b */
    public final Object m2821b(CaptureRequest.Key key) {
        if (key != null) {
            return this.f4024a.get(key);
        }
        throw new NullPointerException("Received a null key");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2822c(CaptureRequest.Key key, Object obj) {
        return Objects.equals(m2821b(key), obj);
    }

    /* JADX INFO: renamed from: d */
    public final void m2823d(CaptureRequest.Key key, Object obj) {
        if (key == null) {
            throw new NullPointerException("Received a null key");
        }
        Object objM2821b = m2821b(key);
        if (this.f4024a.containsKey(key) && Objects.equals(obj, objM2821b)) {
            return;
        }
        this.f4024a.put(key, obj);
        this.f4025b++;
    }

    public bor(bor borVar) {
        if (borVar == null) {
            throw new NullPointerException("Tried to copy null Camera2RequestSettingsSet");
        }
        this.f4024a = new HashMap(borVar.f4024a);
        this.f4025b = borVar.f4025b;
    }
}
