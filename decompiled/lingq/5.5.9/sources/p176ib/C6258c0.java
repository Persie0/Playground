package p176ib;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: renamed from: ib.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6258c0 implements Parcelable.Creator<zav> {
    @Override // android.os.Parcelable.Creator
    public final zav createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        boolean zM7603g = false;
        boolean zM7603g2 = false;
        IBinder iBinderM7604h = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 == 2) {
                iBinderM7604h = SafeParcelReader.m7604h(parcel, i10);
            } else if (c10 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m7598b(parcel, i10, ConnectionResult.CREATOR);
            } else if (c10 == 4) {
                zM7603g = SafeParcelReader.m7603g(parcel, i10);
            } else if (c10 != 5) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                zM7603g2 = SafeParcelReader.m7603g(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zav(iM7605i, iBinderM7604h, connectionResult, zM7603g, zM7603g2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zav[] newArray(int i10) {
        return new zav[i10];
    }
}
