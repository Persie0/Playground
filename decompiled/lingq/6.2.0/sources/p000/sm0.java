package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.C3213d;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class sm0 extends lh2 implements qm0, vn1, z1b {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f61010f = AtomicIntegerFieldUpdater.newUpdater(sm0.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61011g = AtomicReferenceFieldUpdater.newUpdater(sm0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61012h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ long f61013i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ long f61014j;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d */
    public final Continuation f61015d;

    /* JADX INFO: renamed from: e */
    public final kn1 f61016e;

    static {
        Unsafe unsafe = m7d.f50741a;
        f61014j = unsafe.objectFieldOffset(sm0.class.getDeclaredField("_state$volatile"));
        f61012h = AtomicReferenceFieldUpdater.newUpdater(sm0.class, Object.class, "_parentHandle$volatile");
        f61013i = unsafe.objectFieldOffset(sm0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public sm0(int i, Continuation continuation) {
        super(i);
        this.f61015d = continuation;
        this.f61016e = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C3136j6.f45104a;
    }

    /* JADX INFO: renamed from: A */
    public static void m21453A(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: renamed from: G */
    public static Object m21454G(dm6 dm6Var, Object obj, int i, aj3 aj3Var) {
        if (obj instanceof dc1) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (aj3Var != null || (dm6Var instanceof nm0)) {
            return new bc1(obj, dm6Var instanceof nm0 ? (nm0) dm6Var : null, aj3Var, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: B */
    public String mo17946B() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: C */
    public final void m21455C() {
        Throwable thM15240p;
        Continuation continuation = this.f61015d;
        kh2 kh2Var = continuation instanceof kh2 ? (kh2) continuation : null;
        if (kh2Var == null || (thM15240p = kh2Var.m15240p(this)) == null) {
            return;
        }
        m21463n();
        mo10141l(thM15240p);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m21456D() {
        f61011g.getClass();
        Unsafe unsafe = m7d.f50741a;
        long j = f61014j;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof bc1) && ((bc1) objectVolatile).f8311d != null) {
            m21463n();
            return false;
        }
        f61010f.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, C3136j6.f45104a);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final void m21457E(Object obj, int i, aj3 aj3Var) throws DispatchException {
        sm0 sm0Var;
        while (true) {
            f61011g.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f61014j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof dm6)) {
                sm0 sm0Var2 = this;
                if (objectVolatile instanceof vm0) {
                    vm0 vm0Var = (vm0) objectVolatile;
                    if (vm0.f65578c.compareAndSet(vm0Var, 0, 1)) {
                        if (aj3Var != null) {
                            sm0Var2.m21461k(aj3Var, vm0Var.f35375a, obj);
                            return;
                        }
                        return;
                    }
                }
                C3386nv.m17632s(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objM21454G = m21454G((dm6) objectVolatile, obj, i, aj3Var);
            while (true) {
                Unsafe unsafe2 = m7d.f50741a;
                sm0Var = this;
                if (unsafe2.compareAndSwapObject(sm0Var, f61014j, objectVolatile, objM21454G)) {
                    if (!sm0Var.m21473z()) {
                        sm0Var.m21463n();
                    }
                    sm0Var.m21464o(i);
                    return;
                } else if (unsafe2.getObjectVolatile(sm0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = sm0Var;
                }
            }
            this = sm0Var;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m21458F(nn1 nn1Var) {
        Continuation continuation = this.f61015d;
        kh2 kh2Var = continuation instanceof kh2 ? (kh2) continuation : null;
        m21457E(xfa.f68157a, (kh2Var != null ? kh2Var.f47289d : null) == nn1Var ? 4 : this.f49653c, null);
    }

    /* JADX INFO: renamed from: H */
    public final C0842cc m21459H(Object obj, aj3 aj3Var) {
        sm0 sm0Var;
        C0842cc c0842cc = fa4.f38706a;
        while (true) {
            f61011g.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f61014j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof dm6)) {
                return null;
            }
            Object objM21454G = m21454G((dm6) objectVolatile, obj, this.f49653c, aj3Var);
            while (true) {
                Unsafe unsafe2 = m7d.f50741a;
                sm0Var = this;
                if (unsafe2.compareAndSwapObject(sm0Var, f61014j, objectVolatile, objM21454G)) {
                    if (!sm0Var.m21473z()) {
                        sm0Var.m21463n();
                    }
                    return c0842cc;
                }
                if (unsafe2.getObjectVolatile(sm0Var, j) != objectVolatile) {
                    break;
                }
                this = sm0Var;
            }
            this = sm0Var;
        }
    }

    @Override // p000.z1b
    /* JADX INFO: renamed from: a */
    public final void mo10138a(au8 au8Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f61010f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                C3386nv.m17633t("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m21471x(au8Var);
    }

    @Override // p000.lh2
    /* JADX INFO: renamed from: b */
    public final void mo16217b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        sm0 sm0Var;
        while (true) {
            f61011g.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f61014j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof dm6) {
                C3386nv.m17633t("Not completed");
                return;
            }
            if (objectVolatile instanceof dc1) {
                return;
            }
            if (objectVolatile instanceof bc1) {
                bc1 bc1Var = (bc1) objectVolatile;
                if (bc1Var.f8312e != null) {
                    C3386nv.m17633t("Must be called at most once");
                    return;
                }
                bc1 bc1VarM3606a = bc1.m3606a(bc1Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = m7d.f50741a;
                    sm0 sm0Var2 = this;
                    if (unsafe2.compareAndSwapObject(sm0Var2, f61014j, objectVolatile, bc1VarM3606a)) {
                        nm0 nm0Var = bc1Var.f8309b;
                        if (nm0Var != null) {
                            sm0Var2.m21460i(nm0Var, cancellationException);
                        }
                        aj3 aj3Var = bc1Var.f8310c;
                        if (aj3Var != null) {
                            sm0Var2.m21461k(aj3Var, cancellationException, bc1Var.f8308a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(sm0Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        sm0Var = sm0Var2;
                        break;
                    }
                    this = sm0Var2;
                }
            } else {
                sm0 sm0Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                bc1 bc1Var2 = new bc1(objectVolatile, (nm0) null, (aj3) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    bc1 bc1Var3 = bc1Var2;
                    Unsafe unsafe3 = m7d.f50741a;
                    sm0Var = sm0Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(sm0Var, f61014j, objectVolatile, bc1Var3);
                    bc1Var2 = bc1Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(sm0Var, j) != objectVolatile) {
                        break;
                    } else {
                        sm0Var3 = sm0Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = sm0Var;
        }
    }

    @Override // p000.lh2
    /* JADX INFO: renamed from: c */
    public final Continuation mo15233c() {
        return this.f61015d;
    }

    @Override // p000.qm0
    /* JADX INFO: renamed from: d */
    public final C0842cc mo10139d(Object obj, aj3 aj3Var) {
        return m21459H(obj, aj3Var);
    }

    @Override // p000.lh2
    /* JADX INFO: renamed from: e */
    public final Throwable mo16218e(Object obj) {
        Throwable thMo16218e = super.mo16218e(obj);
        if (thMo16218e != null) {
            return thMo16218e;
        }
        return null;
    }

    @Override // p000.lh2
    /* JADX INFO: renamed from: f */
    public final Object mo16219f(Object obj) {
        return obj instanceof bc1 ? ((bc1) obj).f8308a : obj;
    }

    @Override // p000.vn1
    public final vn1 getCallerFrame() {
        Continuation continuation = this.f61015d;
        if (continuation instanceof vn1) {
            return (vn1) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        return this.f61016e;
    }

    @Override // p000.lh2
    /* JADX INFO: renamed from: h */
    public final Object mo15234h() {
        return m21467t();
    }

    /* JADX INFO: renamed from: i */
    public final void m21460i(nm0 nm0Var, Throwable th) {
        try {
            nm0Var.mo15586b(th);
        } catch (Throwable th2) {
            bq1.m4056g0(this.f61016e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p000.qm0
    /* JADX INFO: renamed from: j */
    public final void mo10140j(Object obj, aj3 aj3Var) throws DispatchException {
        m21457E(obj, this.f49653c, aj3Var);
    }

    /* JADX INFO: renamed from: k */
    public final void m21461k(aj3 aj3Var, Throwable th, Object obj) {
        kn1 kn1Var = this.f61016e;
        try {
            aj3Var.invoke(th, obj, kn1Var);
        } catch (Throwable th2) {
            bq1.m4056g0(kn1Var, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // p000.qm0
    /* JADX INFO: renamed from: l */
    public final boolean mo10141l(Throwable th) {
        Throwable cancellationException;
        sm0 sm0Var;
        while (true) {
            f61011g.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f61014j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof dm6)) {
                return false;
            }
            boolean z = (objectVolatile instanceof nm0) || (objectVolatile instanceof au8);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            vm0 vm0Var = new vm0(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = m7d.f50741a;
                sm0Var = this;
                if (unsafe2.compareAndSwapObject(sm0Var, f61014j, objectVolatile, vm0Var)) {
                    dm6 dm6Var = (dm6) objectVolatile;
                    if (dm6Var instanceof nm0) {
                        sm0Var.m21460i((nm0) objectVolatile, th);
                    } else if (dm6Var instanceof au8) {
                        sm0Var.m21462m((au8) objectVolatile, th);
                    }
                    if (!sm0Var.m21473z()) {
                        sm0Var.m21463n();
                    }
                    sm0Var.m21464o(sm0Var.f49653c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(sm0Var, j) != objectVolatile) {
                    break;
                }
                this = sm0Var;
            }
            this = sm0Var;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m21462m(au8 au8Var, Throwable th) {
        kn1 kn1Var = this.f61016e;
        int i = f61010f.get(this) & 536870911;
        if (i == 536870911) {
            C3386nv.m17633t("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            au8Var.mo3063m(i, kn1Var);
        } catch (Throwable th2) {
            bq1.m4056g0(kn1Var, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m21463n() {
        ci2 ci2VarM21465q = m21465q();
        if (ci2VarM21465q == null) {
            return;
        }
        ci2VarM21465q.mo125a();
        f61012h.getClass();
        m7d.f50741a.putObjectVolatile(this, f61013i, yl6.f70031a);
    }

    /* JADX INFO: renamed from: o */
    public final void m21464o(int i) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f61010f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    C3386nv.m17633t("Already resumed");
                    return;
                }
                boolean z = i == 4;
                Continuation continuation = this.f61015d;
                if (!z && (continuation instanceof kh2)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f49653c;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        kh2 kh2Var = (kh2) continuation;
                        nn1 nn1Var = kh2Var.f47289d;
                        kn1 context = kh2Var.f47290e.getContext();
                        if (eh0.m11118O(nn1Var, context)) {
                            eh0.m11117N(nn1Var, context, this);
                            return;
                        }
                        yt2 yt2VarM20221a = qz9.m20221a();
                        if (yt2VarM20221a.f70439c >= 4294967296L) {
                            yt2VarM20221a.m25312h0(this);
                            return;
                        }
                        yt2VarM20221a.m25313i0(true);
                        try {
                            xwc.m24753Z(this, continuation, true);
                            do {
                            } while (yt2VarM20221a.m25314k0());
                        } catch (Throwable th) {
                            try {
                                m16220g(th);
                            } finally {
                                yt2VarM20221a.m25311g0(true);
                            }
                        }
                        return;
                    }
                }
                xwc.m24753Z(this, continuation, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: p */
    public Throwable mo17947p(C3213d c3213d) {
        return c3213d.mo4541u();
    }

    /* JADX INFO: renamed from: q */
    public final ci2 m21465q() {
        f61012h.getClass();
        return (ci2) m7d.f50741a.getObjectVolatile(this, f61013i);
    }

    /* JADX INFO: renamed from: r */
    public final Object m21466r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        cd4 cd4Var;
        boolean zM21473z = m21473z();
        do {
            atomicIntegerFieldUpdater = f61010f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    C3386nv.m17633t("Already suspended");
                    return null;
                }
                if (zM21473z) {
                    m21455C();
                }
                Object objM21467t = m21467t();
                if (objM21467t instanceof dc1) {
                    throw ((dc1) objM21467t).f35375a;
                }
                int i3 = this.f49653c;
                if ((i3 != 1 && i3 != 2) || (cd4Var = (cd4) this.f61016e.get(nj0.f52795N)) == null || cd4Var.mo4538b()) {
                    return mo16219f(objM21467t);
                }
                CancellationException cancellationExceptionMo4541u = cd4Var.mo4541u();
                mo16217b(cancellationExceptionMo4541u);
                throw cancellationExceptionMo4541u;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (m21465q() == null) {
            m21469v();
        }
        if (zM21473z) {
            m21455C();
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thM15355a = Result.m15355a(obj);
        if (thM15355a != null) {
            obj = new dc1(thM15355a, false);
        }
        m21457E(obj, this.f49653c, null);
    }

    @Override // p000.qm0
    /* JADX INFO: renamed from: s */
    public final void mo10142s(Object obj) throws DispatchException {
        m21464o(this.f49653c);
    }

    /* JADX INFO: renamed from: t */
    public final Object m21467t() {
        f61011g.getClass();
        return m7d.f50741a.getObjectVolatile(this, f61014j);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo17946B());
        sb.append('(');
        sb.append(d32.m10044i0(this.f61015d));
        sb.append("){");
        Object objM21467t = m21467t();
        if (objM21467t instanceof dm6) {
            str = "Active";
        } else {
            str = objM21467t instanceof vm0 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(d32.m10016N(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m21468u() {
        ci2 ci2VarM21469v = m21469v();
        if (ci2VarM21469v != null && m21472y()) {
            ci2VarM21469v.mo125a();
            f61012h.getClass();
            m7d.f50741a.putObjectVolatile(this, f61013i, yl6.f70031a);
        }
    }

    /* JADX INFO: renamed from: v */
    public final ci2 m21469v() {
        cd4 cd4Var = (cd4) this.f61016e.get(nj0.f52795N);
        if (cd4Var == null) {
            return null;
        }
        ci2 ci2VarM15442i = AbstractC3208a.m15442i(cd4Var, new p01(this));
        while (true) {
            f61012h.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f61013i;
            sm0 sm0Var = this;
            if (unsafe.compareAndSwapObject(sm0Var, j, (Object) null, ci2VarM15442i) || unsafe.getObjectVolatile(sm0Var, j) != null) {
                break;
            }
            this = sm0Var;
        }
        return ci2VarM15442i;
    }

    /* JADX INFO: renamed from: w */
    public final void m21470w(vi3 vi3Var) {
        m21471x(new mm0(vi3Var, 0));
    }

    /* JADX INFO: renamed from: x */
    public final void m21471x(dm6 dm6Var) {
        sm0 sm0Var;
        Unsafe unsafe;
        sm0 sm0Var2;
        while (true) {
            f61011g.getClass();
            Unsafe unsafe2 = m7d.f50741a;
            long j = f61014j;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof C3136j6) {
                while (true) {
                    Unsafe unsafe3 = m7d.f50741a;
                    sm0Var = this;
                    if (unsafe3.compareAndSwapObject(sm0Var, f61014j, objectVolatile, dm6Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(sm0Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = sm0Var;
                    }
                }
            } else {
                sm0Var = this;
                if ((objectVolatile instanceof nm0) || (objectVolatile instanceof au8)) {
                    m21453A(dm6Var, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof dc1) {
                    dc1 dc1Var = (dc1) objectVolatile;
                    if (!dc1.f35374b.compareAndSet(dc1Var, 0, 1)) {
                        m21453A(dm6Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof vm0) {
                        Throwable th = dc1Var.f35375a;
                        if (dm6Var instanceof nm0) {
                            sm0Var.m21460i((nm0) dm6Var, th);
                            return;
                        } else {
                            dm6Var.getClass();
                            sm0Var.m21462m((au8) dm6Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof bc1) {
                    bc1 bc1Var = (bc1) objectVolatile;
                    if (bc1Var.f8309b != null) {
                        m21453A(dm6Var, objectVolatile);
                        throw null;
                    }
                    if (dm6Var instanceof au8) {
                        return;
                    }
                    dm6Var.getClass();
                    nm0 nm0Var = (nm0) dm6Var;
                    Throwable th2 = bc1Var.f8312e;
                    if (th2 != null) {
                        sm0Var.m21460i(nm0Var, th2);
                        return;
                    }
                    bc1 bc1VarM3606a = bc1.m3606a(bc1Var, nm0Var, null, 29);
                    do {
                        unsafe = m7d.f50741a;
                        sm0Var2 = sm0Var;
                        if (unsafe.compareAndSwapObject(sm0Var, f61014j, objectVolatile, bc1VarM3606a)) {
                            return;
                        } else {
                            sm0Var = sm0Var2;
                        }
                    } while (unsafe.getObjectVolatile(sm0Var2, j) == objectVolatile);
                } else {
                    sm0 sm0Var3 = sm0Var;
                    if (dm6Var instanceof au8) {
                        return;
                    }
                    dm6Var.getClass();
                    bc1 bc1Var2 = new bc1(objectVolatile, (nm0) dm6Var, (aj3) null, (Throwable) null, 28);
                    while (true) {
                        bc1 bc1Var3 = bc1Var2;
                        Unsafe unsafe4 = m7d.f50741a;
                        sm0Var = sm0Var3;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(sm0Var, f61014j, objectVolatile, bc1Var3);
                        bc1Var2 = bc1Var3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(sm0Var, j) != objectVolatile) {
                            break;
                        } else {
                            sm0Var3 = sm0Var;
                        }
                    }
                }
            }
            this = sm0Var;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m21472y() {
        return !(m21467t() instanceof dm6);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m21473z() {
        return this.f49653c == 2 && ((kh2) this.f61015d).m15238n();
    }
}
