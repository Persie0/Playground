package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.Objects;
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
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3058h0;
import p000.C3095i0;
import p000.C3130j0;
import p000.C3281l0;
import p000.C3556s0;
import p000.C3594t0;
import p000.InterfaceC3318m0;
import p000.RunnableC3167k0;
import p000.bna;
import p000.nv4;
import p000.ux5;
import p000.vz1;
import p000.wyb;

/* JADX INFO: renamed from: com.google.common.util.concurrent.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1112b implements ListenableFuture {

    /* JADX INFO: renamed from: d */
    public static final boolean f13520d;

    /* JADX INFO: renamed from: e */
    public static final nv4 f13521e;

    /* JADX INFO: renamed from: f */
    public static final vz1 f13522f;

    /* JADX INFO: renamed from: g */
    public static final Object f13523g;

    /* JADX INFO: renamed from: a */
    public volatile Object f13524a;

    /* JADX INFO: renamed from: b */
    public volatile C3095i0 f13525b;

    /* JADX INFO: renamed from: c */
    public volatile C3594t0 f13526c;

    static {
        boolean z;
        Throwable th;
        vz1 c3281l0;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f13520d = z;
        f13521e = new nv4(AbstractC1112b.class);
        Throwable th2 = null;
        try {
            c3281l0 = new C3556s0();
            th = null;
        } catch (Error | Exception e) {
            th = e;
            try {
                c3281l0 = new C3130j0(AtomicReferenceFieldUpdater.newUpdater(C3594t0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C3594t0.class, C3594t0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1112b.class, C3594t0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1112b.class, C3095i0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1112b.class, Object.class, "a"));
            } catch (Error | Exception e2) {
                th2 = e2;
                c3281l0 = new C3281l0();
            }
        }
        f13522f = c3281l0;
        if (th2 != null) {
            nv4 nv4Var = f13521e;
            Logger loggerM17640a = nv4Var.m17640a();
            Level level = Level.SEVERE;
            loggerM17640a.log(level, "UnsafeAtomicHelper is broken!", th);
            nv4Var.m17640a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        f13523g = new Object();
    }

    /* JADX INFO: renamed from: f */
    public static void m6377f(AbstractC1112b abstractC1112b, boolean z) {
        C3095i0 c3095i0 = null;
        while (true) {
            for (C3594t0 c3594t0Mo14230F = f13522f.mo14230F(abstractC1112b); c3594t0Mo14230F != null; c3594t0Mo14230F = c3594t0Mo14230F.f61686b) {
                Thread thread = c3594t0Mo14230F.f61685a;
                if (thread != null) {
                    c3594t0Mo14230F.f61685a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractC1112b.mo6383j();
                z = false;
            }
            abstractC1112b.mo42d();
            C3095i0 c3095i1 = c3095i0;
            C3095i0 c3095i0Mo14229E = f13522f.mo14229E(abstractC1112b);
            C3095i0 c3095i2 = c3095i1;
            while (c3095i0Mo14229E != null) {
                C3095i0 c3095i3 = c3095i0Mo14229E.f43269c;
                c3095i0Mo14229E.f43269c = c3095i2;
                c3095i2 = c3095i0Mo14229E;
                c3095i0Mo14229E = c3095i3;
            }
            while (c3095i2 != null) {
                c3095i0 = c3095i2.f43269c;
                Runnable runnable = c3095i2.f43267a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC3167k0) {
                    RunnableC3167k0 runnableC3167k0 = (RunnableC3167k0) runnable;
                    abstractC1112b = runnableC3167k0.f46448a;
                    if (abstractC1112b.f13524a == runnableC3167k0) {
                        if (f13522f.mo14234l(abstractC1112b, runnableC3167k0, m6380i(runnableC3167k0.f46449b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c3095i2.f43268b;
                    Objects.requireNonNull(executor);
                    m6378g(runnable, executor);
                }
                c3095i2 = c3095i0;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m6378g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f13521e.m17640a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Object m6379h(Object obj) throws ExecutionException {
        if (obj instanceof C3058h0) {
            Throwable th = ((C3058h0) obj).f41587b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1111a) {
            throw new ExecutionException(((C1111a) obj).f13519a);
        }
        if (obj == f13523g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public static Object m6380i(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thM6388p;
        if (listenableFuture instanceof InterfaceC3318m0) {
            Object c3058h0 = ((AbstractC1112b) listenableFuture).f13524a;
            if (c3058h0 instanceof C3058h0) {
                C3058h0 c3058h1 = (C3058h0) c3058h0;
                if (c3058h1.f41586a) {
                    c3058h0 = c3058h1.f41587b != null ? new C3058h0(c3058h1.f41587b, false) : C3058h0.f41585d;
                }
            }
            Objects.requireNonNull(c3058h0);
            return c3058h0;
        }
        if ((listenableFuture instanceof AbstractC1112b) && (thM6388p = ((AbstractC1112b) listenableFuture).m6388p()) != null) {
            return new C1111a(thM6388p);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!f13520d) && zIsCancelled) {
            C3058h0 c3058h2 = C3058h0.f41585d;
            Objects.requireNonNull(c3058h2);
            return c3058h2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e) {
                return new C1111a(e);
            } catch (CancellationException e2) {
                if (zIsCancelled) {
                    return new C3058h0(e2, false);
                }
                return new C1111a(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
            } catch (ExecutionException e3) {
                if (!zIsCancelled) {
                    return new C1111a(e3.getCause());
                }
                return new C3058h0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3), false);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? f13523g : obj;
        }
        return new C3058h0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: a */
    public void mo52a(Runnable runnable, Executor executor) {
        C3095i0 c3095i0;
        C3095i0 c3095i1 = C3095i0.f43266d;
        bna.m3979v(executor, "Executor was null.");
        if (!isDone() && (c3095i0 = this.f13525b) != c3095i1) {
            C3095i0 c3095i2 = new C3095i0(runnable, executor);
            do {
                c3095i2.f43269c = c3095i0;
                if (f13522f.mo14233k(this, c3095i0, c3095i2)) {
                    return;
                } else {
                    c3095i0 = this.f13525b;
                }
            } while (c3095i0 != c3095i1);
        }
        m6378g(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public final void m6381c(StringBuilder sb) {
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
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        m6382e(sb, obj);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C3058h0 c3058h0;
        Object obj = this.f13524a;
        if (!(obj == null) && !(obj instanceof RunnableC3167k0)) {
            return false;
        }
        if (f13520d) {
            c3058h0 = new C3058h0(new CancellationException("Future.cancel() was called."), z);
        } else {
            c3058h0 = z ? C3058h0.f41584c : C3058h0.f41585d;
            Objects.requireNonNull(c3058h0);
        }
        boolean z2 = false;
        while (true) {
            if (f13522f.mo14234l(this, obj, c3058h0)) {
                m6377f(this, z);
                if (obj instanceof RunnableC3167k0) {
                    ListenableFuture listenableFuture = ((RunnableC3167k0) obj).f46449b;
                    if (listenableFuture instanceof InterfaceC3318m0) {
                        this = (AbstractC1112b) listenableFuture;
                        obj = this.f13524a;
                        if ((obj == null) | (obj instanceof RunnableC3167k0)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f13524a;
            if (!(obj instanceof RunnableC3167k0)) {
                return z2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo42d() {
    }

    /* JADX INFO: renamed from: e */
    public final void m6382e(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        C3594t0 c3594t0 = C3594t0.f61684c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f13524a;
        if ((obj != null) && (!(obj instanceof RunnableC3167k0))) {
            return m6379h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C3594t0 c3594t1 = this.f13526c;
            if (c3594t1 != c3594t0) {
                C3594t0 c3594t2 = new C3594t0();
                z = true;
                while (true) {
                    vz1 vz1Var = f13522f;
                    vz1Var.mo14231S(c3594t2, c3594t1);
                    if (vz1Var.mo14235m(this, c3594t1, c3594t2)) {
                        do {
                            wyb.m24220a(this, nanos);
                            if (Thread.interrupted()) {
                                m6384l(c3594t2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f13524a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC3167k0))) {
                                return m6379h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m6384l(c3594t2);
                        break;
                    }
                    c3594t1 = this.f13526c;
                    if (c3594t1 == c3594t0) {
                    }
                }
            }
            Object obj3 = this.f13524a;
            Objects.requireNonNull(obj3);
            return m6379h(obj3);
        }
        z = true;
        while (nanos > 0) {
            Object obj4 = this.f13524a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof RunnableC3167k0))) {
                return m6379h(obj4);
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
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z2) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC3393o1.m17735j(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f13524a instanceof C3058h0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f13524a;
        return (!(obj instanceof RunnableC3167k0)) & (obj != null);
    }

    /* JADX INFO: renamed from: j */
    public void mo6383j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public String mo43k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: l */
    public final void m6384l(C3594t0 c3594t0) {
        c3594t0.f61685a = null;
        while (true) {
            C3594t0 c3594t1 = this.f13526c;
            if (c3594t1 == C3594t0.f61684c) {
                return;
            }
            C3594t0 c3594t2 = null;
            while (c3594t1 != null) {
                C3594t0 c3594t3 = c3594t1.f61686b;
                if (c3594t1.f61685a != null) {
                    c3594t2 = c3594t1;
                } else if (c3594t2 != null) {
                    c3594t2.f61686b = c3594t3;
                    if (c3594t2.f61685a == null) {
                    }
                } else if (!f13522f.mo14235m(this, c3594t1, c3594t3)) {
                }
                c3594t1 = c3594t3;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m6385m(Object obj) {
        if (obj == null) {
            obj = f13523g;
        }
        if (!f13522f.mo14234l(this, null, obj)) {
            return false;
        }
        m6377f(this, false);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m6386n(Throwable th) {
        th.getClass();
        if (!f13522f.mo14234l(this, null, new C1111a(th))) {
            return false;
        }
        m6377f(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX INFO: renamed from: o */
    public boolean m6387o(ListenableFuture listenableFuture) {
        C1111a c1111a;
        listenableFuture.getClass();
        Object obj = this.f13524a;
        if (obj != null) {
            if (obj instanceof C3058h0) {
                listenableFuture.cancel(((C3058h0) obj).f41586a);
            }
        } else if (listenableFuture.isDone()) {
            if (f13522f.mo14234l(this, null, m6380i(listenableFuture))) {
                m6377f(this, false);
                return true;
            }
        } else {
            RunnableC3167k0 runnableC3167k0 = new RunnableC3167k0(this, listenableFuture);
            if (f13522f.mo14234l(this, null, runnableC3167k0)) {
                try {
                    listenableFuture.mo52a(runnableC3167k0, DirectExecutor.INSTANCE);
                    return true;
                } catch (Throwable th) {
                    try {
                        c1111a = new C1111a(th);
                    } catch (Error | Exception unused) {
                        c1111a = C1111a.f13518b;
                    }
                    f13522f.mo14234l(this, runnableC3167k0, c1111a);
                    return true;
                }
            }
            obj = this.f13524a;
            if (obj instanceof C3058h0) {
                listenableFuture.cancel(((C3058h0) obj).f41586a);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final Throwable m6388p() {
        if (!(this instanceof InterfaceC3318m0)) {
            return null;
        }
        Object obj = this.f13524a;
        if (obj instanceof C1111a) {
            return ((C1111a) obj).f13519a;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m6389q() {
        Object obj = this.f13524a;
        return (obj instanceof C3058h0) && ((C3058h0) obj).f41586a;
    }

    public String toString() {
        String strMo43k;
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
            m6381c(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f13524a;
            if (obj instanceof RunnableC3167k0) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((RunnableC3167k0) obj).f46449b;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Exception | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strMo43k = mo43k();
                    if (AbstractC3352my.m17115d0(strMo43k)) {
                        strMo43k = null;
                    }
                } catch (Exception | StackOverflowError e2) {
                    strMo43k = "Exception thrown from implementation: " + e2.getClass();
                }
                if (strMo43k != null) {
                    sb.append(", info=[");
                    sb.append(strMo43k);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m6381c(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        C3594t0 c3594t0 = C3594t0.f61684c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f13524a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC3167k0))) {
                return m6379h(obj2);
            }
            C3594t0 c3594t1 = this.f13526c;
            if (c3594t1 != c3594t0) {
                C3594t0 c3594t2 = new C3594t0();
                do {
                    vz1 vz1Var = f13522f;
                    vz1Var.mo14231S(c3594t2, c3594t1);
                    if (vz1Var.mo14235m(this, c3594t1, c3594t2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f13524a;
                            } else {
                                m6384l(c3594t2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC3167k0))));
                        return m6379h(obj);
                    }
                    c3594t1 = this.f13526c;
                } while (c3594t1 != c3594t0);
            }
            Object obj3 = this.f13524a;
            Objects.requireNonNull(obj3);
            return m6379h(obj3);
        }
        throw new InterruptedException();
    }
}
