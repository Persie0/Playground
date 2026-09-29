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
@c32(m4290c = "androidx.work.CoroutineWorker$startWork$1", m4291f = "CoroutineWorker.kt", m4292l = {67}, m4293m = "invokeSuspend")
final class CoroutineWorker$startWork$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7158a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CoroutineWorker f7159b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$startWork$1(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.f7159b = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutineWorker$startWork$1(this.f7159b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutineWorker$startWork$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7158a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f7158a = 1;
            Object objMo2213d = this.f7159b.mo2213d(this);
            return objMo2213d == coroutineSingletons ? coroutineSingletons : objMo2213d;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            return obj;
        }
        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
