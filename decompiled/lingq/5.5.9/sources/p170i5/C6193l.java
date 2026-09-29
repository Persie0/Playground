package p170i5;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import dm.C5207g;
import p026b5.AbstractC1314g;
import p131g5.C5698b;
import p235l5.C7264k;
import p235l5.C7265l;
import p377s2.C8951a;

/* JADX INFO: renamed from: i5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6193l {

    /* JADX INFO: renamed from: a */
    public static final String f36054a;

    static {
        String strM4868f = AbstractC1314g.m4868f("NetworkStateTracker");
        C5207g.m11110e(strM4868f, "tagWithPrefix(\"NetworkStateTracker\")");
        f36054a = strM4868f;
    }

    /* JADX INFO: renamed from: a */
    public static final C5698b m12710a(ConnectivityManager connectivityManager) {
        boolean zM14654b;
        C5207g.m11111f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilitiesM14653a = C7264k.m14653a(connectivityManager, C7265l.m14656a(connectivityManager));
            zM14654b = networkCapabilitiesM14653a != null ? C7264k.m14654b(networkCapabilitiesM14653a, 16) : false;
        } catch (SecurityException e10) {
            AbstractC1314g.m4867d().mo4871c(f36054a, "Unable to validate active network", e10);
        }
        boolean zM17182a = C8951a.m17182a(connectivityManager);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z10 = false;
        }
        return new C5698b(z11, zM14654b, zM17182a, z10);
    }
}
