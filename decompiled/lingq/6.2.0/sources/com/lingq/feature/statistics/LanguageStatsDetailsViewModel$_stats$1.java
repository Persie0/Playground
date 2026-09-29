package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$_stats$1", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {63}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDetailsViewModel$_stats$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f33192a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f33193b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Language f33194c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2812c f33195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDetailsViewModel$_stats$1(C2812c c2812c, Continuation continuation) {
        super(4, continuation);
        this.f33195d = c2812c;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        LanguageStatsDetailsViewModel$_stats$1 languageStatsDetailsViewModel$_stats$1 = new LanguageStatsDetailsViewModel$_stats$1(this.f33195d, (Continuation) obj4);
        languageStatsDetailsViewModel$_stats$1.f33193b = (e83) obj;
        languageStatsDetailsViewModel$_stats$1.f33194c = (Language) obj2;
        return languageStatsDetailsViewModel$_stats$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f33193b;
        Language language = this.f33194c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33192a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM7234h = ((C1294j) this.f33195d.f33388c).m7234h(language.f19024a, LanguageProgressInterval.LastWeek);
            this.f33193b = null;
            this.f33194c = null;
            this.f33192a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7234h, this) == coroutineSingletons) {
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
