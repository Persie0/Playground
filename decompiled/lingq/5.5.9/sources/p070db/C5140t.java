package p070db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: db.t */
/* JADX INFO: loaded from: classes.dex */
public final class C5140t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        String strM7599c = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strM7599c = SafeParcelReader.m7599c(parcel, i10);
            } else if (c10 != 5) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                googleSignInOptions = (GoogleSignInOptions) SafeParcelReader.m7598b(parcel, i10, GoogleSignInOptions.CREATOR);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new SignInConfiguration(strM7599c, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInConfiguration[i10];
    }
}
