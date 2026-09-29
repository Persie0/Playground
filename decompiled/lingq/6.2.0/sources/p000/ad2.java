package p000;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class ad2 implements NsdManager.RegistrationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f509b;

    public ad2(String str, String str2) {
        this.f508a = str;
        this.f509b = str2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
        bd2.m3632a(this.f509b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
        if (this.f508a.equals(nsdServiceInfo.getServiceName())) {
            return;
        }
        bd2.m3632a(this.f509b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        nsdServiceInfo.getClass();
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        nsdServiceInfo.getClass();
    }
}
