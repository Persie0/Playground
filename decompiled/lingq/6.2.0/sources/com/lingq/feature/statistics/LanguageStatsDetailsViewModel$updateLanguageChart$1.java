package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
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
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$updateLanguageChart$1", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {305}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDetailsViewModel$updateLanguageChart$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2812c f33216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LanguageProgressMetric f33217c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LanguageProgressPeriod f33218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDetailsViewModel$updateLanguageChart$1(LanguageProgressMetric languageProgressMetric, LanguageProgressPeriod languageProgressPeriod, C2812c c2812c, Continuation continuation) {
        super(1, continuation);
        this.f33216b = c2812c;
        this.f33217c = languageProgressMetric;
        this.f33218d = languageProgressPeriod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageStatsDetailsViewModel$updateLanguageChart$1(this.f33217c, this.f33218d, this.f33216b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageStatsDetailsViewModel$updateLanguageChart$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33215a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2812c c2812c = this.f33216b;
                oo4 oo4Var = c2812c.f33388c;
                String strMo4589b2 = c2812c.f33387b.mo4589b2();
                LanguageProgressMetric languageProgressMetric = this.f33217c;
                LanguageProgressPeriod languageProgressPeriod = this.f33218d;
                this.f33215a = 1;
                if (((C1294j) oo4Var).m7229c(strMo4589b2, languageProgressMetric, languageProgressPeriod, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}
