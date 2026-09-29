package androidx.concurrent.futures;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p532zd.InterfaceFutureC10478a;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements InterfaceFutureC10478a<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f4752d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f4753e = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* JADX INFO: renamed from: f */
    public static final AbstractC0717a f4754f;

    /* JADX INFO: renamed from: g */
    public static final Object f4755g;

    /* JADX INFO: renamed from: a */
    public volatile Object f4756a;

    /* JADX INFO: renamed from: b */
    public volatile C0719c f4757b;

    /* JADX INFO: renamed from: c */
    public volatile C0723g f4758c;

    public static final class Failure {

        /* JADX INFO: renamed from: a */
        public final Throwable f4759a;

        static {
            new Failure(new Throwable() { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
                @Override // java.lang.Throwable
                public final synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }

        public Failure(Throwable th2) {
            boolean z10 = AbstractResolvableFuture.f4752d;
            th2.getClass();
            this.f4759a = th2;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$a */
    public static abstract class AbstractC0717a {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo2634a(AbstractResolvableFuture<?> abstractResolvableFuture, C0719c c0719c, C0719c c0719c2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo2635b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo2636c(AbstractResolvableFuture<?> abstractResolvableFuture, C0723g c0723g, C0723g c0723g2);

        /* JADX INFO: renamed from: d */
        public abstract void mo2637d(C0723g c0723g, C0723g c0723g2);

        /* JADX INFO: renamed from: e */
        public abstract void mo2638e(C0723g c0723g, Thread thread);
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$b */
    public static final class C0718b {

        /* JADX INFO: renamed from: c */
        public static final C0718b f4760c;

        /* JADX INFO: renamed from: d */
        public static final C0718b f4761d;

        /* JADX INFO: renamed from: a */
        public final boolean f4762a;

        /* JADX INFO: renamed from: b */
        public final Throwable f4763b;

        static {
            if (AbstractResolvableFuture.f4752d) {
                f4761d = null;
                f4760c = null;
            } else {
                f4761d = new C0718b(null, false);
                f4760c = new C0718b(null, true);
            }
        }

        public C0718b(Throwable th2, boolean z10) {
            this.f4762a = z10;
            this.f4763b = th2;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$c */
    public static final class C0719c {

        /* JADX INFO: renamed from: d */
        public static final C0719c f4764d = new C0719c(null, null);

        /* JADX INFO: renamed from: a */
        public final Runnable f4765a;

        /* JADX INFO: renamed from: b */
        public final Executor f4766b;

        /* JADX INFO: renamed from: c */
        public C0719c f4767c;

        public C0719c(Runnable runnable, Executor executor) {
            this.f4765a = runnable;
            this.f4766b = executor;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$d */
    public static final class C0720d extends AbstractC0717a {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<C0723g, Thread> f4768a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<C0723g, C0723g> f4769b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0723g> f4770c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0719c> f4771d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f4772e;

        public C0720d(AtomicReferenceFieldUpdater<C0723g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0723g, C0723g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0723g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0719c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            this.f4768a = atomicReferenceFieldUpdater;
            this.f4769b = atomicReferenceFieldUpdater2;
            this.f4770c = atomicReferenceFieldUpdater3;
            this.f4771d = atomicReferenceFieldUpdater4;
            this.f4772e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0717a
        /* JADX INFO: renamed from: a */
        public final boolean mo2634a(AbstractResolvableFuture<?> abstractResolvableFuture, C0719c c0719c, C0719c c0719c2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0719c> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f4771d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, c0719c, c0719c2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == c0719c);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0717a
        /* JADX INFO: renamed from: b */
        public final boolean mo2635b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f4772e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0717a
        /* JADX INFO: renamed from: c */
        public final boolean mo2636c(AbstractResolvableFuture<?> abstractResolvableFuture, C0723g c0723g, C0723g c0723g2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, C0723g> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f4770c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, c0723g, c0723g2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == c0723g);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0717a
        /* JADX INFO: renamed from: d */
        public final void mo2637d(C0723g c0723g, C0723g c0723g2) {
            this.f4769b.lazySet(c0723g, c0723g2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0717a
        /* JADX INFO: renamed from: e */
        public final void mo2638e(C0723g c0723g, Thread thread) {
            this.f4768a.lazySet(c0723g, thread);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$e */
    public static final class RunnableC0721e<V> implements Runnable {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$f */
    public static final class C0722f extends AbstractC0717a {
        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0717a
        /* JADX INFO: renamed from: a */
        public final boolean mo2634a(AbstractResolvableFuture<?> abstractResolvableFuture, C0719c c0719c, C0719c c0719c2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f4757b != c0719c) {
                    return false;
                }
                abstractResolvableFuture.f4757b = c0719c2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0717a
        /* JADX INFO: renamed from: b */
        public final boolean mo2635b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f4756a != obj) {
                    return false;
                }
                abstractResolvableFuture.f4756a = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0717a
        /* JADX INFO: renamed from: c */
        public final boolean mo2636c(AbstractResolvableFuture<?> abstractResolvableFuture, C0723g c0723g, C0723g c0723g2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f4758c != c0723g) {
                    return false;
                }
                abstractResolvableFuture.f4758c = c0723g2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0717a
        /* JADX INFO: renamed from: d */
        public final void mo2637d(C0723g c0723g, C0723g c0723g2) {
            c0723g.f4775b = c0723g2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AbstractC0717a
        /* JADX INFO: renamed from: e */
        public final void mo2638e(C0723g c0723g, Thread thread) {
            c0723g.f4774a = thread;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$g */
    public static final class C0723g {

        /* JADX INFO: renamed from: c */
        public static final C0723g f4773c = new C0723g(0);

        /* JADX INFO: renamed from: a */
        public volatile Thread f4774a;

        /* JADX INFO: renamed from: b */
        public volatile C0723g f4775b;

        public C0723g() {
            AbstractResolvableFuture.f4754f.mo2638e(this, Thread.currentThread());
        }

        public C0723g(int i10) {
        }
    }

    static {
        AbstractC0717a c0722f;
        try {
            c0722f = new C0720d(AtomicReferenceFieldUpdater.newUpdater(C0723g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0723g.class, C0723g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, C0723g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, C0719c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c0722f = new C0722f();
        }
        f4754f = c0722f;
        if (th != null) {
            f4753e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4755g = new Object();
    }

    /* JADX INFO: renamed from: i */
    public static void m2626i(AbstractResolvableFuture<?> abstractResolvableFuture) {
        C0723g c0723g;
        C0719c c0719c;
        do {
            c0723g = abstractResolvableFuture.f4758c;
        } while (!f4754f.mo2636c(abstractResolvableFuture, c0723g, C0723g.f4773c));
        while (c0723g != null) {
            Thread thread = c0723g.f4774a;
            if (thread != null) {
                c0723g.f4774a = null;
                LockSupport.unpark(thread);
            }
            c0723g = c0723g.f4775b;
        }
        abstractResolvableFuture.mo2630g();
        do {
            c0719c = abstractResolvableFuture.f4757b;
        } while (!f4754f.mo2634a(abstractResolvableFuture, c0719c, C0719c.f4764d));
        C0719c c0719c2 = null;
        while (c0719c != null) {
            C0719c c0719c3 = c0719c.f4767c;
            c0719c.f4767c = c0719c2;
            c0719c2 = c0719c;
            c0719c = c0719c3;
        }
        while (c0719c2 != null) {
            C0719c c0719c4 = c0719c2.f4767c;
            Runnable runnable = c0719c2.f4765a;
            if (runnable instanceof RunnableC0721e) {
                ((RunnableC0721e) runnable).getClass();
                throw null;
            }
            m2627l(runnable, c0719c2.f4766b);
            c0719c2 = c0719c4;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m2627l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f4753e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2628a(StringBuilder sb2) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v10 = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(v10 == this ? "this future" : String.valueOf(v10));
        sb2.append("]");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        C0718b c0718b;
        Object obj = this.f4756a;
        if ((obj == null) | (obj instanceof RunnableC0721e)) {
            if (f4752d) {
                c0718b = new C0718b(new CancellationException("Future.cancel() was called."), z10);
            } else {
                c0718b = z10 ? C0718b.f4760c : C0718b.f4761d;
            }
            while (!f4754f.mo2635b(this, obj, c0718b)) {
                obj = this.f4756a;
                if (!(obj instanceof RunnableC0721e)) {
                }
            }
            m2626i(this);
            if (!(obj instanceof RunnableC0721e)) {
                return true;
            }
            ((RunnableC0721e) obj).getClass();
            throw null;
        }
        return false;
    }

    @Override // p532zd.InterfaceFutureC10478a
    /* JADX INFO: renamed from: f */
    public final void mo2629f(Runnable runnable, Executor executor) {
        executor.getClass();
        C0719c c0719c = this.f4757b;
        C0719c c0719c2 = C0719c.f4764d;
        if (c0719c != c0719c2) {
            C0719c c0719c3 = new C0719c(runnable, executor);
            do {
                c0719c3.f4767c = c0719c;
                if (f4754f.mo2634a(this, c0719c, c0719c3)) {
                    return;
                } else {
                    c0719c = this.f4757b;
                }
            } while (c0719c != c0719c2);
        }
        m2627l(runnable, executor);
    }

    /* JADX INFO: renamed from: g */
    public void mo2630g() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f4756a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC0721e))) {
            return m2631m(obj2);
        }
        C0723g c0723g = this.f4758c;
        C0723g c0723g2 = C0723g.f4773c;
        if (c0723g != c0723g2) {
            C0723g c0723g3 = new C0723g();
            do {
                AbstractC0717a abstractC0717a = f4754f;
                abstractC0717a.mo2637d(c0723g3, c0723g);
                if (abstractC0717a.mo2636c(this, c0723g, c0723g3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m2633p(c0723g3);
                            throw new InterruptedException();
                        }
                        obj = this.f4756a;
                    } while (!((obj != null) & (!(obj instanceof RunnableC0721e))));
                    return m2631m(obj);
                }
                c0723g = this.f4758c;
            } while (c0723g != c0723g2);
        }
        return m2631m(this.f4756a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af A[EDGE_INSN: B:55:0x00af->B:56:0x00b5 BREAK  A[LOOP:0: B:21:0x0042->B:85:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00af -> B:56:0x00b5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // java.util.concurrent.Future
    public final V get(long r18, java.util.concurrent.TimeUnit r20) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4756a instanceof C0718b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f4756a;
        return (!(obj instanceof RunnableC0721e)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: m */
    public final V m2631m(Object obj) throws ExecutionException {
        if (obj instanceof C0718b) {
            Throwable th2 = ((C0718b) obj).f4763b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f4759a);
        }
        if (obj == f4755g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final String m2632o() {
        Object obj = this.f4756a;
        if (obj instanceof RunnableC0721e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ((RunnableC0721e) obj).getClass();
            sb2.append("null");
            sb2.append("]");
            return sb2.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: p */
    public final void m2633p(C0723g c0723g) {
        c0723g.f4774a = null;
        while (true) {
            C0723g c0723g2 = this.f4758c;
            if (c0723g2 == C0723g.f4773c) {
                return;
            }
            C0723g c0723g3 = null;
            while (c0723g2 != null) {
                C0723g c0723g4 = c0723g2.f4775b;
                if (c0723g2.f4774a != null) {
                    c0723g3 = c0723g2;
                } else if (c0723g3 != null) {
                    c0723g3.f4775b = c0723g4;
                    if (c0723g3.f4774a == null) {
                    }
                } else if (!f4754f.mo2636c(this, c0723g2, c0723g4)) {
                }
                c0723g2 = c0723g4;
            }
            return;
        }
    }

    public final String toString() {
        String strM2632o;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f4756a instanceof C0718b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m2628a(sb2);
        } else {
            try {
                strM2632o = m2632o();
            } catch (RuntimeException e10) {
                strM2632o = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM2632o != null && !strM2632o.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strM2632o);
                sb2.append("]");
            } else if (isDone()) {
                m2628a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
