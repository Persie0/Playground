package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.android.gms.common.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2570v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        boolean zM7603g = false;
        int iM7605i = 0;
        String strM7599c = null;
        int iM7605i2 = 0;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                zM7603g = SafeParcelReader.m7603g(parcel, i10);
            } else if (c10 == 2) {
                strM7599c = SafeParcelReader.m7599c(parcel, i10);
            } else if (c10 == 3) {
                iM7605i2 = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zzq(iM7605i2, iM7605i, strM7599c, zM7603g);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
