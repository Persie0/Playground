package p000;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdy {
    /* JADX INFO: renamed from: a */
    public static final void m2258a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    /* JADX INFO: renamed from: b */
    public static String m2259b(String str, int i) {
        if (i <= 0) {
            if (i == -1) {
                return str.concat("[last()]");
            }
            throw new bfc("Array index must be larger than zero", 104);
        }
        return str + "[" + i + "]";
    }

    /* JADX INFO: renamed from: c */
    public static String m2260c(String str, String str2) {
        if (str.length() == 0) {
            throw new bfc("Empty field namespace URI", 101);
        }
        if (str2.length() == 0) {
            throw new bfc("Empty f name", 102);
        }
        bfy bfyVarM6526w = C0137dp.m6526w(str, str2);
        if (bfyVarM6526w.m2369a() == 2) {
            return "/".concat(String.valueOf(bfyVarM6526w.m2370b(1).f3148a));
        }
        throw new bfc("The field name must be simple", 102);
    }
}
