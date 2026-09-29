package p338qd;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;
import p290o6.C7967l0;
import td.C9255c0;
import td.C9274v;

/* JADX INFO: renamed from: qd.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC8552k0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final C7967l0 f45897a = new C7967l0("ExtractionForegroundServiceConnection");

    /* JADX INFO: renamed from: b */
    public final ArrayList f45898b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Context f45899c;

    /* JADX INFO: renamed from: d */
    public ExtractionForegroundService f45900d;

    /* JADX INFO: renamed from: e */
    public Notification f45901e;

    public ServiceConnectionC8552k0(Context context) {
        this.f45899c = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m16657a() {
        ArrayList arrayList;
        synchronized (this.f45898b) {
            try {
                arrayList = new ArrayList(this.f45898b);
                this.f45898b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9255c0 c9255c0 = (C9255c0) arrayList.get(i10);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel parcelM17632h = c9255c0.m17632h();
                int i11 = C9274v.f47976a;
                parcelM17632h.writeInt(1);
                bundle.writeToParcel(parcelM17632h, 0);
                parcelM17632h.writeInt(1);
                bundle2.writeToParcel(parcelM17632h, 0);
                c9255c0.m17633j(parcelM17632h, 2);
            } catch (RemoteException unused) {
                this.f45897a.m15812m("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f45897a.m15811l("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((BinderC8549j0) iBinder).f45888a;
        this.f45900d = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f45901e);
        m16657a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
