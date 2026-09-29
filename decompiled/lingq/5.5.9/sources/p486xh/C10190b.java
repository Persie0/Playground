package p486xh;

import ae.C0062b;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: xh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10190b implements InterfaceC10189a {

    /* JADX INFO: renamed from: a */
    public final AbstractChannel f51544a;

    /* JADX INFO: renamed from: b */
    public final C7114a f51545b;

    public C10190b() {
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(0, null, 6);
        this.f51544a = abstractChannelM16738m;
        this.f51545b = C0062b.m287L1(abstractChannelM16738m);
    }

    @Override // p486xh.InterfaceC10189a
    /* JADX INFO: renamed from: R0 */
    public final void mo9725R0() {
        this.f51544a.mo16479j(C9072e.f47360a);
    }

    @Override // p486xh.InterfaceC10189a
    /* JADX INFO: renamed from: U */
    public final InterfaceC7116c<C9072e> mo9728U() {
        return this.f51545b;
    }
}
