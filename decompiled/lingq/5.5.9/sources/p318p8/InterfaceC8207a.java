package p318p8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: p8.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8207a extends IInterface {

    /* JADX INFO: renamed from: p8.a$a */
    public static abstract class a extends Binder implements InterfaceC8207a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f44414a = 0;

        /* JADX INFO: renamed from: p8.a$a$a, reason: collision with other inner class name */
        public static class C10667a implements InterfaceC8207a {

            /* JADX INFO: renamed from: a */
            public final IBinder f44415a;

            public C10667a(IBinder iBinder) {
                this.f44415a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f44415a;
            }

            @Override // p318p8.InterfaceC8207a
            /* JADX INFO: renamed from: z */
            public final int mo16350z(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.f44415a.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i10 = a.f44414a;
                    }
                    parcelObtain2.readException();
                    int i11 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    return i11;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public static InterfaceC8207a m16351h(IBinder iBinder) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8207a)) ? new C10667a(iBinder) : (InterfaceC8207a) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: z */
    int mo16350z(Bundle bundle) throws RemoteException;
}
