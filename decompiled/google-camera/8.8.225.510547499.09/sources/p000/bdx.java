package p000;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdx {
    /* JADX INFO: renamed from: a */
    public static final Network m2256a(ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        return connectivityManager.getActiveNetwork();
    }

    /* JADX INFO: renamed from: b */
    public static void m2257b(C1058va c1058va, Runnable runnable) {
        ((beb) c1058va.f47802a).execute(runnable);
    }
}
