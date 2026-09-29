package androidx.glance.session;

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
@c32(m4290c = "androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1", m4291f = "SessionWorker.kt", m4292l = {174}, m4293m = "invokeSuspend", m4294v = 1)
final class SessionWorkerKt$runSession$snapshotMonitor$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6234a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SessionWorkerKt$runSession$snapshotMonitor$1(2, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionWorkerKt$runSession$snapshotMonitor$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6234a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f6234a = 1;
            if (AbstractC0693a.m2490b(this) == coroutineSingletons) {
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
