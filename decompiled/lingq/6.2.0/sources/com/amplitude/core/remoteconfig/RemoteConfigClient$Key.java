package com.amplitude.core.remoteconfig;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum RemoteConfigClient$Key {
    ANALYTICS_SDK("analyticsSDK.androidSDK"),
    DIAGNOSTICS("diagnostics.androidSDK"),
    SESSION_REPLAY_PRIVACY_CONFIG("sessionReplay.sr_android_privacy_config"),
    SESSION_REPLAY_SAMPLING_CONFIG("sessionReplay.sr_android_sampling_config");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    RemoteConfigClient$Key(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
