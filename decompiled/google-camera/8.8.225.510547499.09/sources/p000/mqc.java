package p000;

import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.time.Duration;
import p021j$.time.Instant;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqc implements Choreographer.FrameCallback, mqg {

    /* JADX INFO: renamed from: a */
    public Duration f41335a;

    /* JADX INFO: renamed from: d */
    public mqh f41338d;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f41336b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f41337c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    private Instant f41339e = Instant.EPOCH;

    /* JADX INFO: renamed from: f */
    private int f41340f = 0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Optional optionalOfNullable;
        if (!this.f41336b.get() && !this.f41337c.get()) {
            long j2 = j / 1000000000;
            Instant instantOfEpochSecond = Instant.ofEpochSecond(j2, j - (1000000000 * j2));
            if (this.f41339e.equals(Instant.EPOCH)) {
                this.f41339e = instantOfEpochSecond;
            }
            if (Duration.between(this.f41339e, instantOfEpochSecond).compareTo(this.f41335a.multipliedBy(this.f41340f + 1).minusNanos(2000000L)) >= 0) {
                this.f41340f++;
                mqh mqhVar = this.f41338d;
                if (mqhVar.f41367b.f41354b) {
                    mqhVar.f41369d.m16805b();
                    nnf nnfVar = nnf.INSTANCE;
                    Instant instantNow = Instant.now();
                    if ((mqhVar.f41373h.isAfter(Instant.EPOCH) ? Duration.between(mqhVar.f41373h, instantNow) : mqhVar.f41367b.f41360h.plusSeconds(1L)).compareTo(mqhVar.f41367b.f41360h) >= 0) {
                        mqhVar.f41373h = instantNow;
                        double dM16804a = mqhVar.f41369d.m16804a();
                        mqe mqeVar = mqhVar.f41367b;
                        double d = mqeVar.f41358f;
                        double d2 = mqeVar.f41359g;
                        if (dM16804a < d || dM16804a > d2) {
                            liv livVar = mqhVar.f41376k;
                            ((nbe) ((nbe) mqh.f41366a.m17252c()).mo17276G((char) 4596)).mo17293r("%s", "StoredVideoFrameProcessor: current output FPS (" + ((int) dM16804a) + ") is outside the allowed range (" + ((int) d) + ", " + ((int) d2) + ").");
                            ((nbe) ((nbe) mqh.f41366a.m17252c()).mo17276G((char) 4597)).mo17290o("SVFP: Output FPS warning");
                        }
                    }
                }
                int i = mqhVar.f41375j;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 0:
                        optionalOfNullable = Optional.ofNullable((mqi) mqhVar.f41374i.get());
                        break;
                    default:
                        optionalOfNullable = Optional.empty();
                        break;
                }
                liv livVar2 = mqhVar.f41376k;
                livVar2.getClass();
                optionalOfNullable.ifPresent(new idi(livVar2, 10, null));
            }
        }
        if (!this.f41336b.get()) {
            Choreographer.getInstance().postFrameCallback(this);
        } else {
            Choreographer.getInstance().removeFrameCallback(this);
            Looper.myLooper().quitSafely();
        }
    }
}
