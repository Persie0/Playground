package androidx.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;
import p000.bna;
import p000.do2;
import p000.oed;
import p000.r87;
import p000.ss5;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: d */
    public static int f6509d;

    /* JADX INFO: renamed from: e */
    public static boolean f6510e;

    /* JADX INFO: renamed from: a */
    public final boolean f6511a;

    /* JADX INFO: renamed from: b */
    public final r87 f6512b;

    /* JADX INFO: renamed from: c */
    public boolean f6513c;

    public PlaceholderSurface(r87 r87Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f6512b = r87Var;
        this.f6511a = z;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m2568a() {
        int i;
        try {
            if (!f6510e) {
                try {
                    if (oed.m17955c("EGL_EXT_protected_content")) {
                        i = oed.m17955c("EGL_KHR_surfaceless_context") ? 1 : 2;
                    } else {
                        i = 0;
                    }
                } catch (GlUtil$GlException e) {
                    ss5.m21723u("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
                }
                f6509d = i;
                f6510e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6509d != 0;
    }

    /* JADX INFO: renamed from: b */
    public static PlaceholderSurface m2569b(boolean z) {
        boolean z2 = false;
        bna.m3987z(!z || m2568a());
        r87 r87Var = new r87("ExoPlayer:PlaceholderSurface");
        int i = z ? f6509d : 0;
        r87Var.start();
        Handler handler = new Handler(r87Var.getLooper(), r87Var);
        r87Var.f58886b = handler;
        r87Var.f58885a = new do2(handler);
        synchronized (r87Var) {
            r87Var.f58886b.obtainMessage(1, i, 0).sendToTarget();
            while (r87Var.f58889e == null && r87Var.f58888d == null && r87Var.f58887c == null) {
                try {
                    r87Var.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = r87Var.f58888d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = r87Var.f58887c;
        if (error != null) {
            throw error;
        }
        PlaceholderSurface placeholderSurface = r87Var.f58889e;
        placeholderSurface.getClass();
        return placeholderSurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f6512b) {
            try {
                if (!this.f6513c) {
                    r87 r87Var = this.f6512b;
                    r87Var.f58886b.getClass();
                    r87Var.f58886b.sendEmptyMessage(2);
                    this.f6513c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
