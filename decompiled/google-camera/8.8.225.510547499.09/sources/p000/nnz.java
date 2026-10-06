package p000;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nnz extends nqo implements nps {

    /* JADX INFO: renamed from: a */
    private static final Logger f43965a;

    /* JADX INFO: renamed from: b */
    private static final Object f43966b;

    /* JADX INFO: renamed from: d */
    static final boolean f43967d;

    /* JADX INFO: renamed from: e */
    public static final nnk f43968e;
    public volatile nno listeners;
    public volatile Object value;
    public volatile nny waiters;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        nnk nnsVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException e) {
            z = false;
        }
        f43967d = z;
        f43965a = Logger.getLogger(nnz.class.getName());
        try {
            nnsVar = new nnx();
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e2) {
            try {
                th = null;
                th2 = e2;
                nnsVar = new nnq(AtomicReferenceFieldUpdater.newUpdater(nny.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(nny.class, nny.class, "next"), AtomicReferenceFieldUpdater.newUpdater(nnz.class, nny.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(nnz.class, nno.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(nnz.class, Object.class, "value"));
            } catch (Error | RuntimeException e3) {
                th = e3;
                th2 = e2;
                nnsVar = new nns();
            }
        }
        f43968e = nnsVar;
        if (th != null) {
            Logger logger = f43965a;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f43966b = new Object();
    }

    protected nnz() {
    }

    /* JADX INFO: renamed from: g */
    private static Object m17535g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    private final void m17536h(StringBuilder sb) {
        try {
            Object objM17535g = m17535g(this);
            sb.append("SUCCESS, result=[");
            if (objM17535g == null) {
                sb.append("null");
            } else if (objM17535g == this) {
                sb.append("this future");
            } else {
                sb.append(objM17535g.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objM17535g)));
            }
            sb.append("]");
        } catch (CancellationException e) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m17537i(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof nnr) {
            sb.append(", setFuture=[");
            m17538j(sb, ((nnr) obj).f43957b);
            sb.append("]");
        } else {
            try {
                strConcat = mo14892bQ();
                if (true == mro.m16832b(strConcat)) {
                    strConcat = null;
                }
            } catch (RuntimeException | StackOverflowError e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e.getClass())));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m17536h(sb);
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m17538j(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static Object m17539k(nps npsVar) {
        Throwable thMo17544l;
        if (npsVar instanceof nnt) {
            Object nnlVar = ((nnz) npsVar).value;
            if (nnlVar instanceof nnl) {
                nnl nnlVar2 = (nnl) nnlVar;
                if (nnlVar2.f43944c) {
                    Throwable th = nnlVar2.f43945d;
                    nnlVar = th != null ? new nnl(false, th) : nnl.f43943b;
                }
            }
            nnlVar.getClass();
            return nnlVar;
        }
        if ((npsVar instanceof nqo) && (thMo17544l = ((nqo) npsVar).mo17544l()) != null) {
            return new nnn(thMo17544l);
        }
        boolean zIsCancelled = npsVar.isCancelled();
        if ((!f43967d) && zIsCancelled) {
            nnl nnlVar3 = nnl.f43943b;
            nnlVar3.getClass();
            return nnlVar3;
        }
        try {
            Object objM17535g = m17535g(npsVar);
            if (!zIsCancelled) {
                return objM17535g == null ? f43966b : objM17535g;
            }
            return new nnl(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(npsVar)));
        } catch (Error e) {
            e = e;
            return new nnn(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new nnn(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(npsVar))), e2)) : new nnl(false, e2);
        } catch (RuntimeException e3) {
            e = e3;
            return new nnn(e);
        } catch (ExecutionException e4) {
            return zIsCancelled ? new nnl(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(npsVar))), e4)) : new nnn(e4.getCause());
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m17540m(nnz nnzVar, boolean z) {
        nno nnoVar = null;
        while (true) {
            for (nny nnyVarMo17526b = f43968e.mo17526b(nnzVar, nny.f43964a); nnyVarMo17526b != null; nnyVarMo17526b = nnyVarMo17526b.next) {
                Thread thread = nnyVarMo17526b.thread;
                if (thread != null) {
                    nnyVarMo17526b.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                nnzVar.mo17545n();
            }
            nnzVar.mo14893c();
            nno nnoVar2 = nnoVar;
            nno nnoVarMo17525a = f43968e.mo17525a(nnzVar, nno.f43948a);
            nno nnoVar3 = nnoVar2;
            while (nnoVarMo17525a != null) {
                nno nnoVar4 = nnoVarMo17525a.next;
                nnoVarMo17525a.next = nnoVar3;
                nnoVar3 = nnoVarMo17525a;
                nnoVarMo17525a = nnoVar4;
            }
            while (nnoVar3 != null) {
                nnoVar = nnoVar3.next;
                Runnable runnable = nnoVar3.f43949b;
                runnable.getClass();
                if (runnable instanceof nnr) {
                    nnr nnrVar = (nnr) runnable;
                    nnzVar = nnrVar.f43956a;
                    if (nnzVar.value == nnrVar) {
                        if (f43968e.mo17530f(nnzVar, nnrVar, m17539k(nnrVar.f43957b))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = nnoVar3.f43950c;
                    executor.getClass();
                    m17541q(runnable, executor);
                }
                nnoVar3 = nnoVar;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m17541q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f43965a.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m17542r(nny nnyVar) {
        nnyVar.thread = null;
        while (true) {
            nny nnyVar2 = this.waiters;
            if (nnyVar2 != nny.f43964a) {
                nny nnyVar3 = null;
                while (nnyVar2 != null) {
                    nny nnyVar4 = nnyVar2.next;
                    if (nnyVar2.thread != null) {
                        nnyVar3 = nnyVar2;
                    } else if (nnyVar3 != null) {
                        nnyVar3.next = nnyVar4;
                        if (nnyVar3.thread == null) {
                        }
                    } else if (!f43968e.mo17531g(this, nnyVar2, nnyVar4)) {
                    }
                    nnyVar2 = nnyVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: s */
    private static final Object m17543s(Object obj) throws ExecutionException {
        if (obj instanceof nnl) {
            Throwable th = ((nnl) obj).f43945d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof nnn) {
            throw new ExecutionException(((nnn) obj).f43947b);
        }
        if (obj == f43966b) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo8566a(Throwable th) {
        th.getClass();
        if (!f43968e.mo17530f(this, null, new nnn(th))) {
            return false;
        }
        m17540m(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: bQ */
    protected String mo14892bQ() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: c */
    protected void mo14893c() {
    }

    public boolean cancel(boolean z) {
        nnl nnlVar;
        Object obj = this.value;
        if (!(obj instanceof nnr) && !(obj == null)) {
            return false;
        }
        if (f43967d) {
            nnlVar = new nnl(z, new CancellationException("Future.cancel() was called."));
        } else {
            nnlVar = z ? nnl.f43942a : nnl.f43943b;
            nnlVar.getClass();
        }
        boolean z2 = false;
        nnz nnzVar = this;
        while (true) {
            if (f43968e.mo17530f(nnzVar, obj, nnlVar)) {
                m17540m(nnzVar, z);
                if (obj instanceof nnr) {
                    nps npsVar = ((nnr) obj).f43957b;
                    if (npsVar instanceof nnt) {
                        nnzVar = (nnz) npsVar;
                        obj = nnzVar.value;
                        if (!(obj == null) && !(obj instanceof nnr)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        npsVar.cancel(z);
                    }
                }
                return true;
            }
            obj = nnzVar.value;
            if (!(obj instanceof nnr)) {
                return z2;
            }
        }
    }

    @Override // p000.nps
    /* JADX INFO: renamed from: d */
    public void mo2282d(Runnable runnable, Executor executor) {
        nno nnoVar;
        runnable.getClass();
        executor.getClass();
        if (!isDone() && (nnoVar = this.listeners) != nno.f43948a) {
            nno nnoVar2 = new nno(runnable, executor);
            do {
                nnoVar2.next = nnoVar;
                if (f43968e.mo17529e(this, nnoVar, nnoVar2)) {
                    return;
                } else {
                    nnoVar = this.listeners;
                }
            } while (nnoVar != nno.f43948a);
        }
        m17541q(runnable, executor);
    }

    /* JADX INFO: renamed from: e */
    protected boolean mo14894e(Object obj) {
        if (obj == null) {
            obj = f43966b;
        }
        if (!f43968e.mo17530f(this, null, obj)) {
            return false;
        }
        m17540m(this, false);
        return true;
    }

    /* JADX INFO: renamed from: f */
    protected boolean mo16665f(nps npsVar) {
        nnn nnnVar;
        npsVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (npsVar.isDone()) {
                if (!f43968e.mo17530f(this, null, m17539k(npsVar))) {
                    return false;
                }
                m17540m(this, false);
                return true;
            }
            nnr nnrVar = new nnr(this, npsVar);
            if (f43968e.mo17530f(this, null, nnrVar)) {
                try {
                    npsVar.mo2282d(nnrVar, not.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        nnnVar = new nnn(e);
                    } catch (Error | RuntimeException e2) {
                        nnnVar = nnn.f43946a;
                    }
                    f43968e.mo17530f(this, nnrVar, nnnVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof nnl) {
            npsVar.cancel(((nnl) obj).f43944c);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof nnr))) {
            return m17543s(obj2);
        }
        nny nnyVar = this.waiters;
        if (nnyVar != nny.f43964a) {
            nny nnyVar2 = new nny();
            do {
                nnyVar2.m17534a(nnyVar);
                if (f43968e.mo17531g(this, nnyVar, nnyVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m17542r(nnyVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof nnr))));
                    return m17543s(obj);
                }
                nnyVar = this.waiters;
            } while (nnyVar != nny.f43964a);
        }
        Object obj3 = this.value;
        obj3.getClass();
        return m17543s(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof nnl;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof nnr));
    }

    @Override // p000.nqo
    /* JADX INFO: renamed from: l */
    public final Throwable mo17544l() {
        if (!(this instanceof nnt)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof nnn) {
            return ((nnn) obj).f43947b;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    protected void mo17545n() {
    }

    /* JADX INFO: renamed from: o */
    public final void m17546o(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m17547p());
        }
    }

    /* JADX INFO: renamed from: p */
    protected final boolean m17547p() {
        Object obj = this.value;
        return (obj instanceof nnl) && ((nnl) obj).f43944c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m17536h(sb);
        } else {
            m17537i(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof nnr))) {
            return m17543s(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            nny nnyVar = this.waiters;
            if (nnyVar != nny.f43964a) {
                nny nnyVar2 = new nny();
                while (true) {
                    nnyVar2.m17534a(nnyVar);
                    if (f43968e.mo17531g(this, nnyVar, nnyVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m17542r(nnyVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof nnr))) {
                                return m17543s(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m17542r(nnyVar2);
                        break;
                    }
                    nnyVar = this.waiters;
                    if (nnyVar == nny.f43964a) {
                    }
                }
            }
            Object obj3 = this.value;
            obj3.getClass();
            return m17543s(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof nnr))) {
                return m17543s(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }
}
