package p012ab;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p383s8.BinderC8977b;
import p383s8.C8976a;
import p383s8.C8978c;

/* JADX INFO: renamed from: ab.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0053a extends IInterface {

    /* JADX INFO: renamed from: ab.a$a */
    public static abstract class a extends BinderC8977b implements InterfaceC0053a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f67a = 0;

        /* JADX INFO: renamed from: ab.a$a$a, reason: collision with other inner class name */
        public static class C10580a extends C8976a implements InterfaceC0053a {
            public C10580a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // p012ab.InterfaceC0053a
            /* JADX INFO: renamed from: W */
            public final Bundle mo212W(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i10 = C8978c.f47034a;
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        this.f47033a.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcelObtain.recycle();
                        Bundle bundle2 = (Bundle) (parcelObtain2.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain2));
                        parcelObtain2.recycle();
                        return bundle2;
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
    }

    /* JADX INFO: renamed from: W */
    Bundle mo212W(Bundle bundle) throws RemoteException;
}
