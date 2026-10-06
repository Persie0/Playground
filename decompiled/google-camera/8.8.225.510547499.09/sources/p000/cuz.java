package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.SystemClock;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import com.google.lens.sdk.LensApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cuz extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cva f9742a;

    public cuz(cva cvaVar) {
        this.f9742a = cvaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (this.f9742a.f9751e) {
            String action = intent.getAction();
            cva cvaVar = this.f9742a;
            if (cvaVar.f9754h || action == null) {
                return;
            }
            if (cvaVar.f9752f == null) {
                ((nbe) ((nbe) cva.f9747a.m17252c()).mo17276G(689)).mo17290o("audioDeviceStateManager is null");
                return;
            }
            if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                switch (intent.getIntExtra(HEePJw.VWdepsal, -1)) {
                    case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                        ((nbe) ((nbe) cva.f9747a.m17252c()).mo17276G(682)).mo17290o("receive SCO_AUDIO_STATE_ERROR");
                        AudioManager audioManager = this.f9742a.f9749c;
                        audioManager.getClass();
                        audioManager.stopBluetoothSco();
                        break;
                    case 0:
                        cva cvaVar2 = this.f9742a;
                        cvaVar2.f9756j = 3;
                        int i = cvaVar2.f9757k;
                        if (i == 0) {
                            throw null;
                        }
                        if (i == 5) {
                            ((nbe) ((nbe) cva.f9747a.m17252c()).mo17276G(685)).mo17290o("Retry to connect");
                            cva cvaVar3 = this.f9742a;
                            cvaVar3.m5558a(cvaVar3.f9752f.m10006c(gyy.EXT_BLUETOOTH));
                            return;
                        } else {
                            if (i == 1) {
                                ((nbe) ((nbe) cva.f9747a.m17252c()).mo17276G(684)).mo17290o("Disconnected from system, stop bluetooth sco");
                                AudioManager audioManager2 = this.f9742a.f9749c;
                                audioManager2.getClass();
                                audioManager2.stopBluetoothSco();
                            }
                            this.f9742a.f9752f.m10008e(gyy.EXT_BLUETOOTH, false);
                            this.f9742a.f9757k = 1;
                        }
                        break;
                        break;
                    case 1:
                        SystemClock.uptimeMillis();
                        cva cvaVar4 = this.f9742a;
                        cvaVar4.f9756j = 5;
                        int i2 = cvaVar4.f9757k;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i2 == 3) {
                            ((nbe) ((nbe) cva.f9747a.m17252c()).mo17276G(687)).mo17290o("Retry to disconnect");
                            this.f9742a.m5559b();
                            return;
                        } else {
                            cvaVar4.f9752f.m10008e(gyy.EXT_BLUETOOTH, true);
                            this.f9742a.f9757k = 1;
                        }
                        break;
                        break;
                    case 2:
                        this.f9742a.f9756j = 4;
                        break;
                }
            }
        }
    }
}
