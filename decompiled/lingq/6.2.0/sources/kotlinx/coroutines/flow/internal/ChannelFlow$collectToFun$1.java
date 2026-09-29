package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ll7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m4291f = "ChannelFlow.kt", m4292l = {56}, m4293m = "invokeSuspend", m4294v = 1)
final class ChannelFlow$collectToFun$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f48073a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f48074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC3231a f48075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(AbstractC3231a abstractC3231a, Continuation continuation) {
        super(2, continuation);
        this.f48075c = abstractC3231a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.f48075c, continuation);
        channelFlow$collectToFun$1.f48074b = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelFlow$collectToFun$1) create((ll7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ll7 ll7Var = (ll7) this.f48074b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48073a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f48074b = null;
            this.f48073a = 1;
            if (this.f48075c.mo10648d(ll7Var, this) == coroutineSingletons) {
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
