package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes2.dex */
public final class pk6 {

    /* JADX INFO: renamed from: a */
    public final Context f56347a;

    public pk6(Context context) {
        this.f56347a = context;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19362a() {
        Object systemService = this.f56347a.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return (activeNetwork == null || connectivityManager.getNetworkCapabilities(activeNetwork) == null) ? false : true;
    }
}
