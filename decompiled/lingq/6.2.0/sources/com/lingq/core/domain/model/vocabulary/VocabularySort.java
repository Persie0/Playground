package com.lingq.core.domain.model.vocabulary;

import kotlin.enums.AbstractC3201a;
import p000.m1b;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum VocabularySort {
    AtoZ("term", "alpha"),
    CreationDate("id", "date"),
    Status("status", "status"),
    Importance("importance", "importance");

    private final String roomColumnName;
    private final String serverSortName;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final m1b Companion = new m1b();

    VocabularySort(String str, String str2) {
        this.roomColumnName = str;
        this.serverSortName = str2;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getRoomColumnName() {
        return this.roomColumnName;
    }

    public final String getServerSortName() {
        return this.serverSortName;
    }
}
