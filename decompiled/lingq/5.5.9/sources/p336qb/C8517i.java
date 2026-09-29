package p336qb;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p320pb.BinderC8215b;
import p320pb.InterfaceC8214a;
import p455wb.C9895a;
import p455wb.C9897c;

/* JADX INFO: renamed from: qb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8517i extends C9895a {
    public C8517i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* JADX INFO: renamed from: b1 */
    public final InterfaceC8214a m16623b1(BinderC8215b binderC8215b, String str, int i10, BinderC8215b binderC8215b2) throws RemoteException {
        Parcel parcelM18401j = m18401j();
        C9897c.m18404c(parcelM18401j, binderC8215b);
        parcelM18401j.writeString(str);
        parcelM18401j.writeInt(i10);
        C9897c.m18404c(parcelM18401j, binderC8215b2);
        Parcel parcelM18400h = m18400h(parcelM18401j, 3);
        InterfaceC8214a interfaceC8214aM16361j = InterfaceC8214a.a.m16361j(parcelM18400h.readStrongBinder());
        parcelM18400h.recycle();
        return interfaceC8214aM16361j;
    }

    /* JADX INFO: renamed from: h0 */
    public final InterfaceC8214a m16624h0(BinderC8215b binderC8215b, String str, int i10, BinderC8215b binderC8215b2) throws RemoteException {
        Parcel parcelM18401j = m18401j();
        C9897c.m18404c(parcelM18401j, binderC8215b);
        parcelM18401j.writeString(str);
        parcelM18401j.writeInt(i10);
        C9897c.m18404c(parcelM18401j, binderC8215b2);
        Parcel parcelM18400h = m18400h(parcelM18401j, 2);
        InterfaceC8214a interfaceC8214aM16361j = InterfaceC8214a.a.m16361j(parcelM18400h.readStrongBinder());
        parcelM18400h.recycle();
        return interfaceC8214aM16361j;
    }
}
