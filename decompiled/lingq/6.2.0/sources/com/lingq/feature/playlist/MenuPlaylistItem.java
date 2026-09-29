package com.lingq.feature.playlist;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
public enum MenuPlaylistItem {
    RemovePlaylist(com.lingq.core.p012ui.R$string.lesson_remove_from_playlist),
    OpenLesson(com.lingq.core.p012ui.R$string.lingq_open_lesson),
    OpenCourse(com.lingq.core.p012ui.R$string.lesson_view_course),
    LessonInfo(R$string.lesson_view_lesson_info),
    Download(R$string.ui_download);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int title;

    MenuPlaylistItem(int i) {
        this.title = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getTitle() {
        return this.title;
    }
}
