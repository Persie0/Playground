package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class izx implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public volatile boolean f32739a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ izy f32740b;

    /* JADX INFO: renamed from: c */
    public volatile jap f32741c;

    protected izx(izy izyVar) {
        this.f32740b = izyVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        jib.m13200e("AnalyticsServiceConnection.onServiceConnected");
        synchronized (this) {
            try {
                if (iBinder == null) {
                    this.f32740b.m11933n("Service connected with null binder");
                    notifyAll();
                    return;
                }
                jap japVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                        japVar = iInterfaceQueryLocalInterface instanceof jap ? (jap) iInterfaceQueryLocalInterface : new jap(iBinder);
                        try {
                            this.f32740b.m11936q(hIAHJKEnGsNbz.OoC);
                        } catch (RemoteException e) {
                            this.f32740b.m11933n("Service connect failed to get IAnalyticsService");
                        }
                    } else {
                        this.f32740b.m11934o("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException e2) {
                }
                if (japVar == null) {
                    try {
                        jir jirVarM13228a = jir.m13228a();
                        izy izyVar = this.f32740b;
                        jirVarM13228a.m13231b(izyVar.m11924d(), izyVar.f32742a);
                    } catch (IllegalArgumentException e3) {
                    }
                } else if (this.f32739a) {
                    this.f32741c = japVar;
                } else {
                    this.f32740b.m11939t(NptsKnlVczSZ.FTvU);
                    this.f32740b.m11925e().m11917b(new ipe(this, japVar, 11));
                }
                notifyAll();
            } catch (Throwable th) {
                notifyAll();
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        jib.m13200e("AnalyticsServiceConnection.onServiceDisconnected");
        this.f32740b.m11925e().m11917b(new ipe(this, componentName, 12));
    }
}
