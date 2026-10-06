package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lel implements lek {

    /* JADX INFO: renamed from: a */
    public AudioRecord f38035a;

    /* JADX INFO: renamed from: b */
    public final int f38036b;

    /* JADX INFO: renamed from: c */
    private final AudioFormat f38037c;

    /* JADX INFO: renamed from: d */
    private final len f38038d;

    /* JADX INFO: renamed from: e */
    private final AtomicInteger f38039e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f */
    private final AtomicLong f38040f = new AtomicLong(0);

    /* JADX INFO: renamed from: g */
    private final AtomicLong f38041g = new AtomicLong(0);

    /* JADX INFO: renamed from: h */
    private final AtomicInteger f38042h = new AtomicInteger(0);

    /* JADX INFO: renamed from: i */
    private final AtomicInteger f38043i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j */
    private final AtomicInteger f38044j = new AtomicInteger(0);

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f38045k = new AtomicInteger(0);

    /* JADX INFO: renamed from: l */
    private final AtomicInteger f38046l = new AtomicInteger(0);

    /* JADX INFO: renamed from: m */
    private final AtomicLong f38047m = new AtomicLong(0);

    /* JADX INFO: renamed from: n */
    private final AtomicLong f38048n = new AtomicLong(0);

    /* JADX INFO: renamed from: o */
    private final AtomicLong f38049o = new AtomicLong(0);

    /* JADX INFO: renamed from: p */
    private final AtomicLong f38050p = new AtomicLong(0);

    /* JADX INFO: renamed from: q */
    private final AudioTimestamp f38051q;

    /* JADX INFO: renamed from: r */
    private long f38052r;

    public lel(AudioRecord audioRecord, int i) {
        this.f38035a = audioRecord;
        this.f38036b = i;
        AudioFormat format = audioRecord.getFormat();
        this.f38037c = format;
        this.f38038d = new len(format);
        this.f38051q = new AudioTimestamp();
    }

    /* JADX INFO: renamed from: e */
    private final void m15253e(boolean z) {
        if (z || System.currentTimeMillis() >= this.f38049o.get()) {
            String.format("  read=%d (%d bytes), maxDeltaNs=%d, noTimestamp=%d, noData=%d, noInit=%d, badOut=%d, largeGap=%d", Integer.valueOf(this.f38039e.get()), Long.valueOf(this.f38040f.get()), Long.valueOf(this.f38041g.get()), Integer.valueOf(this.f38042h.get()), Integer.valueOf(this.f38043i.get()), Integer.valueOf(this.f38044j.get()), Integer.valueOf(this.f38045k.get()), Integer.valueOf(this.f38046l.get()));
            this.f38049o.set(System.currentTimeMillis() + 5000);
        }
    }

    @Override // p000.lek
    /* JADX INFO: renamed from: a */
    public final AudioFormat mo15249a() {
        return this.f38035a.getFormat();
    }

    @Override // android.media.AudioRouting
    public final void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        this.f38035a.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // p000.lek
    /* JADX INFO: renamed from: b */
    public final synchronized lej mo15250b(ByteBuffer byteBuffer, int i) {
        int i2;
        long j;
        long j2;
        if (this.f38035a.getState() != 1) {
            this.f38044j.incrementAndGet();
            m15253e(false);
            return null;
        }
        if (byteBuffer.isDirect()) {
            i2 = this.f38035a.read(byteBuffer, i);
            this.f38039e.incrementAndGet();
            this.f38040f.addAndGet(i2);
        } else {
            if (!byteBuffer.hasArray()) {
                Log.w("AudioStreamImpl", "Provided bytebuffer unsupported.");
                this.f38045k.incrementAndGet();
                m15253e(false);
                return null;
            }
            i2 = this.f38035a.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i);
            this.f38039e.incrementAndGet();
            this.f38040f.addAndGet(i2);
        }
        if (i2 == 0) {
            this.f38043i.incrementAndGet();
            m15253e(false);
            return null;
        }
        if (this.f38035a.getTimestamp(this.f38051q, this.f38036b) != 0) {
            this.f38042h.incrementAndGet();
            m15253e(false);
            return null;
        }
        len lenVar = this.f38038d;
        AudioTimestamp audioTimestamp = this.f38051q;
        long j3 = (((long) i2) / ((long) lenVar.f38063c)) / ((long) lenVar.f38064d);
        synchronized (lenVar.f38061a) {
            long j4 = (lenVar.f38065e - audioTimestamp.framePosition) * lenVar.f38062b;
            lenVar.f38065e += j3;
            j = j4 + audioTimestamp.nanoTime;
        }
        if (j < this.f38047m.get()) {
            Log.w("AudioStreamImpl", String.format("Stale audio packet detected: %d (start=%d)", Long.valueOf(j), Long.valueOf(this.f38047m.get())));
        } else if (this.f38048n.compareAndSet(0L, j)) {
            long j5 = this.f38048n.get() - this.f38047m.get();
            String.format("First read. Start: %d ns. First packet: %d ns. Audio startup latency: %d ns (%d ms)", Long.valueOf(this.f38047m.get()), Long.valueOf(this.f38048n.get()), Long.valueOf(j5), Long.valueOf(TimeUnit.MILLISECONDS.convert(j5, TimeUnit.NANOSECONDS)));
        }
        if (j < this.f38052r) {
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(j);
            objArr[1] = Long.valueOf(this.f38052r);
            len lenVar2 = this.f38038d;
            synchronized (lenVar2.f38061a) {
                j2 = lenVar2.f38065e;
            }
            objArr[2] = Long.valueOf(j2);
            Log.w("AudioStreamImpl", String.format("Timestamp out of order: %d < %d. Frame pos=%d", objArr));
            j = this.f38052r;
            this.f38052r = 100000 + j;
        } else {
            this.f38052r = 100000 + j;
        }
        long j6 = this.f38050p.get();
        if (j6 <= 0) {
            j6 = j;
        }
        long j7 = j - j6;
        if (j7 >= 100000000) {
            Log.w("AudioStreamImpl", String.format("Large audio timestamp gap detected: %d ns (packet %d)", Long.valueOf(j7), Integer.valueOf(this.f38039e.get())));
            this.f38046l.incrementAndGet();
        }
        AtomicLong atomicLong = this.f38041g;
        atomicLong.set(Math.max(atomicLong.get(), j7));
        this.f38050p.set(j);
        m15253e(false);
        byteBuffer.order(ByteOrder.nativeOrder());
        return lej.m15248a(byteBuffer, i2, j);
    }

    @Override // p000.lek
    /* JADX INFO: renamed from: c */
    public final synchronized void mo15251c() {
        this.f38052r = 0L;
        len lenVar = this.f38038d;
        synchronized (lenVar.f38061a) {
            lenVar.f38065e = 0L;
        }
        if (this.f38035a.getState() != 1) {
            int audioSource = this.f38035a.getAudioSource();
            int sampleRate = this.f38035a.getSampleRate();
            int channelConfiguration = this.f38035a.getChannelConfiguration();
            int audioFormat = this.f38035a.getAudioFormat();
            int bufferSizeInFrames = this.f38035a.getBufferSizeInFrames() * len.m15256a(this.f38035a.getFormat()) * Math.max(1, this.f38035a.getChannelCount());
            this.f38035a.release();
            Log.w("AudioStreamImpl", PMZiHihxLGEy.AWgXNyDKJhe);
            this.f38035a = new AudioRecord(audioSource, sampleRate, channelConfiguration, audioFormat, bufferSizeInFrames);
        }
        if (this.f38035a.getState() != 1) {
            Log.e("AudioStreamImpl", "Could not start AudioStream since it is not initialized.");
        } else {
            this.f38035a.startRecording();
            this.f38047m.set(this.f38036b == 1 ? SystemClock.elapsedRealtimeNanos() : System.nanoTime());
        }
    }

    @Override // p000.lek, java.lang.AutoCloseable
    public final synchronized void close() {
        m15253e(true);
        this.f38035a.release();
    }

    @Override // p000.lek
    /* JADX INFO: renamed from: d */
    public final synchronized void mo15252d() {
        try {
            m15253e(true);
            this.f38035a.stop();
            this.f38039e.set(0);
            this.f38040f.set(0L);
            this.f38041g.set(0L);
            this.f38042h.set(0);
            this.f38043i.set(0);
            this.f38044j.set(0);
            this.f38045k.set(0);
            this.f38046l.set(0);
            this.f38049o.set(0L);
            this.f38050p.set(0L);
            this.f38047m.set(0L);
            this.f38048n.set(0L);
        } catch (IllegalStateException e) {
            Log.w("AudioStreamImpl", "Error while closing AudioStream.", e);
        }
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getPreferredDevice() {
        return this.f38035a.getPreferredDevice();
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getRoutedDevice() {
        return this.f38035a.getRoutedDevice();
    }

    @Override // android.media.AudioRouting
    public final void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        this.f38035a.removeOnRoutingChangedListener(onRoutingChangedListener);
    }

    @Override // android.media.AudioRouting
    public final boolean setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        return this.f38035a.setPreferredDevice(audioDeviceInfo);
    }
}
