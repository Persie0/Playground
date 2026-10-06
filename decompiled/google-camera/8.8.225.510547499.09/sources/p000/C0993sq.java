package p000;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: sq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0993sq {
    /* JADX INFO: renamed from: a */
    public static final int m19406a(Context context, String str) {
        context.getClass();
        str.getClass();
        return context.checkSelfPermission(str);
    }

    /* JADX INFO: renamed from: b */
    public static final CaptureRequest.Builder m19407b(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
        cameraDevice.getClass();
        totalCaptureResult.getClass();
        CaptureRequest.Builder builderCreateReprocessCaptureRequest = cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        builderCreateReprocessCaptureRequest.getClass();
        return builderCreateReprocessCaptureRequest;
    }

    /* JADX INFO: renamed from: c */
    public static final InputConfiguration m19408c(int i, int i2, int i3) {
        return new InputConfiguration(i, i2, i3);
    }

    /* JADX INFO: renamed from: d */
    public static final Surface m19409d(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        return cameraCaptureSession.getInputSurface();
    }

    /* JADX INFO: renamed from: e */
    public static final void m19410e(CameraDevice cameraDevice, List list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        cameraDevice.getClass();
        list.getClass();
        stateCallback.getClass();
        cameraDevice.createConstrainedHighSpeedCaptureSession(list, stateCallback, handler);
    }

    /* JADX INFO: renamed from: f */
    public static final void m19411f(CameraDevice cameraDevice, InputConfiguration inputConfiguration, List list, CameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        cameraDevice.getClass();
        inputConfiguration.getClass();
        list.getClass();
        stateCallback.getClass();
        cameraDevice.createReprocessableCaptureSession(inputConfiguration, list, stateCallback, handler);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m19412g(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        return cameraCaptureSession.isReprocessable();
    }

    /* JADX INFO: renamed from: h */
    public static C1173zh m19413h(C1152yn c1152yn, int i, ArrayList arrayList, C1173zh c1173zh) {
        int i2;
        int i3 = i == 0 ? c1152yn.f48227ap : c1152yn.f48228aq;
        if (i3 != -1 && (c1173zh == null || i3 != c1173zh.f48337c)) {
            int i4 = 0;
            while (i4 < arrayList.size()) {
                C1173zh c1173zh2 = (C1173zh) arrayList.get(i4);
                if (c1173zh2.f48337c == i3) {
                    if (c1173zh != null) {
                        c1173zh.m19780c(i, c1173zh2);
                        arrayList.remove(c1173zh);
                    }
                    c1173zh = c1173zh2;
                    break;
                }
                i4++;
            }
        } else if (i3 != -1) {
            return c1173zh;
        }
        if (c1173zh == null) {
            if (c1152yn instanceof C1156yr) {
                C1156yr c1156yr = (C1156yr) c1152yn;
                int i5 = 0;
                while (true) {
                    if (i5 >= c1156yr.f48282at) {
                        i2 = -1;
                        break;
                    }
                    C1152yn c1152yn2 = c1156yr.f48281as[i5];
                    if (i == 0) {
                        i2 = c1152yn2.f48227ap;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = c1152yn2.f48228aq;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        C1173zh c1173zh3 = (C1173zh) arrayList.get(i6);
                        if (c1173zh3.f48337c == i2) {
                            c1173zh = c1173zh3;
                            break;
                        }
                    }
                }
            }
            if (c1173zh == null) {
                c1173zh = new C1173zh(i);
            }
            arrayList.add(c1173zh);
        }
        if (c1173zh.m19781d(c1152yn)) {
            if (c1152yn instanceof C1155yq) {
                C1155yq c1155yq = (C1155yq) c1152yn;
                c1155yq.f48280d.m19652c(c1155yq.f48276as == 0 ? 1 : 0, arrayList, c1173zh);
            }
            if (i == 0) {
                c1152yn.f48227ap = c1173zh.f48337c;
                c1152yn.f48195K.m19652c(0, arrayList, c1173zh);
                c1152yn.f48197M.m19652c(0, arrayList, c1173zh);
            } else {
                c1152yn.f48228aq = c1173zh.f48337c;
                c1152yn.f48196L.m19652c(1, arrayList, c1173zh);
                c1152yn.f48199O.m19652c(1, arrayList, c1173zh);
                c1152yn.f48198N.m19652c(1, arrayList, c1173zh);
            }
            c1152yn.f48202R.m19652c(i, arrayList, c1173zh);
        }
        return c1173zh;
    }

    /* JADX INFO: renamed from: i */
    public static C1173zh m19414i(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1173zh c1173zh = (C1173zh) arrayList.get(i2);
            if (i == c1173zh.f48337c) {
                return c1173zh;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m19415j(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
