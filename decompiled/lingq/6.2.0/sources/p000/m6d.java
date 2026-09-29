package p000;

import com.google.android.gms.internal.play_billing.C0999j;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class m6d implements vwb {

    /* JADX INFO: renamed from: d */
    public static final boolean f50684d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f50685e = Logger.getLogger(m6d.class.getName());

    /* JADX INFO: renamed from: f */
    public static final idd f50686f;

    /* JADX INFO: renamed from: g */
    public static final Object f50687g;

    /* JADX INFO: renamed from: a */
    public volatile Object f50688a;

    /* JADX INFO: renamed from: b */
    public volatile fec f50689b;

    /* JADX INFO: renamed from: c */
    public volatile yzc f50690c;

    static {
        idd wvcVar;
        try {
            wvcVar = new jnc(AtomicReferenceFieldUpdater.newUpdater(yzc.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(yzc.class, yzc.class, "b"), AtomicReferenceFieldUpdater.newUpdater(m6d.class, yzc.class, "c"), AtomicReferenceFieldUpdater.newUpdater(m6d.class, fec.class, "b"), AtomicReferenceFieldUpdater.newUpdater(m6d.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            wvcVar = new wvc();
        }
        Throwable th2 = th;
        f50686f = wvcVar;
        if (th2 != null) {
            f50685e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f50687g = new Object();
    }

    /* JADX INFO: renamed from: d */
    public static void m16658d(m6d m6dVar) {
        yzc yzcVar;
        idd iddVar;
        fec fecVar;
        fec fecVar2;
        fec fecVar3;
        do {
            yzcVar = m6dVar.f50690c;
            iddVar = f50686f;
        } while (!iddVar.mo13806f(m6dVar, yzcVar, yzc.f70719c));
        while (true) {
            fecVar = null;
            if (yzcVar == null) {
                break;
            }
            Thread thread = yzcVar.f70720a;
            if (thread != null) {
                yzcVar.f70720a = null;
                LockSupport.unpark(thread);
            }
            yzcVar = yzcVar.f70721b;
        }
        do {
            fecVar2 = m6dVar.f50689b;
        } while (!iddVar.mo13804d(m6dVar, fecVar2, fec.f38968d));
        while (true) {
            fecVar3 = fecVar;
            fecVar = fecVar2;
            if (fecVar == null) {
                break;
            }
            fecVar2 = fecVar.f38971c;
            fecVar.f38971c = fecVar3;
        }
        while (fecVar3 != null) {
            Runnable runnable = fecVar3.f38969a;
            fec fecVar4 = fecVar3.f38971c;
            m16659f(runnable, fecVar3.f38970b);
            fecVar3 = fecVar4;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m16659f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f50685e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", wq1.m24119o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Object m16660h(Object obj) throws ExecutionException {
        if (obj instanceof i0c) {
            Throwable th = ((i0c) obj).f43304a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0999j) {
            throw new ExecutionException(((C0999j) obj).f12184a);
        }
        if (obj == f50687g) {
            return null;
        }
        return obj;
    }

    @Override // p000.vwb
    /* JADX INFO: renamed from: b */
    public final void mo16661b(Runnable runnable, Executor executor) {
        executor.getClass();
        fec fecVar = this.f50689b;
        fec fecVar2 = fec.f38968d;
        if (fecVar != fecVar2) {
            fec fecVar3 = new fec(runnable, executor);
            do {
                fecVar3.f38971c = fecVar;
                if (f50686f.mo13804d(this, fecVar, fecVar3)) {
                    return;
                } else {
                    fecVar = this.f50689b;
                }
            } while (fecVar != fecVar2);
        }
        m16659f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public String mo16662c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        i0c i0cVar;
        Object obj = this.f50688a;
        if (obj != null) {
            return false;
        }
        if (f50684d) {
            i0cVar = new i0c(new CancellationException("Future.cancel() was called."));
        } else {
            i0cVar = z ? i0c.f43302b : i0c.f43303c;
        }
        if (!f50686f.mo13805e(this, obj, i0cVar)) {
            return false;
        }
        m16658d(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m16663e(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    /* JADX INFO: renamed from: g */
    public final void m16664g(yzc yzcVar) {
        yzcVar.f70720a = null;
        while (true) {
            yzc yzcVar2 = this.f50690c;
            if (yzcVar2 != yzc.f70719c) {
                yzc yzcVar3 = null;
                while (yzcVar2 != null) {
                    yzc yzcVar4 = yzcVar2.f70721b;
                    if (yzcVar2.f70720a != null) {
                        yzcVar3 = yzcVar2;
                    } else if (yzcVar3 != null) {
                        yzcVar3.f70721b = yzcVar4;
                        if (yzcVar3.f70720a == null) {
                        }
                    } else if (!f50686f.mo13806f(this, yzcVar2, yzcVar4)) {
                    }
                    yzcVar2 = yzcVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f50688a;
        if (obj != null) {
            return m16660h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            yzc yzcVar = this.f50690c;
            yzc yzcVar2 = yzc.f70719c;
            if (yzcVar != yzcVar2) {
                yzc yzcVar3 = new yzc();
                while (true) {
                    idd iddVar = f50686f;
                    iddVar.mo13802b(yzcVar3, yzcVar);
                    if (iddVar.mo13806f(this, yzcVar, yzcVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m16664g(yzcVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f50688a;
                            if (obj2 != null) {
                                return m16660h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m16664g(yzcVar3);
                        break;
                    }
                    yzcVar = this.f50690c;
                    if (yzcVar == yzcVar2) {
                    }
                }
            }
            return m16660h(this.f50688a);
        }
        while (nanos > 0) {
            Object obj3 = this.f50688a;
            if (obj3 != null) {
                return m16660h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = true;
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
        throw new TimeoutException(AbstractC3393o1.m17735j(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f50688a instanceof i0c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f50688a != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f50688a instanceof i0c) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m16663e(sb);
        } else {
            try {
                strConcat = mo16662c();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                m16663e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f50688a;
            if (obj2 != null) {
                return m16660h(obj2);
            }
            yzc yzcVar = this.f50690c;
            yzc yzcVar2 = yzc.f70719c;
            if (yzcVar != yzcVar2) {
                yzc yzcVar3 = new yzc();
                do {
                    idd iddVar = f50686f;
                    iddVar.mo13802b(yzcVar3, yzcVar);
                    if (iddVar.mo13806f(this, yzcVar, yzcVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f50688a;
                            } else {
                                m16664g(yzcVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m16660h(obj);
                    }
                    yzcVar = this.f50690c;
                } while (yzcVar != yzcVar2);
            }
            return m16660h(this.f50688a);
        }
        throw new InterruptedException();
    }
}
