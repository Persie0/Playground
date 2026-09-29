package com.kochava.tracker.store.google.referrer.internal;

/* JADX INFO: loaded from: classes.dex */
public enum GoogleReferrerStatus {
    ServiceDisconnected("service_disconnected"),
    Ok("ok"),
    ServiceUnavailable("service_unavailable"),
    FeatureNotSupported("feature_not_supported"),
    DeveloperError("developer_error"),
    TimedOut("timed_out"),
    MissingDependency("missing_dependency"),
    PermissionError("permission_error"),
    NotGathered("not_gathered"),
    NoData("no_data"),
    OtherError("other");

    public final String key;

    GoogleReferrerStatus(String str) {
        this.key = str;
    }

    public static GoogleReferrerStatus fromKey(String str) {
        for (GoogleReferrerStatus googleReferrerStatus : values()) {
            if (googleReferrerStatus.key.equals(str)) {
                return googleReferrerStatus;
            }
        }
        return NotGathered;
    }
}
