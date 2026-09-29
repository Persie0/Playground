package kotlinx.coroutines.channels;

import ae.C0062b;
import androidx.activity.result.C0204c;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5206f;
import dm.C5212l;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.internal.C7158h;
import kotlinx.coroutines.internal.C7164n;
import kotlinx.coroutines.internal.C7167q;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.selects.C7189a;
import kotlinx.coroutines.selects.C7192d;
import kotlinx.coroutines.selects.InterfaceC7190b;
import kotlinx.coroutines.selects.InterfaceC7191c;
import no.AbstractC7819c;
import no.C7814a0;
import no.C7828f;
import no.C7843k;
import no.InterfaceC7838i0;
import no.InterfaceC7840j;
import p260m8.C7499b;
import p325po.AbstractC8425a;
import p325po.AbstractC8437m;
import p325po.AbstractC8441q;
import p325po.C8431g;
import p325po.C8432h;
import p325po.InterfaceC8428d;
import p325po.InterfaceC8430f;
import p325po.InterfaceC8439o;
import p338qd.C8573r0;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractChannel<E> extends AbstractC8425a<E> implements InterfaceC8428d<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.AbstractChannel$a */
    public static final class C7083a<E> implements InterfaceC8430f<E> {

        /* JADX INFO: renamed from: a */
        public final AbstractChannel<E> f40017a;

        /* JADX INFO: renamed from: b */
        public Object f40018b = C8573r0.f45958J;

        public C7083a(AbstractChannel<E> abstractChannel) {
            this.f40017a = abstractChannel;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p325po.InterfaceC8430f
        /* JADX INFO: renamed from: a */
        public final Object mo14348a(ContinuationImpl continuationImpl) throws Throwable {
            Object obj = this.f40018b;
            C7168r c7168r = C8573r0.f45958J;
            boolean z10 = false;
            if (obj != c7168r) {
                if (obj instanceof C8432h) {
                    C8432h c8432h = (C8432h) obj;
                    if (c8432h.f45569d != null) {
                        Throwable thM16490Q = c8432h.m16490Q();
                        int i10 = C7167q.f40441a;
                        throw thM16490Q;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            AbstractChannel<E> abstractChannel = this.f40017a;
            Object objMo14346y = abstractChannel.mo14346y();
            this.f40018b = objMo14346y;
            if (objMo14346y != c7168r) {
                if (objMo14346y instanceof C8432h) {
                    C8432h c8432h2 = (C8432h) objMo14346y;
                    if (c8432h2.f45569d != null) {
                        Throwable thM16490Q2 = c8432h2.m16490Q();
                        int i11 = C7167q.f40441a;
                        throw thM16490Q2;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            C7843k c7843kM15569c = C7828f.m15569c(C8656b.m16874A(continuationImpl));
            C7086d c7086d = new C7086d(this, c7843kM15569c);
            while (!abstractChannel.mo14340s(c7086d)) {
                Object objMo14346y2 = abstractChannel.mo14346y();
                this.f40018b = objMo14346y2;
                if (objMo14346y2 instanceof C8432h) {
                    C8432h c8432h3 = (C8432h) objMo14346y2;
                    if (c8432h3.f45569d == null) {
                        c7843kM15569c.mo2031y(Boolean.FALSE);
                    } else {
                        c7843kM15569c.mo2031y(C7499b.m14967u(c8432h3.m16490Q()));
                    }
                } else if (objMo14346y2 != c7168r) {
                    Boolean bool = Boolean.TRUE;
                    InterfaceC2052l<E, C9072e> interfaceC2052l = abstractChannel.f45552a;
                    c7843kM15569c.m15599z(bool, c7843kM15569c.f42924c, interfaceC2052l != null ? OnUndeliveredElementKt.m14431a(interfaceC2052l, objMo14346y2, c7843kM15569c.f42940e) : null);
                }
                Object objM15593p = c7843kM15569c.m15593p();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return objM15593p;
            }
            c7843kM15569c.mo15577R(abstractChannel.new C7088f(c7086d));
            Object objM15593p2 = c7843kM15569c.m15593p();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM15593p2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // p325po.InterfaceC8430f
        public final E next() throws Throwable {
            E e10 = (E) this.f40018b;
            if (e10 instanceof C8432h) {
                Throwable thM16490Q = ((C8432h) e10).m16490Q();
                int i10 = C7167q.f40441a;
                throw thM16490Q;
            }
            C7168r c7168r = C8573r0.f45958J;
            if (e10 == c7168r) {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            this.f40018b = c7168r;
            return e10;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.AbstractChannel$b */
    public static class C7084b<E> extends AbstractC8437m<E> {

        /* JADX INFO: renamed from: d */
        public final InterfaceC7840j<Object> f40019d;

        /* JADX INFO: renamed from: e */
        public final int f40020e;

        public C7084b(C7843k c7843k, int i10) {
            this.f40019d = c7843k;
            this.f40020e = i10;
        }

        @Override // p325po.AbstractC8437m
        /* JADX INFO: renamed from: L */
        public final void mo14349L(C8432h<?> c8432h) {
            int i10 = this.f40020e;
            InterfaceC7840j<Object> interfaceC7840j = this.f40019d;
            if (i10 == 1) {
                interfaceC7840j.mo2031y(new C8431g(new C8431g.a(c8432h.f45569d)));
            } else {
                interfaceC7840j.mo2031y(C7499b.m14967u(c8432h.m16490Q()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p325po.InterfaceC8439o
        /* JADX INFO: renamed from: c */
        public final C7168r mo14350c(Object obj) {
            if (this.f40019d.mo15580e0(this.f40020e == 1 ? new C8431g(obj) : obj, null, mo14352K(obj)) == null) {
                return null;
            }
            return C5212l.f33292k;
        }

        @Override // p325po.InterfaceC8439o
        /* JADX INFO: renamed from: p */
        public final void mo14351p(E e10) {
            this.f40019d.mo15582t();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReceiveElement@");
            sb2.append(C7814a0.m15551c(this));
            sb2.append("[receiveMode=");
            return C0204c.m853l(sb2, this.f40020e, ']');
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.AbstractChannel$c */
    public static final class C7085c<E> extends C7084b<E> {

        /* JADX INFO: renamed from: f */
        public final InterfaceC2052l<E, C9072e> f40021f;

        public C7085c(C7843k c7843k, int i10, InterfaceC2052l interfaceC2052l) {
            super(c7843k, i10);
            this.f40021f = interfaceC2052l;
        }

        @Override // p325po.AbstractC8437m
        /* JADX INFO: renamed from: K */
        public final InterfaceC2052l<Throwable, C9072e> mo14352K(E e10) {
            return OnUndeliveredElementKt.m14431a(this.f40021f, e10, this.f40019d.mo2029e());
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.AbstractChannel$d */
    public static class C7086d<E> extends AbstractC8437m<E> {

        /* JADX INFO: renamed from: d */
        public final C7083a<E> f40022d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC7840j<Boolean> f40023e;

        public C7086d(C7083a c7083a, C7843k c7843k) {
            this.f40022d = c7083a;
            this.f40023e = c7843k;
        }

        @Override // p325po.AbstractC8437m
        /* JADX INFO: renamed from: K */
        public final InterfaceC2052l<Throwable, C9072e> mo14352K(E e10) {
            InterfaceC2052l<E, C9072e> interfaceC2052l = this.f40022d.f40017a.f45552a;
            if (interfaceC2052l != null) {
                return OnUndeliveredElementKt.m14431a(interfaceC2052l, e10, this.f40023e.mo2029e());
            }
            return null;
        }

        @Override // p325po.AbstractC8437m
        /* JADX INFO: renamed from: L */
        public final void mo14349L(C8432h<?> c8432h) {
            Throwable th2 = c8432h.f45569d;
            InterfaceC7840j<Boolean> interfaceC7840j = this.f40023e;
            if ((th2 == null ? interfaceC7840j.mo15581q(Boolean.FALSE, null) : interfaceC7840j.mo15578X(c8432h.m16490Q())) != null) {
                this.f40022d.f40018b = c8432h;
                interfaceC7840j.mo15582t();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p325po.InterfaceC8439o
        /* JADX INFO: renamed from: c */
        public final C7168r mo14350c(Object obj) {
            if (this.f40023e.mo15580e0(Boolean.TRUE, null, mo14352K(obj)) == null) {
                return null;
            }
            return C5212l.f33292k;
        }

        @Override // p325po.InterfaceC8439o
        /* JADX INFO: renamed from: p */
        public final void mo14351p(E e10) {
            this.f40022d.f40018b = e10;
            this.f40023e.mo15582t();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            return "ReceiveHasNext@" + C7814a0.m15551c(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.AbstractChannel$e */
    public static final class C7087e<R, E> extends AbstractC8437m<E> implements InterfaceC7838i0 {

        /* JADX INFO: renamed from: d */
        public final AbstractChannel<E> f40024d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC7191c<R> f40025e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC2056p<Object, InterfaceC9968c<? super R>, Object> f40026f;

        /* JADX INFO: renamed from: g */
        public final int f40027g = 1;

        public C7087e(InterfaceC2056p interfaceC2056p, AbstractChannel abstractChannel, InterfaceC7191c interfaceC7191c) {
            this.f40024d = abstractChannel;
            this.f40025e = interfaceC7191c;
            this.f40026f = interfaceC2056p;
        }

        @Override // p325po.AbstractC8437m
        /* JADX INFO: renamed from: K */
        public final InterfaceC2052l<Throwable, C9072e> mo14352K(E e10) {
            InterfaceC2052l<E, C9072e> interfaceC2052l = this.f40024d.f45552a;
            if (interfaceC2052l != null) {
                return OnUndeliveredElementKt.m14431a(interfaceC2052l, e10, this.f40025e.mo14506o().mo2029e());
            }
            return null;
        }

        @Override // p325po.AbstractC8437m
        /* JADX INFO: renamed from: L */
        public final void mo14349L(C8432h<?> c8432h) {
            InterfaceC7191c<R> interfaceC7191c = this.f40025e;
            if (interfaceC7191c.mo14503i()) {
                int i10 = this.f40027g;
                if (i10 == 0) {
                    interfaceC7191c.mo14507r(c8432h.m16490Q());
                    return;
                }
                if (i10 != 1) {
                    return;
                }
                InterfaceC2056p<Object, InterfaceC9968c<? super R>, Object> interfaceC2056p = this.f40026f;
                C8431g c8431g = new C8431g(new C8431g.a(c8432h.f45569d));
                C7189a c7189aMo14506o = interfaceC7191c.mo14506o();
                try {
                    C0062b.m308S1(C8656b.m16874A(C8656b.m16908p(interfaceC2056p, c8431g, c7189aMo14506o)), C9072e.f47360a, null);
                } catch (Throwable th2) {
                    c7189aMo14506o.mo2031y(C7499b.m14967u(th2));
                    throw th2;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode, no.InterfaceC7838i0
        /* JADX INFO: renamed from: a */
        public final void mo14330a() {
            if (mo14408F()) {
                this.f40024d.getClass();
            }
        }

        @Override // p325po.InterfaceC8439o
        /* JADX INFO: renamed from: c */
        public final C7168r mo14350c(Object obj) {
            return (C7168r) this.f40025e.mo14502f();
        }

        @Override // p325po.InterfaceC8439o
        /* JADX INFO: renamed from: p */
        public final void mo14351p(E e10) {
            Object c8431g = this.f40027g == 1 ? new C8431g(e10) : e10;
            C7189a c7189aMo14506o = this.f40025e.mo14506o();
            try {
                C0062b.m308S1(C8656b.m16874A(C8656b.m16908p(this.f40026f, c8431g, c7189aMo14506o)), C9072e.f47360a, mo14352K(e10));
            } catch (Throwable th2) {
                c7189aMo14506o.mo2031y(C7499b.m14967u(th2));
                throw th2;
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReceiveSelect@");
            sb2.append(C7814a0.m15551c(this));
            sb2.append('[');
            sb2.append(this.f40025e);
            sb2.append(",receiveMode=");
            return C0204c.m853l(sb2, this.f40027g, ']');
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.AbstractChannel$f */
    public final class C7088f extends AbstractC7819c {

        /* JADX INFO: renamed from: a */
        public final AbstractC8437m<?> f40028a;

        public C7088f(AbstractC8437m<?> abstractC8437m) {
            this.f40028a = abstractC8437m;
        }

        @Override // no.AbstractC7837i
        /* JADX INFO: renamed from: a */
        public final void mo14353a(Throwable th2) {
            if (this.f40028a.mo14408F()) {
                AbstractChannel.this.getClass();
            }
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final /* bridge */ /* synthetic */ C9072e mo528n(Throwable th2) {
            mo14353a(th2);
            return C9072e.f47360a;
        }

        public final String toString() {
            return "RemoveReceiveOnCancel[" + this.f40028a + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.AbstractChannel$g */
    public static final class C7089g<E> extends LockFreeLinkedListNode.C7149d<AbstractC8441q> {
        public C7089g(C7158h c7158h) {
            super(c7158h);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.C7149d, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: c */
        public final Object mo14354c(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof C8432h) {
                return lockFreeLinkedListNode;
            }
            if (lockFreeLinkedListNode instanceof AbstractC8441q) {
                return null;
            }
            return C8573r0.f45958J;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: h */
        public final Object mo14355h(LockFreeLinkedListNode.C7148c c7148c) {
            C7168r c7168rMo16488O = ((AbstractC8441q) c7148c.f40396a).mo16488O(c7148c);
            if (c7168rMo16488O == null) {
                return C5206f.f33271f;
            }
            C7168r c7168r = C7499b.f41431f;
            if (c7168rMo16488O == c7168r) {
                return c7168r;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractC7146a
        /* JADX INFO: renamed from: i */
        public final void mo14356i(LockFreeLinkedListNode lockFreeLinkedListNode) {
            ((AbstractC8441q) lockFreeLinkedListNode).mo16492P();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.AbstractChannel$h */
    public static final class C7090h extends LockFreeLinkedListNode.AbstractC7147b {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractChannel f40030d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7090h(LockFreeLinkedListNode lockFreeLinkedListNode, AbstractChannel abstractChannel) {
            super(lockFreeLinkedListNode);
            this.f40030d = abstractChannel;
        }

        @Override // kotlinx.coroutines.internal.AbstractC7153c
        /* JADX INFO: renamed from: i */
        public final Object mo14357i(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f40030d.mo14342u()) {
                return null;
            }
            return C8573r0.f45973j;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.AbstractChannel$i */
    public static final class C7091i implements InterfaceC7190b<C8431g<? extends E>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractChannel<E> f40031a;

        public C7091i(AbstractChannel<E> abstractChannel) {
            this.f40031a = abstractChannel;
        }

        @Override // kotlinx.coroutines.selects.InterfaceC7190b
        /* JADX INFO: renamed from: i */
        public final <R> void mo14358i(InterfaceC7191c<? super R> interfaceC7191c, InterfaceC2056p<? super C8431g<? extends E>, ? super InterfaceC9968c<? super R>, ? extends Object> interfaceC2056p) {
            AbstractChannel<E> abstractChannel = this.f40031a;
            abstractChannel.getClass();
            while (!interfaceC7191c.mo14504k()) {
                if (!(abstractChannel.f45553b.m14416z() instanceof AbstractC8441q) && abstractChannel.mo14342u()) {
                    C7087e c7087e = new C7087e(interfaceC2056p, abstractChannel, interfaceC7191c);
                    boolean zMo14340s = abstractChannel.mo14340s(c7087e);
                    if (zMo14340s) {
                        interfaceC7191c.mo14508s(c7087e);
                    }
                    if (zMo14340s) {
                        return;
                    }
                } else {
                    Object objMo14347z = abstractChannel.mo14347z(interfaceC7191c);
                    if (objMo14347z == C7192d.f40506b) {
                        return;
                    }
                    if (objMo14347z != C8573r0.f45958J && objMo14347z != C7499b.f41431f) {
                        boolean z10 = objMo14347z instanceof C8432h;
                        if (!z10) {
                            if (z10) {
                                objMo14347z = new C8431g.a(((C8432h) objMo14347z).f45569d);
                            }
                            C0062b.m347f2(interfaceC2056p, new C8431g(objMo14347z), interfaceC7191c.mo14506o());
                        } else if (interfaceC7191c.mo14503i()) {
                            C0062b.m347f2(interfaceC2056p, new C8431g(new C8431g.a(((C8432h) objMo14347z).f45569d)), interfaceC7191c.mo14506o());
                        }
                    }
                }
            }
        }
    }

    public AbstractChannel(InterfaceC2052l<? super E, C9072e> interfaceC2052l) {
        super(interfaceC2052l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final Object m14333A(int i10, ContinuationImpl continuationImpl) {
        C7843k c7843kM15569c = C7828f.m15569c(C8656b.m16874A(continuationImpl));
        InterfaceC2052l<E, C9072e> interfaceC2052l = this.f45552a;
        C7084b c7084b = interfaceC2052l == null ? new C7084b(c7843kM15569c, i10) : new C7085c(c7843kM15569c, i10, interfaceC2052l);
        while (!mo14340s(c7084b)) {
            Object objMo14346y = mo14346y();
            if (objMo14346y instanceof C8432h) {
                c7084b.mo14349L((C8432h) objMo14346y);
            } else if (objMo14346y != C8573r0.f45958J) {
                c7843kM15569c.m15599z(c7084b.f40020e == 1 ? new C8431g(objMo14346y) : objMo14346y, c7843kM15569c.f42924c, c7084b.mo14352K(objMo14346y));
            }
            Object objM15593p = c7843kM15569c.m15593p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM15593p;
        }
        c7843kM15569c.mo15577R(new C7088f(c7084b));
        Object objM15593p2 = c7843kM15569c.m15593p();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM15593p2;
    }

    @Override // p325po.InterfaceC8438n
    /* JADX INFO: renamed from: a */
    public final void mo14334a(CancellationException cancellationException) {
        if (mo14343v()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(getClass().getSimpleName().concat(" was cancelled"));
        }
        mo14344w(mo16477h(cancellationException));
    }

    @Override // p325po.InterfaceC8438n
    /* JADX INFO: renamed from: c */
    public final InterfaceC7190b<C8431g<E>> mo14335c() {
        return new C7091i(this);
    }

    @Override // p325po.InterfaceC8438n
    /* JADX INFO: renamed from: f */
    public final Object mo14336f() {
        Object objMo14346y = mo14346y();
        if (objMo14346y == C8573r0.f45958J) {
            return C8431g.f45566b;
        }
        return objMo14346y instanceof C8432h ? new C8431g.a(((C8432h) objMo14346y).f45569d) : objMo14346y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p325po.InterfaceC8438n
    /* JADX INFO: renamed from: g */
    public final Object mo14337g(InterfaceC9968c<? super C8431g<? extends E>> interfaceC9968c) throws Throwable {
        AbstractChannel$receiveCatching$1 abstractChannel$receiveCatching$1;
        if (interfaceC9968c instanceof AbstractChannel$receiveCatching$1) {
            abstractChannel$receiveCatching$1 = (AbstractChannel$receiveCatching$1) interfaceC9968c;
            int i10 = abstractChannel$receiveCatching$1.f40034f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                abstractChannel$receiveCatching$1.f40034f = i10 - Integer.MIN_VALUE;
            } else {
                abstractChannel$receiveCatching$1 = new AbstractChannel$receiveCatching$1(this, interfaceC9968c);
            }
        } else {
            abstractChannel$receiveCatching$1 = new AbstractChannel$receiveCatching$1(this, interfaceC9968c);
        }
        Object objM14333A = abstractChannel$receiveCatching$1.f40032d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = abstractChannel$receiveCatching$1.f40034f;
        if (i11 == 0) {
            C7499b.m14977z0(objM14333A);
            Object objMo14346y = mo14346y();
            if (objMo14346y != C8573r0.f45958J) {
                if (objMo14346y instanceof C8432h) {
                    objMo14346y = new C8431g.a(((C8432h) objMo14346y).f45569d);
                }
                return objMo14346y;
            }
            abstractChannel$receiveCatching$1.f40034f = 1;
            objM14333A = m14333A(1, abstractChannel$receiveCatching$1);
            if (objM14333A == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(objM14333A);
        }
        return ((C8431g) objM14333A).f45567a;
    }

    @Override // p325po.InterfaceC8438n
    public final InterfaceC8430f<E> iterator() {
        return new C7083a(this);
    }

    @Override // p325po.InterfaceC8438n
    /* JADX INFO: renamed from: m */
    public final Object mo14338m(SuspendLambda suspendLambda) {
        Object objMo14346y = mo14346y();
        return (objMo14346y == C8573r0.f45958J || (objMo14346y instanceof C8432h)) ? m14333A(0, suspendLambda) : objMo14346y;
    }

    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: q */
    public final InterfaceC8439o<E> mo14339q() {
        InterfaceC8439o<E> interfaceC8439oMo14339q = super.mo14339q();
        if (interfaceC8439oMo14339q != null) {
            boolean z10 = interfaceC8439oMo14339q instanceof C8432h;
        }
        return interfaceC8439oMo14339q;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo14340s(AbstractC8437m<? super E> abstractC8437m) {
        int iM14411I;
        LockFreeLinkedListNode lockFreeLinkedListNodeM14405B;
        boolean zMo14341t = mo14341t();
        C7158h c7158h = this.f45553b;
        if (!zMo14341t) {
            C7090h c7090h = new C7090h(abstractC8437m, this);
            do {
                LockFreeLinkedListNode lockFreeLinkedListNodeM14405B2 = c7158h.m14405B();
                if (!(!(lockFreeLinkedListNodeM14405B2 instanceof AbstractC8441q))) {
                    break;
                }
                iM14411I = lockFreeLinkedListNodeM14405B2.m14411I(abstractC8437m, c7158h, c7090h);
                if (iM14411I == 1) {
                    return true;
                }
            } while (iM14411I != 2);
        } else {
            do {
                lockFreeLinkedListNodeM14405B = c7158h.m14405B();
                if (!(!(lockFreeLinkedListNodeM14405B instanceof AbstractC8441q))) {
                }
            } while (!lockFreeLinkedListNodeM14405B.m14412u(abstractC8437m, c7158h));
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public abstract boolean mo14341t();

    /* JADX INFO: renamed from: u */
    public abstract boolean mo14342u();

    /* JADX INFO: renamed from: v */
    public boolean mo14343v() {
        LockFreeLinkedListNode lockFreeLinkedListNodeM14416z = this.f45553b.m14416z();
        C8432h c8432h = null;
        C8432h c8432h2 = lockFreeLinkedListNodeM14416z instanceof C8432h ? (C8432h) lockFreeLinkedListNodeM14416z : null;
        if (c8432h2 != null) {
            AbstractC8425a.m16474l(c8432h2);
            c8432h = c8432h2;
        }
        return c8432h != null && mo14342u();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public void mo14344w(boolean z10) {
        C8432h<?> c8432hM16478i = m16478i();
        if (c8432hM16478i == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object objM16692P0 = null;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeM14405B = c8432hM16478i.m14405B();
            if (lockFreeLinkedListNodeM14405B instanceof C7158h) {
                mo14345x(objM16692P0, c8432hM16478i);
                return;
            } else if (lockFreeLinkedListNodeM14405B.mo14408F()) {
                objM16692P0 = C8573r0.m16692P0(objM16692P0, (AbstractC8441q) lockFreeLinkedListNodeM14405B);
            } else {
                ((C7164n) lockFreeLinkedListNodeM14405B.m14415x()).f40439a.m14406C();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void mo14345x(Object obj, C8432h<?> c8432h) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((AbstractC8441q) obj).mo16487N(c8432h);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((AbstractC8441q) arrayList.get(size)).mo16487N(c8432h);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public Object mo14346y() {
        while (true) {
            AbstractC8441q abstractC8441qM16484r = m16484r();
            if (abstractC8441qM16484r == null) {
                return C8573r0.f45958J;
            }
            if (abstractC8441qM16484r.mo16488O(null) != null) {
                abstractC8441qM16484r.mo16485K();
                return abstractC8441qM16484r.mo16486L();
            }
            abstractC8441qM16484r.mo16492P();
        }
    }

    /* JADX INFO: renamed from: z */
    public Object mo14347z(InterfaceC7191c<?> interfaceC7191c) {
        C7089g c7089g = new C7089g(this.f45553b);
        Object objMo14505m = interfaceC7191c.mo14505m(c7089g);
        if (objMo14505m != null) {
            return objMo14505m;
        }
        ((AbstractC8441q) c7089g.m14430m()).mo16485K();
        return ((AbstractC8441q) c7089g.m14430m()).mo16486L();
    }
}
