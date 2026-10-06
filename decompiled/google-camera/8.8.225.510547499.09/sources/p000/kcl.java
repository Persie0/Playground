package p000;

import android.hardware.camera2.CameraAccessException;
import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum kcl {
    CAMERA_OPEN_TIMEOUT(-12),
    CAMERAS_NOT_ENUMERATED(-11),
    CAMERA_SECURITY_EXCEPTION(-10),
    CAMERA_ID_NOT_VALID(-9),
    CAMERA_ACCESS_CAMERA_ERROR(-8),
    CAMERA_ACCESS_CAMERA_DISCONNECTED(-7),
    CAMERA_ACCESS_CAMERA_DISABLED(-6),
    CAMERA_ACCESS_MAX_CAMERAS_IN_USE(-5),
    CAMERA_ACCESS_CAMERA_IN_USE(-4),
    CAMERA_NO_WAKELOCK_ERROR_CODE(-3),
    CAMERA_DISCONNECTED_ERROR_CODE(-2),
    CAMERA_CLOSED_ERROR_CODE(-1),
    CAMERA_ERROR_CODE_UNKNOWN(0),
    CAMERA_DEVICE_ERROR_CAMERA_IN_USE(1),
    CAMERA_DEVICE_ERROR_MAX_CAMERAS_IN_USE(2),
    CAMERA_DEVICE_ERROR_CAMERA_DISABLED(3),
    CAMERA_DEVICE_ERROR_CAMERA_DEVICE(4),
    f35592r(5),
    CAMERA_CHARACTERISTICS_ILLEGAL_ARGUMENT(6);


    /* JADX INFO: renamed from: t */
    public static final mwx f35594t;

    /* JADX INFO: renamed from: v */
    private static final mwx f35595v;

    /* JADX INFO: renamed from: u */
    public final int f35597u;

    static {
        kcl kclVar = CAMERA_ACCESS_CAMERA_ERROR;
        kcl kclVar2 = CAMERA_ACCESS_CAMERA_DISCONNECTED;
        kcl kclVar3 = CAMERA_ACCESS_CAMERA_DISABLED;
        kcl kclVar4 = CAMERA_ACCESS_MAX_CAMERAS_IN_USE;
        kcl kclVar5 = CAMERA_ACCESS_CAMERA_IN_USE;
        kcl kclVar6 = CAMERA_DEVICE_ERROR_CAMERA_IN_USE;
        kcl kclVar7 = CAMERA_DEVICE_ERROR_MAX_CAMERAS_IN_USE;
        kcl kclVar8 = CAMERA_DEVICE_ERROR_CAMERA_DISABLED;
        kcl kclVar9 = CAMERA_DEVICE_ERROR_CAMERA_DEVICE;
        kcl kclVar10 = f35592r;
        mwt mwtVarM17115i = mwx.m17115i();
        mwtVarM17115i.mo17110e(4, kclVar5);
        mwtVarM17115i.mo17110e(5, kclVar4);
        mwtVarM17115i.mo17110e(1, kclVar3);
        mwtVarM17115i.mo17110e(2, kclVar2);
        mwtVarM17115i.mo17110e(3, kclVar);
        f35595v = mwtVarM17115i.mo17059b();
        mwt mwtVarM17115i2 = mwx.m17115i();
        mwtVarM17115i2.mo17110e(1, kclVar6);
        mwtVarM17115i2.mo17110e(2, kclVar7);
        mwtVarM17115i2.mo17110e(3, kclVar8);
        mwtVarM17115i2.mo17110e(4, kclVar9);
        mwtVarM17115i2.mo17110e(5, kclVar10);
        f35594t = mwtVarM17115i2.mo17059b();
    }

    kcl(int i) {
        this.f35597u = i;
    }

    /* JADX INFO: renamed from: a */
    public static kcl m13979a(int i) {
        kcl kclVar = (kcl) f35595v.get(Integer.valueOf(i));
        if (kclVar != null) {
            return kclVar;
        }
        throw new IllegalStateException("Unknown Camera Access error code");
    }

    /* JADX INFO: renamed from: b */
    public static kcl m13980b(kmh kmhVar) {
        Throwable th = kmhVar.f36544b;
        kcl kclVar = CAMERA_ERROR_CODE_UNKNOWN;
        if (th instanceof CameraAccessException) {
            return m13979a(((CameraAccessException) th).getReason());
        }
        return !(th instanceof IllegalArgumentException) ? kclVar : CAMERA_CHARACTERISTICS_ILLEGAL_ARGUMENT;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m13981d(kcl kclVar) {
        return kclVar.equals(CAMERAS_NOT_ENUMERATED) || kclVar.equals(CAMERA_ACCESS_CAMERA_ERROR) || kclVar.equals(CAMERA_CHARACTERISTICS_ILLEGAL_ARGUMENT);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m13982e(kcl kclVar) {
        return kclVar.equals(CAMERA_DEVICE_ERROR_CAMERA_DEVICE) || kclVar.equals(f35592r);
    }

    /* JADX INFO: renamed from: c */
    public final String m13983c() {
        switch (this) {
            case CAMERA_OPEN_TIMEOUT:
                return "Camera open timed out.";
            case CAMERAS_NOT_ENUMERATED:
                return "Unable to connect to any camera";
            case CAMERA_SECURITY_EXCEPTION:
                return "App does not have permission to access camera at the moment";
            case CAMERA_ID_NOT_VALID:
                return "Camera id no longer valid";
            case CAMERA_ACCESS_CAMERA_ERROR:
                return "CameraAccessException - The camera device is currently in the error state.";
            case CAMERA_ACCESS_CAMERA_DISCONNECTED:
                return "CameraAccessException - Camera disconnected";
            case CAMERA_ACCESS_CAMERA_DISABLED:
                return "CameraAccessException - The camera is disabled due to a device policy, and cannot be opened.";
            case CAMERA_ACCESS_MAX_CAMERAS_IN_USE:
                return "CameraAccessException - Maximum cameras in use.";
            case CAMERA_ACCESS_CAMERA_IN_USE:
                return "CameraAccessException - The camera device is in use already.";
            case CAMERA_NO_WAKELOCK_ERROR_CODE:
                return "App is not holding a camera wakelock";
            case CAMERA_DISCONNECTED_ERROR_CODE:
                return "Camera was disconnected";
            case CAMERA_CLOSED_ERROR_CODE:
                return "App closed the camera device";
            case CAMERA_ERROR_CODE_UNKNOWN:
            default:
                return "Unknown failure reason (" + this.f35597u + HEePJw.rIrIBWx;
            case CAMERA_DEVICE_ERROR_CAMERA_IN_USE:
                return "Camera is in use (1)";
            case CAMERA_DEVICE_ERROR_MAX_CAMERAS_IN_USE:
                return "Maximum cameras in use (2)";
            case CAMERA_DEVICE_ERROR_CAMERA_DISABLED:
                return "Camera is disabled (3)";
            case CAMERA_DEVICE_ERROR_CAMERA_DEVICE:
                return "Camera encountered a fatal error (4)";
            case f35592r:
                return "Camera service encountered a fatal error (5)";
            case CAMERA_CHARACTERISTICS_ILLEGAL_ARGUMENT:
                return "Unable to retrieve camera characteristics for unknown device";
        }
    }
}
