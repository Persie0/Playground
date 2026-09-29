package com.lingq.feature.statistics;

import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.p33;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$addToStat$1", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {331}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDetailsViewModel$addToStat$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2812c f33197b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LanguageProgressInterval f33198c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LanguageProgressMetric f33199d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ double f33200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDetailsViewModel$addToStat$1(C2812c c2812c, LanguageProgressInterval languageProgressInterval, LanguageProgressMetric languageProgressMetric, double d, Continuation continuation) {
        super(2, continuation);
        this.f33197b = c2812c;
        this.f33198c = languageProgressInterval;
        this.f33199d = languageProgressMetric;
        this.f33200e = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageStatsDetailsViewModel$addToStat$1(this.f33197b, this.f33198c, this.f33199d, this.f33200e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageStatsDetailsViewModel$addToStat$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33196a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2812c c2812c = this.f33197b;
            p33 p33Var = c2812c.f33389d;
            String strMo4589b2 = c2812c.f33387b.mo4589b2();
            this.f33196a = 1;
            if (p33Var.m18873Q(strMo4589b2, this.f33198c, this.f33199d, this.f33200e, this) == coroutineSingletons) {
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
