package p000;

import android.app.KeyguardManager;
import android.util.Log;
import com.google.lens.sdk.LensApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvl extends KeyguardManager.KeyguardDismissCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Runnable f44755a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ LensApi.LensLaunchStatusCallback f44756b;

    public nvl(Runnable runnable, LensApi.LensLaunchStatusCallback lensLaunchStatusCallback) {
        this.f44755a = runnable;
        this.f44756b = lensLaunchStatusCallback;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.f44756b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        }
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.f44756b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        }
        Log.e("LensApi", "Error dismissing keyguard");
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        this.f44755a.run();
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.f44756b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(0);
        }
    }
}
