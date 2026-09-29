package p133g7;

import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import p530zb.HandlerC10476a;

/* JADX INFO: renamed from: g7.e */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC5712e implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34723a;

    /* JADX INFO: renamed from: b */
    public final Handler f34724b;

    public ExecutorC5712e(int i10) {
        this.f34723a = i10;
        if (i10 != 2) {
            this.f34724b = new Handler(Looper.getMainLooper());
        } else {
            this.f34724b = new HandlerC10476a(Looper.getMainLooper());
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f34723a;
        Handler handler = this.f34724b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                handler.post(runnable);
                break;
            case 1:
                handler.post(runnable);
                break;
            default:
                handler.post(runnable);
                break;
        }
    }
}
