package com.lingq.core.domain.model.server;

import kotlin.enums.AbstractC3201a;
import p000.jy8;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum ServerEnvironment {
    Production("Production", "https://www.lingq.com/"),
    Qa("QA Server", "https://qa.lingq.com/"),
    Qa4("QA Experimental Server", "https://qa4.lingq.com/");

    private final String baseUrl;
    private final String displayName;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final jy8 Companion = new jy8();

    ServerEnvironment(String str, String str2) {
        this.displayName = str;
        this.baseUrl = str2;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getDisplayName() {
        return this.displayName;
    }
}
