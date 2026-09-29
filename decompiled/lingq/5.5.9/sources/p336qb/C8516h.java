package p336qb;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p320pb.BinderC8215b;
import p320pb.InterfaceC8214a;
import p455wb.C9895a;
import p455wb.C9897c;

/* JADX INFO: renamed from: qb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8516h extends C9895a {
    public C8516h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* JADX INFO: renamed from: b1 */
    public final InterfaceC8214a m16619b1(BinderC8215b binderC8215b, String str, int i10, BinderC8215b binderC8215b2) throws RemoteException {
        Parcel parcelM18401j = m18401j();
        C9897c.m18404c(parcelM18401j, binderC8215b);
        parcelM18401j.writeString(str);
        parcelM18401j.writeInt(i10);
        C9897c.m18404c(parcelM18401j, binderC8215b2);
        Parcel parcelM18400h = m18400h(parcelM18401j, 8);
        InterfaceC8214a interfaceC8214aM16361j = InterfaceC8214a.a.m16361j(parcelM18400h.readStrongBinder());
        parcelM18400h.recycle();
        return interfaceC8214aM16361j;
    }

    /* JADX INFO: renamed from: d1 */
    public final InterfaceC8214a m16620d1(BinderC8215b binderC8215b, String str, int i10) throws RemoteException {
        Parcel parcelM18401j = m18401j();
        C9897c.m18404c(parcelM18401j, binderC8215b);
        parcelM18401j.writeString(str);
        parcelM18401j.writeInt(i10);
        Parcel parcelM18400h = m18400h(parcelM18401j, 4);
        InterfaceC8214a interfaceC8214aM16361j = InterfaceC8214a.a.m16361j(parcelM18400h.readStrongBinder());
        parcelM18400h.recycle();
        return interfaceC8214aM16361j;
    }

    /* JADX INFO: renamed from: e1 */
    public final InterfaceC8214a m16621e1(BinderC8215b binderC8215b, String str, boolean z10, long j10) throws RemoteException {
        Parcel parcelM18401j = m18401j();
        C9897c.m18404c(parcelM18401j, binderC8215b);
        parcelM18401j.writeString(str);
        parcelM18401j.writeInt(z10 ? 1 : 0);
        parcelM18401j.writeLong(j10);
        Parcel parcelM18400h = m18400h(parcelM18401j, 7);
        InterfaceC8214a interfaceC8214aM16361j = InterfaceC8214a.a.m16361j(parcelM18400h.readStrongBinder());
        parcelM18400h.recycle();
        return interfaceC8214aM16361j;
    }

    /* JADX INFO: renamed from: h0 */
    public final InterfaceC8214a m16622h0(BinderC8215b binderC8215b, String str, int i10) throws RemoteException {
        Parcel parcelM18401j = m18401j();
        C9897c.m18404c(parcelM18401j, binderC8215b);
        parcelM18401j.writeString(str);
        parcelM18401j.writeInt(i10);
        Parcel parcelM18400h = m18400h(parcelM18401j, 2);
        InterfaceC8214a interfaceC8214aM16361j = InterfaceC8214a.a.m16361j(parcelM18400h.readStrongBinder());
        parcelM18400h.recycle();
        return interfaceC8214aM16361j;
    }
}
