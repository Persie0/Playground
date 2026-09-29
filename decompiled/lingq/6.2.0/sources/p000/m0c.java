package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0c extends Binder implements f4c, IInterface {
    /* JADX INFO: renamed from: F */
    public static f4c m16591F(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof f4c ? (f4c) iInterfaceQueryLocalInterface : new gwb(iBinder);
    }
}
