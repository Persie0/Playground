package p000;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLObjectHandle;
import android.opengl.EGLSurface;
import android.opengl.EGLSync;
import android.opengl.GLES30;
import android.opengl.GLES31;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kua {

    /* JADX INFO: renamed from: a */
    public static volatile ljf f37204a;

    private kua() {
    }

    /* JADX INFO: renamed from: a */
    public static String m14862a(Throwable th) {
        String strM16867b = msm.m16867b(th);
        int length = strM16867b.length();
        oie.m18542b();
        long jMo18529c = oib.f46086a.mo6051a().mo18529c();
        if (jMo18529c < length && jMo18529c >= 0) {
            length = (int) jMo18529c;
        }
        return strM16867b.substring(0, length);
    }

    /* JADX INFO: renamed from: b */
    public static long m14863b() {
        oie.m18542b();
        return oib.f46086a.mo6051a().mo18528b();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14864c() {
        oie.m18542b();
        return oib.f46086a.mo6051a().mo18535i();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14865d(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    /* JADX INFO: renamed from: e */
    public static double m14866e(float f, double d) {
        lku.m15607B(f > 0.0f, "Focal length cannot be zero (%s)", Float.valueOf(f));
        lku.m15607B(d > 0.0d, "Diagonal size cannot be zero (%s)", Double.valueOf(d));
        double d2 = f + f;
        Double.isNaN(d2);
        double dAtan = Math.atan(d / d2);
        return dAtan + dAtan;
    }

    /* JADX INFO: renamed from: f */
    public static double m14867f(double d, float f) {
        double d2 = f + f;
        double dTan = Math.tan(d / 2.0d);
        Double.isNaN(d2);
        return d2 * dTan;
    }

    /* JADX INFO: renamed from: g */
    public static double m14868g(kmd kmdVar) {
        SizeF sizeF = (SizeF) kmdVar.mo14561n(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        return Math.hypot(sizeF.getHeight(), sizeF.getWidth());
    }

    /* JADX INFO: renamed from: h */
    public static Object m14869h(kpd kpdVar) {
        return kpdVar.mo7254j().f36008a;
    }

    /* JADX INFO: renamed from: i */
    public static List m14870i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(m14869h((kpd) list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static void m14871j(kiz kizVar, Handler handler) {
        handler.post(new jzq(kizVar, 14));
    }

    /* JADX INFO: renamed from: k */
    public static void m14872k(Collection collection, Handler handler) {
        handler.post(new jzq(collection, 13));
    }

    /* JADX INFO: renamed from: m */
    public static ozy m14874m(boolean z) {
        nxl nxlVarM18137O = ozy.f47122e.m18137O();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        ozy ozyVar = (ozy) nxqVar;
        ozyVar.f47124a |= 1;
        ozyVar.f47125b = elapsedCpuTime;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ozy ozyVar2 = (ozy) nxlVarM18137O.f44974b;
        ozyVar2.f47124a |= 2;
        ozyVar2.f47126c = z;
        int iActiveCount = Thread.activeCount();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ozy ozyVar3 = (ozy) nxlVarM18137O.f44974b;
        ozyVar3.f47124a |= 4;
        ozyVar3.f47127d = iActiveCount;
        return (ozy) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: n */
    public static lgb m14875n(Object obj) {
        return new lge(obj);
    }

    /* JADX INFO: renamed from: o */
    public static lgb m14876o(kyx kyxVar) {
        return new lfz(kyxVar);
    }

    /* JADX INFO: renamed from: p */
    public static lfm m14877p(Executor executor) {
        return new lfm(executor);
    }

    /* JADX INFO: renamed from: q */
    public static void m14878q(String str, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (mediaFormat.containsKey(str)) {
            mediaFormat2.setInteger(str, mediaFormat.getInteger(str));
        }
    }

    /* JADX INFO: renamed from: r */
    public static lex m14879r(lfi lfiVar) {
        return new lfa(lfiVar);
    }

    /* JADX INFO: renamed from: s */
    public static ldb m14880s(EGLSync eGLSync) {
        return new lcz(EGL14.eglGetDisplay(0), eGLSync);
    }

    /* JADX INFO: renamed from: t */
    public static void m14881t(Runnable runnable, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        char c;
        int[] iArr = new int[2];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        int[] iArr5 = new int[2];
        int[] iArr6 = new int[1];
        int[] iArr7 = new int[1];
        int[] iArr8 = new int[4];
        String name = Thread.currentThread().getName();
        Thread threadCurrentThread = Thread.currentThread();
        ThreadGroup threadGroup = threadCurrentThread.getThreadGroup();
        if (threadGroup != null) {
            int iActiveCount = threadGroup.activeCount();
            int i6 = iActiveCount + iActiveCount;
            Thread[] threadArr = new Thread[i6];
            threadGroup.enumerate(threadArr, true);
            i4 = 1;
            i5 = 0;
            for (int i7 = 0; i7 < i6; i7++) {
                Thread thread = threadArr[i7];
                if (thread != null && thread.getName().equals(name)) {
                    i5++;
                }
                if (thread == threadCurrentThread) {
                    i4 = i5;
                }
            }
        } else {
            i4 = 1;
            i5 = 0;
        }
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        EGLSurface eGLSurfaceEglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        GLES30.glGetIntegerv(33307, iArr, 0);
        GLES30.glGetIntegerv(33308, iArr, 1);
        GLES30.glGetIntegerv(35725, iArr2, 0);
        GLES30.glGetIntegerv(34016, iArr3, 0);
        GLES30.glGetIntegerv(36010, iArr6, 0);
        GLES30.glGetIntegerv(36007, iArr7, 0);
        GLES30.glGetIntegerv(32873, iArr4, 0);
        GLES30.glGetIntegerv(2978, iArr8, 0);
        if (iArr4[0] != 0) {
            if (iArr[0] == 3) {
                c = 1;
                if (iArr[1] > 0) {
                    GLES31.glGetTexLevelParameteriv(3553, 0, 4096, iArr5, 0);
                    GLES31.glGetTexLevelParameteriv(3553, 0, 4097, iArr5, 1);
                }
            } else {
                c = 1;
            }
            iArr5[0] = -1;
            iArr5[c] = -1;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[25];
        objArr[0] = Integer.valueOf(iArr[0]);
        objArr[1] = Integer.valueOf(iArr[1]);
        objArr[2] = Thread.currentThread().getName();
        objArr[3] = Integer.valueOf(i4);
        objArr[4] = Integer.valueOf(i5);
        objArr[5] = Integer.valueOf(i);
        objArr[6] = runnable.toString();
        objArr[7] = eGLContextEglGetCurrentContext.equals(EGL14.EGL_NO_CONTEXT) ? "EGL_NO_CONTEXT" : m14883v(eGLContextEglGetCurrentContext);
        objArr[8] = eGLDisplayEglGetCurrentDisplay.equals(EGL14.EGL_NO_DISPLAY) ? "EGL_NO_DISPLAY" : m14883v(eGLDisplayEglGetCurrentDisplay);
        objArr[9] = eGLSurfaceEglGetCurrentSurface.equals(EGL14.EGL_NO_SURFACE) ? "EGL_NO_SURFACE" : m14883v(eGLSurfaceEglGetCurrentSurface);
        objArr[10] = eGLSurfaceEglGetCurrentSurface2.equals(EGL14.EGL_NO_SURFACE) ? "EGL_NO_SURFACE" : m14883v(eGLSurfaceEglGetCurrentSurface2);
        objArr[11] = i2 == 12288 ? "EGL_SUCCESS" : String.valueOf(i2);
        objArr[12] = i3 == 0 ? "GL_NO_ERROR" : String.valueOf(i3);
        objArr[13] = Boolean.valueOf(z);
        objArr[14] = Integer.valueOf(iArr2[0]);
        objArr[15] = Integer.valueOf(iArr3[0] - 33984);
        objArr[16] = Integer.valueOf(iArr4[0]);
        int i8 = iArr5[0];
        objArr[17] = i8 != -1 ? String.valueOf(i8) : "?";
        int i9 = iArr5[1];
        objArr[18] = i9 != -1 ? String.valueOf(i9) : "?";
        objArr[19] = Integer.valueOf(iArr6[0]);
        objArr[20] = Integer.valueOf(iArr7[0]);
        objArr[21] = Integer.valueOf(iArr8[0]);
        objArr[22] = Integer.valueOf(iArr8[1]);
        objArr[23] = Integer.valueOf(iArr8[2]);
        objArr[24] = Integer.valueOf(iArr8[3]);
        String str = String.format(locale, "\n- General EGL Status ------------------\nVersion: %d.%d\nThread: %s (%d of %d)\nCommands Executed: %d\nCommand Run: %s\nCurrent Context: %s\nCurrent Display: %s\nCurrent Read Surface: %s\nCurrent Draw Surface: %s\nEGL Error: %s\nGL Error: %s\nClosing: %b\n- GL Status ---------------------------\nBound Program: %d\nActive Texture Slot: %d\nTexture2D Binding: %d\nTexture Size: %sx%s\nFBO Binding: %d\nRenderbuffer Binding: %d\nViewport: %d,%d,%dx%d\n", objArr);
        StringBuilder sb = new StringBuilder();
        if (iArr2[0] != 0) {
            sb.append("- Program Details ---------------------\n");
            int i10 = iArr2[0];
            StringBuilder sb2 = new StringBuilder();
            int i11 = 1;
            int[] iArr9 = new int[1];
            GLES30.glGetProgramiv(i10, 35718, iArr9, 0);
            sb2.append(String.format(Locale.US, "Uni Count: %d\n", Integer.valueOf(iArr9[0])));
            int[] iArr10 = new int[1];
            GLES30.glGetProgramiv(i10, 35719, iArr10, 0);
            int i12 = 0;
            while (i12 < iArr9[0]) {
                int[] iArr11 = new int[i11];
                int[] iArr12 = new int[i11];
                int[] iArr13 = new int[i11];
                byte[] bArr = new byte[255];
                GLES30.glGetActiveUniform(i10, i12, iArr10[0], iArr11, 0, iArr12, 0, iArr13, 0, bArr, 0);
                sb2.append(String.format("Uni 0x%X %s\n", Integer.valueOf(iArr13[0]), new String(bArr, 0, m14882u(bArr))));
                i12++;
                i11 = 1;
            }
            sb.append(sb2.toString());
            int i13 = iArr2[0];
            StringBuilder sb3 = new StringBuilder();
            int i14 = 1;
            int[] iArr14 = new int[1];
            GLES30.glGetProgramiv(i13, 35721, iArr14, 0);
            sb3.append(String.format(Locale.US, "Attrib Count: %d\n", Integer.valueOf(iArr14[0])));
            int[] iArr15 = new int[1];
            GLES30.glGetProgramiv(i13, 35722, iArr15, 0);
            int i15 = 0;
            while (i15 < iArr14[0]) {
                int[] iArr16 = new int[i14];
                int[] iArr17 = new int[i14];
                int[] iArr18 = new int[i14];
                byte[] bArr2 = new byte[255];
                GLES30.glGetActiveAttrib(i13, i15, iArr15[0], iArr16, 0, iArr17, 0, iArr18, 0, bArr2, 0);
                sb3.append(String.format("Attrib 0x%X %s\n", Integer.valueOf(iArr18[0]), new String(bArr2, 0, m14882u(bArr2))));
                i15++;
                i14 = 1;
            }
            sb.append(sb3.toString());
        }
        Log.e("GLContext", String.valueOf(str).concat(sb.toString()));
    }

    /* JADX INFO: renamed from: u */
    private static int m14882u(byte[] bArr) {
        for (int i = 0; i < 255; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return 255;
    }

    /* JADX INFO: renamed from: v */
    private static String m14883v(EGLObjectHandle eGLObjectHandle) {
        return String.format("0x%X", Long.valueOf(eGLObjectHandle.getNativeHandle()));
    }
}
