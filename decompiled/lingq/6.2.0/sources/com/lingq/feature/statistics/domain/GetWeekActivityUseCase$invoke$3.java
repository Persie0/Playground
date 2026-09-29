package com.lingq.feature.statistics.domain;

import com.lingq.core.domain.model.language.LanguageProgress;
import com.lingq.core.domain.stats.ActivityScore;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0010a8;
import p000.b4b;
import p000.c32;
import p000.c4b;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.statistics.domain.GetWeekActivityUseCase$invoke$3", m4291f = "GetWeekActivityUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetWeekActivityUseCase$invoke$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33430a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetWeekActivityUseCase$invoke$3 getWeekActivityUseCase$invoke$3 = new GetWeekActivityUseCase$invoke$3(2, continuation);
        getWeekActivityUseCase$invoke$3.f33430a = obj;
        return getWeekActivityUseCase$invoke$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetWeekActivityUseCase$invoke$3) create((LanguageProgress) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LanguageProgress languageProgress = (LanguageProgress) this.f33430a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (languageProgress == null) {
            return b4b.f7939a;
        }
        double d = languageProgress.f19052f;
        int i = languageProgress.f19062p;
        ActivityScore.Companion.getClass();
        ActivityScore activityScoreM168a = C0010a8.m168a(d, i);
        double d2 = languageProgress.f19063q;
        double d3 = languageProgress.f19056j;
        ActivityScore activityScoreM168a2 = C0010a8.m168a(d2, d3);
        int i2 = languageProgress.f19061o;
        int i3 = languageProgress.f19058l;
        return new c4b((int) d, i, activityScoreM168a, d2, d3, activityScoreM168a2, i2, i3, C0010a8.m168a(i2, i3));
    }
}
