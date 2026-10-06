package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jgs implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jgw f33978a;

    /* JADX INFO: renamed from: b */
    private final int f33979b;

    public jgs(jgw jgwVar, int i) {
        this.f33978a = jgwVar;
        this.f33979b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder != null) {
            synchronized (this.f33978a.f33989f) {
                jgw jgwVar = this.f33978a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                jgwVar.f33999p = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jhu)) ? new jhu(iBinder) : (jhu) iInterfaceQueryLocalInterface;
            }
            this.f33978a.m13158H(0, this.f33979b);
            return;
        }
        jgw jgwVar2 = this.f33978a;
        synchronized (jgwVar2.f33988e) {
            i = jgwVar2.f33992i;
        }
        if (i == 3) {
            jgwVar2.f33996m = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = jgwVar2.f33987d;
        handler.sendMessage(handler.obtainMessage(i2, jgwVar2.f33998o.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f33978a.f33989f) {
            this.f33978a.f33999p = null;
        }
        Handler handler = this.f33978a.f33987d;
        handler.sendMessage(handler.obtainMessage(6, this.f33979b, 1));
    }
}
