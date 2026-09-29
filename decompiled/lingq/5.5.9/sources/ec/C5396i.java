package ec;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: renamed from: ec.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5396i implements Parcelable.Creator<zak> {
    @Override // android.os.Parcelable.Creator
    public final zak createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        ConnectionResult connectionResult = null;
        zav zavVar = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m7598b(parcel, i10, ConnectionResult.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                zavVar = (zav) SafeParcelReader.m7598b(parcel, i10, zav.CREATOR);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zak(iM7605i, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i10) {
        return new zak[i10];
    }
}
