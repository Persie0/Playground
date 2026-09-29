package com.lingq.core.domain.model.settings;

import kotlin.enums.AbstractC3201a;
import p000.y01;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum ChineseTraditionalScript {
    Pinyin(1),
    Simplified(2),
    Off(0);

    private final int serverId;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final y01 Companion = new y01();

    ChineseTraditionalScript(int i) {
        this.serverId = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getServerId() {
        return this.serverId;
    }
}
