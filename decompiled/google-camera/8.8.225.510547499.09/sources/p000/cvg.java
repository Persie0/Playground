package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvg implements jyz {

    /* JADX INFO: renamed from: b */
    private static final nbh f9777b = nbh.m17259h("com/google/android/apps/camera/camcorder/media/audio/AudioDeviceSelectorImpl");

    /* JADX INFO: renamed from: a */
    public final gyz f9778a;

    /* JADX INFO: renamed from: c */
    private AudioRouting f9779c;

    /* JADX INFO: renamed from: f */
    private kba f9782f;

    /* JADX INFO: renamed from: g */
    private final cwd f9783g;

    /* JADX INFO: renamed from: e */
    private final Object f9781e = new Object();

    /* JADX INFO: renamed from: d */
    private boolean f9780d = false;

    public cvg(cwd cwdVar, gyz gyzVar, byte[] bArr) {
        this.f9783g = cwdVar;
        this.f9778a = gyzVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5565a(AudioRouting audioRouting) {
        AudioDeviceInfo audioDeviceInfoM5655a;
        if (audioRouting == null) {
            return;
        }
        if (this.f9778a.m10005b().equals(gzn.EXT_WIRED) && this.f9778a.m10010g(gyy.EXT_WIRED)) {
            audioDeviceInfoM5655a = this.f9783g.m5656b();
        } else {
            audioDeviceInfoM5655a = (this.f9778a.m10005b().equals(gzn.EXT_BLUETOOTH) && this.f9778a.m10010g(gyy.EXT_BLUETOOTH)) ? this.f9783g.m5655a() : null;
        }
        boolean preferredDevice = audioRouting.setPreferredDevice(audioDeviceInfoM5655a);
        if (audioDeviceInfoM5655a != null) {
            cwd.m5641c(audioDeviceInfoM5655a);
            if (preferredDevice) {
                return;
            }
            audioRouting.setPreferredDevice(null);
        }
    }

    @Override // p000.jyz
    /* JADX INFO: renamed from: b */
    public final void mo5566b(AudioRouting audioRouting) {
        synchronized (this.f9781e) {
            if (this.f9780d) {
                ((nbe) ((nbe) f9777b.m17252c()).mo17276G(721)).mo17290o("Ignore start. Already closed");
                return;
            }
            if (this.f9779c != null) {
                mo5567c();
            }
            audioRouting.getRoutedDevice().getType();
            this.f9779c = audioRouting;
            m5565a(audioRouting);
            gyz gyzVar = this.f9778a;
            this.f9782f = jwr.m13632b(gyzVar.f26913b, gyzVar.f26915d).mo3830a(new cdb(this, audioRouting, 15), not.INSTANCE);
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9781e) {
            if (this.f9780d) {
                ((nbe) ((nbe) f9777b.m17252c()).mo17276G(719)).mo17290o("Already closed");
            } else {
                mo5567c();
                this.f9780d = true;
            }
        }
    }

    @Override // p000.jyz
    /* JADX INFO: renamed from: c */
    public final void mo5567c() {
        synchronized (this.f9781e) {
            if (this.f9780d) {
                ((nbe) ((nbe) f9777b.m17252c()).mo17276G(723)).mo17290o("Ignore stop. Already closed");
                return;
            }
            this.f9779c = null;
            kba kbaVar = this.f9782f;
            if (kbaVar != null) {
                kbaVar.close();
                this.f9782f = null;
            }
        }
    }
}
