package p000;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzl extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jwl f4817a;

    public bzl(jwl jwlVar, byte[] bArr, byte[] bArr2) {
        this.f4817a = jwlVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m3217a(boolean z) {
        cbi.m3388i(new bnp(this, z, 2));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        m3217a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        m3217a(false);
    }
}
