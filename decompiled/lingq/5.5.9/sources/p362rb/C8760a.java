package p362rb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: rb.a */
/* JADX INFO: loaded from: classes.dex */
public class C8760a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f46477a;

    public C8760a(IBinder iBinder) {
        this.f46477a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46477a;
    }

    /* JADX INFO: renamed from: h */
    public final Parcel m17011h(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f46477a.transact(i10, parcel, parcelObtain, 0);
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
