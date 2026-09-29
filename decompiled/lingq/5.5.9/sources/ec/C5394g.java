package ec;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;

/* JADX INFO: renamed from: ec.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5394g implements Parcelable.Creator<zag> {
    @Override // android.os.Parcelable.Creator
    public final zag createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        ArrayList<String> arrayList = null;
        String strM7599c = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                int iM7607k = SafeParcelReader.m7607k(parcel, i10);
                int iDataPosition = parcel.dataPosition();
                if (iM7607k == 0) {
                    arrayList = null;
                } else {
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    parcel.setDataPosition(iDataPosition + iM7607k);
                    arrayList = arrayListCreateStringArrayList;
                }
            } else if (c10 != 2) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                strM7599c = SafeParcelReader.m7599c(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zag(arrayList, strM7599c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zag[] newArray(int i10) {
        return new zag[i10];
    }
}
