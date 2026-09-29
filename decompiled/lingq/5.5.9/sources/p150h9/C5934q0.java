package p150h9;

import android.content.Context;
import android.net.wifi.WifiManager;
import p479xa.C10145n;

/* JADX INFO: renamed from: h9.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5934q0 {

    /* JADX INFO: renamed from: a */
    public final WifiManager f35358a;

    /* JADX INFO: renamed from: b */
    public WifiManager.WifiLock f35359b;

    /* JADX INFO: renamed from: c */
    public boolean f35360c;

    /* JADX INFO: renamed from: d */
    public boolean f35361d;

    public C5934q0(Context context) {
        this.f35358a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* JADX INFO: renamed from: a */
    public final void m12347a(boolean z10) {
        if (z10 && this.f35359b == null) {
            WifiManager wifiManager = this.f35358a;
            if (wifiManager == null) {
                C10145n.m19099g("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f35359b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f35360c = z10;
        WifiManager.WifiLock wifiLock = this.f35359b;
        if (wifiLock == null) {
            return;
        }
        if (z10 && this.f35361d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
