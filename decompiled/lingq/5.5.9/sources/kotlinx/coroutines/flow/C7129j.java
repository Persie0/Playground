package kotlinx.coroutines.flow;

import cm.InterfaceC2056p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C7129j implements InterfaceC7116c<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7116c f40361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2056p f40362b;

    public C7129j(InterfaceC2056p interfaceC2056p, ChannelFlowTransformLatest channelFlowTransformLatest) {
        this.f40361a = channelFlowTransformLatest;
        this.f40362b = interfaceC2056p;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo9539a = this.f40361a.mo9539a(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), interfaceC7117d, this.f40362b), interfaceC9968c);
        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
    }
}
