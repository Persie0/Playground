package com.facebook.internal;

import android.R;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.kochava.core.BuildConfig;
import dm.C5207g;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import p067d8.C5072l;
import p067d8.C5073m;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureManager {

    /* JADX INFO: renamed from: a */
    public static final FeatureManager f11546a = new FeatureManager();

    /* JADX INFO: renamed from: b */
    public static final HashMap f11547b = new HashMap();

    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, m13365d2 = {"Lcom/facebook/internal/FeatureManager$Feature;", "", "", "toString", "toKey", "", "code", "I", "getParent", "()Lcom/facebook/internal/FeatureManager$Feature;", "parent", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "Unknown", BuildConfig.SDK_MODULE_NAME, "AppEvents", "CodelessEvents", "CloudBridge", "RestrictiveDataFiltering", "AAM", "PrivacyProtection", "SuggestedEvents", "IntelligentIntegrity", "ModelRequest", "EventDeactivation", "OnDeviceEventProcessing", "OnDevicePostInstallEventProcessing", "IapLogging", "IapLoggingLib2", "Instrument", "CrashReport", "CrashShield", "ThreadCheck", "ErrorReport", "AnrReport", "Monitoring", "ServiceUpdateCompliance", "Megatron", "Elora", "Login", "ChromeCustomTabsPrefetching", "IgnoreAppSwitchToLoggedOut", "BypassAppSwitch", "Share", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public enum Feature {
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
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
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
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(33554432);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        private final int code;

        /* JADX INFO: renamed from: com.facebook.internal.FeatureManager$Feature$a, reason: from kotlin metadata */
        public static final class Companion {
            /* JADX INFO: renamed from: a */
            public static Feature m6667a(int i10) {
                Feature[] featureArrValuesCustom = Feature.valuesCustom();
                int length = featureArrValuesCustom.length;
                int i11 = 0;
                while (i11 < length) {
                    Feature feature = featureArrValuesCustom[i11];
                    i11++;
                    if (feature.code == i10) {
                        return feature;
                    }
                }
                return Feature.Unknown;
            }
        }

        /* JADX INFO: renamed from: com.facebook.internal.FeatureManager$Feature$b */
        public /* synthetic */ class C2303b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f11548a;

            static {
                int[] iArr = new int[Feature.valuesCustom().length];
                iArr[Feature.Core.ordinal()] = 1;
                iArr[Feature.AppEvents.ordinal()] = 2;
                iArr[Feature.CodelessEvents.ordinal()] = 3;
                iArr[Feature.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[Feature.Instrument.ordinal()] = 5;
                iArr[Feature.CrashReport.ordinal()] = 6;
                iArr[Feature.CrashShield.ordinal()] = 7;
                iArr[Feature.ThreadCheck.ordinal()] = 8;
                iArr[Feature.ErrorReport.ordinal()] = 9;
                iArr[Feature.AnrReport.ordinal()] = 10;
                iArr[Feature.AAM.ordinal()] = 11;
                iArr[Feature.CloudBridge.ordinal()] = 12;
                iArr[Feature.PrivacyProtection.ordinal()] = 13;
                iArr[Feature.SuggestedEvents.ordinal()] = 14;
                iArr[Feature.IntelligentIntegrity.ordinal()] = 15;
                iArr[Feature.ModelRequest.ordinal()] = 16;
                iArr[Feature.EventDeactivation.ordinal()] = 17;
                iArr[Feature.OnDeviceEventProcessing.ordinal()] = 18;
                iArr[Feature.OnDevicePostInstallEventProcessing.ordinal()] = 19;
                iArr[Feature.IapLogging.ordinal()] = 20;
                iArr[Feature.IapLoggingLib2.ordinal()] = 21;
                iArr[Feature.Monitoring.ordinal()] = 22;
                iArr[Feature.Megatron.ordinal()] = 23;
                iArr[Feature.Elora.ordinal()] = 24;
                iArr[Feature.ServiceUpdateCompliance.ordinal()] = 25;
                iArr[Feature.Login.ordinal()] = 26;
                iArr[Feature.ChromeCustomTabsPrefetching.ordinal()] = 27;
                iArr[Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 28;
                iArr[Feature.BypassAppSwitch.ordinal()] = 29;
                iArr[Feature.Share.ordinal()] = 30;
                f11548a = iArr;
            }
        }

        Feature(int i10) {
            this.code = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Feature[] valuesCustom() {
            Feature[] featureArrValuesCustom = values();
            return (Feature[]) Arrays.copyOf(featureArrValuesCustom, featureArrValuesCustom.length);
        }

        public final Feature getParent() {
            int i10 = this.code;
            if ((i10 & 255) > 0) {
                INSTANCE.getClass();
                return Companion.m6667a(i10 & (-256));
            }
            if ((65280 & i10) > 0) {
                INSTANCE.getClass();
                return Companion.m6667a(i10 & (-65536));
            }
            if ((16711680 & i10) > 0) {
                INSTANCE.getClass();
                return Companion.m6667a(i10 & (-16777216));
            }
            INSTANCE.getClass();
            return Companion.m6667a(0);
        }

        public final String toKey() {
            return C5207g.m11116k(this, "FBSDKFeature");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Enum
        public String toString() {
            switch (C2303b.f11548a[ordinal()]) {
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
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return "CrashReport";
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
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
                    return "ModelRequest";
                case 17:
                    return "EventDeactivation";
                case 18:
                    return "OnDeviceEventProcessing";
                case 19:
                    return "OnDevicePostInstallEventProcessing";
                case 20:
                    return "IAPLogging";
                case 21:
                    return "IAPLoggingLib2";
                case 22:
                    return "Monitoring";
                case 23:
                    return "Megatron";
                case 24:
                    return "Elora";
                case 25:
                    return "ServiceUpdateCompliance";
                case 26:
                    return "LoginKit";
                case 27:
                    return "ChromeCustomTabsPrefetching";
                case 28:
                    return "IgnoreAppSwitchToLoggedOut";
                case 29:
                    return "BypassAppSwitch";
                case 30:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.FeatureManager$a */
    public interface InterfaceC2304a {
        /* JADX INFO: renamed from: h */
        void mo6668h(boolean z10);
    }

    /* JADX INFO: renamed from: com.facebook.internal.FeatureManager$b */
    public /* synthetic */ class C2305b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11549a;

        static {
            int[] iArr = new int[Feature.valuesCustom().length];
            iArr[Feature.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[Feature.Instrument.ordinal()] = 2;
            iArr[Feature.CrashReport.ordinal()] = 3;
            iArr[Feature.CrashShield.ordinal()] = 4;
            iArr[Feature.ThreadCheck.ordinal()] = 5;
            iArr[Feature.ErrorReport.ordinal()] = 6;
            iArr[Feature.AnrReport.ordinal()] = 7;
            iArr[Feature.AAM.ordinal()] = 8;
            iArr[Feature.CloudBridge.ordinal()] = 9;
            iArr[Feature.PrivacyProtection.ordinal()] = 10;
            iArr[Feature.SuggestedEvents.ordinal()] = 11;
            iArr[Feature.IntelligentIntegrity.ordinal()] = 12;
            iArr[Feature.ModelRequest.ordinal()] = 13;
            iArr[Feature.EventDeactivation.ordinal()] = 14;
            iArr[Feature.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[Feature.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[Feature.IapLogging.ordinal()] = 17;
            iArr[Feature.IapLoggingLib2.ordinal()] = 18;
            iArr[Feature.ChromeCustomTabsPrefetching.ordinal()] = 19;
            iArr[Feature.Monitoring.ordinal()] = 20;
            iArr[Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 21;
            iArr[Feature.BypassAppSwitch.ordinal()] = 22;
            f11549a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m6664a(InterfaceC2304a interfaceC2304a, Feature feature) {
        C5207g.m11111f(feature, "feature");
        C5073m.m10771c(new C5072l(interfaceC2304a, feature));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6665b(Feature feature) {
        boolean z10;
        switch (C2305b.f11549a[feature.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                z10 = false;
                break;
            default:
                z10 = true;
                break;
        }
        C5073m c5073m = C5073m.f32961a;
        return C5073m.m10770b(feature.toKey(), C8004n.m15872b(), z10);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m6666c(Feature feature) {
        C5207g.m11111f(feature, "feature");
        boolean z10 = false;
        if (Feature.Unknown == feature) {
            return false;
        }
        if (Feature.Core == feature) {
            return true;
        }
        String string = C8004n.m15871a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.toKey(), null);
        if (string != null && C5207g.m11106a(string, "16.0.1")) {
            return false;
        }
        Feature parent = feature.getParent();
        if (parent == feature) {
            return m6665b(feature);
        }
        if (m6666c(parent) && m6665b(feature)) {
            z10 = true;
        }
        return z10;
    }
}
