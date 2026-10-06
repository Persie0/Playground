package p000;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.media.AudioManager;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cva implements kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f9747a = nbh.m17259h("com/google/android/apps/camera/camcorder/media/audio/AudioDeviceBluetoothManagerImpl");

    /* JADX INFO: renamed from: b */
    public final Activity f9748b;

    /* JADX INFO: renamed from: c */
    public final AudioManager f9749c;

    /* JADX INFO: renamed from: f */
    public final gyz f9752f;

    /* JADX INFO: renamed from: d */
    public final jvb f9750d = new jvb();

    /* JADX INFO: renamed from: e */
    public final Object f9751e = new Object();

    /* JADX INFO: renamed from: g */
    public boolean f9753g = false;

    /* JADX INFO: renamed from: j */
    public int f9756j = 3;

    /* JADX INFO: renamed from: k */
    public int f9757k = 1;

    /* JADX INFO: renamed from: h */
    public boolean f9754h = false;

    /* JADX INFO: renamed from: i */
    public final BroadcastReceiver f9755i = new cuz(this);

    public cva(Activity activity, AudioManager audioManager, gyz gyzVar) {
        this.f9748b = activity;
        this.f9749c = audioManager;
        this.f9752f = gyzVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5558a(String str) {
        synchronized (this.f9751e) {
            if (this.f9754h) {
                ((nbe) ((nbe) f9747a.m17252c()).mo17276G(700)).mo17290o("Already closed. Ignore start()");
                return;
            }
            if (str.isEmpty()) {
                return;
            }
            int i = this.f9756j;
            if (i == 0) {
                throw null;
            }
            if (i == 5) {
                return;
            }
            this.f9757k = 5;
            if (i == 2) {
                ((nbe) ((nbe) f9747a.m17252c()).mo17276G(697)).mo17290o("Bluetooth audio is disconnecting, retry later");
                return;
            }
            this.f9752f.m10004a(gyy.EXT_BLUETOOTH);
            if (this.f9752f.m10004a(gyy.EXT_BLUETOOTH) != 26) {
                SystemClock.uptimeMillis();
                this.f9749c.startBluetoothSco();
            } else {
                this.f9756j = 5;
                this.f9752f.m10008e(gyy.EXT_BLUETOOTH, true);
                this.f9757k = 1;
            }
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9751e) {
            if (this.f9754h) {
                ((nbe) ((nbe) f9747a.m17252c()).mo17276G(691)).mo17290o("Already closed");
                return;
            }
            this.f9749c.stopBluetoothSco();
            this.f9750d.close();
            this.f9748b.unregisterReceiver(this.f9755i);
            this.f9754h = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5559b() {
        synchronized (this.f9751e) {
            int i = this.f9756j;
            if (i == 0) {
                throw null;
            }
            if (i == 3) {
                return;
            }
            this.f9757k = 3;
            if (i == 4) {
                ((nbe) ((nbe) f9747a.m17252c()).mo17276G(703)).mo17290o("Bluetooth audio is connecting, retry later");
                return;
            }
            if (this.f9752f.m10004a(gyy.EXT_BLUETOOTH) != 26) {
                this.f9756j = 2;
                this.f9749c.stopBluetoothSco();
            } else {
                this.f9756j = 3;
                this.f9752f.m10008e(gyy.EXT_BLUETOOTH, false);
                this.f9757k = 1;
            }
        }
    }
}
