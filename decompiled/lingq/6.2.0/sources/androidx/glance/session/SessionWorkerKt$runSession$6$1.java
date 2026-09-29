package androidx.glance.session;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.w84;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionWorkerKt$runSession$6$1", m4291f = "SessionWorker.kt", m4292l = {253}, m4293m = "invokeSuspend", m4294v = 1)
final class SessionWorkerKt$runSession$6$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w84 f6228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorkerKt$runSession$6$1(w84 w84Var, Continuation continuation) {
        super(2, continuation);
        this.f6228b = w84Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SessionWorkerKt$runSession$6$1(this.f6228b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionWorkerKt$runSession$6$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6227a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f6227a = 1;
            w84 w84Var = this.f6228b;
            w84Var.getClass();
            if (AbstractC3208a.m15447n(5000L, new InteractiveFrameClock$startInteractive$2(w84Var, null), this) == coroutineSingletons) {
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
