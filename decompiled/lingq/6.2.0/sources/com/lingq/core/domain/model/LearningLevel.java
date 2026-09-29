package com.lingq.core.domain.model;

import kotlin.enums.AbstractC3201a;
import p000.qw4;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum LearningLevel {
    Beginner1("1", "Beginner 1", "A1", "B1"),
    Beginner2("2", "Beginner 2", "A2", "B2"),
    Intermediate1("3", "Intermediate 1", "B1", "I1"),
    Intermediate2("4", "Intermediate 2", "B2", "I2"),
    Advanced1("5", "Advanced 1", "C1", "A1"),
    Advanced2("6", "Advanced 2", "C2", "A2");

    private final String abbrvName;
    private final String displayName;
    private final String explainName;
    private final String serverName;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final qw4 Companion = new qw4();

    LearningLevel(String str, String str2, String str3, String str4) {
        this.serverName = str;
        this.displayName = str2;
        this.explainName = str3;
        this.abbrvName = str4;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getAbbrvName() {
        return this.abbrvName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getExplainName() {
        return this.explainName;
    }

    public final String getServerName() {
        return this.serverName;
    }
}
