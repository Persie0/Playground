package androidx.room.coroutines;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.coroutines.PassthroughConnectionPool$useConnection$2", m4291f = "PassthroughConnectionPool.kt", m4292l = {59}, m4293m = "invokeSuspend")
final class PassthroughConnectionPool$useConnection$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6880a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f6881b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0741b f6882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnectionPool$useConnection$2(zi3 zi3Var, C0741b c0741b, Continuation continuation) {
        super(2, continuation);
        this.f6881b = zi3Var;
        this.f6882c = c0741b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassthroughConnectionPool$useConnection$2(this.f6881b, this.f6882c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PassthroughConnectionPool$useConnection$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6880a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f6880a = 1;
            Object objInvoke = this.f6881b.invoke(this.f6882c, this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            return obj;
        }
        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
