package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.ll7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m4291f = "Delay.kt", m4292l = {204}, m4293m = "invokeSuspend", m4294v = 1)
final class FlowKt__DelayKt$debounceInternal$1$values$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f47842a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47843b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83 f47844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1(c83 c83Var, Continuation continuation) {
        super(2, continuation);
        this.f47844c = c83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.f47844c, continuation);
        flowKt__DelayKt$debounceInternal$1$values$1.f47843b = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) create((ll7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ll7 ll7Var = (ll7) this.f47843b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47842a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3225e c3225e = new C3225e(ll7Var);
            this.f47843b = null;
            this.f47842a = 1;
            if (this.f47844c.collect(c3225e, this) == coroutineSingletons) {
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
