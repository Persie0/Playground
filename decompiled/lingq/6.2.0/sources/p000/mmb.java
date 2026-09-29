package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mmb extends keb implements pmb {
    /* JADX INFO: renamed from: G */
    public static pmb m16924G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterfaceQueryLocalInterface instanceof pmb ? (pmb) iInterfaceQueryLocalInterface : new imb(iBinder, "com.android.vending.billing.IInAppBillingService", 4);
    }
}
