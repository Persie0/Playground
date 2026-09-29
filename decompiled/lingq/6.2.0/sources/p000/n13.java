package p000;

import com.facebook.internal.FeatureManager$Feature;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n13 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52168a;

    static {
        int[] iArr = new int[FeatureManager$Feature.values().length];
        try {
            iArr[FeatureManager$Feature.RestrictiveDataFiltering.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeatureManager$Feature.Instrument.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FeatureManager$Feature.CrashReport.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FeatureManager$Feature.CrashShield.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FeatureManager$Feature.ThreadCheck.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FeatureManager$Feature.ErrorReport.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[FeatureManager$Feature.AnrReport.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[FeatureManager$Feature.AAM.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[FeatureManager$Feature.CloudBridge.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[FeatureManager$Feature.PrivacyProtection.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[FeatureManager$Feature.SuggestedEvents.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[FeatureManager$Feature.IntelligentIntegrity.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[FeatureManager$Feature.ModelRequest.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[FeatureManager$Feature.EventDeactivation.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[FeatureManager$Feature.OnDeviceEventProcessing.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[FeatureManager$Feature.OnDevicePostInstallEventProcessing.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[FeatureManager$Feature.IapLogging.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[FeatureManager$Feature.IapLoggingLib2.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[FeatureManager$Feature.IapLoggingLib5To7.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[FeatureManager$Feature.AndroidManualImplicitPurchaseDedupe.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[FeatureManager$Feature.AndroidManualImplicitSubsDedupe.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[FeatureManager$Feature.AndroidIAPSubscriptionAutoLogging.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[FeatureManager$Feature.BannedParamFiltering.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[FeatureManager$Feature.ProtectedMode.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[FeatureManager$Feature.StdParamEnforcement.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[FeatureManager$Feature.MACARuleMatching.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[FeatureManager$Feature.BlocklistEvents.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[FeatureManager$Feature.FilterRedactedEvents.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[FeatureManager$Feature.FilterSensitiveParams.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[FeatureManager$Feature.ChromeCustomTabsPrefetching.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[FeatureManager$Feature.Monitoring.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[FeatureManager$Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[FeatureManager$Feature.BypassAppSwitch.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[FeatureManager$Feature.GPSARATriggers.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[FeatureManager$Feature.GPSPACAProcessing.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[FeatureManager$Feature.GPSTopicsObservation.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[FeatureManager$Feature.ReferrerForDeepLink.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        f52168a = iArr;
    }
}
