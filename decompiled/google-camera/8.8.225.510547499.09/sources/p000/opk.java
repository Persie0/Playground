package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opk {

    /* JADX INFO: renamed from: a */
    @Deprecated
    private static final AtomicIntegerFieldUpdater f46387a = AtomicIntegerFieldUpdater.newUpdater(opk.class, "b");

    /* JADX INFO: renamed from: b */
    private volatile int f46388b;

    /* JADX INFO: renamed from: c */
    private final ooc f46389c;

    public opk(boolean z, ooc oocVar, byte[] bArr, byte[] bArr2) {
        this.f46389c = oocVar;
        this.f46388b = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18842a() {
        return this.f46388b != 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18843b() {
        boolean zCompareAndSet = f46387a.compareAndSet(this, 0, 1);
        if (!zCompareAndSet || this.f46389c == opo.f46399a) {
            return zCompareAndSet;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m18844c() {
        this.f46388b = 1;
    }

    public final String toString() {
        return String.valueOf(m18842a());
    }
}
