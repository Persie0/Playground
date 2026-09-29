package androidx.work;

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
@c32(m4290c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m4291f = "CoroutineWorker.kt", m4292l = {121}, m4293m = "invokeSuspend")
final class CoroutineWorker$getForegroundInfoAsync$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CoroutineWorker f7157b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$getForegroundInfoAsync$1(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.f7157b = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.f7157b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        CoroutineWorker$getForegroundInfoAsync$1 coroutineWorker$getForegroundInfoAsync$1 = (CoroutineWorker$getForegroundInfoAsync$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        coroutineWorker$getForegroundInfoAsync$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7156a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f7156a = 1;
            C3386nv.m17633t("Not implemented");
            return null;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            return obj;
        }
        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
