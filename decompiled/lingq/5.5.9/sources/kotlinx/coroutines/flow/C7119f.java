package kotlinx.coroutines.flow;

import cm.InterfaceC2052l;
import kotlinx.coroutines.flow.internal.C7128d;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7119f {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7116c m14378a(StateFlowImpl stateFlowImpl) {
        return new C7128d(new FlowKt__DelayKt$debounceInternal$1(new InterfaceC2052l<Object, Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f40060b = 600;

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Long mo528n(Object obj) {
                return Long.valueOf(this.f40060b);
            }
        }, stateFlowImpl, null));
    }
}
