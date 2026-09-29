package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class k0c implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final int f46524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f90 f46525b;

    public k0c(f90 f90Var, int i) {
        this.f46525b = f90Var;
        this.f46524a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        f90 f90Var = this.f46525b;
        if (iBinder == null) {
            synchronized (f90Var.f38646g) {
                i = f90Var.f38653n;
            }
            if (i == 3) {
                f90Var.f38661v = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            gob gobVar = f90Var.f38645f;
            gobVar.sendMessage(gobVar.obtainMessage(i2, f90Var.f38663x.get(), 16));
            return;
        }
        synchronized (f90Var.f38647h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                f90Var.f38648i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mfb)) ? new mfb(iBinder) : (mfb) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        f90 f90Var2 = this.f46525b;
        int i3 = this.f46524a;
        f90Var2.getClass();
        h9c h9cVar = new h9c(f90Var2, 0, null);
        gob gobVar2 = f90Var2.f38645f;
        gobVar2.sendMessage(gobVar2.obtainMessage(7, i3, -1, h9cVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f90 f90Var = this.f46525b;
        synchronized (f90Var.f38647h) {
            f90Var.f38648i = null;
        }
        f90 f90Var2 = this.f46525b;
        int i = this.f46524a;
        gob gobVar = f90Var2.f38645f;
        gobVar.sendMessage(gobVar.obtainMessage(6, i, 1));
    }
}
