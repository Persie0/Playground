package com.lingq.core.domain.stats;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.fj9;
import p000.pj9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.domain.stats.GetStreakUseCase$invoke$1", m4291f = "GetStreakUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetStreakUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19967a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetStreakUseCase$invoke$1 getStreakUseCase$invoke$1 = new GetStreakUseCase$invoke$1(2, continuation);
        getStreakUseCase$invoke$1.f19967a = obj;
        return getStreakUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetStreakUseCase$invoke$1) create((fj9) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        fj9 fj9Var = (fj9) this.f19967a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new pj9(fj9Var.f39207d);
    }
}
