package mg;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: renamed from: mg.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7558b {
    /* JADX INFO: renamed from: a */
    public static ConnectivityManager m15079a(Context context) throws UnsupportedOperationException {
        if (!C7557a.m15078b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            throw new UnsupportedOperationException("Missing permission ACCESS_NETWORK_STATE");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager;
        }
        throw new UnsupportedOperationException("Unable to get ConnectivityManager");
    }
}
