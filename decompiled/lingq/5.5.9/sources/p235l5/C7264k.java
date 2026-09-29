package p235l5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import dm.C5207g;

/* JADX INFO: renamed from: l5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7264k {
    /* JADX INFO: renamed from: a */
    public static final NetworkCapabilities m14653a(ConnectivityManager connectivityManager, Network network) {
        C5207g.m11111f(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m14654b(NetworkCapabilities networkCapabilities, int i10) {
        C5207g.m11111f(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i10);
    }

    /* JADX INFO: renamed from: c */
    public static final void m14655c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        C5207g.m11111f(connectivityManager, "<this>");
        C5207g.m11111f(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
