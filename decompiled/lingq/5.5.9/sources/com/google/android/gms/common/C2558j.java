package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.android.gms.common.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2558j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        long jM7606j = -1;
        int iM7605i = 0;
        String strM7599c = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strM7599c = SafeParcelReader.m7599c(parcel, i10);
            } else if (c10 == 2) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 != 3) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                jM7606j = SafeParcelReader.m7606j(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new Feature(strM7599c, iM7605i, jM7606j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Feature[i10];
    }
}
