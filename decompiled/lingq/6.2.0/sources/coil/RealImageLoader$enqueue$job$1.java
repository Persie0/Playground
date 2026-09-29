package coil;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e04;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.RealImageLoader$enqueue$job$1", m4291f = "RealImageLoader.kt", m4292l = {113}, m4293m = "invokeSuspend")
final class RealImageLoader$enqueue$job$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10377a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0855a f10378b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e04 f10379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$enqueue$job$1(e04 e04Var, C0855a c0855a, Continuation continuation) {
        super(2, continuation);
        this.f10378b = c0855a;
        this.f10379c = e04Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$enqueue$job$1(this.f10379c, this.f10378b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$enqueue$job$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10377a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f10377a = 1;
            obj = C0855a.m4949a(this.f10378b, this.f10379c, 0, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return obj;
    }
}
