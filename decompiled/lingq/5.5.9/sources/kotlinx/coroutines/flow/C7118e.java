package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C7118e implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f40282a;

    public C7118e(SharingCommand sharingCommand) {
        this.f40282a = sharingCommand;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo1339r = interfaceC7117d.mo1339r(this.f40282a, interfaceC9968c);
        return objMo1339r == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1339r : C9072e.f47360a;
    }
}
