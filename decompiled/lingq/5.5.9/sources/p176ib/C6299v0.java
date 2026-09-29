package p176ib;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: ib.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6299v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        boolean zM7603g = false;
        boolean zM7603g2 = false;
        int iM7605i = 0;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.m7598b(parcel, i10, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zM7603g = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 3:
                    zM7603g2 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 4:
                    int iM7607k = SafeParcelReader.m7607k(parcel, i10);
                    int iDataPosition = parcel.dataPosition();
                    if (iM7607k != 0) {
                        iArrCreateIntArray = parcel.createIntArray();
                        parcel.setDataPosition(iDataPosition + iM7607k);
                    } else {
                        iArrCreateIntArray = null;
                    }
                    break;
                case 5:
                    iM7605i = SafeParcelReader.m7605i(parcel, i10);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    int iM7607k2 = SafeParcelReader.m7607k(parcel, i10);
                    int iDataPosition2 = parcel.dataPosition();
                    if (iM7607k2 != 0) {
                        iArrCreateIntArray2 = parcel.createIntArray();
                        parcel.setDataPosition(iDataPosition2 + iM7607k2);
                    } else {
                        iArrCreateIntArray2 = null;
                    }
                    break;
                default:
                    SafeParcelReader.m7608l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zM7603g, zM7603g2, iArrCreateIntArray, iM7605i, iArrCreateIntArray2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
