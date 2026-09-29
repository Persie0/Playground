package gb;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: gb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5744h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        String strM7599c = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int iM7605i = 0;
        int iM7605i2 = 0;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM7605i2 = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 == 2) {
                strM7599c = SafeParcelReader.m7599c(parcel, i10);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m7598b(parcel, i10, PendingIntent.CREATOR);
            } else if (c10 == 4) {
                connectionResult = (ConnectionResult) SafeParcelReader.m7598b(parcel, i10, ConnectionResult.CREATOR);
            } else if (c10 != 1000) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new Status(iM7605i, iM7605i2, strM7599c, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
