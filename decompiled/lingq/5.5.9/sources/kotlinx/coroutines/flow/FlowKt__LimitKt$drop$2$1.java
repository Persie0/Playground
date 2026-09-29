package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__LimitKt$drop$2$1<T> implements InterfaceC7117d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$IntRef f40121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f40122b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC7117d<T> f40123c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$drop$2$1(Ref$IntRef ref$IntRef, int i10, InterfaceC7117d<? super T> interfaceC7117d) {
        this.f40121a = ref$IntRef;
        this.f40122b = i10;
        this.f40123c = interfaceC7117d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        if (interfaceC9968c instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) interfaceC9968c;
            int i10 = flowKt__LimitKt$drop$2$1$emit$1.f40126f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.f40126f = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, interfaceC9968c);
            }
        } else {
            flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, interfaceC9968c);
        }
        Object obj = flowKt__LimitKt$drop$2$1$emit$1.f40124d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = flowKt__LimitKt$drop$2$1$emit$1.f40126f;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            Ref$IntRef ref$IntRef = this.f40121a;
            int i12 = ref$IntRef.f38125a;
            if (i12 < this.f40122b) {
                ref$IntRef.f38125a = i12 + 1;
                return C9072e.f47360a;
            }
            flowKt__LimitKt$drop$2$1$emit$1.f40126f = 1;
            if (this.f40123c.mo1339r(t10, flowKt__LimitKt$drop$2$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
