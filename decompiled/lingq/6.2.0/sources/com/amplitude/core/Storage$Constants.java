package com.amplitude.core;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum Storage$Constants {
    LAST_EVENT_ID("last_event_id"),
    PREVIOUS_SESSION_ID("previous_session_id"),
    LAST_EVENT_TIME("last_event_time"),
    OPT_OUT("opt_out"),
    Events("events"),
    APP_VERSION("app_version"),
    APP_BUILD("app_build"),
    REMOTE_CONFIG("remote_config"),
    REMOTE_CONFIG_TIMESTAMP("remote_config_timestamp");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String rawVal;

    Storage$Constants(String str) {
        this.rawVal = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getRawVal() {
        return this.rawVal;
    }
}
