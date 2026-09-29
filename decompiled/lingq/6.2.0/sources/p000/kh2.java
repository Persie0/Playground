package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DispatchException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class kh2 extends lh2 implements vn1, Continuation {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f47287h = AtomicReferenceFieldUpdater.newUpdater(kh2.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ long f47288i = m7d.f50741a.objectFieldOffset(kh2.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d */
    public final nn1 f47289d;

    /* JADX INFO: renamed from: e */
    public final ContinuationImpl f47290e;

    /* JADX INFO: renamed from: f */
    public Object f47291f;

    /* JADX INFO: renamed from: g */
    public final Object f47292g;

    public kh2(nn1 nn1Var, ContinuationImpl continuationImpl) {
        super(-1);
        this.f47289d = nn1Var;
        this.f47290e = continuationImpl;
        this.f47291f = eh0.f37244j;
        this.f47292g = r46.m20370M(continuationImpl.getContext());
    }

    @Override // p000.lh2
    /* JADX INFO: renamed from: c */
    public final Continuation mo15233c() {
        return this;
    }

    @Override // p000.vn1
    public final vn1 getCallerFrame() {
        return this.f47290e;
    }

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        return this.f47290e.getContext();
    }

    @Override // p000.lh2
    /* JADX INFO: renamed from: h */
    public final Object mo15234h() {
        Object obj = this.f47291f;
        this.f47291f = eh0.f37244j;
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public final void m15235i() {
        do {
            f47287h.getClass();
        } while (m7d.f50741a.getObjectVolatile(this, f47288i) == eh0.f37245k);
    }

    /* JADX INFO: renamed from: k */
    public final sm0 m15236k() {
        kh2 kh2Var;
        C0842cc c0842cc = eh0.f37245k;
        while (true) {
            f47287h.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f47288i;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, c0842cc);
                return null;
            }
            if (objectVolatile instanceof sm0) {
                while (true) {
                    Unsafe unsafe2 = m7d.f50741a;
                    kh2 kh2Var2 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(kh2Var2, f47288i, objectVolatile, c0842cc);
                    kh2Var = kh2Var2;
                    if (zCompareAndSwapObject) {
                        return (sm0) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(kh2Var, j) != objectVolatile) {
                        break;
                    }
                    this = kh2Var;
                }
            } else {
                kh2Var = this;
                if (objectVolatile != c0842cc && !(objectVolatile instanceof Throwable)) {
                    C3386nv.m17632s(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = kh2Var;
        }
    }

    /* JADX INFO: renamed from: m */
    public final sm0 m15237m() {
        f47287h.getClass();
        Object objectVolatile = m7d.f50741a.getObjectVolatile(this, f47288i);
        if (objectVolatile instanceof sm0) {
            return (sm0) objectVolatile;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m15238n() {
        f47287h.getClass();
        return m7d.f50741a.getObjectVolatile(this, f47288i) != null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m15239o(Throwable th) {
        kh2 kh2Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            f47287h.getClass();
            Unsafe unsafe2 = m7d.f50741a;
            long j = f47288i;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            C0842cc c0842cc = eh0.f37245k;
            if (fa4.m11650l(objectVolatile, c0842cc)) {
                while (true) {
                    Unsafe unsafe3 = m7d.f50741a;
                    kh2 kh2Var2 = this;
                    th2 = th;
                    kh2Var = kh2Var2;
                    if (unsafe3.compareAndSwapObject(kh2Var2, f47288i, c0842cc, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(kh2Var, j) != c0842cc) {
                        break;
                    }
                    this = kh2Var;
                    th = th2;
                }
            } else {
                kh2Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = m7d.f50741a;
                    if (unsafe.compareAndSwapObject(kh2Var, f47288i, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(kh2Var, j) == objectVolatile);
            }
            this = kh2Var;
            th = th2;
        }
    }

    /* JADX INFO: renamed from: p */
    public final Throwable m15240p(sm0 sm0Var) {
        Unsafe unsafe;
        kh2 kh2Var;
        sm0 sm0Var2;
        while (true) {
            f47287h.getClass();
            Unsafe unsafe2 = m7d.f50741a;
            long j = f47288i;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            C0842cc c0842cc = eh0.f37245k;
            if (objectVolatile != c0842cc) {
                kh2 kh2Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    C3386nv.m17632s(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = m7d.f50741a;
                    if (unsafe.compareAndSwapObject(kh2Var2, f47288i, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(kh2Var2, j) == objectVolatile);
                C3386nv.m17626m("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = m7d.f50741a;
                kh2Var = this;
                sm0Var2 = sm0Var;
                if (unsafe3.compareAndSwapObject(kh2Var, f47288i, c0842cc, sm0Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(kh2Var, j) != c0842cc) {
                    break;
                }
                this = kh2Var;
                sm0Var = sm0Var2;
            }
            this = kh2Var;
            sm0Var = sm0Var2;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thM15355a = Result.m15355a(obj);
        Object dc1Var = thM15355a == null ? obj : new dc1(thM15355a, false);
        ContinuationImpl continuationImpl = this.f47290e;
        kn1 context = continuationImpl.getContext();
        nn1 nn1Var = this.f47289d;
        if (eh0.m11118O(nn1Var, context)) {
            this.f47291f = dc1Var;
            this.f49653c = 0;
            eh0.m11117N(nn1Var, continuationImpl.getContext(), this);
            return;
        }
        yt2 yt2VarM20221a = qz9.m20221a();
        if (yt2VarM20221a.f70439c >= 4294967296L) {
            this.f47291f = dc1Var;
            this.f49653c = 0;
            yt2VarM20221a.m25312h0(this);
            return;
        }
        yt2VarM20221a.m25313i0(true);
        try {
            kn1 context2 = continuationImpl.getContext();
            Object objM20372O = r46.m20372O(context2, this.f47292g);
            try {
                continuationImpl.resumeWith(obj);
                r46.m20367J(context2, objM20372O);
                while (yt2VarM20221a.m25314k0()) {
                }
            } catch (Throwable th) {
                r46.m20367J(context2, objM20372O);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m16220g(th2);
            } finally {
                yt2VarM20221a.m25311g0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f47289d + ", " + d32.m10044i0(this.f47290e) + ']';
    }
}
