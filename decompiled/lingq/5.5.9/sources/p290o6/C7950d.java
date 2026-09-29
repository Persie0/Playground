package p290o6;

import com.android.installreferrer.api.C2078a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.task.Task;
import p043c7.C1735a;

/* JADX INFO: renamed from: o6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7950d implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InstallReferrerClient f43288a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7944a f43289b;

    public C7950d(C7944a c7944a, C2078a c2078a) {
        this.f43289b = c7944a;
        this.f43288a = c2078a;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
        C7944a c7944a = this.f43289b;
        if (c7944a.f43272f.f43467i) {
            return;
        }
        C7944a.m15752a(c7944a);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i10) {
        C7944a c7944a = this.f43289b;
        if (i10 == 0) {
            Task taskM5474b = C1735a.m5472a(c7944a.f43270d).m5474b();
            int i11 = 0;
            InstallReferrerClient installReferrerClient = this.f43288a;
            taskM5474b.m6584a(new C7946b(this, i11, installReferrerClient));
            taskM5474b.m6585b("ActivityLifeCycleManager#getInstallReferrer", new CallableC7948c(this, i11, installReferrerClient));
            return;
        }
        if (i10 == 1) {
            C2181a c2181aM6433b = c7944a.f43270d.m6433b();
            String str = c7944a.f43270d.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6452d(str, "Install Referrer data not set, connection to Play Store unavailable");
            return;
        }
        if (i10 != 2) {
            return;
        }
        C2181a c2181aM6433b2 = c7944a.f43270d.m6433b();
        String str2 = c7944a.f43270d.f10995a;
        c2181aM6433b2.getClass();
        C2181a.m6452d(str2, "Install Referrer data not set, API not supported by Play Store on device");
    }
}
