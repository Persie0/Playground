package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.cu0;
import p000.e83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m4291f = "ChannelFlow.kt", m4292l = {119}, m4293m = "invokeSuspend", m4294v = 1)
final class ChannelFlow$collect$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f48069a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f48070b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e83 f48071c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC3231a f48072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(e83 e83Var, AbstractC3231a abstractC3231a, Continuation continuation) {
        super(2, continuation);
        this.f48071c = e83Var;
        this.f48072d = abstractC3231a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.f48071c, this.f48072d, continuation);
        channelFlow$collect$2.f48070b = obj;
        return channelFlow$collect$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelFlow$collect$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var = (un1) this.f48070b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48069a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        cu0 cu0VarMo10651g = this.f48072d.mo10651g(un1Var);
        this.f48070b = null;
        this.f48069a = 1;
        Object objM15538q = AbstractC3224d.m15538q(this.f48071c, cu0VarMo10651g, true, this);
        if (objM15538q != coroutineSingletons) {
            objM15538q = xfaVar;
        }
        return objM15538q == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
