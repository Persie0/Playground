package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdw {
    /* JADX INFO: renamed from: a */
    public static final NetworkCapabilities m2252a(ConnectivityManager connectivityManager, Network network) {
        connectivityManager.getClass();
        return connectivityManager.getNetworkCapabilities(network);
    }

    /* JADX INFO: renamed from: b */
    public static final void m2253b(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m2254c(NetworkCapabilities networkCapabilities, int i) {
        networkCapabilities.getClass();
        return networkCapabilities.hasCapability(i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m2255d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
