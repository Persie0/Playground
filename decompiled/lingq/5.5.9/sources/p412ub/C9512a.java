package p412ub;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: ub.a */
/* JADX INFO: loaded from: classes.dex */
public class C9512a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f49016a;

    /* JADX INFO: renamed from: b */
    public final String f49017b;

    public C9512a(IBinder iBinder, String str) {
        this.f49016a = iBinder;
        this.f49017b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f49016a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final void m17978h(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f49016a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
            parcel.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcel.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }
}
