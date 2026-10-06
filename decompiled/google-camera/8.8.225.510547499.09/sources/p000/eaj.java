package p000;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eaj {

    /* JADX INFO: renamed from: a */
    public static final int[] f13054a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: b */
    public EGLConfig f13055b;

    /* JADX INFO: renamed from: c */
    public EGLDisplay f13056c;

    /* JADX INFO: renamed from: d */
    public EGLContext f13057d;

    /* JADX INFO: renamed from: e */
    public EGLSurface f13058e;

    /* JADX INFO: renamed from: f */
    public EGL10 f13059f;

    /* JADX INFO: renamed from: g */
    public GL10 f13060g;

    /* JADX INFO: renamed from: i */
    public final Handler f13062i;

    /* JADX INFO: renamed from: j */
    public final eai f13063j;

    /* JADX INFO: renamed from: h */
    public volatile boolean f13061h = false;

    /* JADX INFO: renamed from: k */
    public final Object f13064k = new Object();

    /* JADX INFO: renamed from: l */
    public final Runnable f13065l = new drs(this, 13);

    public eaj(SurfaceTexture surfaceTexture, Handler handler, eai eaiVar) {
        this.f13062i = handler;
        this.f13063j = eaiVar;
        handler.post(new dgq(this, surfaceTexture, 14));
        Object obj = new Object();
        synchronized (obj) {
            handler.post(new drs(obj, 15));
            try {
                obj.wait();
            } catch (InterruptedException e) {
            }
        }
    }
}
