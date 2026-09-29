package com.lingq.core.data.workers;

import com.lingq.core.network.api.requests.RequestHintUpdate;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.df4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.HintUpdateWorker$doWork$requestHintUpdate$1", m4291f = "HintUpdateWorker.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class HintUpdateWorker$doWork$requestHintUpdate$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HintUpdateWorker f16672a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f16673b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HintUpdateWorker$doWork$requestHintUpdate$1(HintUpdateWorker hintUpdateWorker, String str, Continuation continuation) {
        super(2, continuation);
        this.f16672a = hintUpdateWorker;
        this.f16673b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HintUpdateWorker$doWork$requestHintUpdate$1(this.f16672a, this.f16673b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HintUpdateWorker$doWork$requestHintUpdate$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        df4 df4Var = this.f16672a.f16667i;
        df4Var.getClass();
        return df4Var.m10321a(this.f16673b, RequestHintUpdate.Companion.serializer());
    }
}
