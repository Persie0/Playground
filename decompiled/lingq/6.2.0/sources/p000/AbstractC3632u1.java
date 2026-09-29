package p000;

import androidx.concurrent.futures.C0463a;
import com.google.common.util.concurrent.ListenableFuture;
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

/* JADX INFO: renamed from: u1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3632u1 implements ListenableFuture {

    /* JADX INFO: renamed from: d */
    public static final boolean f63225d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f63226e = Logger.getLogger(AbstractC3632u1.class.getName());

    /* JADX INFO: renamed from: f */
    public static final zyc f63227f;

    /* JADX INFO: renamed from: g */
    public static final Object f63228g;

    /* JADX INFO: renamed from: a */
    public volatile Object f63229a;

    /* JADX INFO: renamed from: b */
    public volatile C3481q1 f63230b;

    /* JADX INFO: renamed from: c */
    public volatile C3595t1 f63231c;

    static {
        zyc c3557s1;
        try {
            c3557s1 = new C3519r1(AtomicReferenceFieldUpdater.newUpdater(C3595t1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C3595t1.class, C3595t1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3632u1.class, C3595t1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3632u1.class, C3481q1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3632u1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c3557s1 = new C3557s1();
        }
        f63227f = c3557s1;
        if (th != null) {
            f63226e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f63228g = new Object();
    }

    /* JADX INFO: renamed from: e */
    public static void m22383e(AbstractC3632u1 abstractC3632u1) {
        C3595t1 c3595t1;
        C3481q1 c3481q1;
        C3481q1 c3481q2;
        C3481q1 c3481q3;
        do {
            c3595t1 = abstractC3632u1.f63231c;
        } while (!f63227f.mo20239h(abstractC3632u1, c3595t1, C3595t1.f61729c));
        while (true) {
            c3481q1 = null;
            if (c3595t1 == null) {
                break;
            }
            Thread thread = c3595t1.f61730a;
            if (thread != null) {
                c3595t1.f61730a = null;
                LockSupport.unpark(thread);
            }
            c3595t1 = c3595t1.f61731b;
        }
        abstractC3632u1.mo17883d();
        do {
            c3481q2 = abstractC3632u1.f63230b;
        } while (!f63227f.mo20237f(abstractC3632u1, c3481q2, C3481q1.f57112d));
        while (true) {
            c3481q3 = c3481q1;
            c3481q1 = c3481q2;
            if (c3481q1 == null) {
                break;
            }
            c3481q2 = c3481q1.f57115c;
            c3481q1.f57115c = c3481q3;
        }
        while (c3481q3 != null) {
            C3481q1 c3481q4 = c3481q3.f57115c;
            m22384f(c3481q3.f57113a, c3481q3.f57114b);
            c3481q3 = c3481q4;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m22384f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f63226e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m22385g(Object obj) throws ExecutionException {
        if (obj instanceof C3444p1) {
            Throwable th = ((C3444p1) obj).f55411b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0463a) {
            throw new ExecutionException(((C0463a) obj).f5327a);
        }
        if (obj == f63228g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static Object m22386h(ListenableFuture listenableFuture) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = listenableFuture.get();
                break;
            } catch (InterruptedException unused) {
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

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: a */
    public final void mo52a(Runnable runnable, Executor executor) {
        executor.getClass();
        C3481q1 c3481q1 = this.f63230b;
        C3481q1 c3481q2 = C3481q1.f57112d;
        if (c3481q1 != c3481q2) {
            C3481q1 c3481q3 = new C3481q1(runnable, executor);
            do {
                c3481q3.f57115c = c3481q1;
                if (f63227f.mo20237f(this, c3481q1, c3481q3)) {
                    return;
                } else {
                    c3481q1 = this.f63230b;
                }
            } while (c3481q1 != c3481q2);
        }
        m22384f(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public final void m22387c(StringBuilder sb) {
        try {
            Object objM22386h = m22386h(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM22386h == this ? "this future" : String.valueOf(objM22386h));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C3444p1 c3444p1;
        Object obj = this.f63229a;
        if (obj == null) {
            if (f63225d) {
                c3444p1 = new C3444p1(new CancellationException("Future.cancel() was called."), z);
            } else {
                c3444p1 = z ? C3444p1.f55408c : C3444p1.f55409d;
            }
            if (f63227f.mo20238g(this, obj, c3444p1)) {
                m22383e(this);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo17883d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C3595t1 c3595t1 = C3595t1.f61729c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f63229a;
        if (obj != null) {
            return m22385g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C3595t1 c3595t2 = this.f63231c;
            if (c3595t2 != c3595t1) {
                C3595t1 c3595t3 = new C3595t1();
                while (true) {
                    zyc zycVar = f63227f;
                    zycVar.mo20240i(c3595t3, c3595t2);
                    if (zycVar.mo20239h(this, c3595t2, c3595t3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m22388j(c3595t3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f63229a;
                            if (obj2 != null) {
                                return m22385g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m22388j(c3595t3);
                        break;
                    }
                    c3595t2 = this.f63231c;
                    if (c3595t2 == c3595t1) {
                    }
                }
            }
            return m22385g(this.f63229a);
        }
        while (nanos > 0) {
            Object obj3 = this.f63229a;
            if (obj3 != null) {
                return m22385g(obj3);
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
        StringBuilder sbM22996s = ux5.m22996s(j, "Waited ", " ");
        sbM22996s.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM22996s.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC3393o1.m17735j(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public String mo11935i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f63229a instanceof C3444p1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f63229a != null;
    }

    /* JADX INFO: renamed from: j */
    public final void m22388j(C3595t1 c3595t1) {
        c3595t1.f61730a = null;
        while (true) {
            C3595t1 c3595t2 = this.f63231c;
            if (c3595t2 == C3595t1.f61729c) {
                return;
            }
            C3595t1 c3595t3 = null;
            while (c3595t2 != null) {
                C3595t1 c3595t4 = c3595t2.f61731b;
                if (c3595t2.f61730a != null) {
                    c3595t3 = c3595t2;
                } else if (c3595t3 != null) {
                    c3595t3.f61731b = c3595t4;
                    if (c3595t3.f61730a == null) {
                    }
                } else if (!f63227f.mo20239h(this, c3595t2, c3595t4)) {
                }
                c3595t2 = c3595t4;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m22389k(Object obj) {
        if (obj == null) {
            obj = f63228g;
        }
        if (!f63227f.mo20238g(this, null, obj)) {
            return false;
        }
        m22383e(this);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo20435l(Throwable th) {
        th.getClass();
        if (!f63227f.mo20238g(this, null, new C0463a(th))) {
            return false;
        }
        m22383e(this);
        return true;
    }

    public final String toString() {
        String strMo11935i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f63229a instanceof C3444p1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m22387c(sb);
        } else {
            try {
                strMo11935i = mo11935i();
            } catch (RuntimeException e) {
                strMo11935i = "Exception thrown from implementation: " + e.getClass();
            }
            if (strMo11935i != null && !strMo11935i.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo11935i);
                sb.append("]");
            } else if (isDone()) {
                m22387c(sb);
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
        C3595t1 c3595t1 = C3595t1.f61729c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f63229a;
            if (obj2 != null) {
                return m22385g(obj2);
            }
            C3595t1 c3595t2 = this.f63231c;
            if (c3595t2 != c3595t1) {
                C3595t1 c3595t3 = new C3595t1();
                do {
                    zyc zycVar = f63227f;
                    zycVar.mo20240i(c3595t3, c3595t2);
                    if (zycVar.mo20239h(this, c3595t2, c3595t3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f63229a;
                            } else {
                                m22388j(c3595t3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m22385g(obj);
                    }
                    c3595t2 = this.f63231c;
                } while (c3595t2 != c3595t1);
            }
            return m22385g(this.f63229a);
        }
        throw new InterruptedException();
    }
}
