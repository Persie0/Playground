package p213k4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: k4.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6584d extends IInterface {

    /* JADX INFO: renamed from: k4.d$a */
    public static abstract class a extends Binder implements InterfaceC6584d {

        /* JADX INFO: renamed from: k4.d$a$a, reason: collision with other inner class name */
        public static class C10645a implements InterfaceC6584d {

            /* JADX INFO: renamed from: a */
            public final IBinder f37423a;

            public C10645a(IBinder iBinder) {
                this.f37423a = iBinder;
            }

            @Override // p213k4.InterfaceC6584d
            /* JADX INFO: renamed from: I */
            public final void mo13173I(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    this.f37423a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f37423a;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            ((C6588h.b) this).mo13173I(parcel.createStringArray());
            return true;
        }
    }

    /* JADX INFO: renamed from: I */
    void mo13173I(String[] strArr) throws RemoteException;
}
