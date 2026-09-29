package com.lingq.feature.statistics;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.g41;
import p000.lda;
import p000.nn1;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$1", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {230}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDetailsViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33182a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2812c f33183b;

    /* JADX INFO: renamed from: com.lingq.feature.statistics.LanguageStatsDetailsViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$1$1", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27931 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ LanguageProgressMetric f33184a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ LanguageProgressPeriod f33185b;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C27931 c27931 = new C27931(3, (Continuation) obj3);
            c27931.f33184a = (LanguageProgressMetric) obj;
            c27931.f33185b = (LanguageProgressPeriod) obj2;
            return c27931.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LanguageProgressMetric languageProgressMetric = this.f33184a;
            LanguageProgressPeriod languageProgressPeriod = this.f33185b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return new Pair(languageProgressMetric, languageProgressPeriod);
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.statistics.LanguageStatsDetailsViewModel$1$2 */
    @c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$1$2", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27942 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33186a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2812c f33187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27942(C2812c c2812c, Continuation continuation) {
            super(2, continuation);
            this.f33187b = c2812c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27942 c27942 = new C27942(this.f33187b, continuation);
            c27942.f33186a = obj;
            return c27942;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27942 c27942 = (C27942) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27942.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f33186a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LanguageProgressMetric languageProgressMetric = (LanguageProgressMetric) pair.f47623a;
            LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) pair.f47624b;
            C2812c c2812c = this.f33187b;
            g41 g41VarM16103C = lda.m16103C(c2812c);
            nn1 nn1Var = c2812c.f33391f;
            AbstractC1263a.m7047b(g41VarM16103C, nn1Var, "progress local", new LanguageStatsDetailsViewModel$observeLanguageChart$1(languageProgressMetric, languageProgressPeriod, c2812c, null));
            AbstractC1263a.m7047b(lda.m16103C(c2812c), nn1Var, "chart", new LanguageStatsDetailsViewModel$updateLanguageChart$1((LanguageProgressMetric) pair.f47623a, languageProgressPeriod, c2812c, null));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDetailsViewModel$1(C2812c c2812c, Continuation continuation) {
        super(2, continuation);
        this.f33183b = c2812c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageStatsDetailsViewModel$1(this.f33183b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageStatsDetailsViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33182a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2812c c2812c = this.f33183b;
            C3228h c3228h = new C3228h(c2812c.f33394i, c2812c.f33393h, new C27931(3, null));
            C27942 c27942 = new C27942(c2812c, null);
            this.f33182a = 1;
            if (AbstractC3224d.m15529h(c3228h, c27942, this) == coroutineSingletons) {
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
