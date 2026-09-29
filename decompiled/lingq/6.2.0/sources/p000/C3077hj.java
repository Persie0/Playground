package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.amplitude.core.AbstractC0903a;

/* JADX INFO: renamed from: hj */
/* JADX INFO: loaded from: classes.dex */
public final class C3077hj extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public C3040gj f42413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectivityManager f42414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qn3 f42415c;

    public C3077hj(ConnectivityManager connectivityManager, qn3 qn3Var) {
        this.f42414b = connectivityManager;
        this.f42415c = qn3Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        NetworkCapabilities networkCapabilities = this.f42414b.getNetworkCapabilities(network);
        m58 m58Var = (m58) this.f42415c.f57974a;
        boolean z = true;
        if (networkCapabilities != null) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (!networkCapabilities.hasCapability(12) || !zHasCapability) {
                z = false;
            }
        }
        C3040gj c3040gj = new C3040gj();
        c3040gj.f40867c = network;
        c3040gj.f40868d = m58Var;
        c3040gj.f40865a = z;
        c3040gj.f40866b = false;
        c3040gj.m12680d();
        this.f42413a = c3040gj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        C3040gj c3040gj = this.f42413a;
        if (c3040gj != null) {
            C3040gj.m12676f(c3040gj, network, false, z, 2);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        C3040gj c3040gj = this.f42413a;
        if (c3040gj != null) {
            C3040gj.m12676f(c3040gj, network, networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16), false, 4);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        C3040gj c3040gj = this.f42413a;
        if (c3040gj != null) {
            C3040gj.m12676f(c3040gj, network, false, false, 4);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        AbstractC0903a abstractC0903a = (AbstractC0903a) ((m58) this.f42415c.f57974a).f50618b;
        abstractC0903a.m5113g().mo16256b("AndroidNetworkListener, onNetworkUnavailable.");
        abstractC0903a.f11016a.f10804q = Boolean.TRUE;
    }
}
