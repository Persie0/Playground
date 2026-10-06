package p000;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvd implements kba {

    /* JADX INFO: renamed from: g */
    private static final nbh f9762g = nbh.m17259h("com/google/android/apps/camera/camcorder/media/audio/AudioDeviceChangeListenerImpl");

    /* JADX INFO: renamed from: a */
    public final AudioManager f9763a;

    /* JADX INFO: renamed from: b */
    public final AudioDeviceCallback f9764b;

    /* JADX INFO: renamed from: c */
    public final Handler f9765c;

    /* JADX INFO: renamed from: d */
    public final Object f9766d;

    /* JADX INFO: renamed from: e */
    public boolean f9767e;

    /* JADX INFO: renamed from: f */
    public boolean f9768f;

    /* JADX INFO: renamed from: h */
    private final HandlerThread f9769h;

    /* JADX INFO: renamed from: i */
    private final gyz f9770i;

    /* JADX INFO: renamed from: j */
    private final cwd f9771j;

    public cvd(cwd cwdVar, AudioManager audioManager, gyz gyzVar, byte[] bArr) {
        HandlerThread handlerThread = new HandlerThread("AudioDeviceChangeListenerImpl");
        this.f9769h = handlerThread;
        this.f9766d = new Object();
        this.f9767e = false;
        this.f9768f = false;
        this.f9771j = cwdVar;
        this.f9763a = audioManager;
        this.f9770i = gyzVar;
        this.f9764b = new cvc(this);
        handlerThread.start();
        this.f9765c = jvh.m13557e(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: b */
    public final void m5562b() {
        AudioDeviceInfo audioDeviceInfo;
        int i = 0;
        for (AudioDeviceInfo audioDeviceInfo2 : ((AudioManager) this.f9771j.f9866a).getDevices(1)) {
            cwd.m5641c(audioDeviceInfo2);
        }
        gyz gyzVar = this.f9770i;
        if (gyzVar != null) {
            gyy gyyVar = gyy.PHONE;
            AudioDeviceInfo[] devices = ((AudioManager) this.f9771j.f9866a).getDevices(1);
            int length = devices.length;
            while (true) {
                if (i >= length) {
                    audioDeviceInfo = null;
                    break;
                }
                audioDeviceInfo = devices[i];
                if (audioDeviceInfo.getType() == 15) {
                    break;
                } else {
                    i++;
                }
            }
            gyzVar.m10007d(gyyVar, audioDeviceInfo);
            this.f9770i.m10007d(gyy.EXT_WIRED, this.f9771j.m5656b());
            this.f9770i.m10007d(gyy.EXT_BLUETOOTH, this.f9771j.m5655a());
        }
        this.f9770i.m10009f(gyy.EXT_WIRED);
        this.f9770i.m10009f(gyy.EXT_BLUETOOTH);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9766d) {
            if (this.f9767e) {
                ((nbe) ((nbe) f9762g.m17252c()).mo17276G(707)).mo17290o("Already closed");
                return;
            }
            m5561a();
            this.f9767e = true;
            try {
                this.f9769h.quit();
                this.f9769h.join();
            } catch (InterruptedException e) {
                ((nbe) ((nbe) f9762g.m17251b()).mo17276G(706)).mo17290o("Could not complete shutting down AudioDeviceChangeListener.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5561a() {
        synchronized (this.f9766d) {
            if (this.f9767e) {
                return;
            }
            this.f9763a.unregisterAudioDeviceCallback(this.f9764b);
            this.f9768f = false;
        }
    }
}
