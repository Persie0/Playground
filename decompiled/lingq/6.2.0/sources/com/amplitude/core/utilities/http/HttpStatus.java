package com.amplitude.core.utilities.http;

import kotlin.enums.AbstractC3201a;
import p000.i84;
import p000.y52;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum HttpStatus {
    SUCCESS(200, new i84(200, 299, 1)),
    BAD_REQUEST(400, null, 2, null),
    TIMEOUT(408, null, 2, null),
    PAYLOAD_TOO_LARGE(413, null, 2, null),
    TOO_MANY_REQUESTS(429, null, 2, null),
    FAILED(500, new i84(500, 599, 1));

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final i84 range;

    HttpStatus(int i, i84 i84Var, int i2, y52 y52Var) {
        this(i, (i2 & 2) != 0 ? new i84(i, i, 1) : i84Var);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final i84 getRange() {
        return this.range;
    }

    public final int getStatusCode() {
        return this.range.f40379a;
    }

    HttpStatus(int i, i84 i84Var) {
        this.range = i84Var;
    }
}
