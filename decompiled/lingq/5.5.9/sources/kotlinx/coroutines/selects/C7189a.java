package kotlinx.coroutines.selects;

import ae.C0062b;
import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5212l;
import dm.C5213m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.internal.AbstractC7152b;
import kotlinx.coroutines.internal.AbstractC7153c;
import kotlinx.coroutines.internal.AbstractC7163m;
import kotlinx.coroutines.internal.C7158h;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import no.AbstractC7877w0;
import no.C7828f;
import no.C7870t;
import no.InterfaceC7838i0;
import no.InterfaceC7875v0;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10223b;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7189a<R> extends C7158h implements InterfaceC7191c<R>, InterfaceC9968c<R>, InterfaceC10223b {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40495e = AtomicReferenceFieldUpdater.newUpdater(C7189a.class, Object.class, "_state");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40496f = AtomicReferenceFieldUpdater.newUpdater(C7189a.class, Object.class, "_result");

    /* JADX INFO: renamed from: d */
    public final InterfaceC9968c<R> f40497d;
    volatile /* synthetic */ Object _state = C7192d.f40505a;
    private volatile /* synthetic */ Object _result = C7192d.f40507c;
    private volatile /* synthetic */ Object _parentHandle = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.a$a */
    public static final class a extends AbstractC7153c<Object> {

        /* JADX INFO: renamed from: b */
        public final C7189a<?> f40498b;

        /* JADX INFO: renamed from: c */
        public final AbstractC7152b f40499c;

        /* JADX INFO: renamed from: d */
        public final long f40500d;

        public a(C7189a c7189a, AbstractChannel.C7089g c7089g) {
            this.f40498b = c7189a;
            this.f40499c = c7089g;
            C7193e c7193e = C7192d.f40509e;
            c7193e.getClass();
            this.f40500d = C7193e.f40510a.incrementAndGet(c7193e);
            c7089g.f40415a = this;
        }

        @Override // kotlinx.coroutines.internal.AbstractC7153c
        /* JADX INFO: renamed from: d */
        public final void mo14426d(Object obj, Object obj2) {
            C7189a<?> c7189a;
            boolean z10 = true;
            boolean z11 = obj2 == null;
            C7168r c7168r = z11 ? null : C7192d.f40505a;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7189a.f40495e;
            while (true) {
                c7189a = this.f40498b;
                if (atomicReferenceFieldUpdater.compareAndSet(c7189a, this, c7168r)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(c7189a) != this) {
                    z10 = false;
                    break;
                }
            }
            if (z10 && z11) {
                c7189a.m14499K();
            }
            this.f40499c.mo14417a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.AbstractC7153c
        /* JADX INFO: renamed from: g */
        public final long mo14438g() {
            return this.f40500d;
        }

        @Override // kotlinx.coroutines.internal.AbstractC7153c
        /* JADX INFO: renamed from: i */
        public final Object mo14357i(Object obj) {
            C7189a<?> c7189a;
            C7168r c7168r;
            boolean z10;
            if (obj == null) {
                C7189a<?> c7189a2 = this.f40498b;
                loop0: while (true) {
                    while (true) {
                        Object obj2 = c7189a2._state;
                        if (obj2 != this) {
                            if (!(obj2 instanceof AbstractC7163m)) {
                                C7168r c7168r2 = C7192d.f40505a;
                                if (obj2 != c7168r2) {
                                    c7168r = C7192d.f40506b;
                                    break;
                                }
                                C7189a<?> c7189a3 = this.f40498b;
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7189a.f40495e;
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(c7189a3, c7168r2, this)) {
                                        z10 = true;
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater.get(c7189a3) != c7168r2) {
                                        z10 = false;
                                        break;
                                    }
                                }
                                if (z10) {
                                }
                            } else {
                                ((AbstractC7163m) obj2).mo14428c(this.f40498b);
                            }
                        }
                        c7168r = null;
                        break loop0;
                    }
                }
                if (c7168r != null) {
                    return c7168r;
                }
            }
            try {
                return this.f40499c.mo14418b(this);
            } catch (Throwable th2) {
                if (obj == null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C7189a.f40495e;
                    C7168r c7168r3 = C7192d.f40505a;
                    do {
                        c7189a = this.f40498b;
                        if (atomicReferenceFieldUpdater2.compareAndSet(c7189a, this, c7168r3)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater2.get(c7189a) == this);
                }
                throw th2;
            }
        }

        @Override // kotlinx.coroutines.internal.AbstractC7163m
        public final String toString() {
            return "AtomicSelectOp(sequence=" + this.f40500d + ')';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.a$b */
    public static final class b extends LockFreeLinkedListNode {

        /* JADX INFO: renamed from: d */
        public final InterfaceC7838i0 f40501d;

        public b(InterfaceC7838i0 interfaceC7838i0) {
            this.f40501d = interfaceC7838i0;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.a$c */
    public final class c extends AbstractC7877w0 {
        public c() {
        }

        @Override // no.AbstractC7874v
        /* JADX INFO: renamed from: K */
        public final void mo14509K(Throwable th2) {
            C7189a<R> c7189a = C7189a.this;
            if (c7189a.mo14503i()) {
                c7189a.mo14507r(m15626L().mo15617Q());
            }
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final /* bridge */ /* synthetic */ C9072e mo528n(Throwable th2) {
            mo14509K(th2);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.a$d */
    public static final class d implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC2052l f40504b;

        public d(InterfaceC2052l interfaceC2052l) {
            this.f40504b = interfaceC2052l;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7189a c7189a = C7189a.this;
            if (c7189a.mo14503i()) {
                try {
                    C0062b.m308S1(C8656b.m16874A(C8656b.m16907o(this.f40504b, c7189a)), C9072e.f47360a, null);
                } catch (Throwable th2) {
                    c7189a.mo2031y(C7499b.m14967u(th2));
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7189a(InterfaceC9968c<? super R> interfaceC9968c) {
        this.f40497d = interfaceC9968c;
    }

    /* JADX INFO: renamed from: K */
    public final void m14499K() {
        InterfaceC7838i0 interfaceC7838i0 = (InterfaceC7838i0) this._parentHandle;
        if (interfaceC7838i0 != null) {
            interfaceC7838i0.mo14330a();
        }
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM14416z = (LockFreeLinkedListNode) m14415x(); !C5207g.m11106a(lockFreeLinkedListNodeM14416z, this); lockFreeLinkedListNodeM14416z = lockFreeLinkedListNodeM14416z.m14416z()) {
            if (lockFreeLinkedListNodeM14416z instanceof b) {
                ((b) lockFreeLinkedListNodeM14416z).f40501d.mo14330a();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: L */
    public final Object m14500L() throws Throwable {
        InterfaceC7875v0 interfaceC7875v0;
        boolean z10 = true;
        if (!mo14504k() && (interfaceC7875v0 = (InterfaceC7875v0) mo2029e().mo1474w(InterfaceC7875v0.b.f42976a)) != null) {
            InterfaceC7838i0 interfaceC7838i0M15621a = InterfaceC7875v0.a.m15621a(interfaceC7875v0, true, new c(), 2);
            this._parentHandle = interfaceC7838i0M15621a;
            if (mo14504k()) {
                interfaceC7838i0M15621a.mo14330a();
            }
        }
        Object obj = this._result;
        C7168r c7168r = C7192d.f40507c;
        if (obj == c7168r) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40496f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c7168r, coroutineSingletons)) {
                if (atomicReferenceFieldUpdater.get(this) != c7168r) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            }
            obj = this._result;
        }
        if (obj == C7192d.f40508d) {
            throw new IllegalStateException("Already resumed");
        }
        if (obj instanceof C7870t) {
            throw ((C7870t) obj).f42969a;
        }
        return obj;
    }

    /* JADX INFO: renamed from: N */
    public final void m14501N(long j10, InterfaceC2052l<? super InterfaceC9968c<? super R>, ? extends Object> interfaceC2052l) {
        if (j10 > 0) {
            mo14508s(C7828f.m15568b(mo2029e()).mo14318G0(j10, new d(interfaceC2052l), mo2029e()));
        } else if (mo14503i()) {
            try {
                C5213m.m11200e(1, interfaceC2052l);
                Object objMo528n = interfaceC2052l.mo528n(this);
                if (objMo528n != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    mo2031y(objMo528n);
                }
            } catch (Throwable th2) {
                mo2031y(C7499b.m14967u(th2));
            }
        }
    }

    @Override // p490xl.InterfaceC10223b
    /* JADX INFO: renamed from: d */
    public final InterfaceC10223b mo13473d() {
        InterfaceC9968c<R> interfaceC9968c = this.f40497d;
        if (interfaceC9968c instanceof InterfaceC10223b) {
            return (InterfaceC10223b) interfaceC9968c;
        }
        return null;
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public final CoroutineContext mo2029e() {
        return this.f40497d.mo2029e();
    }

    @Override // kotlinx.coroutines.selects.InterfaceC7191c
    /* JADX INFO: renamed from: f */
    public final Object mo14502f() {
        boolean z10;
        while (true) {
            Object obj = this._state;
            C7168r c7168r = C7192d.f40505a;
            C7168r c7168r2 = C5212l.f33292k;
            if (obj == c7168r) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40495e;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c7168r, null)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != c7168r) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    m14499K();
                    return c7168r2;
                }
            } else {
                if (!(obj instanceof AbstractC7163m)) {
                    return null;
                }
                ((AbstractC7163m) obj).mo14428c(this);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.selects.InterfaceC7191c
    /* JADX INFO: renamed from: i */
    public final boolean mo14503i() {
        Object objMo14502f = mo14502f();
        if (objMo14502f == C5212l.f33292k) {
            return true;
        }
        if (objMo14502f == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + objMo14502f).toString());
    }

    @Override // kotlinx.coroutines.selects.InterfaceC7191c
    /* JADX INFO: renamed from: k */
    public final boolean mo14504k() {
        while (true) {
            Object obj = this._state;
            if (obj == C7192d.f40505a) {
                return false;
            }
            if (!(obj instanceof AbstractC7163m)) {
                return true;
            }
            ((AbstractC7163m) obj).mo14428c(this);
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC7191c
    /* JADX INFO: renamed from: m */
    public final Object mo14505m(AbstractChannel.C7089g c7089g) {
        return new a(this, c7089g).mo14428c(null);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC7191c
    /* JADX INFO: renamed from: o */
    public final C7189a mo14506o() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC7191c
    /* JADX INFO: renamed from: r */
    public final void mo14507r(Throwable th2) {
        while (true) {
            Object obj = this._result;
            C7168r c7168r = C7192d.f40507c;
            boolean z10 = false;
            if (obj == c7168r) {
                C7870t c7870t = new C7870t(th2, false);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40496f;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c7168r, c7870t)) {
                        z10 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == c7168r);
                if (z10) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj != coroutineSingletons) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40496f;
                C7168r c7168r2 = C7192d.f40508d;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons, c7168r2)) {
                        z10 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == coroutineSingletons);
                if (z10) {
                    C8656b.m16874A(this.f40497d).mo2031y(C7499b.m14967u(th2));
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC7191c
    /* JADX INFO: renamed from: s */
    public final void mo14508s(InterfaceC7838i0 interfaceC7838i0) {
        b bVar = new b(interfaceC7838i0);
        if (!mo14504k()) {
            while (!m14405B().m14412u(bVar, this)) {
            }
            if (!mo14504k()) {
                return;
            }
        }
        interfaceC7838i0.mo14330a();
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: y */
    public final void mo2031y(Object obj) {
        while (true) {
            Object obj2 = this._result;
            C7168r c7168r = C7192d.f40507c;
            boolean z10 = false;
            if (obj2 == c7168r) {
                Throwable thM13371a = Result.m13371a(obj);
                Object c7870t = thM13371a == null ? obj : new C7870t(thM13371a, false);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40496f;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c7168r, c7870t)) {
                        z10 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == c7168r);
                if (z10) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != coroutineSingletons) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40496f;
                C7168r c7168r2 = C7192d.f40508d;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons, c7168r2)) {
                        z10 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == coroutineSingletons);
                if (z10) {
                    if (!(obj instanceof Result.Failure)) {
                        this.f40497d.mo2031y(obj);
                        return;
                    }
                    InterfaceC9968c<R> interfaceC9968c = this.f40497d;
                    Throwable thM13371a2 = Result.m13371a(obj);
                    C5207g.m11108c(thM13371a2);
                    interfaceC9968c.mo2031y(C7499b.m14967u(thM13371a2));
                    return;
                }
            }
        }
    }
}
