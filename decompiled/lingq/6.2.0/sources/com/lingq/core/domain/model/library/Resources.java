package com.lingq.core.domain.model.library;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum Resources {
    ResourceAttachments("attachments"),
    ResourceExercises("exercises"),
    ResourceNotes("lesson_notes"),
    ResourceScript("script_conversions"),
    ResourceTranslations("translations"),
    ResourceVideos("videos");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    Resources(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
