package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2530a implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g */
    public static final int[] f13742g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a */
    public final Handler f13743a;

    /* JADX INFO: renamed from: b */
    public final int[] f13744b = new int[1];

    /* JADX INFO: renamed from: c */
    public EGLDisplay f13745c;

    /* JADX INFO: renamed from: d */
    public EGLContext f13746d;

    /* JADX INFO: renamed from: e */
    public EGLSurface f13747e;

    /* JADX INFO: renamed from: f */
    public SurfaceTexture f13748f;

    public RunnableC2530a(Handler handler) {
        this.f13743a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f13743a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f13748f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
