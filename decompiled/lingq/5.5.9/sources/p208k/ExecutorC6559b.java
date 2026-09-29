package p208k;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: k.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC6559b implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37353a;

    public /* synthetic */ ExecutorC6559b(int i10) {
        this.f37353a = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f37353a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C6560c.m13159k0().f37356a.f37358b.execute(runnable);
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
