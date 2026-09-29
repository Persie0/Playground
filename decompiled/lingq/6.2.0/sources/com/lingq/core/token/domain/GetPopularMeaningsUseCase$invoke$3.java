package com.lingq.core.token.domain;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.q02;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetPopularMeaningsUseCase$invoke$3", m4291f = "GetPopularMeaningsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetPopularMeaningsUseCase$invoke$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23817a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetPopularMeaningsUseCase$invoke$3 getPopularMeaningsUseCase$invoke$3 = new GetPopularMeaningsUseCase$invoke$3(2, continuation);
        getPopularMeaningsUseCase$invoke$3.f23817a = obj;
        return getPopularMeaningsUseCase$invoke$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetPopularMeaningsUseCase$invoke$3) create((q02) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        q02 q02Var = (q02) this.f23817a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Object obj2 = q02Var.f57065a;
        Integer num = (Integer) q02Var.f57066b;
        return new Pair(obj2, new Integer(num != null ? num.intValue() : -1));
    }
}
