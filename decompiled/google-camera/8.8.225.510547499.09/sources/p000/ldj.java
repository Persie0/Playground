package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ldj extends ldc {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ EGLDisplay f37981g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldj(leb lebVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, lbl lblVar, EGLDisplay eGLDisplay2) {
        super(lebVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, 0, lblVar);
        this.f37981g = eGLDisplay2;
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: b */
    public final laa mo15085b() {
        EGL14.eglMakeCurrent(this.f37981g, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroyContext(this.f37967d, this.f37969f);
        EGL14.eglDestroySurface(this.f37967d, this.f37968e);
        return kzz.f37797a;
    }
}
