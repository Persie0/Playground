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

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", m4291f = "ConnectionPoolImpl.kt", m4292l = {132}, m4293m = "invokeSuspend")
final class ConnectionPoolImpl$useConnection$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6854a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f6855b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0744e f6856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPoolImpl$useConnection$2(zi3 zi3Var, C0744e c0744e, Continuation continuation) {
        super(2, continuation);
        this.f6855b = zi3Var;
        this.f6856c = c0744e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConnectionPoolImpl$useConnection$2(this.f6855b, this.f6856c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectionPoolImpl$useConnection$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6854a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f6854a = 1;
            Object objInvoke = this.f6855b.invoke(this.f6856c, this);
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
