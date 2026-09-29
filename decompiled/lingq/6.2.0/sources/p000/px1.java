package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class px1 extends rx1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f56940b;

    public px1(Context context) {
        this.f56940b = context;
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: a */
    public final void mo17664a(ComponentName componentName, C3156jq c3156jq) {
        try {
            ((nx3) ((px3) c3156jq.f45990a)).m17667H();
        } catch (RemoteException unused) {
        }
        this.f56940b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
