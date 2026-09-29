package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class nx3 implements px3 {

    /* JADX INFO: renamed from: f */
    public IBinder f53358f;

    /* JADX INFO: renamed from: F */
    public final boolean m17665F(qx1 qx1Var, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(px3.f56943b);
            parcelObtain.writeStrongInterface(qx1Var);
            parcelObtain.writeTypedObject(uri, 0);
            parcelObtain.writeTypedObject(bundle, 0);
            parcelObtain.writeInt(-1);
            if (!this.f53358f.transact(4, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method mayLaunchUrl is unimplemented.");
            }
            parcelObtain2.readException();
            boolean z = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m17666G(qx1 qx1Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(px3.f56943b);
            parcelObtain.writeStrongInterface(qx1Var);
            if (!this.f53358f.transact(3, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method newSession is unimplemented.");
            }
            parcelObtain2.readException();
            boolean z = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m17667H() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(px3.f56943b);
            parcelObtain.writeLong(0L);
            if (!this.f53358f.transact(2, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method warmup is unimplemented.");
            }
            parcelObtain2.readException();
            boolean z = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f53358f;
    }
}
