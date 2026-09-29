package kotlinx.coroutines.flow.internal;

import ae.C0062b;
import cm.InterfaceC2057q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p349qo.C8660f;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C7128d implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2057q f40360a;

    public C7128d(InterfaceC2057q interfaceC2057q) {
        this.f40360a = interfaceC2057q;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f40360a, interfaceC7117d, null);
        C8660f c8660f = new C8660f(interfaceC9968c, interfaceC9968c.mo2029e());
        Object objM350g2 = C0062b.m350g2(c8660f, c8660f, flowCoroutineKt$scopedFlow$1$1);
        return objM350g2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM350g2 : C9072e.f47360a;
    }
}
