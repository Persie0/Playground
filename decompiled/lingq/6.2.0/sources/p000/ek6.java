package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class ek6 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final Handler f37385a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gv5 f37386b;

    public ek6(gv5 gv5Var) {
        this.f37386b = gv5Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        this.f37385a.post(new dk6(this.f37386b, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.f37385a.post(new dk6(this.f37386b, 1));
    }
}
