package no;

import dm.C5207g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p260m8.C7499b;

/* JADX INFO: renamed from: no.y0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7881y0 extends AbstractC7874v implements InterfaceC7838i0, InterfaceC7862q0 {

    /* JADX INFO: renamed from: d */
    public C7883z0 f42980d;

    /* JADX INFO: renamed from: L */
    public final C7883z0 m15626L() {
        C7883z0 c7883z0 = this.f42980d;
        if (c7883z0 != null) {
            return c7883z0;
        }
        C5207g.m11117l("job");
        throw null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode, no.InterfaceC7838i0
    /* JADX INFO: renamed from: a */
    public final void mo14330a() {
        boolean z10;
        C7883z0 c7883z0M15626L = m15626L();
        do {
            Object objM15634M = c7883z0M15626L.m15634M();
            if (!(objM15634M instanceof AbstractC7881y0)) {
                if ((objM15634M instanceof InterfaceC7862q0) && ((InterfaceC7862q0) objM15634M).mo15562j() != null) {
                    mo14408F();
                }
                return;
            } else {
                if (objM15634M != this) {
                    return;
                }
                C7844k0 c7844k0 = C7499b.f41424N;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7883z0.f42981a;
                    if (atomicReferenceFieldUpdater.compareAndSet(c7883z0M15626L, objM15634M, c7844k0)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(c7883z0M15626L) != objM15634M) {
                        z10 = false;
                        break;
                    }
                }
            }
        } while (!z10);
    }

    @Override // no.InterfaceC7862q0
    /* JADX INFO: renamed from: b */
    public final boolean mo15561b() {
        return true;
    }

    public InterfaceC7875v0 getParent() {
        return m15626L();
    }

    @Override // no.InterfaceC7862q0
    /* JADX INFO: renamed from: j */
    public final C7824d1 mo15562j() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return getClass().getSimpleName() + '@' + C7814a0.m15551c(this) + "[job@" + C7814a0.m15551c(m15626L()) + ']';
    }
}
