package com.lingq.core.domain.model.settings;

import kotlin.enums.AbstractC3201a;
import p000.xc4;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum JapaneseScript {
    Romaji(1),
    Hiragana(2),
    Furigana(3),
    Off(0);

    private final int serverId;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final xc4 Companion = new xc4();

    JapaneseScript(int i) {
        this.serverId = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getServerId() {
        return this.serverId;
    }
}
