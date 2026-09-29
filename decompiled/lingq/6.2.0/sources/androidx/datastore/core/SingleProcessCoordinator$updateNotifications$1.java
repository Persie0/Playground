package androidx.datastore.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", m4291f = "SingleProcessCoordinator.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
public final class SingleProcessCoordinator$updateNotifications$1 extends SuspendLambda implements zi3 {
    int label;

    public SingleProcessCoordinator$updateNotifications$1(Continuation<? super SingleProcessCoordinator$updateNotifications$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<xfa> create(Object obj, Continuation<?> continuation) {
        return new SingleProcessCoordinator$updateNotifications$1(continuation);
    }

    @Override // p000.zi3
    public final Object invoke(e83 e83Var, Continuation<? super xfa> continuation) {
        return ((SingleProcessCoordinator$updateNotifications$1) create(e83Var, continuation)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC3193b.m15359b(obj);
            return xfa.f68157a;
        }
        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
