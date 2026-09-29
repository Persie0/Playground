package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C0842cc;
import p000.C3386nv;
import p000.bna;
import p000.c76;
import p000.d32;
import p000.d76;
import p000.fy4;
import p000.m7d;
import p000.rm0;
import p000.sm0;
import p000.v63;
import p000.xfa;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3248a extends C3249b implements c76 {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48177j = AtomicReferenceFieldUpdater.newUpdater(C3248a.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ long f48178k = m7d.f50741a.objectFieldOffset(C3248a.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public C3248a() {
        super(1);
        this.owner$volatile = bna.f8738k;
    }

    @Override // p000.c76
    /* JADX INFO: renamed from: a */
    public final boolean mo4386a(Object obj) {
        int iM15597j = m15597j(obj);
        if (iM15597j == 0) {
            return true;
        }
        if (iM15597j == 1) {
            return false;
        }
        if (iM15597j != 2) {
            C3386nv.m17633t("unexpected");
            return false;
        }
        C3386nv.m17632s(obj, "This mutex is already locked by the specified owner: ");
        return false;
    }

    @Override // p000.c76
    /* JADX INFO: renamed from: b */
    public final void mo4387b(Object obj) {
        while (this.m15596i()) {
            f48177j.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f48178k;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            C0842cc c0842cc = bna.f8738k;
            if (objectVolatile != c0842cc) {
                if (objectVolatile != obj && obj != null) {
                    v63.m23145w("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = m7d.f50741a;
                    C3248a c3248a = this;
                    if (unsafe2.compareAndSwapObject(c3248a, f48178k, objectVolatile, c0842cc)) {
                        c3248a.m15600f();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(c3248a, j) != objectVolatile) {
                            this = c3248a;
                            break;
                        }
                        this = c3248a;
                    }
                }
            }
        }
        C3386nv.m17633t("This mutex is not locked");
    }

    @Override // p000.c76
    /* JADX INFO: renamed from: c */
    public final Object mo4388c(ContinuationImpl continuationImpl) {
        boolean zMo4386a = mo4386a(null);
        xfa xfaVar = xfa.f68157a;
        if (!zMo4386a) {
            sm0 sm0VarM17086E = AbstractC3352my.m17086E(AbstractC3584sr.m21600K(continuationImpl));
            try {
                d76 d76Var = new d76(this, sm0VarM17086E);
                while (true) {
                    int andDecrement = C3249b.f48183g.getAndDecrement(this);
                    if (andDecrement <= this.f48186a) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48177j;
                            C3248a c3248a = d76Var.f35086b;
                            atomicReferenceFieldUpdater.set(c3248a, null);
                            sm0 sm0Var = d76Var.f35085a;
                            sm0Var.m21457E(xfaVar, sm0Var.f49653c, new rm0(new fy4(c3248a, d76Var), 0));
                            break;
                        }
                        if (m15599e(d76Var)) {
                            break;
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

    /* JADX INFO: renamed from: h */
    public final int m15595h(Object obj) {
        while (m15596i()) {
            f48177j.getClass();
            Object objectVolatile = m7d.f50741a.getObjectVolatile(this, f48178k);
            if (objectVolatile != bna.f8738k) {
                return objectVolatile == obj ? 1 : 2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m15596i() {
        return Math.max(C3249b.f48183g.get(this), 0) == 0;
    }

    /* JADX INFO: renamed from: j */
    public final int m15597j(Object obj) {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3249b.f48183g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f48186a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else if (i2 <= 0) {
                if (obj == null) {
                    break;
                }
                int iM15595h = m15595h(obj);
                if (iM15595h == 1) {
                    return 2;
                }
                if (iM15595h == 2) {
                    break;
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                f48177j.getClass();
                m7d.f50741a.putObjectVolatile(this, f48178k, obj);
                return 0;
            }
        }
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(d32.m10016N(this));
        sb.append("[isLocked=");
        sb.append(m15596i());
        sb.append(",owner=");
        f48177j.getClass();
        sb.append(m7d.f50741a.getObjectVolatile(this, f48178k));
        sb.append(']');
        return sb.toString();
    }
}
