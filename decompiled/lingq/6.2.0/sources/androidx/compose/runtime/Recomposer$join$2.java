package androidx.compose.runtime;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.runtime.Recomposer$join$2", m4291f = "Recomposer.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class Recomposer$join$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f3669a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(2, continuation);
        recomposer$join$2.f3669a = obj;
        return recomposer$join$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((Recomposer$join$2) create((Recomposer$State) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(((Recomposer$State) this.f3669a) == Recomposer$State.ShutDown);
    }
}
