package com.lingq.core.domain.library;

import com.lingq.core.domain.model.language.LanguageProgress;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetLibraryStatsUseCase$invoke$5", m4291f = "GetLibraryStatsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLibraryStatsUseCase$invoke$5 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LanguageStudyStats f18761a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ LanguageProgress f18762b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetLibraryStatsUseCase$invoke$5 getLibraryStatsUseCase$invoke$5 = new GetLibraryStatsUseCase$invoke$5(3, (Continuation) obj3);
        getLibraryStatsUseCase$invoke$5.f18761a = (LanguageStudyStats) obj;
        getLibraryStatsUseCase$invoke$5.f18762b = (LanguageProgress) obj2;
        return getLibraryStatsUseCase$invoke$5.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LanguageStudyStats languageStudyStats = this.f18761a;
        LanguageProgress languageProgress = this.f18762b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(languageStudyStats, languageProgress);
    }
}
