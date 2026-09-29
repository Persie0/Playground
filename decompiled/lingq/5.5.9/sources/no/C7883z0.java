package no;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.AbstractC7163m;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: no.z0 */
/* JADX INFO: loaded from: classes2.dex */
public class C7883z0 implements InterfaceC7875v0, InterfaceC7858p, InterfaceC7833g1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42981a = AtomicReferenceFieldUpdater.newUpdater(C7883z0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: no.z0$a */
    public static final class a<T> extends C7843k<T> {

        /* JADX INFO: renamed from: i */
        public final C7883z0 f42982i;

        public a(InterfaceC9968c<? super T> interfaceC9968c, C7883z0 c7883z0) {
            super(1, interfaceC9968c);
            this.f42982i = c7883z0;
        }

        @Override // no.C7843k
        /* JADX INFO: renamed from: o */
        public final Throwable mo15592o(C7883z0 c7883z0) {
            Throwable thM15649c;
            Object objM15634M = this.f42982i.m15634M();
            if (!(objM15634M instanceof c) || (thM15649c = ((c) objM15634M).m15649c()) == null) {
                return objM15634M instanceof C7870t ? ((C7870t) objM15634M).f42969a : c7883z0.mo15617Q();
            }
            return thM15649c;
        }

        @Override // no.C7843k
        /* JADX INFO: renamed from: w */
        public final String mo15597w() {
            return "AwaitContinuation";
        }
    }

    /* JADX INFO: renamed from: no.z0$b */
    public static final class b extends AbstractC7881y0 {

        /* JADX INFO: renamed from: e */
        public final C7883z0 f42983e;

        /* JADX INFO: renamed from: f */
        public final c f42984f;

        /* JADX INFO: renamed from: g */
        public final C7855o f42985g;

        /* JADX INFO: renamed from: h */
        public final Object f42986h;

        public b(C7883z0 c7883z0, c cVar, C7855o c7855o, Object obj) {
            this.f42983e = c7883z0;
            this.f42984f = cVar;
            this.f42985g = c7855o;
            this.f42986h = obj;
        }

        @Override // no.AbstractC7874v
        /* JADX INFO: renamed from: K */
        public final void mo14509K(Throwable th2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7883z0.f42981a;
            C7883z0 c7883z0 = this.f42983e;
            c7883z0.getClass();
            C7855o c7855oM15627Y = C7883z0.m15627Y(this.f42985g);
            c cVar = this.f42984f;
            Object obj = this.f42986h;
            if (c7855oM15627Y == null || !c7883z0.m15643i0(cVar, c7855oM15627Y, obj)) {
                c7883z0.mo14466n(c7883z0.m15630D(cVar, obj));
            }
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final /* bridge */ /* synthetic */ C9072e mo528n(Throwable th2) {
            mo14509K(th2);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: no.z0$c */
    public static final class c implements InterfaceC7862q0 {
        private volatile /* synthetic */ Object _rootCause;

        /* JADX INFO: renamed from: a */
        public final C7824d1 f42987a;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        public c(C7824d1 c7824d1, Throwable th2) {
            this.f42987a = c7824d1;
            this._rootCause = th2;
        }

        /* JADX INFO: renamed from: a */
        public final void m15648a(Throwable th2) {
            Throwable th3 = (Throwable) this._rootCause;
            if (th3 == null) {
                this._rootCause = th2;
                return;
            }
            if (th2 == th3) {
                return;
            }
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = th2;
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th2);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th2 == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th2);
            this._exceptionsHolder = arrayList;
        }

        @Override // no.InterfaceC7862q0
        /* JADX INFO: renamed from: b */
        public final boolean mo15561b() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX INFO: renamed from: c */
        public final Throwable m15649c() {
            return (Throwable) this._rootCause;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m15650d() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        /* JADX INFO: renamed from: e */
        public final boolean m15651e() {
            return this._isCompleting;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m15652f() {
            return this._exceptionsHolder == C7499b.f41422L;
        }

        /* JADX INFO: renamed from: g */
        public final ArrayList m15653g(Throwable th2) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable th3 = (Throwable) this._rootCause;
            if (th3 != null) {
                arrayList.add(0, th3);
            }
            if (th2 != null && !C5207g.m11106a(th2, th3)) {
                arrayList.add(th2);
            }
            this._exceptionsHolder = C7499b.f41422L;
            return arrayList;
        }

        /* JADX INFO: renamed from: h */
        public final void m15654h() {
            this._isCompleting = 1;
        }

        @Override // no.InterfaceC7862q0
        /* JADX INFO: renamed from: j */
        public final C7824d1 mo15562j() {
            return this.f42987a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
        public final String toString() {
            return "Finishing[cancelling=" + m15650d() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f42987a + ']';
        }
    }

    public C7883z0(boolean z10) {
        this._state = z10 ? C7499b.f41424N : C7499b.f41423M;
        this._parentHandle = null;
    }

    /* JADX INFO: renamed from: Y */
    public static C7855o m15627Y(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNodeM14416z = lockFreeLinkedListNode;
        while (lockFreeLinkedListNodeM14416z.mo14407D()) {
            lockFreeLinkedListNodeM14416z = lockFreeLinkedListNodeM14416z.m14405B();
        }
        while (true) {
            lockFreeLinkedListNodeM14416z = lockFreeLinkedListNodeM14416z.m14416z();
            if (!lockFreeLinkedListNodeM14416z.mo14407D()) {
                if (lockFreeLinkedListNodeM14416z instanceof C7855o) {
                    return (C7855o) lockFreeLinkedListNodeM14416z;
                }
                if (lockFreeLinkedListNodeM14416z instanceof C7824d1) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static String m15628g0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.m15650d()) {
                return "Cancelling";
            }
            if (cVar.m15651e()) {
                return "Completing";
            }
        } else {
            if (!(obj instanceof InterfaceC7862q0)) {
                return obj instanceof C7870t ? "Cancelled" : "Completed";
            }
            if (!((InterfaceC7862q0) obj).mo15561b()) {
                return "New";
            }
        }
        return "Active";
    }

    /* JADX INFO: renamed from: B */
    public final Throwable m15629B(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(mo15550v(), null, this) : th2;
        }
        if (obj != null) {
            return ((InterfaceC7833g1) obj).mo15575c1();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: D */
    public final Object m15630D(c cVar, Object obj) {
        Throwable thM15631F;
        C7870t c7870t = obj instanceof C7870t ? (C7870t) obj : null;
        Throwable th2 = c7870t != null ? c7870t.f42969a : null;
        synchronized (cVar) {
            cVar.m15650d();
            ArrayList<Throwable> arrayListM15653g = cVar.m15653g(th2);
            thM15631F = m15631F(cVar, arrayListM15653g);
            if (thM15631F != null && arrayListM15653g.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM15653g.size()));
                loop1: while (true) {
                    for (Throwable th3 : arrayListM15653g) {
                        if (th3 != thM15631F && th3 != thM15631F && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                            C8656b.m16899g(thM15631F, th3);
                        }
                    }
                    break loop1;
                }
            }
        }
        if (thM15631F != null && thM15631F != th2) {
            obj = new C7870t(thM15631F, false);
        }
        if (thM15631F != null) {
            if (m15646u(thM15631F) || mo15605N(thM15631F)) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                C7870t.f42968b.compareAndSet((C7870t) obj, 0, 1);
            }
        }
        mo15546a0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42981a;
        Object c7865r0 = obj instanceof InterfaceC7862q0 ? new C7865r0((InterfaceC7862q0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, c7865r0) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        m15647z(cVar, obj);
        return obj;
    }

    @Override // no.InterfaceC7875v0
    /* JADX INFO: renamed from: E */
    public final Object mo15615E(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        boolean z10;
        while (true) {
            Object objM15634M = m15634M();
            if (!(objM15634M instanceof InterfaceC7862q0)) {
                z10 = false;
                break;
            }
            if (m15641f0(objM15634M) >= 0) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            C0062b.m286L0(interfaceC9968c.mo2029e());
            return C9072e.f47360a;
        }
        C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        c7843k.mo15577R(new C7831g(1, mo15620r1(new C7842j1(c7843k))));
        Object objM15593p = c7843k.m15593p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM15593p != coroutineSingletons) {
            objM15593p = C9072e.f47360a;
        }
        return objM15593p == coroutineSingletons ? objM15593p : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: F */
    public final Throwable m15631F(c cVar, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (cVar.m15650d()) {
                return new JobCancellationException(mo15550v(), null, this);
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
        } while (!(!(((Throwable) next) instanceof CancellationException)));
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x002f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0122  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // no.InterfaceC7875v0
    /* JADX INFO: renamed from: G */
    public final InterfaceC7838i0 mo15616G(boolean z10, boolean z11, InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l) {
        AbstractC7881y0 c7873u0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thM15649c;
        C7815a1 c7815a1;
        int iM14411I;
        boolean z12;
        if (z10) {
            c7873u0 = interfaceC2052l instanceof AbstractC7877w0 ? (AbstractC7877w0) interfaceC2052l : null;
            if (c7873u0 == null) {
                c7873u0 = new C7871t0(interfaceC2052l);
            }
        } else {
            c7873u0 = interfaceC2052l instanceof AbstractC7881y0 ? (AbstractC7881y0) interfaceC2052l : null;
            if (c7873u0 == null) {
                c7873u0 = new C7873u0(interfaceC2052l);
            }
        }
        c7873u0.f42980d = this;
        while (true) {
            Object objM15634M = m15634M();
            boolean z13 = false;
            if (objM15634M instanceof C7844k0) {
                C7844k0 c7844k0 = (C7844k0) objM15634M;
                if (c7844k0.f42942a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42981a;
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, objM15634M, c7873u0)) {
                            z13 = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == objM15634M);
                    if (z13) {
                        return c7873u0;
                    }
                } else {
                    C7824d1 c7824d1 = new C7824d1();
                    Object c7859p0 = c7824d1;
                    if (!c7844k0.f42942a) {
                        c7859p0 = new C7859p0(c7824d1);
                    }
                    do {
                        atomicReferenceFieldUpdater = f42981a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, c7844k0, c7859p0)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == c7844k0);
                }
            } else {
                if (!(objM15634M instanceof InterfaceC7862q0)) {
                    if (z11) {
                        C7870t c7870t = objM15634M instanceof C7870t ? (C7870t) objM15634M : null;
                        interfaceC2052l.mo528n(c7870t != null ? c7870t.f42969a : null);
                    }
                    return C7827e1.f42925a;
                }
                C7824d1 c7824d1Mo15562j = ((InterfaceC7862q0) objM15634M).mo15562j();
                if (c7824d1Mo15562j != null) {
                    InterfaceC7838i0 interfaceC7838i0 = C7827e1.f42925a;
                    if (z10 && (objM15634M instanceof c)) {
                        synchronized (objM15634M) {
                            thM15649c = ((c) objM15634M).m15649c();
                            if (thM15649c == null || ((interfaceC2052l instanceof C7855o) && !((c) objM15634M).m15651e())) {
                                C7815a1 c7815a2 = new C7815a1(c7873u0, this, objM15634M);
                                while (true) {
                                    int iM14411I2 = c7824d1Mo15562j.m14405B().m14411I(c7873u0, c7824d1Mo15562j, c7815a2);
                                    if (iM14411I2 == 1) {
                                        z12 = true;
                                        break;
                                    }
                                    if (iM14411I2 == 2) {
                                        z12 = false;
                                        break;
                                    }
                                }
                                if (z12) {
                                    if (thM15649c == null) {
                                        return c7873u0;
                                    }
                                    interfaceC7838i0 = c7873u0;
                                }
                            }
                            C9072e c9072e = C9072e.f47360a;
                        }
                        if (thM15649c != null) {
                            if (z11) {
                                interfaceC2052l.mo528n(thM15649c);
                            }
                            return interfaceC7838i0;
                        }
                        c7815a1 = new C7815a1(c7873u0, this, objM15634M);
                        do {
                            iM14411I = c7824d1Mo15562j.m14405B().m14411I(c7873u0, c7824d1Mo15562j, c7815a1);
                            if (iM14411I != 1) {
                                z13 = true;
                                break;
                            }
                        } while (iM14411I != 2);
                        if (z13) {
                            return c7873u0;
                        }
                    } else {
                        thM15649c = null;
                        if (thM15649c != null) {
                            if (z11) {
                                interfaceC2052l.mo528n(thM15649c);
                            }
                            return interfaceC7838i0;
                        }
                        c7815a1 = new C7815a1(c7873u0, this, objM15634M);
                        do {
                            iM14411I = c7824d1Mo15562j.m14405B().m14411I(c7873u0, c7824d1Mo15562j, c7815a1);
                            if (iM14411I != 1) {
                                z13 = true;
                                break;
                            }
                        } while (iM14411I != 2);
                        if (z13) {
                            return c7873u0;
                        }
                    }
                } else {
                    if (objM15634M == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    m15640c0((AbstractC7881y0) objM15634M);
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean mo15624I() {
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean mo15625J() {
        return this instanceof C7864r;
    }

    /* JADX INFO: renamed from: K */
    public final C7824d1 m15632K(InterfaceC7862q0 interfaceC7862q0) {
        C7824d1 c7824d1Mo15562j = interfaceC7862q0.mo15562j();
        if (c7824d1Mo15562j != null) {
            return c7824d1Mo15562j;
        }
        if (interfaceC7862q0 instanceof C7844k0) {
            return new C7824d1();
        }
        if (interfaceC7862q0 instanceof AbstractC7881y0) {
            m15640c0((AbstractC7881y0) interfaceC7862q0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC7862q0).toString());
    }

    /* JADX INFO: renamed from: L */
    public final InterfaceC7852n m15633L() {
        return (InterfaceC7852n) this._parentHandle;
    }

    /* JADX INFO: renamed from: M */
    public final Object m15634M() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC7163m)) {
                return obj;
            }
            ((AbstractC7163m) obj).mo14428c(this);
        }
    }

    /* JADX INFO: renamed from: N */
    public boolean mo15605N(Throwable th2) {
        return false;
    }

    /* JADX INFO: renamed from: O */
    public void mo15544O(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* JADX INFO: renamed from: P */
    public final void m15635P(InterfaceC7875v0 interfaceC7875v0) {
        C7827e1 c7827e1 = C7827e1.f42925a;
        if (interfaceC7875v0 == null) {
            this._parentHandle = c7827e1;
            return;
        }
        interfaceC7875v0.start();
        InterfaceC7852n interfaceC7852nMo15619q1 = interfaceC7875v0.mo15619q1(this);
        this._parentHandle = interfaceC7852nMo15619q1;
        if (!(m15634M() instanceof InterfaceC7862q0)) {
            interfaceC7852nMo15619q1.mo14330a();
            this._parentHandle = c7827e1;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m15636P0(Object obj) {
        return m15637T(obj);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // no.InterfaceC7875v0
    /* JADX INFO: renamed from: Q */
    public final CancellationException mo15617Q() {
        Object objM15634M = m15634M();
        CancellationException jobCancellationException = null;
        if (objM15634M instanceof c) {
            Throwable thM15649c = ((c) objM15634M).m15649c();
            if (thM15649c == null) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            if (thM15649c instanceof CancellationException) {
                jobCancellationException = (CancellationException) thM15649c;
            }
            if (jobCancellationException == null) {
                if (strConcat == null) {
                    strConcat = mo15550v();
                }
                return new JobCancellationException(strConcat, thM15649c, this);
            }
        } else {
            if (objM15634M instanceof InterfaceC7862q0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objM15634M instanceof C7870t) {
                Throwable th2 = ((C7870t) objM15634M).f42969a;
                if (th2 instanceof CancellationException) {
                    jobCancellationException = (CancellationException) th2;
                }
                if (jobCancellationException == null) {
                    return new JobCancellationException(mo15550v(), th2, this);
                }
            } else {
                jobCancellationException = new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
        }
        return jobCancellationException;
    }

    /* JADX INFO: renamed from: S */
    public boolean mo14465S() {
        return this instanceof C7822d;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m15637T(Object obj) {
        Object objM15642h0;
        do {
            objM15642h0 = m15642h0(m15634M(), obj);
            if (objM15642h0 == C7499b.f41418H) {
                return false;
            }
            if (objM15642h0 == C7499b.f41419I) {
                return true;
            }
        } while (objM15642h0 == C7499b.f41420J);
        mo14466n(objM15642h0);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: V */
    public final Object m15638V(Object obj) {
        Object objM15642h0;
        do {
            objM15642h0 = m15642h0(m15634M(), obj);
            if (objM15642h0 == C7499b.f41418H) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C7870t c7870t = obj instanceof C7870t ? (C7870t) obj : null;
                throw new IllegalStateException(str, c7870t != null ? c7870t.f42969a : null);
            }
        } while (objM15642h0 == C7499b.f41420J);
        return objM15642h0;
    }

    /* JADX INFO: renamed from: W */
    public String mo15545W() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: Z */
    public final void m15639Z(C7824d1 c7824d1, Throwable th2) {
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM14416z = (LockFreeLinkedListNode) c7824d1.m14415x(); !C5207g.m11106a(lockFreeLinkedListNodeM14416z, c7824d1); lockFreeLinkedListNodeM14416z = lockFreeLinkedListNodeM14416z.m14416z()) {
            if (lockFreeLinkedListNodeM14416z instanceof AbstractC7877w0) {
                AbstractC7881y0 abstractC7881y0 = (AbstractC7881y0) lockFreeLinkedListNodeM14416z;
                try {
                    abstractC7881y0.mo14509K(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        C8656b.m16899g(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + abstractC7881y0 + " for " + this, th3);
                        C9072e c9072e = C9072e.f47360a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo15544O(completionHandlerException);
        }
        m15646u(th2);
    }

    @Override // no.InterfaceC7875v0
    /* JADX INFO: renamed from: a */
    public void mo15618a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo15550v(), null, this);
        }
        mo15645s(cancellationException);
    }

    /* JADX INFO: renamed from: a0 */
    public void mo15546a0(Object obj) {
    }

    @Override // no.InterfaceC7875v0
    /* JADX INFO: renamed from: b */
    public boolean mo15547b() {
        Object objM15634M = m15634M();
        return (objM15634M instanceof InterfaceC7862q0) && ((InterfaceC7862q0) objM15634M).mo15561b();
    }

    /* JADX INFO: renamed from: b0 */
    public void mo15558b0() {
    }

    /* JADX INFO: renamed from: c0 */
    public final void m15640c0(AbstractC7881y0 abstractC7881y0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z10;
        C7824d1 c7824d1 = new C7824d1();
        abstractC7881y0.getClass();
        LockFreeLinkedListNode.f40392b.lazySet(c7824d1, abstractC7881y0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f40391a;
        atomicReferenceFieldUpdater2.lazySet(c7824d1, abstractC7881y0);
        while (abstractC7881y0.m14415x() == abstractC7881y0) {
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC7881y0, abstractC7881y0, c7824d1)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(abstractC7881y0) != abstractC7881y0) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                c7824d1.m14414w(abstractC7881y0);
                break;
            }
        }
        LockFreeLinkedListNode lockFreeLinkedListNodeM14416z = abstractC7881y0.m14416z();
        do {
            atomicReferenceFieldUpdater = f42981a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC7881y0, lockFreeLinkedListNodeM14416z)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC7881y0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // no.InterfaceC7833g1
    /* JADX INFO: renamed from: c1 */
    public final CancellationException mo15575c1() {
        Throwable thM15649c;
        Object objM15634M = m15634M();
        CancellationException cancellationException = null;
        if (objM15634M instanceof c) {
            thM15649c = ((c) objM15634M).m15649c();
        } else if (objM15634M instanceof C7870t) {
            thM15649c = ((C7870t) objM15634M).f42969a;
        } else {
            if (objM15634M instanceof InterfaceC7862q0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM15634M).toString());
            }
            thM15649c = null;
        }
        if (thM15649c instanceof CancellationException) {
            cancellationException = (CancellationException) thM15649c;
        }
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(m15628g0(objM15634M)), thM15649c, this) : cancellationException;
    }

    /* JADX INFO: renamed from: f0 */
    public final int m15641f0(Object obj) {
        boolean z10 = obj instanceof C7844k0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42981a;
        boolean z11 = false;
        if (z10) {
            if (((C7844k0) obj).f42942a) {
                return 0;
            }
            C7844k0 c7844k0 = C7499b.f41424N;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c7844k0)) {
                    z11 = true;
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            if (!z11) {
                return -1;
            }
            mo15558b0();
            return 1;
        }
        if (!(obj instanceof C7859p0)) {
            return 0;
        }
        C7824d1 c7824d1 = ((C7859p0) obj).f42955a;
        do {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c7824d1)) {
                z11 = true;
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == obj);
        if (!z11) {
            return -1;
        }
        mo15558b0();
        return 1;
    }

    @Override // kotlin.coroutines.CoroutineContext.InterfaceC6757a
    public final CoroutineContext.InterfaceC6758b<?> getKey() {
        return InterfaceC7875v0.b.f42976a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.Throwable] */
    /* JADX INFO: renamed from: h0 */
    public final Object m15642h0(Object obj, Object obj2) {
        boolean z10;
        if (!(obj instanceof InterfaceC7862q0)) {
            return C7499b.f41418H;
        }
        boolean z11 = true;
        boolean z12 = false;
        if (((obj instanceof C7844k0) || (obj instanceof AbstractC7881y0)) && !(obj instanceof C7855o) && !(obj2 instanceof C7870t)) {
            InterfaceC7862q0 interfaceC7862q0 = (InterfaceC7862q0) obj;
            Object c7865r0 = obj2 instanceof InterfaceC7862q0 ? new C7865r0((InterfaceC7862q0) obj2) : obj2;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42981a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC7862q0, c7865r0)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != interfaceC7862q0) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                mo15546a0(obj2);
                m15647z(interfaceC7862q0, obj2);
            } else {
                z11 = false;
            }
            return z11 ? obj2 : C7499b.f41420J;
        }
        InterfaceC7862q0 interfaceC7862q1 = (InterfaceC7862q0) obj;
        C7824d1 c7824d1M15632K = m15632K(interfaceC7862q1);
        if (c7824d1M15632K == null) {
            return C7499b.f41420J;
        }
        C7855o c7855oM15627Y = null;
        c cVar = interfaceC7862q1 instanceof c ? (c) interfaceC7862q1 : null;
        if (cVar == null) {
            cVar = new c(c7824d1M15632K, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (cVar) {
            if (cVar.m15651e()) {
                return C7499b.f41418H;
            }
            cVar.m15654h();
            if (cVar != interfaceC7862q1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42981a;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC7862q1, cVar)) {
                        z12 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == interfaceC7862q1);
                if (!z12) {
                    return C7499b.f41420J;
                }
            }
            boolean zM15650d = cVar.m15650d();
            C7870t c7870t = obj2 instanceof C7870t ? (C7870t) obj2 : null;
            if (c7870t != null) {
                cVar.m15648a(c7870t.f42969a);
            }
            ?? M15649c = Boolean.valueOf(true ^ zM15650d).booleanValue() ? cVar.m15649c() : 0;
            ref$ObjectRef.f38127a = M15649c;
            C9072e c9072e = C9072e.f47360a;
            if (M15649c != 0) {
                m15639Z(c7824d1M15632K, M15649c);
            }
            C7855o c7855o = interfaceC7862q1 instanceof C7855o ? (C7855o) interfaceC7862q1 : null;
            if (c7855o == null) {
                C7824d1 c7824d1Mo15562j = interfaceC7862q1.mo15562j();
                if (c7824d1Mo15562j != null) {
                    c7855oM15627Y = m15627Y(c7824d1Mo15562j);
                }
                return (c7855oM15627Y == null && m15643i0(cVar, c7855oM15627Y, obj2)) ? C7499b.f41419I : m15630D(cVar, obj2);
            }
            c7855oM15627Y = c7855o;
            if (c7855oM15627Y == null) {
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m15643i0(c cVar, C7855o c7855o, Object obj) {
        while (InterfaceC7875v0.a.m15621a(c7855o.f42952e, false, new b(this, cVar, c7855o, obj), 1) == C7827e1.f42925a) {
            c7855o = m15627Y(c7855o);
            if (c7855o == null) {
                return false;
            }
        }
        return true;
    }

    @Override // no.InterfaceC7875v0
    public final boolean isCancelled() {
        Object objM15634M = m15634M();
        if (!(objM15634M instanceof C7870t) && (!(objM15634M instanceof c) || !((c) objM15634M).m15650d())) {
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: m0 */
    public final CoroutineContext mo1473m0(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
        return CoroutineContext.InterfaceC6757a.a.m13472b(this, interfaceC6758b);
    }

    /* JADX INFO: renamed from: n */
    public void mo14466n(Object obj) {
    }

    /* JADX INFO: renamed from: o */
    public void mo14467o(Object obj) {
        mo14466n(obj);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x004c A[SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public final boolean m15644p(Object obj) {
        C7168r c7168r;
        boolean z10;
        boolean z11;
        Object objM15642h0 = C7499b.f41418H;
        if (mo15625J()) {
            do {
                Object objM15634M = m15634M();
                if (!(objM15634M instanceof InterfaceC7862q0) || ((objM15634M instanceof c) && ((c) objM15634M).m15651e())) {
                    objM15642h0 = C7499b.f41418H;
                    break;
                }
                objM15642h0 = m15642h0(objM15634M, new C7870t(m15629B(obj), false));
            } while (objM15642h0 == C7499b.f41420J);
            if (objM15642h0 == C7499b.f41419I) {
                return true;
            }
        }
        if (objM15642h0 == C7499b.f41418H) {
            Throwable th2 = null;
            Throwable thM15629B = null;
            while (true) {
                Object objM15634M2 = m15634M();
                if (objM15634M2 instanceof c) {
                    synchronized (objM15634M2) {
                        try {
                            if (((c) objM15634M2).m15652f()) {
                                c7168r = C7499b.f41421K;
                            } else {
                                boolean zM15650d = ((c) objM15634M2).m15650d();
                                if (obj != null || !zM15650d) {
                                    if (thM15629B == null) {
                                        thM15629B = m15629B(obj);
                                    }
                                    ((c) objM15634M2).m15648a(thM15629B);
                                }
                                Throwable thM15649c = ((c) objM15634M2).m15649c();
                                if (!zM15650d) {
                                    th2 = thM15649c;
                                }
                                if (th2 != null) {
                                    m15639Z(((c) objM15634M2).f42987a, th2);
                                }
                                c7168r = C7499b.f41418H;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else if (objM15634M2 instanceof InterfaceC7862q0) {
                    if (thM15629B == null) {
                        thM15629B = m15629B(obj);
                    }
                    InterfaceC7862q0 interfaceC7862q0 = (InterfaceC7862q0) objM15634M2;
                    if (interfaceC7862q0.mo15561b()) {
                        C7824d1 c7824d1M15632K = m15632K(interfaceC7862q0);
                        if (c7824d1M15632K != null) {
                            c cVar = new c(c7824d1M15632K, thM15629B);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42981a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC7862q0, cVar)) {
                                    z10 = true;
                                    break;
                                }
                                if (atomicReferenceFieldUpdater.get(this) != interfaceC7862q0) {
                                    z10 = false;
                                    break;
                                }
                            }
                            if (z10) {
                                m15639Z(c7824d1M15632K, thM15629B);
                                z11 = true;
                            }
                            if (z11) {
                                c7168r = C7499b.f41418H;
                            }
                        }
                        z11 = false;
                        if (z11) {
                            c7168r = C7499b.f41418H;
                        }
                    } else {
                        Object objM15642h1 = m15642h0(objM15634M2, new C7870t(thM15629B, false));
                        if (objM15642h1 == C7499b.f41418H) {
                            throw new IllegalStateException(("Cannot happen in " + objM15634M2).toString());
                        }
                        if (objM15642h1 != C7499b.f41420J) {
                            objM15642h0 = objM15642h1;
                            break;
                        }
                    }
                } else {
                    c7168r = C7499b.f41421K;
                }
                objM15642h0 = c7168r;
                break;
            }
        }
        if (objM15642h0 != C7499b.f41418H && objM15642h0 != C7499b.f41419I) {
            if (objM15642h0 == C7499b.f41421K) {
                return false;
            }
            mo14466n(objM15642h0);
        }
        return true;
    }

    @Override // no.InterfaceC7875v0
    /* JADX INFO: renamed from: q1 */
    public final InterfaceC7852n mo15619q1(C7883z0 c7883z0) {
        return (InterfaceC7852n) InterfaceC7875v0.a.m15621a(this, true, new C7855o(c7883z0), 2);
    }

    @Override // no.InterfaceC7858p
    /* JADX INFO: renamed from: r */
    public final void mo15608r(C7883z0 c7883z0) {
        m15644p(c7883z0);
    }

    @Override // no.InterfaceC7875v0
    /* JADX INFO: renamed from: r1 */
    public final InterfaceC7838i0 mo15620r1(InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l) {
        return mo15616G(false, true, interfaceC2052l);
    }

    /* JADX INFO: renamed from: s */
    public void mo15645s(CancellationException cancellationException) {
        m15644p(cancellationException);
    }

    @Override // no.InterfaceC7875v0
    public final boolean start() {
        int iM15641f0;
        do {
            iM15641f0 = m15641f0(m15634M());
            if (iM15641f0 == 0) {
                return false;
            }
        } while (iM15641f0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo15545W() + '{' + m15628g0(m15634M()) + '}');
        sb2.append('@');
        sb2.append(C7814a0.m15551c(this));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15646u(Throwable th2) {
        boolean z10 = true;
        if (mo14465S()) {
            return true;
        }
        boolean z11 = th2 instanceof CancellationException;
        InterfaceC7852n interfaceC7852n = (InterfaceC7852n) this._parentHandle;
        if (interfaceC7852n != null && interfaceC7852n != C7827e1.f42925a) {
            if (!interfaceC7852n.mo15566l(th2)) {
                z10 = z11;
            }
            return z10;
        }
        return z11;
    }

    /* JADX INFO: renamed from: v */
    public String mo15550v() {
        return "Job was cancelled";
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: w */
    public final <E extends CoroutineContext.InterfaceC6757a> E mo1474w(CoroutineContext.InterfaceC6758b<E> interfaceC6758b) {
        return (E) CoroutineContext.InterfaceC6757a.a.m13471a(this, interfaceC6758b);
    }

    /* JADX INFO: renamed from: x */
    public boolean mo15606x(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return m15644p(th2) && mo15624I();
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: y0 */
    public final <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super CoroutineContext.InterfaceC6757a, ? extends R> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "operation");
        return interfaceC2056p.mo1337m0(r10, this);
    }

    /* JADX INFO: renamed from: z */
    public final void m15647z(InterfaceC7862q0 interfaceC7862q0, Object obj) {
        InterfaceC7852n interfaceC7852n = (InterfaceC7852n) this._parentHandle;
        if (interfaceC7852n != null) {
            interfaceC7852n.mo14330a();
            this._parentHandle = C7827e1.f42925a;
        }
        CompletionHandlerException completionHandlerException = null;
        C7870t c7870t = obj instanceof C7870t ? (C7870t) obj : null;
        Throwable th2 = c7870t != null ? c7870t.f42969a : null;
        if (interfaceC7862q0 instanceof AbstractC7881y0) {
            try {
                ((AbstractC7881y0) interfaceC7862q0).mo14509K(th2);
                return;
            } catch (Throwable th3) {
                mo15544O(new CompletionHandlerException("Exception in completion handler " + interfaceC7862q0 + " for " + this, th3));
                return;
            }
        }
        C7824d1 c7824d1Mo15562j = interfaceC7862q0.mo15562j();
        if (c7824d1Mo15562j != null) {
            for (LockFreeLinkedListNode lockFreeLinkedListNodeM14416z = (LockFreeLinkedListNode) c7824d1Mo15562j.m14415x(); !C5207g.m11106a(lockFreeLinkedListNodeM14416z, c7824d1Mo15562j); lockFreeLinkedListNodeM14416z = lockFreeLinkedListNodeM14416z.m14416z()) {
                if (lockFreeLinkedListNodeM14416z instanceof AbstractC7881y0) {
                    AbstractC7881y0 abstractC7881y0 = (AbstractC7881y0) lockFreeLinkedListNodeM14416z;
                    try {
                        abstractC7881y0.mo14509K(th2);
                    } catch (Throwable th4) {
                        if (completionHandlerException != null) {
                            C8656b.m16899g(completionHandlerException, th4);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + abstractC7881y0 + " for " + this, th4);
                            C9072e c9072e = C9072e.f47360a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo15544O(completionHandlerException);
            }
        }
    }
}
