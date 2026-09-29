package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dy3 extends Binder implements ey3 {
    /* JADX INFO: renamed from: F */
    public static ey3 m10745F(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ey3)) {
            return (ey3) iInterfaceQueryLocalInterface;
        }
        cy3 cy3Var = new cy3();
        cy3Var.f34708f = iBinder;
        return cy3Var;
    }
}
