package com.lingq.core.domain.stats;

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
@c32(m4290c = "com.lingq.core.domain.stats.GetActivityStatsUseCase$invoke$1", m4291f = "GetActivityStatsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetActivityStatsUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19961a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LanguageProgressPeriod f19962b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActivityStatsUseCase$invoke$1(LanguageProgressPeriod languageProgressPeriod, Continuation continuation) {
        super(2, continuation);
        this.f19962b = languageProgressPeriod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetActivityStatsUseCase$invoke$1 getActivityStatsUseCase$invoke$1 = new GetActivityStatsUseCase$invoke$1(this.f19962b, continuation);
        getActivityStatsUseCase$invoke$1.f19961a = obj;
        return getActivityStatsUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetActivityStatsUseCase$invoke$1) create((LanguageStats) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LanguageStats languageStats = (LanguageStats) this.f19961a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LanguageProgressPeriod languageProgressPeriod = this.f19962b;
        return languageStats == null ? new C2992f8(languageProgressPeriod) : new C3029g8(languageProgressPeriod, languageStats);
    }
}
