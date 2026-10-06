package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opl {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final AtomicIntegerFieldUpdater f46390a = AtomicIntegerFieldUpdater.newUpdater(opl.class, "b");

    /* JADX INFO: renamed from: b */
    public volatile int f46391b;

    /* JADX INFO: renamed from: c */
    public final ooc f46392c;

    public opl(int i, ooc oocVar, byte[] bArr, byte[] bArr2) {
        this.f46392c = oocVar;
        this.f46391b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m18845a() {
        return f46390a.getAndDecrement(this);
    }

    /* JADX INFO: renamed from: b */
    public final int m18846b() {
        return f46390a.incrementAndGet(this);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18847c(int i, int i2) {
        boolean zCompareAndSet = f46390a.compareAndSet(this, i, i2);
        if (!zCompareAndSet || this.f46392c == opo.f46399a) {
            return zCompareAndSet;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m18848d() {
        f46390a.decrementAndGet(this);
    }

    public final String toString() {
        return String.valueOf(this.f46391b);
    }
}
