package kotlinx.coroutines.scheduling;

import com.kochava.tracker.BuildConfig;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C7188l {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40490b = AtomicReferenceFieldUpdater.newUpdater(C7188l.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40491c = AtomicIntegerFieldUpdater.newUpdater(C7188l.class, "producerIndex");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40492d = AtomicIntegerFieldUpdater.newUpdater(C7188l.class, "consumerIndex");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40493e = AtomicIntegerFieldUpdater.newUpdater(C7188l.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray<AbstractRunnableC7182f> f40494a = new AtomicReferenceArray<>(BuildConfig.SDK_TRUNCATE_LENGTH);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC7182f m14493a(AbstractRunnableC7182f abstractRunnableC7182f, boolean z10) {
        if (z10) {
            return m14494b(abstractRunnableC7182f);
        }
        AbstractRunnableC7182f abstractRunnableC7182f2 = (AbstractRunnableC7182f) f40490b.getAndSet(this, abstractRunnableC7182f);
        if (abstractRunnableC7182f2 == null) {
            return null;
        }
        return m14494b(abstractRunnableC7182f2);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC7182f m14494b(AbstractRunnableC7182f abstractRunnableC7182f) {
        boolean z10 = true;
        if (abstractRunnableC7182f.f40479b.mo14492c() != 1) {
            z10 = false;
        }
        if (z10) {
            f40493e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return abstractRunnableC7182f;
        }
        int i10 = this.producerIndex & 127;
        while (this.f40494a.get(i10) != null) {
            Thread.yield();
        }
        this.f40494a.lazySet(i10, abstractRunnableC7182f);
        f40491c.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m14495c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractRunnableC7182f m14496d() {
        while (true) {
            while (true) {
                int i10 = this.consumerIndex;
                if (i10 - this.producerIndex == 0) {
                    return null;
                }
                int i11 = i10 & 127;
                if (f40492d.compareAndSet(this, i10, i10 + 1)) {
                    AbstractRunnableC7182f andSet = this.f40494a.getAndSet(i11, null);
                    if (andSet != null) {
                        if (andSet.f40479b.mo14492c() == 1) {
                            f40493e.decrementAndGet(this);
                        }
                        return andSet;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final long m14497e(C7188l c7188l) {
        int i10 = c7188l.consumerIndex;
        int i11 = c7188l.producerIndex;
        AtomicReferenceArray<AbstractRunnableC7182f> atomicReferenceArray = c7188l.f40494a;
        while (true) {
            boolean z10 = true;
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (c7188l.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC7182f abstractRunnableC7182f = atomicReferenceArray.get(i12);
            if (abstractRunnableC7182f != null) {
                if (abstractRunnableC7182f.f40479b.mo14492c() == 1) {
                    while (!atomicReferenceArray.compareAndSet(i12, abstractRunnableC7182f, null)) {
                        if (atomicReferenceArray.get(i12) != abstractRunnableC7182f) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        f40493e.decrementAndGet(c7188l);
                        m14493a(abstractRunnableC7182f, false);
                        return -1L;
                    }
                } else {
                    continue;
                }
            }
            i10++;
        }
        return m14498f(c7188l, true);
    }

    /* JADX INFO: renamed from: f */
    public final long m14498f(C7188l c7188l, boolean z10) {
        AbstractRunnableC7182f abstractRunnableC7182f;
        boolean z11;
        do {
            abstractRunnableC7182f = (AbstractRunnableC7182f) c7188l.lastScheduledTask;
            if (abstractRunnableC7182f == null) {
                return -2L;
            }
            z11 = true;
            if (z10) {
                if (!(abstractRunnableC7182f.f40479b.mo14492c() == 1)) {
                    return -2L;
                }
            }
            C7186j.f40486e.getClass();
            long jNanoTime = System.nanoTime() - abstractRunnableC7182f.f40478a;
            long j10 = C7186j.f40482a;
            if (jNanoTime < j10) {
                return j10 - jNanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40490b;
            while (!atomicReferenceFieldUpdater.compareAndSet(c7188l, abstractRunnableC7182f, null)) {
                if (atomicReferenceFieldUpdater.get(c7188l) != abstractRunnableC7182f) {
                    z11 = false;
                    break;
                }
            }
        } while (!z11);
        m14493a(abstractRunnableC7182f, false);
        return -1L;
    }
}
