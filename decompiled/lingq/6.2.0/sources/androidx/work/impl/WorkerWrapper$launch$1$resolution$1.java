package androidx.work.impl;

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
@c32(m4290c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", m4291f = "WorkerWrapper.kt", m4292l = {98}, m4293m = "invokeSuspend")
final class WorkerWrapper$launch$1$resolution$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0778d f7190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$launch$1$resolution$1(C0778d c0778d, Continuation continuation) {
        super(2, continuation);
        this.f7190b = c0778d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkerWrapper$launch$1$resolution$1(this.f7190b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkerWrapper$launch$1$resolution$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7189a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f7189a = 1;
            Object objM2925a = C0778d.m2925a(this.f7190b, this);
            return objM2925a == coroutineSingletons ? coroutineSingletons : objM2925a;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            return obj;
        }
        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
