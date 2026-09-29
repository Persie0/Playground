package p176ib;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zax;

/* JADX INFO: renamed from: ib.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6261d0 implements Parcelable.Creator<zax> {
    @Override // android.os.Parcelable.Creator
    public final zax createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        int iM7605i2 = 0;
        Scope[] scopeArr = null;
        int iM7605i3 = 0;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 == 2) {
                iM7605i3 = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 == 3) {
                iM7605i2 = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.m7600d(parcel, i10, Scope.CREATOR);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zax(iM7605i, iM7605i3, iM7605i2, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zax[] newArray(int i10) {
        return new zax[i10];
    }
}
