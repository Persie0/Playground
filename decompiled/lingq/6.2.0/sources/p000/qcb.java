package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class qcb extends Binder implements IInterface {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f57596f;

    public qcb(String str, int i) {
        this.f57596f = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    /* JADX INFO: renamed from: F */
    public abstract boolean mo11078F(int i, Parcel parcel, Parcel parcel2);

    /* JADX INFO: renamed from: G */
    public boolean mo11371G(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f57596f;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.f57596f) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo11078F(i, parcel, parcel2);
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo11371G(i, parcel, parcel2);
        }
    }
}
