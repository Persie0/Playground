package com.lingq.feature.statistics;

import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.language.LanguageStats;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.bh9;
import p000.c32;
import p000.vz1;
import p000.xfa;
import p000.xh9;
import p000.yh9;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsAllViewModel$statsAllUiState$1", m4291f = "LanguageStatsAllViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsAllViewModel$statsAllUiState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LanguageProgressPeriod f33143a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ LanguageStats f33144b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LanguageStatsAllViewModel$statsAllUiState$1 languageStatsAllViewModel$statsAllUiState$1 = new LanguageStatsAllViewModel$statsAllUiState$1(3, (Continuation) obj3);
        languageStatsAllViewModel$statsAllUiState$1.f33143a = (LanguageProgressPeriod) obj;
        languageStatsAllViewModel$statsAllUiState$1.f33144b = (LanguageStats) obj2;
        return languageStatsAllViewModel$statsAllUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LanguageProgressPeriod languageProgressPeriod = this.f33143a;
        LanguageStats languageStats = this.f33144b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return languageStats == null ? new xh9(languageProgressPeriod) : new yh9(languageProgressPeriod, new bh9(LanguageProgressMetric.CoinsEarned, com.lingq.core.p012ui.R$string.stats_coins_earned, languageStats.f19094p), vz1.m23605K(new bh9(LanguageProgressMetric.StudyTime, com.lingq.core.p012ui.R$string.stats_study_time, languageStats.f19087i), new bh9(LanguageProgressMetric.LingQsCreated, com.lingq.core.p012ui.R$string.complete_lingqs_created, languageStats.f19099u), new bh9(LanguageProgressMetric.KnownWords, com.lingq.core.p012ui.R$string.stats_known_words, languageStats.f19100v), new bh9(LanguageProgressMetric.LearnedLingQs, com.lingq.core.p012ui.R$string.stats_learned_lingqs, languageStats.f19091m), new bh9(LanguageProgressMetric.ListeningHours, com.lingq.core.p012ui.R$string.stats_listening_hours, languageStats.f19093o), new bh9(LanguageProgressMetric.WordsOfReading, com.lingq.core.p012ui.R$string.stats_reading_words, languageStats.f19103y), new bh9(LanguageProgressMetric.SpeakingHours, com.lingq.core.p012ui.R$string.stats_hours_speaking, languageStats.f19078A), new bh9(LanguageProgressMetric.WrittenWords, com.lingq.core.p012ui.R$string.stats_writing_words, languageStats.f19098t), new bh9(LanguageProgressMetric.ReadingSpeed, com.lingq.core.p012ui.R$string.stats_reading_speed, languageStats.f19088j)), vz1.m23605K(new bh9(null, R$string.stats_lessons_completed, languageStats.f19081c), new bh9(null, R$string.stats_lessons_taken, languageStats.f19089k), new bh9(null, R$string.stats_lessons_imported, languageStats.f19101w), new bh9(null, R$string.stats_lessons_published, languageStats.f19086h), new bh9(null, R$string.stats_lessons_shared, languageStats.f19084f)), vz1.m23605K(new bh9(null, R$string.stats_translations_used, languageStats.f19102x), new bh9(null, R$string.stats_translations_created, languageStats.f19090l), new bh9(null, R$string.stats_translations_shared, languageStats.f19085g)));
    }
}
