package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.android.gms.common.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2571w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        boolean zM7603g = false;
        String strM7599c = null;
        IBinder iBinderM7604h = null;
        boolean zM7603g2 = false;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                strM7599c = SafeParcelReader.m7599c(parcel, i10);
            } else if (c10 == 2) {
                iBinderM7604h = SafeParcelReader.m7604h(parcel, i10);
            } else if (c10 == 3) {
                zM7603g = SafeParcelReader.m7603g(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                zM7603g2 = SafeParcelReader.m7603g(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zzs(strM7599c, iBinderM7604h, zM7603g, zM7603g2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
