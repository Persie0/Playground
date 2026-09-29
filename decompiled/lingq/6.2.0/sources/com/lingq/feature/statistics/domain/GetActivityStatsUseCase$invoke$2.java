package com.lingq.feature.statistics.domain;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.oo4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.domain.GetActivityStatsUseCase$invoke$2", m4291f = "GetActivityStatsUseCase.kt", m4292l = {20}, m4293m = "invokeSuspend", m4294v = 2)
final class GetActivityStatsUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33399a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2814a f33400b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33401c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LanguageProgressPeriod f33402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActivityStatsUseCase$invoke$2(C2814a c2814a, String str, LanguageProgressPeriod languageProgressPeriod, Continuation continuation) {
        super(1, continuation);
        this.f33400b = c2814a;
        this.f33401c = str;
        this.f33402d = languageProgressPeriod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetActivityStatsUseCase$invoke$2(this.f33400b, this.f33401c, this.f33402d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetActivityStatsUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33399a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            oo4 oo4Var = (oo4) this.f33400b.f33431a;
            this.f33399a = 1;
            if (((C1294j) oo4Var).m7230d(this.f33401c, this.f33402d, this) == coroutineSingletons) {
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
