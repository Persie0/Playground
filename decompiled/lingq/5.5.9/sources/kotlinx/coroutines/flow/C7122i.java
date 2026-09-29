package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C7122i implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7116c f40285a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f40286b = 1;

    public C7122i(InterfaceC7116c interfaceC7116c) {
        this.f40285a = interfaceC7116c;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo9539a = this.f40285a.mo9539a(new FlowKt__LimitKt$drop$2$1(new Ref$IntRef(), this.f40286b, interfaceC7117d), interfaceC9968c);
        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
    }
}
