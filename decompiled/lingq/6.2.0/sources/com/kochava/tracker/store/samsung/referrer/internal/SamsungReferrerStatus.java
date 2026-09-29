package com.kochava.tracker.store.samsung.referrer.internal;

/* JADX INFO: loaded from: classes2.dex */
public enum SamsungReferrerStatus {
    ServiceDisconnected("service_disconnected"),
    Ok("ok"),
    ServiceUnavailable("service_unavailable"),
    FeatureNotSupported("feature_not_supported"),
    DeveloperError("developer_error"),
    TimedOut("timed_out"),
    MissingDependency("missing_dependency"),
    NotGathered("not_gathered"),
    NoData("no_data"),
    OtherError("other");

    public final String key;

    SamsungReferrerStatus(String str) {
        this.key = str;
    }

    public static SamsungReferrerStatus fromKey(String str) {
        for (SamsungReferrerStatus samsungReferrerStatus : values()) {
            if (samsungReferrerStatus.key.equals(str)) {
                return samsungReferrerStatus;
            }
        }
        return NotGathered;
    }
}
