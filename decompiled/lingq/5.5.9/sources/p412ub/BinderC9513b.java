package p412ub;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.signin.internal.zak;
import ec.AbstractBinderC5391d;

/* JADX INFO: renamed from: ub.b */
/* JADX INFO: loaded from: classes.dex */
public class BinderC9513b extends Binder implements IInterface {
    public BinderC9513b() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        AbstractBinderC5391d abstractBinderC5391d = (AbstractBinderC5391d) this;
        switch (i10) {
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel2.writeNoException();
                return true;
            case 5:
                return false;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel2.writeNoException();
                return true;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                parcel2.writeNoException();
                return true;
            case 8:
                abstractBinderC5391d.mo11558M((zak) C9514c.m17979a(parcel, zak.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
