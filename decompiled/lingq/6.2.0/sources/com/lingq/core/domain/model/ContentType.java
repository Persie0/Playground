package com.lingq.core.domain.model;

import kotlin.enums.AbstractC3201a;
import p000.ml1;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum ContentType {
    None("None"),
    Native("Native"),
    MyImports("My Imports"),
    External("External");

    private final String key;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final ml1 Companion = new ml1();

    ContentType(String str) {
        this.key = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }
}
