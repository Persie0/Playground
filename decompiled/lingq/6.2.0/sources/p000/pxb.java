package p000;

import com.google.android.gms.internal.play_billing.C0987b;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class pxb extends ytb implements vwb {

    /* JADX INFO: renamed from: h */
    public vwb f56962h;

    /* JADX INFO: renamed from: i */
    public ScheduledFuture f56963i;

    /* JADX INFO: renamed from: e */
    public static Object m19558e(Object obj) throws ExecutionException {
        if (obj instanceof ktb) {
            Throwable th = ((ktb) obj).f48421b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0987b) {
            throw new ExecutionException(((C0987b) obj).f12178a);
        }
        if (obj == ytb.f70454d) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m19559g(Object obj) {
        return !(obj instanceof ltb);
    }

    /* JADX INFO: renamed from: h */
    public static Object m19560h(vwb vwbVar) {
        Object obj;
        Throwable thMo19563d;
        if (vwbVar instanceof pxb) {
            Object ktbVar = ((pxb) vwbVar).f70458a;
            if (ktbVar instanceof ktb) {
                ktb ktbVar2 = (ktb) ktbVar;
                if (ktbVar2.f48420a) {
                    Throwable th = ktbVar2.f48421b;
                    ktbVar = th != null ? new ktb(th, false) : ktb.f48419d;
                }
            }
            Objects.requireNonNull(ktbVar);
            return ktbVar;
        }
        if ((vwbVar instanceof ytb) && (thMo19563d = ((ytb) vwbVar).mo19563d()) != null) {
            return new C0987b(thMo19563d);
        }
        boolean zIsCancelled = vwbVar.isCancelled();
        boolean z = true;
        if ((!ytb.f70456f) && zIsCancelled) {
            ktb ktbVar3 = ktb.f48419d;
            Objects.requireNonNull(ktbVar3);
            return ktbVar3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = vwbVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e) {
                return new C0987b(e);
            } catch (CancellationException e2) {
                return !zIsCancelled ? new C0987b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(vwbVar)), e2)) : new ktb(e2, false);
            } catch (ExecutionException e3) {
                return zIsCancelled ? new ktb(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(vwbVar)), e3), false) : new C0987b(e3.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (zIsCancelled) {
            return new ktb(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(vwbVar))), false);
        }
        return obj == null ? ytb.f70454d : obj;
    }

    /* JADX INFO: renamed from: j */
    public static void m19561j(pxb pxbVar) {
        mtb mtbVar = null;
        while (true) {
            pxbVar.getClass();
            for (ttb ttbVarMo11789b = ytb.f70457g.mo11789b(pxbVar); ttbVarMo11789b != null; ttbVarMo11789b = ttbVarMo11789b.f62874b) {
                Thread thread = ttbVarMo11789b.f62873a;
                if (thread != null) {
                    ttbVarMo11789b.f62873a = null;
                    LockSupport.unpark(thread);
                }
            }
            vwb vwbVar = pxbVar.f56962h;
            if ((pxbVar.f70458a instanceof ktb) & (vwbVar != null)) {
                Object obj = pxbVar.f70458a;
                vwbVar.cancel((obj instanceof ktb) && ((ktb) obj).f48420a);
            }
            ScheduledFuture scheduledFuture = pxbVar.f56963i;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            pxbVar.f56962h = null;
            pxbVar.f56963i = null;
            mtb mtbVar2 = mtbVar;
            mtb mtbVarMo11788a = ytb.f70457g.mo11788a(pxbVar);
            mtb mtbVar3 = mtbVar2;
            while (mtbVarMo11788a != null) {
                mtb mtbVar4 = mtbVarMo11788a.f51838c;
                mtbVarMo11788a.f51838c = mtbVar3;
                mtbVar3 = mtbVarMo11788a;
                mtbVarMo11788a = mtbVar4;
            }
            while (mtbVar3 != null) {
                Runnable runnable = mtbVar3.f51836a;
                mtb mtbVar5 = mtbVar3.f51838c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof ltb) {
                    ltb ltbVar = (ltb) runnable;
                    pxbVar = ltbVar.f50122a;
                    if (pxbVar.f70458a != ltbVar) {
                        continue;
                    } else if (ytb.f70457g.mo11793f(pxbVar, ltbVar, m19560h(ltbVar.f50123b))) {
                        mtbVar = mtbVar5;
                    }
                } else {
                    Executor executor = mtbVar3.f51837b;
                    Objects.requireNonNull(executor);
                    m19562k(runnable, executor);
                }
                mtbVar3 = mtbVar5;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m19562k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            ytb.f70455e.m20965a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", wq1.m24119o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // p000.vwb
    /* JADX INFO: renamed from: b */
    public final void mo16661b(Runnable runnable, Executor executor) {
        mtb mtbVar;
        mtb mtbVar2 = mtb.f51835d;
        if (executor == null) {
            C3386nv.m17635v("Executor was null.");
            return;
        }
        if (!isDone() && (mtbVar = this.f70459b) != mtbVar2) {
            mtb mtbVar3 = new mtb(runnable, executor);
            do {
                mtbVar3.f51838c = mtbVar;
                if (ytb.f70457g.mo11792e(this, mtbVar, mtbVar3)) {
                    return;
                } else {
                    mtbVar = this.f70459b;
                }
            } while (mtbVar != mtbVar2);
        }
        m19562k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ktb ktbVar;
        Object obj = this.f70458a;
        if (!(obj instanceof ltb) && !(obj == null)) {
            return false;
        }
        if (ytb.f70456f) {
            ktbVar = new ktb(new CancellationException("Future.cancel() was called."), z);
        } else {
            ktbVar = z ? ktb.f48418c : ktb.f48419d;
            Objects.requireNonNull(ktbVar);
        }
        boolean z2 = false;
        while (true) {
            if (ytb.f70457g.mo11793f(this, obj, ktbVar)) {
                m19561j(this);
                if (obj instanceof ltb) {
                    vwb vwbVar = ((ltb) obj).f50123b;
                    if (vwbVar instanceof pxb) {
                        this = (pxb) vwbVar;
                        obj = this.f70458a;
                        if ((obj == null) | (obj instanceof ltb)) {
                            z2 = true;
                        }
                    } else {
                        vwbVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.f70458a;
            if (m19559g(obj)) {
                return z2;
            }
        }
    }

    @Override // p000.ytb
    /* JADX INFO: renamed from: d */
    public final Throwable mo19563d() {
        if (!(this instanceof pxb)) {
            return null;
        }
        Object obj = this.f70458a;
        if (obj instanceof C0987b) {
            return ((C0987b) obj).f12178a;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m19564f() {
        vwb vwbVar = this.f56962h;
        ScheduledFuture scheduledFuture = this.f56963i;
        if (vwbVar == null) {
            return null;
        }
        String strM24118n = wq1.m24118n("inputFuture=[", vwbVar.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strM24118n + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strM24118n;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        ttb ttbVar = ttb.f62872c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f70458a;
        if ((obj != null) && m19559g(obj)) {
            return m19558e(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ttb ttbVar2 = this.f70460c;
            if (ttbVar2 != ttbVar) {
                ttb ttbVar3 = new ttb();
                while (true) {
                    fdd fddVar = ytb.f70457g;
                    fddVar.mo11790c(ttbVar3, ttbVar2);
                    if (fddVar.mo11794g(this, ttbVar2, ttbVar3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m25317c(ttbVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f70458a;
                            if ((obj2 != null) && m19559g(obj2)) {
                                return m19558e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m25317c(ttbVar3);
                        break;
                    }
                    long j4 = j3;
                    ttbVar2 = this.f70460c;
                    if (ttbVar2 != ttbVar) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.f70458a;
            Objects.requireNonNull(obj3);
            return m19558e(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.f70458a;
            if ((obj4 != null) && m19559g(obj4)) {
                return m19558e(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == j2 || nanos2 > 1000;
            if (jConvert > j2) {
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

    /* JADX INFO: renamed from: i */
    public final void m19565i(StringBuilder sb) {
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
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f70458a instanceof ktb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f70458a;
        return (obj != null) & m19559g(obj);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f70458a instanceof ktb) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m19565i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f70458a;
            if (obj instanceof ltb) {
                sb.append(", setFuture=[");
                vwb vwbVar = ((ltb) obj).f50123b;
                try {
                    if (vwbVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(vwbVar);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = m19564f();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m19565i(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        ttb ttbVar = ttb.f62872c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f70458a;
            if ((obj2 != null) & m19559g(obj2)) {
                return m19558e(obj2);
            }
            ttb ttbVar2 = this.f70460c;
            if (ttbVar2 != ttbVar) {
                ttb ttbVar3 = new ttb();
                do {
                    fdd fddVar = ytb.f70457g;
                    fddVar.mo11790c(ttbVar3, ttbVar2);
                    if (fddVar.mo11794g(this, ttbVar2, ttbVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f70458a;
                            } else {
                                m25317c(ttbVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & m19559g(obj)));
                        return m19558e(obj);
                    }
                    ttbVar2 = this.f70460c;
                } while (ttbVar2 != ttbVar);
            }
            Object obj3 = this.f70458a;
            Objects.requireNonNull(obj3);
            return m19558e(obj3);
        }
        throw new InterruptedException();
    }
}
