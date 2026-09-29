package p000;

import com.facebook.internal.FeatureManager$Feature;

/* JADX INFO: loaded from: classes.dex */
public final class l13 {
    /* JADX INFO: renamed from: a */
    public static FeatureManager$Feature m15739a(int i) {
        for (FeatureManager$Feature featureManager$Feature : FeatureManager$Feature.values()) {
            if (featureManager$Feature.code == i) {
                return featureManager$Feature;
            }
        }
        return FeatureManager$Feature.Unknown;
    }
}
