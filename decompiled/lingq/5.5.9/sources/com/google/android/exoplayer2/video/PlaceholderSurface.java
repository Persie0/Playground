package com.google.android.exoplayer2.video;

import android.content.Context;
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
import android.view.Surface;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.RunnableC2530a;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: d */
    public static int f13766d;

    /* JADX INFO: renamed from: e */
    public static boolean f13767e;

    /* JADX INFO: renamed from: a */
    public final boolean f13768a;

    /* JADX INFO: renamed from: b */
    public final HandlerThreadC2533a f13769b;

    /* JADX INFO: renamed from: c */
    public boolean f13770c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.PlaceholderSurface$a */
    public static class HandlerThreadC2533a extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        public RunnableC2530a f13771a;

        /* JADX INFO: renamed from: b */
        public Handler f13772b;

        /* JADX INFO: renamed from: c */
        public Error f13773c;

        /* JADX INFO: renamed from: d */
        public RuntimeException f13774d;

        /* JADX INFO: renamed from: e */
        public PlaceholderSurface f13775e;

        public HandlerThreadC2533a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* JADX INFO: renamed from: a */
        public final void m7513a(int i10) throws GlUtil.GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.f13771a.getClass();
            RunnableC2530a runnableC2530a = this.f13771a;
            runnableC2530a.getClass();
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.m7477c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
            int[] iArr = new int[2];
            GlUtil.m7477c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
            runnableC2530a.f13745c = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC2530a.f13742g, 0, eGLConfigArr, 0, 1, iArr2, 0);
            GlUtil.m7477c(C10134c0.m19045l("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC2530a.f13745c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            GlUtil.m7477c("eglCreateContext failed", eGLContextEglCreateContext != null);
            runnableC2530a.f13746d = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = runnableC2530a.f13745c;
            if (i10 == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                GlUtil.m7477c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
            }
            GlUtil.m7477c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
            runnableC2530a.f13747e = eGLSurfaceEglCreatePbufferSurface;
            int[] iArr3 = runnableC2530a.f13744b;
            GLES20.glGenTextures(1, iArr3, 0);
            GlUtil.m7476b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
            runnableC2530a.f13748f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(runnableC2530a);
            SurfaceTexture surfaceTexture2 = this.f13771a.f13748f;
            surfaceTexture2.getClass();
            this.f13775e = new PlaceholderSurface(this, surfaceTexture2, i10 != 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public final void m7514b() {
            this.f13771a.getClass();
            RunnableC2530a runnableC2530a = this.f13771a;
            runnableC2530a.f13743a.removeCallbacks(runnableC2530a);
            try {
                SurfaceTexture surfaceTexture = runnableC2530a.f13748f;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, runnableC2530a.f13744b, 0);
                }
                EGLDisplay eGLDisplay = runnableC2530a.f13745c;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = runnableC2530a.f13745c;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = runnableC2530a.f13747e;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(runnableC2530a.f13745c, runnableC2530a.f13747e);
                }
                EGLContext eGLContext = runnableC2530a.f13746d;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(runnableC2530a.f13745c, eGLContext);
                }
                if (C10134c0.f51354a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = runnableC2530a.f13745c;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(runnableC2530a.f13745c);
                }
                runnableC2530a.f13745c = null;
                runnableC2530a.f13746d = null;
                Object[] objArr = objArr == true ? 1 : 0;
            } finally {
                EGLDisplay eGLDisplay4 = runnableC2530a.f13745c;
                if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay5 = runnableC2530a.f13745c;
                    EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface4 = runnableC2530a.f13747e;
                if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(runnableC2530a.f13745c, runnableC2530a.f13747e);
                }
                EGLContext eGLContext2 = runnableC2530a.f13746d;
                if (eGLContext2 != null) {
                    EGL14.eglDestroyContext(runnableC2530a.f13745c, eGLContext2);
                }
                if (C10134c0.f51354a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay6 = runnableC2530a.f13745c;
                if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(runnableC2530a.f13745c);
                }
                runnableC2530a.f13745c = null;
                runnableC2530a.f13746d = null;
                runnableC2530a.f13747e = null;
                runnableC2530a.f13748f = null;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    m7514b();
                } catch (Throwable th2) {
                    try {
                        C10145n.m19096d("PlaceholderSurface", "Failed to release placeholder surface", th2);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                try {
                    try {
                        m7513a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th3) {
                        synchronized (this) {
                            try {
                                notify();
                                throw th3;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (GlUtil.GlException e10) {
                    C10145n.m19096d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f13774d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (Error e11) {
                C10145n.m19096d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.f13773c = e11;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e12) {
                C10145n.m19096d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                this.f13774d = e12;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        }
    }

    public PlaceholderSurface(HandlerThreadC2533a handlerThreadC2533a, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f13769b = handlerThreadC2533a;
        this.f13768a = z10;
    }

    /* JADX INFO: renamed from: a */
    public static int m7511a(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i10 = C10134c0.f51354a;
        boolean z10 = false;
        if (!(i10 >= 24 && (i10 >= 26 || !("samsung".equals(C10134c0.f51356c) || "XT1650".equals(C10134c0.f51357d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i10 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) {
            z10 = true;
        }
        return z10 ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0039  */
    /* JADX WARN: Code duplicated, block: B:27:0x003c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static PlaceholderSurface m7512b(Context context, boolean z10) {
        boolean z11;
        HandlerThreadC2533a handlerThreadC2533a;
        int i10;
        RuntimeException runtimeException;
        Error error;
        boolean z12;
        boolean z13 = false;
        if (z10) {
            synchronized (PlaceholderSurface.class) {
                try {
                    if (!f13767e) {
                        f13766d = m7511a(context);
                        f13767e = true;
                    }
                    z12 = f13766d != 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z12) {
                z11 = false;
            }
            C10129a.m18992d(z11);
            handlerThreadC2533a = new HandlerThreadC2533a();
            if (z10) {
                i10 = f13766d;
            } else {
                i10 = 0;
            }
            handlerThreadC2533a.start();
            Handler handler = new Handler(handlerThreadC2533a.getLooper(), handlerThreadC2533a);
            handlerThreadC2533a.f13772b = handler;
            handlerThreadC2533a.f13771a = new RunnableC2530a(handler);
            synchronized (handlerThreadC2533a) {
                try {
                    handlerThreadC2533a.f13772b.obtainMessage(1, i10, 0).sendToTarget();
                    while (handlerThreadC2533a.f13775e == null && handlerThreadC2533a.f13774d == null && handlerThreadC2533a.f13773c == null) {
                        try {
                            handlerThreadC2533a.wait();
                        } catch (InterruptedException unused) {
                            z13 = true;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z13) {
                Thread.currentThread().interrupt();
            }
            runtimeException = handlerThreadC2533a.f13774d;
            if (runtimeException == null) {
                throw runtimeException;
            }
            error = handlerThreadC2533a.f13773c;
            if (error == null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface = handlerThreadC2533a.f13775e;
            placeholderSurface.getClass();
            return placeholderSurface;
        }
        z11 = true;
        C10129a.m18992d(z11);
        handlerThreadC2533a = new HandlerThreadC2533a();
        if (z10) {
            i10 = f13766d;
        } else {
            i10 = 0;
        }
        handlerThreadC2533a.start();
        Handler handler2 = new Handler(handlerThreadC2533a.getLooper(), handlerThreadC2533a);
        handlerThreadC2533a.f13772b = handler2;
        handlerThreadC2533a.f13771a = new RunnableC2530a(handler2);
        synchronized (handlerThreadC2533a) {
            handlerThreadC2533a.f13772b.obtainMessage(1, i10, 0).sendToTarget();
            while (handlerThreadC2533a.f13775e == null) {
                handlerThreadC2533a.wait();
            }
            if (z13) {
                Thread.currentThread().interrupt();
            }
            runtimeException = handlerThreadC2533a.f13774d;
            if (runtimeException == null) {
                throw runtimeException;
            }
            error = handlerThreadC2533a.f13773c;
            if (error == null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface2 = handlerThreadC2533a.f13775e;
            placeholderSurface2.getClass();
            return placeholderSurface2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f13769b) {
            if (!this.f13770c) {
                HandlerThreadC2533a handlerThreadC2533a = this.f13769b;
                handlerThreadC2533a.f13772b.getClass();
                handlerThreadC2533a.f13772b.sendEmptyMessage(2);
                this.f13770c = true;
            }
        }
    }
}
