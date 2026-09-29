package com.amplitude.common;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum Logger$LogMode {
    DEBUG(1),
    INFO(2),
    WARN(3),
    ERROR(4),
    OFF(5);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    Logger$LogMode(int i) {
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
