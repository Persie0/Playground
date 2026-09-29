package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class qx1 extends Binder implements mx3 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = mx3.f51991a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        switch (i) {
            case 2:
                parcel.readInt();
                return true;
            case 3:
                parcel.readString();
                return true;
            case 4:
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.readInt();
                parcel.readInt();
                return true;
            case 7:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeTypedObject(null, 1);
                return true;
            case 8:
                parcel.readInt();
                parcel.readInt();
                return true;
            case 9:
                return true;
            case 10:
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                return true;
            case 11:
                return true;
            case 12:
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
