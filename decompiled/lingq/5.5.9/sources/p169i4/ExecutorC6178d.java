package p169i4;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: i4.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC6178d implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36026a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f36026a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
