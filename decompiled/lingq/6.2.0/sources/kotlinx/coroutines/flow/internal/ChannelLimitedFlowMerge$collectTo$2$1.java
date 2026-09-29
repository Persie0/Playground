package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;
import p000.zv8;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", m4291f = "Merge.kt", m4292l = {92}, m4293m = "invokeSuspend", m4294v = 1)
final class ChannelLimitedFlowMerge$collectTo$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f48097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f48098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zv8 f48099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelLimitedFlowMerge$collectTo$2$1(c83 c83Var, zv8 zv8Var, Continuation continuation) {
        super(2, continuation);
        this.f48098b = c83Var;
        this.f48099c = zv8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChannelLimitedFlowMerge$collectTo$2$1(this.f48098b, this.f48099c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelLimitedFlowMerge$collectTo$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48097a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f48097a = 1;
            if (this.f48098b.collect(this.f48099c, this) == coroutineSingletons) {
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
