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
@c32(m4290c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", m4291f = "ConnectionPoolImpl.kt", m4292l = {231}, m4293m = "invokeSuspend")
final class Pool$acquireWithTimeout$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f6892a;

    /* JADX INFO: renamed from: b */
    public int f6893b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref$ObjectRef f6894c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0743d f6895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$2(Ref$ObjectRef ref$ObjectRef, C0743d c0743d, Continuation continuation) {
        super(2, continuation);
        this.f6894c = ref$ObjectRef;
        this.f6895d = c0743d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Pool$acquireWithTimeout$2(this.f6894c, this.f6895d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((Pool$acquireWithTimeout$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$ObjectRef ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6893b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$ObjectRef ref$ObjectRef2 = this.f6894c;
            this.f6892a = ref$ObjectRef2;
            this.f6893b = 1;
            Object objM2819a = this.f6895d.m2819a(this);
            if (objM2819a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM2819a;
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = this.f6892a;
            AbstractC3193b.m15359b(obj);
        }
        ref$ObjectRef.f47718a = obj;
        return xfa.f68157a;
    }
}
