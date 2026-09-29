package kotlinx.coroutines.scheduling;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlinx.coroutines.internal.C7165o;
import kotlinx.coroutines.internal.C7168r;
import no.C7814a0;
import p003a2.C0009a;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;

    /* JADX INFO: renamed from: a */
    public final int f40457a;

    /* JADX INFO: renamed from: b */
    public final int f40458b;

    /* JADX INFO: renamed from: c */
    public final long f40459c;
    volatile /* synthetic */ long controlState;

    /* JADX INFO: renamed from: d */
    public final String f40460d;

    /* JADX INFO: renamed from: e */
    public final C7179c f40461e;

    /* JADX INFO: renamed from: f */
    public final C7179c f40462f;

    /* JADX INFO: renamed from: g */
    public final C7165o<C7176b> f40463g;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: k */
    public static final C7168r f40456k = new C7168r("NOT_IN_STACK");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f40453h = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f40454i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40455j = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13365d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    public /* synthetic */ class C7175a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40464a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            iArr[WorkerState.PARKING.ordinal()] = 1;
            iArr[WorkerState.BLOCKING.ordinal()] = 2;
            iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            iArr[WorkerState.DORMANT.ordinal()] = 4;
            iArr[WorkerState.TERMINATED.ordinal()] = 5;
            f40464a = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    public final class C7176b extends Thread {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f40465h = AtomicIntegerFieldUpdater.newUpdater(C7176b.class, "workerCtl");

        /* JADX INFO: renamed from: a */
        public final C7188l f40466a;

        /* JADX INFO: renamed from: b */
        public WorkerState f40467b;

        /* JADX INFO: renamed from: c */
        public long f40468c;

        /* JADX INFO: renamed from: d */
        public long f40469d;

        /* JADX INFO: renamed from: e */
        public int f40470e;

        /* JADX INFO: renamed from: f */
        public boolean f40471f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public C7176b() {
            throw null;
        }

        public C7176b(int i10) {
            setDaemon(true);
            this.f40466a = new C7188l();
            this.f40467b = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f40456k;
            this.f40470e = Random.f38128a.mo12510b();
            m14487f(i10);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0047  */
        /* JADX WARN: Code duplicated, block: B:20:0x004a  */
        /* JADX WARN: Code duplicated, block: B:22:0x0057  */
        /* JADX WARN: Code duplicated, block: B:23:0x0059  */
        /* JADX WARN: Code duplicated, block: B:30:0x0076  */
        /* JADX WARN: Code duplicated, block: B:31:0x007c  */
        /* JADX WARN: Code duplicated, block: B:33:0x0080  */
        /* JADX WARN: Code duplicated, block: B:34:0x0082  */
        /* JADX WARN: Code duplicated, block: B:39:0x008e  */
        /* JADX WARN: Code duplicated, block: B:41:0x0095  */
        /* JADX WARN: Code duplicated, block: B:44:0x009c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:45:0x009e  */
        /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        public final AbstractRunnableC7182f m14482a(boolean z10) {
            boolean z11;
            boolean z12;
            AbstractRunnableC7182f abstractRunnableC7182fM14451d;
            C7188l c7188l;
            AbstractRunnableC7182f abstractRunnableC7182fM14486e;
            C7188l c7188l2;
            AbstractRunnableC7182f abstractRunnableC7182f;
            AbstractRunnableC7182f abstractRunnableC7182fM14496d;
            AbstractRunnableC7182f abstractRunnableC7182fM14486e2;
            AbstractRunnableC7182f abstractRunnableC7182fM14486e3;
            boolean z13 = true;
            if (this.f40467b != WorkerState.CPU_ACQUIRED) {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                while (true) {
                    long j10 = coroutineScheduler.controlState;
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        z11 = false;
                        break;
                    }
                    if (CoroutineScheduler.f40454i.compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L)) {
                        z11 = true;
                        break;
                    }
                }
                if (z11) {
                    this.f40467b = WorkerState.CPU_ACQUIRED;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (z10) {
                        c7188l = this.f40466a;
                        c7188l.getClass();
                        abstractRunnableC7182fM14451d = (AbstractRunnableC7182f) C7188l.f40490b.getAndSet(c7188l, null);
                        if (abstractRunnableC7182fM14451d == null) {
                            abstractRunnableC7182fM14451d = c7188l.m14496d();
                        }
                        if (abstractRunnableC7182fM14451d == null) {
                            abstractRunnableC7182fM14451d = CoroutineScheduler.this.f40462f.m14451d();
                        }
                    } else {
                        abstractRunnableC7182fM14451d = CoroutineScheduler.this.f40462f.m14451d();
                    }
                    if (abstractRunnableC7182fM14451d == null) {
                        return m14490i(true);
                    }
                    return abstractRunnableC7182fM14451d;
                }
                if (z10) {
                    if (m14485d(CoroutineScheduler.this.f40457a * 2) == 0) {
                        z13 = false;
                    }
                    if (!z13 && (abstractRunnableC7182fM14486e3 = m14486e()) != null) {
                        return abstractRunnableC7182fM14486e3;
                    }
                    c7188l2 = this.f40466a;
                    c7188l2.getClass();
                    abstractRunnableC7182f = (AbstractRunnableC7182f) C7188l.f40490b.getAndSet(c7188l2, null);
                    if (abstractRunnableC7182f == null) {
                        abstractRunnableC7182fM14496d = c7188l2.m14496d();
                    } else {
                        abstractRunnableC7182fM14496d = abstractRunnableC7182f;
                    }
                    if (abstractRunnableC7182fM14496d != null) {
                        return abstractRunnableC7182fM14496d;
                    }
                    if (!z13 && (abstractRunnableC7182fM14486e2 = m14486e()) != null) {
                        return abstractRunnableC7182fM14486e2;
                    }
                } else {
                    abstractRunnableC7182fM14486e = m14486e();
                    if (abstractRunnableC7182fM14486e != null) {
                        return abstractRunnableC7182fM14486e;
                    }
                }
                return m14490i(false);
            }
            z12 = true;
            if (z12) {
                if (z10) {
                    c7188l = this.f40466a;
                    c7188l.getClass();
                    abstractRunnableC7182fM14451d = (AbstractRunnableC7182f) C7188l.f40490b.getAndSet(c7188l, null);
                    if (abstractRunnableC7182fM14451d == null) {
                        abstractRunnableC7182fM14451d = c7188l.m14496d();
                    }
                    if (abstractRunnableC7182fM14451d == null) {
                        abstractRunnableC7182fM14451d = CoroutineScheduler.this.f40462f.m14451d();
                    }
                } else {
                    abstractRunnableC7182fM14451d = CoroutineScheduler.this.f40462f.m14451d();
                }
                if (abstractRunnableC7182fM14451d == null) {
                    return m14490i(true);
                }
                return abstractRunnableC7182fM14451d;
            }
            if (z10) {
                if (m14485d(CoroutineScheduler.this.f40457a * 2) == 0) {
                    z13 = false;
                }
                if (!z13) {
                }
                c7188l2 = this.f40466a;
                c7188l2.getClass();
                abstractRunnableC7182f = (AbstractRunnableC7182f) C7188l.f40490b.getAndSet(c7188l2, null);
                if (abstractRunnableC7182f == null) {
                    abstractRunnableC7182fM14496d = c7188l2.m14496d();
                } else {
                    abstractRunnableC7182fM14496d = abstractRunnableC7182f;
                }
                if (abstractRunnableC7182fM14496d != null) {
                    return abstractRunnableC7182fM14496d;
                }
                if (!z13) {
                    return abstractRunnableC7182fM14486e2;
                }
            } else {
                abstractRunnableC7182fM14486e = m14486e();
                if (abstractRunnableC7182fM14486e != null) {
                    return abstractRunnableC7182fM14486e;
                }
            }
            return m14490i(false);
        }

        /* JADX INFO: renamed from: b */
        public final int m14483b() {
            return this.indexInArray;
        }

        /* JADX INFO: renamed from: c */
        public final Object m14484c() {
            return this.nextParkedWorker;
        }

        /* JADX INFO: renamed from: d */
        public final int m14485d(int i10) {
            int i11 = this.f40470e;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f40470e = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        /* JADX INFO: renamed from: e */
        public final AbstractRunnableC7182f m14486e() {
            int iM14485d = m14485d(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (iM14485d == 0) {
                AbstractRunnableC7182f abstractRunnableC7182fM14451d = coroutineScheduler.f40461e.m14451d();
                return abstractRunnableC7182fM14451d != null ? abstractRunnableC7182fM14451d : coroutineScheduler.f40462f.m14451d();
            }
            AbstractRunnableC7182f abstractRunnableC7182fM14451d2 = coroutineScheduler.f40462f.m14451d();
            return abstractRunnableC7182fM14451d2 != null ? abstractRunnableC7182fM14451d2 : coroutineScheduler.f40461e.m14451d();
        }

        /* JADX INFO: renamed from: f */
        public final void m14487f(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f40460d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        /* JADX INFO: renamed from: g */
        public final void m14488g(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m14489h(WorkerState workerState) {
            WorkerState workerState2 = this.f40467b;
            boolean z10 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z10) {
                CoroutineScheduler.f40454i.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f40467b = workerState;
            }
            return z10;
        }

        /* JADX INFO: renamed from: i */
        public final AbstractRunnableC7182f m14490i(boolean z10) {
            long jM14498f;
            int i10 = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int iM14485d = m14485d(i10);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                iM14485d++;
                if (iM14485d > i10) {
                    iM14485d = 1;
                }
                C7176b c7176bM14463b = coroutineScheduler.f40463g.m14463b(iM14485d);
                if (c7176bM14463b != null && c7176bM14463b != this) {
                    if (z10) {
                        jM14498f = this.f40466a.m14497e(c7176bM14463b.f40466a);
                    } else {
                        C7188l c7188l = this.f40466a;
                        C7188l c7188l2 = c7176bM14463b.f40466a;
                        c7188l.getClass();
                        AbstractRunnableC7182f abstractRunnableC7182fM14496d = c7188l2.m14496d();
                        if (abstractRunnableC7182fM14496d != null) {
                            c7188l.m14493a(abstractRunnableC7182fM14496d, false);
                            jM14498f = -1;
                        } else {
                            jM14498f = c7188l.m14498f(c7188l2, false);
                        }
                    }
                    if (jM14498f == -1) {
                        C7188l c7188l3 = this.f40466a;
                        c7188l3.getClass();
                        AbstractRunnableC7182f abstractRunnableC7182f = (AbstractRunnableC7182f) C7188l.f40490b.getAndSet(c7188l3, null);
                        return abstractRunnableC7182f == null ? c7188l3.m14496d() : abstractRunnableC7182f;
                    }
                    if (jM14498f > 0) {
                        jMin = Math.min(jMin, jM14498f);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f40469d = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (!CoroutineScheduler.this.isTerminated()) {
                        WorkerState workerState = this.f40467b;
                        WorkerState workerState2 = WorkerState.TERMINATED;
                        if (workerState == workerState2) {
                            break loop0;
                        }
                        AbstractRunnableC7182f abstractRunnableC7182fM14482a = m14482a(this.f40471f);
                        if (abstractRunnableC7182fM14482a != null) {
                            this.f40469d = 0L;
                            int iMo14492c = abstractRunnableC7182fM14482a.f40479b.mo14492c();
                            this.f40468c = 0L;
                            if (this.f40467b == WorkerState.PARKING) {
                                this.f40467b = WorkerState.BLOCKING;
                            }
                            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                            if (iMo14492c != 0 && m14489h(WorkerState.BLOCKING) && !coroutineScheduler.m14481w() && !coroutineScheduler.m14480r(coroutineScheduler.controlState)) {
                                coroutineScheduler.m14481w();
                            }
                            coroutineScheduler.getClass();
                            try {
                                abstractRunnableC7182fM14482a.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                            }
                            if (iMo14492c != 0) {
                                CoroutineScheduler.f40454i.addAndGet(coroutineScheduler, -2097152L);
                                if (this.f40467b == workerState2) {
                                    break;
                                }
                                this.f40467b = WorkerState.DORMANT;
                                break;
                            }
                            break;
                        }
                        this.f40471f = false;
                        if (this.f40469d == 0) {
                            if (this.nextParkedWorker != CoroutineScheduler.f40456k) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != CoroutineScheduler.f40456k) || this.workerCtl != -1 || CoroutineScheduler.this.isTerminated()) {
                                        break;
                                    }
                                    WorkerState workerState3 = this.f40467b;
                                    WorkerState workerState4 = WorkerState.TERMINATED;
                                    if (workerState3 == workerState4) {
                                        break;
                                    }
                                    m14489h(WorkerState.PARKING);
                                    Thread.interrupted();
                                    if (this.f40468c == 0) {
                                        this.f40468c = System.nanoTime() + CoroutineScheduler.this.f40459c;
                                    }
                                    LockSupport.parkNanos(CoroutineScheduler.this.f40459c);
                                    if (System.nanoTime() - this.f40468c >= 0) {
                                        this.f40468c = 0L;
                                        CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                                        synchronized (coroutineScheduler2.f40463g) {
                                            if (!coroutineScheduler2.isTerminated()) {
                                                if (((int) (coroutineScheduler2.controlState & 2097151)) > coroutineScheduler2.f40457a) {
                                                    if (f40465h.compareAndSet(this, -1, 1)) {
                                                        int i10 = this.indexInArray;
                                                        m14487f(0);
                                                        coroutineScheduler2.m14479q(this, i10, 0);
                                                        int andDecrement = (int) (CoroutineScheduler.f40454i.getAndDecrement(coroutineScheduler2) & 2097151);
                                                        if (andDecrement != i10) {
                                                            C7176b c7176bM14463b = coroutineScheduler2.f40463g.m14463b(andDecrement);
                                                            C5207g.m11108c(c7176bM14463b);
                                                            C7176b c7176b = c7176bM14463b;
                                                            coroutineScheduler2.f40463g.m14464c(i10, c7176b);
                                                            c7176b.m14487f(i10);
                                                            coroutineScheduler2.m14479q(c7176b, andDecrement, i10);
                                                        }
                                                        coroutineScheduler2.f40463g.m14464c(andDecrement, null);
                                                        C9072e c9072e = C9072e.f47360a;
                                                        this.f40467b = workerState4;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                CoroutineScheduler.this.m14478l(this);
                            }
                        } else {
                            if (z10) {
                                m14489h(WorkerState.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f40469d);
                                this.f40469d = 0L;
                                break;
                            }
                            z10 = true;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            m14489h(WorkerState.TERMINATED);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    public CoroutineScheduler(int i10, int i11, long j10, String str) {
        this.f40457a = i10;
        this.f40458b = i11;
        this.f40459c = j10;
        this.f40460d = str;
        boolean z10 = true;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(C0166e.m762h("Core pool size ", i10, " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(C0204c.m851j("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(C0166e.m762h("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f40461e = new C7179c();
        this.f40462f = new C7179c();
        this.parkedWorkersStack = 0L;
        this.f40463g = new C7165o<>(i10 + 1);
        this.controlState = ((long) i10) << 42;
        this._isTerminated = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final int m14476a() {
        synchronized (this.f40463g) {
            try {
                if (this._isTerminated != 0) {
                    return -1;
                }
                long j10 = this.controlState;
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                boolean z10 = false;
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f40457a) {
                    return 0;
                }
                if (i10 >= this.f40458b) {
                    return 0;
                }
                int i12 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i12 > 0 && this.f40463g.m14463b(i12) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                C7176b c7176b = new C7176b(i12);
                this.f40463g.m14464c(i12, c7176b);
                if (i12 == ((int) (2097151 & f40454i.incrementAndGet(this)))) {
                    z10 = true;
                }
                if (!z10) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c7176b.start();
                return i11 + 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14477b(Runnable runnable, InterfaceC7183g interfaceC7183g, boolean z10) {
        AbstractRunnableC7182f c7185i;
        AbstractRunnableC7182f abstractRunnableC7182fM14493a;
        C7186j.f40486e.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC7182f) {
            c7185i = (AbstractRunnableC7182f) runnable;
            c7185i.f40478a = jNanoTime;
            c7185i.f40479b = interfaceC7183g;
        } else {
            c7185i = new C7185i(runnable, jNanoTime, interfaceC7183g);
        }
        Thread threadCurrentThread = Thread.currentThread();
        C7176b c7176b = null;
        C7176b c7176b2 = threadCurrentThread instanceof C7176b ? (C7176b) threadCurrentThread : null;
        if (c7176b2 != null && C5207g.m11106a(CoroutineScheduler.this, this)) {
            c7176b = c7176b2;
        }
        boolean z11 = true;
        if (c7176b == null || c7176b.f40467b == WorkerState.TERMINATED || (c7185i.f40479b.mo14492c() == 0 && c7176b.f40467b == WorkerState.BLOCKING)) {
            abstractRunnableC7182fM14493a = c7185i;
        } else {
            c7176b.f40471f = true;
            abstractRunnableC7182fM14493a = c7176b.f40466a.m14493a(c7185i, z10);
        }
        if (abstractRunnableC7182fM14493a != null) {
            if (!(abstractRunnableC7182fM14493a.f40479b.mo14492c() == 1 ? this.f40462f.m14448a(abstractRunnableC7182fM14493a) : this.f40461e.m14448a(abstractRunnableC7182fM14493a))) {
                throw new RejectedExecutionException(C0009a.m23l(new StringBuilder(), this.f40460d, " was terminated"));
            }
        }
        if (!z10 || c7176b == null) {
            z11 = false;
        }
        if (c7185i.f40479b.mo14492c() == 0) {
            if (!z11 && !m14481w() && !m14480r(this.controlState)) {
                m14481w();
                return;
            }
            return;
        }
        long jAddAndGet = f40454i.addAndGet(this, 2097152L);
        if (!z11 && !m14481w() && !m14480r(jAddAndGet)) {
            m14481w();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i10;
        AbstractRunnableC7182f abstractRunnableC7182fM14451d;
        boolean z10;
        if (f40455j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C7176b c7176b = threadCurrentThread instanceof C7176b ? (C7176b) threadCurrentThread : null;
            if (c7176b == null || !C5207g.m11106a(CoroutineScheduler.this, this)) {
                c7176b = null;
            }
            synchronized (this.f40463g) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    C7176b c7176bM14463b = this.f40463g.m14463b(i11);
                    C5207g.m11108c(c7176bM14463b);
                    C7176b c7176b2 = c7176bM14463b;
                    if (c7176b2 != c7176b) {
                        while (c7176b2.isAlive()) {
                            LockSupport.unpark(c7176b2);
                            c7176b2.join(10000L);
                        }
                        C7188l c7188l = c7176b2.f40466a;
                        C7179c c7179c = this.f40462f;
                        c7188l.getClass();
                        AbstractRunnableC7182f abstractRunnableC7182f = (AbstractRunnableC7182f) C7188l.f40490b.getAndSet(c7188l, null);
                        if (abstractRunnableC7182f != null) {
                            c7179c.m14448a(abstractRunnableC7182f);
                        }
                        do {
                            AbstractRunnableC7182f abstractRunnableC7182fM14496d = c7188l.m14496d();
                            if (abstractRunnableC7182fM14496d == null) {
                                z10 = false;
                            } else {
                                c7179c.m14448a(abstractRunnableC7182fM14496d);
                                z10 = true;
                            }
                        } while (z10);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f40462f.m14449b();
            this.f40461e.m14449b();
            while (true) {
                if (c7176b != null) {
                    abstractRunnableC7182fM14451d = c7176b.m14482a(true);
                    if (abstractRunnableC7182fM14451d == null) {
                        abstractRunnableC7182fM14451d = this.f40461e.m14451d();
                        if (abstractRunnableC7182fM14451d == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC7182fM14451d = this.f40461e.m14451d();
                    if (abstractRunnableC7182fM14451d == null && (abstractRunnableC7182fM14451d = this.f40462f.m14451d()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC7182fM14451d.run();
                } catch (Throwable th2) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                }
            }
            if (c7176b != null) {
                c7176b.m14489h(WorkerState.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m14477b(runnable, C7186j.f40487f, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* JADX INFO: renamed from: l */
    public final void m14478l(C7176b c7176b) {
        long j10;
        int iM14483b;
        if (c7176b.m14484c() != f40456k) {
            return;
        }
        do {
            j10 = this.parkedWorkersStack;
            iM14483b = c7176b.m14483b();
            c7176b.m14488g(this.f40463g.m14463b((int) (2097151 & j10)));
        } while (!f40453h.compareAndSet(this, j10, ((long) iM14483b) | ((2097152 + j10) & (-2097152))));
    }

    /* JADX INFO: renamed from: q */
    public final void m14479q(C7176b c7176b, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objM14484c = c7176b.m14484c();
                    while (true) {
                        Object obj = objM14484c;
                        if (obj == f40456k) {
                            i12 = -1;
                            break;
                        }
                        if (obj == null) {
                            i12 = 0;
                            break;
                        }
                        C7176b c7176b2 = (C7176b) obj;
                        int iM14483b = c7176b2.m14483b();
                        if (iM14483b != 0) {
                            i12 = iM14483b;
                            break;
                        }
                        objM14484c = c7176b2.m14484c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0 && f40453h.compareAndSet(this, j10, j11 | ((long) i12))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m14480r(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f40457a;
        if (i10 < i11) {
            int iM14476a = m14476a();
            if (iM14476a == 1 && i11 > 1) {
                m14476a();
            }
            if (iM14476a > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int iM14462a = this.f40463g.m14462a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iM14462a; i15++) {
            C7176b c7176bM14463b = this.f40463g.m14463b(i15);
            if (c7176bM14463b != null) {
                int iM14495c = c7176bM14463b.f40466a.m14495c();
                int i16 = C7175a.f40464a[c7176bM14463b.f40467b.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM14495c);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iM14495c);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (iM14495c > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(iM14495c);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i16 == 5) {
                    i14++;
                }
            }
        }
        long j10 = this.controlState;
        return this.f40460d + '@' + C7814a0.m15551c(this) + "[Pool Size {core = " + this.f40457a + ", max = " + this.f40458b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f40461e.m14450c() + ", global blocking queue size = " + this.f40462f.m14450c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f40457a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* JADX INFO: renamed from: w */
    public final boolean m14481w() {
        C7168r c7168r;
        int iM14483b;
        while (true) {
            long j10 = this.parkedWorkersStack;
            C7176b c7176bM14463b = this.f40463g.m14463b((int) (2097151 & j10));
            if (c7176bM14463b == null) {
                c7176bM14463b = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objM14484c = c7176bM14463b.m14484c();
                while (true) {
                    c7168r = f40456k;
                    if (objM14484c == c7168r) {
                        iM14483b = -1;
                        break;
                    }
                    if (objM14484c == null) {
                        iM14483b = 0;
                        break;
                    }
                    C7176b c7176b = (C7176b) objM14484c;
                    iM14483b = c7176b.m14483b();
                    if (iM14483b != 0) {
                        break;
                    }
                    objM14484c = c7176b.m14484c();
                }
                if (iM14483b >= 0 && f40453h.compareAndSet(this, j10, ((long) iM14483b) | j11)) {
                    c7176bM14463b.m14488g(c7168r);
                }
            }
            if (c7176bM14463b == null) {
                return false;
            }
            if (C7176b.f40465h.compareAndSet(c7176bM14463b, -1, 0)) {
                LockSupport.unpark(c7176bM14463b);
                return true;
            }
        }
    }
}
