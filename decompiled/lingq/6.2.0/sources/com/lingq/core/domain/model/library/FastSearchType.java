package com.lingq.core.domain.model.library;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum FastSearchType {
    Lesson("content"),
    Course("collection"),
    MoreLessons("more_lessons"),
    MoreCourses("more_courses"),
    Accent("accent"),
    Shelf("shelf");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    FastSearchType(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
