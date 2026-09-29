package com.clevertap.android.sdk.inapp;

/* JADX INFO: loaded from: classes.dex */
public enum CTInAppType {
    CTInAppTypeHTML("html"),
    CTInAppTypeCoverHTML("coverHtml"),
    CTInAppTypeInterstitialHTML("interstitialHtml"),
    CTInAppTypeHeaderHTML("headerHtml"),
    CTInAppTypeFooterHTML("footerHtml"),
    CTInAppTypeHalfInterstitialHTML("halfInterstitialHtml"),
    CTInAppTypeCover("cover"),
    CTInAppTypeInterstitial("interstitial"),
    CTInAppTypeHalfInterstitial("half-interstitial"),
    CTInAppTypeHeader("header-template"),
    CTInAppTypeFooter("footer-template"),
    CTInAppTypeAlert("alert-template"),
    CTInAppTypeCoverImageOnly("cover-image"),
    CTInAppTypeInterstitialImageOnly("interstitial-image"),
    CTInAppTypeHalfInterstitialImageOnly("half-interstitial-image");

    private final String inAppType;

    CTInAppType(String str) {
        this.inAppType = str;
    }

    public static CTInAppType fromString(String str) {
        str.getClass();
        switch (str) {
            case "half-interstitial-image":
                return CTInAppTypeHalfInterstitialImageOnly;
            case "cover-image":
                return CTInAppTypeCoverImageOnly;
            case "halfInterstitialHtml":
                return CTInAppTypeHalfInterstitialHTML;
            case "interstitial-image":
                return CTInAppTypeInterstitialImageOnly;
            case "interstitialHtml":
                return CTInAppTypeInterstitialHTML;
            case "footer-template":
                return CTInAppTypeFooter;
            case "alert-template":
                return CTInAppTypeAlert;
            case "html":
                return CTInAppTypeHTML;
            case "cover":
                return CTInAppTypeCover;
            case "interstitial":
                return CTInAppTypeInterstitial;
            case "half-interstitial":
                return CTInAppTypeHalfInterstitial;
            case "header-template":
                return CTInAppTypeHeader;
            case "footerHtml":
                return CTInAppTypeFooterHTML;
            case "headerHtml":
                return CTInAppTypeHeaderHTML;
            case "coverHtml":
                return CTInAppTypeCoverHTML;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.inAppType;
    }
}
