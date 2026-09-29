package com.lingq.core.domain.model.language;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum AppUsageType {
    Reading("reading"),
    Listening("listening"),
    Review("review"),
    Speaking("speaking");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String key;

    AppUsageType(String str) {
        this.key = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }
}
