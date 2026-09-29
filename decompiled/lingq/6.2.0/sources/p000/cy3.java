package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class cy3 implements ey3 {

    /* JADX INFO: renamed from: f */
    public IBinder f34708f;

    /* JADX INFO: renamed from: F */
    public final int m9934F(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.f34708f.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34708f;
    }
}
