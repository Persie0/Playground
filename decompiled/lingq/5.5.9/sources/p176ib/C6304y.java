package p176ib;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zax;
import p320pb.BinderC8215b;
import p320pb.InterfaceC8214a;
import p412ub.C9512a;
import p412ub.C9514c;

/* JADX INFO: renamed from: ib.y */
/* JADX INFO: loaded from: classes.dex */
public final class C6304y extends C9512a {
    public C6304y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC8214a m12934j(BinderC8215b binderC8215b, zax zaxVar) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f49017b);
        int i10 = C9514c.f49018a;
        parcelObtain.writeStrongBinder(binderC8215b);
        parcelObtain.writeInt(1);
        zaxVar.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.f49016a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                InterfaceC8214a interfaceC8214aM16361j = InterfaceC8214a.a.m16361j(parcelObtain2.readStrongBinder());
                parcelObtain2.recycle();
                return interfaceC8214aM16361j;
            } catch (RuntimeException e10) {
                parcelObtain2.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }
}
