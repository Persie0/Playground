package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class du2 extends yt2 implements ca2 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f36236g = AtomicReferenceFieldUpdater.newUpdater(du2.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f36237h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f36238i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ long f36239j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ long f36240k;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = m7d.f50741a;
        f36240k = unsafe.objectFieldOffset(du2.class.getDeclaredField("_queue$volatile"));
        f36237h = AtomicReferenceFieldUpdater.newUpdater(du2.class, Object.class, "_delayed$volatile");
        f36239j = unsafe.objectFieldOffset(du2.class.getDeclaredField("_delayed$volatile"));
        f36238i = AtomicIntegerFieldUpdater.newUpdater(du2.class, "_isCompleted$volatile");
    }

    @Override // p000.ca2
    /* JADX INFO: renamed from: N */
    public final void mo4458N(long j, sm0 sm0Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            zt2 zt2Var = new zt2(this, j2 + jNanoTime, sm0Var);
            m10664w0(jNanoTime, zt2Var);
            sm0Var.m21471x(new mm0(zt2Var, 1));
        }
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: T */
    public final void mo385T(kn1 kn1Var, Runnable runnable) {
        mo10655n0(runnable);
    }

    @Override // p000.yt2
    /* JADX INFO: renamed from: j0 */
    public final long mo10652j0() {
        if (m25314k0()) {
            return 0L;
        }
        m10656o0();
        Runnable runnableM10654m0 = m10654m0();
        if (runnableM10654m0 == null) {
            return m10658q0();
        }
        runnableM10654m0.run();
        return 0L;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m10653l0() {
        du2 du2Var;
        Unsafe unsafe;
        C0842cc c0842cc = fa4.f38708c;
        while (true) {
            f36236g.getClass();
            Unsafe unsafe2 = m7d.f50741a;
            long j = f36240k;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = m7d.f50741a;
                    du2Var = this;
                    if (unsafe3.compareAndSwapObject(du2Var, f36240k, (Object) null, c0842cc)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(du2Var, j) != null) {
                        break;
                    } else {
                        this = du2Var;
                    }
                }
            } else {
                du2Var = this;
                if (objectVolatile instanceof dj5) {
                    ((dj5) objectVolatile).m10411c();
                    return;
                }
                if (objectVolatile == c0842cc) {
                    return;
                }
                dj5 dj5Var = new dj5(8, true);
                dj5Var.m10409a((Runnable) objectVolatile);
                do {
                    unsafe = m7d.f50741a;
                    if (unsafe.compareAndSwapObject(du2Var, f36240k, objectVolatile, dj5Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(du2Var, j) == objectVolatile);
            }
            this = du2Var;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final Runnable m10654m0() {
        du2 du2Var;
        Unsafe unsafe;
        while (true) {
            f36236g.getClass();
            Unsafe unsafe2 = m7d.f50741a;
            long j = f36240k;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof dj5) {
                dj5 dj5Var = (dj5) objectVolatile;
                Object objM10413e = dj5Var.m10413e();
                if (objM10413e == dj5.f35715g) {
                    dj5 dj5VarM10412d = dj5Var.m10412d();
                    while (true) {
                        Unsafe unsafe3 = m7d.f50741a;
                        du2Var = this;
                        if (unsafe3.compareAndSwapObject(du2Var, f36240k, objectVolatile, dj5VarM10412d) || unsafe3.getObjectVolatile(du2Var, j) != objectVolatile) {
                            break;
                        }
                        this = du2Var;
                    }
                } else {
                    return (Runnable) objM10413e;
                }
            } else {
                du2Var = this;
                if (objectVolatile == fa4.f38708c) {
                    return null;
                }
                do {
                    unsafe = m7d.f50741a;
                    if (unsafe.compareAndSwapObject(du2Var, f36240k, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(du2Var, j) == objectVolatile);
            }
            this = du2Var;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void mo10655n0(Runnable runnable) {
        m10656o0();
        if (!m10657p0(runnable)) {
            f62.f38512l.mo10655n0(runnable);
            return;
        }
        Thread threadMo10659r0 = mo10659r0();
        if (Thread.currentThread() != threadMo10659r0) {
            LockSupport.unpark(threadMo10659r0);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m10656o0() {
        bu2 bu2VarM22358b;
        f36237h.getClass();
        cu2 cu2Var = (cu2) m7d.f50741a.getObjectVolatile(this, f36239j);
        if (cu2Var == null || tz9.f63150b.get(cu2Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (cu2Var) {
                try {
                    bu2[] bu2VarArr = cu2Var.f63151a;
                    bu2VarM22358b = null;
                    bu2 bu2Var = bu2VarArr != null ? bu2VarArr[0] : null;
                    if (bu2Var != null) {
                        if (jNanoTime - bu2Var.f9020a >= 0 ? m10657p0(bu2Var) : false) {
                            bu2VarM22358b = cu2Var.m22358b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (bu2VarM22358b != null);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m10657p0(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            f36236g.getClass();
            Unsafe unsafe4 = m7d.f50741a;
            long j = f36240k;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (f36238i.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = m7d.f50741a;
                    if (unsafe.compareAndSwapObject(this, f36240k, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof dj5) {
                dj5 dj5Var = (dj5) objectVolatile;
                int iM10409a = dj5Var.m10409a(runnable);
                if (iM10409a == 0) {
                    return true;
                }
                if (iM10409a == 1) {
                    dj5 dj5VarM10412d = dj5Var.m10412d();
                    do {
                        unsafe2 = m7d.f50741a;
                        if (unsafe2.compareAndSwapObject(this, f36240k, objectVolatile, dj5VarM10412d)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iM10409a == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == fa4.f38708c) {
                    return false;
                }
                dj5 dj5Var2 = new dj5(8, true);
                dj5Var2.m10409a((Runnable) objectVolatile);
                dj5Var2.m10409a(runnable);
                do {
                    unsafe3 = m7d.f50741a;
                    if (unsafe3.compareAndSwapObject(this, f36240k, objectVolatile, dj5Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final long m10658q0() {
        bu2 bu2Var;
        C0825bv c0825bv = this.f70441e;
        if (((c0825bv == null || c0825bv.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            f36236g.getClass();
            Unsafe unsafe = m7d.f50741a;
            Object objectVolatile = unsafe.getObjectVolatile(this, f36240k);
            if (objectVolatile != null) {
                if (objectVolatile instanceof dj5) {
                    long j = dj5.f35714f.get((dj5) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == fa4.f38708c) {
                    return Long.MAX_VALUE;
                }
            }
            f36237h.getClass();
            cu2 cu2Var = (cu2) unsafe.getObjectVolatile(this, f36239j);
            if (cu2Var != null) {
                synchronized (cu2Var) {
                    bu2[] bu2VarArr = cu2Var.f63151a;
                    bu2Var = bu2VarArr != null ? bu2VarArr[0] : null;
                }
                if (bu2Var != null) {
                    long jNanoTime = bu2Var.f9020a - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r0 */
    public abstract Thread mo10659r0();

    /* JADX INFO: renamed from: s0 */
    public final boolean m10660s0() {
        C0825bv c0825bv = this.f70441e;
        if (c0825bv != null ? c0825bv.isEmpty() : true) {
            f36237h.getClass();
            Unsafe unsafe = m7d.f50741a;
            cu2 cu2Var = (cu2) unsafe.getObjectVolatile(this, f36239j);
            if (cu2Var != null && tz9.f63150b.get(cu2Var) != 0) {
                return false;
            }
            f36236g.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, f36240k);
            if (objectVolatile != null) {
                if (objectVolatile instanceof dj5) {
                    long j = dj5.f35714f.get((dj5) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == fa4.f38708c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.yt2
    public void shutdown() {
        qz9.f58430a.set(null);
        f36238i.set(this, 1);
        m10653l0();
        while (mo10652j0() <= 0) {
        }
        m10662u0();
    }

    /* JADX INFO: renamed from: t0 */
    public void mo10661t0(long j, bu2 bu2Var) {
        f62.f38512l.m10664w0(j, bu2Var);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m10662u0() {
        bu2 bu2VarM22358b;
        long jNanoTime = System.nanoTime();
        while (true) {
            f36237h.getClass();
            cu2 cu2Var = (cu2) m7d.f50741a.getObjectVolatile(this, f36239j);
            if (cu2Var == null) {
                return;
            }
            synchronized (cu2Var) {
                bu2VarM22358b = tz9.f63150b.get(cu2Var) > 0 ? cu2Var.m22358b(0) : null;
            }
            if (bu2VarM22358b == null) {
                return;
            } else {
                mo10661t0(jNanoTime, bu2VarM22358b);
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m10663v0() {
        f36236g.getClass();
        Unsafe unsafe = m7d.f50741a;
        unsafe.putObjectVolatile(this, f36240k, (Object) null);
        f36237h.getClass();
        unsafe.putObjectVolatile(this, f36239j, (Object) null);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m10664w0(long j, bu2 bu2Var) {
        Thread threadMo10659r0;
        int iM10665x0 = m10665x0(j, bu2Var);
        if (iM10665x0 == 0) {
            if (!m10666y0(bu2Var) || Thread.currentThread() == (threadMo10659r0 = mo10659r0())) {
                return;
            }
            LockSupport.unpark(threadMo10659r0);
            return;
        }
        if (iM10665x0 == 1) {
            mo10661t0(j, bu2Var);
        } else {
            if (iM10665x0 == 2) {
                return;
            }
            C3386nv.m17633t("unexpected result");
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final int m10665x0(long j, bu2 bu2Var) {
        du2 du2Var;
        Unsafe unsafe;
        if (f36238i.get(this) == 1) {
            return 1;
        }
        f36237h.getClass();
        Unsafe unsafe2 = m7d.f50741a;
        long j2 = f36239j;
        cu2 cu2Var = (cu2) unsafe2.getObjectVolatile(this, j2);
        if (cu2Var == null) {
            cu2 cu2Var2 = new cu2();
            cu2Var2.f34536c = j;
            while (true) {
                unsafe = m7d.f50741a;
                du2Var = this;
                if (unsafe.compareAndSwapObject(du2Var, f36239j, (Object) null, cu2Var2) || unsafe.getObjectVolatile(du2Var, j2) != null) {
                    break;
                }
                this = du2Var;
            }
            Object objectVolatile = unsafe.getObjectVolatile(du2Var, j2);
            objectVolatile.getClass();
            cu2Var = (cu2) objectVolatile;
        } else {
            du2Var = this;
        }
        return bu2Var.m4176b(j, cu2Var, du2Var);
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m10666y0(bu2 bu2Var) {
        f36237h.getClass();
        cu2 cu2Var = (cu2) m7d.f50741a.getObjectVolatile(this, f36239j);
        bu2 bu2Var2 = null;
        if (cu2Var != null) {
            synchronized (cu2Var) {
                bu2[] bu2VarArr = cu2Var.f63151a;
                bu2Var2 = bu2VarArr != null ? bu2VarArr[0] : null;
            }
        }
        return bu2Var2 == bu2Var;
    }
}
