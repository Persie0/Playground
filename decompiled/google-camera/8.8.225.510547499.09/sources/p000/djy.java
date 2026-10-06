package p000;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djy {

    /* JADX INFO: renamed from: c */
    private static final nbh f11836c = nbh.m17259h("com/google/android/apps/camera/data/GlideFilmstripManager");

    /* JADX INFO: renamed from: d */
    private static kbc f11837d;

    /* JADX INFO: renamed from: a */
    public final kbc f11838a;

    /* JADX INFO: renamed from: b */
    public final int f11839b;

    /* JADX INFO: renamed from: e */
    private final Context f11840e;

    public djy(Context context, dhv dhvVar) {
        this.f11840e = context;
        int iIntValue = ((Integer) dhvVar.mo6173a(dib.f11364f).get()).intValue();
        this.f11838a = new kbc(iIntValue, iIntValue);
        this.f11839b = ((Integer) dhvVar.mo6173a(dib.f11365g).get()).intValue();
    }

    /* JADX INFO: renamed from: d */
    public static kbc m6267d(kbc kbcVar, double d, kbc kbcVar2) {
        int i = kbcVar.f35517a;
        int i2 = kbcVar.f35518b;
        if (i * i2 < d && i < kbcVar2.f35517a && i2 < kbcVar2.f35518b) {
            return kbcVar;
        }
        double dM13905b = kbcVar.m13905b();
        Double.isNaN(dM13905b);
        double dMin = Math.min(Math.sqrt(d / dM13905b), 1.0d);
        double d2 = kbcVar.f35517a;
        Double.isNaN(d2);
        int iRound = (int) Math.round(d2 * dMin);
        double d3 = kbcVar.f35518b;
        Double.isNaN(d3);
        int iRound2 = (int) Math.round(d3 * dMin);
        int i3 = kbcVar2.f35517a;
        if (iRound <= i3 && iRound2 <= kbcVar2.f35518b) {
            return new kbc(iRound, iRound2);
        }
        double d4 = kbcVar.f35517a;
        double d5 = kbcVar2.f35518b;
        double d6 = kbcVar.f35518b;
        double d7 = i3;
        Double.isNaN(d7);
        Double.isNaN(d4);
        double d8 = d7 / d4;
        Double.isNaN(d5);
        Double.isNaN(d6);
        double d9 = d5 / d6;
        if (d8 > d9) {
            d8 = d9;
        }
        Double.isNaN(d4);
        int iMin = Math.min((int) Math.round(d4 * d8), kbcVar2.f35517a);
        double d10 = kbcVar.f35518b;
        Double.isNaN(d10);
        return new kbc(iMin, Math.min((int) Math.round(d10 * d8), kbcVar2.f35518b));
    }

    /* JADX INFO: renamed from: e */
    public static kbc m6268e() {
        Integer numValueOf;
        if (f11837d == null) {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (iArr2[0] == 0) {
                ((nbe) ((nbe) f11836c.m17252c()).mo17276G((char) 933)).mo17290o("No EGL configurations found!");
                numValueOf = null;
            } else {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
                int[] iArr3 = new int[1];
                GLES20.glGetIntegerv(3379, iArr3, 0);
                int i = iArr3[0];
                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                numValueOf = Integer.valueOf(i);
            }
            if (numValueOf == null) {
                f11837d = new kbc(2048, 2048);
            } else if (numValueOf.intValue() > 4096) {
                f11837d = new kbc(4096, 4096);
            } else {
                f11837d = new kbc(numValueOf.intValue(), numValueOf.intValue());
            }
        }
        return f11837d;
    }

    /* JADX INFO: renamed from: f */
    public static final cab m6269f() {
        return (cab) new cab().m3319y(bxw.f4724a, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final bpn m6270a() {
        return box.m2827c(this.f11840e).m2862b();
    }

    /* JADX INFO: renamed from: b */
    public final bpn m6271b() {
        return box.m2827c(this.f11840e).m2863c();
    }

    /* JADX INFO: renamed from: c */
    public final cab m6272c(bqn bqnVar, kbc kbcVar) {
        kbc kbcVarM6267d = m6267d(kbcVar, this.f11839b, m6268e());
        return (cab) ((cab) ((cab) ((cab) new cab().m3320z(bqnVar)).m3301K()).m3311q()).m3315u(kbcVarM6267d.f35517a, kbcVarM6267d.f35518b);
    }
}
