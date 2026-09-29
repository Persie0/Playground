package com.lingq.feature.statistics.domain;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.fj9;
import p000.xfa;
import p000.y41;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.domain.GetCoinsBalanceUseCase$invoke$3", m4291f = "GetCoinsBalanceUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetCoinsBalanceUseCase$invoke$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33416a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetCoinsBalanceUseCase$invoke$3 getCoinsBalanceUseCase$invoke$3 = new GetCoinsBalanceUseCase$invoke$3(2, continuation);
        getCoinsBalanceUseCase$invoke$3.f33416a = obj;
        return getCoinsBalanceUseCase$invoke$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetCoinsBalanceUseCase$invoke$3) create((fj9) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        fj9 fj9Var = (fj9) this.f33416a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new y41(fj9Var.f39208e);
    }
}
