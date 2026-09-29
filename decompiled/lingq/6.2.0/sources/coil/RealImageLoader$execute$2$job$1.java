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

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "coil.RealImageLoader$execute$2$job$1", m4291f = "RealImageLoader.kt", m4292l = {133}, m4293m = "invokeSuspend")
final class RealImageLoader$execute$2$job$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0855a f10385b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e04 f10386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2$job$1(e04 e04Var, C0855a c0855a, Continuation continuation) {
        super(2, continuation);
        this.f10385b = c0855a;
        this.f10386c = e04Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$execute$2$job$1(this.f10386c, this.f10385b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$execute$2$job$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10384a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f10384a = 1;
            Object objM4949a = C0855a.m4949a(this.f10385b, this.f10386c, 1, this);
            return objM4949a == coroutineSingletons ? coroutineSingletons : objM4949a;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            return obj;
        }
        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
