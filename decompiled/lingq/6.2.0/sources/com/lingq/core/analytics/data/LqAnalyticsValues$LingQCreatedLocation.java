package com.lingq.core.analytics.data;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum LqAnalyticsValues$LingQCreatedLocation {
    Page("page"),
    Sentence("sentence"),
    PagingPrompt("paging prompt"),
    VocabImport("vocab import"),
    AiChat("ai chat"),
    LessonComplete("lesson complete"),
    VideoMode("video mode"),
    Onboarding("onboarding");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    LqAnalyticsValues$LingQCreatedLocation(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
