package p000;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hrd {

    /* JADX INFO: renamed from: a */
    public static final nbh f29252a = nbh.m17259h("com/google/android/apps/camera/timelapse/stabilization/warp/PixelBuffer");

    /* JADX INFO: renamed from: b */
    public final int f29253b;

    /* JADX INFO: renamed from: c */
    public final int f29254c;

    /* JADX INFO: renamed from: d */
    public final String f29255d = Thread.currentThread().getName();

    /* JADX INFO: renamed from: e */
    public EGLDisplay f29256e;

    /* JADX INFO: renamed from: f */
    public EGLConfig f29257f;

    /* JADX INFO: renamed from: g */
    public EGLConfig[] f29258g;

    /* JADX INFO: renamed from: h */
    public EGLContext f29259h;

    /* JADX INFO: renamed from: i */
    public EGLSurface f29260i;

    /* JADX INFO: renamed from: j */
    public EGL10 f29261j;

    /* JADX INFO: renamed from: k */
    public GL10 f29262k;

    /* JADX INFO: renamed from: l */
    public hrc f29263l;

    public hrd(int i, int i2) {
        this.f29254c = i;
        this.f29253b = i2;
    }
}
