package p325po;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.AbstractChannel;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: po.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C8435k<E> extends C8429e<E> implements InterfaceC8436l<E> {
    public C8435k(CoroutineContext coroutineContext, AbstractChannel abstractChannel) {
        super(coroutineContext, abstractChannel);
    }

    @Override // no.AbstractC7813a, no.C7883z0, no.InterfaceC7875v0
    /* JADX INFO: renamed from: b */
    public final boolean mo15547b() {
        return super.mo15547b();
    }

    @Override // no.AbstractC7813a
    /* JADX INFO: renamed from: j0 */
    public final void mo15548j0(Throwable th2, boolean z10) {
        if (this.f45565c.mo16477h(th2) || z10) {
            return;
        }
        C8573r0.m16769x0(this.f42914b, th2);
    }

    @Override // no.AbstractC7813a
    /* JADX INFO: renamed from: k0 */
    public final void mo15549k0(C9072e c9072e) {
        this.f45565c.mo16477h(null);
    }
}
