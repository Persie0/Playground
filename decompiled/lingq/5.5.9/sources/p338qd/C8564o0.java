package p338qd;

import ae.C0062b;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: qd.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8564o0 implements InterfaceC9271s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45934a;

    public /* synthetic */ C8564o0(int i10) {
        this.f45934a = i10;
    }

    @Override // td.InterfaceC9271s
    public final /* synthetic */ Object zza() {
        switch (this.f45934a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C8561n0();
            case 1:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: qd.s1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return new Thread(runnable, "AssetPackBackgroundExecutor");
                    }
                });
                C0062b.m271G2(executorServiceNewSingleThreadExecutor);
                return executorServiceNewSingleThreadExecutor;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: qd.t1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return new Thread(runnable, "UpdateListenerExecutor");
                    }
                });
                C0062b.m271G2(executorServiceNewSingleThreadExecutor2);
                return executorServiceNewSingleThreadExecutor2;
        }
    }
}
