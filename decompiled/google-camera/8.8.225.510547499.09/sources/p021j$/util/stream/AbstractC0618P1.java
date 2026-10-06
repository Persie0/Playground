package p021j$.util.stream;

import p021j$.util.InterfaceC0498A;
import p021j$.util.InterfaceC0569r;
import p021j$.util.InterfaceC0728u;
import p021j$.util.InterfaceC0731x;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.P1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0618P1 {

    /* JADX INFO: renamed from: a */
    final long f33337a;

    /* JADX INFO: renamed from: b */
    final long f33338b;

    /* JADX INFO: renamed from: c */
    Spliterator f33339c;

    /* JADX INFO: renamed from: d */
    long f33340d;

    /* JADX INFO: renamed from: e */
    long f33341e;

    AbstractC0618P1(Spliterator spliterator, long j, long j2, long j3, long j4) {
        this.f33339c = spliterator;
        this.f33337a = j;
        this.f33338b = j2;
        this.f33340d = j3;
        this.f33341e = j4;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Spliterator mo12668a(Spliterator spliterator, long j, long j2, long j3, long j4);

    public final int characteristics() {
        return this.f33339c.characteristics();
    }

    public final long estimateSize() {
        long j = this.f33341e;
        long j2 = this.f33337a;
        if (j2 < j) {
            return j - Math.max(j2, this.f33340d);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC0569r m19853trySplit() {
        return (InterfaceC0569r) m19852trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC0728u m19854trySplit() {
        return (InterfaceC0728u) m19852trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC0731x m19855trySplit() {
        return (InterfaceC0731x) m19852trySplit();
    }

    public /* bridge */ /* synthetic */ InterfaceC0498A trySplit() {
        return (InterfaceC0498A) m19852trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m19852trySplit() {
        long j = this.f33341e;
        if (this.f33337a >= j || this.f33340d >= j) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f33339c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f33340d;
            long jMin = Math.min(jEstimateSize, this.f33338b);
            long j2 = this.f33337a;
            if (j2 >= jMin) {
                this.f33340d = jMin;
            } else {
                long j3 = this.f33338b;
                if (jMin < j3) {
                    long j4 = this.f33340d;
                    if (j4 < j2 || jEstimateSize > j3) {
                        this.f33340d = jMin;
                        return mo12668a(spliteratorTrySplit, j2, j3, j4, jMin);
                    }
                    this.f33340d = jMin;
                    return spliteratorTrySplit;
                }
                this.f33339c = spliteratorTrySplit;
                this.f33341e = jMin;
            }
        }
    }
}
