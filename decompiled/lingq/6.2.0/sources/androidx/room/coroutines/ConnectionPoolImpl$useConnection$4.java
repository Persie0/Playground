package androidx.room.coroutines;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", m4291f = "ConnectionPoolImpl.kt", m4292l = {159}, m4293m = "invokeSuspend")
final class ConnectionPoolImpl$useConnection$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f6858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref$ObjectRef f6859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPoolImpl$useConnection$4(zi3 zi3Var, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.f6858b = zi3Var;
        this.f6859c = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConnectionPoolImpl$useConnection$4(this.f6858b, this.f6859c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectionPoolImpl$useConnection$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6857a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        Object obj2 = this.f6859c.f47718a;
        this.f6857a = 1;
        Object objInvoke = this.f6858b.invoke(obj2, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
