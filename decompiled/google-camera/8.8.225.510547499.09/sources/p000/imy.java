package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imy implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: b */
    private static final nbh f31567b = nbh.m17259h("com/google/android/apps/camera/util/SynchronousPixelCopy");

    /* JADX INFO: renamed from: a */
    public final Handler f31568a;

    public imy(HandlerThread handlerThread) {
        handlerThread.start();
        this.f31568a = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public final void m11500a(SurfaceView surfaceView, Bitmap bitmap) {
        synchronized (this) {
            PixelCopy.request(surfaceView, bitmap, this, this.f31568a);
            m11501b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11501b() {
        try {
            wait();
        } catch (InterruptedException e) {
            ((nbe) ((nbe) ((nbe) f31567b.m17252c()).mo17283h(e)).mo17276G((char) 4341)).mo17290o("SynchronousPixelCopy: Wait interrupted");
        }
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        synchronized (this) {
            if (i != 0) {
                ((nbe) ((nbe) f31567b.m17252c()).mo17276G(4340)).mo17291p("SynchronousPixelCopy: PixelCopy failed with %s", i);
                notify();
            } else {
                notify();
            }
            throw th;
        }
    }
}
