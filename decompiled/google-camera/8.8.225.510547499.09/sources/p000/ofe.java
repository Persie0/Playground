package p000;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofe {

    /* JADX INFO: renamed from: a */
    public final int f45833a;

    /* JADX INFO: renamed from: b */
    public final off f45834b;

    /* JADX INFO: renamed from: c */
    public final float[] f45835c;

    /* JADX INFO: renamed from: g */
    public volatile SurfaceTexture f45839g;

    /* JADX INFO: renamed from: h */
    public volatile Surface f45840h;

    /* JADX INFO: renamed from: l */
    private final int f45844l;

    /* JADX INFO: renamed from: m */
    private final int f45845m;

    /* JADX INFO: renamed from: n */
    private final boolean f45846n;

    /* JADX INFO: renamed from: o */
    private HandlerThread f45847o;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f45836d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f45837e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final int[] f45838f = new int[1];

    /* JADX INFO: renamed from: i */
    public volatile boolean f45841i = false;

    /* JADX INFO: renamed from: j */
    public volatile boolean f45842j = false;

    /* JADX INFO: renamed from: k */
    public final Object f45843k = new Object();

    public ofe(int i, int i2, int i3, off offVar, boolean z) {
        float[] fArr = new float[16];
        this.f45835c = fArr;
        this.f45833a = i;
        this.f45844l = i2;
        this.f45845m = i3;
        this.f45834b = offVar;
        this.f45846n = z;
        Matrix.setIdentityM(fArr, 0);
        if (z) {
            HandlerThread handlerThread = new HandlerThread("SurfaceTexture Callback Thread");
            this.f45847o = handlerThread;
            handlerThread.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18461a() {
        if (this.f45841i) {
            return;
        }
        GLES20.glGenTextures(1, this.f45838f, 0);
        m18462b(this.f45838f[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m18462b(int i) {
        if (this.f45841i) {
            return;
        }
        this.f45838f[0] = i;
        Handler handler = this.f45846n ? new Handler(this.f45847o.getLooper()) : new Handler(Looper.getMainLooper());
        if (this.f45839g == null) {
            this.f45839g = new SurfaceTexture(this.f45838f[0]);
            if (this.f45844l > 0 && this.f45845m > 0) {
                this.f45839g.setDefaultBufferSize(this.f45844l, this.f45845m);
            }
            this.f45839g.setOnFrameAvailableListener(new ofd(this, 0), handler);
            this.f45840h = new Surface(this.f45839g);
        } else {
            this.f45839g.attachToGLContext(this.f45838f[0]);
        }
        this.f45841i = true;
        off offVar = this.f45834b;
        if (offVar != null) {
            offVar.mo18460c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18463c(ofb ofbVar) {
        synchronized (this.f45843k) {
            this.f45842j = true;
        }
        if (this.f45837e.getAndSet(true)) {
            return;
        }
        off offVar = this.f45834b;
        if (offVar != null) {
            offVar.mo18458a();
        }
        if (this.f45839g != null) {
            this.f45839g.release();
            this.f45839g = null;
            if (this.f45840h != null) {
                this.f45840h.release();
            }
            this.f45840h = null;
        }
        ofbVar.m18457a(this.f45833a, 0, 0L, this.f45835c);
    }
}
