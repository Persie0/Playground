package p000;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elk extends Handler {

    /* JADX INFO: renamed from: a */
    private final WeakReference f14599a;

    public elk(ell ellVar, Looper looper) {
        super(looper);
        this.f14599a = new WeakReference(ellVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ell ellVar = (ell) this.f14599a.get();
        if (ellVar == null) {
        }
        switch (message.what) {
            case 1:
                long j = message.arg1;
                long j2 = message.arg2;
                float[] fArr = (float[]) message.obj;
                eli eliVar = ellVar.f14601b;
                if (!eliVar.f14583g) {
                    ((nbe) ((nbe) eli.f14577a.m17251b()).mo17276G((char) 1580)).mo17290o("Received a frame to process, but the encoder either hasn't started or has already stopped. This should not happen.");
                    eliVar.m7453f();
                } else {
                    eliVar.f14580d.m16020b();
                    eliVar.f14584h.m5653L(fArr);
                    eliVar.m7453f();
                    lup lupVar = eliVar.f14580d;
                    EGLExt.eglPresentationTimeANDROID(lupVar.f39243a, lupVar.f39244b, (j << 32) | (j2 & 4294967295L));
                    lup lupVar2 = eliVar.f14580d;
                    EGL14.eglSwapBuffers(lupVar2.f39243a, lupVar2.f39244b);
                    eliVar.f14582f++;
                }
                break;
            case 2:
                ellVar.f14602c.m7446a();
                break;
            case 3:
                getLooper().quitSafely();
                break;
        }
    }
}
