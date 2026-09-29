package p431v7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.appevents.p050ml.ModelManager;
import p029b8.C1338d;
import p173i8.C6205a;

/* JADX INFO: renamed from: v7.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC9660d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49456a;

    public /* synthetic */ RunnableC9660d(int i10) {
        this.f49456a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49456a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                if (!C6205a.m12742b(C9661e.class)) {
                    try {
                        C9661e.f49457a.m18121a();
                    } catch (Throwable th2) {
                        C6205a.m12741a(C9661e.class, th2);
                    }
                    break;
                }
                break;
            default:
                ModelManager modelManager = ModelManager.f11524a;
                if (!C6205a.m12742b(ModelManager.class)) {
                    try {
                        C1338d.m4914a();
                    } catch (Throwable th3) {
                        C6205a.m12741a(ModelManager.class, th3);
                        return;
                    }
                    break;
                }
                break;
        }
    }
}
