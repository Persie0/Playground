package p000;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class do2 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g */
    public static final int[] f35936g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a */
    public final Handler f35937a;

    /* JADX INFO: renamed from: b */
    public final int[] f35938b = new int[1];

    /* JADX INFO: renamed from: c */
    public EGLDisplay f35939c;

    /* JADX INFO: renamed from: d */
    public EGLContext f35940d;

    /* JADX INFO: renamed from: e */
    public EGLSurface f35941e;

    /* JADX INFO: renamed from: f */
    public SurfaceTexture f35942f;

    public do2(Handler handler) {
        this.f35937a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f35937a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f35942f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
