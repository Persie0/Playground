package com.kochava.tracker.store.huawei.referrer.internal;

/* JADX INFO: loaded from: classes2.dex */
public enum HuaweiReferrerStatus {
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

    HuaweiReferrerStatus(String str) {
        this.key = str;
    }

    public static HuaweiReferrerStatus fromKey(String str) {
        for (HuaweiReferrerStatus huaweiReferrerStatus : values()) {
            if (huaweiReferrerStatus.key.equals(str)) {
                return huaweiReferrerStatus;
            }
        }
        return NotGathered;
    }
}
