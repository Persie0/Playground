package com.lingq.core.domain.model.language;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum LanguageProgressMetric {
    KnownWords("knownWords"),
    LingQsCreated("createdLingQs"),
    LearnedLingQs("learnedWords"),
    ListeningHours("listening"),
    WordsOfReading("reading"),
    CoinsEarned("earnedCoins"),
    SpeakingHours("speaking"),
    WrittenWords("writing"),
    StudyTime("studyTime"),
    ReadingSpeed("wpm");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String key;

    LanguageProgressMetric(String str) {
        this.key = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }
}
