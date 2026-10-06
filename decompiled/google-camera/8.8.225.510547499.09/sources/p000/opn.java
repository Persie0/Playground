package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opn {

    /* JADX INFO: renamed from: b */
    @Deprecated
    private static final AtomicReferenceFieldUpdater f46396b = AtomicReferenceFieldUpdater.newUpdater(opn.class, Object.class, "a");

    /* JADX INFO: renamed from: a */
    public volatile Object f46397a;

    /* JADX INFO: renamed from: c */
    private final ooc f46398c;

    public opn(Object obj, ooc oocVar, byte[] bArr, byte[] bArr2) {
        this.f46398c = oocVar;
        this.f46397a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m18853a(Object obj) {
        Object andSet = f46396b.getAndSet(this, obj);
        if (this.f46398c != opo.f46399a) {
            StringBuilder sb = new StringBuilder();
            sb.append("getAndSet(");
            sb.append(obj);
            sb.append("):");
            sb.append(andSet);
        }
        return andSet;
    }

    /* JADX INFO: renamed from: b */
    public final void m18854b(Object obj) {
        f46396b.lazySet(this, obj);
        if (this.f46398c != opo.f46399a) {
            StringBuilder sb = new StringBuilder();
            sb.append("lazySet(");
            sb.append(obj);
            sb.append(")");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18855c(Object obj) {
        this.f46397a = obj;
        if (this.f46398c != opo.f46399a) {
            StringBuilder sb = new StringBuilder();
            sb.append("set(");
            sb.append(obj);
            sb.append(")");
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18856d(Object obj, Object obj2) {
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46396b;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, obj2)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                z = false;
                break;
            }
        }
        if (!z || this.f46398c == opo.f46399a) {
            return z;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CAS(");
        sb.append(obj);
        sb.append(", ");
        sb.append(obj2);
        sb.append(")");
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f46397a);
    }
}
