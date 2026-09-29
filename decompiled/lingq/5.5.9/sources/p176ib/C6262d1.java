package p176ib;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p320pb.InterfaceC8214a;
import p455wb.C9895a;

/* JADX INFO: renamed from: ib.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C6262d1 extends C9895a implements InterfaceC6269g0 {
    public C6262d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // p176ib.InterfaceC6269g0
    /* JADX INFO: renamed from: a */
    public final InterfaceC8214a mo7614a() throws RemoteException {
        Parcel parcelM18400h = m18400h(m18401j(), 1);
        InterfaceC8214a interfaceC8214aM16361j = InterfaceC8214a.a.m16361j(parcelM18400h.readStrongBinder());
        parcelM18400h.recycle();
        return interfaceC8214aM16361j;
    }

    @Override // p176ib.InterfaceC6269g0
    /* JADX INFO: renamed from: d */
    public final int mo7615d() throws RemoteException {
        Parcel parcelM18400h = m18400h(m18401j(), 2);
        int i10 = parcelM18400h.readInt();
        parcelM18400h.recycle();
        return i10;
    }
}
