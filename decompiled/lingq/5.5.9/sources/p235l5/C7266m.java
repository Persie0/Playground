package p235l5;

import android.net.ConnectivityManager;
import dm.C5207g;

/* JADX INFO: renamed from: l5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7266m {
    /* JADX INFO: renamed from: a */
    public static final void m14657a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        C5207g.m11111f(connectivityManager, "<this>");
        C5207g.m11111f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
