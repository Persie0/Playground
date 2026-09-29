package p480xb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: xb.e */
/* JADX INFO: loaded from: classes.dex */
public class C10162e implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f51461a;

    public C10162e(IBinder iBinder) {
        this.f51461a = iBinder;
    }

    /* JADX INFO: renamed from: h */
    public static Parcel m19179h() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f51461a;
    }

    /* JADX INFO: renamed from: j */
    public final Parcel m19180j(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f51461a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }
}
