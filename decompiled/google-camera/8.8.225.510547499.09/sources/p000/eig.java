package p000;

import android.opengl.GLSurfaceView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eig {

    /* JADX INFO: renamed from: a */
    private static final nbh f14133a = nbh.m17259h("com/google/android/apps/camera/imax/GlTaskQueueImpl");

    /* JADX INFO: renamed from: b */
    private final GLSurfaceView f14134b;

    public eig(GLSurfaceView gLSurfaceView) {
        this.f14134b = gLSurfaceView;
    }

    /* JADX INFO: renamed from: a */
    public final void m7353a(Runnable runnable) {
        this.f14134b.queueEvent(runnable);
    }

    /* JADX INFO: renamed from: b */
    public final void m7354b(Runnable runnable) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        m7353a(new dgq(runnable, atomicBoolean, 20));
        synchronized (atomicBoolean) {
            while (!atomicBoolean.get()) {
                try {
                    atomicBoolean.wait();
                } catch (InterruptedException e) {
                    ((nbe) ((nbe) ((nbe) f14133a.m17252c()).mo17283h(e)).mo17276G(1486)).mo17290o("Interrupted during wait");
                }
            }
        }
    }
}
