package p067d8;

import android.os.RemoteException;
import com.android.installreferrer.api.C2078a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import dm.C5207g;
import kotlin.text.C7076b;
import p173i8.C6205a;
import p317p7.C8201h;

/* JADX INFO: renamed from: d8.q */
/* JADX INFO: loaded from: classes.dex */
public final class C5077q implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InstallReferrerClient f32984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5076p.a f32985b;

    public C5077q(C2078a c2078a, C8201h.a.C10666a c10666a) {
        this.f32984a = c2078a;
        this.f32985b = c10666a;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i10) {
        if (C6205a.m12742b(this)) {
            return;
        }
        InstallReferrerClient installReferrerClient = this.f32984a;
        try {
            if (i10 == 0) {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    C5207g.m11110e(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (C7076b.m14278X2(installReferrer2, "fb", false) || C7076b.m14278X2(installReferrer2, "facebook", false))) {
                        this.f32985b.mo10775a(installReferrer2);
                    }
                    C5076p.m10774a();
                } catch (RemoteException unused) {
                    return;
                }
            } else if (i10 == 2) {
                C5076p.m10774a();
            }
            try {
                installReferrerClient.endConnection();
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
