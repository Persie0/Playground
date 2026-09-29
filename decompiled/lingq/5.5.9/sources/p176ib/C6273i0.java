package p176ib;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: renamed from: ib.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6273i0 implements InterfaceC6266f {

    /* JADX INFO: renamed from: a */
    public final IBinder f36467a;

    public C6273i0(IBinder iBinder) {
        this.f36467a = iBinder;
    }

    @Override // p176ib.InterfaceC6266f
    /* JADX INFO: renamed from: V0 */
    public final void mo12900V0(BinderC6289q0 binderC6289q0, GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(binderC6289q0);
            parcelObtain.writeInt(1);
            C6301w0.m12931a(getServiceRequest, parcelObtain, 0);
            this.f36467a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f36467a;
    }
}
