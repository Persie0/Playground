package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.C3245a;
import p000.AbstractC3584sr;
import p000.C0842cc;
import p000.C3386nv;
import p000.be4;
import p000.c34;
import p000.cd4;
import p000.ci2;
import p000.d32;
import p000.dc1;
import p000.e34;
import p000.eh0;
import p000.f47;
import p000.hn1;
import p000.i34;
import p000.in1;
import p000.j98;
import p000.jn1;
import p000.jr2;
import p000.k98;
import p000.kn1;
import p000.lda;
import p000.m7d;
import p000.mm0;
import p000.nj0;
import p000.oe4;
import p000.pe4;
import p000.q01;
import p000.qe4;
import p000.r01;
import p000.sm0;
import p000.ta4;
import p000.ud0;
import p000.ue5;
import p000.ul6;
import p000.vi3;
import p000.xb1;
import p000.xfa;
import p000.yl6;
import p000.z91;
import p000.zi3;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.d */
/* JADX INFO: loaded from: classes.dex */
public class C3213d implements cd4, f47 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f47796a = AtomicReferenceFieldUpdater.newUpdater(C3213d.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f47797b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ long f47798c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ long f47799d;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = m7d.f50741a;
        f47799d = unsafe.objectFieldOffset(C3213d.class.getDeclaredField("_state$volatile"));
        f47797b = AtomicReferenceFieldUpdater.newUpdater(C3213d.class, Object.class, "_parentHandle$volatile");
        f47798c = unsafe.objectFieldOffset(C3213d.class.getDeclaredField("_parentHandle$volatile"));
    }

    public C3213d(boolean z) {
        this._state$volatile = z ? AbstractC3584sr.f61284k : AbstractC3584sr.f61283j;
    }

    /* JADX INFO: renamed from: b0 */
    public static r01 m15487b0(C3245a c3245a) {
        while (c3245a.mo15582n()) {
            c3245a = c3245a.m15581m();
        }
        while (true) {
            c3245a = c3245a.m15580l();
            if (!c3245a.mo15582n()) {
                if (c3245a instanceof r01) {
                    return (r01) c3245a;
                }
                if (c3245a instanceof ul6) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static String m15488j0(Object obj) {
        if (!(obj instanceof qe4)) {
            if (obj instanceof e34) {
                return ((e34) obj).mo3666b() ? "Active" : "New";
            }
            return obj instanceof dc1 ? "Cancelled" : "Completed";
        }
        qe4 qe4Var = (qe4) obj;
        if (qe4Var.m19898f()) {
            return "Cancelling";
        }
        return qe4.f57643b.get(qe4Var) == 1 ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: B */
    public void mo15330B(CancellationException cancellationException) {
        m15518y(cancellationException);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m15489C(Throwable th) {
        if (mo4898X()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        q01 q01VarM15499P = m15499P();
        if (q01VarM15499P == null || q01VarM15499P == yl6.f70031a) {
            return z;
        }
        return q01VarM15499P.mo19584c(th) || z;
    }

    /* JADX INFO: renamed from: D */
    public String mo3133D() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: E */
    public boolean mo12414E(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m15518y(th) && mo15496M();
    }

    /* JADX INFO: renamed from: F */
    public final void m15490F(e34 e34Var, Object obj) {
        q01 q01VarM15499P = m15499P();
        if (q01VarM15499P != null) {
            q01VarM15499P.mo125a();
            m15511h0(yl6.f70031a);
        }
        CompletionHandlerException completionHandlerException = null;
        dc1 dc1Var = obj instanceof dc1 ? (dc1) obj : null;
        Throwable th = dc1Var != null ? dc1Var.f35375a : null;
        if (e34Var instanceof be4) {
            try {
                ((be4) e34Var).mo3670s(th);
                return;
            } catch (Throwable th2) {
                mo3134T(new CompletionHandlerException("Exception in completion handler " + e34Var + " for " + this, th2));
                return;
            }
        }
        ul6 ul6VarMo3667d = e34Var.mo3667d();
        if (ul6VarMo3667d != null) {
            ul6VarMo3667d.m15574e(new ue5(1), 1);
            Object objM15579k = ul6VarMo3667d.m15579k();
            objM15579k.getClass();
            for (C3245a c3245aM15580l = (C3245a) objM15579k; !c3245aM15580l.equals(ul6VarMo3667d); c3245aM15580l = c3245aM15580l.m15580l()) {
                if (c3245aM15580l instanceof be4) {
                    try {
                        ((be4) c3245aM15580l).mo3670s(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            lda.m16117c(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c3245aM15580l + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo3134T(completionHandlerException);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final Throwable m15491G(Object obj) {
        Throwable thM19897e;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C3213d c3213d = (C3213d) ((f47) obj);
        Object objM15500Q = c3213d.m15500Q();
        if (objM15500Q instanceof qe4) {
            thM19897e = ((qe4) objM15500Q).m19897e();
        } else if (objM15500Q instanceof dc1) {
            thM19897e = ((dc1) objM15500Q).f35375a;
        } else {
            if (objM15500Q instanceof e34) {
                C3386nv.m17632s(objM15500Q, "Cannot be cancelling child in this state: ");
                return null;
            }
            thM19897e = null;
        }
        CancellationException cancellationException = thM19897e instanceof CancellationException ? (CancellationException) thM19897e : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(m15488j0(objM15500Q)), thM19897e, c3213d) : cancellationException;
    }

    /* JADX INFO: renamed from: H */
    public final Object m15492H(qe4 qe4Var, Object obj) throws Throwable {
        Throwable th;
        C3213d c3213d;
        qe4 qe4Var2;
        dc1 dc1Var = obj instanceof dc1 ? (dc1) obj : null;
        Throwable th2 = dc1Var != null ? dc1Var.f35375a : null;
        synchronized (qe4Var) {
            try {
                qe4Var.m19898f();
                ArrayList<Throwable> arrayListM19899g = qe4Var.m19899g(th2);
                Throwable thM15495L = m15495L(qe4Var, arrayListM19899g);
                if (thM15495L != null) {
                    try {
                        if (arrayListM19899g.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM19899g.size()));
                            for (Throwable th3 : arrayListM19899g) {
                                if (th3 != thM15495L && th3 != thM15495L && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    lda.m16117c(thM15495L, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thM15495L != null && thM15495L != th2) {
                    obj = new dc1(thM15495L, false);
                }
                if (thM15495L != null && (m15489C(thM15495L) || mo15501S(thM15495L))) {
                    obj.getClass();
                    dc1.f35374b.compareAndSet((dc1) obj, 0, 1);
                }
                mo3135d0(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47796a;
                Object i34Var = obj instanceof e34 ? new i34((e34) obj) : obj;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = m7d.f50741a;
                    long j = f47799d;
                    c3213d = this;
                    qe4Var2 = qe4Var;
                    if (unsafe.compareAndSwapObject(c3213d, j, qe4Var2, i34Var) || unsafe.getObjectVolatile(c3213d, j) != qe4Var2) {
                        break;
                    }
                    this = c3213d;
                    qe4Var = qe4Var2;
                }
                c3213d.m15490F(qe4Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final z91 m15493I() {
        return new z91(new JobSupport$children$1(null, this), 1);
    }

    /* JADX INFO: renamed from: K */
    public final Object m15494K() throws Throwable {
        Object objM15500Q = m15500Q();
        if (objM15500Q instanceof e34) {
            C3386nv.m17633t("This job has not completed yet");
            return null;
        }
        if (objM15500Q instanceof dc1) {
            throw ((dc1) objM15500Q).f35375a;
        }
        return AbstractC3584sr.m21629h0(objM15500Q);
    }

    /* JADX INFO: renamed from: L */
    public final Throwable m15495L(qe4 qe4Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (qe4Var.m19898f()) {
                return new JobCancellationException(mo3133D(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: M */
    public boolean mo15496M() {
        return true;
    }

    /* JADX INFO: renamed from: N */
    public boolean mo15497N() {
        return this instanceof xb1;
    }

    /* JADX INFO: renamed from: O */
    public final ul6 m15498O(e34 e34Var) {
        ul6 ul6VarMo3667d = e34Var.mo3667d();
        if (ul6VarMo3667d != null) {
            return ul6VarMo3667d;
        }
        if (e34Var instanceof jr2) {
            return new ul6();
        }
        if (e34Var instanceof be4) {
            m15509f0((be4) e34Var);
            return null;
        }
        C3386nv.m17632s(e34Var, "State should have list: ");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final q01 m15499P() {
        f47797b.getClass();
        return (q01) m7d.f50741a.getObjectVolatile(this, f47798c);
    }

    /* JADX INFO: renamed from: Q */
    public final Object m15500Q() {
        f47796a.getClass();
        return m7d.f50741a.getObjectVolatile(this, f47799d);
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: R */
    public final ci2 mo4536R(boolean z, boolean z2, vi3 vi3Var) {
        return m15503V(z2, z ? new C3210c(vi3Var) : new ta4(vi3Var));
    }

    /* JADX INFO: renamed from: S */
    public boolean mo15501S(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: T */
    public void mo3134T(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* JADX INFO: renamed from: U */
    public final void m15502U(cd4 cd4Var) {
        yl6 yl6Var = yl6.f70031a;
        if (cd4Var == null) {
            m15511h0(yl6Var);
            return;
        }
        cd4Var.start();
        q01 q01VarMo4542z = cd4Var.mo4542z(this);
        m15511h0(q01VarMo4542z);
        if (m15504W()) {
            q01VarMo4542z.mo125a();
            m15511h0(yl6Var);
        }
    }

    /* JADX INFO: renamed from: V */
    public final ci2 m15503V(boolean z, be4 be4Var) {
        boolean zM15574e;
        be4Var.f8428g = this;
        while (true) {
            Object objM15500Q = m15500Q();
            if (!(objM15500Q instanceof jr2)) {
                boolean z2 = objM15500Q instanceof e34;
                yl6 yl6Var = yl6.f70031a;
                if (z2) {
                    e34 e34Var = (e34) objM15500Q;
                    ul6 ul6VarMo3667d = e34Var.mo3667d();
                    if (ul6VarMo3667d == null) {
                        m15509f0((be4) objM15500Q);
                    } else {
                        if (be4Var.mo3669r()) {
                            qe4 qe4Var = e34Var instanceof qe4 ? (qe4) e34Var : null;
                            Throwable thM19897e = qe4Var != null ? qe4Var.m19897e() : null;
                            if (thM19897e == null) {
                                zM15574e = ul6VarMo3667d.m15574e(be4Var, 5);
                            } else if (z) {
                                be4Var.mo3670s(thM19897e);
                                return yl6Var;
                            }
                        } else {
                            zM15574e = ul6VarMo3667d.m15574e(be4Var, 1);
                        }
                        if (zM15574e) {
                            break;
                        }
                    }
                } else if (z) {
                    Object objM15500Q2 = m15500Q();
                    dc1 dc1Var = objM15500Q2 instanceof dc1 ? (dc1) objM15500Q2 : null;
                    be4Var.mo3670s(dc1Var != null ? dc1Var.f35375a : null);
                }
                return yl6Var;
            }
            jr2 jr2Var = (jr2) objM15500Q;
            boolean z3 = jr2Var.f46030a;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47796a;
            if (!z3) {
                ul6 ul6Var = new ul6();
                e34 c34Var = ul6Var;
                if (!z3) {
                    c34Var = new c34(ul6Var);
                }
                hn1.m13374x(atomicReferenceFieldUpdater, this, jr2Var, c34Var);
            } else if (hn1.m13349B(atomicReferenceFieldUpdater, this, jr2Var, be4Var)) {
                break;
            }
        }
        return be4Var;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m15504W() {
        return !(m15500Q() instanceof e34);
    }

    /* JADX INFO: renamed from: X */
    public boolean mo4898X() {
        return this instanceof ud0;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m15505Y(Object obj) {
        Object objM15515m0;
        do {
            objM15515m0 = m15515m0(m15500Q(), obj);
            if (objM15515m0 == AbstractC3584sr.f61278e) {
                return false;
            }
            if (objM15515m0 == AbstractC3584sr.f61279f) {
                return true;
            }
        } while (objM15515m0 == AbstractC3584sr.f61280g);
        mo4900t(objM15515m0);
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public final Object m15506Z(Object obj) {
        Object objM15515m0;
        do {
            objM15515m0 = m15515m0(m15500Q(), obj);
            if (objM15515m0 == AbstractC3584sr.f61278e) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                dc1 dc1Var = obj instanceof dc1 ? (dc1) obj : null;
                throw new IllegalStateException(str, dc1Var != null ? dc1Var.f35375a : null);
            }
        } while (objM15515m0 == AbstractC3584sr.f61280g);
        return objM15515m0;
    }

    @Override // p000.cd4, p000.cu0
    /* JADX INFO: renamed from: a */
    public void mo4537a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo3133D(), null, this);
        }
        mo15330B(cancellationException);
    }

    /* JADX INFO: renamed from: a0 */
    public String mo9992a0() {
        return getClass().getSimpleName();
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: b */
    public boolean mo4538b() {
        Object objM15500Q = m15500Q();
        return (objM15500Q instanceof e34) && ((e34) objM15500Q).mo3666b();
    }

    /* JADX INFO: renamed from: c */
    public Object m15507c() {
        return m15494K();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m15508c0(ul6 ul6Var, Throwable th) {
        ul6Var.m15574e(new ue5(4), 4);
        Object objM15579k = ul6Var.m15579k();
        objM15579k.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (C3245a c3245aM15580l = (C3245a) objM15579k; !c3245aM15580l.equals(ul6Var); c3245aM15580l = c3245aM15580l.m15580l()) {
            if ((c3245aM15580l instanceof be4) && ((be4) c3245aM15580l).mo3669r()) {
                try {
                    ((be4) c3245aM15580l).mo3670s(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        lda.m16117c(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c3245aM15580l + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo3134T(completionHandlerException);
        }
        m15489C(th);
    }

    /* JADX INFO: renamed from: d0 */
    public void mo3135d0(Object obj) {
    }

    /* JADX INFO: renamed from: e0 */
    public void mo12052e0() {
    }

    /* JADX INFO: renamed from: f0 */
    public final void m15509f0(be4 be4Var) {
        be4Var.m15576g(new ul6());
        C3245a c3245aM15580l = be4Var.m15580l();
        while (true) {
            f47796a.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f47799d;
            C3213d c3213d = this;
            be4 be4Var2 = be4Var;
            if (unsafe.compareAndSwapObject(c3213d, j, be4Var2, c3245aM15580l) || unsafe.getObjectVolatile(c3213d, j) != be4Var2) {
                return;
            }
            this = c3213d;
            be4Var = be4Var2;
        }
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m15510g0(be4 be4Var) {
        C3213d c3213d;
        while (true) {
            Object objM15500Q = this.m15500Q();
            if (!(objM15500Q instanceof be4)) {
                if (!(objM15500Q instanceof e34) || ((e34) objM15500Q).mo3667d() == null) {
                    return;
                }
                be4Var.m15583o();
                return;
            }
            if (objM15500Q != be4Var) {
                return;
            }
            jr2 jr2Var = AbstractC3584sr.f61284k;
            while (true) {
                f47796a.getClass();
                Unsafe unsafe = m7d.f50741a;
                long j = f47799d;
                c3213d = this;
                if (unsafe.compareAndSwapObject(c3213d, j, objM15500Q, jr2Var)) {
                    return;
                }
                if (unsafe.getObjectVolatile(c3213d, j) != objM15500Q) {
                    break;
                } else {
                    this = c3213d;
                }
            }
            this = c3213d;
        }
    }

    @Override // p000.kn1
    public final in1 get(jn1 jn1Var) {
        return eh0.m11141v(this, jn1Var);
    }

    @Override // p000.in1
    public final jn1 getKey() {
        return nj0.f52795N;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m15511h0(q01 q01Var) {
        f47797b.getClass();
        m7d.f50741a.putObjectVolatile(this, f47798c, q01Var);
    }

    /* JADX INFO: renamed from: i0 */
    public final int m15512i0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof jr2;
        long j = f47799d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47796a;
        if (z) {
            if (((jr2) obj).f46030a) {
                return 0;
            }
            jr2 jr2Var = AbstractC3584sr.f61284k;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = m7d.f50741a;
                if (unsafe2.compareAndSwapObject(this, f47799d, obj, jr2Var)) {
                    mo12052e0();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof c34)) {
            return 0;
        }
        ul6 ul6Var = ((c34) obj).f9389a;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = m7d.f50741a;
            if (unsafe.compareAndSwapObject(this, f47799d, obj, ul6Var)) {
                mo12052e0();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    @Override // p000.cd4
    public final boolean isCancelled() {
        Object objM15500Q = m15500Q();
        if (objM15500Q instanceof dc1) {
            return true;
        }
        return (objM15500Q instanceof qe4) && ((qe4) objM15500Q).m19898f();
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m15513k0(e34 e34Var, Object obj) {
        Object i34Var = obj instanceof e34 ? new i34((e34) obj) : obj;
        while (true) {
            f47796a.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f47799d;
            C3213d c3213d = this;
            e34 e34Var2 = e34Var;
            if (unsafe.compareAndSwapObject(c3213d, j, e34Var2, i34Var)) {
                c3213d.mo3135d0(obj);
                c3213d.m15490F(e34Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(c3213d, j) != e34Var2) {
                return false;
            }
            this = c3213d;
            e34Var = e34Var2;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m15514l0(e34 e34Var, Throwable th) {
        ul6 ul6VarM15498O = m15498O(e34Var);
        if (ul6VarM15498O == null) {
            return false;
        }
        qe4 qe4Var = new qe4(ul6VarM15498O, th);
        while (true) {
            f47796a.getClass();
            Unsafe unsafe = m7d.f50741a;
            long j = f47799d;
            C3213d c3213d = this;
            e34 e34Var2 = e34Var;
            if (unsafe.compareAndSwapObject(c3213d, j, e34Var2, qe4Var)) {
                c3213d.m15508c0(ul6VarM15498O, th);
                return true;
            }
            if (unsafe.getObjectVolatile(c3213d, j) != e34Var2) {
                return false;
            }
            this = c3213d;
            e34Var = e34Var2;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final Object m15515m0(Object obj, Object obj2) {
        if (!(obj instanceof e34)) {
            return AbstractC3584sr.f61278e;
        }
        if (((obj instanceof jr2) || (obj instanceof be4)) && !(obj instanceof r01) && !(obj2 instanceof dc1)) {
            return m15513k0((e34) obj, obj2) ? obj2 : AbstractC3584sr.f61280g;
        }
        e34 e34Var = (e34) obj;
        ul6 ul6VarM15498O = m15498O(e34Var);
        if (ul6VarM15498O == null) {
            return AbstractC3584sr.f61280g;
        }
        qe4 qe4Var = e34Var instanceof qe4 ? (qe4) e34Var : null;
        if (qe4Var == null) {
            qe4Var = new qe4(ul6VarM15498O, null);
        }
        synchronized (qe4Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = qe4.f57643b;
            if (atomicIntegerFieldUpdater.get(qe4Var) == 1) {
                return AbstractC3584sr.f61278e;
            }
            atomicIntegerFieldUpdater.set(qe4Var, 1);
            if (qe4Var != e34Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47796a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, e34Var, qe4Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != e34Var) {
                        return AbstractC3584sr.f61280g;
                    }
                }
            }
            boolean zM19898f = qe4Var.m19898f();
            dc1 dc1Var = obj2 instanceof dc1 ? (dc1) obj2 : null;
            if (dc1Var != null) {
                qe4Var.m19895a(dc1Var.f35375a);
            }
            Throwable thM19897e = zM19898f ? null : qe4Var.m19897e();
            if (thM19897e != null) {
                m15508c0(ul6VarM15498O, thM19897e);
            }
            r01 r01VarM15487b0 = m15487b0(ul6VarM15498O);
            if (r01VarM15487b0 != null && m15516n0(qe4Var, r01VarM15487b0, obj2)) {
                return AbstractC3584sr.f61279f;
            }
            ul6VarM15498O.m15574e(new ue5(2), 2);
            r01 r01VarM15487b1 = m15487b0(ul6VarM15498O);
            return (r01VarM15487b1 == null || !m15516n0(qe4Var, r01VarM15487b1, obj2)) ? m15492H(qe4Var, obj2) : AbstractC3584sr.f61279f;
        }
    }

    @Override // p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        return eh0.m11107D(this, jn1Var);
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m15516n0(qe4 qe4Var, r01 r01Var, Object obj) {
        while (r01Var.f58435h.m15503V(false, new pe4(this, qe4Var, r01Var, obj)) == yl6.f70031a) {
            r01Var = m15487b0(r01Var);
            if (r01Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.kn1
    public final kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: q */
    public final Object mo4539q(ContinuationImpl continuationImpl) {
        Object objM15500Q;
        xfa xfaVar;
        do {
            objM15500Q = m15500Q();
            boolean z = objM15500Q instanceof e34;
            xfaVar = xfa.f68157a;
            if (!z) {
                AbstractC3208a.m15439f(continuationImpl.getContext());
                return xfaVar;
            }
        } while (m15512i0(objM15500Q) < 0);
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuationImpl));
        sm0Var.m21468u();
        sm0Var.m21471x(new mm0(AbstractC3208a.m15442i(this, new k98(sm0Var)), 1));
        Object objM21466r = sm0Var.m21466r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM21466r != coroutineSingletons) {
            objM21466r = xfaVar;
        }
        return objM21466r == coroutineSingletons ? objM21466r : xfaVar;
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: r */
    public final ci2 mo4540r(vi3 vi3Var) {
        return m15503V(true, new ta4(vi3Var));
    }

    @Override // p000.cd4
    public final boolean start() {
        int iM15512i0;
        do {
            iM15512i0 = m15512i0(m15500Q());
            if (iM15512i0 == 0) {
                return false;
            }
        } while (iM15512i0 != 1);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void mo4900t(Object obj) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo9992a0() + '{' + m15488j0(m15500Q()) + '}');
        sb.append('@');
        sb.append(d32.m10016N(this));
        return sb.toString();
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: u */
    public final CancellationException mo4541u() {
        CancellationException cancellationException;
        Object objM15500Q = m15500Q();
        if (objM15500Q instanceof qe4) {
            Throwable thM19897e = ((qe4) objM15500Q).m19897e();
            if (thM19897e == null) {
                C3386nv.m17632s(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM19897e instanceof CancellationException ? (CancellationException) thM19897e : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thM19897e, this) : cancellationException;
        }
        if (objM15500Q instanceof e34) {
            C3386nv.m17632s(this, "Job is still new or active: ");
            return null;
        }
        if (!(objM15500Q instanceof dc1)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((dc1) objM15500Q).f35375a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(mo3133D(), th, this) : cancellationException;
    }

    /* JADX INFO: renamed from: v */
    public void mo4901v(Object obj) {
        mo4900t(obj);
    }

    /* JADX INFO: renamed from: w */
    public final Object m15517w(Continuation continuation) throws Throwable {
        Object objM15500Q;
        do {
            objM15500Q = m15500Q();
            if (!(objM15500Q instanceof e34)) {
                if (objM15500Q instanceof dc1) {
                    throw ((dc1) objM15500Q).f35375a;
                }
                return AbstractC3584sr.m21629h0(objM15500Q);
            }
        } while (m15512i0(objM15500Q) < 0);
        oe4 oe4Var = new oe4(AbstractC3584sr.m21600K(continuation), this);
        oe4Var.m21468u();
        oe4Var.m21471x(new mm0(AbstractC3208a.m15442i(this, new j98(oe4Var)), 1));
        Object objM21466r = oe4Var.m21466r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM21466r;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r0
      0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0040, please report this as an issue */
    /* JADX INFO: renamed from: y */
    public final boolean m15518y(Object obj) {
        Throwable thM15491G;
        Object objM15500Q;
        Throwable thM19897e;
        C0842cc c0842cc;
        e34 e34Var;
        Object objM15515m0;
        Object objM15515m1 = AbstractC3584sr.f61278e;
        if (mo15497N()) {
            do {
                Object objM15500Q2 = m15500Q();
                if (objM15500Q2 instanceof e34) {
                    if (objM15500Q2 instanceof qe4) {
                        if (qe4.f57643b.get((qe4) objM15500Q2) == 1) {
                        }
                    }
                    objM15515m1 = m15515m0(objM15500Q2, new dc1(m15491G(obj), false));
                }
                objM15515m1 = AbstractC3584sr.f61278e;
                break;
            } while (objM15515m1 == AbstractC3584sr.f61280g);
            if (objM15515m1 != AbstractC3584sr.f61279f) {
                if (objM15515m1 == AbstractC3584sr.f61278e) {
                    thM15491G = null;
                    while (true) {
                        objM15500Q = m15500Q();
                        if (objM15500Q instanceof qe4) {
                            synchronized (objM15500Q) {
                                if (((qe4) objM15500Q).m19896c() == AbstractC3584sr.f61282i) {
                                    c0842cc = AbstractC3584sr.f61281h;
                                } else {
                                    boolean zM19898f = ((qe4) objM15500Q).m19898f();
                                    if (thM15491G == null) {
                                        thM15491G = m15491G(obj);
                                    }
                                    ((qe4) objM15500Q).m19895a(thM15491G);
                                    thM19897e = zM19898f ? null : ((qe4) objM15500Q).m19897e();
                                    if (thM19897e != null) {
                                        m15508c0(((qe4) objM15500Q).f57648a, thM19897e);
                                    }
                                    c0842cc = AbstractC3584sr.f61278e;
                                }
                            }
                        } else if (objM15500Q instanceof e34) {
                            if (thM15491G == null) {
                                thM15491G = m15491G(obj);
                            }
                            e34Var = (e34) objM15500Q;
                            if (e34Var.mo3666b()) {
                                objM15515m0 = m15515m0(objM15500Q, new dc1(thM15491G, false));
                                if (objM15515m0 != AbstractC3584sr.f61278e) {
                                    C3386nv.m17632s(objM15500Q, "Cannot happen in ");
                                    return false;
                                }
                                if (objM15515m0 != AbstractC3584sr.f61280g) {
                                    objM15515m1 = objM15515m0;
                                    break;
                                }
                            } else if (m15514l0(e34Var, thM15491G)) {
                                c0842cc = AbstractC3584sr.f61278e;
                            }
                        } else {
                            c0842cc = AbstractC3584sr.f61281h;
                        }
                        objM15515m1 = c0842cc;
                        break;
                    }
                }
                if (objM15515m1 != AbstractC3584sr.f61278e && objM15515m1 != AbstractC3584sr.f61279f) {
                    if (objM15515m1 == AbstractC3584sr.f61281h) {
                        return false;
                    }
                    mo4900t(objM15515m1);
                    return true;
                }
            }
        } else {
            if (objM15515m1 == AbstractC3584sr.f61278e) {
                thM15491G = null;
                while (true) {
                    objM15500Q = m15500Q();
                    if (objM15500Q instanceof qe4) {
                        synchronized (objM15500Q) {
                            if (((qe4) objM15500Q).m19896c() == AbstractC3584sr.f61282i) {
                                c0842cc = AbstractC3584sr.f61281h;
                            } else {
                                boolean zM19898f2 = ((qe4) objM15500Q).m19898f();
                                if (thM15491G == null) {
                                    thM15491G = m15491G(obj);
                                }
                                ((qe4) objM15500Q).m19895a(thM15491G);
                                if (zM19898f2) {
                                }
                                if (thM19897e != null) {
                                    m15508c0(((qe4) objM15500Q).f57648a, thM19897e);
                                }
                                c0842cc = AbstractC3584sr.f61278e;
                            }
                        }
                    } else if (objM15500Q instanceof e34) {
                        if (thM15491G == null) {
                            thM15491G = m15491G(obj);
                        }
                        e34Var = (e34) objM15500Q;
                        if (e34Var.mo3666b()) {
                            objM15515m0 = m15515m0(objM15500Q, new dc1(thM15491G, false));
                            if (objM15515m0 != AbstractC3584sr.f61278e) {
                                C3386nv.m17632s(objM15500Q, "Cannot happen in ");
                                return false;
                            }
                            if (objM15515m0 != AbstractC3584sr.f61280g) {
                                objM15515m1 = objM15515m0;
                                break;
                            }
                        } else if (m15514l0(e34Var, thM15491G)) {
                            c0842cc = AbstractC3584sr.f61278e;
                        }
                    } else {
                        c0842cc = AbstractC3584sr.f61281h;
                    }
                    objM15515m1 = c0842cc;
                    break;
                }
            }
            if (objM15515m1 != AbstractC3584sr.f61278e) {
                if (objM15515m1 == AbstractC3584sr.f61281h) {
                    return false;
                }
                mo4900t(objM15515m1);
                return true;
            }
        }
        return true;
    }

    @Override // p000.cd4
    /* JADX INFO: renamed from: z */
    public final q01 mo4542z(C3213d c3213d) {
        C3213d c3213d2;
        e34 c34Var;
        r01 r01Var = new r01(c3213d);
        r01Var.f8428g = this;
        loop0: while (true) {
            Object objM15500Q = this.m15500Q();
            if (objM15500Q instanceof jr2) {
                jr2 jr2Var = (jr2) objM15500Q;
                boolean z = jr2Var.f46030a;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47796a;
                if (z) {
                    while (true) {
                        atomicReferenceFieldUpdater.getClass();
                        Unsafe unsafe = m7d.f50741a;
                        long j = f47799d;
                        c3213d2 = this;
                        if (unsafe.compareAndSwapObject(c3213d2, j, objM15500Q, r01Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(c3213d2, j) != objM15500Q) {
                            break;
                        }
                        this = c3213d2;
                    }
                } else {
                    c3213d2 = this;
                    ul6 ul6Var = new ul6();
                    if (!z) {
                        c34Var = ul6Var;
                        c34Var = new c34(ul6Var);
                    }
                    c34Var = ul6Var;
                    hn1.m13374x(atomicReferenceFieldUpdater, c3213d2, jr2Var, c34Var);
                }
                this = c3213d2;
            } else {
                c3213d2 = this;
                boolean z2 = objM15500Q instanceof e34;
                yl6 yl6Var = yl6.f70031a;
                Throwable thM19897e = null;
                if (!z2) {
                    Object objM15500Q2 = c3213d2.m15500Q();
                    dc1 dc1Var = objM15500Q2 instanceof dc1 ? (dc1) objM15500Q2 : null;
                    r01Var.mo3670s(dc1Var != null ? dc1Var.f35375a : null);
                    return yl6Var;
                }
                ul6 ul6VarMo3667d = ((e34) objM15500Q).mo3667d();
                if (ul6VarMo3667d != null) {
                    if (ul6VarMo3667d.m15574e(r01Var, 7)) {
                        break;
                    }
                    boolean zM15574e = ul6VarMo3667d.m15574e(r01Var, 3);
                    Object objM15500Q3 = c3213d2.m15500Q();
                    if (objM15500Q3 instanceof qe4) {
                        thM19897e = ((qe4) objM15500Q3).m19897e();
                    } else {
                        dc1 dc1Var2 = objM15500Q3 instanceof dc1 ? (dc1) objM15500Q3 : null;
                        if (dc1Var2 != null) {
                            thM19897e = dc1Var2.f35375a;
                        }
                    }
                    r01Var.mo3670s(thM19897e);
                    if (zM15574e) {
                        break;
                    }
                    return yl6Var;
                }
                c3213d2.m15509f0((be4) objM15500Q);
                this = c3213d2;
            }
        }
        return r01Var;
    }
}
