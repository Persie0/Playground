package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class gwb implements f4c, IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f41438f;

    public gwb(IBinder iBinder) {
        this.f41438f = iBinder;
    }

    /* JADX INFO: renamed from: F */
    public final Parcel m12946F(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f41438f.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: G */
    public final String m12947G() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelM12946F = m12946F(parcelObtain, 1);
        String string = parcelM12946F.readString();
        parcelM12946F.recycle();
        return string;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m12948H() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i = xrb.f68590a;
        parcelObtain.writeInt(1);
        Parcel parcelM12946F = m12946F(parcelObtain, 2);
        boolean z = parcelM12946F.readInt() != 0;
        parcelM12946F.recycle();
        return z;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f41438f;
    }
}
