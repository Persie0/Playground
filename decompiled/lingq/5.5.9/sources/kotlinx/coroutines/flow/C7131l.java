package kotlinx.coroutines.flow;

import cm.InterfaceC2057q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.C7127c;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C7131l implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7116c f40364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC7116c f40365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2057q f40366c;

    public C7131l(InterfaceC7116c interfaceC7116c, InterfaceC7116c interfaceC7116c2, InterfaceC2057q interfaceC2057q) {
        this.f40364a = interfaceC7116c;
        this.f40365b = interfaceC7116c2;
        this.f40366c = interfaceC2057q;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        Object objM14386a = C7127c.m14386a(interfaceC9968c, FlowKt__ZipKt$nullArrayFactory$1.f40241b, new FlowKt__ZipKt$combine$1$1(this.f40366c, null), interfaceC7117d, new InterfaceC7116c[]{this.f40364a, this.f40365b});
        return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
    }
}
