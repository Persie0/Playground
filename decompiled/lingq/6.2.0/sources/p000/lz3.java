package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import androidx.glance.session.C0694b;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lz3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final List f50332b;

    /* JADX INFO: renamed from: c */
    public static final IntentFilter f50333c;

    /* JADX INFO: renamed from: a */
    public final C0694b f50334a;

    static {
        List listM23605K = vz1.m23605K("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        f50332b = listM23605K;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listM23605K.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        f50333c = intentFilter;
    }

    public lz3(C0694b c0694b) {
        this.f50334a = c0694b;
    }

    /* JADX INFO: renamed from: a */
    public final void m16575a(Context context) {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        boolean zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
        if (Build.VERSION.SDK_INT >= 33) {
            zIsDeviceIdleMode = zIsDeviceIdleMode || AbstractC3745x3.m24248b(powerManager);
        }
        if (zIsDeviceIdleMode) {
            this.f50334a.mo0a();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (u91.m22633z0(f50332b, intent.getAction())) {
            m16575a(context);
        }
    }
}
