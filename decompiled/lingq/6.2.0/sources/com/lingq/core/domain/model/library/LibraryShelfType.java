package com.lingq.core.domain.model.library;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum LibraryShelfType {
    MyCourses("my_lessons"),
    Guided("guided"),
    MiniStories("mini_stories"),
    MyLessons("my_lessons"),
    Trending("feed"),
    Media("media_feed"),
    Search("search"),
    Books("books"),
    Podcasts("podcasts"),
    News("news"),
    Language("language"),
    Pronunciation("pronunciation"),
    Grammar("grammar"),
    Video("video"),
    LessonLibrary("lesson_library"),
    GetStarted("getting_started"),
    SourceSearch("sources_search"),
    LanguageYoutubers("youtubers"),
    Archive("archive");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    LibraryShelfType(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
