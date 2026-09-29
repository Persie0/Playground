package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import p000.C3386nv;
import p000.cd4;
import p000.e83;
import p000.un1;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3234d implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$ObjectRef f48137a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un1 f48138b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3235e f48139c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e83 f48140d;

    public C3234d(Ref$ObjectRef ref$ObjectRef, un1 un1Var, C3235e c3235e, e83 e83Var) {
        this.f48137a = ref$ObjectRef;
        this.f48138b = un1Var;
        this.f48139c = c3235e;
        this.f48140d = e83Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
        if (continuation instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
            channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) continuation;
            int i = channelFlowTransformLatest$flowCollect$3$1$emit$1.f48096d;
            if ((i & Integer.MIN_VALUE) != 0) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1.f48096d = i - Integer.MIN_VALUE;
            } else {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
            }
        } else {
            channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
        }
        Object obj2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f48094b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f48096d;
        Ref$ObjectRef ref$ObjectRef = this.f48137a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            cd4 cd4Var = (cd4) ref$ObjectRef.f47718a;
            if (cd4Var != null) {
                cd4Var.mo4537a(new ChildCancelledException("Child of the scoped flow was cancelled"));
                channelFlowTransformLatest$flowCollect$3$1$emit$1.f48093a = obj;
                channelFlowTransformLatest$flowCollect$3$1$emit$1.f48096d = 1;
                if (cd4Var.mo4539q(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.f48093a;
            AbstractC3193b.m15359b(obj2);
        }
        ref$ObjectRef.f47718a = wfb.m23926u(this.f48138b, null, CoroutineStart.UNDISPATCHED, new ChannelFlowTransformLatest$flowCollect$3$1$2(this.f48139c, this.f48140d, obj, null), 1);
        return xfa.f68157a;
    }
}
