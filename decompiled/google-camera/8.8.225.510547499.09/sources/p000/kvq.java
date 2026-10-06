package p000;

import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvq implements kvn {

    /* JADX INFO: renamed from: a */
    public final WifiConfiguration f37385a;

    /* JADX INFO: renamed from: b */
    private final WifiManager f37386b;

    /* JADX INFO: renamed from: c */
    private boolean f37387c = false;

    /* JADX INFO: renamed from: d */
    private final dsx f37388d;

    /* JADX INFO: renamed from: e */
    private final lpe f37389e;

    public kvq(WifiManager wifiManager, dsx dsxVar, WifiConfiguration wifiConfiguration, lpe lpeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37386b = wifiManager;
        this.f37388d = dsxVar;
        this.f37385a = wifiConfiguration;
        this.f37389e = lpeVar;
    }

    @Override // p000.kvn
    /* JADX INFO: renamed from: b */
    public final void mo14931b() {
        if (this.f37387c) {
            lvd.f39383a.m16089c(kvq.class, BEeWZPor.GkyMqSgPpRz, new Object[0]);
            return;
        }
        this.f37387c = true;
        this.f37386b.setWifiEnabled(true);
        int iAddNetwork = this.f37386b.addNetwork(this.f37385a);
        if (iAddNetwork != -1 && this.f37386b.enableNetwork(iAddNetwork, true)) {
            this.f37388d.m6698m(C0100R.string.qr_wifi_successfully_connecting, this.f37385a.SSID);
        } else {
            this.f37388d.m6698m(C0100R.string.qr_wifi_error_could_not_connect, this.f37385a.SSID);
        }
        this.f37389e.m15812k(new Intent("android.settings.WIFI_SETTINGS"));
    }
}
