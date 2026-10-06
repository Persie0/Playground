package p000;

import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p021j$.time.Duration;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqh extends Thread {

    /* JADX INFO: renamed from: a */
    public static final nbh f41366a = nbh.m17259h("com/google/babelfish/device/avenh/l2l/videoresampler/StoredVideoFrameProcessor");

    /* JADX INFO: renamed from: b */
    public final mqe f41367b;

    /* JADX INFO: renamed from: c */
    public final mqf f41368c;

    /* JADX INFO: renamed from: d */
    public final mqf f41369d;

    /* JADX INFO: renamed from: e */
    public final mqg f41370e;

    /* JADX INFO: renamed from: g */
    public Instant f41372g;

    /* JADX INFO: renamed from: h */
    public Instant f41373h;

    /* JADX INFO: renamed from: j */
    public final int f41375j;

    /* JADX INFO: renamed from: k */
    public final liv f41376k;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f41371f = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final AtomicReference f41374i = new AtomicReference();

    public mqh(mqe mqeVar, liv livVar, mqg mqgVar, byte[] bArr) {
        new ConcurrentLinkedQueue();
        this.f41375j = 1;
        this.f41367b = mqeVar;
        this.f41368c = new mqf(mqeVar.f41355c);
        this.f41369d = new mqf(mqeVar.f41355c);
        this.f41376k = livVar;
        this.f41370e = mqgVar;
        this.f41372g = Instant.EPOCH;
        this.f41373h = Instant.EPOCH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.Choreographer$FrameCallback, mqg] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f41371f.set(true);
        ?? r0 = this.f41370e;
        Duration durationOfNanos = Duration.ofNanos(1000000000 / ((long) this.f41367b.f41353a));
        mqc mqcVar = (mqc) r0;
        mqcVar.f41338d = this;
        mqcVar.f41335a = durationOfNanos;
        mqcVar.f41337c.set(false);
        Looper.prepare();
        Choreographer.getInstance().postFrameCallback(r0);
        Looper.loop();
    }
}
