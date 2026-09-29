package p290o6;

import dm.C5207g;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jp.C6545m;
import p467wo.C9990e;
import sl.C9072e;
import to.C9347b;
import to.ThreadFactoryC9346a;

/* JADX INFO: renamed from: o6.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7965k0 {

    /* JADX INFO: renamed from: a */
    public Object f43358a;

    /* JADX INFO: renamed from: b */
    public final Object f43359b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final Object f43360c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final Object f43361d = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public final C9990e.a m15799a(String str) {
        for (C9990e.a aVar : (ArrayDeque) this.f43360c) {
            if (C5207g.m11106a(aVar.f50788c.f50775b.f47542a.f47458d, str)) {
                return aVar;
            }
        }
        for (C9990e.a aVar2 : (ArrayDeque) this.f43359b) {
            if (C5207g.m11106a(aVar2.f50788c.f50775b.f47542a.f47458d, str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m15800b(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            synchronized (this) {
            }
            m15802d();
        }
        C9072e c9072e = C9072e.f47360a;
        m15802d();
    }

    /* JADX INFO: renamed from: c */
    public final void m15801c(C9990e.a aVar) {
        C5207g.m11111f(aVar, "call");
        aVar.f50787b.decrementAndGet();
        m15800b((ArrayDeque) this.f43360c, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086 A[Catch: all -> 0x00ec, TryCatch #4 {, blocks: (B:34:0x0080, B:36:0x0086, B:37:0x00ad), top: B:65:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r3 < 5) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r1.remove();
        r2.f50787b.incrementAndGet();
        r0.add(r2);
        ((java.util.ArrayDeque) r15.f43360c).add(r2);
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m15802d() {
        int size;
        int size2;
        int i10;
        int i11;
        C9990e.a aVar;
        byte[] bArr = C9347b.f48082a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = ((ArrayDeque) this.f43359b).iterator();
            C5207g.m11110e(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                C9990e.a aVar2 = (C9990e.a) it.next();
                int size3 = ((ArrayDeque) this.f43360c).size();
                synchronized (this) {
                    if (size3 >= 64) {
                        break;
                    }
                    int i12 = aVar2.f50787b.get();
                    synchronized (this) {
                    }
                    aVar.getClass();
                    C9990e c9990e = aVar.f50788c;
                    C7965k0 c7965k0 = c9990e.f50774a.f47508a;
                    byte[] bArr2 = C9347b.f48082a;
                    try {
                        try {
                            executorService.execute(aVar);
                        } catch (RejectedExecutionException e10) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e10);
                            c9990e.m18576i(interruptedIOException);
                            ((C6545m.a) aVar.f50786a).m13134a(interruptedIOException);
                            c9990e.f50774a.f47508a.m15801c(aVar);
                        }
                        i10 = i11;
                    } catch (Throwable th2) {
                        c9990e.f50774a.f47508a.m15801c(aVar);
                        throw th2;
                    }
                }
                size2 = arrayList.size();
                i10 = 0;
                while (i10 < size2) {
                    i11 = i10 + 1;
                    aVar = (C9990e.a) arrayList.get(i10);
                    synchronized (this) {
                        if (((ExecutorService) this.f43358a) == null) {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            SynchronousQueue synchronousQueue = new SynchronousQueue();
                            String strM11116k = C5207g.m11116k(" Dispatcher", C9347b.f48088g);
                            C5207g.m11111f(strM11116k, "name");
                            this.f43358a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC9346a(strM11116k, false));
                        }
                        ExecutorService executorService = (ExecutorService) this.f43358a;
                        C5207g.m11108c(executorService);
                        aVar.getClass();
                        C9990e c9990e2 = aVar.f50788c;
                        C7965k0 c7965k1 = c9990e2.f50774a.f47508a;
                        byte[] bArr3 = C9347b.f48082a;
                        executorService.execute(aVar);
                        i10 = i11;
                    }
                }
                return z;
            }
            synchronized (this) {
                size = ((ArrayDeque) this.f43360c).size() + ((ArrayDeque) this.f43361d).size();
            }
        }
        boolean z10 = size > 0;
        C9072e c9072e = C9072e.f47360a;
        size2 = arrayList.size();
        i10 = 0;
        while (i10 < size2) {
            i11 = i10 + 1;
            aVar = (C9990e.a) arrayList.get(i10);
            synchronized (this) {
                if (((ExecutorService) this.f43358a) == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    String strM11116k2 = C5207g.m11116k(" Dispatcher", C9347b.f48088g);
                    C5207g.m11111f(strM11116k2, "name");
                    this.f43358a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit2, synchronousQueue2, new ThreadFactoryC9346a(strM11116k2, false));
                }
                ExecutorService executorService2 = (ExecutorService) this.f43358a;
                C5207g.m11108c(executorService2);
                aVar.getClass();
                C9990e c9990e3 = aVar.f50788c;
                C7965k0 c7965k2 = c9990e3.f50774a.f47508a;
                byte[] bArr4 = C9347b.f48082a;
                executorService2.execute(aVar);
                i10 = i11;
            }
        }
        return z10;
    }
}
