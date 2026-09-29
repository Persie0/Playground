package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: android.support.v4.os.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0169a extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.os.a$a */
    public static abstract class a extends Binder implements InterfaceC0169a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f430a = 0;

        /* JADX INFO: renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        public static class C10583a implements InterfaceC0169a {

            /* JADX INFO: renamed from: a */
            public final IBinder f431a;

            public C10583a(IBinder iBinder) {
                this.f431a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f431a;
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int i12 = parcel.readInt();
            Object objCreateFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
            ResultReceiver resultReceiver = ResultReceiver.this;
            resultReceiver.getClass();
            resultReceiver.mo534a(i12, (Bundle) objCreateFromParcel);
            return true;
        }
    }
}
