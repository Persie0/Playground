package p070db;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: db.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5122b implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        Bundle bundleM7597a = null;
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
                bundleM7597a = SafeParcelReader.m7597a(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new GoogleSignInOptionsExtensionParcelable(iM7605i, iM7605i2, bundleM7597a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptionsExtensionParcelable[] newArray(int i10) {
        return new GoogleSignInOptionsExtensionParcelable[i10];
    }
}
