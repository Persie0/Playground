package com.kochava.tracker.datapoint.internal;

/* JADX INFO: loaded from: classes.dex */
public enum SdkTimingAction {
    InitStarted("a"),
    InitCompleted("b"),
    InstallStarted("c"),
    InstallReady("d"),
    HostSleepDisabled("e"),
    PrivacySleepDisabled("f"),
    ConsentUnrestricted("g"),
    InstantAppDeeplinkReady("h"),
    UserAgentCompleted("i"),
    AttCompleted("j"),
    AppleSearchAdsCompleted("k"),
    GoogleReferrerCompleted("l"),
    HuaweiReferrerCompleted("m"),
    SamsungReferrerCompleted("n"),
    MetaReferrerCompleted("o"),
    SamsungCloudAdvertisingIdCompleted("p");

    public final String key;

    SdkTimingAction(String str) {
        this.key = str;
    }
}
