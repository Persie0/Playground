package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hxq extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hxt f29835a;

    public hxq(hxt hxtVar) {
        this.f29835a = hxtVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        int iM11534f = inr.m11534f(this.f29835a.f29839a);
        hxt hxtVar = this.f29835a;
        if (iM11534f != hxtVar.f29841c) {
            hxtVar.m10839b(false);
        }
    }
}
