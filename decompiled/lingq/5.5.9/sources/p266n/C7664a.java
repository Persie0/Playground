package p266n;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: renamed from: n.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7664a extends AbstractServiceConnectionC7668e {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f42136b;

    public C7664a(Context context) {
        this.f42136b = context;
    }

    @Override // p266n.AbstractServiceConnectionC7668e
    /* JADX INFO: renamed from: a */
    public final void mo15262a(ComponentName componentName, AbstractServiceConnectionC7668e.a aVar) {
        try {
            aVar.f42137a.mo2Y0();
        } catch (RemoteException unused) {
        }
        this.f42136b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
