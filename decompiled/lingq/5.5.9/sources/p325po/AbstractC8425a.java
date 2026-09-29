package p325po;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5212l;
import dm.C5213m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.C7158h;
import kotlinx.coroutines.internal.C7164n;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import no.C7814a0;
import no.C7828f;
import no.C7836h1;
import no.C7843k;
import p003a2.C0009a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: po.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8425a<E> implements InterfaceC8442r<E> {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45551c = AtomicReferenceFieldUpdater.newUpdater(AbstractC8425a.class, Object.class, "onCloseHandler");

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<E, C9072e> f45552a;

    /* JADX INFO: renamed from: b */
    public final C7158h f45553b = new C7158h();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* JADX INFO: renamed from: po.a$a */
    public static final class a<E> extends AbstractC8441q {

        /* JADX INFO: renamed from: d */
        public final E f45554d;

        public a(E e10) {
            this.f45554d = e10;
        }

        @Override // p325po.AbstractC8441q
        /* JADX INFO: renamed from: K */
        public final void mo16485K() {
        }

        @Override // p325po.AbstractC8441q
        /* JADX INFO: renamed from: L */
        public final Object mo16486L() {
            return this.f45554d;
        }

        @Override // p325po.AbstractC8441q
        /* JADX INFO: renamed from: N */
        public final void mo16487N(C8432h<?> c8432h) {
        }

        @Override // p325po.AbstractC8441q
        /* JADX INFO: renamed from: O */
        public final C7168r mo16488O(LockFreeLinkedListNode.C7148c c7148c) {
            C7168r c7168r = C5212l.f33292k;
            if (c7148c != null) {
                c7148c.m14429d();
            }
            return c7168r;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public final String toString() {
            return "SendBuffered@" + C7814a0.m15551c(this) + '(' + this.f45554d + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC8425a(InterfaceC2052l<? super E, C9072e> interfaceC2052l) {
        this.f45552a = interfaceC2052l;
    }

    /* JADX INFO: renamed from: b */
    public static final void m16473b(AbstractC8425a abstractC8425a, C7843k c7843k, Object obj, C8432h c8432h) {
        UndeliveredElementException undeliveredElementExceptionM14432b;
        abstractC8425a.getClass();
        m16474l(c8432h);
        Throwable closedSendChannelException = c8432h.f45569d;
        if (closedSendChannelException == null) {
            closedSendChannelException = new ClosedSendChannelException("Channel was closed");
        }
        InterfaceC2052l<E, C9072e> interfaceC2052l = abstractC8425a.f45552a;
        if (interfaceC2052l == null || (undeliveredElementExceptionM14432b = OnUndeliveredElementKt.m14432b(interfaceC2052l, obj, null)) == null) {
            c7843k.mo2031y(C7499b.m14967u(closedSendChannelException));
        } else {
            C8656b.m16899g(undeliveredElementExceptionM14432b, closedSendChannelException);
            c7843k.mo2031y(C7499b.m14967u(undeliveredElementExceptionM14432b));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m16474l(C8432h c8432h) {
        Object objM16692P0 = null;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeM14405B = c8432h.m14405B();
            AbstractC8437m abstractC8437m = lockFreeLinkedListNodeM14405B instanceof AbstractC8437m ? (AbstractC8437m) lockFreeLinkedListNodeM14405B : null;
            if (abstractC8437m == null) {
                break;
            } else if (abstractC8437m.mo14408F()) {
                objM16692P0 = C8573r0.m16692P0(objM16692P0, abstractC8437m);
            } else {
                ((C7164n) abstractC8437m.m14415x()).f40439a.m14406C();
            }
        }
        if (objM16692P0 != null) {
            if (!(objM16692P0 instanceof ArrayList)) {
                ((AbstractC8437m) objM16692P0).mo14349L(c8432h);
                return;
            }
            ArrayList arrayList = (ArrayList) objM16692P0;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((AbstractC8437m) arrayList.get(size)).mo14349L(c8432h);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public Object mo16475d(C8443s c8443s) {
        boolean z10;
        LockFreeLinkedListNode lockFreeLinkedListNodeM14405B;
        boolean zMo16481n = mo16481n();
        C7158h c7158h = this.f45553b;
        if (zMo16481n) {
            do {
                lockFreeLinkedListNodeM14405B = c7158h.m14405B();
                if (lockFreeLinkedListNodeM14405B instanceof InterfaceC8439o) {
                    return lockFreeLinkedListNodeM14405B;
                }
            } while (!lockFreeLinkedListNodeM14405B.m14412u(c8443s, c7158h));
            return null;
        }
        C8426b c8426b = new C8426b(c8443s, this);
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeM14405B2 = c7158h.m14405B();
            if (!(lockFreeLinkedListNodeM14405B2 instanceof InterfaceC8439o)) {
                int iM14411I = lockFreeLinkedListNodeM14405B2.m14411I(c8443s, c7158h, c8426b);
                z10 = true;
                if (iM14411I != 1) {
                    if (iM14411I == 2) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return lockFreeLinkedListNodeM14405B2;
            }
        }
        if (z10) {
            return null;
        }
        return C8573r0.f45959K;
    }

    /* JADX INFO: renamed from: e */
    public String mo16476e() {
        return "";
    }

    @Override // p325po.InterfaceC8442r
    /* JADX INFO: renamed from: h */
    public final boolean mo16477h(Throwable th2) {
        boolean z10;
        boolean z11;
        Object obj;
        C7168r c7168r;
        C8432h c8432h = new C8432h(th2);
        C7158h c7158h = this.f45553b;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeM14405B = c7158h.m14405B();
            z10 = false;
            if (!(!(lockFreeLinkedListNodeM14405B instanceof C8432h))) {
                z11 = false;
                break;
            }
            if (lockFreeLinkedListNodeM14405B.m14412u(c8432h, c7158h)) {
                z11 = true;
                break;
            }
        }
        if (!z11) {
            c8432h = (C8432h) this.f45553b.m14405B();
        }
        m16474l(c8432h);
        if (z11 && (obj = this.onCloseHandler) != null && obj != (c7168r = C8573r0.f45960L)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45551c;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c7168r)) {
                    z10 = true;
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            if (z10) {
                C5213m.m11200e(1, obj);
                ((InterfaceC2052l) obj).mo528n(th2);
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: i */
    public final C8432h<?> m16478i() {
        LockFreeLinkedListNode lockFreeLinkedListNodeM14405B = this.f45553b.m14405B();
        C8432h<?> c8432h = lockFreeLinkedListNodeM14405B instanceof C8432h ? (C8432h) lockFreeLinkedListNodeM14405B : null;
        if (c8432h == null) {
            return null;
        }
        m16474l(c8432h);
        return c8432h;
    }

    @Override // p325po.InterfaceC8442r
    /* JADX INFO: renamed from: j */
    public final Object mo16479j(E e10) {
        C8431g.a aVar;
        Object objMo16483p = mo16483p(e10);
        if (objMo16483p == C8573r0.f45956H) {
            return C9072e.f47360a;
        }
        if (objMo16483p == C8573r0.f45957I) {
            C8432h<?> c8432hM16478i = m16478i();
            if (c8432hM16478i == null) {
                return C8431g.f45566b;
            }
            m16474l(c8432hM16478i);
            Throwable closedSendChannelException = c8432hM16478i.f45569d;
            if (closedSendChannelException == null) {
                closedSendChannelException = new ClosedSendChannelException("Channel was closed");
            }
            aVar = new C8431g.a(closedSendChannelException);
        } else {
            if (!(objMo16483p instanceof C8432h)) {
                throw new IllegalStateException(("trySend returned " + objMo16483p).toString());
            }
            C8432h c8432h = (C8432h) objMo16483p;
            m16474l(c8432h);
            Throwable closedSendChannelException2 = c8432h.f45569d;
            if (closedSendChannelException2 == null) {
                closedSendChannelException2 = new ClosedSendChannelException("Channel was closed");
            }
            aVar = new C8431g.a(closedSendChannelException2);
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[EDGE_INSN: B:38:0x00a2->B:39:0x00a9 BREAK  A[LOOP:0: B:7:0x0013->B:55:?]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:0: B:7:0x0013->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00be, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p325po.InterfaceC8442r
    /* JADX INFO: renamed from: k */
    public final Object mo16480k(E e10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo16483p;
        Object objMo16483p2 = mo16483p(e10);
        C7168r c7168r = C8573r0.f45956H;
        if (objMo16483p2 == c7168r) {
            return C9072e.f47360a;
        }
        C7843k c7843kM15569c = C7828f.m15569c(C8656b.m16874A(interfaceC9968c));
        while (true) {
            if (!(this.f45553b.m14416z() instanceof InterfaceC8439o) && mo16482o()) {
                InterfaceC2052l<E, C9072e> interfaceC2052l = this.f45552a;
                C8443s c8443s = interfaceC2052l == null ? new C8443s(e10, c7843kM15569c) : new C8444t(e10, c7843kM15569c, interfaceC2052l);
                Object objMo16475d = mo16475d(c8443s);
                if (objMo16475d == null) {
                    c7843kM15569c.mo15577R(new C7836h1(c8443s));
                    break;
                }
                if (objMo16475d instanceof C8432h) {
                    m16473b(this, c7843kM15569c, e10, (C8432h) objMo16475d);
                    break;
                }
                if (objMo16475d != C8573r0.f45959K && !(objMo16475d instanceof AbstractC8437m)) {
                    throw new IllegalStateException(("enqueueSend returned " + objMo16475d).toString());
                }
                objMo16483p = mo16483p(e10);
                if (objMo16483p == c7168r) {
                    c7843kM15569c.mo2031y(C9072e.f47360a);
                    break;
                }
                if (objMo16483p != C8573r0.f45957I) {
                    if (objMo16483p instanceof C8432h) {
                        m16473b(this, c7843kM15569c, e10, (C8432h) objMo16483p);
                        break;
                    }
                    throw new IllegalStateException(("offerInternal returned " + objMo16483p).toString());
                }
            } else {
                objMo16483p = mo16483p(e10);
                if (objMo16483p == c7168r) {
                    c7843kM15569c.mo2031y(C9072e.f47360a);
                    break;
                }
                if (objMo16483p != C8573r0.f45957I) {
                    if (objMo16483p instanceof C8432h) {
                        m16473b(this, c7843kM15569c, e10, (C8432h) objMo16483p);
                        break;
                    }
                    throw new IllegalStateException(("offerInternal returned " + objMo16483p).toString());
                }
            }
        }
        Object objM15593p = c7843kM15569c.m15593p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM15593p != coroutineSingletons) {
            objM15593p = C9072e.f47360a;
        }
        return objM15593p == coroutineSingletons ? objM15593p : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo16481n();

    /* JADX INFO: renamed from: o */
    public abstract boolean mo16482o();

    /* JADX INFO: renamed from: p */
    public Object mo16483p(E e10) {
        InterfaceC8439o<E> interfaceC8439oMo14339q;
        do {
            interfaceC8439oMo14339q = mo14339q();
            if (interfaceC8439oMo14339q == null) {
                return C8573r0.f45957I;
            }
        } while (interfaceC8439oMo14339q.mo14350c(e10) == null);
        interfaceC8439oMo14339q.mo14351p(e10);
        return interfaceC8439oMo14339q.mo16491g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.LockFreeLinkedListNode] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX INFO: renamed from: q */
    public InterfaceC8439o<E> mo14339q() {
        ?? r10;
        LockFreeLinkedListNode lockFreeLinkedListNodeM14409G;
        C7158h c7158h = this.f45553b;
        while (true) {
            r10 = (LockFreeLinkedListNode) c7158h.m14415x();
            if (r10 != c7158h && (r10 instanceof InterfaceC8439o)) {
                if ((!(((InterfaceC8439o) r10) instanceof C8432h) || r10.mo14407D()) && (lockFreeLinkedListNodeM14409G = r10.m14409G()) != null) {
                    lockFreeLinkedListNodeM14409G.m14406C();
                }
            }
            return (InterfaceC8439o) r10;
        }
        r10 = 0;
        return (InterfaceC8439o) r10;
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC8441q m16484r() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode lockFreeLinkedListNodeM14409G;
        C7158h c7158h = this.f45553b;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) c7158h.m14415x();
            if (lockFreeLinkedListNode == c7158h || !(lockFreeLinkedListNode instanceof AbstractC8441q)) {
                lockFreeLinkedListNode = null;
                break;
            }
            if (((((AbstractC8441q) lockFreeLinkedListNode) instanceof C8432h) && !lockFreeLinkedListNode.mo14407D()) || (lockFreeLinkedListNodeM14409G = lockFreeLinkedListNode.m14409G()) == null) {
                break;
                break;
            }
            lockFreeLinkedListNodeM14409G.m14406C();
        }
        return (AbstractC8441q) lockFreeLinkedListNode;
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('@');
        sb2.append(C7814a0.m15551c(this));
        sb2.append('{');
        LockFreeLinkedListNode lockFreeLinkedListNode = this.f45553b;
        LockFreeLinkedListNode lockFreeLinkedListNodeM14416z = lockFreeLinkedListNode.m14416z();
        if (lockFreeLinkedListNodeM14416z == lockFreeLinkedListNode) {
            string2 = "EmptyQueue";
        } else {
            if (lockFreeLinkedListNodeM14416z instanceof C8432h) {
                string = lockFreeLinkedListNodeM14416z.toString();
            } else if (lockFreeLinkedListNodeM14416z instanceof AbstractC8437m) {
                string = "ReceiveQueued";
            } else if (lockFreeLinkedListNodeM14416z instanceof AbstractC8441q) {
                string = "SendQueued";
            } else {
                string = "UNEXPECTED:" + lockFreeLinkedListNodeM14416z;
            }
            LockFreeLinkedListNode lockFreeLinkedListNodeM14405B = lockFreeLinkedListNode.m14405B();
            if (lockFreeLinkedListNodeM14405B != lockFreeLinkedListNodeM14416z) {
                StringBuilder sbM26o = C0009a.m26o(string, ",queueSize=");
                int i10 = 0;
                for (LockFreeLinkedListNode lockFreeLinkedListNodeM14416z2 = (LockFreeLinkedListNode) lockFreeLinkedListNode.m14415x(); !C5207g.m11106a(lockFreeLinkedListNodeM14416z2, lockFreeLinkedListNode); lockFreeLinkedListNodeM14416z2 = lockFreeLinkedListNodeM14416z2.m14416z()) {
                    if (lockFreeLinkedListNodeM14416z2 instanceof LockFreeLinkedListNode) {
                        i10++;
                    }
                }
                sbM26o.append(i10);
                string2 = sbM26o.toString();
                if (lockFreeLinkedListNodeM14405B instanceof C8432h) {
                    string2 = string2 + ",closedForSend=" + lockFreeLinkedListNodeM14405B;
                }
            } else {
                string2 = string;
            }
        }
        sb2.append(string2);
        sb2.append('}');
        sb2.append(mo16476e());
        return sb2.toString();
    }
}
