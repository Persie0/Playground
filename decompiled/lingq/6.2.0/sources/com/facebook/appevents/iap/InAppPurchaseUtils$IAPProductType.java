package com.facebook.appevents.iap;

/* JADX INFO: loaded from: classes2.dex */
public enum InAppPurchaseUtils$IAPProductType {
    INAPP("inapp"),
    SUBS("subs");

    private final String type;

    InAppPurchaseUtils$IAPProductType(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
