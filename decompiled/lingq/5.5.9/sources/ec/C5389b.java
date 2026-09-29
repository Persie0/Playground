package ec;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.signin.internal.zaa;

/* JADX INFO: renamed from: ec.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5389b implements Parcelable.Creator<zaa> {
    @Override // android.os.Parcelable.Creator
    public final zaa createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        Intent intent = null;
        int iM7605i2 = 0;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 == 2) {
                iM7605i2 = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 != 3) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                intent = (Intent) SafeParcelReader.m7598b(parcel, i10, Intent.CREATOR);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zaa(iM7605i, iM7605i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zaa[] newArray(int i10) {
        return new zaa[i10];
    }
}
