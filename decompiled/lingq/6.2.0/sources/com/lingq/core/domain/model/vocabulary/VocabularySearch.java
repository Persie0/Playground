package com.lingq.core.domain.model.vocabulary;

import kotlin.enums.AbstractC3201a;
import p000.f1b;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum VocabularySearch {
    StartsWith("startsWith"),
    EndsWith("endsWith"),
    Contains("contains"),
    PhraseContaining("phraseContaining"),
    MeaningContaining("hintsContaining");

    private final String columnName;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final f1b Companion = new f1b();

    VocabularySearch(String str) {
        this.columnName = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getColumnName() {
        return this.columnName;
    }
}
