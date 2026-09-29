package com.lingq.core.domain.model.lesson;

import kotlin.enums.AbstractC3201a;
import p000.eu7;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum ReaderBookmarkMode {
    Page("page"),
    Sentence("sentence"),
    VideoScroll("videoScroll"),
    VideoImmersive("videoImmersive"),
    Karaoke("karaoke");

    private final String wire;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final eu7 Companion = new eu7();

    ReaderBookmarkMode(String str) {
        this.wire = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getWire() {
        return this.wire;
    }
}
