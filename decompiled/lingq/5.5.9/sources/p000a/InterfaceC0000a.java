package p000a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: renamed from: a.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0000a extends IInterface {

    /* JADX INFO: renamed from: a.a$a */
    public static abstract class a extends Binder implements InterfaceC0000a {
        public a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            switch (i10) {
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
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    parcel.readInt();
                    parcel.readInt();
                    return true;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    parcel.readString();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 8:
                    parcel.readInt();
                    parcel.readInt();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    /* JADX INFO: renamed from: a.a$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Object m0a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }
}
