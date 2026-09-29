package com.lingq.core.domain.model.review;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum ReviewType {
    Page,
    SrsDue,
    All,
    VocabularySRS,
    VocabularyPhrases,
    VocabularyAll,
    Integrated,
    IntegratedWord;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
