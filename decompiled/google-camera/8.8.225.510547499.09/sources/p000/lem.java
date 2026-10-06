package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lem implements lek {

    /* JADX INFO: renamed from: a */
    private final lek f38053a;

    /* JADX INFO: renamed from: b */
    private final ExecutorService f38054b;

    /* JADX INFO: renamed from: c */
    private final int f38055c;

    /* JADX INFO: renamed from: d */
    private final long f38056d;

    /* JADX INFO: renamed from: e */
    private long f38057e = 0;

    /* JADX INFO: renamed from: f */
    private long f38058f = 0;

    /* JADX INFO: renamed from: g */
    private volatile Future f38059g = null;

    /* JADX INFO: renamed from: h */
    private volatile boolean f38060h = false;

    public lem(lek lekVar, ExecutorService executorService) {
        this.f38053a = lekVar;
        this.f38054b = executorService;
        this.f38055c = len.m15256a(lekVar.mo15249a()) * Math.max(1, lekVar.mo15249a().getChannelCount());
        this.f38056d = 1000000000 / ((long) lekVar.mo15249a().getSampleRate());
    }

    /* JADX INFO: renamed from: e */
    private final long m15254e() {
        switch (((lel) this.f38053a).f38036b) {
            case 0:
                return System.nanoTime();
            default:
                return SystemClock.elapsedRealtimeNanos();
        }
    }

    /* JADX INFO: renamed from: f */
    private final synchronized void m15255f() {
        if (this.f38060h) {
            kxk.m14974T(this.f38059g);
        }
    }

    @Override // p000.lek
    /* JADX INFO: renamed from: a */
    public final AudioFormat mo15249a() {
        throw null;
    }

    @Override // android.media.AudioRouting
    public final void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        this.f38053a.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // p000.lek
    /* JADX INFO: renamed from: b */
    public final synchronized lej mo15250b(ByteBuffer byteBuffer, int i) {
        lej lejVarMo15250b;
        if (!this.f38060h) {
            return null;
        }
        if (this.f38059g.isDone()) {
            do {
                lejVarMo15250b = this.f38053a.mo15250b(byteBuffer, i);
                if (lejVarMo15250b == null) {
                    return null;
                }
            } while (lejVarMo15250b.f38034c < this.f38057e);
            return lejVarMo15250b;
        }
        long jM15254e = this.f38057e;
        if (jM15254e == 0) {
            jM15254e = m15254e();
            this.f38057e = jM15254e;
        }
        if (jM15254e > m15254e()) {
            return null;
        }
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        int i2 = i / this.f38055c;
        audioTimestamp.framePosition = this.f38058f;
        audioTimestamp.nanoTime = this.f38057e;
        lej lejVarM15248a = lej.m15248a(byteBuffer, i, this.f38057e);
        long j = i2;
        this.f38058f += j;
        long j2 = this.f38057e;
        long j3 = this.f38056d;
        Long.signum(j);
        this.f38057e = j2 + (j * j3);
        byteBuffer.rewind();
        byteBuffer.put(new byte[i]);
        return lejVarM15248a;
    }

    @Override // p000.lek
    /* JADX INFO: renamed from: c */
    public final synchronized void mo15251c() {
        if (this.f38060h) {
            Log.w(qQLA.EcnmRfupLzrjKpt, zuAgeeF.xqPf);
        } else {
            this.f38060h = true;
            this.f38059g = this.f38054b.submit(new kxw(this.f38053a, 11));
        }
    }

    @Override // p000.lek, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f38060h) {
            mo15252d();
        }
        this.f38053a.close();
    }

    @Override // p000.lek
    /* JADX INFO: renamed from: d */
    public final synchronized void mo15252d() {
        if (!this.f38060h) {
            Log.w("SSAudioStream", "Trying to stop an un-started AudioStream.");
            return;
        }
        m15255f();
        this.f38053a.mo15252d();
        this.f38060h = false;
        this.f38059g = null;
        this.f38057e = 0L;
        this.f38058f = 0L;
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getPreferredDevice() {
        return this.f38053a.getPreferredDevice();
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getRoutedDevice() {
        return this.f38053a.getRoutedDevice();
    }

    @Override // android.media.AudioRouting
    public final void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        this.f38053a.removeOnRoutingChangedListener(onRoutingChangedListener);
    }

    @Override // android.media.AudioRouting
    public final boolean setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        return this.f38053a.setPreferredDevice(audioDeviceInfo);
    }
}
