package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.selects.C3247b;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C0842cc;
import p000.C3386nv;
import p000.au8;
import p000.gu8;
import p000.ij6;
import p000.lda;
import p000.m7d;
import p000.qm0;
import p000.rm0;
import p000.sm0;
import p000.ux5;
import p000.wv8;
import p000.xfa;
import p000.xv8;
import p000.z1b;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.b */
/* JADX INFO: loaded from: classes.dex */
public class C3249b {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48179c = AtomicReferenceFieldUpdater.newUpdater(C3249b.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f48180d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48181e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f48182f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f48183g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f48184h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ long f48185i;
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final int f48186a;

    /* JADX INFO: renamed from: b */
    public final rm0 f48187b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = m7d.f50741a;
        f48184h = unsafe.objectFieldOffset(C3249b.class.getDeclaredField("head$volatile"));
        f48180d = AtomicLongFieldUpdater.newUpdater(C3249b.class, "deqIdx$volatile");
        f48181e = AtomicReferenceFieldUpdater.newUpdater(C3249b.class, Object.class, "tail$volatile");
        f48185i = unsafe.objectFieldOffset(C3249b.class.getDeclaredField("tail$volatile"));
        f48182f = AtomicLongFieldUpdater.newUpdater(C3249b.class, "enqIdx$volatile");
        f48183g = AtomicIntegerFieldUpdater.newUpdater(C3249b.class, "_availablePermits$volatile");
    }

