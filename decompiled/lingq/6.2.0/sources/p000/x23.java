package p000;

import com.facebook.internal.FeatureManager$Feature;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x23 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67670a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3086hs f67671b;

    public /* synthetic */ x23(C3086hs c3086hs) {
        this.f67671b = c3086hs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f67670a;
        C3086hs c3086hs = this.f67671b;
        switch (i) {
            case 0:
                c3086hs.getClass();
                break;
            default:
                c3086hs.getClass();
                p13.m18851a(new gm5(12), FeatureManager$Feature.AAM);
                p13.m18851a(new gm5(25), FeatureManager$Feature.RestrictiveDataFiltering);
                p13.m18851a(new gm5(26), FeatureManager$Feature.PrivacyProtection);
                p13.m18851a(new gm5(27), FeatureManager$Feature.EventDeactivation);
                p13.m18851a(new gm5(13), FeatureManager$Feature.BannedParamFiltering);
                p13.m18851a(new gm5(14), FeatureManager$Feature.IapLogging);
                p13.m18851a(new gm5(15), FeatureManager$Feature.StdParamEnforcement);
                p13.m18851a(new gm5(16), FeatureManager$Feature.ProtectedMode);
                p13.m18851a(new gm5(17), FeatureManager$Feature.MACARuleMatching);
                p13.m18851a(new gm5(18), FeatureManager$Feature.BlocklistEvents);
                p13.m18851a(new gm5(19), FeatureManager$Feature.FilterRedactedEvents);
                p13.m18851a(new gm5(20), FeatureManager$Feature.FilterSensitiveParams);
                p13.m18851a(new gm5(21), FeatureManager$Feature.CloudBridge);
                p13.m18851a(new gm5(22), FeatureManager$Feature.GPSARATriggers);
                p13.m18851a(new gm5(23), FeatureManager$Feature.GPSPACAProcessing);
                p13.m18851a(new gm5(24), FeatureManager$Feature.GPSTopicsObservation);
                break;
        }
    }

    public /* synthetic */ x23(C3086hs c3086hs, w23 w23Var) {
        this.f67671b = c3086hs;
    }
}
