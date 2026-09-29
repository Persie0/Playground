package gb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: gb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5743g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        String strM7599c = null;
        int iM7605i = 0;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 != 2) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                strM7599c = SafeParcelReader.m7599c(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new Scope(strM7599c, iM7605i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
