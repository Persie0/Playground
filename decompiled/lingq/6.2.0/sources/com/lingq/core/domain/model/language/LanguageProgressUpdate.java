package com.lingq.core.domain.model.language;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum LanguageProgressUpdate {
    HoursListening("listeningTime"),
    WordsReading("readWords"),
    WordsWriting("writtenWords"),
    HoursSpeaking("speakingTime");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String key;

    LanguageProgressUpdate(String str) {
        this.key = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }
}
