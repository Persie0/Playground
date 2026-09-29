package com.lingq.feature.statistics.domain;

import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.language.LanguageStats;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C2992f8;
import p000.C3029g8;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.domain.GetActivityStatsUseCase$invoke$3", m4291f = "GetActivityStatsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetActivityStatsUseCase$invoke$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33403a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LanguageProgressPeriod f33404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActivityStatsUseCase$invoke$3(LanguageProgressPeriod languageProgressPeriod, Continuation continuation) {
        super(2, continuation);
        this.f33404b = languageProgressPeriod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetActivityStatsUseCase$invoke$3 getActivityStatsUseCase$invoke$3 = new GetActivityStatsUseCase$invoke$3(this.f33404b, continuation);
        getActivityStatsUseCase$invoke$3.f33403a = obj;
        return getActivityStatsUseCase$invoke$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetActivityStatsUseCase$invoke$3) create((LanguageStats) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LanguageStats languageStats = (LanguageStats) this.f33403a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LanguageProgressPeriod languageProgressPeriod = this.f33404b;
        return languageStats == null ? new C2992f8(languageProgressPeriod) : new C3029g8(languageProgressPeriod, languageStats);
    }
}
