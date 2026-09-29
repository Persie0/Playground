package sh;

import ae.C0062b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: sh.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9011g implements InterfaceC9010f {

    /* JADX INFO: renamed from: a */
    public final AbstractChannel f47232a;

    /* JADX INFO: renamed from: b */
    public final C7114a f47233b;

    public C9011g() {
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f47232a = abstractChannelM16738m;
        this.f47233b = C0062b.m287L1(abstractChannelM16738m);
    }

    @Override // sh.InterfaceC9010f
    /* JADX INFO: renamed from: G0 */
    public final InterfaceC7116c<Integer> mo10140G0() {
        return this.f47233b;
    }

    @Override // sh.InterfaceC9010f
    /* JADX INFO: renamed from: U0 */
    public final Object mo10142U0(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo16480k = this.f47232a.mo16480k(new Integer(i10), interfaceC9968c);
        return objMo16480k == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo16480k : C9072e.f47360a;
    }
}
