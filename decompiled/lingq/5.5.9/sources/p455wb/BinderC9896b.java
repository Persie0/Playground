package p455wb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: wb.b */
/* JADX INFO: loaded from: classes.dex */
public class BinderC9896b extends Binder implements IInterface {
    public BinderC9896b(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo12899h(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return mo12899h(i10, parcel, parcel2);
    }
}
