package kotlinx.coroutines;

import dm.C5207g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C7151a;
import kotlinx.coroutines.internal.C7160j;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.C7172v;
import kotlinx.coroutines.internal.InterfaceC7173w;
import no.AbstractC7826e0;
import no.AbstractC7847l0;
import no.AbstractC7850m0;
import no.C7828f;
import no.C7831g;
import no.C7843k;
import no.C7857o1;
import no.InterfaceC7820c0;
import no.InterfaceC7838i0;
import no.InterfaceC7840j;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7082c extends AbstractC7850m0 implements InterfaceC7820c0 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40009g = AtomicReferenceFieldUpdater.newUpdater(AbstractC7082c.class, Object.class, "_queue");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40010h = AtomicReferenceFieldUpdater.newUpdater(AbstractC7082c.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: renamed from: kotlinx.coroutines.c$a */
    public final class a extends c {

        /* JADX INFO: renamed from: c */
        public final InterfaceC7840j<C9072e> f40011c;

        public a(long j10, C7843k c7843k) {
            super(j10);
            this.f40011c = c7843k;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f40011c.mo15576A(AbstractC7082c.this, C9072e.f47360a);
        }

        @Override // kotlinx.coroutines.AbstractC7082c.c
        public final String toString() {
            return super.toString() + this.f40011c;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.c$b */
    public static final class b extends c {

        /* JADX INFO: renamed from: c */
        public final Runnable f40013c;

        public b(Runnable runnable, long j10) {
            super(j10);
            this.f40013c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f40013c.run();
        }

        @Override // kotlinx.coroutines.AbstractC7082c.c
        public final String toString() {
            return super.toString() + this.f40013c;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.c$c */
    public static abstract class c implements Runnable, Comparable<c>, InterfaceC7838i0, InterfaceC7173w {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a */
        public long f40014a;

        /* JADX INFO: renamed from: b */
        public int f40015b = -1;

        public c(long j10) {
            this.f40014a = j10;
        }

        @Override // no.InterfaceC7838i0
        /* JADX INFO: renamed from: a */
        public final synchronized void mo14330a() {
            try {
                Object obj = this._heap;
                C7168r c7168r = C7828f.f42926a;
                if (obj == c7168r) {
                    return;
                }
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    synchronized (dVar) {
                        try {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof C7172v ? (C7172v) obj2 : null) != null) {
                                dVar.m14472c(this.f40015b);
                            }
                        } finally {
                        }
                    }
                }
                this._heap = c7168r;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j10 = this.f40014a - cVar.f40014a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC7173w
        /* JADX INFO: renamed from: f */
        public final void mo14331f(d dVar) {
            if (!(this._heap != C7828f.f42926a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = dVar;
        }

        /* JADX INFO: renamed from: g */
        public final synchronized int m14332g(long j10, d dVar, AbstractC7082c abstractC7082c) {
            try {
                if (this._heap == C7828f.f42926a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.f40448a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        if (AbstractC7082c.m14324K1(abstractC7082c)) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f40016b = j10;
                        } else {
                            long j11 = cVar.f40014a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f40016b > 0) {
                                dVar.f40016b = j10;
                            }
                        }
                        long j12 = this.f40014a;
                        long j13 = dVar.f40016b;
                        if (j12 - j13 < 0) {
                            this.f40014a = j13;
                        }
                        dVar.m14470a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }

        @Override // kotlinx.coroutines.internal.InterfaceC7173w
        public final void setIndex(int i10) {
            this.f40015b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f40014a + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.c$d */
    public static final class d extends C7172v<c> {

        /* JADX INFO: renamed from: b */
        public long f40016b;

        public d(long j10) {
            this.f40016b = j10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX INFO: renamed from: K1 */
    public static final boolean m14324K1(AbstractC7082c abstractC7082c) {
        return abstractC7082c._isCompleted;
    }

    /* JADX INFO: renamed from: G0 */
    public InterfaceC7838i0 mo14318G0(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return InterfaceC7820c0.a.m15559a(j10, runnable, coroutineContext);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[LOOP:3: B:59:0x00a7->B:136:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0066 -> B:40:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // no.AbstractC7847l0
    /* JADX INFO: renamed from: G1 */
    public final long mo14325G1() {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC7082c.mo14325G1():long");
    }

    /* JADX INFO: renamed from: L1 */
    public void mo14322L1(Runnable runnable) {
        if (m14326M1(runnable)) {
            Thread threadMo14320I1 = mo14320I1();
            if (Thread.currentThread() != threadMo14320I1) {
                LockSupport.unpark(threadMo14320I1);
            }
        } else {
            RunnableC7081b.f40007i.mo14322L1(runnable);
        }
    }

    /* JADX INFO: renamed from: M1 */
    public final boolean m14326M1(Runnable runnable) {
        while (true) {
            while (true) {
                Object obj = this._queue;
                boolean z10 = false;
                if (this._isCompleted == 0) {
                    if (obj != null) {
                        if (!(obj instanceof C7160j)) {
                            if (obj != C7828f.f42927b) {
                                C7160j c7160j = new C7160j(8, true);
                                c7160j.m14452a((Runnable) obj);
                                c7160j.m14452a(runnable);
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40009g;
                                do {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c7160j)) {
                                        z10 = true;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(this) == obj);
                                if (!z10) {
                                    break;
                                }
                                return true;
                            }
                            return false;
                        }
                        C7160j c7160j2 = (C7160j) obj;
                        int iM14452a = c7160j2.m14452a(runnable);
                        if (iM14452a == 0) {
                            return true;
                        }
                        if (iM14452a == 1) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40009g;
                            C7160j c7160jM14456e = c7160j2.m14456e();
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c7160jM14456e) && atomicReferenceFieldUpdater2.get(this) == obj) {
                            }
                        } else if (iM14452a == 2) {
                            return false;
                        }
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f40009g;
                        do {
                            if (atomicReferenceFieldUpdater3.compareAndSet(this, null, runnable)) {
                                z10 = true;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater3.get(this) == null);
                        if (!z10) {
                            break;
                        }
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX INFO: renamed from: N1 */
    public final boolean m14327N1() {
        C7151a<AbstractC7826e0<?>> c7151a = this.f42949e;
        boolean z10 = false;
        if (!(c7151a == null || c7151a.f40413b == c7151a.f40414c)) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.m14471b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            z10 = true;
        } else {
            if (obj instanceof C7160j) {
                return ((C7160j) obj).m14455d();
            }
            if (obj == C7828f.f42927b) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m14328O1() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX INFO: renamed from: P1 */
    public final void m14329P1(long j10, c cVar) {
        int iM14332g;
        Thread threadMo14320I1;
        Object obj = null;
        boolean z10 = true;
        if (this._isCompleted != 0) {
            iM14332g = 1;
        } else {
            d dVar = (d) this._delayed;
            if (dVar == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40010h;
                d dVar2 = new d(j10);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = this._delayed;
                C5207g.m11108c(obj2);
                dVar = (d) obj2;
            }
            iM14332g = cVar.m14332g(j10, dVar, this);
        }
        if (iM14332g != 0) {
            if (iM14332g == 1) {
                mo14321J1(j10, cVar);
                return;
            } else {
                if (iM14332g != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        d dVar3 = (d) this._delayed;
        if (dVar3 != null) {
            synchronized (dVar3) {
                try {
                    Object[] objArr = dVar3.f40448a;
                    if (objArr != null) {
                        obj = objArr[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            obj = (c) obj;
        }
        if (obj != cVar) {
            z10 = false;
        }
        if (!z10 || Thread.currentThread() == (threadMo14320I1 = mo14320I1())) {
            return;
        }
        LockSupport.unpark(threadMo14320I1);
    }

    @Override // no.InterfaceC7820c0
    /* JADX INFO: renamed from: q */
    public final void mo14319q(long j10, C7843k c7843k) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(j11 + jNanoTime, c7843k);
            m14329P1(jNanoTime, aVar);
            c7843k.mo15577R(new C7831g(1, aVar));
        }
    }

    @Override // no.AbstractC7847l0
    public void shutdown() {
        c cVarM14473d;
        ThreadLocal<AbstractC7847l0> threadLocal = C7857o1.f42954a;
        C7857o1.f42954a.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            C7168r c7168r = C7828f.f42927b;
            boolean z10 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40009g;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c7168r)) {
                        z10 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
                if (z10) {
                    break;
                }
            } else {
                if (obj instanceof C7160j) {
                    ((C7160j) obj).m14453b();
                    break;
                }
                if (obj == c7168r) {
                    break;
                }
                C7160j c7160j = new C7160j(8, true);
                c7160j.m14452a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40009g;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c7160j)) {
                        z10 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
                if (z10) {
                    break;
                }
            }
        }
        while (mo14325G1() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar != null && (cVarM14473d = dVar.m14473d()) != null) {
                mo14321J1(jNanoTime, cVarM14473d);
            }
            return;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: z1 */
    public final void mo2307z1(CoroutineContext coroutineContext, Runnable runnable) {
        mo14322L1(runnable);
    }
}
