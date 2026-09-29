package td;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import p338qd.BinderC8551k;
import p338qd.BinderC8554l;
import p338qd.BinderC8557m;
import p338qd.BinderC8560n;
import p338qd.BinderC8563o;
import p338qd.BinderC8566p;

/* JADX INFO: renamed from: td.w */
/* JADX INFO: loaded from: classes.dex */
public final class C9275w extends C9272t implements InterfaceC9277y {
    public C9275w(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // td.InterfaceC9277y
    /* JADX INFO: renamed from: J */
    public final void mo17635J(String str, Bundle bundle, BinderC8557m binderC8557m) throws RemoteException {
        Parcel parcelM17632h = m17632h();
        parcelM17632h.writeString(str);
        int i10 = C9274v.f47976a;
        parcelM17632h.writeInt(1);
        bundle.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeStrongBinder(binderC8557m);
        m17633j(parcelM17632h, 5);
    }

    @Override // td.InterfaceC9277y
    /* JADX INFO: renamed from: O0 */
    public final void mo17636O0(String str, Bundle bundle, Bundle bundle2, BinderC8551k binderC8551k) throws RemoteException {
        Parcel parcelM17632h = m17632h();
        parcelM17632h.writeString(str);
        int i10 = C9274v.f47976a;
        parcelM17632h.writeInt(1);
        bundle.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeInt(1);
        bundle2.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeStrongBinder(binderC8551k);
        m17633j(parcelM17632h, 6);
    }

    @Override // td.InterfaceC9277y
    /* JADX INFO: renamed from: V */
    public final void mo17637V(String str, ArrayList arrayList, Bundle bundle, BinderC8551k binderC8551k) throws RemoteException {
        Parcel parcelM17632h = m17632h();
        parcelM17632h.writeString(str);
        parcelM17632h.writeTypedList(arrayList);
        int i10 = C9274v.f47976a;
        parcelM17632h.writeInt(1);
        bundle.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeStrongBinder(binderC8551k);
        m17633j(parcelM17632h, 14);
    }

    @Override // td.InterfaceC9277y
    /* JADX INFO: renamed from: W0 */
    public final void mo17638W0(String str, Bundle bundle, Bundle bundle2, BinderC8566p binderC8566p) throws RemoteException {
        Parcel parcelM17632h = m17632h();
        parcelM17632h.writeString(str);
        int i10 = C9274v.f47976a;
        parcelM17632h.writeInt(1);
        bundle.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeInt(1);
        bundle2.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeStrongBinder(binderC8566p);
        m17633j(parcelM17632h, 9);
    }

    @Override // td.InterfaceC9277y
    /* JADX INFO: renamed from: g0 */
    public final void mo17639g0(String str, Bundle bundle, BinderC8560n binderC8560n) throws RemoteException {
        Parcel parcelM17632h = m17632h();
        parcelM17632h.writeString(str);
        int i10 = C9274v.f47976a;
        parcelM17632h.writeInt(1);
        bundle.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeStrongBinder(binderC8560n);
        m17633j(parcelM17632h, 10);
    }

    @Override // td.InterfaceC9277y
    /* JADX INFO: renamed from: k */
    public final void mo17640k(String str, Bundle bundle, Bundle bundle2, BinderC8554l binderC8554l) throws RemoteException {
        Parcel parcelM17632h = m17632h();
        parcelM17632h.writeString(str);
        int i10 = C9274v.f47976a;
        parcelM17632h.writeInt(1);
        bundle.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeInt(1);
        bundle2.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeStrongBinder(binderC8554l);
        m17633j(parcelM17632h, 11);
    }

    @Override // td.InterfaceC9277y
    /* JADX INFO: renamed from: u */
    public final void mo17641u(String str, Bundle bundle, Bundle bundle2, BinderC8563o binderC8563o) throws RemoteException {
        Parcel parcelM17632h = m17632h();
        parcelM17632h.writeString(str);
        int i10 = C9274v.f47976a;
        parcelM17632h.writeInt(1);
        bundle.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeInt(1);
        bundle2.writeToParcel(parcelM17632h, 0);
        parcelM17632h.writeStrongBinder(binderC8563o);
        m17633j(parcelM17632h, 7);
    }
}
