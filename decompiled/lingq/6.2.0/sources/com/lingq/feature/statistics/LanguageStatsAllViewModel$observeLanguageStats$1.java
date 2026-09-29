package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.language.LanguageStats;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsAllViewModel$observeLanguageStats$1", m4291f = "LanguageStatsAllViewModel.kt", m4292l = {176}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsAllViewModel$observeLanguageStats$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2810a f33139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LanguageProgressPeriod f33140c;

    /* JADX INFO: renamed from: com.lingq.feature.statistics.LanguageStatsAllViewModel$observeLanguageStats$1$1 */
    @c32(m4290c = "com.lingq.feature.statistics.LanguageStatsAllViewModel$observeLanguageStats$1$1", m4291f = "LanguageStatsAllViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27821 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33141a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2810a f33142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27821(C2810a c2810a, Continuation continuation) {
            super(2, continuation);
            this.f33142b = c2810a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27821 c27821 = new C27821(this.f33142b, continuation);
            c27821.f33141a = obj;
            return c27821;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27821 c27821 = (C27821) create((LanguageStats) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27821.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            LanguageStats languageStats = (LanguageStats) this.f33141a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f33142b.f33381f;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, languageStats));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsAllViewModel$observeLanguageStats$1(C2810a c2810a, LanguageProgressPeriod languageProgressPeriod, Continuation continuation) {
        super(1, continuation);
        this.f33139b = c2810a;
        this.f33140c = languageProgressPeriod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageStatsAllViewModel$observeLanguageStats$1(this.f33139b, this.f33140c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageStatsAllViewModel$observeLanguageStats$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33138a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2810a c2810a = this.f33139b;
            c83 c83VarM7236j = ((C1294j) c2810a.f33378c).m7236j(c2810a.f33377b.mo4589b2(), this.f33140c);
            C27821 c27821 = new C27821(c2810a, null);
            this.f33138a = 1;
            if (AbstractC3224d.m15529h(c83VarM7236j, c27821, this) == coroutineSingletons) {
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
