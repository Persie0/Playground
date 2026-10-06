package p021j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.S1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0626S1 {

    /* JADX INFO: renamed from: a */
    protected final Spliterator f33350a;

    /* JADX INFO: renamed from: b */
    protected final boolean f33351b;

    /* JADX INFO: renamed from: c */
    protected final int f33352c;

    /* JADX INFO: renamed from: d */
    private final long f33353d;

    /* JADX INFO: renamed from: e */
    private final AtomicLong f33354e;

    AbstractC0626S1(Spliterator spliterator, long j, long j2) {
        this.f33350a = spliterator;
        this.f33351b = j2 < 0;
        this.f33353d = j2 >= 0 ? j2 : 0L;
        this.f33352c = 128;
        this.f33354e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    /* JADX INFO: renamed from: b */
    protected final long m12676b(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long jMin;
        do {
            atomicLong = this.f33354e;
            j2 = atomicLong.get();
            z = this.f33351b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.f33353d;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    /* JADX INFO: renamed from: c */
    protected final EnumC0623R1 m12677c() {
        if (this.f33354e.get() > 0) {
            return EnumC0623R1.MAYBE_MORE;
        }
        return this.f33351b ? EnumC0623R1.UNLIMITED : EnumC0623R1.NO_MORE;
    }

    public final int characteristics() {
        return this.f33350a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f33350a.estimateSize();
    }

    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f33354e.get() == 0 || (spliteratorTrySplit = this.f33350a.trySplit()) == null) {
            return null;
        }
        return new C0621Q1(spliteratorTrySplit, (C0621Q1) this);
    }

    AbstractC0626S1(Spliterator spliterator, AbstractC0626S1 abstractC0626S1) {
        this.f33350a = spliterator;
        this.f33351b = abstractC0626S1.f33351b;
        this.f33354e = abstractC0626S1.f33354e;
        this.f33353d = abstractC0626S1.f33353d;
        this.f33352c = abstractC0626S1.f33352c;
    }
}
