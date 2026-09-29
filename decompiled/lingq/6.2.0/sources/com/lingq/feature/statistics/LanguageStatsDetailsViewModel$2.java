package com.lingq.feature.statistics;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$StatDetail;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.gm5;
import p000.hm5;
import p000.lo4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$2", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {337}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDetailsViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33188a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2812c f33189b;

    /* JADX INFO: renamed from: com.lingq.feature.statistics.LanguageStatsDetailsViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$2$1", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27951 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33190a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2812c f33191b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27951(C2812c c2812c, Continuation continuation) {
            super(2, continuation);
            this.f33191b = c2812c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27951 c27951 = new C27951(this.f33191b, continuation);
            c27951.f33190a = obj;
            return c27951;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27951 c27951 = (C27951) create((LanguageProgressMetric) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27951.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String value;
            LanguageProgressMetric languageProgressMetric = (LanguageProgressMetric) this.f33190a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            hm5 hm5Var = this.f33191b.f33390e;
            Bundle bundle = new Bundle();
            switch (lo4.f49934a[languageProgressMetric.ordinal()]) {
                case 1:
                    value = LqAnalyticsValues$StatDetail.Listening.getValue();
                    break;
                case 2:
                    value = LqAnalyticsValues$StatDetail.Reading.getValue();
                    break;
                case 3:
                    value = LqAnalyticsValues$StatDetail.Writing.getValue();
                    break;
                case 4:
                    value = LqAnalyticsValues$StatDetail.Speaking.getValue();
                    break;
                case 5:
                    value = LqAnalyticsValues$StatDetail.KnownWords.getValue();
                    break;
                case 6:
                    value = LqAnalyticsValues$StatDetail.Lingqs.getValue();
                    break;
                case 7:
                    value = LqAnalyticsValues$StatDetail.LingqsLearned.getValue();
                    break;
                case 8:
                    value = LqAnalyticsValues$StatDetail.Coins.getValue();
                    break;
                case 9:
                    value = LqAnalyticsValues$StatDetail.StudyTime.getValue();
                    break;
                case 10:
                    value = LqAnalyticsValues$StatDetail.ReadingSpeed.getValue();
                    break;
                default:
                    gm5.m12750e();
                    return null;
            }
            bundle.putString("detail", value);
            ((C1240a) hm5Var).m7025f("stat detail viewed", bundle);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDetailsViewModel$2(C2812c c2812c, Continuation continuation) {
        super(2, continuation);
        this.f33189b = c2812c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageStatsDetailsViewModel$2(this.f33189b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageStatsDetailsViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33188a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2812c c2812c = this.f33189b;
            C3244l c3244l = c2812c.f33394i;
            C27951 c27951 = new C27951(c2812c, null);
            c3244l.getClass();
            this.f33188a = 1;
            if (AbstractC3224d.m15529h(c3244l, c27951, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
