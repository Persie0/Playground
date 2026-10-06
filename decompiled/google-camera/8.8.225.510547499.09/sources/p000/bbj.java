package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbj extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bbk f2902a;

    public bbj(bbk bbkVar) {
        this.f2902a = bbkVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        ayc.m2099a();
        String str = bbl.f2905a;
        StringBuilder sb = new StringBuilder();
        sb.append("Network capabilities changed: ");
        sb.append(networkCapabilities);
        networkCapabilities.toString();
        bbk bbkVar = this.f2902a;
        bbkVar.m2179g(bbl.m2180a(bbkVar.f2903e));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        ayc.m2099a();
        String str = bbl.f2905a;
        bbk bbkVar = this.f2902a;
        bbkVar.m2179g(bbl.m2180a(bbkVar.f2903e));
    }
}
