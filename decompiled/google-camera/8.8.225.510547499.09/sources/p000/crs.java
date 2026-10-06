package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class crs implements knr {

    /* JADX INFO: renamed from: a */
    private static final nbh f9162a = nbh.m17259h("com/google/android/apps/camera/camcorder/audio/processor/AudioProcessingStream");

    /* JADX INFO: renamed from: b */
    private final knr f9163b;

    /* JADX INFO: renamed from: c */
    private final crw f9164c;

    /* JADX INFO: renamed from: d */
    private final Object f9165d = new Object();

    /* JADX INFO: renamed from: e */
    private int f9166e = 1;

    /* JADX INFO: renamed from: f */
    private final crp f9167f;

    public crs(knr knrVar, crw crwVar, crp crpVar) {
        this.f9163b = knrVar;
        this.f9167f = crpVar;
        this.f9164c = crwVar;
    }

    @Override // p000.knr
    /* JADX INFO: renamed from: a */
    public final int mo5426a() {
        return this.f9163b.mo5426a();
    }

    @Override // android.media.AudioRouting
    public final void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        this.f9163b.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // p000.knr
    /* JADX INFO: renamed from: b */
    public final AudioFormat mo5427b() {
        return this.f9163b.mo5427b();
    }

    @Override // p000.knr
    /* JADX INFO: renamed from: c */
    public final void mo5428c() {
        synchronized (this.f9165d) {
            crw crwVar = this.f9164c;
            synchronized (((cru) crwVar).f9181d) {
                lku.m15616K(((cru) crwVar).f9185h == crt.READY, "Cannot start from %s", ((cru) crwVar).f9185h);
                ((cru) crwVar).f9183f.mo5428c();
                crn crnVar = ((cru) crwVar).f9186i;
                synchronized (crnVar.f9149c) {
                    crnVar.f9150d = 0;
                    crnVar.f9152f = 0L;
                    crnVar.f9151e = 0;
                    crnVar.f9154h = 0L;
                    crnVar.f9148b.set(true);
                }
                cru.m5431d(new cqr((cru) crwVar, 9), ((cru) crwVar).f9179b);
                ((cru) crwVar).f9185h = crt.STARTED;
            }
            this.f9166e = 2;
        }
    }

    @Override // p000.knr, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9165d) {
            this.f9164c.close();
            this.f9166e = 4;
        }
    }

    @Override // p000.knr
    /* JADX INFO: renamed from: d */
    public final void mo5429d() {
        synchronized (this.f9165d) {
            this.f9164c.mo5435c();
            this.f9166e = 3;
        }
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getPreferredDevice() {
        return this.f9163b.getPreferredDevice();
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getRoutedDevice() {
        return this.f9163b.getRoutedDevice();
    }

    @Override // android.media.AudioRouting
    public final void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        this.f9163b.removeOnRoutingChangedListener(onRoutingChangedListener);
    }

    @Override // android.media.AudioRouting
    public final boolean setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        return this.f9163b.setPreferredDevice(audioDeviceInfo);
    }

    @Override // p000.knr
    /* JADX INFO: renamed from: e */
    public final khb mo5430e(ByteBuffer byteBuffer, int i) {
        synchronized (this.f9165d) {
            int i2 = this.f9166e;
            khb khbVarM5424a = null;
            if (i2 == 0) {
                throw null;
            }
            if (i2 == 4) {
                ((nbe) ((nbe) f9162a.m17252c()).mo17276G(545)).mo17290o("Ignore to read due to stream closed.");
                return null;
            }
            crp crpVar = this.f9167f;
            try {
                khbVarM5424a = crpVar.f9157b.m5424a(byteBuffer, i);
            } catch (IOException e) {
                ((nbe) ((nbe) ((nbe) crp.f9156a.m17251b()).mo17283h(e)).mo17276G((char) 544)).mo17290o("Failed to read audio packet from audio piped input stream.");
            }
            crpVar.m5423a();
            return khbVarM5424a;
        }
    }
}
