package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.p020vr.audio.DeviceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oeu extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DeviceInfo f45812a;

    public oeu(DeviceInfo deviceInfo) {
        this.f45812a = deviceInfo;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            switch (intent.getIntExtra(gBCSQzBeB.snGamA, -1)) {
                case 0:
                    DeviceInfo deviceInfo = this.f45812a;
                    deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.f8433a, 2);
                    break;
                case 1:
                    DeviceInfo deviceInfo2 = this.f45812a;
                    deviceInfo2.nativeUpdateHeadphoneStateChange(deviceInfo2.f8433a, 1);
                    break;
                default:
                    DeviceInfo deviceInfo3 = this.f45812a;
                    deviceInfo3.nativeUpdateHeadphoneStateChange(deviceInfo3.f8433a, 0);
                    break;
            }
        }
    }
}
