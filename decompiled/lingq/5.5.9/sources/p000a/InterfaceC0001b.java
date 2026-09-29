package p000a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p266n.BinderC7665b;

/* JADX INFO: renamed from: a.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0001b extends IInterface {

    /* JADX INFO: renamed from: a.b$a */
    public static abstract class a extends Binder implements InterfaceC0001b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f0a = 0;

        /* JADX INFO: renamed from: a.b$a$a, reason: collision with other inner class name */
        public static class C10579a implements InterfaceC0001b {

            /* JADX INFO: renamed from: a */
            public final IBinder f1a;

            public C10579a(IBinder iBinder) {
                this.f1a = iBinder;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p000a.InterfaceC0001b
            /* JADX INFO: renamed from: X */
            public final boolean mo1X(BinderC7665b binderC7665b) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongInterface(binderC7665b);
                    boolean z10 = false;
                    this.f1a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // p000a.InterfaceC0001b
            /* JADX INFO: renamed from: Y0 */
            public final boolean mo2Y0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(0L);
                    this.f1a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1a;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // p000a.InterfaceC0001b
            /* JADX INFO: renamed from: d0 */
            public final boolean mo3d0(InterfaceC0000a interfaceC0000a, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongInterface(interfaceC0000a);
                    parcelObtain.writeInt(1);
                    uri.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeTypedList(null);
                    this.f1a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: X */
    boolean mo1X(BinderC7665b binderC7665b) throws RemoteException;

    /* JADX INFO: renamed from: Y0 */
    boolean mo2Y0() throws RemoteException;

    /* JADX INFO: renamed from: d0 */
    boolean mo3d0(InterfaceC0000a interfaceC0000a, Uri uri, Bundle bundle) throws RemoteException;
}
