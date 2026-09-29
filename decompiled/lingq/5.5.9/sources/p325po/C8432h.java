package p325po;

import dm.C5212l;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import no.C7814a0;

/* JADX INFO: renamed from: po.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C8432h<E> extends AbstractC8441q implements InterfaceC8439o<E> {

    /* JADX INFO: renamed from: d */
    public final Throwable f45569d;

    public C8432h(Throwable th2) {
        this.f45569d = th2;
    }

    @Override // p325po.AbstractC8441q
    /* JADX INFO: renamed from: K */
    public final void mo16485K() {
    }

    @Override // p325po.AbstractC8441q
    /* JADX INFO: renamed from: L */
    public final Object mo16486L() {
        return this;
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

    /* JADX INFO: renamed from: Q */
    public final Throwable m16490Q() {
        Throwable th2 = this.f45569d;
        return th2 == null ? new ClosedReceiveChannelException() : th2;
    }

    @Override // p325po.InterfaceC8439o
    /* JADX INFO: renamed from: c */
    public final C7168r mo14350c(Object obj) {
        return C5212l.f33292k;
    }

    @Override // p325po.InterfaceC8439o
    /* JADX INFO: renamed from: g */
    public final Object mo16491g() {
        return this;
    }

    @Override // p325po.InterfaceC8439o
    /* JADX INFO: renamed from: p */
    public final void mo14351p(E e10) {
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return "Closed@" + C7814a0.m15551c(this) + '[' + this.f45569d + ']';
    }
}
