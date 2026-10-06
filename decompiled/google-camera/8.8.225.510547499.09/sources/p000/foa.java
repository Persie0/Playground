package p000;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class foa extends Handler {

    /* JADX INFO: renamed from: a */
    private final WeakReference f22818a;

    public foa(foc focVar) {
        this.f22818a = new WeakReference(focVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        foc focVar = (foc) this.f22818a.get();
        if (focVar == null) {
            return;
        }
        switch (message.what) {
            case 101:
                focVar.m8619w();
                return;
            case 102:
            case 103:
                return;
            case 104:
                LocalSessionStorage localSessionStorage = focVar.f22882m;
                gyr gyrVar = localSessionStorage.f6801b.f26777d;
                if (gyrVar.m10000b()) {
                    String path = gyrVar.m9999a().getPath();
                    long jMo9646a = focVar.f22872c.mo9646a() / 1000000;
                    boolean z = true;
                    if (!focVar.f22828G) {
                        Object obj = exh.f20734a;
                        if (LightCycleNative.GetNumCapturedTargets() > 0) {
                            z = false;
                        }
                    }
                    int i = (int) jMo9646a;
                    synchronized (exh.f20734a) {
                        LightCycleNative.FinishCapture(z, path, path, i);
                        exh.f20735b = false;
                        break;
                    }
                    new eym(localSessionStorage, new fya(focVar, localSessionStorage), null).start();
                } else {
                    ((nbe) ((nbe) foc.f22821b.m17251b()).mo17276G((char) 2405)).mo17290o("Could not create temporary mosaic file. Not able to stitch.");
                }
                focVar.m8614E();
                return;
            case 105:
                focVar.m8614E();
                return;
            default:
                throw new AssertionError(message.what);
        }
    }
}
