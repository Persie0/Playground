package com.lingq.core.domain.model.library;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum Sort {
    Position("position"),
    Relevance(null),
    AtoZ("alphabetical"),
    Complete("complete"),
    Incomplete("incomplete"),
    Newest("newest"),
    Oldest("oldest"),
    Opened("recentlyOpened"),
    Imported("recentlyImported"),
    Liked("mostLiked"),
    RecentlyOpened("recentlyOpened"),
    NewWordsPercent("lessDifficult");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    Sort(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
