package p325po;

import dm.C5212l;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import no.C7814a0;
import no.C7843k;
import no.InterfaceC7840j;
import p260m8.C7499b;
import sl.C9072e;

/* JADX INFO: renamed from: po.s */
/* JADX INFO: loaded from: classes2.dex */
public class C8443s<E> extends AbstractC8441q {

    /* JADX INFO: renamed from: d */
    public final E f45572d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7840j<C9072e> f45573e;

    /* JADX WARN: Multi-variable type inference failed */
    public C8443s(Object obj, C7843k c7843k) {
        this.f45572d = obj;
        this.f45573e = c7843k;
    }

    @Override // p325po.AbstractC8441q
    /* JADX INFO: renamed from: K */
    public final void mo16485K() {
        this.f45573e.mo15582t();
    }

    @Override // p325po.AbstractC8441q
    /* JADX INFO: renamed from: L */
    public final E mo16486L() {
        return this.f45572d;
    }

    @Override // p325po.AbstractC8441q
    /* JADX INFO: renamed from: N */
    public final void mo16487N(C8432h<?> c8432h) {
        Throwable closedSendChannelException = c8432h.f45569d;
        if (closedSendChannelException == null) {
            closedSendChannelException = new ClosedSendChannelException("Channel was closed");
        }
        this.f45573e.mo2031y(C7499b.m14967u(closedSendChannelException));
    }

    @Override // p325po.AbstractC8441q
    /* JADX INFO: renamed from: O */
    public final C7168r mo16488O(LockFreeLinkedListNode.C7148c c7148c) {
        if (this.f45573e.mo15581q(C9072e.f47360a, c7148c != null ? c7148c.f40398c : null) == null) {
            return null;
        }
        if (c7148c != null) {
            c7148c.m14429d();
        }
        return C5212l.f33292k;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return getClass().getSimpleName() + '@' + C7814a0.m15551c(this) + '(' + this.f45572d + ')';
    }
}
