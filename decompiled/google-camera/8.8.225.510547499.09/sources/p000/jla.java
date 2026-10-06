package p000;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jla extends Service implements jlb {

    /* JADX INFO: renamed from: b */
    private jlv f34277b;

    /* JADX INFO: renamed from: c */
    private final jnl f34278c = new jnl(this, 1);

    /* JADX INFO: renamed from: a */
    private final Object f34276a = new Object();

    /* JADX INFO: renamed from: a */
    private final jlv m13332a() {
        jlv jlvVar;
        synchronized (this.f34276a) {
            jlvVar = this.f34277b;
        }
        return jlvVar;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo3987c(String str, byte[] bArr, byte[] bArr2, jkz jkzVar, nur nurVar);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        jlv jlvVar;
        if (!"com.google.android.gms.learning.EXAMPLE_STORE_V2".equals(intent.getAction())) {
            return new jlw("Received connection with unexpected action ".concat(String.valueOf(intent.getAction())));
        }
        synchronized (this.f34276a) {
            jlvVar = this.f34277b;
            if (jlvVar == null) {
                try {
                    jlvVar = (jlv) jma.m13349a(this, "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl", jml.f34354b);
                    try {
                        jjc jjcVarM13304b = jjb.m13304b(this);
                        jnl jnlVar = this.f34278c;
                        Parcel parcelM3398a = jlvVar.m3398a();
                        cbs.m3405d(parcelM3398a, jjcVarM13304b);
                        cbs.m3405d(parcelM3398a, jnlVar);
                        jlvVar.m3400z(1, parcelM3398a);
                        this.f34277b = jlvVar;
                    } catch (RemoteException e) {
                        if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                            Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.init", e);
                        }
                        return new jlw("No IInAppExampleStoreProxy implementation found");
                    }
                } catch (jly e2) {
                    if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                        Log.w(gBCSQzBeB.wuJsOmfwmXcLA, "LoadingException during onBind", e2);
                    }
                    return new jlw("No IInAppExampleStoreProxy implementation found");
                }
            }
        }
        try {
            Parcel parcelM3398a2 = jlvVar.m3398a();
            cbs.m3404c(parcelM3398a2, intent);
            Parcel parcelM3399y = jlvVar.m3399y(3, parcelM3398a2);
            IBinder strongBinder = parcelM3399y.readStrongBinder();
            parcelM3399y.recycle();
            return strongBinder;
        } catch (RemoteException e3) {
            if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onBind", e3);
            }
            return new jlw("No IInAppExampleStoreProxy implementation found");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        jlv jlvVarM13332a = m13332a();
        if (jlvVarM13332a != null) {
            try {
                jlvVarM13332a.m3400z(2, jlvVarM13332a.m3398a());
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onCreate", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        jlv jlvVarM13332a = m13332a();
        if (jlvVarM13332a != null) {
            try {
                Parcel parcelM3398a = jlvVarM13332a.m3398a();
                cbs.m3404c(parcelM3398a, intent);
                jlvVarM13332a.m3400z(6, parcelM3398a);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", TVkaNXnfP.pklDSgvvm, e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        jlv jlvVarM13332a = m13332a();
        if (jlvVarM13332a != null) {
            try {
                Parcel parcelM3398a = jlvVarM13332a.m3398a();
                parcelM3398a.writeInt(i);
                jlvVarM13332a.m3400z(4, parcelM3398a);
            } catch (RemoteException e) {
                String str = wUzNh.zkL;
                if (Log.isLoggable(str, 5)) {
                    Log.w(str, "RemoteException in IInAppExampleStoreProxy.onTrimMemory", e);
                }
            }
        }
        super.onTrimMemory(i);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        jlv jlvVarM13332a = m13332a();
        if (jlvVarM13332a != null) {
            try {
                Parcel parcelM3398a = jlvVarM13332a.m3398a();
                cbs.m3404c(parcelM3398a, intent);
                Parcel parcelM3399y = jlvVarM13332a.m3399y(5, parcelM3398a);
                boolean zM3406e = cbs.m3406e(parcelM3399y);
                parcelM3399y.recycle();
                return zM3406e;
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
