package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2921z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        String strM7599c = null;
        String strM7599c2 = null;
        String strM7599c3 = null;
        Bundle bundleM7597a = null;
        String strM7599c4 = null;
        boolean zM7603g = false;
        long jM7606j = 0;
        long jM7606j2 = 0;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    jM7606j = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case 2:
                    jM7606j2 = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case 3:
                    zM7603g = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 4:
                    strM7599c = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 5:
                    strM7599c2 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strM7599c3 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    bundleM7597a = SafeParcelReader.m7597a(parcel, i10);
                    break;
                case '\b':
                    strM7599c4 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                default:
                    SafeParcelReader.m7608l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zzcl(jM7606j, jM7606j2, zM7603g, strM7599c, strM7599c2, strM7599c3, bundleM7597a, strM7599c4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzcl[i10];
    }
}
