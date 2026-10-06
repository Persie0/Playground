package p000;

import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyj implements Executor, Closeable {

    /* JADX INFO: renamed from: a */
    public static final oxz f46829a = new oxz("NOT_IN_STACK");

    /* JADX INFO: renamed from: b */
    public final int f46830b;

    /* JADX INFO: renamed from: c */
    public final int f46831c;

    /* JADX INFO: renamed from: d */
    public final long f46832d;

    /* JADX INFO: renamed from: e */
    public final String f46833e = "DefaultDispatcher";

    /* JADX INFO: renamed from: f */
    public final opm f46834f;

    /* JADX INFO: renamed from: g */
    public final oxv f46835g;

    /* JADX INFO: renamed from: h */
    public final opm f46836h;

    /* JADX INFO: renamed from: i */
    public final liv f46837i;

    /* JADX INFO: renamed from: j */
    public final liv f46838j;

    /* JADX INFO: renamed from: k */
    private final opk f46839k;

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m19182e(oyj oyjVar, Runnable runnable) {
        oyjVar.m19192d(runnable, oyq.f46853e);
    }

    /* JADX INFO: renamed from: f */
    public static final void m19183f(oyn oynVar) {
        oynVar.getClass();
        try {
            oynVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    /* JADX INFO: renamed from: g */
    private final int m19184g() {
        synchronized (this.f46835g) {
            if (m19191c()) {
                return -1;
            }
            long j = this.f46836h.f46394b;
            int i = (int) ((j & 4398044413952L) >> 21);
            int i2 = (int) (j & 2097151);
            int iM18789c = ook.m18789c(i2 - i, 0);
            if (iM18789c >= this.f46830b) {
                return 0;
            }
            if (i2 >= this.f46831c) {
                return 0;
            }
            int i3 = ((int) (this.f46836h.f46394b & 2097151)) + 1;
            if (this.f46835g.m19152a(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            oyi oyiVar = new oyi(this, i3);
            this.f46835g.m19153b(i3, oyiVar);
            if (i3 != ((int) (2097151 & this.f46836h.m18851c()))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            oyiVar.start();
            return iM18789c + 1;
        }
    }

    /* JADX INFO: renamed from: h */
    private final oyi m19185h() {
        Thread threadCurrentThread = Thread.currentThread();
        oyi oyiVar = threadCurrentThread instanceof oyi ? (oyi) threadCurrentThread : null;
        if (oyiVar == null || !ooc.m18737c(oyiVar.f46823c, this)) {
            return null;
        }
        return oyiVar;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m19186i(long j) {
        if (ook.m18789c(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0) < this.f46830b) {
            int iM19184g = m19184g();
            if (iM19184g == 1) {
                if (this.f46830b > 1) {
                    m19184g();
                }
            } else if (iM19184g <= 0) {
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m19187j() {
        oyi oyiVar;
        do {
            opm opmVar = this.f46834f;
            while (true) {
                long j = opmVar.f46394b;
                oyiVar = (oyi) this.f46835g.m19152a((int) (2097151 & j));
                if (oyiVar != null) {
                    long j2 = 2097152 + j;
                    int iM19188k = m19188k(oyiVar);
                    if (iM19188k >= 0 && this.f46834f.m18852d(j, (j2 & (-2097152)) | ((long) iM19188k))) {
                        oyiVar.nextParkedWorker = f46829a;
                        break;
                    }
                } else {
                    oyiVar = null;
                    break;
                }
            }
            if (oyiVar == null) {
                return false;
            }
        } while (!oyiVar.f46821a.m18847c(-1, 0));
        LockSupport.unpark(oyiVar);
        return true;
    }

    /* JADX INFO: renamed from: k */
    private static final int m19188k(oyi oyiVar) {
        int i;
        do {
            Object obj = oyiVar.nextParkedWorker;
            if (obj == f46829a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            oyiVar = (oyi) obj;
            i = oyiVar.indexInArray;
        } while (i == 0);
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final void m19189a(oyi oyiVar, int i, int i2) {
        opm opmVar = this.f46834f;
        while (true) {
            long j = opmVar.f46394b;
            long j2 = 2097152 + j;
            int iM19188k = (int) (2097151 & j);
            if (iM19188k == i) {
                iM19188k = i2 == 0 ? m19188k(oyiVar) : i2;
            }
            if (iM19188k >= 0 && this.f46834f.m18852d(j, (j2 & (-2097152)) | ((long) iM19188k))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19190b() {
        if (m19187j() || m19186i(this.f46836h.f46394b)) {
            return;
        }
        m19187j();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19191c() {
        return this.f46839k.m18842a();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        oyn oynVarM19179b;
        if (this.f46839k.m18843b()) {
            oyi oyiVarM19185h = m19185h();
            synchronized (this.f46835g) {
                j = this.f46836h.f46394b & 2097151;
            }
            int i = (int) j;
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    Object objM19152a = this.f46835g.m19152a(i2);
                    objM19152a.getClass();
                    oyi oyiVar = (oyi) objM19152a;
                    if (oyiVar != oyiVarM19185h) {
                        while (oyiVar.isAlive()) {
                            LockSupport.unpark(oyiVar);
                            oyiVar.join(10000L);
                        }
                        boolean z = oqu.f46432a;
                        drj drjVar = oyiVar.f46825e;
                        liv livVar = this.f46838j;
                        oyn oynVar = (oyn) ((opn) drjVar.f12395a).m18853a(null);
                        if (oynVar != null) {
                            livVar.m15485h(oynVar);
                        }
                        while (true) {
                            oyn oynVarM6631k = drjVar.m6631k();
                            if (oynVarM6631k == null) {
                                break;
                            } else {
                                livVar.m15485h(oynVarM6631k);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f46838j.m15484g();
            this.f46837i.m15484g();
            while (true) {
                if (oyiVarM19185h == null) {
                    oynVarM19179b = (oyn) this.f46837i.m15483f();
                    if (oynVarM19179b == null && (oynVarM19179b = (oyn) this.f46838j.m15483f()) == null) {
                        break;
                    }
                } else {
                    oynVarM19179b = oyiVarM19185h.m19179b(true);
                    if (oynVarM19179b == null) {
                        oynVarM19179b = (oyn) this.f46837i.m15483f();
                        if (oynVarM19179b == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                m19183f(oynVarM19179b);
            }
            if (oyiVarM19185h != null) {
                oyiVarM19185h.m19181d(5);
            }
            boolean z2 = oqu.f46432a;
            this.f46834f.f46394b = 0L;
            this.f46836h.f46394b = 0L;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19192d(Runnable runnable, oyo oyoVar) {
        oyn oypVar;
        oyn oynVarM6632l;
        int i;
        oyoVar.getClass();
        long j = oyq.f46849a;
        long jNanoTime = System.nanoTime();
        if (runnable instanceof oyn) {
            oypVar = (oyn) runnable;
            oypVar.f46844g = jNanoTime;
            oypVar.f46845h = oyoVar;
        } else {
            oypVar = new oyp(runnable, jNanoTime, oyoVar);
        }
        oyi oyiVarM19185h = m19185h();
        if (oyiVarM19185h == null || (i = oyiVarM19185h.f46824d) == 5 || (oypVar.f46845h.f46847a == 0 && i == 2)) {
            oynVarM6632l = oypVar;
        } else {
            oyiVarM19185h.f46822b = true;
            oynVarM6632l = oyiVarM19185h.f46825e.m6632l(oypVar);
        }
        if (oynVarM6632l != null) {
            if (!(oynVarM6632l.f46845h.f46847a == 1 ? this.f46838j.m15485h(oynVarM6632l) : this.f46837i.m15485h(oynVarM6632l))) {
                throw new RejectedExecutionException(this.f46833e.concat(" was terminated"));
            }
        }
        if (oypVar.f46845h.f46847a == 0) {
            m19190b();
            return;
        }
        long jM18849a = this.f46836h.m18849a(2097152L);
        if (m19187j() || m19186i(jM18849a)) {
            return;
        }
        m19187j();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        m19182e(this, runnable);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.f46835g.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            oyi oyiVar = (oyi) this.f46835g.m19152a(i6);
            if (oyiVar != null) {
                drj drjVar = oyiVar.f46825e;
                int iM6629i = ((opn) drjVar.f12395a).f46397a != null ? drjVar.m6629i() + 1 : drjVar.m6629i();
                int i7 = oyiVar.f46824d;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                switch (i8) {
                    case 0:
                        arrayList.add(iM6629i + aJFPpVSaoDO.sZixzN);
                        i++;
                        break;
                    case 1:
                        arrayList.add(iM6629i + "b");
                        i2++;
                        break;
                    case 2:
                        i3++;
                        break;
                    case 3:
                        i4++;
                        if (iM6629i > 0) {
                            arrayList.add(iM6629i + "d");
                        }
                        break;
                    case 4:
                        i5++;
                        break;
                }
            }
        }
        long j = this.f46836h.f46394b;
        int i9 = i4;
        long j2 = j & 2097151;
        long j3 = 4398044413952L & j;
        return this.f46833e + "@" + oqv.m18921b(this) + "[Pool Size {core = " + this.f46830b + ", max = " + this.f46831c + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i9 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f46837i.m15482e() + ", global blocking queue size = " + this.f46838j.m15482e() + ", Control State {created workers= " + ((int) j2) + ", blocking tasks = " + ((int) (j3 >> 21)) + ", CPUs acquired = " + (this.f46830b - ((int) ((j & 9223367638808264704L) >> 42))) + "}]";
    }

    public oyj(int i, int i2, long j) {
        this.f46830b = i;
        this.f46831c = i2;
        this.f46832d = j;
        if (i <= 0) {
            throw new IllegalArgumentException("Core pool size " + i + " should be at least 1");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Max pool size " + i2 + " should be greater than or equals to core pool size " + i);
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150");
        }
        if (j <= 0) {
            throw new IllegalArgumentException("Idle worker keep alive time " + j + " must be positive");
        }
        this.f46837i = new liv();
        this.f46838j = new liv();
        this.f46834f = ook.m18795i(0L);
        this.f46835g = new oxv(i + 1);
        this.f46836h = ook.m18795i(((long) i) << 42);
        this.f46839k = ook.m18793g(false);
    }
}
