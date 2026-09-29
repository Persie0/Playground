package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.oo4;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$observeLanguageChart$1", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {274}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDetailsViewModel$observeLanguageChart$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2812c f33206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LanguageProgressPeriod f33207c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LanguageProgressMetric f33208d;

    /* JADX INFO: renamed from: com.lingq.feature.statistics.LanguageStatsDetailsViewModel$observeLanguageChart$1$1 */
    @c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$observeLanguageChart$1$1", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27961 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33209a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2812c f33210b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27961(C2812c c2812c, Continuation continuation) {
            super(2, continuation);
            this.f33210b = c2812c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27961 c27961 = new C27961(this.f33210b, continuation);
            c27961.f33209a = obj;
            return c27961;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27961 c27961 = (C27961) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27961.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            List list = (List) this.f33209a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f33210b.f33395j;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, list));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDetailsViewModel$observeLanguageChart$1(LanguageProgressMetric languageProgressMetric, LanguageProgressPeriod languageProgressPeriod, C2812c c2812c, Continuation continuation) {
        super(1, continuation);
        this.f33206b = c2812c;
        this.f33207c = languageProgressPeriod;
        this.f33208d = languageProgressMetric;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageStatsDetailsViewModel$observeLanguageChart$1(this.f33208d, this.f33207c, this.f33206b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageStatsDetailsViewModel$observeLanguageChart$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33205a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2812c c2812c = this.f33206b;
            oo4 oo4Var = c2812c.f33388c;
            c83 c83VarM7235i = ((C1294j) oo4Var).m7235i(c2812c.f33387b.mo4589b2(), this.f33207c, this.f33208d);
            C27961 c27961 = new C27961(c2812c, null);
            this.f33205a = 1;
            if (AbstractC3224d.m15529h(c83VarM7235i, c27961, this) == coroutineSingletons) {
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
