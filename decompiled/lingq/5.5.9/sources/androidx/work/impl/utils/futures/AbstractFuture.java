package androidx.work.impl.utils.futures;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p003a2.C0009a;
import p532zd.InterfaceFutureC10478a;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFuture<V> implements InterfaceFutureC10478a<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f7920d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f7921e = Logger.getLogger(AbstractFuture.class.getName());

    /* JADX INFO: renamed from: f */
    public static final AbstractC1261a f7922f;

    /* JADX INFO: renamed from: g */
    public static final Object f7923g;

    /* JADX INFO: renamed from: a */
    public volatile Object f7924a;

    /* JADX INFO: renamed from: b */
    public volatile C1263c f7925b;

    /* JADX INFO: renamed from: c */
    public volatile C1267g f7926c;

    public static final class Failure {

        /* JADX INFO: renamed from: b */
        public static final Failure f7927b = new Failure(new Throwable() { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: a */
        public final Throwable f7928a;

        public Failure(Throwable th2) {
            boolean z10 = AbstractFuture.f7920d;
            th2.getClass();
            this.f7928a = th2;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$a */
    public static abstract class AbstractC1261a {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo4761a(AbstractFuture<?> abstractFuture, C1263c c1263c, C1263c c1263c2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo4762b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo4763c(AbstractFuture<?> abstractFuture, C1267g c1267g, C1267g c1267g2);

        /* JADX INFO: renamed from: d */
        public abstract void mo4764d(C1267g c1267g, C1267g c1267g2);

        /* JADX INFO: renamed from: e */
        public abstract void mo4765e(C1267g c1267g, Thread thread);
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$b */
    public static final class C1262b {

        /* JADX INFO: renamed from: c */
        public static final C1262b f7929c;

        /* JADX INFO: renamed from: d */
        public static final C1262b f7930d;

        /* JADX INFO: renamed from: a */
        public final boolean f7931a;

        /* JADX INFO: renamed from: b */
        public final Throwable f7932b;

        static {
            if (AbstractFuture.f7920d) {
                f7930d = null;
                f7929c = null;
            } else {
                f7930d = new C1262b(null, false);
                f7929c = new C1262b(null, true);
            }
        }

        public C1262b(Throwable th2, boolean z10) {
            this.f7931a = z10;
            this.f7932b = th2;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$c */
    public static final class C1263c {

        /* JADX INFO: renamed from: d */
        public static final C1263c f7933d = new C1263c(null, null);

        /* JADX INFO: renamed from: a */
        public final Runnable f7934a;

        /* JADX INFO: renamed from: b */
        public final Executor f7935b;

        /* JADX INFO: renamed from: c */
        public C1263c f7936c;

        public C1263c(Runnable runnable, Executor executor) {
            this.f7934a = runnable;
            this.f7935b = executor;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$d */
    public static final class C1264d extends AbstractC1261a {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<C1267g, Thread> f7937a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<C1267g, C1267g> f7938b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C1267g> f7939c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFuture, C1263c> f7940d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f7941e;

        public C1264d(AtomicReferenceFieldUpdater<C1267g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1267g, C1267g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, C1267g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, C1263c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            this.f7937a = atomicReferenceFieldUpdater;
            this.f7938b = atomicReferenceFieldUpdater2;
            this.f7939c = atomicReferenceFieldUpdater3;
            this.f7940d = atomicReferenceFieldUpdater4;
            this.f7941e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC1261a
        /* JADX INFO: renamed from: a */
        public final boolean mo4761a(AbstractFuture<?> abstractFuture, C1263c c1263c, C1263c c1263c2) {
            AtomicReferenceFieldUpdater<AbstractFuture, C1263c> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f7940d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, c1263c, c1263c2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == c1263c);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC1261a
        /* JADX INFO: renamed from: b */
        public final boolean mo4762b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f7941e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC1261a
        /* JADX INFO: renamed from: c */
        public final boolean mo4763c(AbstractFuture<?> abstractFuture, C1267g c1267g, C1267g c1267g2) {
            AtomicReferenceFieldUpdater<AbstractFuture, C1267g> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f7939c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, c1267g, c1267g2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == c1267g);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC1261a
        /* JADX INFO: renamed from: d */
        public final void mo4764d(C1267g c1267g, C1267g c1267g2) {
            this.f7938b.lazySet(c1267g, c1267g2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC1261a
        /* JADX INFO: renamed from: e */
        public final void mo4765e(C1267g c1267g, Thread thread) {
            this.f7937a.lazySet(c1267g, thread);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$e */
    public static final class RunnableC1265e<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractFuture<V> f7942a;

        /* JADX INFO: renamed from: b */
        public final InterfaceFutureC10478a<? extends V> f7943b;

        public RunnableC1265e(AbstractFuture<V> abstractFuture, InterfaceFutureC10478a<? extends V> interfaceFutureC10478a) {
            this.f7942a = abstractFuture;
            this.f7943b = interfaceFutureC10478a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f7942a.f7924a != this) {
                return;
            }
            if (AbstractFuture.f7922f.mo4762b(this.f7942a, this, AbstractFuture.m4756e(this.f7943b))) {
                AbstractFuture.m4754b(this.f7942a);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$f */
    public static final class C1266f extends AbstractC1261a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC1261a
        /* JADX INFO: renamed from: a */
        public final boolean mo4761a(AbstractFuture<?> abstractFuture, C1263c c1263c, C1263c c1263c2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f7925b != c1263c) {
                    return false;
                }
                abstractFuture.f7925b = c1263c2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC1261a
        /* JADX INFO: renamed from: b */
        public final boolean mo4762b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f7924a != obj) {
                    return false;
                }
                abstractFuture.f7924a = obj2;
                return true;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC1261a
        /* JADX INFO: renamed from: c */
        public final boolean mo4763c(AbstractFuture<?> abstractFuture, C1267g c1267g, C1267g c1267g2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f7926c != c1267g) {
                    return false;
                }
                abstractFuture.f7926c = c1267g2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC1261a
        /* JADX INFO: renamed from: d */
        public final void mo4764d(C1267g c1267g, C1267g c1267g2) {
            c1267g.f7946b = c1267g2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AbstractC1261a
        /* JADX INFO: renamed from: e */
        public final void mo4765e(C1267g c1267g, Thread thread) {
            c1267g.f7945a = thread;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$g */
    public static final class C1267g {

        /* JADX INFO: renamed from: c */
        public static final C1267g f7944c = new C1267g(0);

        /* JADX INFO: renamed from: a */
        public volatile Thread f7945a;

        /* JADX INFO: renamed from: b */
        public volatile C1267g f7946b;

        public C1267g() {
            AbstractFuture.f7922f.mo4765e(this, Thread.currentThread());
        }

        public C1267g(int i10) {
        }
    }

    static {
        AbstractC1261a c1266f;
        try {
            c1266f = new C1264d(AtomicReferenceFieldUpdater.newUpdater(C1267g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1267g.class, C1267g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C1267g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, C1263c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c1266f = new C1266f();
        }
        f7922f = c1266f;
        if (th != null) {
            f7921e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7923g = new Object();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static void m4754b(AbstractFuture<?> abstractFuture) {
        C1263c c1263c;
        C1263c c1263c2;
        C1263c c1263c3 = null;
        while (true) {
            C1267g c1267g = abstractFuture.f7926c;
            if (f7922f.mo4763c(abstractFuture, c1267g, C1267g.f7944c)) {
                while (c1267g != null) {
                    Thread thread = c1267g.f7945a;
                    if (thread != null) {
                        c1267g.f7945a = null;
                        LockSupport.unpark(thread);
                    }
                    c1267g = c1267g.f7946b;
                }
                do {
                    c1263c = abstractFuture.f7925b;
                } while (!f7922f.mo4761a(abstractFuture, c1263c, C1263c.f7933d));
                while (true) {
                    c1263c2 = c1263c3;
                    c1263c3 = c1263c;
                    if (c1263c3 == null) {
                        break;
                    }
                    c1263c = c1263c3.f7936c;
                    c1263c3.f7936c = c1263c2;
                }
                while (c1263c2 != null) {
                    c1263c3 = c1263c2.f7936c;
                    Runnable runnable = c1263c2.f7934a;
                    if (runnable instanceof RunnableC1265e) {
                        RunnableC1265e runnableC1265e = (RunnableC1265e) runnable;
                        abstractFuture = runnableC1265e.f7942a;
                        if (abstractFuture.f7924a == runnableC1265e) {
                            if (f7922f.mo4762b(abstractFuture, runnableC1265e, m4756e(runnableC1265e.f7943b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m4755c(runnable, c1263c2.f7935b);
                    }
                    c1263c2 = c1263c3;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4755c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f7921e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m4756e(InterfaceFutureC10478a<?> interfaceFutureC10478a) {
        Object obj;
        if (interfaceFutureC10478a instanceof AbstractFuture) {
            Object obj2 = ((AbstractFuture) interfaceFutureC10478a).f7924a;
            if (obj2 instanceof C1262b) {
                C1262b c1262b = (C1262b) obj2;
                if (c1262b.f7931a) {
                    if (c1262b.f7932b != null) {
                        return new C1262b(c1262b.f7932b, false);
                    }
                    obj2 = C1262b.f7930d;
                }
            }
            return obj2;
        }
        boolean zIsCancelled = interfaceFutureC10478a.isCancelled();
        boolean z10 = true;
        if ((!f7920d) && zIsCancelled) {
            return C1262b.f7930d;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = interfaceFutureC10478a.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = z10;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException e10) {
                if (zIsCancelled) {
                    return new C1262b(e10, false);
                }
                return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC10478a, e10));
            } catch (ExecutionException e11) {
                return new Failure(e11.getCause());
            } catch (Throwable th3) {
                return new Failure(th3);
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f7923g : obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m4757a(StringBuilder sb2) {
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        C1262b c1262b;
        Object obj = this.f7924a;
        if (!(obj == null) && !(obj instanceof RunnableC1265e)) {
            return false;
        }
        if (f7920d) {
            c1262b = new C1262b(new CancellationException("Future.cancel() was called."), z10);
        } else {
            c1262b = z10 ? C1262b.f7929c : C1262b.f7930d;
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z11 = false;
        while (true) {
            if (f7922f.mo4762b(abstractFuture, obj, c1262b)) {
                m4754b(abstractFuture);
                if (!(obj instanceof RunnableC1265e)) {
                    return true;
                }
                InterfaceFutureC10478a<? extends V> interfaceFutureC10478a = ((RunnableC1265e) obj).f7943b;
                if (!(interfaceFutureC10478a instanceof AbstractFuture)) {
                    interfaceFutureC10478a.cancel(z10);
                    return true;
                }
                abstractFuture = (AbstractFuture) interfaceFutureC10478a;
                obj = abstractFuture.f7924a;
                if (!(obj == null) && !(obj instanceof RunnableC1265e)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractFuture.f7924a;
                if (!(obj instanceof RunnableC1265e)) {
                    return z11;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final V m4758d(Object obj) throws ExecutionException {
        if (obj instanceof C1262b) {
            Throwable th2 = ((C1262b) obj).f7932b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f7928a);
        }
        if (obj == f7923g) {
            return null;
        }
        return obj;
    }

    @Override // p532zd.InterfaceFutureC10478a
    /* JADX INFO: renamed from: f */
    public final void mo2629f(Runnable runnable, Executor executor) {
        executor.getClass();
        C1263c c1263c = this.f7925b;
        C1263c c1263c2 = C1263c.f7933d;
        if (c1263c != c1263c2) {
            C1263c c1263c3 = new C1263c(runnable, executor);
            do {
                c1263c3.f7936c = c1263c;
                if (f7922f.mo4761a(this, c1263c, c1263c3)) {
                    return;
                } else {
                    c1263c = this.f7925b;
                }
            } while (c1263c != c1263c2);
        }
        m4755c(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final String m4759g() {
        Object obj = this.f7924a;
        if (obj instanceof RunnableC1265e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            InterfaceFutureC10478a<? extends V> interfaceFutureC10478a = ((RunnableC1265e) obj).f7943b;
            return C0009a.m23l(sb2, interfaceFutureC10478a == this ? "this future" : String.valueOf(interfaceFutureC10478a), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f7924a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC1265e))) {
            return m4758d(obj2);
        }
        C1267g c1267g = this.f7926c;
        C1267g c1267g2 = C1267g.f7944c;
        if (c1267g != c1267g2) {
            C1267g c1267g3 = new C1267g();
            do {
                AbstractC1261a abstractC1261a = f7922f;
                abstractC1261a.mo4764d(c1267g3, c1267g);
                if (abstractC1261a.mo4763c(this, c1267g, c1267g3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m4760h(c1267g3);
                            throw new InterruptedException();
                        }
                        obj = this.f7924a;
                    } while (!((obj != null) & (!(obj instanceof RunnableC1265e))));
                    return m4758d(obj);
                }
                c1267g = this.f7926c;
            } while (c1267g != c1267g2);
        }
        return m4758d(this.f7924a);
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
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final V get(long r18, java.util.concurrent.TimeUnit r20) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    public final void m4760h(C1267g c1267g) {
        c1267g.f7945a = null;
        while (true) {
            C1267g c1267g2 = this.f7926c;
            if (c1267g2 == C1267g.f7944c) {
                return;
            }
            C1267g c1267g3 = null;
            while (c1267g2 != null) {
                C1267g c1267g4 = c1267g2.f7946b;
                if (c1267g2.f7945a != null) {
                    c1267g3 = c1267g2;
                } else if (c1267g3 != null) {
                    c1267g3.f7946b = c1267g4;
                    if (c1267g3.f7945a == null) {
                    }
                } else if (!f7922f.mo4763c(this, c1267g2, c1267g4)) {
                }
                c1267g2 = c1267g4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7924a instanceof C1262b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f7924a;
        return (!(obj instanceof RunnableC1265e)) & (obj != null);
    }

    public final String toString() {
        String strM4759g;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f7924a instanceof C1262b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m4757a(sb2);
        } else {
            try {
                strM4759g = m4759g();
            } catch (RuntimeException e10) {
                strM4759g = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM4759g != null && !strM4759g.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strM4759g);
                sb2.append("]");
            } else if (isDone()) {
                m4757a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
