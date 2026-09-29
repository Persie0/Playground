package androidx.glance.session;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2$idleReceiver$1$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2$idleReceiver$1$1", m4291f = "IdleEventBroadcastReceiver.kt", m4292l = {77}, m4293m = "invokeSuspend", m4294v = 1)
final class C0687x6a94ac3b extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f6127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0687x6a94ac3b(vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f6127b = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0687x6a94ac3b(this.f6127b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0687x6a94ac3b) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6126a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f6126a = 1;
            ((SessionWorker$doWork$result$1.C06891) this.f6127b).invoke(this);
            if (xfaVar == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
