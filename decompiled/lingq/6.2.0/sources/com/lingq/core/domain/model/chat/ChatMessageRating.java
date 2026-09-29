package com.lingq.core.domain.model.chat;

import kotlin.enums.AbstractC3201a;
import p000.pw0;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum ChatMessageRating {
    Like("like"),
    Dislike("dislike");

    private final String value;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final pw0 Companion = new pw0();

    ChatMessageRating(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
