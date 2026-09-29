package com.lingq.core.domain.model.notification;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum MessageType {
    INFO("info"),
    ERROR("error"),
    SUCCESS("success"),
    WARNING("warning");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String level;

    MessageType(String str) {
        this.level = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getLevel() {
        return this.level;
    }
}
