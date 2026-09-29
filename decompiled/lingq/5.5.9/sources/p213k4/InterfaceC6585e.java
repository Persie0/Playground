package p213k4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: renamed from: k4.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6585e extends IInterface {

    /* JADX INFO: renamed from: k4.e$a */
    public static abstract class a extends Binder implements InterfaceC6585e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f37424a = 0;

        /* JADX INFO: renamed from: k4.e$a$a, reason: collision with other inner class name */
        public static class C10646a implements InterfaceC6585e {

            /* JADX INFO: renamed from: a */
            public final IBinder f37425a;

            public C10646a(IBinder iBinder) {
                this.f37425a = iBinder;
            }

            @Override // p213k4.InterfaceC6585e
            /* JADX INFO: renamed from: T0 */
            public final void mo4546T0(int i10, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f37425a.transact(3, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f37425a;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p213k4.InterfaceC6585e
            /* JADX INFO: renamed from: n */
            public final int mo4547n(InterfaceC6584d interfaceC6584d, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongInterface(interfaceC6584d);
                    parcelObtain.writeString(str);
                    this.f37425a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i10 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p213k4.InterfaceC6585e
            /* JADX INFO: renamed from: n0 */
            public final void mo4548n0(InterfaceC6584d interfaceC6584d, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongInterface(interfaceC6584d);
                    parcelObtain.writeInt(i10);
                    this.f37425a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            InterfaceC6584d c10645a = null;
            if (i10 == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    c10645a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6584d)) ? new InterfaceC6584d.a.C10645a(strongBinder) : (InterfaceC6584d) iInterfaceQueryLocalInterface;
                }
                int iMo4547n = ((MultiInstanceInvalidationService.BinderC1178a) this).mo4547n(c10645a, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo4547n);
            } else if (i10 == 2) {
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    c10645a = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC6584d)) ? new InterfaceC6584d.a.C10645a(strongBinder2) : (InterfaceC6584d) iInterfaceQueryLocalInterface2;
                }
                ((MultiInstanceInvalidationService.BinderC1178a) this).mo4548n0(c10645a, parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                ((MultiInstanceInvalidationService.BinderC1178a) this).mo4546T0(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: T0 */
    void mo4546T0(int i10, String[] strArr) throws RemoteException;

    /* JADX INFO: renamed from: n */
    int mo4547n(InterfaceC6584d interfaceC6584d, String str) throws RemoteException;

    /* JADX INFO: renamed from: n0 */
    void mo4548n0(InterfaceC6584d interfaceC6584d, int i10) throws RemoteException;
}
