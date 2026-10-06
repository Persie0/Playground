package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.lullaby.modules.audio.DeviceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvo extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DeviceInfo f44767a;

    public nvo(DeviceInfo deviceInfo) {
        this.f44767a = deviceInfo;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            switch (intent.getIntExtra("state", -1)) {
                case 0:
                    DeviceInfo deviceInfo = this.f44767a;
                    deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.f8411a, 2);
                    break;
                case 1:
                    DeviceInfo deviceInfo2 = this.f44767a;
                    deviceInfo2.nativeUpdateHeadphoneStateChange(deviceInfo2.f8411a, 1);
                    break;
                default:
                    DeviceInfo deviceInfo3 = this.f44767a;
                    deviceInfo3.nativeUpdateHeadphoneStateChange(deviceInfo3.f8411a, 0);
                    break;
            }
        }
    }
}
