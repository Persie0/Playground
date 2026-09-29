package no;

import cm.InterfaceC2052l;
import dm.C5212l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C7156f;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10223b;
import sl.C9072e;

/* JADX INFO: renamed from: no.k */
/* JADX INFO: loaded from: classes2.dex */
public class C7843k<T> extends AbstractC7826e0<T> implements InterfaceC7840j<T>, InterfaceC10223b {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42937g = AtomicIntegerFieldUpdater.newUpdater(C7843k.class, "_decision");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42938h = AtomicReferenceFieldUpdater.newUpdater(C7843k.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9968c<T> f42939d;

    /* JADX INFO: renamed from: e */
    public final CoroutineContext f42940e;

    /* JADX INFO: renamed from: f */
    public InterfaceC7838i0 f42941f;

    public C7843k(int i10, InterfaceC9968c interfaceC9968c) {
        super(i10);
        this.f42939d = interfaceC9968c;
        this.f42940e = interfaceC9968c.mo2029e();
        this._decision = 0;
        this._state = C7816b.f42917a;
    }

    /* JADX INFO: renamed from: B */
    public static Object m15584B(InterfaceC7830f1 interfaceC7830f1, Object obj, int i10, InterfaceC2052l interfaceC2052l, Object obj2) {
        if (obj instanceof C7870t) {
            return obj;
        }
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                z10 = false;
            }
        }
        if (!z10 && obj2 == null) {
            return obj;
        }
        if (interfaceC2052l != null || (((interfaceC7830f1 instanceof AbstractC7834h) && !(interfaceC7830f1 instanceof AbstractC7819c)) || obj2 != null)) {
            return new C7867s(obj, interfaceC7830f1 instanceof AbstractC7834h ? (AbstractC7834h) interfaceC7830f1 : null, interfaceC2052l, obj2, null, 16);
        }
        return obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: v */
    public static void m15585v(Object obj, InterfaceC2052l interfaceC2052l) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC2052l + ", already has " + obj).toString());
    }

    @Override // no.InterfaceC7840j
    /* JADX INFO: renamed from: A */
    public final void mo15576A(CoroutineDispatcher coroutineDispatcher, C9072e c9072e) {
        InterfaceC9968c<T> interfaceC9968c = this.f42939d;
        C7156f c7156f = interfaceC9968c instanceof C7156f ? (C7156f) interfaceC9968c : null;
        m15599z(c9072e, (c7156f != null ? c7156f.f40420d : null) == coroutineDispatcher ? 4 : this.f42924c, null);
    }

    /* JADX INFO: renamed from: C */
    public final C7168r m15586C(Object obj, Object obj2, InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l) {
        C7168r c7168r;
        boolean z10;
        do {
            Object obj3 = this._state;
            boolean z11 = obj3 instanceof InterfaceC7830f1;
            c7168r = C5212l.f33292k;
            if (!z11) {
                if (!(obj3 instanceof C7867s)) {
                    return null;
                }
                if (obj2 == null || ((C7867s) obj3).f42963d != obj2) {
                    return null;
                }
                return c7168r;
            }
            Object objM15584B = m15584B((InterfaceC7830f1) obj3, obj, this.f42924c, interfaceC2052l, obj2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42938h;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, objM15584B)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        if (!m15596u()) {
            m15590m();
        }
        return c7168r;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // no.InterfaceC7840j
    /* JADX INFO: renamed from: R */
    public final void mo15577R(InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l) {
        AbstractC7834h c7868s0 = interfaceC2052l instanceof AbstractC7834h ? (AbstractC7834h) interfaceC2052l : new C7868s0(interfaceC2052l);
        while (true) {
            Object obj = this._state;
            boolean z10 = true;
            if (obj instanceof C7816b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42938h;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7868s0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                if (obj instanceof AbstractC7834h) {
                    m15585v(obj, interfaceC2052l);
                    throw null;
                }
                boolean z11 = obj instanceof C7870t;
                if (z11) {
                    C7870t c7870t = (C7870t) obj;
                    c7870t.getClass();
                    if (!C7870t.f42968b.compareAndSet(c7870t, 0, 1)) {
                        m15585v(obj, interfaceC2052l);
                        throw null;
                    }
                    if (obj instanceof C7846l) {
                        if (!z11) {
                            c7870t = null;
                        }
                        m15587j(interfaceC2052l, c7870t != null ? c7870t.f42969a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof C7867s) {
                    C7867s c7867s = (C7867s) obj;
                    if (c7867s.f42961b != null) {
                        m15585v(obj, interfaceC2052l);
                        throw null;
                    }
                    if (c7868s0 instanceof AbstractC7819c) {
                        return;
                    }
                    Throwable th2 = c7867s.f42964e;
                    if (th2 != null) {
                        m15587j(interfaceC2052l, th2);
                        return;
                    }
                    C7867s c7867sM15613a = C7867s.m15613a(c7867s, c7868s0, null, 29);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42938h;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c7867sM15613a)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                } else {
                    if (c7868s0 instanceof AbstractC7819c) {
                        return;
                    }
                    C7867s c7867s2 = new C7867s(obj, c7868s0, null, null, null, 28);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f42938h;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c7867s2)) {
                        if (atomicReferenceFieldUpdater3.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            }
        }
    }

    @Override // no.InterfaceC7840j
    /* JADX INFO: renamed from: X */
    public final C7168r mo15578X(Throwable th2) {
        return m15586C(new C7870t(th2, false), null, null);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // no.AbstractC7826e0
    /* JADX INFO: renamed from: a */
    public final void mo14440a(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof InterfaceC7830f1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C7870t) {
                return;
            }
            boolean z10 = true;
            if (obj2 instanceof C7867s) {
                C7867s c7867s = (C7867s) obj2;
                if (!(!(c7867s.f42964e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                C7867s c7867sM15613a = C7867s.m15613a(c7867s, null, cancellationException, 15);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42938h;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c7867sM15613a)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    AbstractC7834h abstractC7834h = c7867s.f42961b;
                    if (abstractC7834h != null) {
                        m15588k(abstractC7834h, cancellationException);
                    }
                    InterfaceC2052l<Throwable, C9072e> interfaceC2052l = c7867s.f42962c;
                    if (interfaceC2052l != null) {
                        m15589l(interfaceC2052l, cancellationException);
                        return;
                    }
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42938h;
                C7867s c7867s2 = new C7867s(obj2, null, null, null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c7867s2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    @Override // no.InterfaceC7840j
    /* JADX INFO: renamed from: b */
    public final boolean mo15579b() {
        return this._state instanceof InterfaceC7830f1;
    }

    @Override // no.AbstractC7826e0
    /* JADX INFO: renamed from: c */
    public final InterfaceC9968c<T> mo14441c() {
        return this.f42939d;
    }

    @Override // p490xl.InterfaceC10223b
    /* JADX INFO: renamed from: d */
    public final InterfaceC10223b mo13473d() {
        InterfaceC9968c<T> interfaceC9968c = this.f42939d;
        if (interfaceC9968c instanceof InterfaceC10223b) {
            return (InterfaceC10223b) interfaceC9968c;
        }
        return null;
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public final CoroutineContext mo2029e() {
        return this.f42940e;
    }

    @Override // no.InterfaceC7840j
    /* JADX INFO: renamed from: e0 */
    public final C7168r mo15580e0(Object obj, LockFreeLinkedListNode.AbstractC7146a abstractC7146a, InterfaceC2052l interfaceC2052l) {
        return m15586C(obj, abstractC7146a, interfaceC2052l);
    }

    @Override // no.AbstractC7826e0
    /* JADX INFO: renamed from: f */
    public final Throwable mo15563f(Object obj) {
        Throwable thMo15563f = super.mo15563f(obj);
        if (thMo15563f != null) {
            return thMo15563f;
        }
        return null;
    }

    @Override // no.AbstractC7826e0
    /* JADX INFO: renamed from: g */
    public final <T> T mo15564g(Object obj) {
        if (obj instanceof C7867s) {
            obj = (T) ((C7867s) obj).f42960a;
        }
        return (T) obj;
    }

    @Override // no.AbstractC7826e0
    /* JADX INFO: renamed from: i */
    public final Object mo14442i() {
        return this._state;
    }

    /* JADX INFO: renamed from: j */
    public final void m15587j(InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l, Throwable th2) {
        try {
            interfaceC2052l.mo528n(th2);
        } catch (Throwable th3) {
            C8573r0.m16769x0(this.f42940e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15588k(AbstractC7834h abstractC7834h, Throwable th2) {
        try {
            abstractC7834h.mo14353a(th2);
        } catch (Throwable th3) {
            C8573r0.m16769x0(this.f42940e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15589l(InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l, Throwable th2) {
        try {
            interfaceC2052l.mo528n(th2);
        } catch (Throwable th3) {
            C8573r0.m16769x0(this.f42940e, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m15590m() {
        InterfaceC7838i0 interfaceC7838i0 = this.f42941f;
        if (interfaceC7838i0 == null) {
            return;
        }
        interfaceC7838i0.mo14330a();
        this.f42941f = C7827e1.f42925a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public final void m15591n(int i10) {
        boolean z10;
        boolean z11;
        while (true) {
            int i11 = this._decision;
            z10 = false;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                z11 = false;
                break;
            } else if (f42937g.compareAndSet(this, 0, 2)) {
                z11 = true;
                break;
            }
        }
        if (z11) {
            return;
        }
        InterfaceC9968c<T> interfaceC9968c = this.f42939d;
        boolean z12 = i10 == 4;
        if (!z12 && (interfaceC9968c instanceof C7156f)) {
            boolean z13 = i10 == 1 || i10 == 2;
            int i12 = this.f42924c;
            if (i12 == 1 || i12 == 2) {
                z10 = true;
            }
            if (z13 == z10) {
                CoroutineDispatcher coroutineDispatcher = ((C7156f) interfaceC9968c).f40420d;
                CoroutineContext coroutineContextMo2029e = interfaceC9968c.mo2029e();
                if (coroutineDispatcher.mo3964B1(coroutineContextMo2029e)) {
                    coroutineDispatcher.mo2307z1(coroutineContextMo2029e, this);
                    return;
                }
                AbstractC7847l0 abstractC7847l0M15607a = C7857o1.m15607a();
                if (abstractC7847l0M15607a.m15603F1()) {
                    abstractC7847l0M15607a.m15601D1(this);
                    return;
                }
                abstractC7847l0M15607a.m15602E1(true);
                try {
                    C8573r0.m16706W0(this, this.f42939d, true);
                    do {
                    } while (abstractC7847l0M15607a.m15604H1());
                } catch (Throwable th2) {
                    try {
                        m15565h(th2, null);
                    } finally {
                        abstractC7847l0M15607a.m15600C1(true);
                    }
                }
                return;
            }
        }
        C8573r0.m16706W0(this, interfaceC9968c, z12);
    }

    /* JADX INFO: renamed from: o */
    public Throwable mo15592o(C7883z0 c7883z0) {
        return c7883z0.mo15617Q();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: p */
    public final Object m15593p() {
        boolean z10;
        boolean z11;
        InterfaceC7875v0 interfaceC7875v0;
        Throwable thM14447n;
        Throwable thM14447n2;
        boolean zM15596u = m15596u();
        while (true) {
            int i10 = this._decision;
            z10 = true;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                z11 = false;
                break;
            }
            if (f42937g.compareAndSet(this, 0, 1)) {
                z11 = true;
                break;
            }
        }
        C7156f c7156f = null;
        if (z11) {
            if (this.f42941f == null) {
                m15595s();
            }
            if (zM15596u) {
                InterfaceC9968c<T> interfaceC9968c = this.f42939d;
                if (interfaceC9968c instanceof C7156f) {
                    c7156f = (C7156f) interfaceC9968c;
                }
                if (c7156f != null && (thM14447n2 = c7156f.m14447n(this)) != null) {
                    m15590m();
                    mo15583t0(thM14447n2);
                }
            }
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (zM15596u) {
            InterfaceC9968c<T> interfaceC9968c2 = this.f42939d;
            if (interfaceC9968c2 instanceof C7156f) {
                c7156f = (C7156f) interfaceC9968c2;
            }
            if (c7156f != null && (thM14447n = c7156f.m14447n(this)) != null) {
                m15590m();
                mo15583t0(thM14447n);
            }
        }
        Object obj = this._state;
        if (obj instanceof C7870t) {
            throw ((C7870t) obj).f42969a;
        }
        int i11 = this.f42924c;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        if (z10 && (interfaceC7875v0 = (InterfaceC7875v0) this.f42940e.mo1474w(InterfaceC7875v0.b.f42976a)) != null && !interfaceC7875v0.mo15547b()) {
            CancellationException cancellationExceptionMo15617Q = interfaceC7875v0.mo15617Q();
            mo14440a(obj, cancellationExceptionMo15617Q);
            throw cancellationExceptionMo15617Q;
        }
        return mo15564g(obj);
    }

    @Override // no.InterfaceC7840j
    /* JADX INFO: renamed from: q */
    public final C7168r mo15581q(Object obj, Object obj2) {
        return m15586C(obj, obj2, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m15594r() {
        InterfaceC7838i0 interfaceC7838i0M15595s = m15595s();
        if (interfaceC7838i0M15595s != null && (!(this._state instanceof InterfaceC7830f1))) {
            interfaceC7838i0M15595s.mo14330a();
            this.f42941f = C7827e1.f42925a;
        }
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC7838i0 m15595s() {
        InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) this.f42940e.mo1474w(InterfaceC7875v0.b.f42976a);
        if (interfaceC7875v0 == null) {
            return null;
        }
        InterfaceC7838i0 interfaceC7838i0M15621a = InterfaceC7875v0.a.m15621a(interfaceC7875v0, true, new C7849m(this), 2);
        this.f42941f = interfaceC7838i0M15621a;
        return interfaceC7838i0M15621a;
    }

    @Override // no.InterfaceC7840j
    /* JADX INFO: renamed from: t */
    public final void mo15582t() {
        m15591n(this.f42924c);
    }

    @Override // no.InterfaceC7840j
    /* JADX INFO: renamed from: t0 */
    public final boolean mo15583t0(Throwable th2) {
        Object obj;
        boolean z10;
        boolean z11;
        do {
            obj = this._state;
            z10 = false;
            if (!(obj instanceof InterfaceC7830f1)) {
                return false;
            }
            z11 = obj instanceof AbstractC7834h;
            C7846l c7846l = new C7846l(this, th2, z11);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42938h;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c7846l)) {
                    z10 = true;
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        } while (!z10);
        AbstractC7834h abstractC7834h = z11 ? (AbstractC7834h) obj : null;
        if (abstractC7834h != null) {
            m15588k(abstractC7834h, th2);
        }
        if (!m15596u()) {
            m15590m();
        }
        m15591n(this.f42924c);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo15597w());
        sb2.append('(');
        sb2.append(C7814a0.m15552e(this.f42939d));
        sb2.append("){");
        Object obj = this._state;
        if (obj instanceof InterfaceC7830f1) {
            str = "Active";
        } else {
            str = obj instanceof C7846l ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(C7814a0.m15551c(this));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15596u() {
        return (this.f42924c == 2) && ((C7156f) this.f42939d).m14444k();
    }

    /* JADX INFO: renamed from: w */
    public String mo15597w() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: x */
    public final boolean m15598x() {
        Object obj = this._state;
        if ((obj instanceof C7867s) && ((C7867s) obj).f42963d != null) {
            m15590m();
            return false;
        }
        this._decision = 0;
        this._state = C7816b.f42917a;
        return true;
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: y */
    public final void mo2031y(Object obj) {
        Throwable thM13371a = Result.m13371a(obj);
        if (thM13371a != null) {
            obj = new C7870t(thM13371a, false);
        }
        m15599z(obj, this.f42924c, null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: z */
    public final void m15599z(Object obj, int i10, InterfaceC2052l<? super Throwable, C9072e> interfaceC2052l) {
        boolean z10;
        do {
            Object obj2 = this._state;
            z10 = false;
            if (!(obj2 instanceof InterfaceC7830f1)) {
                if (obj2 instanceof C7846l) {
                    C7846l c7846l = (C7846l) obj2;
                    c7846l.getClass();
                    if (C7846l.f42945c.compareAndSet(c7846l, 0, 1)) {
                        if (interfaceC2052l != null) {
                            m15589l(interfaceC2052l, c7846l.f42969a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objM15584B = m15584B((InterfaceC7830f1) obj2, obj, i10, interfaceC2052l, null);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42938h;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM15584B)) {
                    z10 = true;
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        } while (!z10);
        if (!m15596u()) {
            m15590m();
        }
        m15591n(i10);
    }
}
