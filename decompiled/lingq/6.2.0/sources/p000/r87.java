package p000;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class r87 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public do2 f58885a;

    /* JADX INFO: renamed from: b */
    public Handler f58886b;

    /* JADX INFO: renamed from: c */
    public Error f58887c;

    /* JADX INFO: renamed from: d */
    public RuntimeException f58888d;

    /* JADX INFO: renamed from: e */
    public PlaceholderSurface f58889e;

    /* JADX INFO: renamed from: a */
    public final void m20445a(int i) throws GlUtil$GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f58885a.getClass();
        do2 do2Var = this.f58885a;
        int[] iArr = do2Var.f35938b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        oed.m17954b("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        oed.m17954b("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        do2Var.f35939c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, do2.f35936g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = uma.f64080a;
        oed.m17954b(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(do2Var.f35939c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        oed.m17954b("eglCreateContext failed", eGLContextEglCreateContext != null);
        do2Var.f35940d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = do2Var.f35939c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            oed.m17954b("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        oed.m17954b("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        do2Var.f35941e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        oed.m17953a();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        do2Var.f35942f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(do2Var);
        SurfaceTexture surfaceTexture2 = this.f58885a.f35942f;
        surfaceTexture2.getClass();
        this.f58889e = new PlaceholderSurface(this, surfaceTexture2, i != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m20446b() {
        this.f58885a.getClass();
        do2 do2Var = this.f58885a;
        do2Var.f35937a.removeCallbacks(do2Var);
        try {
            SurfaceTexture surfaceTexture = do2Var.f35942f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, do2Var.f35938b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = do2Var.f35939c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = do2Var.f35939c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = do2Var.f35941e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(do2Var.f35939c, do2Var.f35941e);
            }
            EGLContext eGLContext = do2Var.f35940d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(do2Var.f35939c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = do2Var.f35939c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(do2Var.f35939c);
            }
            do2Var.f35939c = null;
            do2Var.f35940d = null;
            do2Var.f35941e = null;
            do2Var.f35942f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    m20445a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (GlUtil$GlException e) {
                    ss5.m21724v("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f58888d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    ss5.m21724v("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f58887c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    ss5.m21724v("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f58888d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    m20446b();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        ss5.m21724v("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
