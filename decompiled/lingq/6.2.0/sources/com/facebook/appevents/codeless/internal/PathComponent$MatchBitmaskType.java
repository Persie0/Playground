package com.facebook.appevents.codeless.internal;

/* JADX INFO: loaded from: classes2.dex */
public enum PathComponent$MatchBitmaskType {
    ID(1),
    TEXT(2),
    TAG(4),
    DESCRIPTION(8),
    HINT(16);

    private final int value;

    PathComponent$MatchBitmaskType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
