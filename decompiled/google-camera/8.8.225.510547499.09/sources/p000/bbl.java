package p000;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbl {

    /* JADX INFO: renamed from: a */
    public static final String f2905a = ayc.m2100b("NetworkStateTracker");

    /* JADX INFO: renamed from: a */
    public static final bam m2180a(ConnectivityManager connectivityManager) {
        boolean zM2254c;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilitiesM2252a = bdw.m2252a(connectivityManager, bdx.m2256a(connectivityManager));
            zM2254c = networkCapabilitiesM2252a != null ? bdw.m2254c(networkCapabilitiesM2252a, 16) : false;
        } catch (SecurityException e) {
            ayc.m2099a();
            Log.e(f2905a, "Unable to validate active network", e);
            zM2254c = false;
        }
        return new bam(z, zM2254c, ade.m268a(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
