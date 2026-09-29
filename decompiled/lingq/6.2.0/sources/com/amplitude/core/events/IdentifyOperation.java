package com.amplitude.core.events;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum IdentifyOperation {
    SET("$set"),
    SET_ONCE("$setOnce"),
    ADD("$add"),
    APPEND("$append"),
    CLEAR_ALL("$clearAll"),
    PREPEND("$prepend"),
    UNSET("$unset"),
    PRE_INSERT("$preInsert"),
    POST_INSERT("$postInsert"),
    REMOVE("$remove");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String operationType;

    IdentifyOperation(String str) {
        this.operationType = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getOperationType() {
        return this.operationType;
    }
}
