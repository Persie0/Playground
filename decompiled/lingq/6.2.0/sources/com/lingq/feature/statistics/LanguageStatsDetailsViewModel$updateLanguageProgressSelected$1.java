package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bm4;
import p000.c32;
import p000.gm5;
import p000.oo4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$updateLanguageProgressSelected$1", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {286}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDetailsViewModel$updateLanguageProgressSelected$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33219a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2812c f33220b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LanguageProgressPeriod f33221c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDetailsViewModel$updateLanguageProgressSelected$1(C2812c c2812c, LanguageProgressPeriod languageProgressPeriod, Continuation continuation) {
        super(1, continuation);
        this.f33220b = c2812c;
        this.f33221c = languageProgressPeriod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageStatsDetailsViewModel$updateLanguageProgressSelected$1(this.f33220b, this.f33221c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageStatsDetailsViewModel$updateLanguageProgressSelected$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33219a;
        LanguageProgressInterval languageProgressInterval = null;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2812c c2812c = this.f33220b;
                oo4 oo4Var = c2812c.f33388c;
                String strMo4589b2 = c2812c.f33387b.mo4589b2();
                LanguageProgressPeriod languageProgressPeriod = this.f33221c;
                languageProgressPeriod.getClass();
                switch (bm4.f8683a[languageProgressPeriod.ordinal()]) {
                    case 1:
                        languageProgressInterval = LanguageProgressInterval.Today;
                        break;
                    case 2:
                        languageProgressInterval = LanguageProgressInterval.LastWeek;
                        break;
                    case 3:
                        languageProgressInterval = LanguageProgressInterval.LastTwoWeeks;
                        break;
                    case 4:
                        languageProgressInterval = LanguageProgressInterval.LastMonth;
                        break;
                    case 5:
                        languageProgressInterval = LanguageProgressInterval.LastMonth;
                        break;
                    case 6:
                        languageProgressInterval = LanguageProgressInterval.LastMonth;
                        break;
                    case 7:
                        languageProgressInterval = LanguageProgressInterval.LastThreeMonths;
                        break;
                    case 8:
                        languageProgressInterval = LanguageProgressInterval.LastSixMonths;
                        break;
                    case 9:
                        languageProgressInterval = LanguageProgressInterval.AllTime;
                        break;
                    default:
                        gm5.m12750e();
                        break;
                }
                this.f33219a = 1;
                if (((C1294j) oo4Var).m7228b(strMo4589b2, languageProgressInterval, this) == coroutineSingletons) {
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
