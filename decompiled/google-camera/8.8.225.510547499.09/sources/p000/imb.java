package p000;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class imb extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ imc f31474a;

    public imb(imc imcVar) {
        this.f31474a = imcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        imc imcVar = this.f31474a;
        imcVar.f31477c.mo7485g(imcVar.f31479e);
        ((imh) imcVar.f31478d.get()).mo11470c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        imc imcVar = this.f31474a;
        imcVar.f31477c.mo7482d(imcVar.f31479e);
    }
}
