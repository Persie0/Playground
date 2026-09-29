package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.android.gms.common.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2569u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        boolean zM7603g = false;
        boolean zM7603g2 = false;
        boolean zM7603g3 = false;
        boolean zM7603g4 = false;
        String strM7599c = null;
        IBinder iBinderM7604h = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strM7599c = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 2:
                    zM7603g = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 3:
                    zM7603g2 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 4:
                    iBinderM7604h = SafeParcelReader.m7604h(parcel, i10);
                    break;
                case 5:
                    zM7603g3 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    zM7603g4 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                default:
                    SafeParcelReader.m7608l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zzo(strM7599c, zM7603g, zM7603g2, iBinderM7604h, zM7603g3, zM7603g4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
