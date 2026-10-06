package com.google.p020vr.vrcore.controller.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.p020vr.vrcore.base.api.VrCoreUtils;
import java.util.concurrent.atomic.AtomicInteger;
import p000.cbs;
import p000.joo;
import p000.lqq;
import p000.nxl;
import p000.nxq;
import p000.ofo;
import p000.oga;
import p000.ogi;
import p000.ogj;
import p000.ogl;
import p000.ogm;
import p000.ogo;
import p000.ogp;
import p000.ogs;
import p000.ogt;
import p000.ogu;
import p000.ogv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ControllerServiceBridge implements ServiceConnection {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f8457h = 0;

    /* JADX INFO: renamed from: i */
    private static final AtomicInteger f8458i = new AtomicInteger(-1);

    /* JADX INFO: renamed from: a */
    public final Context f8459a;

    /* JADX INFO: renamed from: b */
    public final Handler f8460b;

    /* JADX INFO: renamed from: c */
    final String f8461c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f8462d;

    /* JADX INFO: renamed from: e */
    public boolean f8463e;

    /* JADX INFO: renamed from: f */
    public ogs f8464f;

    /* JADX INFO: renamed from: g */
    public lqq f8465g;

    /* JADX INFO: renamed from: j */
    private final int f8466j;

    /* JADX INFO: renamed from: k */
    private final joo f8467k;

    /* JADX INFO: compiled from: PG */
    public interface Callbacks {
        /* JADX INFO: renamed from: a */
        void mo5197a(ogj ogjVar);

        /* JADX INFO: renamed from: b */
        void mo5198b(ogi ogiVar);

        /* JADX INFO: renamed from: c */
        void mo5199c(ogm ogmVar);

        /* JADX INFO: renamed from: d */
        void mo5200d(int i, int i2);

        /* JADX INFO: renamed from: e */
        void mo5201e();

        /* JADX INFO: renamed from: f */
        void mo5202f();

        /* JADX INFO: renamed from: g */
        void mo5203g(int i);

        /* JADX INFO: renamed from: h */
        void mo5204h();

        /* JADX INFO: renamed from: i */
        void mo5205i();
    }

    public ControllerServiceBridge(Context context, Callbacks callbacks, int i) {
        ogl oglVar = new ogl(i);
        SparseArray sparseArray = new SparseArray();
        this.f8462d = sparseArray;
        this.f8459a = context.getApplicationContext();
        int vrCoreClientApiVersion = 0;
        lqq lqqVar = new lqq(callbacks, oglVar, 0);
        this.f8465g = lqqVar;
        sparseArray.put(lqqVar.f39001a, lqqVar);
        this.f8460b = new Handler(Looper.getMainLooper());
        this.f8467k = new joo(this, 4);
        try {
            vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
        } catch (oga e) {
        }
        this.f8466j = vrCoreClientApiVersion;
        this.f8461c = "VrCtl.ServiceBridge" + f8458i.incrementAndGet();
    }

    /* JADX INFO: renamed from: d */
    public static final void m5192d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This should be running on the main thread.");
        }
    }

    /* JADX INFO: renamed from: e */
    private final boolean m5193e(int i, lqq lqqVar) {
        try {
            ogs ogsVar = this.f8464f;
            String str = this.f8461c;
            joo jooVar = new joo(lqqVar, 3, null);
            Parcel parcelM3398a = ogsVar.m3398a();
            parcelM3398a.writeInt(i);
            parcelM3398a.writeString(str);
            cbs.m3405d(parcelM3398a, jooVar);
            Parcel parcelM3399y = ogsVar.m3399y(5, parcelM3398a);
            boolean zM3406e = cbs.m3406e(parcelM3399y);
            parcelM3399y.recycle();
            return zM3406e;
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5194a() {
        m5192d();
        if (!this.f8463e) {
            Log.w("VrCtl.ServiceBridge", "Service is already unbound.");
            return;
        }
        m5192d();
        ogs ogsVar = this.f8464f;
        if (ogsVar != null) {
            try {
                String str = this.f8461c;
                Parcel parcelM3398a = ogsVar.m3398a();
                parcelM3398a.writeString(str);
                Parcel parcelM3399y = ogsVar.m3399y(6, parcelM3398a);
                cbs.m3406e(parcelM3399y);
                parcelM3399y.recycle();
            } catch (RemoteException e) {
                Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", e);
            }
        }
        if (this.f8466j >= 21) {
            try {
                ogs ogsVar2 = this.f8464f;
                if (ogsVar2 != null) {
                    joo jooVar = this.f8467k;
                    Parcel parcelM3398a2 = ogsVar2.m3398a();
                    cbs.m3405d(parcelM3398a2, jooVar);
                    Parcel parcelM3399y2 = ogsVar2.m3399y(9, parcelM3398a2);
                    boolean zM3406e = cbs.m3406e(parcelM3399y2);
                    parcelM3399y2.recycle();
                    if (!zM3406e) {
                        Log.w("VrCtl.ServiceBridge", "Failed to unregister remote service listener.");
                    }
                }
            } catch (RemoteException e2) {
                Log.w("VrCtl.ServiceBridge", "Exception while unregistering remote service listener: ".concat(e2.toString()));
            }
        }
        this.f8459a.unbindService(this);
        this.f8464f = null;
        this.f8463e = false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m5195b() {
        this.f8465g.f39002b.mo5205i();
        lqq lqqVar = this.f8465g;
        if (m5193e(lqqVar.f39001a, lqqVar)) {
            SparseArray sparseArray = this.f8462d;
            lqq lqqVar2 = this.f8465g;
            sparseArray.put(lqqVar2.f39001a, lqqVar2);
        } else {
            Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
            this.f8465g.f39002b.mo5202f();
            m5194a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5196c(int i, ogo ogoVar) {
        m5192d();
        ogs ogsVar = this.f8464f;
        if (ogsVar == null) {
            Log.w("VrCtl.ServiceBridge", "Vibration cancelled: service not connected");
            return;
        }
        try {
            Parcel parcelM3398a = ogsVar.m3398a();
            parcelM3398a.writeInt(i);
            cbs.m3404c(parcelM3398a, ogoVar);
            ogsVar.m3400z(11, parcelM3398a);
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while vibrating the controller.", e);
        }
    }

    public void controllerHapticsEffect(int i, int i2, int i3) {
        nxl nxlVarM18137O = ogv.f45969d.m18137O();
        nxl nxlVarM18137O2 = ogt.f45958d.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        ogt ogtVar = (ogt) nxqVar;
        ogtVar.f45960a |= 1;
        ogtVar.f45961b = i2;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        ogt ogtVar2 = (ogt) nxlVarM18137O2.f44974b;
        int i4 = 2;
        ogtVar2.f45960a |= 2;
        ogtVar2.f45962c = i3;
        ogt ogtVar3 = (ogt) nxlVarM18137O2.mo18103l();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ogv ogvVar = (ogv) nxlVarM18137O.f44974b;
        ogtVar3.getClass();
        ogvVar.f45973c = ogtVar3;
        ogvVar.f45971a |= 2;
        ogv ogvVar2 = (ogv) nxlVarM18137O.mo18103l();
        ogo ogoVar = new ogo();
        ogoVar.m18471a(ogvVar2);
        this.f8460b.post(new ogp(this, i, ogoVar, i4));
    }

    public boolean createAndConnectController(int i, Callbacks callbacks, int i2) {
        ogl oglVar = new ogl(i2);
        m5192d();
        if (this.f8464f == null) {
            return false;
        }
        lqq lqqVar = new lqq(callbacks, oglVar, i);
        if (m5193e(lqqVar.f39001a, lqqVar)) {
            if (lqqVar.f39001a == 0) {
                this.f8465g = lqqVar;
            }
            this.f8462d.put(i, lqqVar);
            return true;
        }
        if (i == 0) {
            Log.e("VrCtl.ServiceBridge", gBCSQzBeB.fLpEazt);
            i = 0;
        }
        this.f8462d.remove(i);
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ogs ogsVar;
        String str;
        m5192d();
        if (this.f8463e) {
            if (iBinder == null) {
                ogsVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
                ogsVar = iInterfaceQueryLocalInterface instanceof ogs ? (ogs) iInterfaceQueryLocalInterface : new ogs(iBinder);
            }
            this.f8464f = ogsVar;
            try {
                Parcel parcelM3398a = ogsVar.m3398a();
                parcelM3398a.writeInt(25);
                Parcel parcelM3399y = ogsVar.m3399y(1, parcelM3398a);
                int i = parcelM3399y.readInt();
                parcelM3399y.recycle();
                if (i == 0) {
                    if (this.f8466j >= 21) {
                        try {
                            ogs ogsVar2 = this.f8464f;
                            joo jooVar = this.f8467k;
                            Parcel parcelM3398a2 = ogsVar2.m3398a();
                            cbs.m3405d(parcelM3398a2, jooVar);
                            Parcel parcelM3399y2 = ogsVar2.m3399y(8, parcelM3398a2);
                            boolean zM3406e = cbs.m3406e(parcelM3399y2);
                            parcelM3399y2.recycle();
                            if (!zM3406e) {
                                Log.e("VrCtl.ServiceBridge", "Failed to register remote service listener.");
                                this.f8465g.f39002b.mo5203g(0);
                                m5194a();
                                return;
                            }
                        } catch (RemoteException e) {
                            Log.w("VrCtl.ServiceBridge", "Exception while registering remote service listener: ".concat(e.toString()));
                        }
                    }
                    m5195b();
                    return;
                }
                switch (i) {
                    case 0:
                        str = "SUCCESS";
                        break;
                    case 1:
                        str = "FAILED_UNSUPPORTED";
                        break;
                    case 2:
                        str = "FAILED_NOT_AUTHORIZED";
                        break;
                    case 3:
                        str = "FAILED_CLIENT_OBSOLETE";
                        break;
                    default:
                        str = "[UNKNOWN CONTROLLER INIT RESULT: " + i + "]";
                        break;
                }
                Log.e("VrCtl.ServiceBridge", "initialize() returned error: ".concat(str));
                this.f8465g.f39002b.mo5203g(i);
                m5194a();
            } catch (RemoteException e2) {
                Log.e("VrCtl.ServiceBridge", "Failed to call initialize() on controller service (RemoteException).", e2);
                this.f8465g.f39002b.mo5202f();
                m5194a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m5192d();
        this.f8464f = null;
        this.f8465g.f39002b.mo5201e();
    }

    public void requestBind() {
        this.f8460b.post(new ofo(this, 4));
    }

    public void requestUnbind() {
        this.f8460b.post(new ofo(this, 3));
    }

    public void vibrateController(int i, int i2, int i3, int i4) {
        nxl nxlVarM18137O = ogv.f45969d.m18137O();
        nxl nxlVarM18137O2 = ogu.f45963e.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        ogu oguVar = (ogu) nxqVar;
        oguVar.f45965a |= 1;
        oguVar.f45966b = i2;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O2.f44974b;
        ogu oguVar2 = (ogu) nxqVar2;
        oguVar2.f45965a |= 2;
        oguVar2.f45967c = i3;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        ogu oguVar3 = (ogu) nxlVarM18137O2.f44974b;
        oguVar3.f45965a |= 4;
        oguVar3.f45968d = i4;
        ogu oguVar4 = (ogu) nxlVarM18137O2.mo18103l();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ogv ogvVar = (ogv) nxlVarM18137O.f44974b;
        oguVar4.getClass();
        ogvVar.f45972b = oguVar4;
        ogvVar.f45971a |= 1;
        ogv ogvVar2 = (ogv) nxlVarM18137O.mo18103l();
        ogo ogoVar = new ogo();
        ogoVar.m18471a(ogvVar2);
        this.f8460b.post(new ogp(this, i, ogoVar, 0));
    }
}
