package androidx.room;

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
@c32(m4290c = "androidx.room.InvalidationTracker$syncBlocking$1", m4291f = "InvalidationTracker.android.kt", m4292l = {152}, m4293m = "invokeSuspend")
final class InvalidationTracker$syncBlocking$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0736a f6722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidationTracker$syncBlocking$1(C0736a c0736a, Continuation continuation) {
        super(2, continuation);
        this.f6722b = c0736a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InvalidationTracker$syncBlocking$1(this.f6722b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((InvalidationTracker$syncBlocking$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6721a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f6721a = 1;
            if (this.f6722b.m2809b(this) == coroutineSingletons) {
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
