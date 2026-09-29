package p118fe;

import cf.InterfaceC2005b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import ge.ThreadFactoryC5777a;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: fe.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5517i implements InterfaceC2005b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34168a;

    public /* synthetic */ C5517i(int i10) {
        this.f34168a = i10;
    }

    @Override // cf.InterfaceC2005b
    public final Object get() {
        switch (this.f34168a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return Collections.emptySet();
            default:
                C5523o<ScheduledExecutorService> c5523o = ExecutorsRegistrar.f16187a;
                return ExecutorsRegistrar.m9147a(Executors.newCachedThreadPool(new ThreadFactoryC5777a("Firebase Blocking", 11, null)));
        }
    }
}
