package p000;

import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
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

/* JADX INFO: renamed from: xt */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1131xt implements nps {

    /* JADX INFO: renamed from: b */
    static final AbstractC1121xj f48031b;

    /* JADX INFO: renamed from: d */
    private static final Object f48033d;
    volatile C1125xn listeners;
    volatile Object value;
    volatile C1130xs waiters;

    /* JADX INFO: renamed from: a */
    static final boolean f48030a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: c */
    private static final Logger f48032c = Logger.getLogger(AbstractC1131xt.class.getName());

    static {
        AbstractC1121xj c1129xr;
        try {
            c1129xr = new C1127xp(AtomicReferenceFieldUpdater.newUpdater(C1130xs.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C1130xs.class, C1130xs.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1131xt.class, C1130xs.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1131xt.class, C1125xn.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1131xt.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1129xr = new C1129xr();
        }
        f48031b = c1129xr;
        if (th != null) {
            f48032c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f48033d = new Object();
    }

    protected AbstractC1131xt() {
    }

    /* JADX INFO: renamed from: a */
    static Object m19580a(nps npsVar) {
        if (npsVar instanceof AbstractC1131xt) {
            Object obj = ((AbstractC1131xt) npsVar).value;
            if (!(obj instanceof C1122xk)) {
                return obj;
            }
            C1122xk c1122xk = (C1122xk) obj;
            if (!c1122xk.f48015c) {
                return obj;
            }
            Throwable th = c1122xk.f48016d;
            return th != null ? new C1122xk(false, th) : C1122xk.f48014b;
        }
        boolean zIsCancelled = npsVar.isCancelled();
        if ((!f48030a) && zIsCancelled) {
            return C1122xk.f48014b;
        }
        try {
            Object objM19581b = m19581b(npsVar);
            return objM19581b == null ? f48033d : objM19581b;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new C1122xk(false, e);
            }
            StringBuilder sb = new StringBuilder();
            String str = IuyLAqNmW.kLuOuF;
            sb.append(str);
            sb.append(npsVar);
            return new C1124xm(new IllegalArgumentException(str.concat(String.valueOf(npsVar)), e));
        } catch (ExecutionException e2) {
            return new C1124xm(e2.getCause());
        } catch (Throwable th2) {
            return new C1124xm(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    static Object m19581b(Future future) {
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

    /* JADX INFO: renamed from: e */
    static void m19582e(AbstractC1131xt abstractC1131xt) {
        C1125xn c1125xn;
        C1125xn c1125xn2;
        C1125xn c1125xn3 = null;
        while (true) {
            C1130xs c1130xs = abstractC1131xt.waiters;
            if (f48031b.mo19577e(abstractC1131xt, c1130xs, C1130xs.f48029a)) {
                while (c1130xs != null) {
                    Thread thread = c1130xs.thread;
                    if (thread != null) {
                        c1130xs.thread = null;
                        LockSupport.unpark(thread);
                    }
                    c1130xs = c1130xs.next;
                }
                do {
                    c1125xn = abstractC1131xt.listeners;
                } while (!f48031b.mo19575c(abstractC1131xt, c1125xn, C1125xn.f48019a));
                while (true) {
                    c1125xn2 = c1125xn3;
                    c1125xn3 = c1125xn;
                    if (c1125xn3 == null) {
                        break;
                    }
                    c1125xn = c1125xn3.next;
                    c1125xn3.next = c1125xn2;
                }
                while (c1125xn2 != null) {
                    c1125xn3 = c1125xn2.next;
                    Runnable runnable = c1125xn2.f48020b;
                    if (runnable instanceof RunnableC1128xq) {
                        RunnableC1128xq runnableC1128xq = (RunnableC1128xq) runnable;
                        abstractC1131xt = runnableC1128xq.f48027a;
                        if (abstractC1131xt.value == runnableC1128xq) {
                            if (f48031b.mo19576d(abstractC1131xt, runnableC1128xq, m19580a(runnableC1128xq.f48028b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m19586j(runnable, c1125xn2.f48021c);
                    }
                    c1125xn2 = c1125xn3;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    static void m19583g(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    private final String m19584h(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: i */
    private final void m19585i(StringBuilder sb) {
        try {
            Object objM19581b = m19581b(this);
            sb.append("SUCCESS, result=[");
            sb.append(m19584h(objM19581b));
            sb.append("]");
        } catch (CancellationException e) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append(YmzeHXaMYOLk.DID);
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    /* JADX INFO: renamed from: j */
    private static void m19586j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f48032c.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m19587k(C1130xs c1130xs) {
        c1130xs.thread = null;
        while (true) {
            C1130xs c1130xs2 = this.waiters;
            if (c1130xs2 != C1130xs.f48029a) {
                C1130xs c1130xs3 = null;
                while (c1130xs2 != null) {
                    C1130xs c1130xs4 = c1130xs2.next;
                    if (c1130xs2.thread != null) {
                        c1130xs3 = c1130xs2;
                    } else if (c1130xs3 != null) {
                        c1130xs3.next = c1130xs4;
                        if (c1130xs3.thread == null) {
                        }
                    } else if (!f48031b.mo19577e(this, c1130xs2, c1130xs4)) {
                    }
                    c1130xs2 = c1130xs4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: l */
    private static final Object m19588l(Object obj) throws ExecutionException {
        if (obj instanceof C1122xk) {
            Throwable th = ((C1122xk) obj).f48016d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1124xm) {
            throw new ExecutionException(((C1124xm) obj).f48018b);
        }
        if (obj == f48033d) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    protected String mo19589c() {
        Object obj = this.value;
        if (obj instanceof RunnableC1128xq) {
            return "setFuture=[" + m19584h(((RunnableC1128xq) obj).f48028b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C1122xk c1122xk;
        Object obj = this.value;
        if (!(obj instanceof RunnableC1128xq) && !(obj == null)) {
            return false;
        }
        if (f48030a) {
            c1122xk = new C1122xk(z, new CancellationException("Future.cancel() was called."));
        } else {
            c1122xk = z ? C1122xk.f48013a : C1122xk.f48014b;
        }
        boolean z2 = false;
        AbstractC1131xt abstractC1131xt = this;
        while (true) {
            if (f48031b.mo19576d(abstractC1131xt, obj, c1122xk)) {
                m19582e(abstractC1131xt);
                if (obj instanceof RunnableC1128xq) {
                    nps npsVar = ((RunnableC1128xq) obj).f48028b;
                    if (npsVar instanceof AbstractC1131xt) {
                        abstractC1131xt = (AbstractC1131xt) npsVar;
                        obj = abstractC1131xt.value;
                        if (!(obj == null) && !(obj instanceof RunnableC1128xq)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        npsVar.cancel(z);
                    }
                }
                return true;
            }
            obj = abstractC1131xt.value;
            if (!(obj instanceof RunnableC1128xq)) {
                return z2;
            }
        }
    }

    @Override // p000.nps
    /* JADX INFO: renamed from: d */
    public final void mo2282d(Runnable runnable, Executor executor) {
        m19583g(runnable);
        m19583g(executor);
        C1125xn c1125xn = this.listeners;
        if (c1125xn != C1125xn.f48019a) {
            C1125xn c1125xn2 = new C1125xn(runnable, executor);
            do {
                c1125xn2.next = c1125xn;
                if (f48031b.mo19575c(this, c1125xn, c1125xn2)) {
                    return;
                } else {
                    c1125xn = this.listeners;
                }
            } while (c1125xn != C1125xn.f48019a);
        }
        m19586j(runnable, executor);
    }

    /* JADX INFO: renamed from: f */
    protected boolean mo19590f(Object obj) {
        if (obj == null) {
            obj = f48033d;
        }
        if (!f48031b.mo19576d(this, null, obj)) {
            return false;
        }
        m19582e(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC1128xq))) {
            return m19588l(obj2);
        }
        C1130xs c1130xs = this.waiters;
        if (c1130xs != C1130xs.f48029a) {
            C1130xs c1130xs2 = new C1130xs();
            do {
                c1130xs2.m19579a(c1130xs);
                if (f48031b.mo19577e(this, c1130xs, c1130xs2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m19587k(c1130xs2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof RunnableC1128xq))));
                    return m19588l(obj);
                }
                c1130xs = this.waiters;
            } while (c1130xs != C1130xs.f48029a);
        }
        return m19588l(this.value);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C1122xk;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof RunnableC1128xq));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m19585i(sb);
        } else {
            try {
                strConcat = mo19589c();
            } catch (RuntimeException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception thrown from implementation: ");
                Class<?> cls = e.getClass();
                sb2.append(cls);
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                m19585i(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof RunnableC1128xq))) {
            return m19588l(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1130xs c1130xs = this.waiters;
            if (c1130xs != C1130xs.f48029a) {
                C1130xs c1130xs2 = new C1130xs();
                while (true) {
                    c1130xs2.m19579a(c1130xs);
                    if (f48031b.mo19577e(this, c1130xs, c1130xs2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m19587k(c1130xs2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC1128xq))) {
                                return m19588l(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m19587k(c1130xs2);
                        break;
                    }
                    c1130xs = this.waiters;
                    if (c1130xs == C1130xs.f48029a) {
                    }
                }
            }
            return m19588l(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof RunnableC1128xq))) {
                return m19588l(obj3);
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
