package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bev implements nps {

    /* JADX INFO: renamed from: b */
    static final bem f3065b;

    /* JADX INFO: renamed from: c */
    public static final Object f3066c;

    /* JADX INFO: renamed from: d */
    volatile Object f3068d;

    /* JADX INFO: renamed from: e */
    volatile beq f3069e;

    /* JADX INFO: renamed from: f */
    volatile beu f3070f;

    /* JADX INFO: renamed from: a */
    static final boolean f3064a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: g */
    private static final Logger f3067g = Logger.getLogger(bev.class.getName());

    static {
        bem betVar;
        try {
            betVar = new ber(AtomicReferenceFieldUpdater.newUpdater(beu.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(beu.class, beu.class, "c"), AtomicReferenceFieldUpdater.newUpdater(bev.class, beu.class, "f"), AtomicReferenceFieldUpdater.newUpdater(bev.class, beq.class, "e"), AtomicReferenceFieldUpdater.newUpdater(bev.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            betVar = new bet();
        }
        f3065b = betVar;
        if (th != null) {
            f3067g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3066c = new Object();
    }

    protected bev() {
    }

    /* JADX INFO: renamed from: a */
    static Object m2272a(nps npsVar) {
        if (npsVar instanceof bev) {
            Object obj = ((bev) npsVar).f3068d;
            if (!(obj instanceof ben)) {
                return obj;
            }
            ben benVar = (ben) obj;
            if (!benVar.f3046c) {
                return obj;
            }
            Throwable th = benVar.f3047d;
            return th != null ? new ben(false, th) : ben.f3045b;
        }
        boolean zIsCancelled = npsVar.isCancelled();
        if ((!f3064a) && zIsCancelled) {
            return ben.f3045b;
        }
        try {
            Object objM2276i = m2276i(npsVar);
            return objM2276i == null ? f3066c : objM2276i;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new ben(false, e);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb.append(npsVar);
            return new bep(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(npsVar)), e));
        } catch (ExecutionException e2) {
            return new bep(e2.getCause());
        } catch (Throwable th2) {
            return new bep(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    static void m2273b(bev bevVar) {
        beq beqVar;
        beq beqVar2;
        beq beqVar3 = null;
        while (true) {
            beu beuVar = bevVar.f3070f;
            if (f3065b.mo2270e(bevVar, beuVar, beu.f3061a)) {
                while (beuVar != null) {
                    Thread thread = beuVar.f3062b;
                    if (thread != null) {
                        beuVar.f3062b = null;
                        LockSupport.unpark(thread);
                    }
                    beuVar = beuVar.f3063c;
                }
                do {
                    beqVar = bevVar.f3069e;
                } while (!f3065b.mo2268c(bevVar, beqVar, beq.f3050a));
                while (true) {
                    beqVar2 = beqVar3;
                    beqVar3 = beqVar;
                    if (beqVar3 == null) {
                        break;
                    }
                    beqVar = beqVar3.f3053d;
                    beqVar3.f3053d = beqVar2;
                }
                while (beqVar2 != null) {
                    beqVar3 = beqVar2.f3053d;
                    Runnable runnable = beqVar2.f3051b;
                    if (runnable instanceof bes) {
                        bes besVar = (bes) runnable;
                        bevVar = besVar.f3059a;
                        if (bevVar.f3068d == besVar) {
                            if (f3065b.mo2269d(bevVar, besVar, m2272a(besVar.f3060b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m2279l(runnable, beqVar2.f3052c);
                    }
                    beqVar2 = beqVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    static void m2274c(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static bev m2275g() {
        return new bev();
    }

    /* JADX INFO: renamed from: i */
    private static Object m2276i(Future future) {
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

    /* JADX INFO: renamed from: j */
    private final String m2277j(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: k */
    private final void m2278k(StringBuilder sb) {
        try {
            Object objM2276i = m2276i(this);
            sb.append("SUCCESS, result=[");
            sb.append(m2277j(objM2276i));
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

    /* JADX INFO: renamed from: l */
    private static void m2279l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f3067g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m2280m(beu beuVar) {
        beuVar.f3062b = null;
        while (true) {
            beu beuVar2 = this.f3070f;
            if (beuVar2 != beu.f3061a) {
                beu beuVar3 = null;
                while (beuVar2 != null) {
                    beu beuVar4 = beuVar2.f3063c;
                    if (beuVar2.f3062b != null) {
                        beuVar3 = beuVar2;
                    } else if (beuVar3 != null) {
                        beuVar3.f3063c = beuVar4;
                        if (beuVar3.f3062b == null) {
                        }
                    } else if (!f3065b.mo2270e(this, beuVar2, beuVar4)) {
                    }
                    beuVar2 = beuVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: n */
    private static final Object m2281n(Object obj) throws ExecutionException {
        if (obj instanceof ben) {
            Throwable th = ((ben) obj).f3047d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof bep) {
            throw new ExecutionException(((bep) obj).f3049b);
        }
        if (obj == f3066c) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ben benVar;
        Object obj = this.f3068d;
        if (!(obj instanceof bes) && !(obj == null)) {
            return false;
        }
        if (f3064a) {
            benVar = new ben(z, new CancellationException("Future.cancel() was called."));
        } else {
            benVar = z ? ben.f3044a : ben.f3045b;
        }
        boolean z2 = false;
        nps npsVar = this;
        while (true) {
            bev bevVar = (bev) npsVar;
            if (f3065b.mo2269d(bevVar, obj, benVar)) {
                m2273b(bevVar);
                if (obj instanceof bes) {
                    npsVar = ((bes) obj).f3060b;
                    if (npsVar instanceof bev) {
                        obj = ((bev) npsVar).f3068d;
                        if (!(obj == null) && !(obj instanceof bes)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        npsVar.cancel(z);
                    }
                }
                return true;
            }
            obj = bevVar.f3068d;
            if (!(obj instanceof bes)) {
                return z2;
            }
        }
    }

    @Override // p000.nps
    /* JADX INFO: renamed from: d */
    public final void mo2282d(Runnable runnable, Executor executor) {
        m2274c(runnable);
        m2274c(executor);
        beq beqVar = this.f3069e;
        if (beqVar != beq.f3050a) {
            beq beqVar2 = new beq(runnable, executor);
            do {
                beqVar2.f3053d = beqVar;
                if (f3065b.mo2268c(this, beqVar, beqVar2)) {
                    return;
                } else {
                    beqVar = this.f3069e;
                }
            } while (beqVar != beq.f3050a);
        }
        m2279l(runnable, executor);
    }

    /* JADX INFO: renamed from: e */
    public final void m2283e(Throwable th) {
        if (f3065b.mo2269d(this, null, new bep(th))) {
            m2273b(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2284f(nps npsVar) {
        bep bepVar;
        m2274c(npsVar);
        Object obj = this.f3068d;
        if (obj == null) {
            if (npsVar.isDone()) {
                if (f3065b.mo2269d(this, null, m2272a(npsVar))) {
                    m2273b(this);
                    return;
                }
                return;
            }
            bes besVar = new bes(this, npsVar);
            if (f3065b.mo2269d(this, null, besVar)) {
                try {
                    npsVar.mo2282d(besVar, bew.INSTANCE);
                    return;
                } catch (Throwable th) {
                    try {
                        bepVar = new bep(th);
                    } catch (Throwable th2) {
                        bepVar = bep.f3048a;
                    }
                    f3065b.mo2269d(this, besVar, bepVar);
                    return;
                }
            }
            obj = this.f3068d;
        }
        if (obj instanceof ben) {
            npsVar.cancel(((ben) obj).f3046c);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f3068d;
        if ((obj2 != null) && (!(obj2 instanceof bes))) {
            return m2281n(obj2);
        }
        beu beuVar = this.f3070f;
        if (beuVar != beu.f3061a) {
            beu beuVar2 = new beu();
            do {
                beuVar2.m2271a(beuVar);
                if (f3065b.mo2270e(this, beuVar, beuVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m2280m(beuVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f3068d;
                    } while (!((obj != null) & (!(obj instanceof bes))));
                    return m2281n(obj);
                }
                beuVar = this.f3070f;
            } while (beuVar != beu.f3061a);
        }
        return m2281n(this.f3068d);
    }

    /* JADX INFO: renamed from: h */
    public final void m2285h(Object obj) {
        if (obj == null) {
            obj = f3066c;
        }
        if (f3065b.mo2269d(this, null, obj)) {
            m2273b(this);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3068d instanceof ben;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f3068d;
        return (obj != null) & (!(obj instanceof bes));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(TVkaNXnfP.zCZP);
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2278k(sb);
        } else {
            try {
                Object obj = this.f3068d;
                if (obj instanceof bes) {
                    strConcat = "setFuture=[" + m2277j(((bes) obj).f3060b) + "]";
                } else {
                    strConcat = null;
                }
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
                m2278k(sb);
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
        Object obj = this.f3068d;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof bes))) {
            return m2281n(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            beu beuVar = this.f3070f;
            if (beuVar != beu.f3061a) {
                beu beuVar2 = new beu();
                while (true) {
                    beuVar2.m2271a(beuVar);
                    if (f3065b.mo2270e(this, beuVar, beuVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m2280m(beuVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3068d;
                            if ((obj2 != null) && (!(obj2 instanceof bes))) {
                                return m2281n(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m2280m(beuVar2);
                        break;
                    }
                    beuVar = this.f3070f;
                    if (beuVar == beu.f3061a) {
                    }
                }
            }
            return m2281n(this.f3068d);
        }
        while (nanos > 0) {
            Object obj3 = this.f3068d;
            if ((obj3 != null) && (!(obj3 instanceof bes))) {
                return m2281n(obj3);
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
