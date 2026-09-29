package td;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: td.t */
/* JADX INFO: loaded from: classes.dex */
public class C9272t implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f47974a;

    /* JADX INFO: renamed from: b */
    public final String f47975b;

    public C9272t(IBinder iBinder, String str) {
        this.f47974a = iBinder;
        this.f47975b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f47974a;
    }

    /* JADX INFO: renamed from: h */
    public final Parcel m17632h() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f47975b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: j */
    public final void m17633j(Parcel parcel, int i10) throws RemoteException {
        try {
            this.f47974a.transact(i10, parcel, null, 1);
            parcel.recycle();
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }
}
