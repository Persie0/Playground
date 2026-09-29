package p325po;

import cm.InterfaceC2052l;
import java.util.ArrayList;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.internal.C7158h;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: po.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C8434j<E> extends AbstractChannel<E> {
    public C8434j(InterfaceC2052l<? super E, C9072e> interfaceC2052l) {
        super(interfaceC2052l);
    }

    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: n */
    public final boolean mo16481n() {
        return false;
    }

    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: o */
    public final boolean mo16482o() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: p */
    public final Object mo16483p(E e10) {
        InterfaceC8439o interfaceC8439o;
        do {
            Object objMo16483p = super.mo16483p(e10);
            C7168r c7168r = C8573r0.f45956H;
            if (objMo16483p == c7168r) {
                return c7168r;
            }
            if (objMo16483p != C8573r0.f45957I) {
                if (objMo16483p instanceof C8432h) {
                    return objMo16483p;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + objMo16483p).toString());
            }
            C7158h c7158h = this.f45553b;
            AbstractC8425a.a aVar = new AbstractC8425a.a(e10);
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNodeM14405B = c7158h.m14405B();
                if (lockFreeLinkedListNodeM14405B instanceof InterfaceC8439o) {
                    interfaceC8439o = (InterfaceC8439o) lockFreeLinkedListNodeM14405B;
                    break;
                }
                if (lockFreeLinkedListNodeM14405B.m14412u(aVar, c7158h)) {
                    interfaceC8439o = null;
                    break;
                }
            }
            if (interfaceC8439o == null) {
                return c7168r;
            }
        } while (!(interfaceC8439o instanceof C8432h));
        return interfaceC8439o;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: t */
    public final boolean mo14341t() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: u */
    public final boolean mo14342u() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: x */
    public final void mo14345x(Object obj, C8432h<?> c8432h) {
        UndeliveredElementException undeliveredElementExceptionM14432b = null;
        if (obj != null) {
            boolean z10 = obj instanceof ArrayList;
            InterfaceC2052l<E, C9072e> interfaceC2052l = this.f45552a;
            if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementExceptionM14432b2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    AbstractC8441q abstractC8441q = (AbstractC8441q) arrayList.get(size);
                    if (abstractC8441q instanceof AbstractC8425a.a) {
                        undeliveredElementExceptionM14432b2 = interfaceC2052l != null ? OnUndeliveredElementKt.m14432b(interfaceC2052l, ((AbstractC8425a.a) abstractC8441q).f45554d, undeliveredElementExceptionM14432b2) : null;
                    } else {
                        abstractC8441q.mo16487N(c8432h);
                    }
                }
                undeliveredElementExceptionM14432b = undeliveredElementExceptionM14432b2;
            } else {
                AbstractC8441q abstractC8441q2 = (AbstractC8441q) obj;
                if (!(abstractC8441q2 instanceof AbstractC8425a.a)) {
                    abstractC8441q2.mo16487N(c8432h);
                } else if (interfaceC2052l != null) {
                    undeliveredElementExceptionM14432b = OnUndeliveredElementKt.m14432b(interfaceC2052l, ((AbstractC8425a.a) abstractC8441q2).f45554d, null);
                }
            }
        }
        if (undeliveredElementExceptionM14432b != null) {
            throw undeliveredElementExceptionM14432b;
        }
    }
}
