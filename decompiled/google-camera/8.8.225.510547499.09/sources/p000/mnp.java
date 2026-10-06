package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.camera.remotecontrol.RemoteControlService;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.p020vr.ndk.base.DaydreamApi;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mnp implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f41118a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f41119b;

    public mnp(RemoteControlService remoteControlService, int i) {
        this.f41119b = i;
        this.f41118a = remoteControlService;
    }

    public mnp(DaydreamApi daydreamApi, int i) {
        this.f41119b = i;
        this.f41118a = daydreamApi;
    }

    public mnp(mnq mnqVar, int i) {
        this.f41119b = i;
        this.f41118a = mnqVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f41119b) {
            case 0:
                ((mnq) this.f41118a).m16662c(new mno(this));
                break;
            case 1:
                RemoteControlService remoteControlService = (RemoteControlService) this.f41118a;
                remoteControlService.f6902h = null;
                remoteControlService.f6897c = false;
                break;
            default:
                ((DaydreamApi) this.f41118a).f8453e = null;
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ogd ogdVar;
        String str = JrxsYuVZZqnFC.YgaBeteDSmQvLm;
        ivp ivpVar = null;
        ogb ogbVar = null;
        switch (this.f41119b) {
            case 0:
                ((mnq) this.f41118a).m16662c(new mnn(this, iBinder));
                break;
            case 1:
                Object obj = this.f41118a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.photos.cameraassistant.ICameraAssistantService");
                    ivpVar = iInterfaceQueryLocalInterface instanceof ivp ? (ivp) iInterfaceQueryLocalInterface : new ivp(iBinder);
                }
                ((RemoteControlService) obj).f6902h = ivpVar;
                ((RemoteControlService) this.f41118a).f6897c = true;
                break;
            default:
                Object obj2 = this.f41118a;
                if (iBinder == null) {
                    ogdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
                    ogdVar = iInterfaceQueryLocalInterface2 instanceof ogd ? (ogd) iInterfaceQueryLocalInterface2 : new ogd(iBinder);
                }
                ((DaydreamApi) obj2).f8453e = ogdVar;
                try {
                    Object obj3 = this.f41118a;
                    ogd ogdVar2 = ((DaydreamApi) obj3).f8453e;
                    Parcel parcelM3399y = ogdVar2.m3399y(2, ogdVar2.m3398a());
                    IBinder strongBinder = parcelM3399y.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
                        ogbVar = iInterfaceQueryLocalInterface3 instanceof ogb ? (ogb) iInterfaceQueryLocalInterface3 : new ogb(strongBinder);
                    }
                    parcelM3399y.recycle();
                    ((DaydreamApi) obj3).f8454f = ogbVar;
                } catch (RemoteException e) {
                    Log.e(str, hIAHJKEnGsNbz.upX);
                }
                if (((DaydreamApi) this.f41118a).f8454f == null) {
                    Log.w(str, "Daydream service component unavailable.");
                }
                ArrayList arrayList = ((DaydreamApi) this.f41118a).f8450b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Runnable) arrayList.get(i)).run();
                }
                ((DaydreamApi) this.f41118a).f8450b.clear();
                break;
        }
    }
}
