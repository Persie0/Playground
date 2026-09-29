package com.facebook.internal;

import android.R;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import p000.l13;
import p000.m13;

/* JADX INFO: loaded from: classes.dex */
public enum FeatureManager$Feature {
    Unknown(-1),
    Core(0),
    AppEvents(65536),
    CodelessEvents(65792),
    CloudBridge(67584),
    RestrictiveDataFiltering(66048),
    AAM(66304),
    PrivacyProtection(66560),
    SuggestedEvents(66561),
    IntelligentIntegrity(66562),
    ModelRequest(66563),
    ProtectedMode(66564),
    MACARuleMatching(66565),
    BlocklistEvents(66566),
    FilterRedactedEvents(66567),
    FilterSensitiveParams(66568),
    StdParamEnforcement(R.attr.trimPathEnd),
    BannedParamFiltering(R.attr.trimPathOffset),
    EventDeactivation(66816),
    OnDeviceEventProcessing(67072),
    OnDevicePostInstallEventProcessing(67073),
    IapLogging(67328),
    IapLoggingLib2(67329),
    IapLoggingLib5To7(67330),
    AndroidManualImplicitPurchaseDedupe(67331),
    AndroidManualImplicitSubsDedupe(67332),
    AndroidIAPSubscriptionAutoLogging(67333),
    Instrument(131072),
    CrashReport(131328),
    CrashShield(131329),
    ThreadCheck(131330),
    ErrorReport(131584),
    AnrReport(131840),
    Monitoring(196608),
    ServiceUpdateCompliance(196864),
    Megatron(262144),
    Elora(327680),
    GPSARATriggers(393216),
    GPSPACAProcessing(458752),
    GPSTopicsObservation(524288),
    ReferrerForDeepLink(589824),
    Login(16777216),
    ChromeCustomTabsPrefetching(R.attr.theme),
    IgnoreAppSwitchToLoggedOut(R.id.background),
    BypassAppSwitch(R.style.Animation),
    Share(33554432);

    public static final l13 Companion = new l13();
    private final int code;

    FeatureManager$Feature(int i) {
        this.code = i;
    }

    public final FeatureManager$Feature getParent() {
        int i = this.code;
        if ((i & 255) > 0) {
            Companion.getClass();
            return l13.m15739a(i & (-256));
        }
        if ((65280 & i) > 0) {
            Companion.getClass();
            return l13.m15739a(i & (-65536));
        }
        if ((16711680 & i) > 0) {
            Companion.getClass();
            return l13.m15739a(i & (-16777216));
        }
        Companion.getClass();
        return l13.m15739a(0);
    }

    public final String toKey() {
        return "FBSDKFeature" + this;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (m13.f50429a[ordinal()]) {
            case 1:
                return "CoreKit";
            case 2:
                return "AppEvents";
            case 3:
                return "CodelessEvents";
            case 4:
                return "RestrictiveDataFiltering";
            case 5:
                return "Instrument";
            case 6:
                return "CrashReport";
            case 7:
                return "CrashShield";
            case 8:
                return "ThreadCheck";
            case 9:
                return "ErrorReport";
            case 10:
                return "AnrReport";
            case 11:
                return "AAM";
            case 12:
                return "AppEventsCloudbridge";
            case 13:
                return "PrivacyProtection";
            case 14:
                return "SuggestedEvents";
            case 15:
                return "IntelligentIntegrity";
            case 16:
                return "StdParamEnforcement";
            case 17:
                return "ProtectedMode";
            case 18:
                return "BannedParamFiltering";
            case 19:
                return "MACARuleMatching";
            case 20:
                return "BlocklistEvents";
            case 21:
                return "FilterRedactedEvents";
            case 22:
                return "FilterSensitiveParams";
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return "ModelRequest";
            case 24:
                return "EventDeactivation";
            case 25:
                return "OnDeviceEventProcessing";
            case 26:
                return "OnDevicePostInstallEventProcessing";
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return "IAPLogging";
            case 28:
                return "IAPLoggingLib2";
            case 29:
                return "IAPLoggingLib5To7";
            case 30:
                return "AndroidManualImplicitPurchaseDedupe";
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return "AndroidManualImplicitSubsDedupe";
            case 32:
                return "AndroidIAPSubscriptionAutoLogging";
            case 33:
                return "Monitoring";
            case 34:
                return "Megatron";
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                return "Elora";
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return "GPSARATriggers";
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                return "GPSPACAProcessing";
            case 38:
                return "GPSTopicsObservation";
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                return "ReferrerForDeepLink";
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                return "ServiceUpdateCompliance";
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return "LoginKit";
            case 42:
                return "ChromeCustomTabsPrefetching";
            case 43:
                return "IgnoreAppSwitchToLoggedOut";
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                return "BypassAppSwitch";
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                return "ShareKit";
            default:
                return "unknown";
        }
    }
}
