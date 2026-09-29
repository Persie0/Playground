package p455wb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: wb.a */
/* JADX INFO: loaded from: classes.dex */
public class C9895a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f50529a;

    /* JADX INFO: renamed from: b */
    public final String f50530b;

    public C9895a(IBinder iBinder, String str) {
        this.f50529a = iBinder;
        this.f50530b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f50529a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final Parcel m18400h(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f50529a.transact(i10, parcel, parcelObtain, 0);
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

    /* JADX INFO: renamed from: j */
    public final Parcel m18401j() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f50530b);
        return parcelObtain;
    }
}
