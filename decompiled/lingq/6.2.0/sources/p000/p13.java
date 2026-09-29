package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.facebook.internal.FeatureManager$Feature;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p13 {

    /* JADX INFO: renamed from: a */
    public static final p13 f55426a = new p13();

    /* JADX INFO: renamed from: b */
    public static final HashMap f55427b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static final void m18851a(k13 k13Var, FeatureManager$Feature featureManager$Feature) {
        featureManager$Feature.getClass();
        v23.m23055d(new o13(k13Var, featureManager$Feature));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m18852b(FeatureManager$Feature featureManager$Feature) {
        boolean z;
        featureManager$Feature.getClass();
        boolean z2 = false;
        if (FeatureManager$Feature.Unknown != featureManager$Feature) {
            if (FeatureManager$Feature.Core != featureManager$Feature) {
                String string = sy2.m21766a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(featureManager$Feature.toKey(), null);
                if (string == null || !string.equals("18.2.3")) {
                    FeatureManager$Feature parent = featureManager$Feature.getParent();
                    if (parent == featureManager$Feature) {
                        switch (n13.f52168a[featureManager$Feature.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
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
                            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            case 24:
                            case 25:
                            case 26:
                            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            case 28:
                            case 29:
                            case 30:
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                break;
                            default:
                                z2 = true;
                                break;
                        }
                        return v23.m23054b(featureManager$Feature.toKey(), sy2.m21767b(), z2);
                    }
                    if (m18852b(parent)) {
                        switch (n13.f52168a[featureManager$Feature.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
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
                            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            case 24:
                            case 25:
                            case 26:
                            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            case 28:
                            case 29:
                            case 30:
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                z = false;
                                break;
                            default:
                                z = true;
                                break;
                        }
                        if (v23.m23054b(featureManager$Feature.toKey(), sy2.m21767b(), z)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
