package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhq extends cbq implements jhs {
    public jhq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // p000.jhs
    /* JADX INFO: renamed from: e */
    public final int mo13187e() {
        Parcel parcelM3399y = m3399y(2, m3398a());
        int i = parcelM3399y.readInt();
        parcelM3399y.recycle();
        return i;
    }

    @Override // p000.jhs
    /* JADX INFO: renamed from: f */
    public final jjc mo13188f() {
        jjc jjaVar;
        Parcel parcelM3399y = m3399y(1, m3398a());
        IBinder strongBinder = parcelM3399y.readStrongBinder();
        if (strongBinder == null) {
            jjaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            jjaVar = iInterfaceQueryLocalInterface instanceof jjc ? (jjc) iInterfaceQueryLocalInterface : new jja(strongBinder);
        }
        parcelM3399y.recycle();
        return jjaVar;
    }
}
