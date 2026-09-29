package androidx.room.coroutines;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3352my;
import p000.c32;
import p000.ik8;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", m4291f = "PassthroughConnectionPool.kt", m4292l = {}, m4293m = "invokeSuspend")
final class PassthroughConnection$usePrepared$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0741b f6873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f6874b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f6875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnection$usePrepared$2(C0741b c0741b, String str, vi3 vi3Var, Continuation continuation) {
        super(1, continuation);
        this.f6873a = c0741b;
        this.f6874b = str;
        this.f6875c = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PassthroughConnection$usePrepared$2(this.f6873a, this.f6874b, this.f6875c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PassthroughConnection$usePrepared$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ik8 ik8VarMo2873e0 = this.f6873a.f6934b.mo2873e0(this.f6874b);
        try {
            Object objInvoke = this.f6875c.invoke(ik8VarMo2873e0);
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }
}
