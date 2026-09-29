package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m4291f = "Merge.kt", m4292l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 1)
final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f48085a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f48086b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3235e f48087c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e83 f48088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3(C3235e c3235e, e83 e83Var, Continuation continuation) {
        super(2, continuation);
        this.f48087c = c3235e;
        this.f48088d = e83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.f48087c, this.f48088d, continuation);
        channelFlowTransformLatest$flowCollect$3.f48086b = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var = (un1) this.f48086b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48085a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C3235e c3235e = this.f48087c;
            c83 c83Var = c3235e.f48136d;
            C3234d c3234d = new C3234d(ref$ObjectRef, un1Var, c3235e, this.f48088d);
            this.f48086b = null;
            this.f48085a = 1;
            if (c83Var.collect(c3234d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
