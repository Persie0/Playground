package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m4291f = "ChannelFlow.kt", m4292l = {148}, m4293m = "invokeSuspend", m4294v = 1)
final class ChannelFlowOperator$collectWithContextUndispatched$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f48082a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f48083b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC3233c f48084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(AbstractC3233c abstractC3233c, Continuation continuation) {
        super(2, continuation);
        this.f48084c = abstractC3233c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.f48084c, continuation);
        channelFlowOperator$collectWithContextUndispatched$2.f48083b = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f48083b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48082a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f48083b = null;
            this.f48082a = 1;
            if (this.f48084c.mo12141h(e83Var, this) == coroutineSingletons) {
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
