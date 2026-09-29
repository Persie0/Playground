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
@c32(m4290c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m4291f = "FlowCoroutine.kt", m4292l = {47}, m4293m = "invokeSuspend", m4294v = 1)
final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f48120a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f48121b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aj3 f48122c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e83 f48123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowCoroutineKt$scopedFlow$1$1(aj3 aj3Var, e83 e83Var, Continuation continuation) {
        super(2, continuation);
        this.f48122c = aj3Var;
        this.f48123d = e83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f48122c, this.f48123d, continuation);
        flowCoroutineKt$scopedFlow$1$1.f48121b = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowCoroutineKt$scopedFlow$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var = (un1) this.f48121b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f48120a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f48121b = null;
            this.f48120a = 1;
            if (this.f48122c.invoke(un1Var, this.f48123d, this) == coroutineSingletons) {
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
