package p000;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.util.Base64;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class lme {

    /* JADX INFO: renamed from: a */
    public static String f38652a;

    public lme() {
    }

    public lme(oqo oqoVar, lxw lxwVar, ksi ksiVar, mav mavVar) {
        oqoVar.getClass();
        lxwVar.getClass();
        ksiVar.getClass();
        mavVar.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static int m15715a(int i) {
        return i - 1;
    }

    /* JADX INFO: renamed from: b */
    public static lvn m15716b(String str) {
        str.getClass();
        byte[] bArrDecode = Base64.decode(str, 11);
        bArrDecode.getClass();
        lvn lvnVar = new lvn(bArrDecode);
        if (ooc.m18737c(lvnVar.m16094b(), str)) {
            return lvnVar;
        }
        throw new IllegalArgumentException("encodedId has superfluous padding: ".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public static int m15717c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private static Class m15718d(kwl kwlVar) {
        try {
            return kwlVar.m14946b("com.google.android.libraries.lens.lenslite.dynamicloading.PackageVersion");
        } catch (kwm e) {
            return kwlVar.m14946b("com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion");
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m15719e(int i) {
        return i - 2;
    }

    /* JADX INFO: renamed from: f */
    public static int m15720f(kwl kwlVar) throws kwm {
        try {
            return (int) m15718d(kwlVar).getDeclaredField("MIN_VERSION").getLong(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new kwm("Failed to read host package version", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m15721g(kwl kwlVar) throws kwm {
        try {
            return (int) m15718d(kwlVar).getDeclaredField(hsSUWRJfoeC.bbQMZbM).getLong(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new kwm("Failed to read host package version", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m15722h(String str, Object... objArr) {
        try {
            return String.format(Locale.US, str, objArr);
        } catch (RuntimeException e) {
            return String.format(Locale.US, "Unable to format log message: '%s' error:'%s'", str, e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static long m15724j(int i, kbc kbcVar) {
        int i2 = kbcVar.f35517a;
        int i3 = kbcVar.f35518b;
        int bitsPerPixel = ImageFormat.getBitsPerPixel(i);
        if (bitsPerPixel <= 0 && i == 257) {
            bitsPerPixel = 16;
            i = 257;
        }
        if (bitsPerPixel <= 0) {
            switch (i) {
                default:
                    switch (i) {
                        case 33:
                        case 256:
                            break;
                    }
                case 1212500294:
                case 1768253795:
                    return ((((long) (i2 * 24)) * ((long) i3)) / 8) / 4;
            }
        }
        if (bitsPerPixel <= 0 && i == 34) {
            bitsPerPixel = ImageFormat.getBitsPerPixel(35);
        }
        return (((long) (i2 * Math.max(bitsPerPixel, 0))) * ((long) i3)) / 8;
    }

    /* JADX INFO: renamed from: k */
    public static String m15725k(int i) {
        switch (i) {
            case 538982489:
                return "Y8";
            case 540422489:
                return "Y16";
            case 1212500294:
                return zuAgeeF.jnrj;
            case 1768253795:
                return "DEPTH_JPEG";
            default:
                switch (i) {
                    case 34:
                        return "PRIVATE";
                    case 38:
                        return "RAW12";
                    case 39:
                        return "YUV_422_888";
                    case 40:
                        return "YUV_444_888";
                    case 41:
                        return "FLEX_RGB_888";
                    case 42:
                        return "FLEX_RGBA_8888";
                    case 257:
                        return "POINT_CLOUD";
                    case 4098:
                        return "RAW_DEPTH";
                    case 1144402265:
                        return "DEPTH16";
                    default:
                        switch (i) {
                            case 32:
                                return "RAW_SENSOR";
                            case 37:
                                return "RAW10";
                            default:
                                switch (i) {
                                    case 35:
                                        return "YUV_420_888";
                                    default:
                                        switch (i) {
                                            case 0:
                                                return "UNKNOWN";
                                            case 4:
                                                return gBCSQzBeB.eqNhPc;
                                            case 16:
                                                return KMNlNMe.LKYjDdqogWXm;
                                            case 17:
                                                return "NV21";
                                            case 20:
                                                return "YUY2";
                                            case 33:
                                                return "BLOB";
                                            case 34:
                                                return "PRIVATE";
                                            case 35:
                                                return "YUV_420_888";
                                            case 256:
                                                return "JPEG";
                                            case 842094169:
                                                return "YV12";
                                            default:
                                                return Integer.toString(i);
                                        }
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: l */
    public static PointF m15726l(PointF pointF, int i) {
        switch ((360 - i) % 360) {
            case 0:
                return pointF;
            case 90:
                return new PointF(pointF.y, 1.0f - pointF.x);
            case 180:
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            case 270:
                return new PointF(1.0f - pointF.y, pointF.x);
            default:
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
        }
    }
}
