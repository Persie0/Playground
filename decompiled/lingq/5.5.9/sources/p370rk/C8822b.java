package p370rk;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.RunnableC0191j;
import androidx.activity.RunnableC0193l;
import dm.C5207g;

/* JADX INFO: renamed from: rk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8822b extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f46718c = 0;

    /* JADX INFO: renamed from: a */
    public final Handler f46719a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8821a f46720b;

    public C8822b(C8821a c8821a) {
        this.f46720b = c8821a;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        C5207g.m11111f(network, "network");
        this.f46719a.post(new RunnableC0191j(21, this.f46720b));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C5207g.m11111f(network, "network");
        this.f46719a.post(new RunnableC0193l(13, this.f46720b));
    }
}
