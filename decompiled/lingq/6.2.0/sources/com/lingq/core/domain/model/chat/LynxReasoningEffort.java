package com.lingq.core.domain.model.chat;

import kotlin.enums.AbstractC3201a;
import p000.un5;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum LynxReasoningEffort {
    None("none", "None"),
    Minimal("minimal", "Minimal"),
    Low("low", "Low"),
    Medium("medium", "Medium"),
    High("high", "High"),
    XHigh("xhigh", "Extra high");

    private final String displayName;
    private final String value;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final un5 Companion = new un5();

    LynxReasoningEffort(String str, String str2) {
        this.value = str;
        this.displayName = str2;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getValue() {
        return this.value;
    }
}
