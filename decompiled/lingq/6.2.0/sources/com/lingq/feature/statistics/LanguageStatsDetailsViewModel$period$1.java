package com.lingq.feature.statistics;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.lda;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$period$1", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDetailsViewModel$period$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2812c f33211a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDetailsViewModel$period$1(C2812c c2812c, Continuation continuation) {
        super(2, continuation);
        this.f33211a = c2812c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageStatsDetailsViewModel$period$1(this.f33211a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LanguageStatsDetailsViewModel$period$1 languageStatsDetailsViewModel$period$1 = (LanguageStatsDetailsViewModel$period$1) create((LanguageProgressPeriod) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        languageStatsDetailsViewModel$period$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2812c c2812c = this.f33211a;
        AbstractC1263a.m7047b(lda.m16103C(c2812c), c2812c.f33391f, "progress", new LanguageStatsDetailsViewModel$updateLanguageProgressSelected$1(c2812c, c2812c.f33392g.f71795a, null));
        return xfa.f68157a;
    }
}
