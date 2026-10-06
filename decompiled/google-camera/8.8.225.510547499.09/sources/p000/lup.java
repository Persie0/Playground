package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lup {

    /* JADX INFO: renamed from: a */
    public EGLDisplay f39243a;

    /* JADX INFO: renamed from: b */
    public EGLSurface f39244b;

    /* JADX INFO: renamed from: c */
    private final Surface f39245c;

    /* JADX INFO: renamed from: d */
    private EGLContext f39246d;

    public lup() {
        this.f39245c = null;
        EGLDisplay eGLDisplayM16018e = m16018e();
        this.f39243a = eGLDisplayM16018e;
        EGLConfig eGLConfigM16016c = m16016c(eGLDisplayM16018e, false, true);
        this.f39246d = m16017d(this.f39243a, EGL14.EGL_NO_CONTEXT, eGLConfigM16016c);
        this.f39244b = EGL14.eglCreatePbufferSurface(this.f39243a, eGLConfigM16016c, new int[]{12375, 1, 12374, 1, 12344}, 0);
    }

    /* JADX INFO: renamed from: c */
    private static EGLConfig m16016c(EGLDisplay eGLDisplay, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4));
        if (z) {
            arrayList.addAll(Arrays.asList(12610, 1));
        }
        if (z2) {
            arrayList.addAll(Arrays.asList(12339, 1));
        }
        arrayList.add(12344);
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] != 0) {
            return eGLConfigArr[0];
        }
        throw new RuntimeException("Could not find a valid EGL configuration");
    }

    /* JADX INFO: renamed from: d */
    private static EGLContext m16017d(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLConfig eGLConfig) {
        return EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
    }

    /* JADX INFO: renamed from: e */
    private static EGLDisplay m16018e() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new RuntimeException("unable to initialize EGL14");
    }

    /* JADX INFO: renamed from: a */
    public final void m16019a() {
        if (!Objects.equals(this.f39243a, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglMakeCurrent(this.f39243a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f39243a, this.f39244b);
            EGL14.eglDestroyContext(this.f39243a, this.f39246d);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f39243a);
        }
        this.f39243a = EGL14.EGL_NO_DISPLAY;
        this.f39246d = EGL14.EGL_NO_CONTEXT;
        this.f39244b = EGL14.EGL_NO_SURFACE;
        Surface surface = this.f39245c;
        if (surface != null) {
            surface.release();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16020b() {
        EGLDisplay eGLDisplay = this.f39243a;
        EGLSurface eGLSurface = this.f39244b;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f39246d);
    }

    public lup(EGLContext eGLContext, Surface surface) {
        this.f39245c = surface;
        EGLDisplay eGLDisplayM16018e = m16018e();
        this.f39243a = eGLDisplayM16018e;
        EGLConfig eGLConfigM16016c = m16016c(eGLDisplayM16018e, true, false);
        this.f39246d = m16017d(this.f39243a, eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext, eGLConfigM16016c);
        this.f39244b = EGL14.eglCreateWindowSurface(this.f39243a, eGLConfigM16016c, surface, new int[]{12344}, 0);
    }
}
