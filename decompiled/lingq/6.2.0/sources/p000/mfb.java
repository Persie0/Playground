package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class mfb implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f51258f;

    public mfb(IBinder iBinder) {
        this.f51258f = iBinder;
    }

    /* JADX INFO: renamed from: F */
    public final void m16805F(ewb ewbVar, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(ewbVar);
            parcelObtain.writeInt(1);
            qmb.m20035a(getServiceRequest, parcelObtain, 0);
            this.f51258f.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f51258f;
    }
}
