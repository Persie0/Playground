package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.impl.constraints.AbstractC0776b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class d59 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public static final d59 f35017a = new d59();

    /* JADX INFO: renamed from: b */
    public static final Object f35018b = new Object();

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f35019c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static NetworkCapabilities f35020d;

    /* JADX INFO: renamed from: e */
    public static boolean f35021e;

    /* JADX INFO: renamed from: f */
    public static Boolean f35022f;

    /* JADX INFO: renamed from: a */
    public static void m10110a() {
        ArrayList<Pair> arrayList = new ArrayList();
        synchronized (f35018b) {
            try {
                if (f35021e && f35022f != null) {
                    for (Map.Entry entry : f35019c.entrySet()) {
                        vi3 vi3Var = (vi3) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        d59 d59Var = f35017a;
                        NetworkCapabilities networkCapabilities = f35020d;
                        d59Var.getClass();
                        Boolean bool = f35022f;
                        bool.getClass();
                        arrayList.add(new Pair(vi3Var, !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities) ? fk1.f39219a : new gk1(7)));
                    }
                    for (Pair pair : arrayList) {
                        ((vi3) pair.f47623a).invoke((hk1) pair.f47624b);
                    }
                    return;
                }
                oj5.m18040f().m18042a(AbstractC0776b.f7235a, "Not dispatching constraint state yet: isBlocked=" + f35022f + ", capabilitiesInitialized=" + f35021e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (f35018b) {
            if (fa4.m11650l(f35022f, Boolean.valueOf(z))) {
                return;
            }
            f35022f = Boolean.valueOf(z);
            m10110a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f35018b) {
            f35020d = networkCapabilities;
            f35021e = true;
        }
        m10110a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController onLost callback");
        synchronized (f35018b) {
            f35020d = null;
            Iterator it = f35019c.keySet().iterator();
            while (it.hasNext()) {
                ((vi3) it.next()).invoke(new gk1(7));
            }
        }
    }
}
