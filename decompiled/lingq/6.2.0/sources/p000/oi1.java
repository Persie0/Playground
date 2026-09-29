package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class oi1 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f54364a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ll7 f54365b;

    public oi1(ll7 ll7Var) {
        this.f54365b = ll7Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        this.f54364a.add(network);
        kl7 kl7Var = (kl7) this.f54365b;
        kl7Var.getClass();
        kl7Var.mo4677k(Boolean.TRUE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        LinkedHashSet linkedHashSet = this.f54364a;
        linkedHashSet.remove(network);
        kl7 kl7Var = (kl7) this.f54365b;
        kl7Var.getClass();
        kl7Var.mo4677k(Boolean.valueOf(!linkedHashSet.isEmpty()));
    }
}