    public C3249b(int i) {
        this.f48186a = i;
        if (i <= 0) {
            C3386nv.m17624j(ux5.m22988k(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            C3386nv.m17624j(ux5.m22988k(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        xv8 xv8Var = new xv8(0L, null, 2);
        this.head$volatile = xv8Var;
        this.tail$volatile = xv8Var;
        this._availablePermits$volatile = i;
        this.f48187b = new rm0(this, 12);
    }

    /* JADX INFO: renamed from: d */
    public final Object m15598d(ContinuationImpl continuationImpl) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = f48183g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.f48186a;
        } while (andDecrement > i);
        xfa xfaVar = xfa.f68157a;
        if (andDecrement <= 0) {
            sm0 sm0VarM17086E = AbstractC3352my.m17086E(AbstractC3584sr.m21600K(continuationImpl));
            try {
                if (!m15599e(sm0VarM17086E)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                sm0VarM17086E.mo10140j(xfaVar, this.f48187b);
                                break;
                            }
                            if (m15599e(sm0VarM17086E)) {
                                break;
                            }
                        }
                    }
                }
                Object objM21466r = sm0VarM17086E.m21466r();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM21466r != coroutineSingletons) {
                    objM21466r = xfaVar;
                }
                if (objM21466r == coroutineSingletons) {
                    return objM21466r;
                }
            } catch (Throwable th) {
                sm0VarM17086E.m21455C();
                throw th;
            }
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15599e(z1b z1bVar) {
        Object objM15219m;
        Unsafe unsafe;
        C3249b c3249b = this;
        f48181e.getClass();
        Unsafe unsafe2 = m7d.f50741a;
        long j = f48185i;
        xv8 xv8Var = (xv8) unsafe2.getObjectVolatile(c3249b, j);
        long andIncrement = f48182f.getAndIncrement(c3249b);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.f48175i;
        long j2 = andIncrement / ((long) wv8.f67394f);
        loop0: while (true) {
            objM15219m = AbstractC3184kh.m15219m(xv8Var, j2, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (lda.m16104D(objM15219m)) {
                break;
            }
            au8 au8VarM16102B = lda.m16102B(objM15219m);
            while (true) {
                au8 au8Var = (au8) m7d.f50741a.getObjectVolatile(c3249b, j);
                if (au8Var.f7522e >= au8VarM16102B.f7522e) {
                    c3249b = this;
                    break loop0;
                }
                if (!au8VarM16102B.m3065o()) {
                    break;
                }
                do {
                    unsafe = m7d.f50741a;
                    c3249b = this;
                    if (unsafe.compareAndSwapObject(c3249b, f48185i, au8Var, au8VarM16102B)) {
                        if (!au8Var.m3061k()) {
                            break loop0;
                        }
                        au8Var.m12578i();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(c3249b, j) == au8Var);
                if (au8VarM16102B.m3061k()) {
                    au8VarM16102B.m12578i();
                }
            }
            c3249b = this;
        }
        xv8 xv8Var2 = (xv8) lda.m16102B(objM15219m);
        AtomicReferenceArray atomicReferenceArray = xv8Var2.f68858g;
        int i = (int) (andIncrement % ((long) wv8.f67394f));
        while (!atomicReferenceArray.compareAndSet(i, null, z1bVar)) {
            if (atomicReferenceArray.get(i) != null) {
                C0842cc c0842cc = wv8.f67390b;
                C0842cc c0842cc2 = wv8.f67391c;
                while (!atomicReferenceArray.compareAndSet(i, c0842cc, c0842cc2)) {
                    if (atomicReferenceArray.get(i) != c0842cc) {
                        return false;
                    }
                }
                ((qm0) z1bVar).mo10140j(xfa.f68157a, c3249b.f48187b);
                return true;
            }
        }
        z1bVar.mo10138a(xv8Var2, i);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m15600f() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f48183g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f48186a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                ij6.m13948e(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m15601g());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15601g() {
        Object objM15219m;
        Unsafe unsafe;
        f48179c.getClass();
        Unsafe unsafe2 = m7d.f50741a;
        long j = f48184h;
        xv8 xv8Var = (xv8) unsafe2.getObjectVolatile(this, j);
        long andIncrement = f48180d.getAndIncrement(this);
        long j2 = andIncrement / ((long) wv8.f67394f);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.f48176i;
        loop0: while (true) {
            objM15219m = AbstractC3184kh.m15219m(xv8Var, j2, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (lda.m16104D(objM15219m)) {
                break;
            }
            au8 au8VarM16102B = lda.m16102B(objM15219m);
            while (true) {
                au8 au8Var = (au8) m7d.f50741a.getObjectVolatile(this, j);
                if (au8Var.f7522e >= au8VarM16102B.f7522e) {
                    break loop0;
                }
                if (!au8VarM16102B.m3065o()) {
                    break;
                }
                do {
                    unsafe = m7d.f50741a;
                    if (unsafe.compareAndSwapObject(this, f48184h, au8Var, au8VarM16102B)) {
                        if (!au8Var.m3061k()) {
                            break loop0;
                        }
                        au8Var.m12578i();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == au8Var);
                if (au8VarM16102B.m3061k()) {
                    au8VarM16102B.m12578i();
                }
            }
        }
        xv8 xv8Var2 = (xv8) lda.m16102B(objM15219m);
        AtomicReferenceArray atomicReferenceArray = xv8Var2.f68858g;
        xv8Var2.m12572a();
        boolean z = false;
        if (xv8Var2.f7522e <= j2) {
            int i = (int) (andIncrement % ((long) wv8.f67394f));
            Object andSet = atomicReferenceArray.getAndSet(i, wv8.f67390b);
            if (andSet == null) {
                int i2 = wv8.f67389a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == wv8.f67391c) {
                        return true;
                    }
                }
                C0842cc c0842cc = wv8.f67390b;
                C0842cc c0842cc2 = wv8.f67392d;
                while (!atomicReferenceArray.compareAndSet(i, c0842cc, c0842cc2)) {
                    if (atomicReferenceArray.get(i) != c0842cc) {
                        return !z;
                    }
                }
                z = true;
                return !z;
            }
            if (andSet != wv8.f67393e) {
                boolean z2 = andSet instanceof qm0;
                xfa xfaVar = xfa.f68157a;
                if (!z2) {
                    if (andSet instanceof gu8) {
                        return ((C3247b) ((gu8) andSet)).m15593i(this, xfaVar) == 0;
                    }
                    C3386nv.m17632s(andSet, "unexpected: ");
                    return false;
                }
                qm0 qm0Var = (qm0) andSet;
                C0842cc c0842ccMo10139d = qm0Var.mo10139d(xfaVar, this.f48187b);
                if (c0842ccMo10139d != null) {
                    qm0Var.mo10142s(c0842ccMo10139d);
                    return true;
                }
            }
        }
        return false;
    }
}
