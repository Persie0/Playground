package p317p7;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import ge.C5789m;
import p150h9.C5931p;
import p291o7.C8002l;
import p402u0.C9362e;

/* JADX INFO: renamed from: p7.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8202i implements FetchedAppSettingsManager.InterfaceC2306a {
    @Override // com.facebook.internal.FetchedAppSettingsManager.InterfaceC2306a
    /* JADX INFO: renamed from: a */
    public final void mo6675a() {
    }

    @Override // com.facebook.internal.FetchedAppSettingsManager.InterfaceC2306a
    /* JADX INFO: renamed from: b */
    public final void mo6676b() {
        FeatureManager featureManager = FeatureManager.f11546a;
        FeatureManager.m6664a(new C5931p(2), FeatureManager.Feature.AAM);
        FeatureManager.m6664a(new C8002l(2), FeatureManager.Feature.RestrictiveDataFiltering);
        FeatureManager.m6664a(new C5789m(1), FeatureManager.Feature.PrivacyProtection);
        FeatureManager.m6664a(new C9362e(5), FeatureManager.Feature.EventDeactivation);
        FeatureManager.m6664a(new C5931p(3), FeatureManager.Feature.IapLogging);
        FeatureManager.m6664a(new C8002l(3), FeatureManager.Feature.CloudBridge);
    }
}
