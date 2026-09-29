package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: lx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3314lx implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f50234f;

    public C3314lx(IBinder iBinder) {
        this.f50234f = iBinder;
    }

    /* JADX INFO: renamed from: F */
    public final String m16560F() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        Parcel parcelObtain2 = Parcel.obtain();
        parcelObtain2.getClass();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f50234f.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m16561G() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        Parcel parcelObtain2 = Parcel.obtain();
        parcelObtain2.getClass();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcelObtain.writeInt(1);
            this.f50234f.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f50234f;
    }
}
