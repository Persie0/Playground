package com.lingq.core.data.domain;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum YouTubeSubtitleFormat {
    TTML("ttml", "text/ttml"),
    SRV3("srv3", "text/srv3"),
    JSON3("json3", "application/json");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String contentType;
    private final String format;

    YouTubeSubtitleFormat(String str, String str2) {
        this.format = str;
        this.contentType = str2;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getFormat() {
        return this.format;
    }
}
