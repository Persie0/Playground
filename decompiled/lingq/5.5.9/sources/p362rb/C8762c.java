package p362rb;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: rb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8762c extends C8760a implements InterfaceC8764e {
    public C8762c(IBinder iBinder) {
        super(iBinder);
    }

    @Override // p362rb.InterfaceC8764e
    /* JADX INFO: renamed from: a */
    public final boolean mo17012a() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelM17011h = m17011h(parcelObtain, 6);
        int i10 = C8761b.f46478a;
        boolean z10 = parcelM17011h.readInt() != 0;
        parcelM17011h.recycle();
        return z10;
    }

    @Override // p362rb.InterfaceC8764e
    /* JADX INFO: renamed from: b */
    public final boolean mo17013b() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i10 = C8761b.f46478a;
        boolean z10 = true;
        parcelObtain.writeInt(1);
        Parcel parcelM17011h = m17011h(parcelObtain, 2);
        if (parcelM17011h.readInt() == 0) {
            z10 = false;
        }
        parcelM17011h.recycle();
        return z10;
    }

    @Override // p362rb.InterfaceC8764e
    /* JADX INFO: renamed from: d */
    public final String mo17014d() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelM17011h = m17011h(parcelObtain, 1);
        String string = parcelM17011h.readString();
        parcelM17011h.recycle();
        return string;
    }
}
