package p176ib;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import p320pb.BinderC8215b;
import p455wb.C9895a;
import p455wb.C9897c;

/* JADX INFO: renamed from: ib.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6275j0 extends C9895a implements InterfaceC6279l0 {
    public C6275j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // p176ib.InterfaceC6279l0
    /* JADX INFO: renamed from: c0 */
    public final zzq mo12919c0(zzo zzoVar) throws RemoteException {
        Parcel parcelM18401j = m18401j();
        int i10 = C9897c.f50531a;
        parcelM18401j.writeInt(1);
        zzoVar.writeToParcel(parcelM18401j, 0);
        Parcel parcelM18400h = m18400h(parcelM18401j, 6);
        zzq zzqVar = (zzq) C9897c.m18402a(parcelM18400h, zzq.CREATOR);
        parcelM18400h.recycle();
        return zzqVar;
    }

    @Override // p176ib.InterfaceC6279l0
    /* JADX INFO: renamed from: e0 */
    public final boolean mo12920e0(zzs zzsVar, BinderC8215b binderC8215b) throws RemoteException {
        Parcel parcelM18401j = m18401j();
        int i10 = C9897c.f50531a;
        boolean z10 = true;
        parcelM18401j.writeInt(1);
        zzsVar.writeToParcel(parcelM18401j, 0);
        C9897c.m18404c(parcelM18401j, binderC8215b);
        Parcel parcelM18400h = m18400h(parcelM18401j, 5);
        if (parcelM18400h.readInt() == 0) {
            z10 = false;
        }
        parcelM18400h.recycle();
        return z10;
    }

    @Override // p176ib.InterfaceC6279l0
    /* JADX INFO: renamed from: f */
    public final boolean mo12921f() throws RemoteException {
        Parcel parcelM18400h = m18400h(m18401j(), 7);
        int i10 = C9897c.f50531a;
        boolean z10 = parcelM18400h.readInt() != 0;
        parcelM18400h.recycle();
        return z10;
    }
}
