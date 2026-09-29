package ec;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;

/* JADX INFO: renamed from: ec.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5395h implements Parcelable.Creator<zai> {
    @Override // android.os.Parcelable.Creator
    public final zai createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        zat zatVar = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 != 2) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                zatVar = (zat) SafeParcelReader.m7598b(parcel, i10, zat.CREATOR);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zai(iM7605i, zatVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai[] newArray(int i10) {
        return new zai[i10];
    }
}
