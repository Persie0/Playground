package com.lingq.core.domain.model.lesson;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum LessonProcessingStatus {
    AI("GENERATE_SIMPLE_TEXT"),
    TIMESTAMPS("GENERATE_TIMESTAMPS"),
    TRANSCRIBE("TRANSCRIBE_AUDIO"),
    IMPORT("FINALIZE_IMPORT"),
    ERROR("ERROR"),
    AI_SPLITTING("TOKENIZE_TEXT"),
    DOWNLOAD_AUDIO("DOWNLOAD_AUDIO"),
    TRANSLATIONS("GENERATE_TRANSLATIONS"),
    NORMALIZE("NORMALIZE_AUDIO"),
    EDIT_TEXT("EDIT_TEXT"),
    GENERATE_TTS("GENERATE_TTS");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    LessonProcessingStatus(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
