package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.impl.constraints.AbstractC0776b;
import com.iterable.iterableapi.C1220p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j44 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f45038c = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45039a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f45040b;

    public j44(nc0 nc0Var) {
        this.f45040b = nc0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f45039a) {
            case 1:
                super.onAvailable(network);
                nc0 nc0Var = (nc0) this.f45040b;
                ((HashSet) nc0Var.f52586d).add(network);
                eh0.m11120Q("NetworkConnectivityManager", "Network Connected");
                nc0Var.f52584b = true;
                Iterator it = new ArrayList((ArrayList) nc0Var.f52587e).iterator();
                while (it.hasNext()) {
                    ((C1220p) it.next()).m6958e();
                }
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) throws Exception {
        switch (this.f45039a) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((h85) this.f45040b).invoke(fk1.f39219a);
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) throws Exception {
        int i = this.f45039a;
        Object obj = this.f45040b;
        switch (i) {
            case 0:
                network.getClass();
                oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController onLost callback");
                ((h85) obj).invoke(new gk1(7));
                break;
            default:
                super.onLost(network);
                eh0.m11120Q("NetworkConnectivityManager", "Network Disconnected");
                nc0 nc0Var = (nc0) obj;
                HashSet hashSet = (HashSet) nc0Var.f52586d;
                hashSet.remove(network);
                if (hashSet.isEmpty()) {
                    nc0Var.f52584b = false;
                    Iterator it = new ArrayList((ArrayList) nc0Var.f52587e).iterator();
                    while (it.hasNext()) {
                        ((C1220p) it.next()).getClass();
                    }
                }
                break;
        }
    }

    public j44(h85 h85Var) {
        this.f45040b = h85Var;
    }
}
