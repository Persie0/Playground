package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class j8b {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f45224a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45219b = AtomicReferenceFieldUpdater.newUpdater(j8b.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f45223f = m7d.f50741a.objectFieldOffset(j8b.class.getDeclaredField("lastScheduledTask$volatile"));

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45220c = AtomicIntegerFieldUpdater.newUpdater(j8b.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45221d = AtomicIntegerFieldUpdater.newUpdater(j8b.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45222e = AtomicIntegerFieldUpdater.newUpdater(j8b.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final rr9 m14329a(rr9 rr9Var, boolean z) {
        if (z) {
            return m14330b(rr9Var);
        }
        f45219b.getClass();
        rr9 rr9Var2 = (rr9) m7d.f50741a.getAndSetObject(this, f45223f, rr9Var);
        if (rr9Var2 == null) {
            return null;
        }
        return m14330b(rr9Var2);
    }

    /* JADX INFO: renamed from: b */
    public final rr9 m14330b(rr9 rr9Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f45220c;
        if (atomicIntegerFieldUpdater.get(this) - f45221d.get(this) == 127) {
            return rr9Var;
        }
        if (rr9Var.f59743b) {
            f45222e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f45224a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, rr9Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m14331c() {
        f45219b.getClass();
        Object objectVolatile = m7d.f50741a.getObjectVolatile(this, f45223f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f45221d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f45220c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m14332d(vn3 vn3Var) {
        f45219b.getClass();
        rr9 rr9Var = (rr9) m7d.f50741a.getAndSetObject(this, f45223f, (Object) null);
        if (rr9Var != null) {
            vn3Var.m3776a(rr9Var);
        }
        while (true) {
            rr9 rr9VarM14334f = m14334f();
            if (rr9VarM14334f == null) {
                return;
            } else {
                vn3Var.m3776a(rr9VarM14334f);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final rr9 m14333e() {
        f45219b.getClass();
        rr9 rr9Var = (rr9) m7d.f50741a.getAndSetObject(this, f45223f, (Object) null);
        return rr9Var == null ? m14334f() : rr9Var;
    }

    /* JADX INFO: renamed from: f */
    public final rr9 m14334f() {
        rr9 rr9Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f45221d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f45220c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (rr9Var = (rr9) this.f45224a.getAndSet(i2, null)) != null) {
                if (rr9Var.f59743b) {
                    f45222e.decrementAndGet(this);
                }
                return rr9Var;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final rr9 m14335g() {
        j8b j8bVar;
        while (true) {
            f45219b.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f45223f;
            rr9 rr9Var = (rr9) unsafe.getObjectVolatile(this, j);
            if (rr9Var == null || !rr9Var.f59743b) {
                break;
            }
            while (true) {
                Unsafe unsafe2 = m7d.f50741a;
                j8bVar = this;
                if (unsafe2.compareAndSwapObject(j8bVar, f45223f, rr9Var, (Object) null)) {
                    return rr9Var;
                }
                if (unsafe2.getObjectVolatile(j8bVar, j) != rr9Var) {
                    break;
                }
                this = j8bVar;
            }
            this = j8bVar;
        }
        j8b j8bVar2 = this;
        int i = f45221d.get(j8bVar2);
        int i2 = f45220c.get(j8bVar2);
        while (i != i2 && f45222e.get(j8bVar2) != 0) {
            i2--;
            rr9 rr9VarM14336h = j8bVar2.m14336h(i2, true);
            if (rr9VarM14336h != null) {
                return rr9VarM14336h;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final rr9 m14336h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f45224a;
        rr9 rr9Var = (rr9) atomicReferenceArray.get(i2);
        if (rr9Var != null && rr9Var.f59743b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, rr9Var, null)) {
                if (atomicReferenceArray.get(i2) != rr9Var) {
                }
            }
            if (z) {
                f45222e.decrementAndGet(this);
            }
            return rr9Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final long m14337i(int i, Ref$ObjectRef ref$ObjectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        rr9 rr9Var;
        do {
            atomicReferenceFieldUpdater = f45219b;
            atomicReferenceFieldUpdater.getClass();
            rr9Var = (rr9) m7d.f50741a.getObjectVolatile(this, f45223f);
            if (rr9Var == null) {
                return -2L;
            }
            if (((rr9Var.f59743b ? 1 : 2) & i) == 0) {
                return -2L;
            }
            bs9.f8955f.getClass();
            long jNanoTime = System.nanoTime() - rr9Var.f59742a;
            long j = bs9.f8951b;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
        } while (!e65.m10894z(atomicReferenceFieldUpdater, this, rr9Var));
        ref$ObjectRef.f47718a = rr9Var;
        return -1L;
    }
}
