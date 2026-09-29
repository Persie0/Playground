package com.kochava.tracker.installreferrer.internal;

/* JADX INFO: loaded from: classes.dex */
public enum InstallReferrerStatus {
    ServiceDisconnected("service_disconnected"),
    Ok("ok"),
    ServiceUnavailable("service_unavailable"),
    FeatureNotSupported("feature_not_supported"),
    DeveloperError("developer_error"),
    TimedOut("timed_out"),
    MissingDependency("missing_dependency"),
    NotGathered("not_gathered"),
    OtherError("other");

    public final String key;

    InstallReferrerStatus(String str) {
        this.key = str;
    }

    public static InstallReferrerStatus fromKey(String str) {
        for (InstallReferrerStatus installReferrerStatus : values()) {
            if (installReferrerStatus.key.equals(str)) {
                return installReferrerStatus;
            }
        }
        return NotGathered;
    }
}
