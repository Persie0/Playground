package com.facebook.internal;

import java.util.EnumSet;
import p000.qb9;

/* JADX INFO: loaded from: classes.dex */
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final EnumSet<SmartLoginOption> ALL;
    public static final qb9 Companion = new qb9();
    private final long value;

    static {
        EnumSet<SmartLoginOption> enumSetAllOf = EnumSet.allOf(SmartLoginOption.class);
        enumSetAllOf.getClass();
        ALL = enumSetAllOf;
    }

    SmartLoginOption(long j) {
        this.value = j;
    }

    public static final EnumSet<SmartLoginOption> parseOptions(long j) {
        Companion.getClass();
        return qb9.m19848a(j);
    }

    public final long getValue() {
        return this.value;
    }
}
