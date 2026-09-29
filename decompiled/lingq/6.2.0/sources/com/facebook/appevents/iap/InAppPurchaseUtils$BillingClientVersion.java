package com.facebook.appevents.iap;

/* JADX INFO: loaded from: classes.dex */
public enum InAppPurchaseUtils$BillingClientVersion {
    NONE("none"),
    V1("Android-GPBL-V1"),
    V2_V4("Android-GPBL-V2-V4"),
    V5_V7("Android-GPBL-V5-V7");

    private final String type;

    InAppPurchaseUtils$BillingClientVersion(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
