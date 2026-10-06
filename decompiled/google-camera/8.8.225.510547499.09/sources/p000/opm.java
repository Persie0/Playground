package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opm {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final AtomicLongFieldUpdater f46393a = AtomicLongFieldUpdater.newUpdater(opm.class, "b");

    /* JADX INFO: renamed from: b */
    public volatile long f46394b;

    /* JADX INFO: renamed from: c */
    public final ooc f46395c;

    public opm(long j, ooc oocVar, byte[] bArr, byte[] bArr2) {
        this.f46395c = oocVar;
        this.f46394b = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m18849a(long j) {
        return f46393a.addAndGet(this, j);
    }

    /* JADX INFO: renamed from: b */
    public final long m18850b() {
        return f46393a.getAndIncrement(this);
    }

    /* JADX INFO: renamed from: c */
    public final long m18851c() {
        return f46393a.incrementAndGet(this);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18852d(long j, long j2) {
        boolean zCompareAndSet = f46393a.compareAndSet(this, j, j2);
        if (!zCompareAndSet || this.f46395c == opo.f46399a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f46394b);
    }
}
