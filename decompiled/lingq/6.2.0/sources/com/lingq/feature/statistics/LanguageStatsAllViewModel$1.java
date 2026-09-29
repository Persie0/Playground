package com.lingq.feature.statistics;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.C3540rl;
import p000.aj3;
import p000.c32;
import p000.g41;
import p000.lda;
import p000.nn1;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsAllViewModel$1", m4291f = "LanguageStatsAllViewModel.kt", m4292l = {159}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsAllViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2810a f33133b;

    /* JADX INFO: renamed from: com.lingq.feature.statistics.LanguageStatsAllViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.statistics.LanguageStatsAllViewModel$1$1", m4291f = "LanguageStatsAllViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27801 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Language f33134a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ LanguageProgressPeriod f33135b;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C27801 c27801 = new C27801(3, (Continuation) obj3);
            c27801.f33134a = (Language) obj;
            c27801.f33135b = (LanguageProgressPeriod) obj2;
            return c27801.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Language language = this.f33134a;
            LanguageProgressPeriod languageProgressPeriod = this.f33135b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return new Pair(language, languageProgressPeriod);
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.statistics.LanguageStatsAllViewModel$1$2 */
    @c32(m4290c = "com.lingq.feature.statistics.LanguageStatsAllViewModel$1$2", m4291f = "LanguageStatsAllViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27812 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33136a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2810a f33137b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27812(C2810a c2810a, Continuation continuation) {
            super(2, continuation);
            this.f33137b = c2810a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27812 c27812 = new C27812(this.f33137b, continuation);
            c27812.f33136a = obj;
            return c27812;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27812 c27812 = (C27812) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27812.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f33136a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) pair.f47624b;
            C2810a c2810a = this.f33137b;
            g41 g41VarM16103C = lda.m16103C(c2810a);
            nn1 nn1Var = c2810a.f33379d;
            AbstractC1263a.m7047b(g41VarM16103C, nn1Var, AbstractC3393o1.m17734i("observe ", languageProgressPeriod.getKey()), new LanguageStatsAllViewModel$observeLanguageStats$1(c2810a, languageProgressPeriod, null));
            AbstractC1263a.m7047b(lda.m16103C(c2810a), nn1Var, AbstractC3393o1.m17734i("languageStats ", languageProgressPeriod.getKey()), new LanguageStatsAllViewModel$updateLanguageStats$1(c2810a, languageProgressPeriod, null));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsAllViewModel$1(C2810a c2810a, Continuation continuation) {
        super(2, continuation);
        this.f33133b = c2810a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageStatsAllViewModel$1(this.f33133b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageStatsAllViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33132a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2810a c2810a = this.f33133b;
            C3228h c3228h = new C3228h(new C3540rl(c2810a.f33377b.mo4572B0(), 5), c2810a.f33380e, new C27801(3, null));
            C27812 c27812 = new C27812(c2810a, null);
            this.f33132a = 1;
            if (AbstractC3224d.m15529h(c3228h, c27812, this) == coroutineSingletons) {
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
