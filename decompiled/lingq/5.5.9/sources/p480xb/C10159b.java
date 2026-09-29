package p480xb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: xb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10159b extends C10162e implements InterfaceC10161d {
    public C10159b(IBinder iBinder) {
        super(iBinder);
    }

    @Override // p480xb.InterfaceC10161d
    /* JADX INFO: renamed from: K0 */
    public final int mo19171K0(String str, int i10, String str2) throws RemoteException {
        Parcel parcelM19179h = C10162e.m19179h();
        parcelM19179h.writeInt(i10);
        parcelM19179h.writeString(str);
        parcelM19179h.writeString(str2);
        Parcel parcelM19180j = m19180j(parcelM19179h, 1);
        int i11 = parcelM19180j.readInt();
        parcelM19180j.recycle();
        return i11;
    }

    @Override // p480xb.InterfaceC10161d
    /* JADX INFO: renamed from: M0 */
    public final int mo19172M0(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM19179h = C10162e.m19179h();
        parcelM19179h.writeInt(i10);
        parcelM19179h.writeString(str);
        parcelM19179h.writeString(str2);
        int i11 = C10163f.f51462a;
        parcelM19179h.writeInt(1);
        bundle.writeToParcel(parcelM19179h, 0);
        Parcel parcelM19180j = m19180j(parcelM19179h, 10);
        int i12 = parcelM19180j.readInt();
        parcelM19180j.recycle();
        return i12;
    }

    @Override // p480xb.InterfaceC10161d
    /* JADX INFO: renamed from: R0 */
    public final Bundle mo19173R0(String str, String str2, String str3) throws RemoteException {
        Parcel parcelM19179h = C10162e.m19179h();
        parcelM19179h.writeInt(3);
        parcelM19179h.writeString(str);
        parcelM19179h.writeString(str2);
        parcelM19179h.writeString(str3);
        parcelM19179h.writeString(null);
        Parcel parcelM19180j = m19180j(parcelM19179h, 3);
        Bundle bundle = (Bundle) C10163f.m19181a(parcelM19180j, Bundle.CREATOR);
        parcelM19180j.recycle();
        return bundle;
    }

    @Override // p480xb.InterfaceC10161d
    /* JADX INFO: renamed from: S0 */
    public final Bundle mo19174S0(String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelM19179h = C10162e.m19179h();
        parcelM19179h.writeInt(9);
        parcelM19179h.writeString(str);
        parcelM19179h.writeString(str2);
        parcelM19179h.writeString(str3);
        int i10 = C10163f.f51462a;
        parcelM19179h.writeInt(1);
        bundle.writeToParcel(parcelM19179h, 0);
        Parcel parcelM19180j = m19180j(parcelM19179h, 11);
        Bundle bundle2 = (Bundle) C10163f.m19181a(parcelM19180j, Bundle.CREATOR);
        parcelM19180j.recycle();
        return bundle2;
    }

    @Override // p480xb.InterfaceC10161d
    /* JADX INFO: renamed from: j0 */
    public final Bundle mo19175j0(String str, String str2, String str3) throws RemoteException {
        Parcel parcelM19179h = C10162e.m19179h();
        parcelM19179h.writeInt(3);
        parcelM19179h.writeString(str);
        parcelM19179h.writeString(str2);
        parcelM19179h.writeString(str3);
        Parcel parcelM19180j = m19180j(parcelM19179h, 4);
        Bundle bundle = (Bundle) C10163f.m19181a(parcelM19180j, Bundle.CREATOR);
        parcelM19180j.recycle();
        return bundle;
    }

    @Override // p480xb.InterfaceC10161d
    /* JADX INFO: renamed from: m */
    public final Bundle mo19176m(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelM19179h = C10162e.m19179h();
        parcelM19179h.writeInt(i10);
        parcelM19179h.writeString(str);
        parcelM19179h.writeString(str2);
        parcelM19179h.writeString(str3);
        parcelM19179h.writeString(null);
        int i11 = C10163f.f51462a;
        parcelM19179h.writeInt(1);
        bundle.writeToParcel(parcelM19179h, 0);
        Parcel parcelM19180j = m19180j(parcelM19179h, 8);
        Bundle bundle2 = (Bundle) C10163f.m19181a(parcelM19180j, Bundle.CREATOR);
        parcelM19180j.recycle();
        return bundle2;
    }

    @Override // p480xb.InterfaceC10161d
    /* JADX INFO: renamed from: t0 */
    public final Bundle mo19177t0(String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelM19179h = C10162e.m19179h();
        parcelM19179h.writeInt(17);
        parcelM19179h.writeString(str);
        parcelM19179h.writeString(str2);
        int i10 = C10163f.f51462a;
        parcelM19179h.writeInt(1);
        bundle.writeToParcel(parcelM19179h, 0);
        parcelM19179h.writeInt(1);
        bundle2.writeToParcel(parcelM19179h, 0);
        Parcel parcelM19180j = m19180j(parcelM19179h, 901);
        Bundle bundle3 = (Bundle) C10163f.m19181a(parcelM19180j, Bundle.CREATOR);
        parcelM19180j.recycle();
        return bundle3;
    }

    @Override // p480xb.InterfaceC10161d
    /* JADX INFO: renamed from: x */
    public final Bundle mo19178x(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM19179h = C10162e.m19179h();
        parcelM19179h.writeInt(9);
        parcelM19179h.writeString(str);
        parcelM19179h.writeString(str2);
        int i10 = C10163f.f51462a;
        parcelM19179h.writeInt(1);
        bundle.writeToParcel(parcelM19179h, 0);
        Parcel parcelM19180j = m19180j(parcelM19179h, 902);
        Bundle bundle2 = (Bundle) C10163f.m19181a(parcelM19180j, Bundle.CREATOR);
        parcelM19180j.recycle();
        return bundle2;
    }
}
