package com.lingq.shared.uimodel.library;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LibraryShelfType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MyCourses", "Guided", "MiniStories", "MyLessons", "Trending", "Media", "Search", "Books", "Podcasts", "News", "Language", "Pronunciation", "Grammar", "Video", "LessonLibrary", "GetStarted", "SourceSearch", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
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
    SourceSearch("sources_search");

    private final String value;

    LibraryShelfType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
