package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class gc5 extends nn1 implements ca2 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40532h = AtomicIntegerFieldUpdater.newUpdater(gc5.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ca2 f40533c;

    /* JADX INFO: renamed from: d */
    public final nn1 f40534d;

    /* JADX INFO: renamed from: e */
    public final int f40535e;

    /* JADX INFO: renamed from: f */
    public final bj5 f40536f;

    /* JADX INFO: renamed from: g */
    public final Object f40537g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public gc5(nn1 nn1Var, int i) {
        ca2 ca2Var = nn1Var instanceof ca2 ? (ca2) nn1Var : null;
        this.f40533c = ca2Var == null ? g62.f40259a : ca2Var;
        this.f40534d = nn1Var;
        this.f40535e = i;
        this.f40536f = new bj5();
        this.f40537g = new Object();
    }

    @Override // p000.ca2
    /* JADX INFO: renamed from: N */
    public final void mo4458N(long j, sm0 sm0Var) {
        this.f40533c.mo4458N(j, sm0Var);
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: T */
    public final void mo385T(kn1 kn1Var, Runnable runnable) {
        Runnable runnableM12477g0;
        this.f40536f.m3776a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f40532h;
        if (atomicIntegerFieldUpdater.get(this) >= this.f40535e || !m12478h0() || (runnableM12477g0 = m12477g0()) == null) {
            return;
        }
        try {
            eh0.m11117N(this.f40534d, this, new u62(1, this, runnableM12477g0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: W */
    public final void mo386W(kn1 kn1Var, Runnable runnable) {
        Runnable runnableM12477g0;
        this.f40536f.m3776a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f40532h;
        if (atomicIntegerFieldUpdater.get(this) >= this.f40535e || !m12478h0() || (runnableM12477g0 = m12477g0()) == null) {
            return;
        }
        try {
            this.f40534d.mo386W(this, new u62(1, this, runnableM12477g0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: Z */
    public final nn1 mo387Z(int i) {
        l70.m15942e(1);
        return 1 >= this.f40535e ? this : super.mo387Z(1);
    }

    /* JADX INFO: renamed from: g0 */
    public final Runnable m12477g0() {
        while (true) {
            Runnable runnable = (Runnable) this.f40536f.m3779d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f40537g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f40532h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f40536f.m3778c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m12478h0() {
        synchronized (this.f40537g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f40532h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f40535e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // p000.nn1
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40534d);
        sb.append(".limitedParallelism(");
        return wq1.m24122r(sb, this.f40535e, ')');
    }

    @Override // p000.ca2
    /* JADX INFO: renamed from: x */
    public final ci2 mo4459x(long j, Runnable runnable, kn1 kn1Var) {
        return this.f40533c.mo4459x(j, runnable, kn1Var);
    }
}
