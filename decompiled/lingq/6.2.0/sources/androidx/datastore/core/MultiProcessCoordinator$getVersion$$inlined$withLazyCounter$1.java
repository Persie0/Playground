package androidx.datastore.core;

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
@c32(m4290c = "androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1", m4291f = "MultiProcessCoordinator.android.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
public final class MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1 extends SuspendLambda implements zi3 {
    int label;
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(MultiProcessCoordinator multiProcessCoordinator, Continuation continuation) {
        super(2, continuation);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
        return new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this.this$0, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(un1 un1Var, Continuation<? super Integer> continuation) {
        return ((MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1) create(un1Var, continuation)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC3193b.m15359b(obj);
            return new Integer(this.this$0.getSharedCounter().getValue());
        }
        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
