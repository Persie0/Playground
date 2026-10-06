package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.p020vr.ndk.base.DaydreamApi;
import com.google.p020vr.vrcore.controller.api.ControllerServiceBridge;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofo implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f45864a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f45865b;

    public ofo(PendingIntent pendingIntent, int i) {
        this.f45865b = i;
        this.f45864a = pendingIntent;
    }

    public ofo(DaydreamApi daydreamApi, int i) {
        this.f45865b = i;
        this.f45864a = daydreamApi;
    }

    public /* synthetic */ ofo(ControllerServiceBridge controllerServiceBridge, int i) {
        this.f45865b = i;
        this.f45864a = controllerServiceBridge;
    }

    public ofo(ogc ogcVar, int i) {
        this.f45865b = i;
        this.f45864a = ogcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.content.ServiceConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f45865b;
        String str = EArqVBjecl.Xzhnyr;
        switch (i) {
            case 0:
                try {
                    Object obj = this.f45864a;
                    ((ogc) obj).f45901a.startIntentSenderForResult(((ogc) obj).f45902b.getIntentSender(), ((ogc) this.f45864a).f45903c, null, 0, 0, 0);
                } catch (IntentSender.SendIntentException e) {
                    Log.e(str, "Exception while starting next VR activity: ".concat(e.toString()));
                    return;
                }
                break;
            case 1:
                ogb ogbVar = ((DaydreamApi) this.f45864a).f8454f;
                if (ogbVar == null) {
                    Log.e(str, "Can't launch VR homescreen via DaydreamManager. Giving up trying to leave current VR activity...");
                    break;
                } else {
                    try {
                        Parcel parcelM3399y = ogbVar.m3399y(8, ogbVar.m3398a());
                        boolean zM3406e = cbs.m3406e(parcelM3399y);
                        parcelM3399y.recycle();
                        if (!zM3406e) {
                            Log.e(str, "There is no VR homescreen installed.");
                            break;
                        }
                    } catch (RemoteException e2) {
                        Log.e(str, "RemoteException while launching VR homescreen: ".concat(e2.toString()));
                        return;
                    }
                }
                break;
            case 2:
                try {
                    ((PendingIntent) this.f45864a).send(0);
                } catch (Exception e3) {
                    Log.e(str, "Couldn't launch PendingIntent: ".concat(e3.toString()));
                    return;
                }
                break;
            case 3:
                ((ControllerServiceBridge) this.f45864a).m5194a();
                break;
            case 4:
                ?? r0 = this.f45864a;
                ControllerServiceBridge.m5192d();
                ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge) r0;
                if (controllerServiceBridge.f8463e) {
                    Log.w("VrCtl.ServiceBridge", "Service is already bound.");
                } else {
                    Intent intent = new Intent("com.google.vr.vrcore.controller.BIND");
                    intent.setPackage("com.google.vr.vrcore");
                    if (!controllerServiceBridge.f8459a.bindService(intent, (ServiceConnection) r0, 1)) {
                        Log.w("VrCtl.ServiceBridge", "Bind failed. Service is not available.");
                        controllerServiceBridge.f8465g.f39002b.mo5204h();
                    }
                    controllerServiceBridge.f8463e = true;
                }
                break;
            default:
                Object obj2 = this.f45864a;
                ControllerServiceBridge.m5192d();
                ControllerServiceBridge controllerServiceBridge2 = (ControllerServiceBridge) obj2;
                ogs ogsVar = controllerServiceBridge2.f8464f;
                if (ogsVar != null) {
                    try {
                        Parcel parcelM3399y2 = ogsVar.m3399y(10, ogsVar.m3398a());
                        int i2 = parcelM3399y2.readInt();
                        parcelM3399y2.recycle();
                        if (i2 > 0) {
                            if (controllerServiceBridge2.f8463e) {
                                controllerServiceBridge2.m5195b();
                            }
                        }
                    } catch (RemoteException e4) {
                        Log.w("VrCtl.ServiceBridge", HRLmc.cSBjvaoGQ.concat(e4.toString()));
                    }
                }
                int size = controllerServiceBridge2.f8462d.size();
                for (int i3 = 0; i3 < size; i3++) {
                    lqq lqqVar = (lqq) controllerServiceBridge2.f8462d.valueAt(i3);
                    if (lqqVar != null) {
                        lqqVar.f39002b.mo5200d(i3, 0);
                    }
                }
                ControllerServiceBridge.m5192d();
                controllerServiceBridge2.f8462d.clear();
                controllerServiceBridge2.f8465g.f39002b.mo5201e();
                break;
        }
    }
}
