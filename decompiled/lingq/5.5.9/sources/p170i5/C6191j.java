package p170i5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import dm.C5207g;
import p026b5.AbstractC1314g;

/* JADX INFO: renamed from: i5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6191j extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6192k f36051a;

    public C6191j(C6192k c6192k) {
        this.f36051a = c6192k;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C5207g.m11111f(network, "network");
        C5207g.m11111f(networkCapabilities, "capabilities");
        AbstractC1314g.m4867d().mo4869a(C6193l.f36054a, "Network capabilities changed: " + networkCapabilities);
        C6192k c6192k = this.f36051a;
        c6192k.m12709c(C6193l.m12710a(c6192k.f36052f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C5207g.m11111f(network, "network");
        AbstractC1314g.m4867d().mo4869a(C6193l.f36054a, "Network connection lost");
        C6192k c6192k = this.f36051a;
        c6192k.m12709c(C6193l.m12710a(c6192k.f36052f));
    }
}
