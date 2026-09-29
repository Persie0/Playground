package p118fe;

import android.os.StrictMode;
import cf.InterfaceC2005b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import ge.ThreadFactoryC5777a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: fe.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5525q implements InterfaceC2005b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34193a;

    @Override // cf.InterfaceC2005b
    public final Object get() {
        switch (this.f34193a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return null;
            default:
                C5523o<ScheduledExecutorService> c5523o = ExecutorsRegistrar.f16187a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return ExecutorsRegistrar.m9147a(Executors.newFixedThreadPool(4, new ThreadFactoryC5777a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())));
        }
    }
}
