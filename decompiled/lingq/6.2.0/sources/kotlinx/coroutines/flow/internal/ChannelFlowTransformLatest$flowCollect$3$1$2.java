package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m4291f = "Merge.kt", m4292l = {30}, m4293m = "invokeSuspend", m4294v = 1)
final class ChannelFlowTransformLatest$flowCollect$3$1$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f48089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3235e f48090b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e83 f48091c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f48092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3$1$2(C3235e c3235e, e83 e83Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f48090b = c3235e;
        this.f48091c = e83Var;
        this.f48092d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChannelFlowTransformLatest$flowCollect$3$1$2(this.f48090b, this.f48091c, this.f48092d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelFlowTransformLatest$flowCollect$3$1$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48089a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            aj3 aj3Var = this.f48090b.f48141e;
            this.f48089a = 1;
            if (aj3Var.invoke(this.f48091c, this.f48092d, this) == coroutineSingletons) {
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
